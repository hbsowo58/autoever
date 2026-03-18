<script setup>
import { ref } from "vue";
const userId = ref("");
const userPw = ref("");
const isAgreed = ref(false);
const userColor = ref("not selected");
const userJob = ref("student");
</script>
<template>
  <div>
    <div>
      <input type="text" placeholder="아이디" v-model="userId" />
      {{ userId }}
    </div>
    <div>
      <input type="password" placeholder="비밀번호" v-model="userPw" />
      {{ userPw }}
    </div>
    <div>
      <input type="checkbox" v-model="isAgreed" />
      {{ isAgreed }}
    </div>
    <br />
    <input type="radio" name="color" value="red" v-model="userColor" />
    <span>빨강</span>
    <input type="radio" name="color" value="blue" v-model="userColor" />
    <span>파랑</span>
    <p>{{ userColor }}</p>
    <span>직업</span>
    <select v-model="userJob" value="직업">
      <option value="student">학생</option>
      <option value="teacher">교사</option>
    </select>
    <p>{{ userJob }}</p>
  </div>
</template>