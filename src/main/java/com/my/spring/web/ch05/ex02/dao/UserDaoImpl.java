package com.my.spring.web.ch05.ex02.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.spring.web.ch05.domain.User;
import com.my.spring.web.ch05.ex02.dao.map.UserMap;

@Repository("ch05.ex02.userDao") // 아이디 중복 피하기 ( 이전 예제에서 사용해서 )
public class UserDaoImpl implements UserDao {
	@Autowired private UserMap userMap;
	
	@Override
	public List<User> selectUsers() {
		return userMap.selectUsers();
	}
	
	@Override
	public int insertUser(User user) {
		return userMap.insertUser(user);
	}
	
	@Override
	public int updateUser(User user) {
		return userMap.updateUser(user);
	}
	
	@Override
	public int deleteUser(int userId) {
		return userMap.deleteUser(userId);
	}
}
