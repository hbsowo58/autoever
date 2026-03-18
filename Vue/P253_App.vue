<template>
  <div>
    <nav>
      <ul>
        <li><a href="#/">Home</a></li>
        <li><a href="#/about">About</a></li>
        <li><a href="#/board">Board</a></li>
      </ul>
    </nav>
    <BoardView />
  </div>
</template>

<script setup>
// 실제 BoardView 컴포넌트 파일 없이 구조만 사용
</script>

<style scoped>
nav ul {
  list-style: disc;
  margin-left: 1rem;
  margin-bottom: 2rem;
}
nav li {
  margin-bottom: 0.5rem;
}
nav a {
  color: purple;
  font-size: 2rem;
  text-decoration: underline;
}

.BoardView {
  font-size: 4rem;
  font-weight: 700;
}
</style> 