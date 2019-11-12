package com.jk.mapper;

import com.jk.model.Car;

import java.util.List;
import java.util.Map;

public interface CarMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Car record);

    int insertSelective(Car record);

    Car selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Car record);

    int updateByPrimaryKey(Car record);

    List<Map<String, Object>> queryCar();

    List<Map<String, Object>> queryCarAll();

    List<Map<String, Object>> querycar();

    List<Map<String, Object>> queryri();
}