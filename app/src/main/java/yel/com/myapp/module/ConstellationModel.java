package yel.com.myapp.module;

/**
 * Created by xxb on 2017/1/16.
 */

public class ConstellationModel {

    /**
     * date : 20170116
     * name : 双鱼座
     * datetime : 2017年01月16日
     * all : 40%
     * color : 黄色
     * health : 60%
     * love : 40%
     * money : 40%
     * number : 0
     * QFriend : 射手座
     * summary : 缠着你的烂桃花可能在今天又现身了，让你颇为困，摔都摔不掉。出门在外的双鱼记得看好自己的财务，有大意丢失的可能，同时多注意交通安全，多核对确认几次行程，确保万无一失。
     * work : 60%
     * resultcode : 200
     * error_code : 0
     */

    private int date;
    /**
     * 星座名称
     */
    private String name;
    /**
     * 日期
     */
    private String datetime;
    /**
     * 综合指数
     */
    private String all;
    /**
     * 幸运色
     */
    private String color;
    /**
     * 健康指数
     */
    private String health;
    /**
     * 爱情指数
     */
    private String love;
    /**
     * 财运指数
     */
    private String money;
    /**
     * 幸运数字
     */
    private int number;
    /**
     * 速配星座
     */
    private String QFriend;
    /**
     * 今日概述
     */
    private String summary;
    /**
     * 工作指数
     */
    private String work;
    /**
     * 返回码
     */
    private String resultcode;
    /**
     * 返回码
     */
    private int error_code;


    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getAll() {
        return all;
    }

    public void setAll(String all) {
        this.all = all;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getLove() {
        return love;
    }

    public void setLove(String love) {
        this.love = love;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getQFriend() {
        return QFriend;
    }

    public void setQFriend(String QFriend) {
        this.QFriend = QFriend;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }
}
