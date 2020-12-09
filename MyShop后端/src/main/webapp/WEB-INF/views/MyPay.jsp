<%--
  Created by IntelliJ IDEA.
  User: Swingz
  Date: 2020/11/30
  Time: 17:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>支付页面</title>
</head>
<body>
<h1>请扫码支付</h1>
<img src="/wxpay/dopay" />
</body>
<script type="text/javascript" src="https://cdn.goeasy.io/goeasy-1.0.17.js"></script>
<script type="text/javascript">
<%--    客户端与GoEasy建立连接--%>
    var goEasy = new GoEasy({
        host:'hangzhou.goeasy.io',//应用所在的区域地址，杭州：hangzhou.goeasy.io，新加坡：singapore.goeasy.io
        appkey: "BS-921d89166677404ebdebd94d86531558",//替换为您的应用appkey
        forceTLS:false, //如果需要使用HTTPS/WSS，请设置为true，默认为false
        onConnected: function() {
            console.log('连接成功！')
        },
        onDisconnected: function() {
            console.log('连接断开！')
        },
        onConnectFailed: function(error) {
            console.log('连接失败或错误！')
        }
    });

    //接受消息
    goEasy.subscribe({
        channel: "wxpay_channel",//替换为您自己的channel
        onMessage: function (message) {
            alert("Channel:" + message.channel + " content:" + message.content);
        }
    });
</script>
</html>
