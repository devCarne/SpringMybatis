package com.example.springmybatis.jdbc;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IMyUserDAO {

    List<MyUserDTO> getList();
}
