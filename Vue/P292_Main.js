import "./assets/main.css";

import { createApp } from "vue";
import App from "./App.vue";

// import * as echarts from "echarts";
import VueECharts from "vue-echarts";

const app = createApp(App);

app.component("v-chart", VueECharts);

app.mount("#app");