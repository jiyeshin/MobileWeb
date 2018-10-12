package com.jy.mobileweb;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jy.mobileweb.dao.GoodsDAO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class TestUse {

	@Autowired
	private SqlSession sqlSession;
	
	@Autowired
	private GoodsDAO goodsDAO;
	
	@Test
	public void method() {
		//sqlSession 해시코드가 콘솔에 출력되면 디비 연결 잘 된거. 
		//System.out.println(sqlSession);
			
		System.out.println(goodsDAO.list());
	}
	
	
	
}
