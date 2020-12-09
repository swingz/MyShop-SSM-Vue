package cn.swingz.entity;

public class TUserAddr {
    private Long tuaId;

    private Long userId;

    private String userAddr;

    public Long getTuaId() {
        return tuaId;
    }

    public void setTuaId(Long tuaId) {
        this.tuaId = tuaId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserAddr() {
        return userAddr;
    }

    public void setUserAddr(String userAddr) {
        this.userAddr = userAddr == null ? null : userAddr.trim();
    }
}