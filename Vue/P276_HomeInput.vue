<script setup>
import { useMessengerStore } from "@/stores/messenger";
const messenger = useMessengerStore();
</script>

<template>
  <div>
    <h2>형제1</h2>
    <input
      type="text"
      placeholder="값을 입력하세요"
      v-model="messenger.message"
    />
  </div>
</template>