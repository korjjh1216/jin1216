<template>
  <div class="home">
    <div id="bg" > </div>
    <div class="menubar">
      <div class="dropdown">
        <button class="dropbtn">
          마이 페이지
        </button>
        <div class="dropdown-contents">
          <a href="#">Personal Information</a>
          <a href="#">💪⭐gram️</a>
          <a href="#">History</a>
          <a href="#">schedule</a>
        </div>

      </div>
      <a href="#fap">FAQ(자주 묻는 질문)</a>
      <router-link :to="{ name: 'QnAListPage' }"
                   class="nav-link"
                   active-class="active">
        QnA
      </router-link>
      <a style="float: right" href="logout">로그아웃</a>
      <a style="float: right" href="login">로그인</a>
      <router-link :to="{ name: 'About' }" style="float: right">
        About Us
      </router-link>
<!--      <a style="float: right" th:href="@{/exercise/menubar?signUp}" >회원가입</a>-->
    </div>
  </div>
</template>

<script>

export default {
  name: 'Home',
  components: {

  }
}
</script>
<style scoped>
.home {
  background-image: url("../../../main/resources/static/img/homeimage.jpg");
  background-repeat:no-repeat;
  background-attachment: fixed;
}

.menubar {
  overflow: hidden;
  background-color: #ba7777;
  margin-bottom: 20px;
}

.menubar a {
  float: left;
  font-size: 16px;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

.dropdown {
  float: left;
  overflow: hidden;
}

.dropdown .dropbtn {
  font-size: 16px;
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit;
  margin: 0;
}

.navbar a:hover, .dropdown:hover .dropbtn {
  background-color: red;
}

.dropdown-contents {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  /* rgba에서 a는 알파값으로 투명도를 의미함 */
  box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
  z-index: 1;
}

.dropdown-contents a {
  float: none;
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
}

.dropdown-contents a:hover {
  background-color: #ddddff;
}

.dropdown:hover .dropdown-contents {
  display: block;
}
</style>