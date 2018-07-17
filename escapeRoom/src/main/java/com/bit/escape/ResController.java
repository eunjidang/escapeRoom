package com.bit.escape;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit.dao.ResDao;

@Controller
public class ResController {
	
	@Autowired
	private ResDao dao;

	public void setDao(ResDao dao) {
		this.dao = dao;
	}
	
	@RequestMapping(value="/resMain.do")
	public void resMain() {
		
	}
}
