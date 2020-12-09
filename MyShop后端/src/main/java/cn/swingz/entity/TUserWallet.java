package cn.swingz.entity;

public class TUserWallet {
    private Long tuwId;

    private Long userId;

    private Long userAmount;

    private Long userFzamount;

    public Long getTuwId() {
        return tuwId;
    }

    public void setTuwId(Long tuwId) {
        this.tuwId = tuwId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserAmount() {
        return userAmount;
    }

    public void setUserAmount(Long userAmount) {
        this.userAmount = userAmount;
    }

    public Long getUserFzamount() {
        return userFzamount;
    }

    public void setUserFzamount(Long userFzamount) {
        this.userFzamount = userFzamount;
    }
}