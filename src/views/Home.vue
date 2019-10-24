<template>
  <div class="home">
    <img alt="Vue logo" src="../assets/logo.png">
    <h1>I am here</h1>
    <WorkshopInfo/>
  </div>
</template>

<script lang="ts">
import { Component, Vue } from 'vue-property-decorator';
import WorkshopInfo from '@/components/WorkshopInfo.vue';
@Component({
  components: {WorkshopInfo}
})
export default class Home extends Vue {}
</script>