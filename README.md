![Rick and Morty](https://upload.wikimedia.org/wikipedia/commons/thumb/b/b1/Rick_and_Morty.svg/320px-Rick_and_Morty.svg.png)
# Rick and Morty API

## 📃 Description
The Rick and Morty API is a simple program that stores in a PostgreSQL database all the characters of the TV series and updates this list every day at 08:00. Data for the database is taken from [this resource](https://rickandmortyapi.com/documentation/#getallcharacters).
The user can send a request to two endpoints:<br>
`/movie-characters/random` - to get a description of a random character<br>
`/movie-characters/by-name?name=...` - to search for a character by part of their name

## 📎 How to run this app
1. Clone the project from GitHub
2. Configure `/resources/application.properties` with your own URL, username and password
3. To run this app you need to have on your computer installed PostgreSQL or you can use your own DB (than you need to configure `application.properties` with your own hibernate dialect and add a new dependency to the `pom.xml` file)
4. Run and enjoy the program 😉
