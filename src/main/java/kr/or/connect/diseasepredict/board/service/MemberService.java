package kr.or.connect.diseasepredict.board.service;

import kr.or.connect.diseasepredict.board.dto.MemberVO;

public interface MemberService {
	public boolean read_userid(String member);
	public void insert(MemberVO member);
}
