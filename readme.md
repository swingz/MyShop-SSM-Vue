# SSM框架开发的商城项目

## shop-v1.sql文件

为商城的数据库生成文件

## 笔记

本项目是通过 [VUE+Element UI+Vue Element Admin+SSM+微信支付实现前后端完整电商闭环](https://www.bilibili.com/video/BV1YE411A746) 进行参考搭建的，笔记为改开发者写的笔记。故放此作为参考。

## 后端

* 后端通过整合SSM框架，利用mybatis-generator工具快速生成mapper和xml文件。

* 引入了微信支付SDK，利用了他人注册的商家码走通了支付流程，代码个人信息已用**代替。具体使用请参考 [微信支付申请指引](https://pay.weixin.qq.com/static/applyment_guide/applyment_index.shtml)

## 前端

* 前端使用vue-element进行开发搭建
* 其他技术：Vuex、Axios。
* 前端页面搭建的不太美观。

