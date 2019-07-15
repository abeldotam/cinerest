<template>
 <!-- bootstrap-pop-up -->
    <div class="container">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            Sign In            
          </div>
          <section>
            <div class="modal-body">
              <div class="w3_login_module">
                <div class="module form-module">
                  <div class="form">
                  <form action="#" method="post">
                  </form>
                  </div>
                  <div class="form">
                  <h3>Login to your account</h3>
                  <form action="#" method="post">
                    <input type="text" name="Username" placeholder="Username" required="" v-model="username">
                    <input type="password" name="Password" placeholder="Password" required="" v-model="password">
                    <input type="submit" value="Login" v-on:click="login($event)">
                  </form>
                  </div>
                </div>
              </div>
            </div>
          </section>
        </div>
      </div>
    </div>
  <!-- //bootstrap-pop-up -->
</template>

<script>
import axios from 'axios'
export default {
  name: 'HelloWorld',
  data () {
    return {
      username : '',
      password : ''
    }
  },
  methods: {
    login () {
      axios.post('/user', {
        login: this.$data.username,
        password: this.$data.password
      })
      .then(function (response) {
        window.token = response.data.token;
        this.$router.push({
          path: '/secret'
        })
      })
      .catch(function (error) {
        console.log(error);
      });
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style>
.movies {
  margin-top: 30px;
}
</style>
