<template>
    <div id="app" class="container-fluid">
        <div class="site-info">
            <header2>Unlearn sfsdfdsfdsf</header2>
        </div>
        <nav>
            <router-link class="btn btn-primary" to="/">book</router-link>
            <router-link class="btn btn-primary" to="/add">Add</router-link>
             <form>
			      <input type="text" 
			      	class="form-control" 
			      	placeholder="Search for a class" 
			      	v-model="query">
			      	
			      	 <router-link :to="{
                            name: 'search',
                            params: {query: query }
                        }">
                        <button class="btn btn-success">Search</button>
                    </router-link>
			     
  			  </form>
	
        </nav>
        <br/>
        <router-view/>
    </div>
</template>
 
<script>
export default {
  name: "app",
  data: function () {
        return {
            user: '',
            query: ''
        }
        }
};



</script>
 
<style>
.site-info {
  color: green;
  margin-bottom: 20px;
}
 
.btn-primary {
  margin-right: 5px;
}
 
.container-fluid {
  text-align: center;
}
</style>