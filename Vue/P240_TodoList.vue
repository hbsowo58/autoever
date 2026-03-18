<template>
  <ul>
    <li v-for="(todo, idx) in todos" :key="todo">
      {{ todo }}
      <button @click="onDelete(idx)">삭제</button>
    </li>
  </ul>
</template>
  <script setup>
const props = defineProps({
  todos: {
    type: Array,
    required: true,
  },
});
const emit = defineEmits(["delete-todo"]);
function onDelete(idx) {
  emit("delete-todo", idx);
}
</script>