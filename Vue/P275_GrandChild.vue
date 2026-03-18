<script setup>
import { usePersonStore } from '@/stores/person.js';
const store = usePersonStore()
const changeAge = () => {
	store.age = 1;
}
</script>

<template>
	<h1>GrandChild</h1>
	{{ store.name }}
	<button @click="changeAge">한살로 돌아가자</button>
</template>


