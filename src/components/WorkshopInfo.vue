<template>
  <div v-if="this.workshop">
    <h4> ClassInfo</h4>
    <div>
      <label>Class Name: </label> {{this.workshop.className}}
    </div>
    <div>
      <label>Description: </label> {{this.workshop.description}}
    </div>
    <div>
      <label>Price: </label> {{this.workshop.price}}
    </div>
  </div>
</template>

<script lang="ts">
import axios from "axios";

export default {
  name: "workshop",
  props: ["workshop"],
  methods: {
    fetchWorkshop() {
	var classId = window.location.href.split('/');
	axios
        .get("https://localhost:8080/app/class/" + classId[classId.length - 1])
        .then(response => {
          this.workshop = response.data; // JSON are parsed automatically.
          console.log(response.data);
        })
        .catch(e => {
          console.log(e);
        });
    }
  },
  mounted() {
    this.fetchWorkshop();
  }
};
</script>
 
<style>
.list {
  max-width: 450px;
  margin: auto;
}
</style>