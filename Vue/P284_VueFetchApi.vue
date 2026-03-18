<script setup>
    import { ref } from "vue";

    const URL = "https://jsonplaceholder.typicode.com/todos";
    const todos = ref([]);

    async function dataFetch() {
        try {
            const response = await fetch(URL, { method: "GET" });
            console.log(response);
            const jsonData = await response.json();
            console.log(jsonData);
            todos.value = jsonData;
        } catch (error) {
            console.error(error);
        }
    }

    dataFetch();
</script>

<template>
    <h1>Data Fetch</h1>
    <ul v-if="todos.length">
        <li v-for="todo in todos" :key="todo.id">
            <p>{{ todo.title }}</p>
        </li>
    </ul>
    <p v-else>loading...</p>
</template>