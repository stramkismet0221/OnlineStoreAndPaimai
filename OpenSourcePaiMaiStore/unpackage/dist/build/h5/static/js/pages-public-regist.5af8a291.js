(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-public-regist"],{"1da1":function(t,e,n){"use strict";function r(t,e,n,r,i,o,a){try{var c=t[o](a),u=c.value}catch(s){return void n(s)}c.done?e(u):Promise.resolve(u).then(r,i)}function i(t){return function(){var e=this,n=arguments;return new Promise((function(i,o){var a=t.apply(e,n);function c(t){r(a,i,o,c,u,"next",t)}function u(t){r(a,i,o,c,u,"throw",t)}c(void 0)}))}}n("d3b7"),Object.defineProperty(e,"__esModule",{value:!0}),e.default=i},"1de5":function(t,e,n){"use strict";t.exports=function(t,e){return e||(e={}),t=t&&t.__esModule?t.default:t,"string"!==typeof t?t:(/^['"].*['"]$/.test(t)&&(t=t.slice(1,-1)),e.hash&&(t+=e.hash),/["'() \t\n]/.test(t)||e.needQuotes?'"'.concat(t.replace(/"/g,'\\"').replace(/\n/g,"\\n"),'"'):t)}},3838:function(t,e,n){var r=n("ec67");"string"===typeof r&&(r=[[t.i,r,""]]),r.locals&&(t.exports=r.locals);var i=n("4f06").default;i("738cb2af",r,!0,{sourceMap:!1,shadowMode:!1})},"4f4b":function(t,e,n){t.exports=n.p+"static/img/loginbtn.f27350fc.png"},"6ef9":function(t,e,n){t.exports=n.p+"static/img/login.2d8e95cf.png"},7539:function(t,e,n){"use strict";n.r(e);var r=n("c3cc"),i=n.n(r);for(var o in r)"default"!==o&&function(t){n.d(e,t,(function(){return r[t]}))}(o);e["default"]=i.a},"96cf":function(t,e){!function(e){"use strict";var n,r=Object.prototype,i=r.hasOwnProperty,o="function"===typeof Symbol?Symbol:{},a=o.iterator||"@@iterator",c=o.asyncIterator||"@@asyncIterator",u=o.toStringTag||"@@toStringTag",s="object"===typeof t,f=e.regeneratorRuntime;if(f)s&&(t.exports=f);else{f=e.regeneratorRuntime=s?t.exports:{},f.wrap=y;var l="suspendedStart",d="suspendedYield",p="executing",h="completed",g={},v={};v[a]=function(){return this};var b=Object.getPrototypeOf,m=b&&b(b(P([])));m&&m!==r&&i.call(m,a)&&(v=m);var w=A.prototype=k.prototype=Object.create(v);_.prototype=w.constructor=A,A.constructor=_,A[u]=_.displayName="GeneratorFunction",f.isGeneratorFunction=function(t){var e="function"===typeof t&&t.constructor;return!!e&&(e===_||"GeneratorFunction"===(e.displayName||e.name))},f.mark=function(t){return Object.setPrototypeOf?Object.setPrototypeOf(t,A):(t.__proto__=A,u in t||(t[u]="GeneratorFunction")),t.prototype=Object.create(w),t},f.awrap=function(t){return{__await:t}},E(L.prototype),L.prototype[c]=function(){return this},f.AsyncIterator=L,f.async=function(t,e,n,r){var i=new L(y(t,e,n,r));return f.isGeneratorFunction(e)?i:i.next().then((function(t){return t.done?t.value:i.next()}))},E(w),w[u]="Generator",w[a]=function(){return this},w.toString=function(){return"[object Generator]"},f.keys=function(t){var e=[];for(var n in t)e.push(n);return e.reverse(),function n(){while(e.length){var r=e.pop();if(r in t)return n.value=r,n.done=!1,n}return n.done=!0,n}},f.values=P,S.prototype={constructor:S,reset:function(t){if(this.prev=0,this.next=0,this.sent=this._sent=n,this.done=!1,this.delegate=null,this.method="next",this.arg=n,this.tryEntries.forEach(j),!t)for(var e in this)"t"===e.charAt(0)&&i.call(this,e)&&!isNaN(+e.slice(1))&&(this[e]=n)},stop:function(){this.done=!0;var t=this.tryEntries[0],e=t.completion;if("throw"===e.type)throw e.arg;return this.rval},dispatchException:function(t){if(this.done)throw t;var e=this;function r(r,i){return c.type="throw",c.arg=t,e.next=r,i&&(e.method="next",e.arg=n),!!i}for(var o=this.tryEntries.length-1;o>=0;--o){var a=this.tryEntries[o],c=a.completion;if("root"===a.tryLoc)return r("end");if(a.tryLoc<=this.prev){var u=i.call(a,"catchLoc"),s=i.call(a,"finallyLoc");if(u&&s){if(this.prev<a.catchLoc)return r(a.catchLoc,!0);if(this.prev<a.finallyLoc)return r(a.finallyLoc)}else if(u){if(this.prev<a.catchLoc)return r(a.catchLoc,!0)}else{if(!s)throw new Error("try statement without catch or finally");if(this.prev<a.finallyLoc)return r(a.finallyLoc)}}}},abrupt:function(t,e){for(var n=this.tryEntries.length-1;n>=0;--n){var r=this.tryEntries[n];if(r.tryLoc<=this.prev&&i.call(r,"finallyLoc")&&this.prev<r.finallyLoc){var o=r;break}}o&&("break"===t||"continue"===t)&&o.tryLoc<=e&&e<=o.finallyLoc&&(o=null);var a=o?o.completion:{};return a.type=t,a.arg=e,o?(this.method="next",this.next=o.finallyLoc,g):this.complete(a)},complete:function(t,e){if("throw"===t.type)throw t.arg;return"break"===t.type||"continue"===t.type?this.next=t.arg:"return"===t.type?(this.rval=this.arg=t.arg,this.method="return",this.next="end"):"normal"===t.type&&e&&(this.next=e),g},finish:function(t){for(var e=this.tryEntries.length-1;e>=0;--e){var n=this.tryEntries[e];if(n.finallyLoc===t)return this.complete(n.completion,n.afterLoc),j(n),g}},catch:function(t){for(var e=this.tryEntries.length-1;e>=0;--e){var n=this.tryEntries[e];if(n.tryLoc===t){var r=n.completion;if("throw"===r.type){var i=r.arg;j(n)}return i}}throw new Error("illegal catch attempt")},delegateYield:function(t,e,r){return this.delegate={iterator:P(t),resultName:e,nextLoc:r},"next"===this.method&&(this.arg=n),g}}}function y(t,e,n,r){var i=e&&e.prototype instanceof k?e:k,o=Object.create(i.prototype),a=new S(r||[]);return o._invoke=C(t,n,a),o}function x(t,e,n){try{return{type:"normal",arg:t.call(e,n)}}catch(r){return{type:"throw",arg:r}}}function k(){}function _(){}function A(){}function E(t){["next","throw","return"].forEach((function(e){t[e]=function(t){return this._invoke(e,t)}}))}function L(t){function e(n,r,o,a){var c=x(t[n],t,r);if("throw"!==c.type){var u=c.arg,s=u.value;return s&&"object"===typeof s&&i.call(s,"__await")?Promise.resolve(s.__await).then((function(t){e("next",t,o,a)}),(function(t){e("throw",t,o,a)})):Promise.resolve(s).then((function(t){u.value=t,o(u)}),(function(t){return e("throw",t,o,a)}))}a(c.arg)}var n;function r(t,r){function i(){return new Promise((function(n,i){e(t,r,n,i)}))}return n=n?n.then(i,i):i()}this._invoke=r}function C(t,e,n){var r=l;return function(i,o){if(r===p)throw new Error("Generator is already running");if(r===h){if("throw"===i)throw o;return T()}n.method=i,n.arg=o;while(1){var a=n.delegate;if(a){var c=z(a,n);if(c){if(c===g)continue;return c}}if("next"===n.method)n.sent=n._sent=n.arg;else if("throw"===n.method){if(r===l)throw r=h,n.arg;n.dispatchException(n.arg)}else"return"===n.method&&n.abrupt("return",n.arg);r=p;var u=x(t,e,n);if("normal"===u.type){if(r=n.done?h:d,u.arg===g)continue;return{value:u.arg,done:n.done}}"throw"===u.type&&(r=h,n.method="throw",n.arg=u.arg)}}}function z(t,e){var r=t.iterator[e.method];if(r===n){if(e.delegate=null,"throw"===e.method){if(t.iterator.return&&(e.method="return",e.arg=n,z(t,e),"throw"===e.method))return g;e.method="throw",e.arg=new TypeError("The iterator does not provide a 'throw' method")}return g}var i=x(r,t.iterator,e.arg);if("throw"===i.type)return e.method="throw",e.arg=i.arg,e.delegate=null,g;var o=i.arg;return o?o.done?(e[t.resultName]=o.value,e.next=t.nextLoc,"return"!==e.method&&(e.method="next",e.arg=n),e.delegate=null,g):o:(e.method="throw",e.arg=new TypeError("iterator result is not an object"),e.delegate=null,g)}function O(t){var e={tryLoc:t[0]};1 in t&&(e.catchLoc=t[1]),2 in t&&(e.finallyLoc=t[2],e.afterLoc=t[3]),this.tryEntries.push(e)}function j(t){var e=t.completion||{};e.type="normal",delete e.arg,t.completion=e}function S(t){this.tryEntries=[{tryLoc:"root"}],t.forEach(O,this),this.reset(!0)}function P(t){if(t){var e=t[a];if(e)return e.call(t);if("function"===typeof t.next)return t;if(!isNaN(t.length)){var r=-1,o=function e(){while(++r<t.length)if(i.call(t,r))return e.value=t[r],e.done=!1,e;return e.value=n,e.done=!0,e};return o.next=o}}return{next:T}}function T(){return{value:n,done:!0}}}(function(){return this||"object"===typeof self&&self}()||Function("return this")())},a990:function(t,e,n){"use strict";n.r(e);var r=n("ac6f"),i=n("7539");for(var o in i)"default"!==o&&function(t){n.d(e,t,(function(){return i[t]}))}(o);n("f457");var a,c=n("f0c5"),u=Object(c["a"])(i["default"],r["b"],r["c"],!1,null,"4fb001ec",null,!1,r["a"],a);e["default"]=u.exports},ac6f:function(t,e,n){"use strict";var r;n.d(e,"b",(function(){return i})),n.d(e,"c",(function(){return o})),n.d(e,"a",(function(){return r}));var i=function(){var t=this,e=t.$createElement,r=t._self._c||e;return r("v-uni-view",{staticClass:"container"},[r("v-uni-view",{staticClass:"left-bottom-sign"}),r("v-uni-view",{staticClass:"right-top-sign"}),r("v-uni-view",{staticClass:"wrapper"},[r("v-uni-view",{staticClass:"login_top"},[r("v-uni-image",{staticClass:"airplane_img",attrs:{src:n("4f4b"),mode:""}}),r("v-uni-view",{},[t._v("欢迎注册会员中心！")]),r("v-uni-view",{staticClass:"Welcome"},[t._v("Welcome!")])],1),r("v-uni-view",{staticClass:"input-content"},[r("v-uni-view",{staticClass:"input-item"},[r("v-uni-text",{staticClass:"tit"},[t._v("+86")]),r("v-uni-view",{staticClass:"arrow_img"}),r("v-uni-input",{attrs:{type:"number",value:t.mobile,placeholder:"请输入手机号码",maxlength:"11","data-key":"mobile"},on:{input:function(e){arguments[0]=e=t.$handleEvent(e),t.inputChange.apply(void 0,arguments)}}})],1),r("v-uni-view",{staticClass:"input-item"},[r("v-uni-input",{attrs:{type:"mobile",value:"",placeholder:"8-18位不含特殊字符的数字、字母组合","placeholder-class":"input-empty",maxlength:"20",password:!0,"data-key":"password"},on:{input:function(e){arguments[0]=e=t.$handleEvent(e),t.inputChange.apply(void 0,arguments)},confirm:function(e){arguments[0]=e=t.$handleEvent(e),t.toLogin.apply(void 0,arguments)}}})],1),r("v-uni-button",{staticClass:"confirm-btn",attrs:{disabled:t.logining},on:{click:function(e){arguments[0]=e=t.$handleEvent(e),t.toRegist.apply(void 0,arguments)}}},[t._v("立即注册")])],1)],1),r("v-uni-view",{staticClass:"login_rule"},[t._v("您已同意掌上商城"),r("v-uni-text",{staticClass:"blue"},[t._v("用户协议、隐私政策")]),t._v("，并授权使用您的掌上商城账号信息（如昵称、头像、 收货地址）以便进行统一管理")],1)],1)},o=[]},c3cc:function(t,e,n){"use strict";var r=n("4ea4");Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0,n("96cf");var i=r(n("1da1")),o=r(n("5530")),a=n("2f62"),c={data:function(){return{mobile:"",password:"",logining:!1}},onLoad:function(){},methods:(0,o.default)((0,o.default)({},(0,a.mapMutations)(["login"])),{},{inputChange:function(t){var e=t.currentTarget.dataset.key;this[e]=t.detail.value},navBack:function(){uni.navigateBack()},toRegist:function(){var t=this;return(0,i.default)(regeneratorRuntime.mark((function e(){var n,r,i,o;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:t.logining=!0,n=t.mobile,r=t.password,i={mobile:n,password:r},o=t,o.$http({method:"POST",data:i,url:t.global.target+"/wx/auth/register"}).then((function(t){var e=t.data;console.log(e),0==e.errno?(o.$api.msg("注册成功！"),uni.navigateBack()):(o.$api.msg(e.errmsg),o.logining=!1)}),(function(t){}));case 5:case"end":return e.stop()}}),e)})))()}})};e.default=c},dc7a:function(t,e){t.exports="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABMAAAARCAYAAAA/mJfHAAAAiUlEQVQ4T6XUUQ2AMAxF0TsHSMABOEAK4AAcgRJwghVSAl9s3drtuztp8poXKHs9MAKrNh7KLE5gADZgTv0pxRp4wE4DSzFZJgtasCxoxVTQgyVBLxYFazABW+B6T2WuwSTdA5CD3oHJi/0g2c6DRSEPloSsmApZsCxkwb7WeFKrbQ2JX5BFq6wbLxwfcnnONpQAAAAASUVORK5CYII="},ec67:function(t,e,n){var r=n("24fb"),i=n("1de5"),o=n("6ef9"),a=n("dc7a");e=r(!1);var c=i(o),u=i(a);e.push([t.i,'@charset "UTF-8";\n/* 页面左右间距 */\n/* 文字尺寸 */\n/*文字颜色*/\n/* 边框颜色 */\n/* 图片加载中颜色 */\n/* 行为相关颜色 */uni-page-body[data-v-4fb001ec]{background:#fff}.container[data-v-4fb001ec]{padding-top:%?40?%;position:relative;width:100vw;height:100vh;overflow:hidden;background:url('+c+") no-repeat;background-size:103% auto}.wrapper[data-v-4fb001ec]{position:relative;z-index:90;\n  /* background: #fff; */padding-bottom:%?40?%}.login_top[data-v-4fb001ec]{position:relative;color:#fff;font-size:%?40?%;padding:%?69?% 0 0 %?27?%;box-sizing:border-box}.login_top .airplane_img[data-v-4fb001ec]{position:absolute;top:0;right:%?61?%;width:%?417?%;height:%?120?%}.login_top .Welcome[data-v-4fb001ec]{margin:%?23?% 0 0;font-weight:100}.back-btn[data-v-4fb001ec]{position:absolute;left:%?40?%;z-index:9999;padding-top:0;top:%?40?%;font-size:%?40?%;color:#303133}.left-top-sign[data-v-4fb001ec]{font-size:%?120?%;color:#f8f8f8;position:relative;left:%?-16?%}.right-top-sign[data-v-4fb001ec]{position:absolute;top:%?80?%;right:%?-30?%;z-index:95}.right-top-sign[data-v-4fb001ec]:before{-webkit-transform:rotate(50deg);transform:rotate(50deg);border-radius:0 50px 0 0}.right-top-sign[data-v-4fb001ec]:after{position:absolute;right:%?-198?%;top:0;-webkit-transform:rotate(-50deg);transform:rotate(-50deg);border-radius:50px 0 0 0\n  /* background: pink; */}.welcome[data-v-4fb001ec]{position:relative;left:%?50?%;top:%?-90?%;font-size:%?46?%;color:#555;text-shadow:1px 0 1px rgba(0,0,0,.3)}.input-content[data-v-4fb001ec]{margin:%?199?% auto 0;background:#fff;box-shadow:0 0 %?21?% 0 rgba(0,0,0,.1);border-radius:%?5?%;padding:%?60?% %?92?%;width:92.8%}.input-item[data-v-4fb001ec]{display:-webkit-box;display:-webkit-flex;display:flex;\n  /* flex-direction: column; */-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-box-pack:center;-webkit-justify-content:center;justify-content:center;\n  /* padding: 0 30upx; */\n  /* background: $page-color-light; */height:%?64?%;\n  /* border-radius: 4px; */margin-bottom:%?24?%;border-bottom:1px solid #b4b4b4}.input-item[data-v-4fb001ec]:last-child{margin-bottom:0}.input-item .tit[data-v-4fb001ec]{height:%?50?%;line-height:%?56?%;\n  /* font-size: $font-sm+2upx; */font-size:%?44?%\n  /* margin:0 10upx 0 0; */\n  /* color: $font-color-base; */}.input-item uni-input[data-v-4fb001ec]{height:%?60?%;font-size:%?27?%;color:#303133;\n  /* width: 100%; */-webkit-box-flex:1;-webkit-flex:1;flex:1}.input-item .arrow_img[data-v-4fb001ec]{width:%?25?%;height:%?25?%;background:url("+u+");background-size:100% 100%;margin:0 %?10?% 0 0}.confirm-btn[data-v-4fb001ec]{width:100%;height:%?73?%;line-height:%?73?%;border-radius:50px;margin-top:%?53?%;background:-webkit-linear-gradient(left,#f3780e,#fdb64a);background:linear-gradient(90deg,#f3780e,#fdb64a);color:#fff;font-size:%?27?%}.confirm-btn[data-v-4fb001ec]:after{border-radius:100px}.forget-section[data-v-4fb001ec]{font-size:%?26?%;color:#4399fc;text-align:center;margin-top:%?40?%}.register-section[data-v-4fb001ec]{\n  /* position:absolute;\n\tleft: 0;\n\tbottom: 50upx; */width:100%;font-size:%?26?%;color:#606266;overflow:hidden;margin:%?30?% 0 0}.register-section uni-text[data-v-4fb001ec]{color:#4399fc;margin-left:%?10?%}.login_rule[data-v-4fb001ec]{position:absolute;padding:0 %?27?% %?65?%;bottom:0;color:#b4b4b4;font-size:%?17?%}.login_rule .blue[data-v-4fb001ec]{color:#3acebf}body.?%PAGE?%[data-v-4fb001ec]{background:#fff}",""]),t.exports=e},f457:function(t,e,n){"use strict";var r=n("3838"),i=n.n(r);i.a}}]);