(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-order-orderdetail"],{"0420":function(t,o,e){"use strict";var a=e("288e");Object.defineProperty(o,"__esModule",{value:!0}),o.default=void 0,e("a481"),e("96cf");var i=a(e("3b8d"));e("6b54");var n={data:function(){return{orderId:0,goods:{},goodslist:[],goodscount:{},contentTime:""}},created:function(){var t=this.goods.maitime-Math.round((new Date).getTime()/1e3).toString(),o=Math.floor(t/86400),e=(t-3600*o*24)/3600,a=(e>23?o+1:o)+"天"+(e>23?0:Math.ceil(e))+"分";this.contentTime=a},onLoad:function(){var t=(0,i.default)(regeneratorRuntime.mark(function t(o){var e;return regeneratorRuntime.wrap(function(t){while(1)switch(t.prev=t.next){case 0:e=o.id,this.orderId=e,this.loadData(e);case 3:case"end":return t.stop()}},t,this)}));function o(o){return t.apply(this,arguments)}return o}(),methods:{loadData:function(t){var o=this;o.$http({method:"GET",params:{orderId:t},url:this.global.target+"/wx/order/detail"}).then(function(t){var e=t.data.data;console.log(t);e.orderInfo.status;o.goods=e.orderInfo,console.log(o.goods);var a=Math.round(new Date(Date.parse(o.goods.addTime.replace(/-/g,"/"))).getTime()/1e3).toString(),i=Math.round((new Date).getTime()/1e3).toString()-a;console.log(i),o.$http({method:"GET",params:{},url:o.global.target+"/wx/config/unPayCancelMinutes"}).then(function(t){var e=t.data.data;null==e&&(e=30),i=Math.floor((60*e-i)/60),o.contentTime=i}),o.goodslist=e.orderGoods,o.goodscount=e.orderInfo2},function(t){})},copy:function(){wx.setClipboardData({data:"www.petout.cn",success:function(t){wx.getClipboardData({success:function(t){wx.showToast({title:"已复制到剪贴板"})}})}})},cancelOrder:function(t){var o=this;uni.showModal({title:"",content:"确认取消订单吗？",success:function(e){e.confirm?o.$http({method:"POST",params:{orderId:t.id},url:o.global.target+"/wx/order/cancel"}).then(function(e){var a=e.data;if(0==a.errno){a.data;o.loadData(t.id),this.loadData(o.orderId)}else o.$api.msg(a.errmsg)},function(t){}):e.cancel}})},navToDetailPage:function(t){var o=t.id;console.log(),uni.navigateTo({url:"/pages/product/product?id="+o})},orderTerminat:function(){var t=this,o=this.goods.id;uni.showModal({title:"",content:"确认已经收货？",success:function(e){e.confirm?t.$http({method:"POST",params:{orderId:o},url:t.global.target+"/wx/order/confirm"}).then(function(o){console.log(o.data);o.data;t.goods.status=401,t.goods.mai="已收货",this.loadData(t.orderId)},function(t){}):e.cancel&&console.log("用户点击取消")}})},tixingfahuo:function(){this.$api.msg("已通知商家")},refund:function(){var t=this,o=this.goods.id;t.$http({method:"POST",params:{orderId:o},url:this.global.target+"/wx/order/refund"}).then(function(e){var a=e.data;501!=a.errno&&502!=a.errno&&504!=a.errno&&725!=a.errno?t.loadData(o):t.$api.msg(a.errmsg)},function(t){})},topay:function(){var t=this.orderId,o=this.goodscount.pay,e=this.goodscount.ordernumber;uni.redirectTo({url:"/pages/money/pay?orderId="+t+"&pay="+o+"&ordersn="+e})}}};o.default=n},"10a8":function(t,o){t.exports="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAABa0lEQVRoQ93a0U3DMBDG8btMwCpR/A5swAaUCVihTEA3aNmADWAAn8IIbMAEySFLILUFWkjuO1/Jc2T/f2n9EMdMhlff92fjON4T0UJVX4joLqX0aDjFl6HYcvCc8xMzX+yNedN13cZynu2xzAAfT//th1AYwgxQwkVEDzxpCMIasCKiW0+EKaCE55w3zHzthTAHeCMgAE8EDOCFgAI8EHAAGuECQCLcACiEKwCBcAdYI6oALBHVAFaIqgALRHXAXEQIwBxEGMBURCjAFEQ4wG8QTdNctm37XO4NCTiGUNWHlNIiNEBE1mV/6btX0/CAQ/EFFPovdCyeiHa2Z0Ktgb/Gh1oDU+LDAKbGhwDMia8OmBtfFWARXw1gFV8FYBnvDrCOdwUg4t0AqHgXADIeDkDHQwEe8TCAVzwE4BlvDhCR0/7MetIfuv/LUYOyV3O+t5MAOWLwOYfpO3H5FYZhKOvgiplfVXWJPm7zDkP/CkDu65OkAAAAAElFTkSuQmCC"},"1e84":function(t,o,e){var a=e("b041");o=t.exports=e("2350")(!1),o.push([t.i,'@charset "UTF-8";\n/* 页面左右间距 */\n/* 文字尺寸 */\n/*文字颜色*/\n/* 边框颜色 */\n/* 图片加载中颜色 */\n/* 行为相关颜色 */.orderlist[data-v-047e6fa0]{background:#f2f2f2;height:120vh}.ol_top_mai[data-v-047e6fa0]{height:%?200?%;background:-webkit-linear-gradient(right,rgba(255,90,125,.99),rgba(255,182,198,.74));background:linear-gradient(right,rgba(255,90,125,.99),rgba(255,182,198,.74));color:#fff;padding:0 %?80?% 0 %?50?%;box-sizing:border-box}.ol_top_mai .ol_top_img[data-v-047e6fa0]{width:%?150?%;height:%?150?%}.ol_top_mai .ol_topm_top[data-v-047e6fa0]{font-size:%?40?%;line-height:%?60?%}.ol_top_mai .ol_topm_time[data-v-047e6fa0]{font-size:%?28?%}.ol_top_wuliu[data-v-047e6fa0]{border-bottom:1px solid #f2f2f2}.ol_top_wuliu[data-v-047e6fa0],\n.ol_top_address[data-v-047e6fa0]{background:#fff}.ol_top_wuliu .ol_topw_img[data-v-047e6fa0],\n  .ol_top_address .ol_topw_img[data-v-047e6fa0]{width:%?100?%;height:%?100?%;background:#ff5a7d;border-radius:100%;overflow:hidden}.ol_top_wuliu .icon_wuliu[data-v-047e6fa0],\n  .ol_top_address .icon_wuliu[data-v-047e6fa0]{width:%?80?%;height:%?80?%;margin:%?10?%}.ol_top_wuliu .ol_topw_status[data-v-047e6fa0],\n  .ol_top_address .ol_topw_status[data-v-047e6fa0]{padding:0 %?30?%;box-sizing:border-box;position:relative}.ol_top_wuliu .ol_top_wuliu .ol_topw_status[data-v-047e6fa0]::after{position:absolute;content:"";width:%?30?%;height:%?30?%;background:url('+a(e("10a8"))+');background-size:100% 100%;right:0;top:50%;-webkit-transform:translateY(-50%);transform:translateY(-50%)}.ol_top_wuliu .ol_topw_status .ol_topw_text[data-v-047e6fa0]{font-size:%?32?%;color:#ff5a7d;line-height:%?50?%}.ol_top_wuliu .ol_topw_status .ol_topw_time[data-v-047e6fa0]{font-size:%?28?%;color:#999}.ol_top_address .ol_topw_img[data-v-047e6fa0]{background:#007aff}.ol_top_address .ol_topw_status[data-v-047e6fa0]{padding:0 0 0 %?30?%}.ol_top_address .ol_topw_status .ol_topa_user[data-v-047e6fa0]{font-size:%?28?%;color:#999;line-height:%?50?%}.ol_top_address .ol_topw_status .ol_topa_user .name[data-v-047e6fa0]{font-size:%?32?%;color:#000;margin:0 %?30?% 0 0}.ol_top_address .ol_topw_status .ol_topa_text[data-v-047e6fa0]{font-size:%?32?%;line-height:%?50?%}.ol_goods[data-v-047e6fa0]{margin:%?20?% 0 0;background:#fff}.ol_goods .ol_goods_li[data-v-047e6fa0]{padding:%?30?%;box-sizing:border-box;margin:%?10?% 0 0}.ol_goods .ol_goods_li .ol_goodsimg[data-v-047e6fa0]{width:%?200?%;height:%?200?%;border-radius:%?10?%}.ol_goods .ol_goods_li .ol_goods_right[data-v-047e6fa0]{margin:0 0 0 %?20?%;line-height:%?50?%}.ol_goods .ol_goods_li .ol_goods_right .ol_goods_title[data-v-047e6fa0]{font-size:%?34?%;overflow:hidden;text-overflow:ellipsis;display:-webkit-box;-webkit-box-orient:vertical;-webkit-line-clamp:2}.ol_goods .ol_goods_li .ol_goods_right .ol_roogs_num[data-v-047e6fa0]{text-align:right}.ol_goods .ol_goods_li .ol_goods_right .price[data-v-047e6fa0]{font-size:%?32?%}.ol_goods .ol_goods_li .ol_goods_right .num[data-v-047e6fa0],\n  .ol_goods .ol_goods_li .ol_goods_right .ol_goods_size[data-v-047e6fa0]{font-size:%?28?%;color:#999}.ol_goods .ol_goods_li .ol_goods_right .ol_goods_other[data-v-047e6fa0]{font-size:%?24?%;color:#ff5a7d;background:#ffb6c6;padding:%?4?%}.ol_goods .ol_goods_li .ol_goods_right .ol_goods_back[data-v-047e6fa0]{width:%?166?%;height:%?56?%;font-size:%?30?%;color:#333;border-radius:%?50?%;line-height:%?56?%;text-align:center;border:1px solid #666;float:right}.ol_goods_count[data-v-047e6fa0],\n.ol_goods_pay[data-v-047e6fa0]{padding:%?20?% %?30?%;box-sizing:border-box}.ol_goods_count .ol_goodsc_gray[data-v-047e6fa0],\n  .ol_goods_count .ol_goodsp_top[data-v-047e6fa0],\n  .ol_goods_count .ol_goods_hong[data-v-047e6fa0],\n  .ol_goods_pay .ol_goodsc_gray[data-v-047e6fa0],\n  .ol_goods_pay .ol_goodsp_top[data-v-047e6fa0],\n  .ol_goods_pay .ol_goods_hong[data-v-047e6fa0]{font-size:%?28?%;color:#999;line-height:%?40?%}.ol_goods_count .right[data-v-047e6fa0],\n  .ol_goods_pay .right[data-v-047e6fa0]{float:right}.ol_goods_count .ol_goodsc_black[data-v-047e6fa0],\n  .ol_goods_count .ol_goods_paytrue[data-v-047e6fa0],\n  .ol_goods_pay .ol_goodsc_black[data-v-047e6fa0],\n  .ol_goods_pay .ol_goods_paytrue[data-v-047e6fa0]{font-size:%?32?%;color:#333;line-height:%?50?%}.ol_goods_count .ol_goods_hong[data-v-047e6fa0],\n  .ol_goods_count .ol_goodsp_top[data-v-047e6fa0],\n  .ol_goods_pay .ol_goods_hong[data-v-047e6fa0],\n  .ol_goods_pay .ol_goodsp_top[data-v-047e6fa0]{height:%?40?%}.ol_goods_count .ol_goods_hong[data-v-047e6fa0],\n  .ol_goods_pay .ol_goods_hong[data-v-047e6fa0]{color:#333}.ol_goods_count .red[data-v-047e6fa0],\n  .ol_goods_pay .red[data-v-047e6fa0]{color:#ff5a7d;font-size:%?40?%}.ol_goods_pay[data-v-047e6fa0]{background:#f9f9f9;position:relative;margin:%?10?% 0 0}.ol_goods_pay[data-v-047e6fa0]::after{position:absolute;content:"";width:%?0?%;border-bottom:%?20?% solid #f9f9f9;border-left:%?20?% solid transparent;border-right:%?20?% solid transparent;top:%?-20?%;right:%?60?%}.ol_goods_infos[data-v-047e6fa0]{margin:%?20?% 0 %?100?% 0;background:#fff;padding:%?20?% %?30?%;box-sizing:box-sizing}.ol_goods_infos .ol_goodsi_title[data-v-047e6fa0]{font-size:%?38?%;line-height:%?50?%;position:relative;text-indent:%?20?%}.ol_goods_infos .ol_goodsi_title[data-v-047e6fa0]::after{position:absolute;content:"";width:%?6?%;height:%?36?%;background:#ff5a7d;left:0;top:%?7?%}.ol_goods_infos .ol_goods_orderinfo[data-v-047e6fa0]{margin:%?10?%;line-height:%?60?%;font-size:%?28?%}.ol_goods_infos .copy[data-v-047e6fa0]{float:right;color:#ff5a7d}.ol_bottom[data-v-047e6fa0]{width:100vw;height:%?100?%;background:#fff;border-top:1px solid #f2f2f2;position:fixed;z-index:999;bottom:0;-webkit-box-pack:end;-webkit-justify-content:flex-end;justify-content:flex-end}.ol_bottom .ol_bottom_wuliu[data-v-047e6fa0],\n  .ol_bottom .ol_bottom_ok[data-v-047e6fa0]{width:%?200?%;height:%?58?%;font-size:%?28?%;line-height:%?58?%;margin:%?25?% %?20?%;border-radius:%?50?%;text-align:center}.ol_bottom .ol_bottom_wuliu[data-v-047e6fa0]{border:1px solid #666}.ol_bottom .ol_bottom_ok[data-v-047e6fa0]{color:#ff5a7d;border:1px solid #ff5a7d}.ol_top_mai[data-v-047e6fa0],\n.ol_top_wuliu[data-v-047e6fa0],\n.ol_top_address[data-v-047e6fa0],\n.ol_goods .ol_goods_li[data-v-047e6fa0],\n.ol_goods_right .ol_goods_info[data-v-047e6fa0],\n.ol_bottom[data-v-047e6fa0]{display:-webkit-box;display:-webkit-flex;display:flex}.ol_top_mai[data-v-047e6fa0]{-webkit-box-pack:justify;-webkit-justify-content:space-between;justify-content:space-between}.ol_top_mai[data-v-047e6fa0],\n.ol_top_wuliu[data-v-047e6fa0],\n.ol_top_address[data-v-047e6fa0]{-webkit-box-align:center;-webkit-align-items:center;align-items:center}.ol_top_wuliu .ol_topw_img[data-v-047e6fa0],\n.ol_top_address .ol_topw_img[data-v-047e6fa0],\n.ol_goods .ol_goods_li .ol_goodsimg[data-v-047e6fa0]{-webkit-flex-shrink:0;flex-shrink:0}.ol_top_wuliu[data-v-047e6fa0],\n.ol_top_address[data-v-047e6fa0]{padding:%?20?% %?30?%;box-sizing:border-box}',""])},"30ce":function(t,o,e){"use strict";var a=e("80e3"),i=e.n(a);i.a},"314e":function(t,o,e){"use strict";e.r(o);var a=e("a97f"),i=e("b848");for(var n in i)"default"!==n&&function(t){e.d(o,t,function(){return i[t]})}(n);e("30ce");var r,s=e("f0c5"),l=Object(s["a"])(i["default"],a["b"],a["c"],!1,null,"047e6fa0",null,!1,a["a"],r);o["default"]=l.exports},"3b8d":function(t,o,e){"use strict";e.r(o),e.d(o,"default",function(){return r});var a=e("795b"),i=e.n(a);function n(t,o,e,a,n,r,s){try{var l=t[r](s),d=l.value}catch(u){return void e(u)}l.done?o(d):i.a.resolve(d).then(a,n)}function r(t){return function(){var o=this,e=arguments;return new i.a(function(a,i){var r=t.apply(o,e);function s(t){n(r,a,i,s,l,"next",t)}function l(t){n(r,a,i,s,l,"throw",t)}s(void 0)})}}},"80e3":function(t,o,e){var a=e("1e84");"string"===typeof a&&(a=[[t.i,a,""]]),a.locals&&(t.exports=a.locals);var i=e("4f06").default;i("f4c61d8c",a,!0,{sourceMap:!1,shadowMode:!1})},"96cf":function(t,o){!function(o){"use strict";var e,a=Object.prototype,i=a.hasOwnProperty,n="function"===typeof Symbol?Symbol:{},r=n.iterator||"@@iterator",s=n.asyncIterator||"@@asyncIterator",l=n.toStringTag||"@@toStringTag",d="object"===typeof t,u=o.regeneratorRuntime;if(u)d&&(t.exports=u);else{u=o.regeneratorRuntime=d?t.exports:{},u.wrap=b;var c="suspendedStart",_="suspendedYield",f="executing",g="completed",v={},h={};h[r]=function(){return this};var p=Object.getPrototypeOf,w=p&&p(p(I([])));w&&w!==a&&i.call(w,r)&&(h=w);var m=k.prototype=x.prototype=Object.create(h);C.prototype=m.constructor=k,k.constructor=C,k[l]=C.displayName="GeneratorFunction",u.isGeneratorFunction=function(t){var o="function"===typeof t&&t.constructor;return!!o&&(o===C||"GeneratorFunction"===(o.displayName||o.name))},u.mark=function(t){return Object.setPrototypeOf?Object.setPrototypeOf(t,k):(t.__proto__=k,l in t||(t[l]="GeneratorFunction")),t.prototype=Object.create(m),t},u.awrap=function(t){return{__await:t}},A(E.prototype),E.prototype[s]=function(){return this},u.AsyncIterator=E,u.async=function(t,o,e,a){var i=new E(b(t,o,e,a));return u.isGeneratorFunction(o)?i:i.next().then(function(t){return t.done?t.value:i.next()})},A(m),m[l]="Generator",m[r]=function(){return this},m.toString=function(){return"[object Generator]"},u.keys=function(t){var o=[];for(var e in t)o.push(e);return o.reverse(),function e(){while(o.length){var a=o.pop();if(a in t)return e.value=a,e.done=!1,e}return e.done=!0,e}},u.values=I,D.prototype={constructor:D,reset:function(t){if(this.prev=0,this.next=0,this.sent=this._sent=e,this.done=!1,this.delegate=null,this.method="next",this.arg=e,this.tryEntries.forEach(O),!t)for(var o in this)"t"===o.charAt(0)&&i.call(this,o)&&!isNaN(+o.slice(1))&&(this[o]=e)},stop:function(){this.done=!0;var t=this.tryEntries[0],o=t.completion;if("throw"===o.type)throw o.arg;return this.rval},dispatchException:function(t){if(this.done)throw t;var o=this;function a(a,i){return s.type="throw",s.arg=t,o.next=a,i&&(o.method="next",o.arg=e),!!i}for(var n=this.tryEntries.length-1;n>=0;--n){var r=this.tryEntries[n],s=r.completion;if("root"===r.tryLoc)return a("end");if(r.tryLoc<=this.prev){var l=i.call(r,"catchLoc"),d=i.call(r,"finallyLoc");if(l&&d){if(this.prev<r.catchLoc)return a(r.catchLoc,!0);if(this.prev<r.finallyLoc)return a(r.finallyLoc)}else if(l){if(this.prev<r.catchLoc)return a(r.catchLoc,!0)}else{if(!d)throw new Error("try statement without catch or finally");if(this.prev<r.finallyLoc)return a(r.finallyLoc)}}}},abrupt:function(t,o){for(var e=this.tryEntries.length-1;e>=0;--e){var a=this.tryEntries[e];if(a.tryLoc<=this.prev&&i.call(a,"finallyLoc")&&this.prev<a.finallyLoc){var n=a;break}}n&&("break"===t||"continue"===t)&&n.tryLoc<=o&&o<=n.finallyLoc&&(n=null);var r=n?n.completion:{};return r.type=t,r.arg=o,n?(this.method="next",this.next=n.finallyLoc,v):this.complete(r)},complete:function(t,o){if("throw"===t.type)throw t.arg;return"break"===t.type||"continue"===t.type?this.next=t.arg:"return"===t.type?(this.rval=this.arg=t.arg,this.method="return",this.next="end"):"normal"===t.type&&o&&(this.next=o),v},finish:function(t){for(var o=this.tryEntries.length-1;o>=0;--o){var e=this.tryEntries[o];if(e.finallyLoc===t)return this.complete(e.completion,e.afterLoc),O(e),v}},catch:function(t){for(var o=this.tryEntries.length-1;o>=0;--o){var e=this.tryEntries[o];if(e.tryLoc===t){var a=e.completion;if("throw"===a.type){var i=a.arg;O(e)}return i}}throw new Error("illegal catch attempt")},delegateYield:function(t,o,a){return this.delegate={iterator:I(t),resultName:o,nextLoc:a},"next"===this.method&&(this.arg=e),v}}}function b(t,o,e,a){var i=o&&o.prototype instanceof x?o:x,n=Object.create(i.prototype),r=new D(a||[]);return n._invoke=T(t,e,r),n}function y(t,o,e){try{return{type:"normal",arg:t.call(o,e)}}catch(a){return{type:"throw",arg:a}}}function x(){}function C(){}function k(){}function A(t){["next","throw","return"].forEach(function(o){t[o]=function(t){return this._invoke(o,t)}})}function E(t){function o(e,a,n,r){var s=y(t[e],t,a);if("throw"!==s.type){var l=s.arg,d=l.value;return d&&"object"===typeof d&&i.call(d,"__await")?Promise.resolve(d.__await).then(function(t){o("next",t,n,r)},function(t){o("throw",t,n,r)}):Promise.resolve(d).then(function(t){l.value=t,n(l)},function(t){return o("throw",t,n,r)})}r(s.arg)}var e;function a(t,a){function i(){return new Promise(function(e,i){o(t,a,e,i)})}return e=e?e.then(i,i):i()}this._invoke=a}function T(t,o,e){var a=c;return function(i,n){if(a===f)throw new Error("Generator is already running");if(a===g){if("throw"===i)throw n;return P()}e.method=i,e.arg=n;while(1){var r=e.delegate;if(r){var s=L(r,e);if(s){if(s===v)continue;return s}}if("next"===e.method)e.sent=e._sent=e.arg;else if("throw"===e.method){if(a===c)throw a=g,e.arg;e.dispatchException(e.arg)}else"return"===e.method&&e.abrupt("return",e.arg);a=f;var l=y(t,o,e);if("normal"===l.type){if(a=e.done?g:_,l.arg===v)continue;return{value:l.arg,done:e.done}}"throw"===l.type&&(a=g,e.method="throw",e.arg=l.arg)}}}function L(t,o){var a=t.iterator[o.method];if(a===e){if(o.delegate=null,"throw"===o.method){if(t.iterator.return&&(o.method="return",o.arg=e,L(t,o),"throw"===o.method))return v;o.method="throw",o.arg=new TypeError("The iterator does not provide a 'throw' method")}return v}var i=y(a,t.iterator,o.arg);if("throw"===i.type)return o.method="throw",o.arg=i.arg,o.delegate=null,v;var n=i.arg;return n?n.done?(o[t.resultName]=n.value,o.next=t.nextLoc,"return"!==o.method&&(o.method="next",o.arg=e),o.delegate=null,v):n:(o.method="throw",o.arg=new TypeError("iterator result is not an object"),o.delegate=null,v)}function z(t){var o={tryLoc:t[0]};1 in t&&(o.catchLoc=t[1]),2 in t&&(o.finallyLoc=t[2],o.afterLoc=t[3]),this.tryEntries.push(o)}function O(t){var o=t.completion||{};o.type="normal",delete o.arg,t.completion=o}function D(t){this.tryEntries=[{tryLoc:"root"}],t.forEach(z,this),this.reset(!0)}function I(t){if(t){var o=t[r];if(o)return o.call(t);if("function"===typeof t.next)return t;if(!isNaN(t.length)){var a=-1,n=function o(){while(++a<t.length)if(i.call(t,a))return o.value=t[a],o.done=!1,o;return o.value=e,o.done=!0,o};return n.next=n}}return{next:P}}function P(){return{value:e,done:!0}}}(function(){return this||"object"===typeof self&&self}()||Function("return this")())},a97f:function(t,o,e){"use strict";var a,i=function(){var t=this,o=t.$createElement,e=t._self._c||o;return e("v-uni-view",{staticClass:"orderlist"},[e("v-uni-view",{staticClass:"ol_top"},[e("v-uni-view",{staticClass:"ol_top_mai"},[e("v-uni-view",{staticClass:"ol_topmai_left"},[101==t.goods.status&&t.contentTime<=0?e("v-uni-view",{staticClass:"ol_topm_top"},[t._v("已超时取消")]):e("v-uni-view",{staticClass:"ol_topm_top"},[t._v(t._s(t.goods.mai))]),101==t.goods.status&&t.contentTime>0?e("v-uni-view",{staticClass:"ol_topm_time"},[t._v("还剩"+t._s(t.contentTime)+"分钟自动取消")]):t._e()],1),e("v-uni-image",{staticClass:"ol_top_img",attrs:{src:"../../static/car.png",mode:""}})],1),e("v-uni-view",{staticClass:"ol_top_address"},[e("v-uni-view",{staticClass:"ol_topw_img"},[e("v-uni-image",{staticClass:"icon_wuliu",attrs:{src:"../../static/address.png",mode:""}})],1),e("v-uni-view",{staticClass:"ol_topw_status"},[e("v-uni-view",{staticClass:"ol_topa_user"},[e("v-uni-text",{staticClass:"name"},[t._v(t._s(t.goods.username))]),e("v-uni-text",[t._v(t._s(t.goods.phone))])],1),e("v-uni-view",{staticClass:"ol_topa_text"},[t._v(t._s(t.goods.address))])],1)],1)],1),e("v-uni-view",{staticClass:"ol_goods"},[t._l(t.goodslist,function(o,a){return e("v-uni-view",{key:a,staticClass:"ol_goods_li",on:{click:function(e){arguments[0]=e=t.$handleEvent(e),t.navToDetailPage(o)}}},[e("v-uni-image",{staticClass:"ol_goodsimg",attrs:{src:o.img,mode:""}}),e("v-uni-view",{staticClass:"ol_goods_right"},[e("v-uni-view",{staticClass:"ol_goods_info"},[e("v-uni-view",{staticClass:"ol_goods_title"},[t._v(t._s(o.title))]),e("v-uni-view",{staticClass:"ol_roogs_num"},[e("v-uni-view",{staticClass:"price"},[t._v("￥"+t._s(o.price))]),e("v-uni-view",{staticClass:"num"},[t._v("x"+t._s(o.num))])],1)],1),e("v-uni-view",{staticClass:"ol_goods_size"},t._l(o.size,function(o){return e("v-uni-text",[t._v(t._s(o+" "))])}),1),e("v-uni-text",{directives:[{name:"show",rawName:"v-show",value:o.others,expression:"item.others"}],staticClass:"ol_goods_other"},[t._v(t._s(o.others))])],1)],1)}),e("v-uni-view",{staticClass:"ol_goods_count"},[e("v-uni-view",{staticClass:"ol_goodsc_gray"},[e("v-uni-text",[t._v("商品总价")]),e("v-uni-text",{staticClass:"right"},[t._v("￥"+t._s(t.goodscount.countgoods))])],1),t.goodscount.kuaidi>0?e("v-uni-view",{staticClass:"ol_goodsc_gray"},[e("v-uni-text",[t._v("运费（快递）")]),e("v-uni-text",{staticClass:"right"},[t._v("+￥"+t._s(t.goodscount.kuaidi))])],1):t._e(),e("v-uni-view",{staticClass:"ol_goodsc_black"},[e("v-uni-text",[t._v("订单总价")]),e("v-uni-text",{staticClass:"right"},[t._v("￥"+t._s(t.goodscount.countorder))])],1)],1),e("v-uni-view",{staticClass:"ol_goods_pay"},[e("v-uni-view",{staticClass:"ol_goodsp_top"},[e("v-uni-text",{staticClass:"right"},[t._v("支付明细")])],1),t.goodscount.cut>0?e("v-uni-view",{staticClass:"ol_goodsc_gray"},[e("v-uni-text",[t._v("优惠券")]),e("v-uni-text",{staticClass:"right"},[t._v("-￥"+t._s(t.goodscount.cut))])],1):t._e(),t.goodscount.integralPrice>0?e("v-uni-view",{staticClass:"ol_goodsc_gray"},[e("v-uni-text",[t._v("积分抵现")]),e("v-uni-text",{staticClass:"right"},[t._v("-￥"+t._s(t.goodscount.integralPrice))])],1):t._e(),e("v-uni-view",{staticClass:"ol_goods_paytrue"},[e("v-uni-text",[t._v("实付款")]),e("v-uni-text",{staticClass:"right red"},[t._v("￥"+t._s(t.goodscount.pay))])],1)],1)],2),"航站楼取货"==t.goodscount.send_way?e("v-uni-view",{staticClass:"ol_goods_infos"},[e("v-uni-view",{staticClass:"ol_goodsi_title"},[t._v("提货信息")]),e("v-uni-view",{staticClass:"ol_goods_orderinfo"},[e("v-uni-view",{staticClass:"info_li"},[e("v-uni-text",[t._v("取货航站楼：")]),e("v-uni-text",[t._v(t._s(t.goodscount.PickSiteName))])],1),e("v-uni-view",{staticClass:"info_li"},[e("v-uni-text",[t._v("取货时间：")]),e("v-uni-text",[t._v(t._s(t.goodscount.PickTime))])],1),e("v-uni-view",{staticClass:"info_li"},[e("v-uni-text",[t._v("取货人真实姓名：")]),e("v-uni-text",[t._v(t._s(t.goodscount.PickPerson))])],1),e("v-uni-view",{staticClass:"info_li"},[e("v-uni-text",[t._v("取货人手机号码：")]),e("v-uni-text",[t._v(t._s(t.goodscount.PickMobile))])],1)],1)],1):t._e(),e("v-uni-view",{staticClass:"ol_goods_infos"},[e("v-uni-view",{staticClass:"ol_goodsi_title"},[t._v("订单信息")]),e("v-uni-view",{staticClass:"ol_goods_orderinfo"},[e("v-uni-view",{staticClass:"info_li"},[e("v-uni-text",[t._v("订单编号：")]),e("v-uni-text",[t._v(t._s(t.goodscount.ordernumber))])],1),e("v-uni-view",{staticClass:"info_li"},[e("v-uni-text",[t._v("创建时间：")]),e("v-uni-text",[t._v(t._s(t.goodscount.createtime))])],1),201==t.goods.status||301==t.goods.status||401==t.goods.status?e("v-uni-view",{staticClass:"info_li"},[e("v-uni-text",[t._v("付款时间：")]),e("v-uni-text",[t._v(t._s(t.goodscount.paytime))])],1):t._e(),t.goods.status>=301?e("v-uni-view",{staticClass:"info_li"},[e("v-uni-text",[t._v("承运商：")]),e("v-uni-text",[t._v(t._s(t.goodscount.kuaidiCom))])],1):t._e(),t.goods.status>=301?e("v-uni-view",{staticClass:"info_li"},[e("v-uni-text",[t._v("运单号：")]),e("v-uni-text",[t._v(t._s(t.goodscount.shipSn))])],1):t._e(),t.goods.status>=401?e("v-uni-view",{staticClass:"info_li"},[e("v-uni-text",[t._v("收货时间：")]),e("v-uni-text",[t._v(t._s(t.goodscount.receiveTime))])],1):t._e()],1)],1),e("v-uni-view",{staticClass:"ol_bottom"},[101==t.goods.status&&t.contentTime>0||0==t.goods.actualPrice&&(201==t.goods.status||250==t.goods.status)?e("v-uni-view",{staticClass:"ol_bottom_ok",on:{click:function(o){arguments[0]=o=t.$handleEvent(o),t.cancelOrder(t.goods)}}},[t._v("取消订单")]):t._e(),301==t.goods.status?e("v-uni-view",{staticClass:"ol_bottom_ok",on:{click:function(o){arguments[0]=o=t.$handleEvent(o),t.orderTerminat()}}},[t._v("确认收货")]):t._e(),101==t.goods.status&&t.contentTime>0?e("v-uni-view",{staticClass:"ol_bottom_ok",on:{click:function(o){arguments[0]=o=t.$handleEvent(o),t.topay()}}},[t._v("去支付")]):t._e(),201==t.goods.status?e("v-uni-view",{staticClass:"ol_bottom_ok",on:{click:function(o){arguments[0]=o=t.$handleEvent(o),t.tixingfahuo()}}},[t._v("提醒发货")]):t._e(),t.goods.actualPrice>0&&(201==t.goods.status||250==t.goods.status)?e("v-uni-view",{staticClass:"ol_bottom_ok",on:{click:function(o){arguments[0]=o=t.$handleEvent(o),t.refund()}}},[t._v("申请退款")]):t._e()],1)],1)},n=[];e.d(o,"b",function(){return i}),e.d(o,"c",function(){return n}),e.d(o,"a",function(){return a})},b041:function(t,o){t.exports=function(t){return"string"!==typeof t?t:(/^['"].*['"]$/.test(t)&&(t=t.slice(1,-1)),/["'() \t\n]/.test(t)?'"'+t.replace(/"/g,'\\"').replace(/\n/g,"\\n")+'"':t)}},b848:function(t,o,e){"use strict";e.r(o);var a=e("0420"),i=e.n(a);for(var n in a)"default"!==n&&function(t){e.d(o,t,function(){return a[t]})}(n);o["default"]=i.a}}]);