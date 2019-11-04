package com.example.demo.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.bean.BoardData;
import com.example.demo.service.BoardService;

@Controller
public class BoardController {
	@Resource(name="com.example.demo.service.BoardService")
	BoardService boardService;
	
	//글 목록 
	@RequestMapping("/boardList")
	private String boardList(Model model) throws Exception{
		
		model.addAttribute("boardList", boardService.getBoardList());
		
		return "boardList";
	}
	
	//상세 
	@RequestMapping("/boardDetail/{boardNum}")
	private String boardDetail(@PathVariable int boardNum, Model model) throws Exception{
		
		model.addAttribute("boardDetail", boardService.getBoardDetail(boardNum));
		
		return "boardDetail";
	}
	
	//글 작성
	@RequestMapping("/insert") 
    private String boardInsertForm(){
        
        return "insert";
    }
    
	 @RequestMapping("/insertProc")
	 private String boardInsertProc(HttpServletRequest request) throws Exception{
	        
	   	BoardData board = new BoardData();
	        
	    board.setSubject(request.getParameter("subject"));
	    board.setWriter(request.getParameter("writer"));
	    board.setContent(request.getParameter("content"));
	        
	    boardService.boardInsert(board);
	        
	    return "redirect:/boardList";
	  }
    
    //글 수정
    @RequestMapping("/boardUpdate/{boardNum}")
    private String boardUpdateForm(@PathVariable int boardNum, Model model) throws Exception{
        
        model.addAttribute("boardUpdate", boardService.getBoardDetail(boardNum));
        
        return "boardUpdate";
    }
    
    
    @RequestMapping("/updateProc")
    private String boardUpdateProc(HttpServletRequest request) throws Exception{
        
    	BoardData board = new BoardData();
    	
        board.setBoardNum(Integer.parseInt(request.getParameter("boardNum")));
    	board.setSubject(request.getParameter("subject"));
        board.setContent(request.getParameter("content"));
        
        boardService.boardUpdate(board);
        
        return "redirect:/boardUpdate/"+request.getParameter("boardNum"); 
    }


    
    
    //글 삭제
    @RequestMapping("/boardDelete/{boardNum}")
    private String boardDelete(@PathVariable int boardNum) throws Exception{
        
    	boardService.boardDelete(boardNum);
        
        return "redirect:/boardList";
    }
	
	
	

}
