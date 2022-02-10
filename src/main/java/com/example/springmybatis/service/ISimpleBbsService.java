package com.example.springmybatis.service;

import com.example.springmybatis.dto.SimpleBbsDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ISimpleBbsService {

    List<SimpleBbsDTO> getList();
    SimpleBbsDTO view(String id);
    int write(@Param("0") String writer, @Param("1") String title, @Param("2") String content);
    int delete(@Param("_id") String id);
    int update(SimpleBbsDTO dto);
    public int count();


}
