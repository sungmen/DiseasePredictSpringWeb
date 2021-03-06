package kr.or.connect.diseasepredict.service;

import java.util.List;

import kr.or.connect.diseasepredict.board.dto.BoardVO;
import kr.or.connect.diseasepredict.board.dto.boardPasswdCheck;

public interface BoardService 
{
	public List<BoardVO> getList();
	public BoardVO read(Long bno);
	public Long delete(Long bno);
	public Long update(BoardVO boardVO, Long bno);
	public Long getTotalCount();
	public BoardVO insert(BoardVO boardVO);
	public boardPasswdCheck GetHashedPassed(Long bno);
	public List<BoardVO> getTitle(String search);
	public List<BoardVO> getContent(String search);
	public List<BoardVO> getWriter(String search);
	public List<BoardVO> getContentTitle(String search);
	public List<BoardVO> getTitleWriter(String search);
	public List<BoardVO> getTitleContentWriter(String search);
}
