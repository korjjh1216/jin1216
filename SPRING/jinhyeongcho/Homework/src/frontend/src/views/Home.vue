<template>
  <div class="home">
    <!-- <img alt="Vue logo" src="../assets/logo.png"> -->
    <h2 align="center">홈화면입니다 게시판기능만 만드는중입니다. </h2>
    <hr>
    <div align="center" id="header">
      <router-link :to="{ name: 'Home' }"
                   class="nav-link"
                   active-class="active">
        Home
      </router-link>
      <router-link :to="{ name: 'About' }"
                   class="nav-link"
                   active-class="active">
        About Us
      </router-link>
      <router-link :to="{ name: 'BoardListPage' }"
                   class="nav-link"
                   active-class="active">
        게시판
      </router-link>
    </div>
  </div>
</template>
<script>
// @ is an alias to /src
//import HelloWorld from '@/components/HelloWorld.vue'

export default {
  name: 'Home',
  data: function (){
    return{
      message: "숙제중입니다.."
    }
  },
  components: {
  }
}
</script>
