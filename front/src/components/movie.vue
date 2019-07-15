<template>
  <div class="container">
    <center>
      <h1>{{movie.title}}</h1>
    </center>
    <div class="col-md-4">
      <img v-bind:src="movie.image">
    </div>
    <div class="col-md-7">
      <ul>
        <li>City: {{movie.city}}</li>
        <li>Title: {{movie.title}}</li>
        <li>Duration: {{movie.dration}}</li>
        <li>Language: {{movie.language}}</li>
        <li>Subtitles: {{movie.subtitles}}</li>
        <li>Director: {{movie.director}}</li>
        <li>
          Main actors: 
          <ul>
            <li v-for="actor of movie.mainActors">{{actor}}</li>
          </ul>
        </li>
        <li>Minimum age: {{movie.minAge}}</li>
        <li>
          Sessions:
          <ul v-for="session of movie.sessions">
            <li>Day: {{session.day}}</li>
            <li>Time: {{session.time}}</li>
          </ul>
        </li>
      </ul>
    </div>
  </div>
</template>

<script>
import axios from 'axios'
export default {
  name: 'movie',
  data () {
    return {
      movie: {}
    }
  },
  mounted() {
    var instance = this;
    axios.get('/api/movies/' + this.$route.params.id)
    .then(function (response) {
      instance.$data.movie = response.data;
    })
    .catch(function (error) {
      console.log(error);
    });
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style>
h1 {
  margin-top: 30px;
  margin-bottom: 30px;
}

ul {
  padding-left: 20px;
}
</style>
