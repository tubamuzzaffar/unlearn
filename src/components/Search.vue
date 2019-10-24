<template>
    <div class="list row">
        <div class="col-md-6">
            <h4>Search Result </h4>
            
            <div class="search">
			    <h4>Search for a class</h4>
			    
			    </div>

			    
			    {{query}}

			   <ul>
                <li v-for="(workshop, index) in results" :key="index">
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
    </div>
</template>
 
<script>
import axios from "axios";
 
export default {
  name: "search",
  props: ["query"],
   data() {
    return {
      results: []
    };
  },
  methods: {
    /* eslint-disable no-console */
    search() {
    var q1 = this.query;
    console.log(q1);
   axios.get("http://localhost:8080/app/search/" + q1)
	 .then(response => {
          this.results = response.data; // JSON are parsed automatically.
          console.log(response.data);
        })
        .catch(e => {
          console.log(e);
        });
	    }
	  },
	  mounted() {
	    this.search();
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