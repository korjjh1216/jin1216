import Vue from 'vue'
import VueRouter from 'vue-router'

import Home from '../views/Home.vue'
import About from '../views/About'
import QnAListPage from "@/views/QnAListPage";
import QnARegisterPage from "@/views/QnARegisterPage";


Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/about',
    name: 'About',
    component: About
  },
  {
    path: '/QnA',
    name: 'QnAListPage',
    components: {
      default: QnAListPage
    }
  },
  {
    path: '/QnARegisterPage',
    name: 'QnARegisterPage',
    components: {
      default: QnARegisterPage
    }
  },

]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
