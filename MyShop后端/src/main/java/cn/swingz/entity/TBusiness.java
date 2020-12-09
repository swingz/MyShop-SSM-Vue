package cn.swingz.entity;

public class TBusiness {
    private Long tbsId;

    private Long bisId;

    private String bisName;

    private Short bisFlag;

    private String bisTel;

    private String bisEmail;

    private String bisAddr;

    public Long getTbsId() {
        return tbsId;
    }

    public void setTbsId(Long tbsId) {
        this.tbsId = tbsId;
    }

    public Long getBisId() {
        return bisId;
    }

    public void setBisId(Long bisId) {
        this.bisId = bisId;
    }

    public String getBisName() {
        return bisName;
    }

    public void setBisName(String bisName) {
        this.bisName = bisName == null ? null : bisName.trim();
    }

    public Short getBisFlag() {
        return bisFlag;
    }

    public void setBisFlag(Short bisFlag) {
        this.bisFlag = bisFlag;
    }

    public String getBisTel() {
        return bisTel;
    }

    public void setBisTel(String bisTel) {
        this.bisTel = bisTel == null ? null : bisTel.trim();
    }

    public String getBisEmail() {
        return bisEmail;
    }

    public void setBisEmail(String bisEmail) {
        this.bisEmail = bisEmail == null ? null : bisEmail.trim();
    }

    public String getBisAddr() {
        return bisAddr;
    }

    public void setBisAddr(String bisAddr) {
        this.bisAddr = bisAddr == null ? null : bisAddr.trim();
    }
}