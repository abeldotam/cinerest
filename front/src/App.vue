<template>
  <div id="app">
    <!-- header -->
    <div class="header">
      <div class="container">
        <div class="w3layouts_logo">
          <a href="/#/"><h1>Cine<span>Rest</span></h1></a>
        </div>
        <div class="w3l_sign_in_register">
          <ul>
            <li><a href="/#/login" data-toggle="modal" data-target="#myModal">Login</a></li>
          </ul>
        </div>
        <div class="clearfix"> </div>
      </div>
    </div>
  <!-- //header -->
 
  <!-- nav -->
    <div class="movies_nav">
      <div class="container">
        <nav class="navbar navbar-default">
          <div class="navbar-header navbar-left">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
          </div>
          <!-- Collect the nav links, forms, and other content for toggling -->
          <div class="collapse navbar-collapse navbar-right" id="bs-example-navbar-collapse-1">
            <nav>
              <ul class="nav navbar-nav">
                <li><a href="/#/">Home</a></li>
                <li><a href="/#/paris">Paris</a></li>
                <li><a href="/#/lyon">Lyon</a></li>
                <li><a href="/#/marseille">Marseille</a></li>
              </ul>
            </nav>
          </div>
        </nav>  
      </div>
    </div>
  <!-- //nav -->
    <router-view/>
  </div>
</template>

<script>
export default {
  name: 'app'
}
</script>

<style>

</style>
