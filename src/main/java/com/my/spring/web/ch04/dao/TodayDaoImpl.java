package com.my.spring.web.ch04.dao;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.spring.web.ch04.dao.map.TodayMap;

@Repository	//리파지토리 레이어 입니다. 선언 - @Component기능도 포함되기에 IoC도 됨
public class TodayDaoImpl implements TodayDao {
	@Autowired private TodayMap todayMap;
	
	@Override
	public LocalDate selectToday() {
		return todayMap.selectToday();
	}
}
