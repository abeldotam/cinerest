<h1 align="center">Welcome to CINEREST 👋</h1>

<p align="center">Java / Vue.js application which generate and use an API REST.</p>
<p>
  <img alt="Version" src="https://img.shields.io/badge/version-1-blue.svg?cacheSeconds=2592000" />
  <a href="https://github.com/abeldotam/cinerest/blob/master/LICENSE" target="_blank">
    <img alt="License: MIT" src="https://img.shields.io/badge/License-MIT-yellow.svg" />
  </a>
  <a href="https://twitter.com/abeldotam" target="_blank">
    <img alt="Twitter: abeldotam" src="https://img.shields.io/twitter/follow/abeldotam.svg?style=social" />
  </a>
</p>

> Little application in Java (Maven / Apache Tomcat 8.5.24) which will generate an API of movies database and make it available through an API REST. This API will be used by a front-end webapp written in Vue.js.

## Install

Open the **back** folder in the Java IDE you feel confortable with (it has been tested with Intellij, with a simple Maven / Apache Tomcat configuration without any problems). Run the application with the adequate configurations.

Open then the **front** folder and run the usuals commands:

```sh
npm install
```

Launch in dev mode: 

```sh
npm run dev
```

Build the webapp:

```sh
npm run build
```

## Usage

After that the back & front has been builded / launched, the webapp will be available on `http://localhost:8080``
Frontend part will be available with several options and filter. API will be available on the following route:

- **/api/login** (POST) --> Login with credentials
- **/api/movies** (GET) --> All the movies
- **/api/movies/id** (GET) --> Specific movie

## Author

👤 **Abel Derderian**

* Twitter: [@abeldotam](https://twitter.com/abeldotam)
* Github: [@abeldotam](https://github.com/abeldotam)

## 🤝 Contributing

Contributions, issues and feature requests are welcome!<br />Feel free to check [issues page](https://github.com/abeldotam/cinerest/issues).

## Show your support

Give a ⭐️ if this project helped you!

## 📝 License

Copyright © 2019 [Abel Derderian](https://github.com/abeldotam).<br />
This project is [https://github.com/abeldotam/cinerest/blob/master/LICENSE](https://github.com/abeldotam/cinerest/blob/master/LICENSE) licensed.

***
_This README was generated with ❤️ by [readme-md-generator](https://github.com/kefranabg/readme-md-generator)_