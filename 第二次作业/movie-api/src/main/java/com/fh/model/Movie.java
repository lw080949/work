package com.fh.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class Movie {
    @TableId(value = "id", type = IdType.AUTO)
    private  Integer  id;
    private  String   name;
    private  Integer   mins;//片长，以分钟为单位
    private  String   filePath;
    private  Integer   isHot;//是否热映 1代表热映 2代表不热映
    private  BigDecimal  grade;//评分
    private  String  areaName;//评分
    private  String  typeName;//评分
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private  Date   showTime;//上映时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private  Date   createTime;//创建时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private  Date   updateTime;//修改时间
    private  String   introduce;//电影介绍
    private  Integer   status;



    public Movie() {
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Movie(Integer id, String name, Integer mins, String filePath, Integer isHot, BigDecimal grade, Date showTime, Date createTime, Date updateTime, String introduce) {
        this.id = id;
        this.name = name;
        this.mins = mins;
        this.filePath = filePath;
        this.isHot = isHot;
        this.grade = grade;
        this.showTime = showTime;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.introduce = introduce;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMins() {
        return mins;
    }

    public void setMins(Integer mins) {
        this.mins = mins;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Integer getIsHot() {
        return isHot;
    }

    public void setIsHot(Integer isHot) {
        this.isHot = isHot;
    }

    public BigDecimal getGrade() {
        return grade;
    }

    public void setGrade(BigDecimal grade) {
        this.grade = grade;
    }

    public Date getShowTime() {
        return showTime;
    }

    public void setShowTime(Date showTime) {
        this.showTime = showTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }
}
