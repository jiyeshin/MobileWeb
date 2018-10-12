package com.jy.mobileweb.service;

import java.util.List;

import com.jy.mobileweb.domain.GoodsVO;

public interface GoodsService {

	//전체 데이터를 가져오는 메소드 
	public List<GoodsVO> list(); 
	
}
