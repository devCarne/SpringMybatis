package com.example.springmybatis.dao;

import com.example.springmybatis.dto.SimpleBbsDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ISimpleBbsDAO {

    List<SimpleBbsDTO> getList();

    SimpleBbsDTO view(String id);

    int write(@Param("0") String writer, @Param("1") String title, @Param("2") String content);

    int delete(@Param("_id") String id);
}
