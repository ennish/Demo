package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "HS_HAA", name = "HST_HAA_REDEV_PROJECT")
public class RedevProject {
    @Id
    @Column(name = "RP_PRJ_CODE")
    private String prjCode;
    @Column(name = "RP_ESTATE_CODE", nullable=false)
    private String estateCode;
    @Column(name = "RP_DESCRIPTION", nullable = false)
    private String description;
    @Column(name = "RP_CREATE_DATE")
    private String createDate;
    @Column(name = "RP_CREATE_BY")
    private String createBy;
    @Column(name ="RP_UPDATE_DATE")
    private String updateDate;
    @Column(name ="RP_UPDATE_BY")
    private String updateBy;
    @Column(name="RP_ACTIVE")
    private String active;
    @Column(name="RP_APP_NEXT_SEQ")
    private Long nextSeq;
    @Column(name="RP_PROP_RANGE")
    private String propRange;
    @Column(name="RP_FLAT_SORT_CONFIG")
    private Integer flatSortConfig;
    public String getPrjCode() {
        return prjCode;
    }
    public void setPrjCode(String prjCode) {
        this.prjCode = prjCode;
    }
    public String getEstateCode() {
        return estateCode;
    }
    public void setEstateCode(String estateCode) {
        this.estateCode = estateCode;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getCreateDate() {
        return createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
    public String getCreateBy() {
        return createBy;
    }
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }
    public String getUpdateDate() {
        return updateDate;
    }
    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }
    public String getUpdateBy() {
        return updateBy;
    }
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }
    public String getActive() {
        return active;
    }
    public void setActive(String active) {
        this.active = active;
    }
    public Long getNextSeq() {
        return nextSeq;
    }
    public void setNextSeq(Long nextSeq) {
        this.nextSeq = nextSeq;
    }
    public String getPropRange() {
        return propRange;
    }
    public void setPropRange(String propRange) {
        this.propRange = propRange;
    }
    public Integer getFlatSortConfig() {
        return flatSortConfig;
    }
    public void setFlatSortConfig(Integer flatSortConfig) {
        this.flatSortConfig = flatSortConfig;
    }

    
}
