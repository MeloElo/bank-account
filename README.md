# bank-account
a project for bank account adopting hexagonal architecture

Le projet comprorte la 1re phase de bank account permettant de :

Dépot d'argent
Retrait d'argent
Consulter le solde actuel
Consulter les transactions précédentes
Le projet adopte aussi : Documentation swagger et exposition des apis rest Apis rest pour Tests des services avec Junit et Mockito Configuation de base de donnée mysql

Pre-requis :

java 11
mysql
Configurer la base de donnée et port au niveau du fichier de configuration au niveau : spring.datasource.url
Pour buid du projet, executer la commande maven: mvn clean install

Pour l'execution du programme, executer le composant "Application" qui est le point d'entrée du projet spring boot Lien pour accèder vers la documentation swagger : http://localhost:8080/swagger-ui/index.html
