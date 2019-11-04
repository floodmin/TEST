package com.example.demo.bean;

import java.util.Date;

public class BoardData {
	
	private int boardNum;		//글 번호
	private String subject;		//글 제목
	private String content;		//글 내용 
	private String writer;		//글쓴이
	private Date regDate;		//등록일 
	
	
	public int getBoardNum() {
		return boardNum;
	}
	
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getWriter() {
		return writer;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public Date getRegDate() {
		return regDate;
	}
	
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

}
