package com.fh.service;

import com.fh.MenuSearchParm.MenuSearchParm;
import com.fh.common.ServerResponse;
import com.fh.model.Movie;

import java.util.List;

public interface MovieService {
    long queryCount(MenuSearchParm menuSearchParm);

    List<Movie> queryList(MenuSearchParm menuSearchParm);

    ServerResponse queryTypeList();

    Movie toUpdate(Integer id);

    ServerResponse delete(Movie movie);

    ServerResponse add(Movie movie,String areaId,String typeId);

    ServerResponse update(Movie movie);


    ServerResponse queryAreaList();
}
