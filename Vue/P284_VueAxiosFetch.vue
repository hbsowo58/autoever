<script setup>
    import { ref } from "vue";
    import axios from "axios";
    const URL = "https://jsonplaceholder.typicode.com/todos";
    const todos = ref([]);
    async function dataFetch() {
        try {
            // fetch 방식 (주석처리)
            // const response = await fetch(URL, { method: "GET" });
            // console.log(response);
            // const jsonData = await response.json();
            // console.log(jsonData);
            // todos.value = jsonData;
            // axios 방식
            const response = await axios.get(URL);
            console.log(response);
            const jsonData = response.data;
            console.log(jsonData);
            todos.value = jsonData;
        } catch (error) {
            console.error(error);
        }
    }
    dataFetch();
</script>
<template>
    <div>
        <h1>Data Fetch</h1>
        <ul v-if="todos.length">
            <li v-for="todo in todos" :key="todo.id">
                <p>{{ todo.title }}</p>
            </li>
        </ul>
        <p v-else>loading...</p>
    </div>
</template>