webpackHotUpdate("main",{

/***/ "./src/main/webapp/app/app.routing.ts":
/*!********************************************!*\
  !*** ./src/main/webapp/app/app.routing.ts ***!
  \********************************************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

"use strict";
eval("\nObject.defineProperty(exports, \"__esModule\", { value: true });\nvar tslib_1 = __webpack_require__(/*! tslib */ \"./node_modules/tslib/tslib.es6.js\");\nvar core_1 = __webpack_require__(/*! @angular/core */ \"./node_modules/@angular/core/fesm5/core.js\");\nvar router_1 = __webpack_require__(/*! @angular/router */ \"./node_modules/@angular/router/fesm5/router.js\");\n// Import Containers\nvar containers_1 = __webpack_require__(/*! app/containers */ \"./src/main/webapp/app/containers/index.ts\");\nvar _404_component_1 = __webpack_require__(/*! ./views/error/404.component */ \"./src/main/webapp/app/views/error/404.component.ts\");\nvar _500_component_1 = __webpack_require__(/*! ./views/error/500.component */ \"./src/main/webapp/app/views/error/500.component.ts\");\nvar login_component_1 = __webpack_require__(/*! ./views/login/login.component */ \"./src/main/webapp/app/views/login/login.component.ts\");\nvar register_component_1 = __webpack_require__(/*! ./views/register/register.component */ \"./src/main/webapp/app/views/register/register.component.ts\");\nexports.routes = [\n    {\n        path: '',\n        redirectTo: 'dashboard',\n        pathMatch: 'full'\n    },\n    {\n        path: '404',\n        component: _404_component_1.P404Component,\n        data: {\n            title: 'Page 404'\n        }\n    },\n    {\n        path: '500',\n        component: _500_component_1.P500Component,\n        data: {\n            title: 'Page 500'\n        }\n    },\n    {\n        path: 'login',\n        component: login_component_1.LoginComponent,\n        data: {\n            title: 'Login Page'\n        }\n    },\n    {\n        path: 'register',\n        component: register_component_1.RegisterComponent,\n        data: {\n            title: 'Register Page'\n        }\n    },\n    {\n        path: '',\n        component: containers_1.DefaultLayoutComponent,\n        data: {\n            title: 'Home'\n        },\n        children: [\n            {\n                path: 'configuration',\n                loadChildren: function () { return new Promise(function (resolve, reject) { Promise.all(/*! require.ensure */[__webpack_require__.e(3), __webpack_require__.e(5), __webpack_require__.e(11), __webpack_require__.e(6), __webpack_require__.e(2), __webpack_require__.e(1), __webpack_require__.e(7)]).then((function (require) { resolve(__webpack_require__(/*! ./entities/configuration/configuration.module */ \"./src/main/webapp/app/entities/configuration/configuration.module.ts\")['ConfigurationModule']); }).bind(null, __webpack_require__)).catch(function () { reject({ loadChunkError: true }); }); }); }\n            },\n            {\n                path: 'batch',\n                loadChildren: function () { return new Promise(function (resolve, reject) { Promise.all(/*! require.ensure */[__webpack_require__.e(3), __webpack_require__.e(5), __webpack_require__.e(2), __webpack_require__.e(1), __webpack_require__.e(8)]).then((function (require) { resolve(__webpack_require__(/*! ./entities/batch-management/batchmgnt.module */ \"./src/main/webapp/app/entities/batch-management/batchmgnt.module.ts\")['BatchmgntModule']); }).bind(null, __webpack_require__)).catch(function () { reject({ loadChunkError: true }); }); }); }\n            },\n            {\n                path: 'godown',\n                loadChildren: function () { return new Promise(function (resolve, reject) { Promise.all(/*! require.ensure */[__webpack_require__.e(3), __webpack_require__.e(5), __webpack_require__.e(2), __webpack_require__.e(9)]).then((function (require) { resolve(__webpack_require__(/*! ./entities/godown-management/godown.module */ \"./src/main/webapp/app/entities/godown-management/godown.module.ts\")['GodownModule']); }).bind(null, __webpack_require__)).catch(function () { reject({ loadChunkError: true }); }); }); }\n            },\n            {\n                path: 'dashboard',\n                loadChildren: function () { return new Promise(function (resolve, reject) { Promise.all(/*! require.ensure */[__webpack_require__.e(3), __webpack_require__.e(11), __webpack_require__.e(12), __webpack_require__.e(10)]).then((function (require) { resolve(__webpack_require__(/*! ./views/dashboard/dashboard.module */ \"./src/main/webapp/app/views/dashboard/dashboard.module.ts\")['DashboardModule']); }).bind(null, __webpack_require__)).catch(function () { reject({ loadChunkError: true }); }); }); }\n            }\n        ]\n    }\n];\nvar AppRoutingModule = /** @class */ (function () {\n    function AppRoutingModule() {\n    }\n    AppRoutingModule = tslib_1.__decorate([\n        core_1.NgModule({\n            imports: [router_1.RouterModule.forRoot(exports.routes)],\n            exports: [router_1.RouterModule]\n        })\n    ], AppRoutingModule);\n    return AppRoutingModule;\n}());\nexports.AppRoutingModule = AppRoutingModule;\n//# sourceURL=[module]\n//# sourceMappingURL=data:application/json;charset=utf-8;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbIndlYnBhY2s6Ly8vLi9zcmMvbWFpbi93ZWJhcHAvYXBwL2FwcC5yb3V0aW5nLnRzP2ZiZWIiXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6Ijs7O0FBQUEsb0dBQXlDO0FBQ3pDLDRHQUF1RDtBQUV2RCxvQkFBb0I7QUFDcEIsMEdBQXdEO0FBRXhELG9JQUE0RDtBQUM1RCxvSUFBNEQ7QUFDNUQseUlBQStEO0FBQy9ELHdKQUF3RTtBQUUzRCxjQUFNLEdBQVc7SUFDMUI7UUFDSSxJQUFJLEVBQUUsRUFBRTtRQUNSLFVBQVUsRUFBRSxXQUFXO1FBQ3ZCLFNBQVMsRUFBRSxNQUFNO0tBQ3BCO0lBQ0Q7UUFDSSxJQUFJLEVBQUUsS0FBSztRQUNYLFNBQVMsRUFBRSw4QkFBYTtRQUN4QixJQUFJLEVBQUU7WUFDRixLQUFLLEVBQUUsVUFBVTtTQUNwQjtLQUNKO0lBQ0Q7UUFDSSxJQUFJLEVBQUUsS0FBSztRQUNYLFNBQVMsRUFBRSw4QkFBYTtRQUN4QixJQUFJLEVBQUU7WUFDRixLQUFLLEVBQUUsVUFBVTtTQUNwQjtLQUNKO0lBQ0Q7UUFDSSxJQUFJLEVBQUUsT0FBTztRQUNiLFNBQVMsRUFBRSxnQ0FBYztRQUN6QixJQUFJLEVBQUU7WUFDRixLQUFLLEVBQUUsWUFBWTtTQUN0QjtLQUNKO0lBQ0Q7UUFDSSxJQUFJLEVBQUUsVUFBVTtRQUNoQixTQUFTLEVBQUUsc0NBQWlCO1FBQzVCLElBQUksRUFBRTtZQUNGLEtBQUssRUFBRSxlQUFlO1NBQ3pCO0tBQ0o7SUFDRDtRQUNJLElBQUksRUFBRSxFQUFFO1FBQ1IsU0FBUyxFQUFFLG1DQUFzQjtRQUNqQyxJQUFJLEVBQUU7WUFDRixLQUFLLEVBQUUsTUFBTTtTQUNoQjtRQUNELFFBQVEsRUFBRTtZQUNOO2dCQUNJLElBQUksRUFBRSxlQUFlO2dCQUNyQixZQUFZLEVBQUUsY0FBYSxNQUFNLENBQUMsSUFBSSxPQUFPLENBQUMsVUFBVSxPQUFPLEVBQUUsTUFBTSxJQUFNLGdPQUEyQixVQUFVLE9BQVksSUFBTyxPQUFPLENBQUMsbUJBQU8sQ0FBQywySEFBK0MsQ0FBQyxDQUFDLHFCQUFxQixDQUFDLENBQUMsQ0FBQyxDQUFFLENBQUMseUNBQUUsY0FBZ0IsTUFBTSxDQUFDLEVBQUUsY0FBYyxFQUFFLElBQUksRUFBRSxDQUFDLENBQUMsQ0FBRSxDQUFDLENBQUMsQ0FBQyxFQUFDLENBQUMsRUFBQyxDQUFDO2FBQ2hTO1lBQ0Q7Z0JBQ0ksSUFBSSxFQUFFLE9BQU87Z0JBQ2IsWUFBWSxFQUFFLGNBQWEsTUFBTSxDQUFDLElBQUksT0FBTyxDQUFDLFVBQVUsT0FBTyxFQUFFLE1BQU0sSUFBTSwyS0FBMkIsVUFBVSxPQUFZLElBQU8sT0FBTyxDQUFDLG1CQUFPLENBQUMseUhBQThDLENBQUMsQ0FBQyxpQkFBaUIsQ0FBQyxDQUFDLENBQUMsQ0FBRSxDQUFDLHlDQUFFLGNBQWdCLE1BQU0sQ0FBQyxFQUFFLGNBQWMsRUFBRSxJQUFJLEVBQUUsQ0FBQyxDQUFDLENBQUUsQ0FBQyxDQUFDLENBQUMsRUFBQyxDQUFDLEVBQUMsQ0FBQzthQUMzUjtZQUNEO2dCQUNJLElBQUksRUFBRSxRQUFRO2dCQUNkLFlBQVksRUFBRSxjQUFhLE1BQU0sQ0FBQyxJQUFJLE9BQU8sQ0FBQyxVQUFVLE9BQU8sRUFBRSxNQUFNLElBQU0saUpBQTJCLFVBQVUsT0FBWSxJQUFPLE9BQU8sQ0FBQyxtQkFBTyxDQUFDLHFIQUE0QyxDQUFDLENBQUMsY0FBYyxDQUFDLENBQUMsQ0FBQyxDQUFFLENBQUMseUNBQUUsY0FBZ0IsTUFBTSxDQUFDLEVBQUUsY0FBYyxFQUFFLElBQUksRUFBRSxDQUFDLENBQUMsQ0FBRSxDQUFDLENBQUMsQ0FBQyxFQUFDLENBQUMsRUFBQyxDQUFDO2FBQ3RSO1lBQ0Q7Z0JBQ0ksSUFBSSxFQUFFLFdBQVc7Z0JBQ2pCLFlBQVksRUFBRSxjQUFhLE1BQU0sQ0FBQyxJQUFJLE9BQU8sQ0FBQyxVQUFVLE9BQU8sRUFBRSxNQUFNLElBQU0sb0pBQTJCLFVBQVUsT0FBWSxJQUFPLE9BQU8sQ0FBQyxtQkFBTyxDQUFDLHFHQUFvQyxDQUFDLENBQUMsaUJBQWlCLENBQUMsQ0FBQyxDQUFDLENBQUUsQ0FBQyx5Q0FBRSxjQUFnQixNQUFNLENBQUMsRUFBRSxjQUFjLEVBQUUsSUFBSSxFQUFFLENBQUMsQ0FBQyxDQUFFLENBQUMsQ0FBQyxDQUFDLEVBQUMsQ0FBQyxFQUFDLENBQUM7YUFDalI7U0FDSjtLQUNKO0NBQ0osQ0FBQztBQU1GO0lBQUE7SUFBK0IsQ0FBQztJQUFuQixnQkFBZ0I7UUFKNUIsZUFBUSxDQUFDO1lBQ04sT0FBTyxFQUFFLENBQUMscUJBQVksQ0FBQyxPQUFPLENBQUMsY0FBTSxDQUFDLENBQUM7WUFDdkMsT0FBTyxFQUFFLENBQUMscUJBQVksQ0FBQztTQUMxQixDQUFDO09BQ1csZ0JBQWdCLENBQUc7SUFBRCx1QkFBQztDQUFBO0FBQW5CLDRDQUFnQiIsImZpbGUiOiIuL3NyYy9tYWluL3dlYmFwcC9hcHAvYXBwLnJvdXRpbmcudHMuanMiLCJzb3VyY2VzQ29udGVudCI6WyJpbXBvcnQgeyBOZ01vZHVsZSB9IGZyb20gJ0Bhbmd1bGFyL2NvcmUnO1xuaW1wb3J0IHsgUm91dGVzLCBSb3V0ZXJNb2R1bGUgfSBmcm9tICdAYW5ndWxhci9yb3V0ZXInO1xuXG4vLyBJbXBvcnQgQ29udGFpbmVyc1xuaW1wb3J0IHsgRGVmYXVsdExheW91dENvbXBvbmVudCB9IGZyb20gJ2FwcC9jb250YWluZXJzJztcblxuaW1wb3J0IHsgUDQwNENvbXBvbmVudCB9IGZyb20gJy4vdmlld3MvZXJyb3IvNDA0LmNvbXBvbmVudCc7XG5pbXBvcnQgeyBQNTAwQ29tcG9uZW50IH0gZnJvbSAnLi92aWV3cy9lcnJvci81MDAuY29tcG9uZW50JztcbmltcG9ydCB7IExvZ2luQ29tcG9uZW50IH0gZnJvbSAnLi92aWV3cy9sb2dpbi9sb2dpbi5jb21wb25lbnQnO1xuaW1wb3J0IHsgUmVnaXN0ZXJDb21wb25lbnQgfSBmcm9tICcuL3ZpZXdzL3JlZ2lzdGVyL3JlZ2lzdGVyLmNvbXBvbmVudCc7XG5cbmV4cG9ydCBjb25zdCByb3V0ZXM6IFJvdXRlcyA9IFtcbiAgICB7XG4gICAgICAgIHBhdGg6ICcnLFxuICAgICAgICByZWRpcmVjdFRvOiAnZGFzaGJvYXJkJyxcbiAgICAgICAgcGF0aE1hdGNoOiAnZnVsbCdcbiAgICB9LFxuICAgIHtcbiAgICAgICAgcGF0aDogJzQwNCcsXG4gICAgICAgIGNvbXBvbmVudDogUDQwNENvbXBvbmVudCxcbiAgICAgICAgZGF0YToge1xuICAgICAgICAgICAgdGl0bGU6ICdQYWdlIDQwNCdcbiAgICAgICAgfVxuICAgIH0sXG4gICAge1xuICAgICAgICBwYXRoOiAnNTAwJyxcbiAgICAgICAgY29tcG9uZW50OiBQNTAwQ29tcG9uZW50LFxuICAgICAgICBkYXRhOiB7XG4gICAgICAgICAgICB0aXRsZTogJ1BhZ2UgNTAwJ1xuICAgICAgICB9XG4gICAgfSxcbiAgICB7XG4gICAgICAgIHBhdGg6ICdsb2dpbicsXG4gICAgICAgIGNvbXBvbmVudDogTG9naW5Db21wb25lbnQsXG4gICAgICAgIGRhdGE6IHtcbiAgICAgICAgICAgIHRpdGxlOiAnTG9naW4gUGFnZSdcbiAgICAgICAgfVxuICAgIH0sXG4gICAge1xuICAgICAgICBwYXRoOiAncmVnaXN0ZXInLFxuICAgICAgICBjb21wb25lbnQ6IFJlZ2lzdGVyQ29tcG9uZW50LFxuICAgICAgICBkYXRhOiB7XG4gICAgICAgICAgICB0aXRsZTogJ1JlZ2lzdGVyIFBhZ2UnXG4gICAgICAgIH1cbiAgICB9LFxuICAgIHtcbiAgICAgICAgcGF0aDogJycsXG4gICAgICAgIGNvbXBvbmVudDogRGVmYXVsdExheW91dENvbXBvbmVudCxcbiAgICAgICAgZGF0YToge1xuICAgICAgICAgICAgdGl0bGU6ICdIb21lJ1xuICAgICAgICB9LFxuICAgICAgICBjaGlsZHJlbjogW1xuICAgICAgICAgICAge1xuICAgICAgICAgICAgICAgIHBhdGg6ICdjb25maWd1cmF0aW9uJyxcbiAgICAgICAgICAgICAgICBsb2FkQ2hpbGRyZW46IGZ1bmN0aW9uKCkgeyByZXR1cm4gbmV3IFByb21pc2UoZnVuY3Rpb24gKHJlc29sdmUsIHJlamVjdCkgeyAgKHJlcXVpcmUgYXMgYW55KS5lbnN1cmUoW10sIGZ1bmN0aW9uIChyZXF1aXJlOiBhbnkpIHsgICAgcmVzb2x2ZShyZXF1aXJlKCcuL2VudGl0aWVzL2NvbmZpZ3VyYXRpb24vY29uZmlndXJhdGlvbi5tb2R1bGUnKVsnQ29uZmlndXJhdGlvbk1vZHVsZSddKTsgIH0sIGZ1bmN0aW9uKCkgeyAgICByZWplY3QoeyBsb2FkQ2h1bmtFcnJvcjogdHJ1ZSB9KTsgIH0pO30pIH1cbiAgICAgICAgICAgIH0sXG4gICAgICAgICAgICB7XG4gICAgICAgICAgICAgICAgcGF0aDogJ2JhdGNoJyxcbiAgICAgICAgICAgICAgICBsb2FkQ2hpbGRyZW46IGZ1bmN0aW9uKCkgeyByZXR1cm4gbmV3IFByb21pc2UoZnVuY3Rpb24gKHJlc29sdmUsIHJlamVjdCkgeyAgKHJlcXVpcmUgYXMgYW55KS5lbnN1cmUoW10sIGZ1bmN0aW9uIChyZXF1aXJlOiBhbnkpIHsgICAgcmVzb2x2ZShyZXF1aXJlKCcuL2VudGl0aWVzL2JhdGNoLW1hbmFnZW1lbnQvYmF0Y2htZ250Lm1vZHVsZScpWydCYXRjaG1nbnRNb2R1bGUnXSk7ICB9LCBmdW5jdGlvbigpIHsgICAgcmVqZWN0KHsgbG9hZENodW5rRXJyb3I6IHRydWUgfSk7ICB9KTt9KSB9XG4gICAgICAgICAgICB9LFxuICAgICAgICAgICAge1xuICAgICAgICAgICAgICAgIHBhdGg6ICdnb2Rvd24nLFxuICAgICAgICAgICAgICAgIGxvYWRDaGlsZHJlbjogZnVuY3Rpb24oKSB7IHJldHVybiBuZXcgUHJvbWlzZShmdW5jdGlvbiAocmVzb2x2ZSwgcmVqZWN0KSB7ICAocmVxdWlyZSBhcyBhbnkpLmVuc3VyZShbXSwgZnVuY3Rpb24gKHJlcXVpcmU6IGFueSkgeyAgICByZXNvbHZlKHJlcXVpcmUoJy4vZW50aXRpZXMvZ29kb3duLW1hbmFnZW1lbnQvZ29kb3duLm1vZHVsZScpWydHb2Rvd25Nb2R1bGUnXSk7ICB9LCBmdW5jdGlvbigpIHsgICAgcmVqZWN0KHsgbG9hZENodW5rRXJyb3I6IHRydWUgfSk7ICB9KTt9KSB9XG4gICAgICAgICAgICB9LFxuICAgICAgICAgICAge1xuICAgICAgICAgICAgICAgIHBhdGg6ICdkYXNoYm9hcmQnLFxuICAgICAgICAgICAgICAgIGxvYWRDaGlsZHJlbjogZnVuY3Rpb24oKSB7IHJldHVybiBuZXcgUHJvbWlzZShmdW5jdGlvbiAocmVzb2x2ZSwgcmVqZWN0KSB7ICAocmVxdWlyZSBhcyBhbnkpLmVuc3VyZShbXSwgZnVuY3Rpb24gKHJlcXVpcmU6IGFueSkgeyAgICByZXNvbHZlKHJlcXVpcmUoJy4vdmlld3MvZGFzaGJvYXJkL2Rhc2hib2FyZC5tb2R1bGUnKVsnRGFzaGJvYXJkTW9kdWxlJ10pOyAgfSwgZnVuY3Rpb24oKSB7ICAgIHJlamVjdCh7IGxvYWRDaHVua0Vycm9yOiB0cnVlIH0pOyAgfSk7fSkgfVxuICAgICAgICAgICAgfVxuICAgICAgICBdXG4gICAgfVxuXTtcblxuQE5nTW9kdWxlKHtcbiAgICBpbXBvcnRzOiBbUm91dGVyTW9kdWxlLmZvclJvb3Qocm91dGVzKV0sXG4gICAgZXhwb3J0czogW1JvdXRlck1vZHVsZV1cbn0pXG5leHBvcnQgY2xhc3MgQXBwUm91dGluZ01vZHVsZSB7fVxuIl0sInNvdXJjZVJvb3QiOiIifQ==\n//# sourceURL=webpack-internal:///./src/main/webapp/app/app.routing.ts\n");

/***/ })

})