# Sémantique du language Looc #

Ce document présente l'ensemble des règles sémantiques et des contrôles associés
qui seront éxécutés sur les programme passés en entrée du compilateur.

# Table des matières #

1. [Méthodes](#m-thodes)
2. [Affectation](#affectation)
2. [Arithmétique](#arithm-tique)
2. [Boucle](#boucle)
2. [Condition](#condition)
2. [Comparaison](#comparaison)
2. [Déclaration](#d-claration)
2. [Héritage](#h-ritage)
2. [Portée](#port-e)
2. [Autres](#autres)

## Méthodes ##

1. Vérifier qu'une méthode est bien définie au sein de la classe de l'instance
   sur laquelle elle est appelée. (Killian / Antoine)

2. L'utilisation du mot-clè `this` n'a de sens qu'au sein d'une méthode. (Nicolas / Killian)

3. Vérifier la correction d'un appel de méthode:
    - Le nombre d'arguments est correct (Killian)
    - Les types de données correspondent (Antoine)

4. Vérifier l'utilisation que l'instruction `return` se fait avec une valeur dont
   le type est le même que celui spécifié dans le prototype de la méthode. (Killian)

5. Vérifier que pour toute méthode dont le type de retour est spécifié,
   le méthode comporte au moins une instruction `return`. (Killian)

6. Vérifier l'absence d'instruction `return` dont le type de retour
   n'est pas spécifié. (Killian)

7. Il est permis de surcharger une méthode au sein d'une classe, à la
   condition de conserver le type de retour.

## Affectation ##

1. Verification de la correspondance des types des deux membres d'une affectation
    Lors d'une affectation à un nombre entier, le membre droit de l'affectation
    est soit une constante entière soit le résultat d'une fonction renvoyant
    un nombre entier. (Nicolas)

    Exemple:
    ```
    class Foo = (
        method bar() : string {
            return ("bar");
        }

        method bar2() : int {
            return (0);
        }
    )

    var x: int;
    var foo: Foo;

    foo := 4;
    foo := new Foo;         // Correct

    x := "Hello World !";   // Incorrect
    x := foo.bar();         // Incorrect

    x := 10;                // Correct
    x := foo.bar2();        // Correct
    ```

2. Soit une classe `A` et une classe `B` héritant de `A`. Il possible
   d'affecter à une variable de type `A` une instance de la classe `B`, il n'est
   cependant pas permis d'affecter à une variable de type `B` une instance de la
   classe `A`.

## Arithmetique ##

1. Vérification des types atomes d'une expression arithmétique (Nicolas / Antoine)

   Chacun des atomes d'une expression arithmétiques, qu'il s'agisse d'une
   constante ou du résultat d'une méthode, doit être un nombre entier.

   Exemple:
   ```
   class Foo = (
       method foo() : string {
           return ("Hello world !");
       }

       method bar() : int {
           return (0);
       }
   )

   var x: int;
   var foo: Foo;

   foo := new Foo;

   x := 5 + foo.foo();  // Incorrect
   x := 5 + foo.bar();  // Correct
   ```

## Boucle ##

1. Les bornes inférieures et supérieures du compteur d'une boucle `for`
   sont des entiers. (Antoine)

2. Les boucles sont valides à la condition que la borne inférieure du compteur
   de boucle soit inférieure ou égale à la borne supérieure de ce même compteur. (Antoine)

3. Il n'est pas permis de modifier le compteur d'une boucle `for`. (Antoine)

## Condition ##

1. L'expression évaluée dans une condition doit être un booléen résultant
   d'un test ou un entier qui sera évalué comme un booléen. (Nicolas)

## Comparaison ##

1. Les deux membres d'une comparaison doivent être de même type. (Nicolas)

## Déclaration ##

1. Une nouvelle déclaration d'une variable déjà déclarée dans la portée de la
   seconde déclaration n'est pas autorisée.

   ```
   var x: int;  // Première déclaration autorisée.
   var x: int;  // Seconde déclaration non autorisée.
   ```

2. Vérifier que le type utilisé dans une déclaration de variable est bien défini. (Ok)

## Héritage ##

1. Le parent d'une classe doit être une classe. (Alex)

2. Soit `A` une classe héritant de `B`, l'ensemble des noms des attributs de `A`
   et de `B` doivent être disjoints. (Alex)

3. L'utilisation du mot-clé `super` n'a de sens que si la classe hérite
   d'une autre classe. (Alex)

4. Il est permis de surcharger une méthode de la classe parent au sein
   de la classe fille à la condition de respecter le prototype de la méthode
   définie dans la classe mère. (Alex)

5. Utiliser le mot-clé `super` dans toute autre situation que l'appel
   d'une méthode de la classe parent n'a pas de sens. (Alex)

## Portée ##

1. Vérifier que les variables référencées dans une expression ou une instruction
   sont bien visible dans la portée où elles sont utilisées.

## Autres ##

1. S'assurer de l'absence de divisions par zéro. (Antoine)
