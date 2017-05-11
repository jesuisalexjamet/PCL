# Génération du langage d'assemblage #

Un programme rédigé en langage **LOOC** peut être représenté de façon équivalente
sous plusieurs formes distinctes:

 1. Sous sa forme original, le code source **LOOC**.
 2. Sous une forme abstraite à l'aide d'une table des symboles et d'un arbre
    abstrait.
 3. Et enfin sous la forme final du processus de compilation, le code source
    équivalent rédigé cette fois en langage d'assemblage.

Le but de la classe *AssemblyBuilder* est de permettre le passage de la deuxième
représentation d'un programme à la dernière.

## Algorithme de traduction ##

L'algorithme de traduction d'un programme en langage d'assemblage s'effectue
à la suite des vérifications syntaxiques et sémantiques. On peut donc émettre
l'hypothèse que ni la table des symboles, ni l'arbre abstrait ne comporte
d'erreurs (cette assertion est vraie par définition des contrôles syntaxique et
sémantiques).

Dans cette hypothèse il est donc possible de modéliser l'algorithme de traduction
du programme de sa deuxième forme vers sa forme finale sous la forme d'un
automate à états finis déterministe. En effet, un programme comporte un nombre
fini d'instructions et le langage **LOOC** ne comporte qu'un nombre fini
d'instructions. De plus, la grammaire abstraite du langage impose un ordre
immuable au différents types d'instructions.
