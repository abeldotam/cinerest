import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import Paris from '@/components/paris'
import Marseille from '@/components/marseille'
import Lyon from '@/components/lyon'
import Login from '@/components/login'
import Movie from '@/components/movie'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    },
    {
    	path: '/paris',
    	name: 'Paris',
    	component: Paris
    },
    {
    	path: '/marseille',
    	name: 'Marseille',
    	component: Marseille
    },
    {
    	path: '/lyon',
    	name: 'Lyon',
    	component: Lyon
    },
    {
    	path: '/login',
    	name: 'Login',
    	component: Login
    },
    {
    	path: '/movie/:id',
    	name: 'Movie',
    	component: Movie
    }
  ]
})
