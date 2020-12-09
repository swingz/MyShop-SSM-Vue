package cn.swingz.entity;

public class TCart {
    private Long tcId;

    private Long cartId;

    private Long userId;

    private Long pid;

    private Long pcount;

    public Long getTcId() {
        return tcId;
    }

    public void setTcId(Long tcId) {
        this.tcId = tcId;
    }

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

    public Long getPcount() {
        return pcount;
    }

    public void setPcount(Long pcount) {
        this.pcount = pcount;
    }

    @Override
    public String toString() {
        return "TCart{" +
                "tcId=" + tcId +
                ", cartId=" + cartId +
                ", userId=" + userId +
                ", pid=" + pid +
                ", pcount=" + pcount +
                '}';
    }
}