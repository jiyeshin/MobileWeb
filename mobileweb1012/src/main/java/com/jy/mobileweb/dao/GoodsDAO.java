package com.jy.mobileweb.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jy.mobileweb.domain.GoodsVO;

@Repository
public class GoodsDAO {

	@Autowired
	private SqlSession sqlSession;
	
	//mappers.xml 파일에 쓴 내용과 같아야 함.
	//select로 보여줄 데이터가 여러개 -> List
	//resultType과 결과형식이 같아야 함 -> GoodsVO
	//select 문이고 list 타입이므로 -> selectList
	//매퍼파일에서 네임스페이스가 goodsmaper이고 select 태그의 id가 list -> goodsmapper.list
	public List<GoodsVO> list(){
		return sqlSession.selectList("goodsmapper.list");
	}
}
