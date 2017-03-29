# Les types de données #

Le langage **LOOC** étant un langage à typage fort, il est donc nécessaire de définir
de façon clair les caractéristiques de chacun des types de données primitifs
ainsi que de la structuration en mémoire des types de données complexes que sont
les classes.

## Les types primitifs ##

Les types de données *primitifs*, sont ceux définient nativement par le langage
de programmation **LOOC**. Les types de données *primitifs* de ce langage sont
au nombre de deux:
 - les entiers `int`
 - et les chaînes de caractères `string`

| Types de données | Taille en mémoire | Caractéristiques |
| --- | --- | --- |
| `int` | 2 octets | Les nombre entiers sont signés |
| `string` | 1 octets par caractères et un octet nul | Les chaînes de caractères sont délimitées par un octet nul |

**N.B.** : Les caractéristiques des types de données *primitifs* qui ont été
introduites ci-dessus ne sont pas le fruit d'un choix purement arbitraires mais
bien une conséquences des limitations imposées par la plateforme dont ce compilateur
est la cible.

## Les classes ##

Les classes, ou plutôt les instances d'une classes sont représentées en mémoire
par leurs attributs stockés de façon contigus. Cependant chaque instance de classe
stocke en **entête**, un pointeur vers le [descripteur de classe](#les-descripteurs-de-classe)
correspondant à son type dynamique.

**Exemple dans le cas général** :

Soient les classes `FooBase` et `Foo` définies ci-dessous:

```
class FooBase = (
    // Attributs de FooBase...
    var a: int;
    var b: string;

    // Méthodes de FooBase...
)

class Foo inherits FooBase = (
    // Attributs de Foo...

    // Méthodes de Foo...
)
```

On aura alors la réprésentation mémoire d'une instance de la classe `Foo`:

```
var bar: FooBase;
bar := new Foo;
```

| Attributs | Type | Déplacement | Valeur |
| --- | --- | --- | --- |
| DynType | Pointeur | 0 octets | `@Descriptor(Foo)` |
| a | `int` | 2 octets | Inconnu |
| b | `string` | 4 octets | Inconnu |

**N.B.** : Il n'y a pas nécessité de gérer manuellement l'espacement entre les
attirbuts d'une classe. En effet, la phase de traduction du langage d'assemblage
vers le langage machine aligne automatiquement les adresses des blocs de mémoires
alloués sur 16 bits. Cela induit néanmoins une fragmentation interne d'un octet,
lorsque l'on alloue un nombre impair d'octets.

### Les descripteurs de classe ###

Les descripteurs de classe sont des structures de données représentative d'une
classe. Il n'en existe donc qu'un seul par classe déclarée dans le programme.

Cette structure de données contient l'ensemble des adresses des méthodes de la
classe, précédés par un pointeur vers la classe parente. Dans le cas où la
classe considéré n'hérite d'aucune classe, le pointeur vers la classe parente
prend pour valeur `0xFFFF`.

**Exemple** :

Soient les classes `FooBase` et `Foo` définies ci-dessous:

```
class FooBase = (
    method init() {

    }

    method init2() {

    }
)

class Foo inherits FooBase = (
    method init2() {

    }

    method init3() {

    }
)
```

On aura le descripteur de classe suivant pour la classe `FooBase`:

| Attributs | Type | Déplacement | Valeur |
| --- | --- | --- | --- |
| ParentClassDescriptor | Pointeur | 0 octets | `0xFFFF` |
| init | Pointeur | 2 octets | `@Method(FooBase, init)` |
| init2 | Pointeur | 4 octets | `@Method(FooBase, init2)` |

On aura de même le descripteur de classe suivant pour la classe `Foo`:

| Attributs | Type | Déplacement | Valeur |
| --- | --- | --- | --- |
| ParentClassDescriptor | Pointeur | 0 octets | `@Descriptor(FooBase)` |
| init2 | Pointeur | 2 octets | `@Method(Foo, init2)` |
| init3 | Pointeur | 2 octets | `@Method(Foo, init3)` |

**N.B.** : On peut constater dans l'exemple ci-dessus la présence d'une méthode
dans la classe `FooBase` redéfinie dans la class `Foo`. L'algorithme permettant
l'appel de la méthode appropriée au contexte sera détaillé plus tard dans la
spécification.

### Héritage ###

Comme nous avons pu le voir plus haut, le concept d'héritage d'une classe est
géré en mémoire, tant au niveau de la représentation en mémoire de leurs instances
que de la représentation de leurs descripteurs.

Les attributs d'une sous-classe sont stockés à la suite de ceux de la classe mère.

**Exemple** : Soient les deux classes `FooBase` et `Foo` définies si dessous.

```
class FooBase = (
    var a: int;
    var b: int;
)

class Foo inherits FooBase = (
    var c: int;
    var d: int;
)
```

On aurait donc cette représentation mémoire pour une instance de la classe `FooBase`:

| Attributs | Type | Déplacement | Taille en mémoire |
| --- | --- | --- | --- |
| a | int | 0 octets | 2 octets |
| b | int | 2 octets | 2 octets |

De même pour une instance de la classe `Foo`:

| Attributs | Type | Déplacement | Taille en mémoire |
| --- | --- | --- | --- |
| a | int | 0 octets | 2 octets |
| b | int | 2 octets | 2 octets |
| c | int | 4 octets | 2 octets |
| d | int | 6 octets | 2 octets |

### Représentation en mémoire ###

Comme nous avons pu le voir précédemment, l'ensemble des types de données utilisable
au sein d'un programme LOOC se composent des types primitifs ainsi que de
l'ensemble des types définis par l'utilisateur du langage.

Voici donc un table récapitulatif de la représentation en mémoire d'une instance
de l'un de ces types de données:

| Type de données | Taille en mémoire |
| --- | --- |
| int | 2 octets |
| string | `2 * (taille de la chaîne de caractères + 1) octets` |
| class Foo | `2 + somme(taille(attributs(k))) octets` |

En ce qui concerne la représentation en mémoire des descripteurs de classes et en
s'appuyant sur l'exemple précédent:

| Attributs | Type | Déplacement | Valeur |
| --- | --- | --- | --- |
| ParentClassDescriptor | Pointeur | 0 octets | `0xFFFF` |
| init | Pointeur | 2 octets | `@Method(FooBase, init)` |
| init2 | Pointeur | 4 octets | `@Method(FooBase, init2)` |

Le code en langage d'assemblage suivant permet de représenter en mémoire le
descripteur de classe ci-dessus, en supposant que les étiquettes `FooBase_init`
et `FooBase_init2` ont été préalablement définis:

```asm
FOOBASE_CLASSDESCRIPTOR rsw 3

MAIN LDW R1, #0xFFFF
     STW R1, @FOOBASE_CLASSDESCRIPTOR
     LDW R1, #FOOBASE_INIT
     STW R1, @(FOOBASE_CLASSDESCRIPTOR + 2)
     LDW R1, #FOOBASE_INIT2
     STW R1, @(FOOBASE_CLASSDESCRIPTOR + 4)
```

En s'appuyant sur l'exmple suivant, on a un exemple où la classe parent est définie:

| Attributs | Type | Déplacement | Valeur |
| --- | --- | --- | --- |
| ParentClassDescriptor | Pointeur | 0 octets | `@Descriptor(FooBase)` |
| init2 | Pointeur | 2 octets | `@Method(Foo, init2)` |
| init3 | Pointeur | 2 octets | `@Method(Foo, init3)` |

Le code en langage d'assemblage suivant permet de représenter en mémoire le
descripteur de classe ci-dessus, en supposant que les étiquettes `Foo_init2`
et `Foo_init3` ont été préalablement définis:

```asm
FOO_CLASSDESCRIPTOR rsw 3

MAIN LDW R1, #FOOBASE_CLASSDESCRIPTOR
     STW R1, @FOO_CLASSDESCRIPTOR
     LDW R1, #FOO_INIT2
     STW R1, @(FOO_CLASSDESCRIPTOR + 2)
     LDW R1, #FOO_INIT3
     STW R1, @(FOO_CLASSDESCRIPTOR + 4)
```

### Allocation d'espace mémoire ###

Dans le cadre de l'allocation d'instances de types élémentaires dans la portée
globale, on reserve directement de la mémoire grâce au directives du langage
d'assemblage.

**Exemple** :

La déclaration des variables suivantes:

```
class Foo = (

)

var a: int;
var b: int;
var c: string;
var d: Foo;
```

Produisent le code dans le langage d'assemblage suivant:

```asm
INT_A rsw 1
INT_B rsw 1
STRING_C rsw 1
FOO_D rsw 1
```

**N.B.** : On peut remarquer que la chaîne de caractères est représentée en mémoire
par une valeur entière, c'est à dire un pointeur. De la même façon les instances
d'une classe sont stockées en mémoire par pointeur.
