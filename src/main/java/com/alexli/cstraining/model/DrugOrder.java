package com.alexli.cstraining.model;

import java.io.Serializable;

public class DrugOrder implements Serializable {

    private Integer doId;//药品订单唯一区分编号
    private Integer doDrugId;//对应的药品唯一区分编号
    private Byte doQty;//该订单的对应药品购买的数量
    private Float doQp;//该订单的对应药品的总价
    private Float doTp;//该订单的所有药品的总价
    private Integer doAoId;//该药品订单对应的预约订单id

    private static final long serialVersionUID = 1L;

    public Integer getDoId() {
        return doId;
    }

    public void setDoId(Integer doId) {
        this.doId = doId;
    }

    public Integer getDoDrugId() {
        return doDrugId;
    }

    public void setDoDrugId(Integer doDrugId) {
        this.doDrugId = doDrugId;
    }

    public Byte getDoQty() {
        return doQty;
    }

    public void setDoQty(Byte doQty) {
        this.doQty = doQty;
    }

    public Float getDoQp() {
        return doQp;
    }

    public void setDoQp(Float doQp) {
        this.doQp = doQp;
    }

    public Float getDoTp() {
        return doTp;
    }

    public void setDoTp(Float doTp) {
        this.doTp = doTp;
    }

    public Integer getDoAoId() {
        return doAoId;
    }

    public void setDoAoId(Integer doAoId) {
        this.doAoId = doAoId;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", doId=" + doId +
                ", doDrugId=" + doDrugId +
                ", doQty=" + doQty +
                ", doQp=" + doQp +
                ", doTp=" + doTp +
                ", doAoId=" + doAoId +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}