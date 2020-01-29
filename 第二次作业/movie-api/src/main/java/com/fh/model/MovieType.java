package com.fh.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class MovieType {
@TableId(value = "id", type = IdType.AUTO)
private  Integer  id;
private  Integer  typeId;
private  Integer  movieId;

    public MovieType() {
    }

    public MovieType(Integer id, Integer typeId, Integer movieId) {
        this.id = id;
        this.typeId = typeId;
        this.movieId = movieId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }
}
