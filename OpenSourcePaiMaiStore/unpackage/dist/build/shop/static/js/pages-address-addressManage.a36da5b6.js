(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-address-addressManage"],{"1d4a":function(a,t,e){"use strict";var s=e("5ca0"),i=e.n(s);i.a},"4ceb":function(a,t,e){"use strict";var s,i=function(){var a=this,t=a.$createElement,e=a._self._c||t;return e("v-uni-view",{staticClass:"content"},[e("v-uni-view",{staticClass:"row b-b"},[e("v-uni-text",{staticStyle:{color:"red"}},[a._v("*")]),e("v-uni-text",{staticClass:"tit"},[a._v("联系人")]),e("v-uni-text",{staticClass:"address",attrs:{hidden:"true"}},[a._v(a._s(a.addressData.id))]),e("v-uni-input",{staticClass:"input",attrs:{type:"text",placeholder:"收货人姓名","placeholder-class":"placeholder"},model:{value:a.addressData.name,callback:function(t){a.$set(a.addressData,"name",t)},expression:"addressData.name"}})],1),e("v-uni-view",{staticClass:"row b-b"},[e("v-uni-text",{staticStyle:{color:"red"}},[a._v("*")]),e("v-uni-text",{staticClass:"tit"},[a._v("手机号")]),e("v-uni-input",{staticClass:"input",attrs:{type:"number",placeholder:"收货人手机号码","placeholder-class":"placeholder"},model:{value:a.addressData.tel,callback:function(t){a.$set(a.addressData,"tel",t)},expression:"addressData.tel"}})],1),e("v-uni-view",{staticClass:"row b-b"},[e("v-uni-text",{staticStyle:{color:"red"}},[a._v("*")]),e("v-uni-view",{staticClass:"tit"},[a._v("请选择省")]),e("select",{directives:[{name:"model",rawName:"v-model",value:a.addressData.province,expression:"addressData.province"}],staticClass:"address_select",on:{change:[function(t){var e=Array.prototype.filter.call(t.target.options,function(a){return a.selected}).map(function(a){var t="_value"in a?a._value:a.value;return t});a.$set(a.addressData,"province",t.target.multiple?e:e[0])},function(t){arguments[0]=t=a.$handleEvent(t),a.getArea(a.addressData.province,2,!1)}]}},[e("option",{staticClass:"address_option",attrs:{value:"-1"},domProps:{selected:!0}},[a._v("请选择省")]),a._l(a.addressData.provinces,function(t){return e("option",{staticClass:"address_option",domProps:{value:t.id}},[a._v(a._s(t.name))])})],2)],1),e("v-uni-view",{staticClass:"row b-b"},[e("v-uni-text",{staticStyle:{color:"red"}},[a._v("*")]),e("v-uni-view",{staticClass:"tit"},[a._v("请选择市")]),e("select",{directives:[{name:"model",rawName:"v-model",value:a.addressData.city,expression:"addressData.city"}],staticClass:"address_select",on:{change:[function(t){var e=Array.prototype.filter.call(t.target.options,function(a){return a.selected}).map(function(a){var t="_value"in a?a._value:a.value;return t});a.$set(a.addressData,"city",t.target.multiple?e:e[0])},function(t){arguments[0]=t=a.$handleEvent(t),a.getArea(a.addressData.city,3,!1)}]}},[e("option",{staticClass:"address_option",attrs:{value:"-1"},domProps:{selected:!0}},[a._v("请选择市")]),a._l(a.addressData.citys,function(t){return e("option",{staticClass:"address_option",domProps:{value:t.id}},[a._v(a._s(t.name))])})],2)],1),e("v-uni-view",{staticClass:"row b-b"},[e("v-uni-text",{staticStyle:{color:"red"}},[a._v("*")]),e("v-uni-view",{staticClass:"tit"},[a._v("请选择区/县")]),e("select",{directives:[{name:"model",rawName:"v-model",value:a.addressData.county,expression:"addressData.county"}],staticClass:"address_select",on:{change:function(t){var e=Array.prototype.filter.call(t.target.options,function(a){return a.selected}).map(function(a){var t="_value"in a?a._value:a.value;return t});a.$set(a.addressData,"county",t.target.multiple?e:e[0])}}},[e("option",{staticClass:"address_option",attrs:{value:"-1"},domProps:{selected:!0}},[a._v("请选择区/县")]),a._l(a.addressData.countrys,function(t){return e("option",{staticClass:"address_option",domProps:{value:t.id}},[a._v(a._s(t.name))])})],2)],1),e("v-uni-view",{staticClass:"row b-b"},[e("v-uni-text",{staticStyle:{color:"red"}},[a._v("*")]),e("v-uni-text",{staticClass:"tit"},[a._v("地址")]),e("v-uni-input",{staticClass:"input",attrs:{type:"text",placeholder:"请输入详细地址","placeholder-class":"placeholder"},model:{value:a.addressData.addressDetail,callback:function(t){a.$set(a.addressData,"addressDetail",t)},expression:"addressData.addressDetail"}})],1),e("v-uni-view",{staticClass:"row b-b"},[e("v-uni-text",{staticStyle:{color:"red"}},[a._v("*")]),e("v-uni-text",{staticClass:"tit"},[a._v("门牌号")]),e("v-uni-input",{staticClass:"input",attrs:{type:"text",placeholder:"楼号、门牌","placeholder-class":"placeholder"},model:{value:a.addressData.area,callback:function(t){a.$set(a.addressData,"area",t)},expression:"addressData.area"}})],1),e("v-uni-view",{staticClass:"row default-row"},[e("v-uni-text",{staticClass:"tit"},[a._v("设为默认")]),e("v-uni-switch",{attrs:{checked:a.addressData.default,color:"#ff0000"},on:{change:function(t){arguments[0]=t=a.$handleEvent(t),a.switchChange.apply(void 0,arguments)}}})],1),e("v-uni-button",{staticClass:"add-btn",on:{click:function(t){arguments[0]=t=a.$handleEvent(t),a.confirm.apply(void 0,arguments)}}},[a._v("提交")])],1)},r=[];e.d(t,"b",function(){return i}),e.d(t,"c",function(){return r}),e.d(t,"a",function(){return s})},"5ca0":function(a,t,e){var s=e("ad57");"string"===typeof s&&(s=[[a.i,s,""]]),s.locals&&(a.exports=s.locals);var i=e("4f06").default;i("70cba3cb",s,!0,{sourceMap:!1,shadowMode:!1})},ad57:function(a,t,e){t=a.exports=e("2350")(!1),t.push([a.i,'@charset "UTF-8";\n/* 页面左右间距 */\n/* 文字尺寸 */\n/*文字颜色*/\n/* 边框颜色 */\n/* 图片加载中颜色 */\n/* 行为相关颜色 */uni-page-body[data-v-f08ec0fe]{background:#f8f8f8;padding-top:%?16?%}.row[data-v-f08ec0fe]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;position:relative;padding:0 %?30?%;height:%?110?%;background:#fff}.row .tit[data-v-f08ec0fe]{-webkit-flex-shrink:0;flex-shrink:0;width:%?170?%;font-size:%?30?%;color:#303133}.row .input[data-v-f08ec0fe]{-webkit-box-flex:1;-webkit-flex:1;flex:1;font-size:%?30?%;color:#303133}.row .icon-shouhuodizhi[data-v-f08ec0fe]{font-size:%?36?%;color:#909399}.default-row[data-v-f08ec0fe]{margin-top:%?16?%}.default-row .tit[data-v-f08ec0fe]{-webkit-box-flex:1;-webkit-flex:1;flex:1}.default-row uni-switch[data-v-f08ec0fe]{-webkit-transform:translateX(%?16?%) scale(.9);transform:translateX(%?16?%) scale(.9)}.add-btn[data-v-f08ec0fe]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-box-pack:center;-webkit-justify-content:center;justify-content:center;width:%?690?%;height:%?80?%;margin:%?60?% auto;font-size:%?32?%;color:#fff;background:-webkit-linear-gradient(211deg,#f25121,#e93a27);background:linear-gradient(239deg,#f25121,#e93a27);border-radius:%?10?%;box-shadow:1px 2px 5px rgba(219,63,96,.4)}.address_select[data-v-f08ec0fe]{width:100%;border:none;height:%?110?%;line-height:%?110?%;-webkit-appearance:none;background-color:#fff!important}.address_option[data-v-f08ec0fe]{background:#fff}body.?%PAGE?%[data-v-f08ec0fe]{background:#f8f8f8}',""])},c3df:function(a,t,e){"use strict";Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0;var s={data:function(){return{addressData:{id:"",name:"",tel:"",addressDetail:"",address:"",area:"",default:!1,provinces:[],citys:[],countrys:[],province:"-1",city:"-1",county:"-1"}}},onLoad:function(a){var t=this,e="新增收货地址";"edit"===a.type?(e="编辑收货地址",this.addressData.id=JSON.parse(a.data).id,this.addressData.name=JSON.parse(a.data).name,this.addressData.tel=JSON.parse(a.data).tel,this.addressData.addressDetail=JSON.parse(a.data).addressDetail,this.addressData.address=JSON.parse(a.data).addressDetail,this.addressData.area=JSON.parse(a.data).area,this.addressData.default=JSON.parse(a.data).default,t.getArea(0,1,!0),this.addressData.province=JSON.parse(a.data).province,t.getArea(JSON.parse(a.data).province,2,!0),this.addressData.city=JSON.parse(a.data).city,t.getArea(JSON.parse(a.data).city,3,!0),this.addressData.county=JSON.parse(a.data).county):t.getArea(0,1,!0),this.manageType=a.type,uni.setNavigationBarTitle({title:e})},methods:{switchChange:function(a){this.addressData.default=a.detail.value},getArea:function(a,t,e){var s=this;s.$http({method:"get",data:"",url:this.global.target+"/wx/address/getRegionList?pid="+a+"&type="+t}).then(function(a){var i=a.data;1==t?s.addressData.provinces=i.data:2==t?e?s.addressData.citys=i.data:(s.addressData.citys=i.data,s.addressData.city="-1",s.addressData.countrys=[],s.addressData.county="-1"):3==t&&(e?s.addressData.countrys=i.data:(s.addressData.countrys=i.data,s.addressData.county="-1"))},function(a){})},chooseLocation:function(){var a=this;uni.chooseLocation({success:function(t){a.addressData.addressDetail=t.name,a.addressData.address=t.name}})},confirm:function(){var a=this.addressData;if(a.name)if(/(^1[3|4|5|7|8][0-9]{9}$)/.test(a.tel))if(a.addressDetail)if(a.area)if(a.province)if("-1"!=a.province)if(a.city)if("-1"!=a.city)if(a.county)if("-1"!=a.county){var t="false";a.default&&(t="true");var e=this;e.$http({method:"POST",data:a,url:this.global.target+"/wx/address/save?userId="+uni.getStorageSync("userInfo").id+"&isDefault="+t}).then(function(a){var t=a.data;0==t.errno?(e.$api.msg("地址".concat("edit"==e.manageType?"修改":"添加","成功")),setTimeout(function(){uni.navigateBack()},800)):(e.$api.msg(t.errmsg),e.logining=!1)},function(a){})}else this.$api.msg("请选择区/县");else this.$api.msg("请选择区/县");else this.$api.msg("请选择市");else this.$api.msg("请选择市");else this.$api.msg("请选择省");else this.$api.msg("请选择省");else this.$api.msg("请填写门牌号信息");else this.$api.msg("请填写详细地址");else this.$api.msg("请输入正确的手机号码");else this.$api.msg("请填写收货人姓名")}}};t.default=s},d92b:function(a,t,e){"use strict";e.r(t);var s=e("c3df"),i=e.n(s);for(var r in s)"default"!==r&&function(a){e.d(t,a,function(){return s[a]})}(r);t["default"]=i.a},e406:function(a,t,e){"use strict";e.r(t);var s=e("4ceb"),i=e("d92b");for(var r in i)"default"!==r&&function(a){e.d(t,a,function(){return i[a]})}(r);e("1d4a");var n,d=e("f0c5"),o=Object(d["a"])(i["default"],s["b"],s["c"],!1,null,"f08ec0fe",null,!1,s["a"],n);t["default"]=o.exports}}]);