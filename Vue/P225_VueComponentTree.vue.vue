<template>
  <div>
    <nav>
      <ul>
        <li><a href="#">Home</a></li>
        <li><a href="#">About</a></li>
      </ul>
    </nav>
    <HomeView>
      <HomeHeader>
        <HomeIcons />
      </HomeHeader>
      <HomeMain>
        <HomeIcons />
        <HomeFooter />
      </HomeMain>
    </HomeView>
  </div>
</template>

<script setup>
import HomeView from "./components/HomeView.vue";
import HomeHeader from "./components/HomeHeader.vue";
import HomeMain from "./components/HomeMain.vue";
import HomeFooter from "./components/HomeFooter.vue";
import HomeIcons from "./components/HomeIcons.vue";
</script>

<style scoped>
</style> 