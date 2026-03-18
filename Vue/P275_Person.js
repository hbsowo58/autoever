import { ref } from 'vue'
import { defineStore } from 'pinia'

export const usePersonStore = defineStore('person', () => {
  const name = ref('david')
  const age = ref(10)

  return { name, age }
})
