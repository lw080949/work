package com.fh.controller;

import com.fh.MenuSearchParm.MenuSearchParm;
import com.fh.common.ServerResponse;
import com.fh.model.Movie;
import com.fh.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("movie/")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @RequestMapping(value = "queryList")
    @ResponseBody
    public ServerResponse queryList(MenuSearchParm menuSearchParm){
        long totalCount =movieService.queryCount(menuSearchParm);
        List<Movie> list =movieService.queryList(menuSearchParm);
        Map map=new HashMap();
        map.put("draw",menuSearchParm.getDraw());
        map.put("recordsTotal",totalCount);
        map.put("recordsFiltered",totalCount);
        map.put("data",list);
        return ServerResponse.success(map);
    }

    @RequestMapping(value = "queryTypeList")
    @ResponseBody
    public ServerResponse queryTypeList( ){
        return movieService.queryTypeList();
    }
    @RequestMapping(value = "queryAreaList")
    @ResponseBody
    public ServerResponse queryAreaList( ){
        return movieService.queryAreaList();
    }

    @RequestMapping("toUpdate")
    @ResponseBody
    public ServerResponse toUpdate(Integer id) {
        Movie movie = movieService.toUpdate(id);
        return ServerResponse.success(movie);
    }

    @RequestMapping("delete")
    @ResponseBody
    public ServerResponse delete(Movie movie){
        return movieService.delete(movie);
    }
    @RequestMapping("add")
    @ResponseBody
    public ServerResponse add(Movie movie,String areaId,String typeId){
        return movieService.add(movie,areaId,typeId);
    }


    @RequestMapping("update")
    @ResponseBody
    public ServerResponse update(Movie movie){
        return movieService.update(movie);
    }


}
