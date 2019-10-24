import Vue from "vue";
import Router from "vue-router";
import WorkshopsList from "./components/WorkshopsList.vue";
import WorkshopInfo from "./components/WorkshopInfo.vue";
import Search from "./components/Search.vue";
 
Vue.use(Router);
 
export default new Router({
  mode: "history",
  routes: [
    {
      path: "/",
      name: "classes",
      alias: "/class",
      component: WorkshopsList,
      // children: [
      //   {
      //     path: "/class/:id",
      //     name: "class-details",
      //     component: WorkshopInfo,
      //     props: true
      //   }
      // ]
    },
    {
      path: "/class/:id",
          name: "class-details",
          component: WorkshopInfo,
          props: true
    },
    
    {
        path: "/search/:query",
            name: "search",
            component: Search,
            props: true
      },
    
  ]
});