package com.sy.hting.vo.xmh;

import com.sy.hting.pojo.Advertisement;
import java.io.Serializable;
import java.util.Date;

public class AdvertisementVO extends Advertisement implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer graphyid;
    private Integer atid;
    private String atitle;
    private Integer aorder;
    private String aimgPath;
    private String apcUrl;
    private String aappUrl;
    private Integer state;
    private Date startTime;
    private Integer rentAMonth;

    public Integer getGraphyid() {
        return graphyid;
    }

    public void setGraphyid(Integer graphyid) {
        this.graphyid = graphyid;
    }

    public Integer getAtid() {
        return atid;
    }


    public void setAtid(Integer atid) {
        this.atid = atid;
    }


    public String getAtitle() {
        return atitle;
    }


    public void setAtitle(String atitle) {
        this.atitle = atitle;
    }


    public Integer getAorder() {
        return aorder;
    }


    public void setAorder(Integer aorder) {
        this.aorder = aorder;
    }


    public String getAimgPath() {
        return aimgPath;
    }


    public void setAimgPath(String aimgPath) {
        this.aimgPath = aimgPath;
    }


    public String getApcUrl() {
        return apcUrl;
    }


    public void setApcUrl(String apcUrl) {
        this.apcUrl = apcUrl;
    }


    public String getAappUrl() {
        return aappUrl;
    }


    public void setAappUrl(String aappUrl) {
        this.aappUrl = aappUrl;
    }


    public Integer getState() {
        return state;
    }


    public void setState(Integer state) {
        this.state = state;
    }


    public Date getStartTime() {
        return startTime;
    }


    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }


    public Integer getRentAMonth() {
        return rentAMonth;
    }


    public void setRentAMonth(Integer rentAMonth) {
        this.rentAMonth = rentAMonth;
    }

//	
//	public float getPrice() {
//		return price;
//	}

    public void setPrice(float price) {
        this.price = price;
    }


    public String getAdescribe() {
        return adescribe;
    }


    public void setAdescribe(String adescribe) {
        this.adescribe = adescribe;
    }


    public Integer getAid() {
        return aid;
    }


    public void setAid(Integer aid) {
        this.aid = aid;
    }

    private Float price;

    @Override
    public Float getPrice() {
        return price;
    }

    @Override
    public void setPrice(Float price) {
        this.price = price;
    }

    private String adescribe;
    private Integer aid;


    private ImageWidthAndHeightVO whObj;    //广告大小对象

    public ImageWidthAndHeightVO getWhObj() {
        return whObj;
    }

    public void setWhObj(ImageWidthAndHeightVO whObj) {
        this.whObj = whObj;
    }

    public AdvertisementVO() {
    }
}
