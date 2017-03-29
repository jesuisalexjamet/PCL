# Abstract Binary Interface #

Le but de ce document est de présenter l'ensemble des conventions et méthodes
utilisées par le compilateur du langage LOOC pour transformer la représentation
du code source donnée par l'arbre abstrait et la table des symboles en un code
source microPIUP.

# Table des matières #

1. [Organisation de la mémoire](abi/memory.md)
  1. [Segment de données](abi/memory.md#data-segment)
  2. [Segment de code](abi/memory.md#text-segment)
  3. [La pile](abi/memory.md#stack)
2. [Les types de données](abi/types.md)
  1. [Les types primitifs](abi/types.md#primitives)
  2. [Les classes](abi/types.md#classes)
    1. [Les descripteurs de classe](abi/types.md#class-descriptor)
    2. [Héritage](abi/types.md#inheritance)
    3. [Représentation en mémoire](abi/types.md#memory-representation)
    4. [Allocation d'espace mémoire](abi/types.md#allocation-d-espace-m-moire)
3. [Les structures de contrôles](abi/control-flow.md)
  1. [Les conditions](abi/control-flow.md#conditions)
  2. [Les boucles](abi/control-flow.md#loops)
4. [Les exceptions](abi/exceptions.md)
  1. [Division par zéro](abi/exceptions.md#zero-division)
  2. [Dépassement d'entier](abi/excpetions.md#integer-overflow)
  3. [Dépassement de pile](abi/exceptions.md#stackpverflow)
  4. [Dépassement de tas](abi/exceptions.md#heapoverflow)
5. [Les méthodes](abi/methods.md)
  1. [Création du contexte](abi/methods.md#context-creation)
  2. [Destruction du contexte](abi/methods.md#context-destruction)
  3. [Résolution de la méthode](abi/methods.md#method-resolution)
