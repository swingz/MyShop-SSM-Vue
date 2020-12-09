// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'

import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'


import VueRouter from 'vue-router'
import router from './router' //2.引入静态路由表
import Vuex from 'vuex'
import store from './store'
import axios from 'axios'
import VueAxios from 'vue-axios'
Vue.use(VueAxios,axios)
Vue.use(ElementUI)
Vue.use(VueRouter)
Vue.use(Vuex)

// 在跳转前执行
router.beforeEach((to, form, next) => {
  // 获取用户登录状态
  let isLogin = sessionStorage.getItem('isLogin');
  // 注销
  if (to.path == '/logout') {
    // 清空
    sessionStorage.clear();

    // 跳转到登录
    next({path: '/login'});
  }
  // 如果请求的是登录页
  else if (to.path == '/login') {
    if (isLogin != null) {
      // 跳转到首页
      next({path: '/home'});
    }
  }
  // 如果为非登录状态
  else if (isLogin == null) {
    // 跳转到登录页
    next({path: '/login'});
  }
  // 下一个路由
  next();
});

Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  store,
  components: { App },
  template: '<App/>'
})
