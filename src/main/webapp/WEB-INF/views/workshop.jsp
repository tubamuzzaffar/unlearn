<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Unlearn | {{workshop.className}}</title>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/skeleton/2.0.4/skeleton.min.css" />
	<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
	<script src="https://vuejs.org/js/vue.js"></script>
</head>
<body>
<div id="root">
	<h1>My class</h1>

	<h3>{{workshop.className}}</h3>
	<p>{{workshop.description}}</p>
</div>
</body>
<script>
	var app = new Vue({
		el: '#root',
		data: {workshop: {}},
		mounted() {
			this.fetchWorkshop();
		},
		methods: {
			fetchWorkshop() {
				var classId = window.location.href.split('/');
				axios.get("/app/get_class/" + classId[classId.length - 1]).then(function(response){
					this.workshop = response.data;
				}.bind(this)).catch(error => {
				    console.log(error.response)
				});
			}
		}
	})
</script>
</html>