package com.jy.mobileweb.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jy.mobileweb.dao.GoodsDAO;
import com.jy.mobileweb.domain.GoodsVO;

@Service
public class GoodsServiceImpl implements GoodsService {

	@Autowired
	private GoodsDAO goodsDAO;
	
	@Override
	public List<GoodsVO> list() {
		
		return goodsDAO.list();
	}
}
