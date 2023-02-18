package com.example.demo.controller;

import com.example.demo.dto.ResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("todo")
public class TodoController {
    //testTodo 메서드 작성하기
    @GetMapping
    public ResponseEntity<?> testTodo() {
        List<String> list = new ArrayList<>();
        list.add("Hello World! And you got 500 error.");
        ResponseDTO<String> response = ResponseDTO.<String>builder().data(list).build();
        return ResponseEntity.internalServerError().body(response);
    }
}
