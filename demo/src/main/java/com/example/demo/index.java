package com.example.demo;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.mapper.BoardMapper;

@Controller
public class index {
	
	@Resource(name="com.example.demo.mapper.BoardMapper")
	BoardMapper boardMapper;
	
 
	@RequestMapping("/index")
	private String indexMain() throws Exception {
		System.out.println(boardMapper.boardCount());
		return "index";
	}
}
 