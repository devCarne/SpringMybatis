package com.example.springmybatis.service;

import com.example.springmybatis.dao.ISimpleBbsDAO;
import com.example.springmybatis.dto.SimpleBbsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SimperBbsService implements ISimpleBbsService {

    @Autowired
    private ISimpleBbsDAO dao;


    @Override
    public List<SimpleBbsDTO> getList() {
        return dao.getList();
    }

    @Override
    public SimpleBbsDTO view(String id) {
        return dao.view(id);
    }

    @Override
    public int write(String writer, String title, String content) {
        return dao.write(writer, title, content);
    }

    @Override
    public int delete(String id) {
        return dao.delete(id);
    }

    @Override
    public int update(SimpleBbsDTO dto) {
        return dao.update(String.valueOf(dto.getId()), dto.getWriter(), dto.getTitle(), dto.getContent());
    }

    @Override
    public int count() {
        return 0;
    }
}
