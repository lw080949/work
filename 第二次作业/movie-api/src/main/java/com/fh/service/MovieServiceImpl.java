package com.fh.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fh.MenuSearchParm.MenuSearchParm;
import com.fh.common.ServerResponse;
import com.fh.mapper.MovieAreaMapper;
import com.fh.mapper.MovieMapper;
import com.fh.mapper.MovieTypeMapper;
import com.fh.model.Movie;
import com.fh.model.MovieArea;
import com.fh.model.MovieType;
import com.fh.model.Type;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieMapper movieMapper;
    @Resource
    private MovieAreaMapper movieAreaMapper;
    @Resource
    private MovieTypeMapper movieTypeMapper;


    @Override
    public long queryCount(MenuSearchParm menuSearchParm) {
        return movieMapper.queryCount(menuSearchParm);
    }

    @Override
    public List<Movie> queryList(MenuSearchParm menuSearchParm) {
        return movieMapper.queryList(menuSearchParm);
    }

    @Override
    public ServerResponse queryTypeList() {
         List<Type> typeList =movieMapper.queryTypeList();
      return   ServerResponse.success(typeList);
    }

    @Override
    public Movie toUpdate(Integer id) {
        return movieMapper.toUpdate(id);
    }

    @Override
    public ServerResponse delete(Movie movie) {
         movie.setStatus(2);
         movieMapper.updateById(movie);
        return ServerResponse.success();
    }

    @Override
    public ServerResponse add(Movie movie,String areaId,String typeId) {
        Date  date = new Date();
        movie.setCreateTime(date);
        movie.setStatus(1);
         movieMapper.add(movie);

        if(StringUtils.isNotBlank(areaId)){
            String[] aidArr = areaId.split(",");

            for (int i = 0; i < aidArr.length; i++) {
                String aid = aidArr[i];
                MovieArea movieArea=new MovieArea();
                movieArea.setMovieId(movie.getId());
                movieArea.setAreaId(Integer.valueOf(aid));
                movieAreaMapper.add(movieArea);
            }
        }
        if(StringUtils.isNotBlank(typeId)){
            String[] tidArr = areaId.split(",");

            for (int i = 0; i < tidArr.length; i++) {
                String tid = tidArr[i];
                MovieType movieType=new MovieType();
                movieType.setMovieId(movie.getId());
                movieType.setTypeId(Integer.valueOf(tid));
                movieTypeMapper.add(movieType);
            }
        }
        return  ServerResponse.success();
    }

    @Override
    public ServerResponse update(Movie movie) {
         movieMapper.update(movie);
        return ServerResponse.success();
    }


    @Override
    public ServerResponse queryAreaList() {

        List<Type> areaList=movieMapper.queryAreaList();
        return ServerResponse.success(areaList);
    }
}
