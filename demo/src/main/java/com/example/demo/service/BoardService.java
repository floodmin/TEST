package com.example.demo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.bean.BoardData;
import com.example.demo.mapper.BoardMapper;

@Service("com.example.demo.service.BoardService")
public class BoardService {
	@Resource(name="com.example.demo.mapper.BoardMapper")
	BoardMapper boardMapper;
		
	
		//목록
		public List<BoardData> getBoardList() throws Exception{
			
			return boardMapper.boardList();
			
		}
		
		//상세
		public BoardData getBoardDetail(int boardNum) throws Exception{
			
			return boardMapper.boardDetail(boardNum);
			
		}
		
		//글 작성
		public void boardInsert(BoardData board) throws Exception {
			
			boardMapper.boardInsert(board);
			
		}
		
		//글 수정 
		public void boardUpdate(BoardData board) throws Exception{
			
			boardMapper.boardUpdate(board);
			
		}
		
		//글 삭제
		public void boardDelete(int boardNum) throws Exception{
			
			boardMapper.boardDelete(boardNum);
			
		}

}
