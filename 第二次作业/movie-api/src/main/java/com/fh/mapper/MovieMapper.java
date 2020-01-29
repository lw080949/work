package com.fh.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.MenuSearchParm.MenuSearchParm;
import com.fh.model.Movie;
import com.fh.model.Type;

import java.util.List;

public interface MovieMapper extends BaseMapper<Movie> {
    long queryCount(MenuSearchParm menuSearchParm);

    List<Movie> queryList(MenuSearchParm menuSearchParm);

    Movie toUpdate(Integer id);

    List<Type> queryTypeList();

    void delete(Integer id);

    void add(Movie movie);

    void update(Movie movie);



    List<Type> queryAreaList();
}
