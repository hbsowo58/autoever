import { createRouter, createWebHistory } from "vue-router";
import HomeView from "./HomeView.vue";

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: "/",
      name: "home",
      component: HomeView,
    },
    {
      path: "/about",
      name: "about",
      component: () => import("./AboutView.vue"),
    },
    {
      path: "/board",
      name: "board",
      component: () => import("./114.vue"),
    },
  ],
});

export default router;
