<template>
    <NavBar/>
    <router-view/>
</template>

<style>
body {
    //background-image: url("@/assets/OrteliusWorldMap1570.jpg");
    //background-size: cover;
}
</style>
<script>
import NavBar from '@/components/NavBar.vue'
import "bootstrap/dist/css/bootstrap.min.css"
import "bootstrap/dist/js/bootstrap"

export default {
    components: {
        NavBar
    }
}
</script>