<script setup>
import { ref } from "vue";
const lottoNum = ref(null);
function createLottoNum() {
  const num = Math.floor(Math.random() * 45) + 1;
  lottoNum.value = num;
}
</script>
<template>
  <div>
    <h1>로또 번호 생성기</h1>
    <button @click="createLottoNum">번호 생성</button>
    <p>{{ lottoNum }}</p>
  </div>
</template>
<style scoped></style>