package com.sy.hting.vo.cy;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class RefundVo {


    private String refundImg;// 退款附带图片

    private String orderID;// 外键，订单编号

    private String refundReason;// 退款原因

    private String adminRemarks;// 管理员审核备注

    private Float actualRefundMoney;// 实际退款金额

    private Integer userID;// 外键，用户编号

    private String businessRemarks;// 商家审核备注

    private Integer point;// 退款申请指向，1：商家，2：管理员

    private Float applyRefundMoney;// 申请退款金额

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date adminTime;// 管理员审核时间

    private String refundExplain;// 退款说明

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date applicationTime;// 申请时间

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date auditTime;// 商家审核时间

    private Integer adminStatus;// 管理员审核状态(1待审核2审核成功3未通过)

    private Integer auditStatus;// 商家审核状态(1待审核2审核成功3未通过)

    private Integer refundID;// 退款id，主键

    private Integer orderType;// 发货方式(1自发2上门取货)

    private Float totalPrice;// 订单总价

    private String uploadPath;// 上传文件路径

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date provideServicesTime;// 提供服务时间

    private Integer orderStatus;// 订单状态(1待付款2待接单3待提供服务4已提供服务6服务完成6服务取消7未接单8已退款)

    private Integer resouroeID;// 外键，资源类别

    private Integer number;// 份数

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date orderTime;// 下单时间

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date receiptTime;// 接单时间

    private Integer filesatus;// 文档状态(1待提供文档2商家已上传文档)

    private Integer integral;// 订单积分

    private Date scheduledStartTime;// 用户预定开始时间

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date paymentTime;// 付款时间

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date scheduledEndTime;// 用户预定结束时间

    private Integer commentstatus;// 评论状态(1待评价2用户已评3双方已评)

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date completeTime;// 完成时间

    private Double weight;// 订单重量

    private Integer collectGoods;// 外键，收货地址

    private Float smallPlan;// 小计

    private Integer population;// 人数

    private Integer refundstatus;// 退款状态(1退款申请中2不同意3申请管理员介入4管理员拒绝5退款完成6退款取消)

    private Integer serviceID;// 外键，商品编号(服务编号)

    private Integer addressID;// 外键，发货地址

    private String documentpath;// 韩语翻译文档文件路径

    private String remarks;// 备注

    private Integer country;// 外键，国家编号

    private String serviceCoverImg;// 封面图

    private Date releaseTime;// 发布时间

    private String serviceCity;// 服务城市(可填多个)

    private Integer browseNumber;// 浏览数

    private Integer stid;// 服务类别编号，外键

    private String serviceIntro;// 服务介绍

    private String majoyNameByCN;// 学科-中文-专业

    private String adminOpinion;// 管理员意见

    private String serviceImgUrlThree;// 细节图3

    private String serviceImgUrlTwo;// 细节图2

    private String serviceCostTypeID;// 费用说明

    private Date serviceEndDate;// 可预定日期-结束

    private String goodAtMajoy;// 擅长专业

    private Integer shelfState;// 上架状态(1上架2下架)

    private String schoolNameByCN;// 学科-中文-学校

    private Integer recommendBool;// 服务推荐

    private Integer resourceID;// 资源类别编号

    private String majoyNameByROK;// 学科-韩文-专业

    private String serviceFuTitle;// 服务副标题

    private String hospitalName;// 医院名称

    private String uploadDataUrl;// 上传资料

    private Integer serviceHour;// 小时/天

    private Date serviceStartDate;// 可预定日期-起始

    private String serviceTitle;// 服务标题

    private Integer servicePrice;// 金币价格

    private String downloadTitle;// 下载标题

    private String serviceImgUrlFour;// 细节图4

    private String serviceImgUrlOne;// 细节图1

    private String schoolRegion;// 学校地区

    private String schoolNameByROK;// 学科-韩文-学校

    private String serviceCostInclude;// 服务费用包含

    @Override
    public String toString() {
        return "RefundVo{" +
                "refundImg='" + refundImg + '\'' +
                ", orderID='" + orderID + '\'' +
                ", refundReason='" + refundReason + '\'' +
                ", adminRemarks='" + adminRemarks + '\'' +
                ", actualRefundMoney=" + actualRefundMoney +
                ", userID=" + userID +
                ", businessRemarks='" + businessRemarks + '\'' +
                ", point=" + point +
                ", applyRefundMoney=" + applyRefundMoney +
                ", adminTime=" + adminTime +
                ", refundExplain='" + refundExplain + '\'' +
                ", applicationTime=" + applicationTime +
                ", auditTime=" + auditTime +
                ", adminStatus=" + adminStatus +
                ", auditStatus=" + auditStatus +
                ", refundID=" + refundID +
                ", orderType=" + orderType +
                ", totalPrice=" + totalPrice +
                ", uploadPath='" + uploadPath + '\'' +
                ", provideServicesTime=" + provideServicesTime +
                ", orderStatus=" + orderStatus +
                ", resouroeID=" + resouroeID +
                ", number=" + number +
                ", orderTime=" + orderTime +
                ", receiptTime=" + receiptTime +
                ", filesatus=" + filesatus +
                ", integral=" + integral +
                ", scheduledStartTime=" + scheduledStartTime +
                ", paymentTime=" + paymentTime +
                ", scheduledEndTime=" + scheduledEndTime +
                ", commentstatus=" + commentstatus +
                ", completeTime=" + completeTime +
                ", weight=" + weight +
                ", collectGoods=" + collectGoods +
                ", smallPlan=" + smallPlan +
                ", population=" + population +
                ", refundstatus=" + refundstatus +
                ", serviceID=" + serviceID +
                ", addressID=" + addressID +
                ", documentpath='" + documentpath + '\'' +
                ", remarks='" + remarks + '\'' +
                ", country=" + country +
                ", serviceCoverImg='" + serviceCoverImg + '\'' +
                ", releaseTime=" + releaseTime +
                ", serviceCity='" + serviceCity + '\'' +
                ", browseNumber=" + browseNumber +
                ", stid=" + stid +
                ", serviceIntro='" + serviceIntro + '\'' +
                ", majoyNameByCN='" + majoyNameByCN + '\'' +
                ", adminOpinion='" + adminOpinion + '\'' +
                ", serviceImgUrlThree='" + serviceImgUrlThree + '\'' +
                ", serviceImgUrlTwo='" + serviceImgUrlTwo + '\'' +
                ", serviceCostTypeID='" + serviceCostTypeID + '\'' +
                ", serviceEndDate=" + serviceEndDate +
                ", goodAtMajoy='" + goodAtMajoy + '\'' +
                ", shelfState=" + shelfState +
                ", schoolNameByCN='" + schoolNameByCN + '\'' +
                ", recommendBool=" + recommendBool +
                ", resourceID=" + resourceID +
                ", majoyNameByROK='" + majoyNameByROK + '\'' +
                ", serviceFuTitle='" + serviceFuTitle + '\'' +
                ", hospitalName='" + hospitalName + '\'' +
                ", uploadDataUrl='" + uploadDataUrl + '\'' +
                ", serviceHour=" + serviceHour +
                ", serviceStartDate=" + serviceStartDate +
                ", serviceTitle='" + serviceTitle + '\'' +
                ", servicePrice=" + servicePrice +
                ", downloadTitle='" + downloadTitle + '\'' +
                ", serviceImgUrlFour='" + serviceImgUrlFour + '\'' +
                ", serviceImgUrlOne='" + serviceImgUrlOne + '\'' +
                ", schoolRegion='" + schoolRegion + '\'' +
                ", schoolNameByROK='" + schoolNameByROK + '\'' +
                ", serviceCostInclude='" + serviceCostInclude + '\'' +
                '}';
    }

    public String getRefundImg() {
        return refundImg;
    }

    public void setRefundImg(String refundImg) {
        this.refundImg = refundImg;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    public String getAdminRemarks() {
        return adminRemarks;
    }

    public void setAdminRemarks(String adminRemarks) {
        this.adminRemarks = adminRemarks;
    }

    public Float getActualRefundMoney() {
        return actualRefundMoney;
    }

    public void setActualRefundMoney(Float actualRefundMoney) {
        this.actualRefundMoney = actualRefundMoney;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getBusinessRemarks() {
        return businessRemarks;
    }

    public void setBusinessRemarks(String businessRemarks) {
        this.businessRemarks = businessRemarks;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Float getApplyRefundMoney() {
        return applyRefundMoney;
    }

    public void setApplyRefundMoney(Float applyRefundMoney) {
        this.applyRefundMoney = applyRefundMoney;
    }

    public Date getAdminTime() {
        return adminTime;
    }

    public void setAdminTime(Date adminTime) {
        this.adminTime = adminTime;
    }

    public String getRefundExplain() {
        return refundExplain;
    }

    public void setRefundExplain(String refundExplain) {
        this.refundExplain = refundExplain;
    }

    public Date getApplicationTime() {
        return applicationTime;
    }

    public void setApplicationTime(Date applicationTime) {
        this.applicationTime = applicationTime;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public Integer getAdminStatus() {
        return adminStatus;
    }

    public void setAdminStatus(Integer adminStatus) {
        this.adminStatus = adminStatus;
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public Integer getRefundID() {
        return refundID;
    }

    public void setRefundID(Integer refundID) {
        this.refundID = refundID;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getUploadPath() {
        return uploadPath;
    }

    public void setUploadPath(String uploadPath) {
        this.uploadPath = uploadPath;
    }

    public Date getProvideServicesTime() {
        return provideServicesTime;
    }

    public void setProvideServicesTime(Date provideServicesTime) {
        this.provideServicesTime = provideServicesTime;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getResouroeID() {
        return resouroeID;
    }

    public void setResouroeID(Integer resouroeID) {
        this.resouroeID = resouroeID;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getReceiptTime() {
        return receiptTime;
    }

    public void setReceiptTime(Date receiptTime) {
        this.receiptTime = receiptTime;
    }

    public Integer getFilesatus() {
        return filesatus;
    }

    public void setFilesatus(Integer filesatus) {
        this.filesatus = filesatus;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public Date getScheduledStartTime() {
        return scheduledStartTime;
    }

    public void setScheduledStartTime(Date scheduledStartTime) {
        this.scheduledStartTime = scheduledStartTime;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Date getScheduledEndTime() {
        return scheduledEndTime;
    }

    public void setScheduledEndTime(Date scheduledEndTime) {
        this.scheduledEndTime = scheduledEndTime;
    }

    public Integer getCommentstatus() {
        return commentstatus;
    }

    public void setCommentstatus(Integer commentstatus) {
        this.commentstatus = commentstatus;
    }

    public Date getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getCollectGoods() {
        return collectGoods;
    }

    public void setCollectGoods(Integer collectGoods) {
        this.collectGoods = collectGoods;
    }

    public Float getSmallPlan() {
        return smallPlan;
    }

    public void setSmallPlan(Float smallPlan) {
        this.smallPlan = smallPlan;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Integer getRefundstatus() {
        return refundstatus;
    }

    public void setRefundstatus(Integer refundstatus) {
        this.refundstatus = refundstatus;
    }

    public Integer getServiceID() {
        return serviceID;
    }

    public void setServiceID(Integer serviceID) {
        this.serviceID = serviceID;
    }

    public Integer getAddressID() {
        return addressID;
    }

    public void setAddressID(Integer addressID) {
        this.addressID = addressID;
    }

    public String getDocumentpath() {
        return documentpath;
    }

    public void setDocumentpath(String documentpath) {
        this.documentpath = documentpath;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getCountry() {
        return country;
    }

    public void setCountry(Integer country) {
        this.country = country;
    }

    public String getServiceCoverImg() {
        return serviceCoverImg;
    }

    public void setServiceCoverImg(String serviceCoverImg) {
        this.serviceCoverImg = serviceCoverImg;
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getServiceCity() {
        return serviceCity;
    }

    public void setServiceCity(String serviceCity) {
        this.serviceCity = serviceCity;
    }

    public Integer getBrowseNumber() {
        return browseNumber;
    }

    public void setBrowseNumber(Integer browseNumber) {
        this.browseNumber = browseNumber;
    }

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    public String getServiceIntro() {
        return serviceIntro;
    }

    public void setServiceIntro(String serviceIntro) {
        this.serviceIntro = serviceIntro;
    }

    public String getMajoyNameByCN() {
        return majoyNameByCN;
    }

    public void setMajoyNameByCN(String majoyNameByCN) {
        this.majoyNameByCN = majoyNameByCN;
    }

    public String getAdminOpinion() {
        return adminOpinion;
    }

    public void setAdminOpinion(String adminOpinion) {
        this.adminOpinion = adminOpinion;
    }

    public String getServiceImgUrlThree() {
        return serviceImgUrlThree;
    }

    public void setServiceImgUrlThree(String serviceImgUrlThree) {
        this.serviceImgUrlThree = serviceImgUrlThree;
    }

    public String getServiceImgUrlTwo() {
        return serviceImgUrlTwo;
    }

    public void setServiceImgUrlTwo(String serviceImgUrlTwo) {
        this.serviceImgUrlTwo = serviceImgUrlTwo;
    }

    public String getServiceCostTypeID() {
        return serviceCostTypeID;
    }

    public void setServiceCostTypeID(String serviceCostTypeID) {
        this.serviceCostTypeID = serviceCostTypeID;
    }

    public Date getServiceEndDate() {
        return serviceEndDate;
    }

    public void setServiceEndDate(Date serviceEndDate) {
        this.serviceEndDate = serviceEndDate;
    }

    public String getGoodAtMajoy() {
        return goodAtMajoy;
    }

    public void setGoodAtMajoy(String goodAtMajoy) {
        this.goodAtMajoy = goodAtMajoy;
    }

    public Integer getShelfState() {
        return shelfState;
    }

    public void setShelfState(Integer shelfState) {
        this.shelfState = shelfState;
    }

    public String getSchoolNameByCN() {
        return schoolNameByCN;
    }

    public void setSchoolNameByCN(String schoolNameByCN) {
        this.schoolNameByCN = schoolNameByCN;
    }

    public Integer getRecommendBool() {
        return recommendBool;
    }

    public void setRecommendBool(Integer recommendBool) {
        this.recommendBool = recommendBool;
    }

    public Integer getResourceID() {
        return resourceID;
    }

    public void setResourceID(Integer resourceID) {
        this.resourceID = resourceID;
    }

    public String getMajoyNameByROK() {
        return majoyNameByROK;
    }

    public void setMajoyNameByROK(String majoyNameByROK) {
        this.majoyNameByROK = majoyNameByROK;
    }

    public String getServiceFuTitle() {
        return serviceFuTitle;
    }

    public void setServiceFuTitle(String serviceFuTitle) {
        this.serviceFuTitle = serviceFuTitle;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getUploadDataUrl() {
        return uploadDataUrl;
    }

    public void setUploadDataUrl(String uploadDataUrl) {
        this.uploadDataUrl = uploadDataUrl;
    }

    public Integer getServiceHour() {
        return serviceHour;
    }

    public void setServiceHour(Integer serviceHour) {
        this.serviceHour = serviceHour;
    }

    public Date getServiceStartDate() {
        return serviceStartDate;
    }

    public void setServiceStartDate(Date serviceStartDate) {
        this.serviceStartDate = serviceStartDate;
    }

    public String getServiceTitle() {
        return serviceTitle;
    }

    public void setServiceTitle(String serviceTitle) {
        this.serviceTitle = serviceTitle;
    }

    public Integer getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(Integer servicePrice) {
        this.servicePrice = servicePrice;
    }

    public String getDownloadTitle() {
        return downloadTitle;
    }

    public void setDownloadTitle(String downloadTitle) {
        this.downloadTitle = downloadTitle;
    }

    public String getServiceImgUrlFour() {
        return serviceImgUrlFour;
    }

    public void setServiceImgUrlFour(String serviceImgUrlFour) {
        this.serviceImgUrlFour = serviceImgUrlFour;
    }

    public String getServiceImgUrlOne() {
        return serviceImgUrlOne;
    }

    public void setServiceImgUrlOne(String serviceImgUrlOne) {
        this.serviceImgUrlOne = serviceImgUrlOne;
    }

    public String getSchoolRegion() {
        return schoolRegion;
    }

    public void setSchoolRegion(String schoolRegion) {
        this.schoolRegion = schoolRegion;
    }

    public String getSchoolNameByROK() {
        return schoolNameByROK;
    }

    public void setSchoolNameByROK(String schoolNameByROK) {
        this.schoolNameByROK = schoolNameByROK;
    }

    public String getServiceCostInclude() {
        return serviceCostInclude;
    }

    public void setServiceCostInclude(String serviceCostInclude) {
        this.serviceCostInclude = serviceCostInclude;
    }
}
