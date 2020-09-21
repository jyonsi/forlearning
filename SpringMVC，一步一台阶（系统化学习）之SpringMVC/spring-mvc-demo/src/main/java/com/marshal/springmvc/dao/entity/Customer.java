package com.marshal.springmvc.dao.entity;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

/**
 * @Author 王毅
 * @Date 2020/3/27 9:10
 */
public class Customer {

    @NotEmpty(message = "昵称必须填写")
    @Pattern(regexp = "[\\u4e00-\\u9fa5]{4,10}", message = "4~10个汉字")
    private String nick;

    @NotEmpty(message = "密码必须填写")
    @Pattern(regexp = "\\w{3,10}", message = "3~10个数字、字母或下划线（_）")
    private String password;

    @NotEmpty(message = "姓名必须填写")
    @Pattern(regexp = "[\\u4e00-\\u9fa5]{2,4}", message = "2~4个汉字")
    private String name;

    @NotEmpty(message = "电话号码必须填写")
    @Pattern(regexp = "0?(13|14|15|17|18)[0-9]{9}", message = "需要填写正确的电话号码格式")
    private String telephone;

    @NotEmpty(message = "电子邮箱地址必须填写")
    @Pattern(regexp = "\\w[-\\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+\\.)+[A-Za-z]{2,14}", message = "需要填写正确的电子邮件地址格式")
    private String email;

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "nick='" + nick + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
