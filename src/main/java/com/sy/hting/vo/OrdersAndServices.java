package com.sy.hting.vo;

import java.util.Date;

public class OrdersAndServices {

    private Integer country;// 外键，国家编号

    private String serviceCoverImg;// 封面图

    private Date releaseTime;// 发布时间

    private String serviceCity;// 服务城市(可填多个)

    private Integer browseNumber;// 浏览数

    private Integer stid;// 服务类别编号，外键

    private String serviceIntro;// 服务介绍

    private Integer userID;// 外键，用户编号

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

    private Float weight;// 重量

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

    private Integer auditStatus;// 审核状态(1待审核2审核成功3未通过)

    private String schoolNameByROK;// 学科-韩文-学校

    private Integer serviceID;// 服务(商品)id，主键

    private String serviceCostInclude;// 服务费用包含

    private Integer orderType;// 发货方式(1自发2上门取货)

    private Float totalPrice;// 订单总价

    private String uploadPath;// 上传文件路径

    private Date provideServicesTime;// 提供服务时间

    private Integer orderStatus;// 订单状态(1待付款2待接单3待提供服务4已提供服务6服务完成6服务取消7未接单8已退款)

    private Integer resouroeID;// 外键，资源类别

    private Integer number;// 份数

    private Date orderTime;// 下单时间

    private Date receiptTime;// 接单时间

    private Integer filesatus;// 文档状态(1待提供文档2商家已上传文档)

    private Integer integral;// 订单积分

    private Date scheduledStartTime;// 用户预定开始时间

    private Date paymentTime;// 付款时间

    private String orderID;// 订单id，主键

    private Date scheduledEndTime;// 用户预定结束时间

    private Integer commentstatus;// 评论状态(1待评价2用户已评3双方已评)

    private Date completeTime;// 完成时间

    private Integer collectGoods;// 外键，收货地址

    private Float smallPlan;// 小计

    private Integer population;// 人数

    private Integer refundstatus;// 退款状态(1退款申请中2不同意3申请管理员介入4管理员拒绝5退款完成6退款取消)

    private Integer addressID;// 外键，发货地址

    private String documentpath;// 韩语翻译文档文件路径

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

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
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

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
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

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getSchoolNameByROK() {
        return schoolNameByROK;
    }

    public void setSchoolNameByROK(String schoolNameByROK) {
        this.schoolNameByROK = schoolNameByROK;
    }

    public Integer getServiceID() {
        return serviceID;
    }

    public void setServiceID(Integer serviceID) {
        this.serviceID = serviceID;
    }

    public String getServiceCostInclude() {
        return serviceCostInclude;
    }

    public void setServiceCostInclude(String serviceCostInclude) {
        this.serviceCostInclude = serviceCostInclude;
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

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
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

    private String remarks;// 备注

    public OrdersAndServices(Integer country, String serviceCoverImg, Date releaseTime, String serviceCity, Integer browseNumber, Integer stid, String serviceIntro, Integer userID, String majoyNameByCN, String adminOpinion, String serviceImgUrlThree, String serviceImgUrlTwo, String serviceCostTypeID, Date serviceEndDate, String goodAtMajoy, Integer shelfState, String schoolNameByCN, Integer recommendBool, Integer resourceID, String majoyNameByROK, String serviceFuTitle, Float weight, String hospitalName, String uploadDataUrl, Integer serviceHour, Date serviceStartDate, String serviceTitle, Integer servicePrice, String downloadTitle, String serviceImgUrlFour, String serviceImgUrlOne, String schoolRegion, Integer auditStatus, String schoolNameByROK, Integer serviceID, String serviceCostInclude, Integer orderType, Float totalPrice, String uploadPath, Date provideServicesTime, Integer orderStatus, Integer resouroeID, Integer number, Date orderTime, Date receiptTime, Integer filesatus, Integer integral, Date scheduledStartTime, Date paymentTime, String orderID, Date scheduledEndTime, Integer commentstatus, Date completeTime, Integer collectGoods, Float smallPlan, Integer population, Integer refundstatus, Integer addressID, String documentpath, String remarks) {
        this.country = country;
        this.serviceCoverImg = serviceCoverImg;
        this.releaseTime = releaseTime;
        this.serviceCity = serviceCity;
        this.browseNumber = browseNumber;
        this.stid = stid;
        this.serviceIntro = serviceIntro;
        this.userID = userID;
        this.majoyNameByCN = majoyNameByCN;
        this.adminOpinion = adminOpinion;
        this.serviceImgUrlThree = serviceImgUrlThree;
        this.serviceImgUrlTwo = serviceImgUrlTwo;
        this.serviceCostTypeID = serviceCostTypeID;
        this.serviceEndDate = serviceEndDate;
        this.goodAtMajoy = goodAtMajoy;
        this.shelfState = shelfState;
        this.schoolNameByCN = schoolNameByCN;
        this.recommendBool = recommendBool;
        this.resourceID = resourceID;
        this.majoyNameByROK = majoyNameByROK;
        this.serviceFuTitle = serviceFuTitle;
        this.weight = weight;
        this.hospitalName = hospitalName;
        this.uploadDataUrl = uploadDataUrl;
        this.serviceHour = serviceHour;
        this.serviceStartDate = serviceStartDate;
        this.serviceTitle = serviceTitle;
        this.servicePrice = servicePrice;
        this.downloadTitle = downloadTitle;
        this.serviceImgUrlFour = serviceImgUrlFour;
        this.serviceImgUrlOne = serviceImgUrlOne;
        this.schoolRegion = schoolRegion;
        this.auditStatus = auditStatus;
        this.schoolNameByROK = schoolNameByROK;
        this.serviceID = serviceID;
        this.serviceCostInclude = serviceCostInclude;
        this.orderType = orderType;
        this.totalPrice = totalPrice;
        this.uploadPath = uploadPath;
        this.provideServicesTime = provideServicesTime;
        this.orderStatus = orderStatus;
        this.resouroeID = resouroeID;
        this.number = number;
        this.orderTime = orderTime;
        this.receiptTime = receiptTime;
        this.filesatus = filesatus;
        this.integral = integral;
        this.scheduledStartTime = scheduledStartTime;
        this.paymentTime = paymentTime;
        this.orderID = orderID;
        this.scheduledEndTime = scheduledEndTime;
        this.commentstatus = commentstatus;
        this.completeTime = completeTime;
        this.collectGoods = collectGoods;
        this.smallPlan = smallPlan;
        this.population = population;
        this.refundstatus = refundstatus;
        this.addressID = addressID;
        this.documentpath = documentpath;
        this.remarks = remarks;
    }
    public OrdersAndServices() {
        super();
    }
}
