package com.fh.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Type {
    @TableId(value = "id", type = IdType.AUTO)
    private  Integer  id;
    private  String   name;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;//创建时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private  Date   updateTime;//修改时间
    public Type() {
    }



    public Type(Integer id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
