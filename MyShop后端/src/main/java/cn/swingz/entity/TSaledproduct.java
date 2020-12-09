package cn.swingz.entity;

public class TSaledproduct {
    private Long tpId;

    private Long pid;

    private String pname;

    private Long price;

    private Long saledprice;

    private Long saledcount;

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

    public Long getSaledprice() {
        return saledprice;
    }

    public void setSaledprice(Long saledprice) {
        this.saledprice = saledprice;
    }

    public Long getSaledcount() {
        return saledcount;
    }

    public void setSaledcount(Long saledcount) {
        this.saledcount = saledcount;
    }
}