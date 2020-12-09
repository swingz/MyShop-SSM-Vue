package cn.swingz.sdk;

public class SwingzWXDomain implements IWXPayDomain{
    public void report(String domain, long elapsedTimeMillis, Exception ex) {

    }

    public DomainInfo getDomain(WXPayConfig config) {
        /**
         * 参数1：微信支付域名
         * 参数2：是否主域名
         */
        DomainInfo domainInfo = new DomainInfo("api.mch.weixin.qq.com",true);
        return domainInfo;

    }
}
