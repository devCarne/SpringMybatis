package com.example.springmybatis.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SimpleBbsDTO {
    int id;
    String writer;
    String title;
    String content;
}
