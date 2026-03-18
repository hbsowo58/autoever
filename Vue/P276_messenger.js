import { ref } from "vue";
import { defineStore } from "pinia";

export const useMessengerStore = defineStore("messenger", () => {
  const message = ref("");
  return { message };
});
