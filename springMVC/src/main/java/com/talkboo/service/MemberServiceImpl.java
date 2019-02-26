package com.talkboo.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.talkboo.dao.MemberDAO;
import com.talkboo.dto.MemberVO;
 

@Service
public class MemberServiceImpl implements MemberService {

   @Inject
   private MemberDAO dao;
   
   @Override
   public List<MemberVO> selectMember() throws Exception {

       return dao.selectMember();
   }

}


