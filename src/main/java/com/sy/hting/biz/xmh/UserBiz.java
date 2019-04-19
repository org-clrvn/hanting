package com.sy.hting.biz.xmh;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sy.hting.pojo.News;
import com.sy.hting.pojo.Sharea;
import com.sy.hting.pojo.User;
import com.sy.hting.dao.xmh.IUserDao;
import com.sy.hting.vo.xmh.NewsVo;
import com.sy.hting.vo.xmh.TimeOutEmailDateVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 * @describe
 * @company 晟源科技有限公司
 * @create 2019-03-24 14:33
 */
@Service
public class UserBiz {
    @Autowired
    private IUserDao dao;

    /**
     * 验证是否存在邮箱号
     * @param email
     * @return
     */
    public boolean queryEmail(String email) {
        Integer count=dao.queryEmail(email);
        if(count>0){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 邮箱用户注册
     * @param emailDate
     * @return
     */
    public boolean saveEmailUser(TimeOutEmailDateVo emailDate) {
        return dao.saveEmailUser(emailDate)>0;
    }

    /**
     * 邮箱登陆
     * @param
     * @return
     */
    public User login(String email,String password) {
        return dao.login(email, password);
    }
    /**
     * 查询当前用户
     * @param userID
     * @return
     */
    public User queryUser(Integer  userID){
        return dao.queryUser(userID);
    }
    /**
     * 修改密码
     * @param email
     * @param password
     * @return
     */
    public boolean updatePwd(String email,String password){
        return dao.updatePwd(email, password)>0;
    }
    /**
     * 查看中韩行政地区
     * @return
     */
    public List<Sharea> querySharea(){
        return dao.querySharea();
    }
    /**
     * 修改用户头像
     * @return
     */
    public boolean updateUserImg(String userImgPath,Integer  userID){
        return dao.updateUserImg(userImgPath,userID)>0;
    }
    /**
     * 修改个人信息
     * @param u
     * @return
     */
    public boolean updateUserInfo(User u) {
        return dao.updateUserInfo(u)>0;
    }
    /**
     * 查询服务类别
     * @param id
     * @return
     */
    public String querySerType(Integer id) {
        return dao.querySerType(id);
    }
    /**
     * 修改店铺信息
     * @param u
     * @return
     */
    public boolean updateUserDpxx(User u) {
        return dao.updateUserDpxx(u)>0;
    }
    /**
     * 系统分页查询不同类型消息
     * @param userID
     * @param newsType
     * @param pageNum
     * @param pageSize
     * @return
     */
    public PageInfo<News>  queryNewPageInfo(Integer userID, Integer newsType, Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo<News>(dao.queryXtNews(userID, newsType));
    }
    /**
     * 查询所有信息
     * @param userID
     * @return
     */
    public List<News> queryAllNews(Integer userID){
        return dao.queryAllNews(userID);
    }
    /**
     * 修改消息状态
     * @param newsID
     * @return
     */
    public int updateXtNews(String newsID) {
        return dao.updateXtNews(newsID);
    }
    /**
     * 删除系统信息
     * @param newsID
     * @return
     */
    public int deleteNews(String newsID) {
        return dao.deleteNews(newsID);
    }
    /**
     * 消息总数
     * @param
     * @return
     */
    public int countNews(Integer uid) {
        return dao.countNews(uid);
    }
//    /**
//     * 站内信分页查询
//     * @param userID
//     * @param newsType
//     * @param pageNum
//     * @param pageSize
//     * @return
//     */
//    public PageInfo<NewsVo>  queryZnxNewsPageInfo(Integer userID, Integer pageNum, Integer pageSize){
//        PageHelper.startPage(pageNum, pageSize);
//        return new PageInfo<NewsVo>(dao.queryZnxNews(userID));
//    }
    /**
     * 统计站内信一个会话未读数量
     * @param userID
     * @return
     */
    public int readNum(Integer userID,Integer groupID){
        return dao.readNum(userID,groupID);
    }
    /**
     * 修改站内信信息
     * @param groupID userID
     * @return
     */
    public int updateZnxNews(String groupID,Integer userID) {
        return dao.updateZnxNews(groupID,userID);
    }
//    /**
//     * 修改站内信已读
//     * @param newsID
//     * @return
//     */
//    public int deleteZnxNews(String groupID,Integer userID) {
//        return dao.deleteZnxNews(groupID,userID);
//    }
//    /**
//     * 查询站内信详情
//     * @param userID
//     * @return
//     */
//    public List<NewsVo> queryZnxXq(String groupID){
//        return dao.queryZnxXq(groupID);
//    }
    /**
     * 新增站内信
     * @param news
     * @return
     */
    public boolean saveZnx(News news) {
        return dao.saveZnx(news)>0;
    }
    /**
     * 新增系统消息
     * @param userID 用户ID
     * @param content 内容
     * @return
     */
    public boolean saveXtxx(Integer userID,String content) {
        return dao.saveXtxx(userID, content)>0;
    }
    /**
     * 查询是否三方登录过
     * @param openId
     * @param loginType
     * @return
     */
    public boolean queryOpenId(String openId,Integer loginType){
        Integer count=dao.queryOpenId(openId,loginType);
        if(count>0){
            return true;
        }else {
            return false;
        }
    }

    /**
     * QQ登录注册
     * @param userame
     * @param userimgpath
     * @param usersex
     * @param openid
     * @return
     */
    public boolean saveQQUser(String userame,String userimgpath,Integer usersex,String openid){
        return dao.saveQQUser(userame,userimgpath,usersex,openid)>0;
    }
}
