(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-public-login"],{1156:function(t,e,n){"use strict";var r=n("288e");Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0,n("96cf");var i=r(n("3b8d")),o=r(n("cebc")),a=n("2f62"),c={data:function(){return{checked:!1,mobile:"",password:"",logining:!1,navigatorPath:""}},onLoad:function(t){this.navigatorPath=t.path},methods:(0,o.default)({},(0,a.mapMutations)(["login"]),{navTo:function(t){uni.navigateTo({url:t})},changeCheck:function(){1==this.checked?this.checked=!1:this.checked=!0},inputChange:function(t){var e=t.currentTarget.dataset.key;this[e]=t.detail.value},navBack:function(){uni.navigateBack(this.navigatorPath)},toRegist:function(){uni.navigateTo({url:"/pages/public/regist"})},toLogin:function(){var t=(0,i.default)(regeneratorRuntime.mark(function t(){var e,n;return regeneratorRuntime.wrap(function(t){while(1)switch(t.prev=t.next){case 0:this.logining=!0,this.mobile,this.password,e={mobile:this.mobile,code:this.password},n=this,n.$http({method:"POST",data:e,url:n.global.target+"/wx/auth/login"}).then(function(t){var e=t.data;console.log(e),0==e.errno?(n.login(e.data),uni.navigateBack()):(n.$api.msg(e.errmsg),n.logining=!0)},function(t){});case 5:case"end":return t.stop()}},t,this)}));function e(){return t.apply(this,arguments)}return e}(),toGetVerifyCode:function(){var t=(0,i.default)(regeneratorRuntime.mark(function t(){var e,n;return regeneratorRuntime.wrap(function(t){while(1)switch(t.prev=t.next){case 0:if(""!=this.mobile){t.next=3;break}return this.$api.msg("请输入手机号"),t.abrupt("return");case 3:e=this,n={mobile:this.mobile},e.$http({method:"POST",data:n,url:e.global.target+"/wx/auth/regCaptcha"}).then(function(t){var n=t.data;console.log(n),0==n.errno?e.$api.msg("已经发送验证码到手机，请注意查收，收到后回写进行登录"):e.$api.msg(n.errmsg)},function(t){});case 6:case"end":return t.stop()}},t,this)}));function e(){return t.apply(this,arguments)}return e}()})};e.default=c},"3b8d":function(t,e,n){"use strict";n.r(e),n.d(e,"default",function(){return a});var r=n("795b"),i=n.n(r);function o(t,e,n,r,o,a,c){try{var u=t[a](c),s=u.value}catch(l){return void n(l)}u.done?e(s):i.a.resolve(s).then(r,o)}function a(t){return function(){var e=this,n=arguments;return new i.a(function(r,i){var a=t.apply(e,n);function c(t){o(a,r,i,c,u,"next",t)}function u(t){o(a,r,i,c,u,"throw",t)}c(void 0)})}}},4343:function(t,e){t.exports="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABMAAAARCAYAAAA/mJfHAAAAiUlEQVQ4T6XUUQ2AMAxF0TsHSMABOEAK4AAcgRJwghVSAl9s3drtuztp8poXKHs9MAKrNh7KLE5gADZgTv0pxRp4wE4DSzFZJgtasCxoxVTQgyVBLxYFazABW+B6T2WuwSTdA5CD3oHJi/0g2c6DRSEPloSsmApZsCxkwb7WeFKrbQ2JX5BFq6wbLxwfcnnONpQAAAAASUVORK5CYII="},6516:function(t,e,n){t.exports=n.p+"static/img/login.2d8e95cf.png"},"8edf":function(t,e,n){"use strict";n.r(e);var r=n("e514"),i=n("ceee");for(var o in i)"default"!==o&&function(t){n.d(e,t,function(){return i[t]})}(o);n("c0c2");var a,c=n("f0c5"),u=Object(c["a"])(i["default"],r["b"],r["c"],!1,null,"01a65b0e",null,!1,r["a"],a);e["default"]=u.exports},"96cf":function(t,e){!function(e){"use strict";var n,r=Object.prototype,i=r.hasOwnProperty,o="function"===typeof Symbol?Symbol:{},a=o.iterator||"@@iterator",c=o.asyncIterator||"@@asyncIterator",u=o.toStringTag||"@@toStringTag",s="object"===typeof t,l=e.regeneratorRuntime;if(l)s&&(t.exports=l);else{l=e.regeneratorRuntime=s?t.exports:{},l.wrap=y;var f="suspendedStart",h="suspendedYield",d="executing",p="completed",g={},v={};v[a]=function(){return this};var b=Object.getPrototypeOf,m=b&&b(b(j([])));m&&m!==r&&i.call(m,a)&&(v=m);var w=_.prototype=k.prototype=Object.create(v);A.prototype=w.constructor=_,_.constructor=A,_[u]=A.displayName="GeneratorFunction",l.isGeneratorFunction=function(t){var e="function"===typeof t&&t.constructor;return!!e&&(e===A||"GeneratorFunction"===(e.displayName||e.name))},l.mark=function(t){return Object.setPrototypeOf?Object.setPrototypeOf(t,_):(t.__proto__=_,u in t||(t[u]="GeneratorFunction")),t.prototype=Object.create(w),t},l.awrap=function(t){return{__await:t}},E(L.prototype),L.prototype[c]=function(){return this},l.AsyncIterator=L,l.async=function(t,e,n,r){var i=new L(y(t,e,n,r));return l.isGeneratorFunction(e)?i:i.next().then(function(t){return t.done?t.value:i.next()})},E(w),w[u]="Generator",w[a]=function(){return this},w.toString=function(){return"[object Generator]"},l.keys=function(t){var e=[];for(var n in t)e.push(n);return e.reverse(),function n(){while(e.length){var r=e.pop();if(r in t)return n.value=r,n.done=!1,n}return n.done=!0,n}},l.values=j,T.prototype={constructor:T,reset:function(t){if(this.prev=0,this.next=0,this.sent=this._sent=n,this.done=!1,this.delegate=null,this.method="next",this.arg=n,this.tryEntries.forEach(S),!t)for(var e in this)"t"===e.charAt(0)&&i.call(this,e)&&!isNaN(+e.slice(1))&&(this[e]=n)},stop:function(){this.done=!0;var t=this.tryEntries[0],e=t.completion;if("throw"===e.type)throw e.arg;return this.rval},dispatchException:function(t){if(this.done)throw t;var e=this;function r(r,i){return c.type="throw",c.arg=t,e.next=r,i&&(e.method="next",e.arg=n),!!i}for(var o=this.tryEntries.length-1;o>=0;--o){var a=this.tryEntries[o],c=a.completion;if("root"===a.tryLoc)return r("end");if(a.tryLoc<=this.prev){var u=i.call(a,"catchLoc"),s=i.call(a,"finallyLoc");if(u&&s){if(this.prev<a.catchLoc)return r(a.catchLoc,!0);if(this.prev<a.finallyLoc)return r(a.finallyLoc)}else if(u){if(this.prev<a.catchLoc)return r(a.catchLoc,!0)}else{if(!s)throw new Error("try statement without catch or finally");if(this.prev<a.finallyLoc)return r(a.finallyLoc)}}}},abrupt:function(t,e){for(var n=this.tryEntries.length-1;n>=0;--n){var r=this.tryEntries[n];if(r.tryLoc<=this.prev&&i.call(r,"finallyLoc")&&this.prev<r.finallyLoc){var o=r;break}}o&&("break"===t||"continue"===t)&&o.tryLoc<=e&&e<=o.finallyLoc&&(o=null);var a=o?o.completion:{};return a.type=t,a.arg=e,o?(this.method="next",this.next=o.finallyLoc,g):this.complete(a)},complete:function(t,e){if("throw"===t.type)throw t.arg;return"break"===t.type||"continue"===t.type?this.next=t.arg:"return"===t.type?(this.rval=this.arg=t.arg,this.method="return",this.next="end"):"normal"===t.type&&e&&(this.next=e),g},finish:function(t){for(var e=this.tryEntries.length-1;e>=0;--e){var n=this.tryEntries[e];if(n.finallyLoc===t)return this.complete(n.completion,n.afterLoc),S(n),g}},catch:function(t){for(var e=this.tryEntries.length-1;e>=0;--e){var n=this.tryEntries[e];if(n.tryLoc===t){var r=n.completion;if("throw"===r.type){var i=r.arg;S(n)}return i}}throw new Error("illegal catch attempt")},delegateYield:function(t,e,r){return this.delegate={iterator:j(t),resultName:e,nextLoc:r},"next"===this.method&&(this.arg=n),g}}}function y(t,e,n,r){var i=e&&e.prototype instanceof k?e:k,o=Object.create(i.prototype),a=new T(r||[]);return o._invoke=C(t,n,a),o}function x(t,e,n){try{return{type:"normal",arg:t.call(e,n)}}catch(r){return{type:"throw",arg:r}}}function k(){}function A(){}function _(){}function E(t){["next","throw","return"].forEach(function(e){t[e]=function(t){return this._invoke(e,t)}})}function L(t){function e(n,r,o,a){var c=x(t[n],t,r);if("throw"!==c.type){var u=c.arg,s=u.value;return s&&"object"===typeof s&&i.call(s,"__await")?Promise.resolve(s.__await).then(function(t){e("next",t,o,a)},function(t){e("throw",t,o,a)}):Promise.resolve(s).then(function(t){u.value=t,o(u)},function(t){return e("throw",t,o,a)})}a(c.arg)}var n;function r(t,r){function i(){return new Promise(function(n,i){e(t,r,n,i)})}return n=n?n.then(i,i):i()}this._invoke=r}function C(t,e,n){var r=f;return function(i,o){if(r===d)throw new Error("Generator is already running");if(r===p){if("throw"===i)throw o;return $()}n.method=i,n.arg=o;while(1){var a=n.delegate;if(a){var c=z(a,n);if(c){if(c===g)continue;return c}}if("next"===n.method)n.sent=n._sent=n.arg;else if("throw"===n.method){if(r===f)throw r=p,n.arg;n.dispatchException(n.arg)}else"return"===n.method&&n.abrupt("return",n.arg);r=d;var u=x(t,e,n);if("normal"===u.type){if(r=n.done?p:h,u.arg===g)continue;return{value:u.arg,done:n.done}}"throw"===u.type&&(r=p,n.method="throw",n.arg=u.arg)}}}function z(t,e){var r=t.iterator[e.method];if(r===n){if(e.delegate=null,"throw"===e.method){if(t.iterator.return&&(e.method="return",e.arg=n,z(t,e),"throw"===e.method))return g;e.method="throw",e.arg=new TypeError("The iterator does not provide a 'throw' method")}return g}var i=x(r,t.iterator,e.arg);if("throw"===i.type)return e.method="throw",e.arg=i.arg,e.delegate=null,g;var o=i.arg;return o?o.done?(e[t.resultName]=o.value,e.next=t.nextLoc,"return"!==e.method&&(e.method="next",e.arg=n),e.delegate=null,g):o:(e.method="throw",e.arg=new TypeError("iterator result is not an object"),e.delegate=null,g)}function O(t){var e={tryLoc:t[0]};1 in t&&(e.catchLoc=t[1]),2 in t&&(e.finallyLoc=t[2],e.afterLoc=t[3]),this.tryEntries.push(e)}function S(t){var e=t.completion||{};e.type="normal",delete e.arg,t.completion=e}function T(t){this.tryEntries=[{tryLoc:"root"}],t.forEach(O,this),this.reset(!0)}function j(t){if(t){var e=t[a];if(e)return e.call(t);if("function"===typeof t.next)return t;if(!isNaN(t.length)){var r=-1,o=function e(){while(++r<t.length)if(i.call(t,r))return e.value=t[r],e.done=!1,e;return e.value=n,e.done=!0,e};return o.next=o}}return{next:$}}function $(){return{value:n,done:!0}}}(function(){return this||"object"===typeof self&&self}()||Function("return this")())},b041:function(t,e){t.exports=function(t){return"string"!==typeof t?t:(/^['"].*['"]$/.test(t)&&(t=t.slice(1,-1)),/["'() \t\n]/.test(t)?'"'+t.replace(/"/g,'\\"').replace(/\n/g,"\\n")+'"':t)}},c0c2:function(t,e,n){"use strict";var r=n("c960"),i=n.n(r);i.a},c960:function(t,e,n){var r=n("fa91");"string"===typeof r&&(r=[[t.i,r,""]]),r.locals&&(t.exports=r.locals);var i=n("4f06").default;i("3f61ecea",r,!0,{sourceMap:!1,shadowMode:!1})},ceee:function(t,e,n){"use strict";n.r(e);var r=n("1156"),i=n.n(r);for(var o in r)"default"!==o&&function(t){n.d(e,t,function(){return r[t]})}(o);e["default"]=i.a},e514:function(t,e,n){"use strict";var r,i=function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("v-uni-view",{staticClass:"container"},[n("v-uni-view",{staticClass:"left-bottom-sign"}),n("v-uni-view",{staticClass:"wrapper"},[n("v-uni-view",{staticClass:"login_top"},[n("v-uni-image",{staticClass:"airplane_img",attrs:{src:"../../static/newimg/loginbtn.png",mode:""}}),n("v-uni-view",{},[t._v("欢迎登录会员中心！")]),n("v-uni-view",{staticClass:"Welcome"},[t._v("Welcome!")])],1),n("v-uni-view",{staticClass:"input-content"},[n("v-uni-view",{staticClass:"input-item"},[n("v-uni-text",{staticClass:"tit"},[t._v("+86")]),n("v-uni-view",{staticClass:"arrow_img"}),n("v-uni-input",{attrs:{type:"number",value:t.mobile,placeholder:"请输入手机号码",maxlength:"11","data-key":"mobile"},on:{input:function(e){arguments[0]=e=t.$handleEvent(e),t.inputChange.apply(void 0,arguments)}}})],1),n("v-uni-view",{staticStyle:{display:"flex","margin-bottom":"120upx"}},[n("v-uni-input",{staticStyle:{"margin-top":"50upx"},attrs:{type:"number",value:t.password,placeholder:"请输入手机验证码",maxlength:"11","data-key":"password"},on:{input:function(e){arguments[0]=e=t.$handleEvent(e),t.inputChange.apply(void 0,arguments)}}}),n("v-uni-button",{staticClass:"verify-btn",on:{click:function(e){arguments[0]=e=t.$handleEvent(e),t.toGetVerifyCode.apply(void 0,arguments)}}},[t._v("获取验证码")])],1),n("v-uni-button",{staticClass:"confirm-btn",attrs:{disabled:!t.checked},on:{click:function(e){arguments[0]=e=t.$handleEvent(e),t.toLogin.apply(void 0,arguments)}}},[t._v("登录")]),n("v-uni-view",{staticClass:"register-section"},[n("v-uni-view",{staticClass:"explain"},[n("v-uni-checkbox",{attrs:{checked:t.checked},on:{click:function(e){arguments[0]=e=t.$handleEvent(e),t.changeCheck()}}}),t._v("使用本站即代表您已同意掌上商城"),n("v-uni-text",{staticClass:"blue"},[t._v("用户协议、隐私政策")]),t._v("，并授权使用您的掌上商城账号信息（如昵称、头像、 收货地址）以便进行统一管理")],1)],1)],1)],1)],1)},o=[];n.d(e,"b",function(){return i}),n.d(e,"c",function(){return o}),n.d(e,"a",function(){return r})},fa91:function(t,e,n){var r=n("b041");e=t.exports=n("2350")(!1),e.push([t.i,'@charset "UTF-8";\n/* 页面左右间距 */\n/* 文字尺寸 */\n/*文字颜色*/\n/* 边框颜色 */\n/* 图片加载中颜色 */\n/* 行为相关颜色 */uni-page-body[data-v-01a65b0e]{background:#fff}.container[data-v-01a65b0e]{padding-top:%?40?%;position:relative;width:100vw;height:100vh;overflow:hidden;background:url('+r(n("6516"))+") no-repeat;background-size:103% auto}.wrapper[data-v-01a65b0e]{position:relative;z-index:90;\n  /* background: #fff; */padding-bottom:%?40?%}.login_top[data-v-01a65b0e]{position:relative;color:#fff;font-size:%?40?%;padding:%?69?% 0 0 %?27?%;box-sizing:border-box}.login_top .airplane_img[data-v-01a65b0e]{position:absolute;top:0;right:%?61?%;width:%?417?%;height:%?120?%}.login_top .Welcome[data-v-01a65b0e]{margin:%?23?% 0 0;font-weight:100}.back-btn[data-v-01a65b0e]{position:absolute;left:%?40?%;z-index:9999;padding-top:0;top:%?40?%;font-size:%?40?%;color:#303133}.left-top-sign[data-v-01a65b0e]{font-size:%?120?%;color:#f8f8f8;position:relative;left:%?-16?%}.right-top-sign[data-v-01a65b0e]{position:absolute;top:%?80?%;right:%?-30?%;z-index:95}.right-top-sign[data-v-01a65b0e]:before{-webkit-transform:rotate(50deg);transform:rotate(50deg);border-radius:0 50px 0 0}.right-top-sign[data-v-01a65b0e]:after{position:absolute;right:%?-198?%;top:0;-webkit-transform:rotate(-50deg);transform:rotate(-50deg);border-radius:50px 0 0 0\n    /* background: pink; */}.welcome[data-v-01a65b0e]{position:relative;left:%?50?%;top:%?-90?%;font-size:%?46?%;color:#555;text-shadow:1px 0 1px rgba(0,0,0,.3)}.input-content[data-v-01a65b0e]{margin:%?199?% auto 0;background:#fff;box-shadow:0 0 %?21?% 0 rgba(0,0,0,.1);border-radius:%?5?%;padding:%?60?% %?92?%;width:92.8%}.input-item[data-v-01a65b0e]{display:-webkit-box;display:-webkit-flex;display:flex;\n  /* flex-direction: column; */-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-box-pack:center;-webkit-justify-content:center;justify-content:center;\n  /* padding: 0 30upx; */\n  /* background: $page-color-light; */height:%?64?%;\n  /* border-radius: 4px; */margin-bottom:%?24?%;border-bottom:1px solid #b4b4b4}.input-item[data-v-01a65b0e]:last-child{margin-bottom:0}.input-item .tit[data-v-01a65b0e]{height:%?50?%;line-height:%?56?%;\n    /* font-size: $font-sm+2upx; */font-size:%?44?%\n    /* margin:0 10upx 0 0; */\n    /* color: $font-color-base; */}.input-item uni-input[data-v-01a65b0e]{height:%?60?%;font-size:%?30?%;color:#303133;\n    /* width: 100%; */-webkit-box-flex:1;-webkit-flex:1;flex:1}.input-item .arrow_img[data-v-01a65b0e]{width:%?25?%;height:%?25?%;background:url("+r(n("4343"))+");background-size:100% 100%;margin:0 %?10?% 0 0}.confirm-btn[data-v-01a65b0e]{width:100%;height:%?73?%;line-height:%?73?%;border-radius:50px;margin-top:%?53?%;background:-webkit-linear-gradient(left,#f3780e,#fdb64a);background:linear-gradient(90deg,#f3780e,#fdb64a);color:#fff;font-size:%?27?%}.confirm-btn[data-v-01a65b0e]:after{border-radius:100px}.verify-btn[data-v-01a65b0e]{width:120px;height:%?73?%;line-height:%?73?%;border-radius:10px;margin-top:%?53?%;background:-webkit-linear-gradient(left,#f3780e,#fdb64a);background:linear-gradient(90deg,#f3780e,#fdb64a);color:#fff;font-size:%?27?%}.verify-btn[data-v-01a65b0e]:after{border-radius:100px}.forget-section[data-v-01a65b0e]{font-size:%?26?%;color:#4399fc;text-align:center;margin-top:%?40?%}.register-section[data-v-01a65b0e]{\n  /* position: absolute; */\n  /* left: 0; */\n  /* bottom: 50upx; */width:100%;font-size:%?26?%;color:#606266;\n  /* text-align: center; */overflow:hidden;margin:%?30?% 0 0}.register-section .forget-section[data-v-01a65b0e]{float:left;margin:0}.register-section uni-text[data-v-01a65b0e]{color:#4399fc;margin-left:%?10?%;float:right}.login_rule[data-v-01a65b0e]{position:absolute;padding:0 %?27?% %?65?%;bottom:0;color:#b4b4b4;font-size:%?17?%}.login_rule .blue[data-v-01a65b0e]{color:#3acebf}body.?%PAGE?%[data-v-01a65b0e]{background:#fff}",""])}}]);