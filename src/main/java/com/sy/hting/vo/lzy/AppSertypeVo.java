package com.sy.hting.vo.lzy;

import java.util.Date;

/**
 * @param
 * @author lizeyun
 * @return 查询鉴定记录
 * @exception
 * @Time 2019/4/28 11:10
 */
public class AppSertypeVo {

    private String country;// 国，在韩住址

    private String strength;// 实力展示

    private Integer documentType;// 证件类型(1身份证2护照)

    private String officialNetworkURL;// 留学中介官网网址

    private String officeCountry;// 国，办公室所在地

    private Integer stid;// 外键，服务编号

    private Integer office;// 是否有办公室（1：无，2有）

    private String experience;// 经验时长(直接填字符串)

    private Integer userID;// 外键，用户编号

    private String userName;

    private String userRealName;

    private Integer userSex;

    private String userPhone;

    private String hospitalPhone;// 医院联系电话

    private String studyMajor;// 所学专业

    private String translate;// 资质文件

    private Integer vehicle;// 是否有车 (1:没有，2有）

    private String adminOpinion;// 审批备注

    private String constellation;// 星座

    private String officeProvince;// 省，办公室所在地

    private Integer guideCard;// 是否有导游证(1:没有，2有）

    private String provincialID;// 省，在韩住址

    private String cooperativeHospital;// 合作医院名字

    private String email;// 邮箱地址

    private Integer height;// 身高

    private String translateWebsite;// 网址

    private String officeCity;// 市，办公室所在地

    private Integer sex;// 性别(1男2女)

    private String cooperativeHospitalURL;// 合作医院官网网址

    private String cityID;// 市，在韩住址

    private String hospitalLicense;// 整形医院营业执照

    private String visaType;// 签证类型(直接填字符串)

    private String koreaLicense;// 韩国营业执照

    private Integer applyID;// 鉴定记录id，主键

    private Date submitTime;// 提交时间

    private String certificates;// 证件号

    private String phone;// 联系电话

    private String detailed;// 详细，在韩住址

    private Date auditTime;// 审核时间

    private String officeDetailed;// 详细，办公室所在地

    private String name;// 姓名

    private Integer auditStatus;// 审核状态(1待审核2审核成功3未通过)

    private Integer translateType;// 翻译资质(上传资质文件类型：1证书 2语言成绩)

    private String inKorea;// 在韩时长

    private String schoolReport;// 成绩单(上传文件)

    private Integer age;// 年龄

    private String stName;//服务名称

    private Integer appAuditStatus;

    private Date appSubmitTime;

    private Integer identityType;

    private String identityNumder;

    private String merchantPhone;

    private String merchantEmail;

    private String contactMailbox;

    private String appAdminOpinion;

    public Integer getIdentityType() {
        return identityType;
    }

    public void setIdentityType(Integer identityType) {
        this.identityType = identityType;
    }

    public String getIdentityNumder() {
        return identityNumder;
    }

    public void setIdentityNumder(String identityNumder) {
        this.identityNumder = identityNumder;
    }

    public String getMerchantPhone() {
        return merchantPhone;
    }

    public void setMerchantPhone(String merchantPhone) {
        this.merchantPhone = merchantPhone;
    }

    public String getMerchantEmail() {
        return merchantEmail;
    }

    public void setMerchantEmail(String merchantEmail) {
        this.merchantEmail = merchantEmail;
    }

    public String getContactMailbox() {
        return contactMailbox;
    }

    public void setContactMailbox(String contactMailbox) {
        this.contactMailbox = contactMailbox;
    }

    public String getAppAdminOpinion() {
        return appAdminOpinion;
    }

    public void setAppAdminOpinion(String appAdminOpinion) {
        this.appAdminOpinion = appAdminOpinion;
    }

    public Date getAppSubmitTime() {
        return appSubmitTime;
    }

    public void setAppSubmitTime(Date appSubmitTime) {
        this.appSubmitTime = appSubmitTime;
    }

    public Integer getAppAuditStatus() {
        return appAuditStatus;
    }

    public void setAppAuditStatus(Integer appAuditStatus) {
        this.appAuditStatus = appAuditStatus;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public Integer getDocumentType() {
        return documentType;
    }

    public void setDocumentType(Integer documentType) {
        this.documentType = documentType;
    }

    public String getOfficialNetworkURL() {
        return officialNetworkURL;
    }

    public void setOfficialNetworkURL(String officialNetworkURL) {
        this.officialNetworkURL = officialNetworkURL;
    }

    public String getOfficeCountry() {
        return officeCountry;
    }

    public void setOfficeCountry(String officeCountry) {
        this.officeCountry = officeCountry;
    }

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    public Integer getOffice() {
        return office;
    }

    public void setOffice(Integer office) {
        this.office = office;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getHospitalPhone() {
        return hospitalPhone;
    }

    public void setHospitalPhone(String hospitalPhone) {
        this.hospitalPhone = hospitalPhone;
    }

    public String getStudyMajor() {
        return studyMajor;
    }

    public void setStudyMajor(String studyMajor) {
        this.studyMajor = studyMajor;
    }

    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }

    public Integer getVehicle() {
        return vehicle;
    }

    public void setVehicle(Integer vehicle) {
        this.vehicle = vehicle;
    }

    public String getAdminOpinion() {
        return adminOpinion;
    }

    public void setAdminOpinion(String adminOpinion) {
        this.adminOpinion = adminOpinion;
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }

    public String getOfficeProvince() {
        return officeProvince;
    }

    public void setOfficeProvince(String officeProvince) {
        this.officeProvince = officeProvince;
    }

    public Integer getGuideCard() {
        return guideCard;
    }

    public void setGuideCard(Integer guideCard) {
        this.guideCard = guideCard;
    }

    public String getProvincialID() {
        return provincialID;
    }

    public void setProvincialID(String provincialID) {
        this.provincialID = provincialID;
    }

    public String getCooperativeHospital() {
        return cooperativeHospital;
    }

    public void setCooperativeHospital(String cooperativeHospital) {
        this.cooperativeHospital = cooperativeHospital;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getTranslateWebsite() {
        return translateWebsite;
    }

    public void setTranslateWebsite(String translateWebsite) {
        this.translateWebsite = translateWebsite;
    }

    public String getOfficeCity() {
        return officeCity;
    }

    public void setOfficeCity(String officeCity) {
        this.officeCity = officeCity;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getCooperativeHospitalURL() {
        return cooperativeHospitalURL;
    }

    public void setCooperativeHospitalURL(String cooperativeHospitalURL) {
        this.cooperativeHospitalURL = cooperativeHospitalURL;
    }

    public String getCityID() {
        return cityID;
    }

    public void setCityID(String cityID) {
        this.cityID = cityID;
    }

    public String getHospitalLicense() {
        return hospitalLicense;
    }

    public void setHospitalLicense(String hospitalLicense) {
        this.hospitalLicense = hospitalLicense;
    }

    public String getVisaType() {
        return visaType;
    }

    public void setVisaType(String visaType) {
        this.visaType = visaType;
    }

    public String getKoreaLicense() {
        return koreaLicense;
    }

    public void setKoreaLicense(String koreaLicense) {
        this.koreaLicense = koreaLicense;
    }

    public Integer getApplyID() {
        return applyID;
    }

    public void setApplyID(Integer applyID) {
        this.applyID = applyID;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public String getCertificates() {
        return certificates;
    }

    public void setCertificates(String certificates) {
        this.certificates = certificates;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDetailed() {
        return detailed;
    }

    public void setDetailed(String detailed) {
        this.detailed = detailed;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getOfficeDetailed() {
        return officeDetailed;
    }

    public void setOfficeDetailed(String officeDetailed) {
        this.officeDetailed = officeDetailed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public Integer getTranslateType() {
        return translateType;
    }

    public void setTranslateType(Integer translateType) {
        this.translateType = translateType;
    }

    public String getInKorea() {
        return inKorea;
    }

    public void setInKorea(String inKorea) {
        this.inKorea = inKorea;
    }

    public String getSchoolReport() {
        return schoolReport;
    }

    public void setSchoolReport(String schoolReport) {
        this.schoolReport = schoolReport;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public AppSertypeVo(){
        super();
    }

    public AppSertypeVo(String country, String strength, Integer documentType, String officialNetworkURL, String officeCountry, Integer stid, Integer office, String experience, Integer userID, String userName, String userRealName, Integer userSex, String userPhone, String hospitalPhone, String studyMajor, String translate, Integer vehicle, String adminOpinion, String constellation, String officeProvince, Integer guideCard, String provincialID, String cooperativeHospital, String email, Integer height, String translateWebsite, String officeCity, Integer sex, String cooperativeHospitalURL, String cityID, String hospitalLicense, String visaType, String koreaLicense, Integer applyID, Date submitTime, String certificates, String phone, String detailed, Date auditTime, String officeDetailed, String name, Integer auditStatus, Integer translateType, String inKorea, String schoolReport, Integer age, String stName, Integer appAuditStatus, Date appSubmitTime, Integer identityType, String identityNumder, String merchantPhone, String merchantEmail, String contactMailbox, String appAdminOpinion) {
        this.country = country;
        this.strength = strength;
        this.documentType = documentType;
        this.officialNetworkURL = officialNetworkURL;
        this.officeCountry = officeCountry;
        this.stid = stid;
        this.office = office;
        this.experience = experience;
        this.userID = userID;
        this.userName = userName;
        this.userRealName = userRealName;
        this.userSex = userSex;
        this.userPhone = userPhone;
        this.hospitalPhone = hospitalPhone;
        this.studyMajor = studyMajor;
        this.translate = translate;
        this.vehicle = vehicle;
        this.adminOpinion = adminOpinion;
        this.constellation = constellation;
        this.officeProvince = officeProvince;
        this.guideCard = guideCard;
        this.provincialID = provincialID;
        this.cooperativeHospital = cooperativeHospital;
        this.email = email;
        this.height = height;
        this.translateWebsite = translateWebsite;
        this.officeCity = officeCity;
        this.sex = sex;
        this.cooperativeHospitalURL = cooperativeHospitalURL;
        this.cityID = cityID;
        this.hospitalLicense = hospitalLicense;
        this.visaType = visaType;
        this.koreaLicense = koreaLicense;
        this.applyID = applyID;
        this.submitTime = submitTime;
        this.certificates = certificates;
        this.phone = phone;
        this.detailed = detailed;
        this.auditTime = auditTime;
        this.officeDetailed = officeDetailed;
        this.name = name;
        this.auditStatus = auditStatus;
        this.translateType = translateType;
        this.inKorea = inKorea;
        this.schoolReport = schoolReport;
        this.age = age;
        this.stName = stName;
        this.appAuditStatus = appAuditStatus;
        this.appSubmitTime = appSubmitTime;
        this.identityType = identityType;
        this.identityNumder = identityNumder;
        this.merchantPhone = merchantPhone;
        this.merchantEmail = merchantEmail;
        this.contactMailbox = contactMailbox;
        this.appAdminOpinion = appAdminOpinion;
    }

    @Override
    public String toString() {
        return "AppSertypeVo{" +
                "country='" + country + '\'' +
                ", strength='" + strength + '\'' +
                ", documentType=" + documentType +
                ", officialNetworkURL='" + officialNetworkURL + '\'' +
                ", officeCountry='" + officeCountry + '\'' +
                ", stid=" + stid +
                ", office=" + office +
                ", experience='" + experience + '\'' +
                ", userID=" + userID +
                ", userName='" + userName + '\'' +
                ", userRealName='" + userRealName + '\'' +
                ", userSex=" + userSex +
                ", userPhone='" + userPhone + '\'' +
                ", hospitalPhone='" + hospitalPhone + '\'' +
                ", studyMajor='" + studyMajor + '\'' +
                ", translate='" + translate + '\'' +
                ", vehicle=" + vehicle +
                ", adminOpinion='" + adminOpinion + '\'' +
                ", constellation='" + constellation + '\'' +
                ", officeProvince='" + officeProvince + '\'' +
                ", guideCard=" + guideCard +
                ", provincialID='" + provincialID + '\'' +
                ", cooperativeHospital='" + cooperativeHospital + '\'' +
                ", email='" + email + '\'' +
                ", height=" + height +
                ", translateWebsite='" + translateWebsite + '\'' +
                ", officeCity='" + officeCity + '\'' +
                ", sex=" + sex +
                ", cooperativeHospitalURL='" + cooperativeHospitalURL + '\'' +
                ", cityID='" + cityID + '\'' +
                ", hospitalLicense='" + hospitalLicense + '\'' +
                ", visaType='" + visaType + '\'' +
                ", koreaLicense='" + koreaLicense + '\'' +
                ", applyID=" + applyID +
                ", submitTime=" + submitTime +
                ", certificates='" + certificates + '\'' +
                ", phone='" + phone + '\'' +
                ", detailed='" + detailed + '\'' +
                ", auditTime=" + auditTime +
                ", officeDetailed='" + officeDetailed + '\'' +
                ", name='" + name + '\'' +
                ", auditStatus=" + auditStatus +
                ", translateType=" + translateType +
                ", inKorea='" + inKorea + '\'' +
                ", schoolReport='" + schoolReport + '\'' +
                ", age=" + age +
                ", stName='" + stName + '\'' +
                ", appAuditStatus=" + appAuditStatus +
                ", appSubmitTime=" + appSubmitTime +
                ", identityType=" + identityType +
                ", identityNumder='" + identityNumder + '\'' +
                ", merchantPhone='" + merchantPhone + '\'' +
                ", merchantEmail='" + merchantEmail + '\'' +
                ", contactMailbox='" + contactMailbox + '\'' +
                ", appAdminOpinion='" + appAdminOpinion + '\'' +
                '}';
    }
}
