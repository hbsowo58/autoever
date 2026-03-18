<script setup>
import HomeChild from '@/components/HomeChild.vue';
import { usePersonStore } from '@/stores/person.js';
const store = usePersonStore()
// store.count++;
// store.increment();
// console.log(store.doubleCount)
const reducingAge = () => {
	store.age--;
}
</script>

<template>
	<h1>Home View</h1>
	{{ store.name }}
	{{ store.age }}
	<!-- getters : {{ store.doubleCount }} -->
	<button @click="reducingAge">나이를 줄이자</button>
	<HomeChild/>
</template>


