Rendu de projet de Java EE
Martin Prieur de la Comble
Abel Derderian

Dossier back : CINE-REST
Dossier front : cinerest


Le back s'ouvre dans Intellij (Maven / Apache Tomcat 8.5.24) et génère une api sur localhost:9090
Les différentes routes de l'API sont :
/api/movies (en GET, pour voir tous les films)
/api/movies/id (en GET, pour voir un film spécifique en fonction de son ID)
/api/login (en POST pour se log)


Le front est fait en Vue.js (un framework de node.js), il faut installer node.js puis se rendre dans "cinerest" et faire les commandes suivantes : 'npm install' puis 'npm run dev' (les dépendances vont être téléchargées) et le front s'ouvrira sur http://localhost:8080/

On peut taper sur l'API via un navigateur ou Insomnia.rest sur http://localhost:9090, le front va néanmoins réécrire les routes différement dans le navigateur.

Fonctionnalités présentes :
- Connexion
- Affichage de tous les films
- Affichage d'un film en particulier avec toutes les informations demandées
- Affichage des films en fonction de la ville
