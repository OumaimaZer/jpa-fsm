# Rapport de la vidéo `Use Case JPA Hibernate Spring Data Many To Many Case`, réalisée par Mr.Mohamed Youssfi

Cette vidéo offre une démonstration pratique de la mise en œuvre d'une relation Many-to-Many en utilisant JPA, Hibernate et Spring Data JPA. Elle m'a guidé à travers la création d'entités Java, la configuration des annotations appropriées et l'utilisation des repositories Spring Data pour gérer efficacement les relations bidirectionnelles entre entités. 

### Lien : [https://www.youtube.com/watch?v=Kfv_7m8INlU](https://www.youtube.com/watch?v=s6p2dE3qrsU)

### Contenu de la vidéo
  -  Configuration du projet : Mise en place d'un projet Spring Boot avec les dépendances nécessaires pour JPA et Hibernate.
  -  Définition des entités : Création de deux entités principales avec une relation Many-to-Many, en utilisant les annotations @ManyToMany et @JoinTable pour définir la table de jointure.
  -  Création des repositories : Utilisation de Spring Data JPA pour créer des interfaces de repository permettant les opérations CRUD sur les entités.
  -  Implémentation des services : Développement des services pour gérer la logique métier, incluant la gestion des relations entre entités.
  -  Tests et démonstration : Exécution de l'application pour démontrer le fonctionnement des relations Many-to-Many et la persistance des données.

### Application :
Le projet présenté est une application Spring Boot qui gère des utilisateurs et leurs rôles. Il utilise Hibernate pour la persistance des données via JPA (Java Persistence API). Le projet met en œuvre une relation Many-to-Many entre les entités User et Role. L'objectif principal est de créer, gérer et authentifier des utilisateurs avec différents rôles.

#### Technologies Utilisées
  - Spring Boot : Cadre de développement pour faciliter la création d'applications Java.
  - Hibernate/JPA :Persistance des données via JPA pour interagir avec la base de données.
  - Lombok : Simplifie la génération de code boilerplate (getters, setters, constructeurs, etc.).
  - Spring Data JPA :Facilite la création et l'utilisation des répositories pour les opérations CRUD.
  - Spring Service Layer : Couche de service pour encapsuler la logique métier.

#### Packages :
Le package principal est net.zerhouani.jpafsm, qui contient toutes les classes et fichiers nécessaires pour le fonctionnement de l'application. Les packages secondaires sont :
  - entities : Contient les classes d'entité User et Role.
  - repositories : Contient les interfaces de répository RoleRepository et UserRepository.
  - service : Contient les interfaces et implémentations des services (UserService et UserServiceImpl).
  - JpaFsmApplication : Classe principale de démarrage de l'application Spring Boot.

#### Classes :
  - User : Représente un utilisateur avec un nom, un mot de passe et une liste de rôles.
  - Role : Représente un rôle (ex: USER, ADMIN) avec une liste d'utilisateurs associés.
  - UserService : Interface définissant les opérations métier pour gérer les utilisateurs et les rôles.
  - UserServiceImpl : Implémentation des méthodes de UserService.
  - UserRepository : Interface pour accéder aux données des utilisateurs via JPA.
  - RoleRepository : Interface pour accéder aux données des rôles via JPA.
  - JpaFsmApplication : Classe principale démarrant l'application Spring Boot.

#### Fonctionnalités Implémentées
  - Création d'Utilisateurs et de Rôles :Ajout de nouveaux utilisateurs et rôles via les méthodes addNewUser et addNewRole.
  - Association des Rôles aux Utilisateurs : La méthode addRoleToUser permet d'associer dynamiquement des rôles aux utilisateurs en modifiant les listes bidirectionnelles roles et users.
  - Authentification des Utilisateurs :La méthode authenticate vérifie le nom d'utilisateur et le mot de passe pour retourner l'utilisateur correspondant ou lever une exception si les informations sont incorrectes.
  - Initialisation au Démarrage : Les méthodes CommandLineRunner initialisent des données fictives pour tester les fonctionnalités de l'application.

#### Flux de Fonctionnement
  - Démarrage de l'Application :L'application Spring Boot est lancée via la méthode main de JpaFsmApplication.
  - Initialisation des Données :Au démarrage, le CommandLineRunner ajoute des utilisateurs et des rôles initiaux dans la base de données.
  - Gestion des Utilisateurs et des Rôles :Les utilisateurs et les rôles sont créés et associés via les services UserService.
  - Authentification :Lors de l'authentification, le service UserService vérifie les informations fournies et retourne l'utilisateur correspondant.
  - Affichage des Résultats :Les résultats de l'authentification (utilisateur et ses rôles) sont affichés dans la console.

### Application de la relation Many-to-Many :
La relation Many-to-Many signifie qu’un utilisateur (User) peut avoir plusieurs rôles (Role), et qu’un rôle peut être attribué à plusieurs utilisateurs.
Dans ce projet :
  - Un User peut avoir plusieurs Roles (ex : un utilisateur peut être à la fois USER et STUDENT).
  - Un Role peut être associé à plusieurs Users (ex : plusieurs utilisateurs peuvent avoir le rôle ADMIN).
Cette relation est implémentée en JPA avec l’annotation @ManyToMany, et gérée via une table de jointure automatiquement créée par Hibernate.

### Captures d'écran:
#### Base de données :
![image](https://github.com/user-attachments/assets/5e6084e6-cab8-47ae-b850-a1d41de31d35)
![image](https://github.com/user-attachments/assets/b0a92aca-af5f-4526-8026-9d589bbb2e97)
![image](https://github.com/user-attachments/assets/0e982645-5c25-4083-b428-d1ef4d942171)
![image](https://github.com/user-attachments/assets/6836229f-5092-4936-a07b-3e1e2c34aa9a)

#### Réalisation :
![image](https://github.com/user-attachments/assets/80f36b22-2af5-4d83-b3eb-26e518bf8a0f)
![image](https://github.com/user-attachments/assets/b35773cc-f0f3-456d-934b-2a0b6e4b6ee9)
![image](https://github.com/user-attachments/assets/0e30758b-34c8-4a2c-a76d-efdc1340ff48)






