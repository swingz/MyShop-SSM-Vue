package cn.swingz.entity.vo;

import java.math.BigDecimal;

public class CartVo {

    private Long cartId;
    private Long userId;
    private Long pid;
    private String pname;
    private Long price;
    private Long pcount;

    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getPcount() {
        return pcount;
    }

    public void setPcount(Long pcount) {
        this.pcount = pcount;
    }

    @Override
    public String toString() {
        return "CartVo{" +
                "cartId=" + cartId +
                ", userId=" + userId +
                ", pid=" + pid +
                ", pname='" + pname + '\'' +
                ", price=" + price +
                ", pcount=" + pcount +
                '}';
    }
}
