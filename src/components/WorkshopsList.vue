<template>
    <div class="list row">
        <div class="col-md-6">
            <h4>Class List</h4>
            <ul>
                <li v-for="(workshop, index) in classes" :key="index">
                    <router-link :to="{
                            name: 'class-details',
                            params: { workshop: workshop, id: workshop.id }
                        }">
                            {{workshop.className}}
                    </router-link>
                </li>
            </ul>
        </div>
    
    
        <div class="col-md-6">
            <h4>recommendation List {{preferences}}</h4>
            <ul>
                <li v-for="(workshop, index) in recs" :key="index">
                    <router-link :to="{
                            name: 'class-details',
                            params: { workshop: workshop, id: workshop.id }
                        }">
                            {{workshop.className}}
                    </router-link>
                </li>
            </ul>
        </div>
    </div>
</template>
 
<script>
import axios from "axios";
 
export default {
  name: "workshop-list",
  props: ["UserId"],
  data() {
    return {
      classes: [],
      recs: [],
      preferences: "",
      pref:""
    };
  },
  methods: {
    /* eslint-disable no-console */
    retrieveClasses() {
      axios
        .get("http://localhost:8080/app/class")
        .then(response => {
          this.classes = response.data; // JSON are parsed automatically.
          console.log(response.data);
        })
        .catch(e => {
          console.log(e);
        });
    },
	  getUser() {
	  var id = 1;
      axios
        .get("http://localhost:8080/app/user/preferences" + id)
        .then(response => {
          this.preferences = response.data; // JSON are parsed automatically.
          console.log(response.data);
        })
        .catch(e => {
          console.log(e);
        });
    },
      getRecommendations() {
      var preference = "cooking";
      axios
        .get("http://localhost:8080/app/class/recommendations/" + preference)
        .then(response => {
          this.recs = response.data; // JSON are parsed automatically.
          console.log(response.data);
        })
        .catch(e => {
          console.log(e);
        });
    }
  },
  mounted() {
    this.retrieveClasses();
    this.getRecommendations();
  }
};
</script>
 
<style>
.list {
  text-align: left;
  max-width: 450px;
  margin: auto;
}
</style>