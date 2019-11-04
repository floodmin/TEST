package com.example.demo.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.bean.BoardData;

@Repository("com.example.demo.mapper.BoardMapper")
public interface BoardMapper {
	
	public int boardCount() throws Exception;
	
	//목록
	public List<BoardData> boardList() throws Exception;
	
	//상세
	public BoardData boardDetail(int boardNum) throws Exception;
	
	//글 작성
	public void boardInsert(BoardData board);	
	
	//글 수정
	public void boardUpdate(BoardData board);
	
	//글 삭제
	public void boardDelete(int boardNum);
}
