package com.cskaoyan.cinema.vo;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;


public class CinemaQueryVO {
    private Integer brandId=99;
    private Integer  hallType=99;
    private Integer  districtId=99;
    private Integer  pageSize=12;
    private Integer  nowPage=1;

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getHallType() {
        return hallType;
    }

    public void setHallType(Integer hallType) {
        this.hallType = hallType;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getNowPage() {
        return nowPage;
    }

    public void setNowPage(Integer nowPage) {
        this.nowPage = nowPage;
    }
}
