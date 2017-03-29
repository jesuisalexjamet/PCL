# Organisation de la mémoire #

Lors de la phase de compilation, *glooc* segmente la mémoire du programme ainsi
créé en trois segments bien distincts:
  - Le segment de données
  - Le segment de code
  - La pile à l'exécution

Cette segmentation de la mémoire nous permet une gestion efficace de la mémoire
dans le programme ainsi qu'une protection des zone de la mémoire critique telle
que le code qui ne doit sous aucun prétexte être modifié au cours de l'exécution.

## Segment de données ##

Le segment de données contient toutes les variables définies dans la portée
globale ainsi que les chaînes de caractères utilisées tout au long du programme.
Le segment de données est également la zone de la mémoire où résideront les
descripteurs de classes.

Le segment de données est placé à l'adresse la plus basse de la mémoire, c'est à
dire `0x0000`.

## Segment de code ##

Le segment de code a pour but de contenir une représentation du code source
après assemblage. Il est stocké immédiatement à la suite du segment de données.

## La pile ##

La pile à l'exécution est une portion de l'espace d'adressage d'un processus
virtuel dédié à l'emmagasinage d'informations concernant les fonctions actives,
leurs paramètres ainsi que l'adresse où doit retourner le programme après la fin
de la dite fonction.

Par convention on choisira comme adresse de base pour la pile, la plus haute
adresse accessible en mémoire, soit `0xFFFF` et on utilisera le registre `R15`
en tant que pointeur vers le sommet de la pile.
