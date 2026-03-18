<script setup>
import { ref } from "vue";
const selectedColor = ref("");
</script>
<template>
  <div>
    <input type="text" v-model="selectedColor" />
    <h1 :style="{ color: selectedColor }">color</h1>
  </div>
</template>
<style scoped>
</style>