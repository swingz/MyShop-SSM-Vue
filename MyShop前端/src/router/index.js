import Vue from "vue";
import Router from "vue-router";
import ProductInfo from "../components/ProductInfo";
import Home from '../components/Home'
import Cart from '../components/Cart'
import Login from '../components/Login'
Vue.use(Router);

export default new Router({
  mode:'history',
  routes: [
    
    {
      path: '/home',
      name: 'Home',
      component: Home
    },
    {
      path: '/login',
      name: 'Login',
      component: Login
    },

    {
      path: '/productinfo/:pid',
      name: 'ProductInfo',
      component: ProductInfo
    },
    {
      path: '/cart',
      name: 'Cart',
      component: Cart
    },






    {
      path: '/*',
      redirect:'/home'
    },
    
    
  ]
});
