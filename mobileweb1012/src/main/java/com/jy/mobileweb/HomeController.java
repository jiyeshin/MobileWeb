package com.jy.mobileweb;

import java.util.List;
import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jy.mobileweb.domain.GoodsVO;
import com.jy.mobileweb.service.GoodsService;

@Controller
public class HomeController {
	
	@Autowired
	private GoodsService goodsService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		//서비스의 메소드를 호출해서 결과를 저장 
		List<GoodsVO> list = goodsService.list();
		
		//모델에 저장 
		model.addAttribute("list", list);
		
		//결과 페이지로 포워딩: 일반 조회는 forwarding
		return "goodsHome";
	}	
	
	@RequestMapping(value = "hybridapp", method = RequestMethod.GET)
	public String hybrid(Locale locale, Model model) {

		return "hybridapp";
	}	
}
