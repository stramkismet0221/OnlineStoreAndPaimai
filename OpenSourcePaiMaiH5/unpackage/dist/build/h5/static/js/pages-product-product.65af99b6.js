(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-product-product"],{"06c5":function(t,e,i){"use strict";i("a630"),i("fb6a"),i("d3b7"),i("25f0"),i("3ca3"),Object.defineProperty(e,"__esModule",{value:!0}),e.default=s;var a=n(i("6b75"));function n(t){return t&&t.__esModule?t:{default:t}}function s(t,e){if(t){if("string"===typeof t)return(0,a.default)(t,e);var i=Object.prototype.toString.call(t).slice(8,-1);return"Object"===i&&t.constructor&&(i=t.constructor.name),"Map"===i||"Set"===i?Array.from(t):"Arguments"===i||/^(?:Ui|I)nt(?:8|16|32)(?:Clamped)?Array$/.test(i)?(0,a.default)(t,e):void 0}}},"09c2":function(t,e,i){"use strict";i.r(e);var a=i("7328"),n=i.n(a);for(var s in a)"default"!==s&&function(t){i.d(e,t,(function(){return a[t]}))}(s);e["default"]=n.a},3765:function(t,e,i){var a=i("ce00");"string"===typeof a&&(a=[[t.i,a,""]]),a.locals&&(t.exports=a.locals);var n=i("4f06").default;n("f6d07596",a,!0,{sourceMap:!1,shadowMode:!1})},"38a2":function(t,e,i){"use strict";i.r(e);var a=i("975e"),n=i("09c2");for(var s in n)"default"!==s&&function(t){i.d(e,t,(function(){return n[t]}))}(s);i("4438");var o,r=i("f0c5"),c=Object(r["a"])(n["default"],a["b"],a["c"],!1,null,"1a923e60",null,!1,a["a"],o);e["default"]=c.exports},4438:function(t,e,i){"use strict";var a=i("3765"),n=i.n(a);n.a},"6b75":function(t,e,i){"use strict";function a(t,e){(null==e||e>t.length)&&(e=t.length);for(var i=0,a=new Array(e);i<e;i++)a[i]=t[i];return a}Object.defineProperty(e,"__esModule",{value:!0}),e.default=a},7328:function(t,e,i){"use strict";var a=i("4ea4");i("4160"),i("159b"),Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0;var n=a(i("b85c"));i("96cf");var s=a(i("1da1")),o=a(i("87ca")),r={components:{share:o.default},data:function(){var t=this;return t.$http({method:"GET",url:"http://localhost:8080/wx/goods/detail?id=1110016"}).then((function(t){console.log(t.data.data)}),(function(t){})),{specClass:"none",specSelected:[],favorite:!0,shareList:[],imgList:[{src:"https://gd3.alicdn.com/imgextra/i3/0/O1CN01IiyFQI1UGShoFKt1O_!!0-item_pic.jpg_400x400.jpg"},{src:"https://gd3.alicdn.com/imgextra/i3/TB1RPFPPFXXXXcNXpXXXXXXXXXX_!!0-item_pic.jpg_400x400.jpg"},{src:"https://gd2.alicdn.com/imgextra/i2/38832490/O1CN01IYq7gu1UGShvbEFnd_!!38832490.jpg_400x400.jpg"}],desc:'\n\t\t\t\t<div style="width:100%">\n\t\t\t\t\t<img style="width:100%;display:block;" src="https://gd3.alicdn.com/imgextra/i4/479184430/O1CN01nCpuLc1iaz4bcSN17_!!479184430.jpg_400x400.jpg" />\n\t\t\t\t\t<img style="width:100%;display:block;" src="https://gd2.alicdn.com/imgextra/i2/479184430/O1CN01gwbN931iaz4TzqzmG_!!479184430.jpg_400x400.jpg" />\n\t\t\t\t\t<img style="width:100%;display:block;" src="https://gd3.alicdn.com/imgextra/i3/479184430/O1CN018wVjQh1iaz4aupv1A_!!479184430.jpg_400x400.jpg" />\n\t\t\t\t\t<img style="width:100%;display:block;" src="https://gd4.alicdn.com/imgextra/i4/479184430/O1CN01tWg4Us1iaz4auqelt_!!479184430.jpg_400x400.jpg" />\n\t\t\t\t\t<img style="width:100%;display:block;" src="https://gd1.alicdn.com/imgextra/i1/479184430/O1CN01Tnm1rU1iaz4aVKcwP_!!479184430.jpg_400x400.jpg" />\n\t\t\t\t</div>\n\t\t\t',specList:[{id:1,name:"尺寸"},{id:2,name:"颜色"}],specChildList:[{id:1,pid:1,name:"XS"},{id:2,pid:1,name:"S"},{id:3,pid:1,name:"M"},{id:4,pid:1,name:"L"},{id:5,pid:1,name:"XL"},{id:6,pid:1,name:"XXL"},{id:7,pid:2,name:"白色"},{id:8,pid:2,name:"珊瑚粉"},{id:9,pid:2,name:"草木绿"}]}},onLoad:function(t){var e=this;return(0,s.default)(regeneratorRuntime.mark((function i(){return regeneratorRuntime.wrap((function(i){while(1)switch(i.prev=i.next){case 0:return t.id,e.specList.forEach((function(t){var i,a=(0,n.default)(e.specChildList);try{for(a.s();!(i=a.n()).done;){var s=i.value;if(s.pid===t.id){e.$set(s,"selected",!0),e.specSelected.push(s);break}}}catch(o){a.e(o)}finally{a.f()}})),i.next=5,e.$api.json("shareList");case 5:e.shareList=i.sent;case 6:case"end":return i.stop()}}),i)})))()},methods:{toggleSpec:function(){var t=this;"show"===this.specClass?(this.specClass="hide",setTimeout((function(){t.specClass="none"}),250)):"none"===this.specClass&&(this.specClass="show")},selectSpec:function(t,e){var i=this,a=this.specChildList;a.forEach((function(t){t.pid===e&&i.$set(t,"selected",!1)})),this.$set(a[t],"selected",!0),this.specSelected=[],a.forEach((function(t){!0===t.selected&&i.specSelected.push(t)}))},share:function(){this.$refs.share.toggleMask()},toFavorite:function(){this.favorite=!this.favorite},buy:function(){uni.navigateTo({url:"/pages/order/createOrder"})},stopPrevent:function(){}}};e.default=r},"975e":function(t,e,i){"use strict";var a;i.d(e,"b",(function(){return n})),i.d(e,"c",(function(){return s})),i.d(e,"a",(function(){return a}));var n=function(){var t=this,e=t.$createElement,i=t._self._c||e;return i("v-uni-view",{staticClass:"container"},[i("v-uni-view",{staticClass:"carousel"},[i("v-uni-swiper",{attrs:{"indicator-dots":!0,circular:"true",duration:"400"}},t._l(t.imgList,(function(t,e){return i("v-uni-swiper-item",{key:e,staticClass:"swiper-item"},[i("v-uni-view",{staticClass:"image-wrapper"},[i("v-uni-image",{staticClass:"loaded",attrs:{src:t.src,mode:"aspectFill"}})],1)],1)})),1)],1),i("v-uni-view",{staticClass:"introduce-section"},[i("v-uni-text",{staticClass:"title"},[t._v("恒源祥2019春季长袖白色t恤 新款春装")]),i("v-uni-view",{staticClass:"price-box"},[i("v-uni-text",{staticClass:"price-tip"},[t._v("¥")]),i("v-uni-text",{staticClass:"price"},[t._v("341.6")]),i("v-uni-text",{staticClass:"m-price"},[t._v("¥488")]),i("v-uni-text",{staticClass:"coupon-tip"},[t._v("7折")])],1),i("v-uni-view",{staticClass:"bot-row"},[i("v-uni-text",[t._v("销量: 108")]),i("v-uni-text",[t._v("库存: 4690")]),i("v-uni-text",[t._v("浏览量: 768")])],1)],1),i("v-uni-view",{staticClass:"share-section",on:{click:function(e){arguments[0]=e=t.$handleEvent(e),t.share.apply(void 0,arguments)}}},[i("v-uni-text",{staticClass:"tit"},[t._v("运费：包邮")]),i("v-uni-view",{staticClass:"share-btn"},[t._v("立即分享"),i("v-uni-text",{staticClass:"yticon icon-you"})],1)],1),i("v-uni-view",{staticClass:"c-list"},[i("v-uni-view",{staticClass:"c-row b-b",on:{click:function(e){arguments[0]=e=t.$handleEvent(e),t.toggleSpec.apply(void 0,arguments)}}},[i("v-uni-text",{staticClass:"tit"},[t._v("规格型号")]),i("v-uni-view",{staticClass:"con"},t._l(t.specSelected,(function(e,a){return i("v-uni-text",{key:a,staticClass:"selected-text"},[t._v(t._s(e.name))])})),1),i("v-uni-text",{staticClass:"yticon icon-you"})],1),i("v-uni-view",{staticClass:"c-list"},[i("v-uni-view",{staticClass:"c-row b-b"},[i("v-uni-text",{staticClass:"tit"},[t._v("出品人")]),i("v-uni-view",{staticClass:"con-list"},[i("v-uni-text",[t._v("田浩")])],1)],1),i("v-uni-view",{staticClass:"c-row b-b"},[i("v-uni-text",{staticClass:"tit"},[t._v("尺寸及重量")]),i("v-uni-view",{staticClass:"bz-list con"},[i("v-uni-text",[t._v("55*80CM")]),i("v-uni-text",[t._v("0.8千克")])],1)],1),i("v-uni-view",{staticClass:"c-row b-b"},[i("v-uni-text",{staticClass:"tit"},[t._v("规格")]),i("v-uni-view",{staticClass:"bz-list con"},[i("v-uni-text",[t._v("一幅")])],1)],1),i("v-uni-view",{staticClass:"c-row b-b"},[i("v-uni-text",{staticClass:"tit"},[t._v("材质")]),i("v-uni-view",{staticClass:"bz-list con"},[i("v-uni-text",[t._v("布面油画")])],1)],1),i("v-uni-view",{staticClass:"c-row b-b"},[i("v-uni-text",{staticClass:"tit"},[t._v("年代")]),i("v-uni-view",{staticClass:"bz-list con"},[i("v-uni-text",[t._v("2019")])],1)],1),i("v-uni-view",{staticClass:"c-row b-b"},[i("v-uni-text",{staticClass:"tit"},[t._v("工艺")]),i("v-uni-view",{staticClass:"bz-list con"},[i("v-uni-text",[t._v("油画写实")])],1)],1),i("v-uni-view",{staticClass:"c-row b-b"},[i("v-uni-text",{staticClass:"tit"},[t._v("瑕疵")]),i("v-uni-view",{staticClass:"bz-list con"},[i("v-uni-text",[t._v("无")])],1)],1),i("v-uni-view",{staticClass:"c-row b-b"},[i("v-uni-text",{staticClass:"tit"},[t._v("注意事项")]),i("v-uni-view",{staticClass:"bz-list con"},[i("v-uni-text",[t._v("本拍品不带装裱，如需装裱别收费200元，拍下后私信卖家即可(实木复古画框精装裱)")])],1)],1),i("v-uni-view",{staticClass:"c-row b-b"},[i("v-uni-text",{staticClass:"tit"},[t._v("出品人简介")]),i("v-uni-view",{staticClass:"bz-list con"},[i("v-uni-text",[t._v("田浩,1963年生，山东乐陵人，中国书协教育委员会委员，中国艺术研究院中国书法院研究员，山东书协副主席")])],1)],1)],1),i("v-uni-view",{staticClass:"c-row b-b"},[i("v-uni-text",{staticClass:"tit"},[t._v("服务")]),i("v-uni-view",{staticClass:"bz-list con"},[i("v-uni-text",[t._v("7天无理由退换货 ·")]),i("v-uni-text",[t._v("假一赔十 ·")])],1)],1)],1),i("v-uni-view",{staticClass:"eva-section"},[i("v-uni-view",{staticClass:"e-header"},[i("v-uni-text",{staticClass:"tit"},[t._v("评价")]),i("v-uni-text",[t._v("(86)")]),i("v-uni-text",{staticClass:"tip"},[t._v("好评率 100%")]),i("v-uni-text",{staticClass:"yticon icon-you"})],1),i("v-uni-view",{staticClass:"eva-box"},[i("v-uni-image",{staticClass:"portrait",attrs:{src:"http://img3.imgtn.bdimg.com/it/u=1150341365,1327279810&fm=26&gp=0.jpg",mode:"aspectFill"}}),i("v-uni-view",{staticClass:"right"},[i("v-uni-text",{staticClass:"name"},[t._v("Leo yo")]),i("v-uni-text",{staticClass:"con"},[t._v("商品收到了，79元两件，质量不错，试了一下有点瘦，但是加个外罩很漂亮，我很喜欢")]),i("v-uni-view",{staticClass:"bot"},[i("v-uni-text",{staticClass:"attr"},[t._v("购买类型：XL 红色")]),i("v-uni-text",{staticClass:"time"},[t._v("2019-04-01 19:21")])],1)],1)],1)],1),i("v-uni-view",{staticClass:"detail-desc",staticStyle:{"text-align":"center"}},[i("v-uni-view",{staticClass:"d-header"},[i("v-uni-text",[t._v("图文详情")])],1),i("v-uni-rich-text",{staticStyle:{"text-align":"center"},attrs:{nodes:t.desc}})],1),i("v-uni-view",{staticClass:"page-bottom"},[i("v-uni-navigator",{staticClass:"p-b-btn",attrs:{url:"/pages/category/category","open-type":"switchTab"}},[i("v-uni-text",{staticClass:"yticon icon-xiatubiao--copy"}),i("v-uni-text",[t._v("商城")])],1),i("v-uni-view",{staticClass:"p-b-btn",class:{active:t.favorite},on:{click:function(e){arguments[0]=e=t.$handleEvent(e),t.toFavorite.apply(void 0,arguments)}}},[i("v-uni-text",{staticClass:"yticon icon-shoucang"}),i("v-uni-text",[t._v("联系客服")])],1),i("v-uni-view",{staticClass:"p-b-btn",attrs:{url:"/pages/cart/cart","open-type":"switchTab"}},[i("v-uni-text",{staticClass:"yticon icon-gouwuche"}),i("v-uni-text",[t._v("购物车")])],1),i("v-uni-view",{staticClass:"action-btn-group"},[i("v-uni-button",{staticClass:" action-btn no-border add-cart-btn",attrs:{type:"primary"}},[i("v-uni-text",[t._v("加入购物车")])],1),i("v-uni-button",{staticClass:" action-btn no-border buy-now-btn",attrs:{type:"primary"},on:{click:function(e){arguments[0]=e=t.$handleEvent(e),t.buy.apply(void 0,arguments)}}},[t._v("立即购买")])],1)],1),i("v-uni-view",{staticClass:"popup spec",class:t.specClass,on:{touchmove:function(e){e.stopPropagation(),e.preventDefault(),arguments[0]=e=t.$handleEvent(e),t.stopPrevent.apply(void 0,arguments)},click:function(e){arguments[0]=e=t.$handleEvent(e),t.toggleSpec.apply(void 0,arguments)}}},[i("v-uni-view",{staticClass:"mask"}),i("v-uni-view",{staticClass:"layer attr-content",on:{click:function(e){e.stopPropagation(),arguments[0]=e=t.$handleEvent(e),t.stopPrevent.apply(void 0,arguments)}}},[i("v-uni-view",{staticClass:"a-t"},[i("v-uni-image",{attrs:{src:"https://gd3.alicdn.com/imgextra/i3/0/O1CN01IiyFQI1UGShoFKt1O_!!0-item_pic.jpg_400x400.jpg"}}),i("v-uni-view",{staticClass:"right"},[i("v-uni-text",{staticClass:"price"},[t._v("¥328.00")]),i("v-uni-text",{staticClass:"stock"},[t._v("库存：188件")]),i("v-uni-view",{staticClass:"selected"},[t._v("已选："),t._l(t.specSelected,(function(e,a){return i("v-uni-text",{key:a,staticClass:"selected-text"},[t._v(t._s(e.name))])}))],2)],1)],1),t._l(t.specList,(function(e,a){return i("v-uni-view",{key:a,staticClass:"attr-list"},[i("v-uni-text",[t._v(t._s(e.name))]),i("v-uni-view",{staticClass:"item-list"},t._l(t.specChildList,(function(a,n){return a.pid===e.id?i("v-uni-text",{key:n,staticClass:"tit",class:{selected:a.selected},on:{click:function(e){arguments[0]=e=t.$handleEvent(e),t.selectSpec(n,a.pid)}}},[t._v(t._s(a.name))]):t._e()})),1)],1)})),i("v-uni-button",{staticClass:"btn",on:{click:function(e){arguments[0]=e=t.$handleEvent(e),t.toggleSpec.apply(void 0,arguments)}}},[t._v("完成")])],2)],1),i("share",{ref:"share",attrs:{contentHeight:580,shareList:t.shareList}})],1)},s=[]},b85c:function(t,e,i){"use strict";i("a4d3"),i("e01a"),i("d28b"),i("d3b7"),i("3ca3"),i("ddb0"),Object.defineProperty(e,"__esModule",{value:!0}),e.default=s;var a=n(i("06c5"));function n(t){return t&&t.__esModule?t:{default:t}}function s(t,e){var i;if("undefined"===typeof Symbol||null==t[Symbol.iterator]){if(Array.isArray(t)||(i=(0,a.default)(t))||e&&t&&"number"===typeof t.length){i&&(t=i);var n=0,s=function(){};return{s:s,n:function(){return n>=t.length?{done:!0}:{done:!1,value:t[n++]}},e:function(t){throw t},f:s}}throw new TypeError("Invalid attempt to iterate non-iterable instance.\nIn order to be iterable, non-array objects must have a [Symbol.iterator]() method.")}var o,r=!0,c=!1;return{s:function(){i=t[Symbol.iterator]()},n:function(){var t=i.next();return r=t.done,t},e:function(t){c=!0,o=t},f:function(){try{r||null==i["return"]||i["return"]()}finally{if(c)throw o}}}}},ce00:function(t,e,i){var a=i("24fb");e=a(!1),e.push([t.i,'@charset "UTF-8";\n/* 页面左右间距 */\n/* 文字尺寸 */\n/*文字颜色*/\n/* 边框颜色 */\n/* 图片加载中颜色 */\n/* 行为相关颜色 */uni-page-body[data-v-1a923e60]{background:#f8f8f8;padding-bottom:%?160?%}.icon-you[data-v-1a923e60]{font-size:%?30?%;color:#888}.carousel[data-v-1a923e60]{height:%?722?%;position:relative}.carousel uni-swiper[data-v-1a923e60]{height:100%}.carousel .image-wrapper[data-v-1a923e60]{width:100%;height:100%}.carousel .swiper-item[data-v-1a923e60]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-pack:center;-webkit-justify-content:center;justify-content:center;-webkit-align-content:center;align-content:center;height:%?750?%;overflow:hidden}.carousel .swiper-item uni-image[data-v-1a923e60]{width:100%;height:100%}\n/* 标题简介 */.introduce-section[data-v-1a923e60]{background:#fff;padding:%?20?% %?30?%}.introduce-section .title[data-v-1a923e60]{font-size:%?32?%;color:#303133;height:%?50?%;line-height:%?50?%}.introduce-section .price-box[data-v-1a923e60]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:baseline;-webkit-align-items:baseline;align-items:baseline;height:%?64?%;padding:%?10?% 0;font-size:%?26?%;color:#fa436a}.introduce-section .price[data-v-1a923e60]{font-size:%?34?%}.introduce-section .m-price[data-v-1a923e60]{margin:0 %?12?%;color:#909399;text-decoration:line-through}.introduce-section .coupon-tip[data-v-1a923e60]{-webkit-box-align:center;-webkit-align-items:center;align-items:center;padding:%?4?% %?10?%;background:#fa436a;font-size:%?24?%;color:#fff;border-radius:%?6?%;line-height:1;-webkit-transform:translateY(%?-4?%);transform:translateY(%?-4?%)}.introduce-section .bot-row[data-v-1a923e60]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;height:%?50?%;font-size:%?24?%;color:#909399}.introduce-section .bot-row uni-text[data-v-1a923e60]{-webkit-box-flex:1;-webkit-flex:1;flex:1}\n/* 分享 */.share-section[data-v-1a923e60]{margin-top:%?10?%;margin-bottom:%?10?%;display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;color:#606266;background:-webkit-linear-gradient(left,#fdf5f6,#fbebf6);background:linear-gradient(left,#fdf5f6,#fbebf6);padding:%?12?% %?30?%}.share-section .share-icon[data-v-1a923e60]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;width:%?70?%;height:%?30?%;line-height:1;border:1px solid #fa436a;border-radius:%?4?%;position:relative;overflow:hidden;font-size:%?22?%;color:#fa436a}.share-section .share-icon[data-v-1a923e60]:after{content:"";width:%?50?%;height:%?50?%;border-radius:50%;left:%?-20?%;top:%?-12?%;position:absolute;background:#fa436a}.share-section .icon-xingxing[data-v-1a923e60]{position:relative;z-index:1;font-size:%?24?%;margin-left:%?2?%;margin-right:%?10?%;color:#fff;line-height:1}.share-section .tit[data-v-1a923e60]{font-size:%?28?%;margin-left:%?10?%}.share-section .icon-bangzhu1[data-v-1a923e60]{padding:%?10?%;font-size:%?30?%;line-height:1}.share-section .share-btn[data-v-1a923e60]{-webkit-box-flex:1;-webkit-flex:1;flex:1;text-align:right;font-size:%?24?%;color:#fa436a}.share-section .icon-you[data-v-1a923e60]{font-size:%?24?%;margin-left:%?4?%;color:#fa436a}.c-list[data-v-1a923e60]{font-size:%?26?%;color:#606266;background:#fff}.c-list .c-row[data-v-1a923e60]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;padding:%?20?% %?30?%;position:relative}.c-list .tit[data-v-1a923e60]{width:%?140?%}.c-list .con[data-v-1a923e60]{-webkit-box-flex:1;-webkit-flex:1;flex:1;color:#303133}.c-list .con .selected-text[data-v-1a923e60]{margin-right:%?10?%}.c-list .bz-list[data-v-1a923e60]{font-size:%?26?%;color:#303133}.c-list .bz-list uni-text[data-v-1a923e60]{display:inline-block;margin-right:%?30?%}.c-list .con-list[data-v-1a923e60]{-webkit-box-flex:1;-webkit-flex:1;flex:1;display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-webkit-flex-direction:column;flex-direction:column;color:#303133;line-height:%?40?%}.c-list .red[data-v-1a923e60]{color:#fa436a}\n/* 评价 */.eva-section[data-v-1a923e60]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-webkit-flex-direction:column;flex-direction:column;padding:%?20?% %?30?%;background:#fff;margin-top:%?16?%}.eva-section .e-header[data-v-1a923e60]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;height:%?70?%;font-size:%?26?%;color:#909399}.eva-section .e-header .tit[data-v-1a923e60]{font-size:%?30?%;color:#303133;margin-right:%?4?%}.eva-section .e-header .tip[data-v-1a923e60]{-webkit-box-flex:1;-webkit-flex:1;flex:1;text-align:right}.eva-section .e-header .icon-you[data-v-1a923e60]{margin-left:%?10?%}.eva-box[data-v-1a923e60]{display:-webkit-box;display:-webkit-flex;display:flex;padding:%?20?% 0}.eva-box .portrait[data-v-1a923e60]{-webkit-flex-shrink:0;flex-shrink:0;width:%?80?%;height:%?80?%;border-radius:100px}.eva-box .right[data-v-1a923e60]{-webkit-box-flex:1;-webkit-flex:1;flex:1;display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-webkit-flex-direction:column;flex-direction:column;font-size:%?28?%;color:#606266;padding-left:%?26?%}.eva-box .right .con[data-v-1a923e60]{font-size:%?28?%;color:#303133;padding:%?20?% 0}.eva-box .right .bot[data-v-1a923e60]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-pack:justify;-webkit-justify-content:space-between;justify-content:space-between;font-size:%?24?%;color:#909399}\n/*  详情 */.detail-desc[data-v-1a923e60]{background:#fff;margin-top:%?16?%;text-align:center}.detail-desc .d-header[data-v-1a923e60]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-pack:center;-webkit-justify-content:center;justify-content:center;-webkit-box-align:center;-webkit-align-items:center;align-items:center;height:%?80?%;font-size:%?30?%;color:#303133;position:relative}.detail-desc .d-header uni-text[data-v-1a923e60]{padding:0 %?20?%;background:#fff;position:relative;z-index:1}.detail-desc .d-header[data-v-1a923e60]:after{position:absolute;left:50%;top:50%;-webkit-transform:translateX(-50%);transform:translateX(-50%);width:%?300?%;height:0;content:"";border-bottom:1px solid #ccc}\n/* 规格选择弹窗 */.attr-content[data-v-1a923e60]{padding:%?10?% %?30?%}.attr-content .a-t[data-v-1a923e60]{display:-webkit-box;display:-webkit-flex;display:flex}.attr-content .a-t uni-image[data-v-1a923e60]{width:%?170?%;height:%?170?%;-webkit-flex-shrink:0;flex-shrink:0;margin-top:%?-40?%;border-radius:%?8?%}.attr-content .a-t .right[data-v-1a923e60]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-webkit-flex-direction:column;flex-direction:column;padding-left:%?24?%;font-size:%?26?%;color:#606266;line-height:%?42?%}.attr-content .a-t .right .price[data-v-1a923e60]{font-size:%?32?%;color:#fa436a;margin-bottom:%?10?%}.attr-content .a-t .right .selected-text[data-v-1a923e60]{margin-right:%?10?%}.attr-content .attr-list[data-v-1a923e60]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-webkit-flex-direction:column;flex-direction:column;font-size:%?30?%;color:#606266;padding-top:%?30?%;padding-left:%?10?%}.attr-content .item-list[data-v-1a923e60]{padding:%?20?% 0 0;display:-webkit-box;display:-webkit-flex;display:flex;-webkit-flex-wrap:wrap;flex-wrap:wrap}.attr-content .item-list uni-text[data-v-1a923e60]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-box-pack:center;-webkit-justify-content:center;justify-content:center;background:#eee;margin-right:%?20?%;margin-bottom:%?20?%;border-radius:%?100?%;min-width:%?60?%;height:%?60?%;padding:0 %?20?%;font-size:%?28?%;color:#303133}.attr-content .item-list .selected[data-v-1a923e60]{background:#fbebee;color:#fa436a}\n/*  弹出层 */.popup[data-v-1a923e60]{position:fixed;left:0;top:0;right:0;bottom:0;z-index:99}.popup.show[data-v-1a923e60]{display:block}.popup.show .mask[data-v-1a923e60]{-webkit-animation:showPopup-data-v-1a923e60 .2s linear both;animation:showPopup-data-v-1a923e60 .2s linear both}.popup.show .layer[data-v-1a923e60]{-webkit-animation:showLayer-data-v-1a923e60 .2s linear both;animation:showLayer-data-v-1a923e60 .2s linear both}.popup.hide .mask[data-v-1a923e60]{-webkit-animation:hidePopup-data-v-1a923e60 .2s linear both;animation:hidePopup-data-v-1a923e60 .2s linear both}.popup.hide .layer[data-v-1a923e60]{-webkit-animation:hideLayer-data-v-1a923e60 .2s linear both;animation:hideLayer-data-v-1a923e60 .2s linear both}.popup.none[data-v-1a923e60]{display:none}.popup .mask[data-v-1a923e60]{position:fixed;top:0;width:100%;height:100%;z-index:1;background-color:rgba(0,0,0,.4)}.popup .layer[data-v-1a923e60]{position:fixed;z-index:99;bottom:0;width:100%;min-height:40vh;border-radius:%?10?% %?10?% 0 0;background-color:#fff}.popup .layer .btn[data-v-1a923e60]{height:%?66?%;line-height:%?66?%;border-radius:%?100?%;background:#fa436a;font-size:%?30?%;color:#fff;margin:%?30?% auto %?20?%}@-webkit-keyframes showPopup-data-v-1a923e60{0%{opacity:0}100%{opacity:1}}@keyframes showPopup-data-v-1a923e60{0%{opacity:0}100%{opacity:1}}@-webkit-keyframes hidePopup-data-v-1a923e60{0%{opacity:1}100%{opacity:0}}@keyframes hidePopup-data-v-1a923e60{0%{opacity:1}100%{opacity:0}}@-webkit-keyframes showLayer-data-v-1a923e60{0%{-webkit-transform:translateY(120%);transform:translateY(120%)}100%{-webkit-transform:translateY(0);transform:translateY(0)}}@keyframes showLayer-data-v-1a923e60{0%{-webkit-transform:translateY(120%);transform:translateY(120%)}100%{-webkit-transform:translateY(0);transform:translateY(0)}}@-webkit-keyframes hideLayer-data-v-1a923e60{0%{-webkit-transform:translateY(0);transform:translateY(0)}100%{-webkit-transform:translateY(120%);transform:translateY(120%)}}@keyframes hideLayer-data-v-1a923e60{0%{-webkit-transform:translateY(0);transform:translateY(0)}100%{-webkit-transform:translateY(120%);transform:translateY(120%)}}\n/* 底部操作菜单 */.page-bottom[data-v-1a923e60]{position:fixed;left:%?30?%;bottom:%?30?%;z-index:95;display:-webkit-box;display:-webkit-flex;display:flex;-webkit-justify-content:space-around;justify-content:space-around;-webkit-box-align:center;-webkit-align-items:center;align-items:center;width:%?690?%;height:%?100?%;background:hsla(0,0%,100%,.9);box-shadow:0 0 %?20?% 0 rgba(0,0,0,.5);border-radius:%?16?%}.page-bottom .p-b-btn[data-v-1a923e60]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-webkit-flex-direction:column;flex-direction:column;-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-box-pack:center;-webkit-justify-content:center;justify-content:center;font-size:%?24?%;color:#606266;width:%?96?%;height:%?80?%}.page-bottom .p-b-btn .yticon[data-v-1a923e60]{font-size:%?40?%;line-height:%?48?%;color:#909399}.page-bottom .p-b-btn.active[data-v-1a923e60], .page-bottom .p-b-btn.active .yticon[data-v-1a923e60]{color:#fa436a}.page-bottom .p-b-btn .icon-fenxiang2[data-v-1a923e60]{font-size:%?42?%;-webkit-transform:translateY(%?-2?%);transform:translateY(%?-2?%)}.page-bottom .p-b-btn .icon-shoucang[data-v-1a923e60]{font-size:%?46?%}.page-bottom .action-btn-group[data-v-1a923e60]{display:-webkit-box;display:-webkit-flex;display:flex;height:%?76?%;border-radius:100px;overflow:hidden;box-shadow:0 %?20?% %?40?% %?-16?% #fa436a;box-shadow:1px 2px 5px rgba(219,63,96,.4);background:-webkit-linear-gradient(left,#ffac30,#fa436a,#f56c6c);background:linear-gradient(90deg,#ffac30,#fa436a,#f56c6c);margin-left:%?20?%;position:relative}.page-bottom .action-btn-group[data-v-1a923e60]:after{content:"";position:absolute;top:50%;right:50%;-webkit-transform:translateY(-50%);transform:translateY(-50%);height:%?28?%;width:0;border-right:1px solid hsla(0,0%,100%,.5)}.page-bottom .action-btn-group .action-btn[data-v-1a923e60]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-box-pack:center;-webkit-justify-content:center;justify-content:center;width:%?180?%;height:100%;font-size:%?28?%;padding:0;border-radius:0;background:transparent}body.?%PAGE?%[data-v-1a923e60]{background:#f8f8f8}',""]),t.exports=e}}]);