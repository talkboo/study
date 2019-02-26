package com.talkboo.service;

import java.util.List;

import com.talkboo.dto.MemberVO;
 
public interface MemberService {
    
    public List<MemberVO> selectMember() throws Exception;
}

