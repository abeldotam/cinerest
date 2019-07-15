<template>
  <div class="container movies">
    <h4 class="latest-text">Tous nos films</h4>
      <div class="browse-inner">
         <div class="col-md-2 w3l-movie-gride-agile" v-for="movie in movies">
            <a v-bind:href="'/#/movie/' + movie.id" class="hvr-shutter-out-horizontal"><img v-bind:src="movie.image" title="album-name" alt="">
              <div class="w3l-action-icon"></div>
            </a>
            <div class="mid-1">
            <div class="w3l-movie-text">
              <h6><a v-bind:href="'/#/movie/' + movie.id" class="hvr-shutter-out-horizontal">{{movie.title}}</a></h6>
            </div>
            <div class="mid-2">
              <p>{{movie.director}}</p>
              <div class="clearfix"></div>
            </div>
          </div>  
        </div>
      </div>
  </div>
</template>

<script>
import axios from 'axios'
export default {
  name: 'HelloWorld',
  data () {
    return {
      movies: []
    }
  },
  mounted: function() {
    var instance = this;
    axios.get('/api/movies')
    .then(function (response) {
       instance.$data.movies = response.data;
    })
    .catch(function (error) {
      console.log(error);
    });
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style>
.movies {
  margin-top: 30px;
}
</style>
