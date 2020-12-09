package cn.swingz.sdk;

import java.io.InputStream;

public class MyWXPayConfig extends WXPayConfig{
    /**
     * 商家注册微信支付之后会生成一个应用ID
     * @return
     */
    String getAppID() {
        return "*****";
    }
    /**
     3、实现IWXPayDomain接口，配置支付的域名。
     4、下单。
     * 商户ID
     * @return
     */
    String getMchID() {
        return "****";
    }
    String getKey() {
        return "*****";
    }
    InputStream getCertStream() {
        return null;
    }
    IWXPayDomain getWXPayDomain() {
        SwingzWXDomain wxDomain = new SwingzWXDomain();
        return wxDomain;
    }

}
