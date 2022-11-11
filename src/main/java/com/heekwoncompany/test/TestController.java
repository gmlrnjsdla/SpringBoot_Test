package com.heekwoncompany.test;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.heekwoncompany.test.dao.IDao;

@Controller
public class TestController {
	
	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping(value="test")
	public String test(Model model) {
		
		MemberDto dto = new MemberDto();
		dto.setMid("tiger");
		dto.setMname("홍길동");
		dto.setMpw("12345");
		
		model.addAttribute("dto", dto);
		
		
		return "test";
	}
	
	@RequestMapping(value="insert")
	public String insert() {
		
		IDao dao = sqlSession.getMapper(IDao.class);
		
		String mid = "tiger123";
		String mpw = "12345";
		String mname = "홍길순";
		String memail = "tiger@gmail.com";
		
		dao.joinMemberDao(mid, mpw, mname, memail);
		
		return "insert";
	}
}
