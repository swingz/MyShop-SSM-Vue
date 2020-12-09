package cn.swingz.controller;

import cn.swingz.sdk.MyWXPayConfig;
import cn.swingz.sdk.WXPay;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import io.goeasy.GoEasy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("wxpay")
public class WXPayController {

    @RequestMapping("showpay")
    public String showPay(){
        return "MyPay";
    }

    @RequestMapping("dopay")
    public void doPay(HttpServletResponse response){
        try {
            //生成订单号
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
            String orderPrefix = sdf.format(date);
            String pid = "201";
            String orderId = orderPrefix + pid;

            MyWXPayConfig payConfig = new MyWXPayConfig();
            WXPay wxPay = null;
            wxPay = new WXPay(payConfig);
            //下单
            Map<String,String> data = new HashMap<String,String>();
            data.put("body","腾讯充值中心-QQ会员充值");//商品标题
            data.put("out_trade_no",orderId);//订单编号
            data.put("device_info","WEB");//设备信息
            data.put("fee_type","CNY");//单位：分
            data.put("total_fee","1");//支付金额
            data.put("spbill_create_ip","123.12.12.123");//终端ip ,记录ip,可以发现攻击我们的ip并进
            //重点：回调地址，用来通知支付结果的地址
            data.put("notify_url","http://jye63y.natappfree.cc/wxpay/notify_url");
            data.put("trade_type","NATIVE");
            data.put("product_id","12");
            //返回值：下单成功之后的支付地址
            Map<String, String> order = wxPay.unifiedOrder(data);
            System.out.println(order);

            String content = order.get("code_url");//二维码内容
            int width = 200; // 图像宽度
            int height = 200; // 图像高度
            String format = "png";// 图像类型
            Map<EncodeHintType, Object> hints = new HashMap<EncodeHintType, Object>();
            //内容编码格式
            hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
            // 指定纠错等级
            hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
            //设置二维码边的空度，非负数
            hints.put(EncodeHintType.MARGIN, 2);
            BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height, hints);
            MatrixToImageWriter.writeToStream(bitMatrix,format,response.getOutputStream());
            System.out.println("二维码生成成功");


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("notify_url")
    public void getNotifyURL(HttpServletResponse response, HttpServletRequest request) throws IOException {
        ServletInputStream is = request.getInputStream();
        byte[] b = new byte[1024];
        int len = 0;
        while((len = is.read(b)) != -1){
            String str = new String(b,0,len);
            System.out.println(str);
        }

        response.getWriter().write("<xml><return_code><![CDATA[SUCCESS]]></return_code><return_msg><![CDATA[OK]]></return_msg></xml>");
        GoEasy goEasy = new GoEasy( "http://rest-hangzhou.goeasy.io", "BS-921d89166677404ebdebd94d86531558");
        //推送
        goEasy.publish("wxpay_channel", "支付成功");
    }
}
