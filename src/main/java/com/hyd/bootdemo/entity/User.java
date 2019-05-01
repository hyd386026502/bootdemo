package com.hyd.bootdemo.entity;/**
 * @author huangYaDong
 * @date 2019-04-11 23:02
 * @description
 * @other
 */

/**
 *
 * @author huangYaDong
 * @date 2019-04-11 23:02
 * @description
 * @other
 */
public class User {
    private Integer userId;
    private String userName;
    private String passWord;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
