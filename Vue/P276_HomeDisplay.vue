<script setup>
import { useMessengerStore } from "@/stores/messenger";

const messenger = useMessengerStore();
</script>

<template>
  <div>
    <h2>형제2</h2>
    <p>{{ messenger.message }}</p>
  </div>
</template>