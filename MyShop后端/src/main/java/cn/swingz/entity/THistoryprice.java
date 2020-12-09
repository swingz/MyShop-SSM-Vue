package cn.swingz.entity;

import java.util.Date;

public class THistoryprice {
    private Long thId;

    private Long pid;

    private Long price;

    private Date startTime;

    private Date endTime;

    public Long getThId() {
        return thId;
    }

    public void setThId(Long thId) {
        this.thId = thId;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}