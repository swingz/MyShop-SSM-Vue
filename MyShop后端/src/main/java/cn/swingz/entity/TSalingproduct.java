package cn.swingz.entity;

public class TSalingproduct {
    private Long tpId;

    private Long pid;

    private String pname;

    private Long price;

    private Long salingprice;

    private Long salingcount;

    public Long getTpId() {
        return tpId;
    }

    public void setTpId(Long tpId) {
        this.tpId = tpId;
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
        this.pname = pname == null ? null : pname.trim();
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getSalingprice() {
        return salingprice;
    }

    public void setSalingprice(Long salingprice) {
        this.salingprice = salingprice;
    }

    public Long getSalingcount() {
        return salingcount;
    }

    public void setSalingcount(Long salingcount) {
        this.salingcount = salingcount;
    }
}