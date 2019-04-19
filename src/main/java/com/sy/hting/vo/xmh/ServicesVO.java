/**
 * 文件名:ServicesVO
 * 作者:刘浩
 * 时间:2019-03-25 9:16
 * 描述:服务视图
 */

package com.sy.hting.vo.xmh;

import java.util.Date;
import java.util.List;

public class ServicesVO {
    private String shopName;//商家名称

    private String shopImg;//商家头像图片

    private String serviceCoverImg;//商家商品图片

    private Integer servicePrice;//商品价格

    private String serviceTitle;//商家标题

    private String stName;//商品类别

    private String serlevelName;//商品级别

    private String name;//商品服务国家

    private Integer stid;//类别编号

    private Integer servicelevel;//级别编号

    private Integer stpid;//类别主编号

    private Integer country;//地址编号

    private Integer auditStatus;//鉴定状态

    private Integer serviceID;//服务编号







    public Integer getServiceID() {
        return serviceID;
    }

    public void setServiceID(Integer serviceID) {
        this.serviceID = serviceID;
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    public Integer getServicelevel() {
        return servicelevel;
    }

    public void setServicelevel(Integer servicelevel) {
        this.servicelevel = servicelevel;
    }

    public Integer getStpid() {
        return stpid;
    }

    public void setStpid(Integer stpid) {
        this.stpid = stpid;
    }

    public Integer getCountry() {
        return country;
    }

    public void setCountry(Integer country) {
        this.country = country;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopImg() {
        return shopImg;
    }

    public void setShopImg(String shopImg) {
        this.shopImg = shopImg;
    }

    public String getServiceCoverImg() {
        return serviceCoverImg;
    }

    public void setServiceCoverImg(String serviceCoverImg) {
        this.serviceCoverImg = serviceCoverImg;
    }

    public Integer getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(Integer servicePrice) {
        this.servicePrice = servicePrice;
    }

    public String getServiceTitle() {
        return serviceTitle;
    }

    public void setServiceTitle(String serviceTitle) {
        this.serviceTitle = serviceTitle;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public String getSerlevelName() {
        return serlevelName;
    }

    public void setSerlevelName(String serlevelName) {
        this.serlevelName = serlevelName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ServicesVO{" +
                "shopName='" + shopName + '\'' +
                ", shopImg='" + shopImg + '\'' +
                ", serviceCoverImg='" + serviceCoverImg + '\'' +
                ", servicePrice=" + servicePrice +
                ", serviceTitle='" + serviceTitle + '\'' +
                ", stName='" + stName + '\'' +
                ", serlevelName='" + serlevelName + '\'' +
                ", name='" + name + '\'' +
                ", stid=" + stid +
                ", servicelevel=" + servicelevel +
                ", stpid=" + stpid +
                ", country=" + country +
                '}';
    }
}
