package com.sy.hting.dao.xmh;

import com.sy.hting.pojo.News;
import com.sy.hting.pojo.Sharea;
import com.sy.hting.pojo.User;
import com.sy.hting.vo.xmh.NewsVo;
import com.sy.hting.vo.xmh.TimeOutEmailDateVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Administrator
 * @describe
 * @company 晟源科技有限公司
 * @create 2019-03-24 14:32
 */
public interface IUserDao {
    /**
     * 验证邮箱是否存在
     * @param email
     * @return
     */
    public Integer queryEmail(@Param("email") String email);
    /**
     * 使用邮箱注册
     * @return
     */
    public Integer saveEmailUser(@Param("emailDate") TimeOutEmailDateVo emailDate);
    /**
     * 使用邮箱登陆
     * @param
     * @return
     */
    public User login(@Param("email") String email, @Param("password") String password);
    /**
     * 查询当前用户
     * @param userID
     * @return
     */
    public User queryUser(@Param("userID") Integer userID);
    /**
     * 修改邮件登陆密码
     * @param email
     * @param password
     * @return
     */
    public int updatePwd(@Param("email") String email, @Param("password") String password);
    /**
     * 查看中韩行政地区
     * @return
     */
    public List<Sharea> querySharea();
    /**
     * 修改用户头像
     * @return
     */
    public int updateUserImg(@Param("userImg") String userImgPath, @Param("userID") Integer userID);
    /**
     * 修改个人资料
     * @param u
     * @return
     */
    public int updateUserInfo(@Param("u") User u);
    /**
     * 查询服务类别
     * @param id
     * @return
     */
    public String querySerType(@Param("id") Integer id);
    /**
     * 修改用户店铺信息
     * @param u
     * @return
     */
    public int updateUserDpxx(@Param("u") User u);
    /**
     * 查询不同类型消息
     * @param userID
     * @return
     */
    public List<News> queryXtNews(@Param("userid") Integer userID, @Param("newsType") Integer newsType);
    /**
     * 查询所有消息
     * @param userID
     * @return
     */
    public List<News> queryAllNews(@Param("userid") Integer userID);
    /**
     * 修改消息阅读状态
     * @param newsID
     * @return
     */
    public int updateXtNews(@Param("newsID") String newsID);
    /**
     * 删除系统信息
     * @param newsID
     * @return
     */
    public int deleteNews(@Param("newsID") String newsID);
    /**
     * 消息总数
     * @param
     * @return
     */
    public int countNews(@Param("uid") Integer uid);
    /**
     * 查询站内信
     * @param userID
     * @return
     */
    public List<NewsVo> queryZnxNews(@Param("userid") Integer userID);
    /**
     * 统计站内信一个会话未读数量
     * @param userID
     * @return
     */
    public int readNum(@Param("userid") Integer userID, @Param("groupid") Integer groupID);
    /**
     * 修改站内信已读状态
     * @param groupID
     * @return
     */
    public int updateZnxNews(@Param("groupID") String groupID, @Param("userid") Integer userID);
//    /**
//     * 修改站内信已读
//     * @param newsID
//     * @return
//     */
//    public int deleteZnxNews(@Param("groupID") String groupID, @Param("userid") Integer userID);
    /**
     * 查询站内信详情
     * @param groupID
     * @return
     */
    public List<NewsVo> queryZnxXq(@Param("groupID") String groupID);
    /**
     * 新增站内信
     * @param news
     * @return
     */
    public int saveZnx(@Param("news") News news);
    /**
     * 新增系统信息
     * @param userID
     * @param content
     * @return
     */
    public int saveXtxx(@Param("userid") Integer userID, @Param("content") String content);
    /**
     * 查询是否三方登录过
     * @param openId
     * @param loginType
     * @return
     */
    public int queryOpenId(@Param("openId") String openId, @Param("loginType") Integer loginType);

    /**
     * QQ登录注册
     * @param userame
     * @param userimgpath
     * @param usersex
     * @param openid
     * @return
     */
    public int saveQQUser(@Param("userame") String userame, @Param("userimgpath") String userimgpath,
                          @Param("usersex") Integer usersex, @Param("openid") String openid);
}
