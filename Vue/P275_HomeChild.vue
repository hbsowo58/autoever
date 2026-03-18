<script setup>
import GrandChild from '@/components/GrandChild.vue';
import { usePersonStore } from '@/stores/person.js';
const store = usePersonStore()
const changeName = () => {
	store.name = 'tom'
}
</script>

<template>
	<h1>Home Child</h1>
	{{ store.name }}
	{{ store.age }}
	<button @click="changeName">이름 변경</button>
	<GrandChild/>
</template>


