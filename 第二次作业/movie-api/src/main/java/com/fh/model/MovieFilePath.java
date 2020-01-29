package com.fh.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class MovieFilePath {
    @TableId(value = "id", type = IdType.AUTO)
    private  Integer  id;
    private  String  filePath;
    private  Integer  movieId;

    public MovieFilePath() {
    }

    public MovieFilePath(Integer id, String filePath, Integer movieId) {
        this.id = id;
        this.filePath = filePath;
        this.movieId = movieId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }
}

