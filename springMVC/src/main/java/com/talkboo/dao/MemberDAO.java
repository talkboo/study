package com.talkboo.dao;

import java.util.List;

import com.talkboo.dto.MemberVO;

public interface MemberDAO {
    
    public List<MemberVO> selectMember() throws Exception;
}

