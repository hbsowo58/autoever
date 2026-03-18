<script setup>
    import { ref } from "vue";
    const option = ref({
        xAxis: {
            type: "category",
            data: ["Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"],
        },
        yAxis: {
            type: "value",
        },
        series: [
            {
                data: [150, 230, 224, 218, 135, 147, 260],
                type: "line",
            },
        ],
    });
</script>
<template>
    <v-chart :option="option" style="height: 400px" />
</template>