<template>
  <div>
    <h2>할 일 목록</h2>
    <TodoList :todos="todos" @delete-todo="removeTodo" />
  </div>
</template>
  <script setup>
import { ref } from "vue";
import TodoList from "./components/TodoList.vue";
const todos = ref(["코딩 공부", "운동하기", "책 읽기"]);
// function removeTodo(idx) {
//   todos.value.splice(idx, 1);
// }

function removeTodo(idx) {
  todos.value = todos.value.filter((_, i) => i !== idx);
}
</script>
  