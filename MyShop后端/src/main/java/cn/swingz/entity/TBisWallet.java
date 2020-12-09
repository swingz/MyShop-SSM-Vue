package cn.swingz.entity;

public class TBisWallet {
    private Long tbwId;

    private Long bisId;

    private Long bisAmount;

    private Long bisFzamount;

    public Long getTbwId() {
        return tbwId;
    }

    public void setTbwId(Long tbwId) {
        this.tbwId = tbwId;
    }

    public Long getBisId() {
        return bisId;
    }

    public void setBisId(Long bisId) {
        this.bisId = bisId;
    }

    public Long getBisAmount() {
        return bisAmount;
    }

    public void setBisAmount(Long bisAmount) {
        this.bisAmount = bisAmount;
    }

    public Long getBisFzamount() {
        return bisFzamount;
    }

    public void setBisFzamount(Long bisFzamount) {
        this.bisFzamount = bisFzamount;
    }
}