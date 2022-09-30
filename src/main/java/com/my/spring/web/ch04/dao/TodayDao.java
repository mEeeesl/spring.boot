package com.my.spring.web.ch04.dao;

import java.time.LocalDate;

public interface TodayDao {
	LocalDate selectToday();
}

// TodayDao - 여기서 Today => data, domain
// TodayService - 여기서 Today => 업무명