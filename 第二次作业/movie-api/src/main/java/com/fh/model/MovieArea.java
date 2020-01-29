package com.fh.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class MovieArea {
    @TableId(value = "id", type = IdType.AUTO)
private Integer id;
private Integer areaId;
private Integer movieId;

    public MovieArea() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public MovieArea(Integer id, Integer areaId, Integer movieId) {
        this.id = id;
        this.areaId = areaId;
        this.movieId = movieId;
    }
}
