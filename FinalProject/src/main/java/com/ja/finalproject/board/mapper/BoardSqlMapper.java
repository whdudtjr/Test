package com.ja.finalproject.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ja.finalproject.dto.BoardDto;
import com.ja.finalproject.dto.BoardImageDto;
import com.ja.finalproject.dto.BoardLikeDto;
import com.ja.finalproject.dto.CommentDto;

public interface BoardSqlMapper {

	public int createPk();
	
	public BoardDto selectById(int id); 
	
	public void insert(BoardDto boardDto);
	public List<BoardDto> selectAll(@Param("pageNum") int pageNum,@Param("searchType") String searchType,@Param("searchWord") String searchWord);
	public int getBoardCount(@Param("searchType") String searchType,@Param("searchWord") String searchWord);
	
	
	// 조회수 증가..
	public void increaseReadCount(int id);
	// 글삭제
	public void deleteById(int id);
	// 글 수정
	public void update(BoardDto boardDto);
	
	// 이미지 등록
	public void insertBoardImage(BoardImageDto boardImageDto);
	public List<BoardImageDto> selectBoardImageByBoardId(int boardId);
	
	// 좋아요
	public void insertLike(BoardLikeDto boardLikeDto);
	public void deleteLike(BoardLikeDto boardLikeDto);
	public int countMyLike(BoardLikeDto boardLikeDto);
	public int countLikeByBoardId(int boardId);
	
	// 댓글 
	public void insertComment(CommentDto commentDto);
	public void deleteComment(int id);
	public void updateComment(CommentDto commentDto);
	public List<CommentDto> selectCommentAll(int boardId);
	
	
	
}













