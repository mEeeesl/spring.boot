package com.my.spring.web.ch04.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.spring.web.ch04.dao.TodayDao;

@Service // 난 서비스야 선언 + IoC도 되는듯
public class TodayServiceImpl implements TodayService{
	@Autowired private TodayDao todayDao;
	
	@Override
	public LocalDate getToday() {
		return todayDao.selectToday();
	}
}

//TodayDao - 여기서 Today => data, domain
//TodayService - 여기서 Today => 업무명