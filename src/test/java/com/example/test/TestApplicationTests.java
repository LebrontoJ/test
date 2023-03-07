package com.example.test;

import com.example.test.mapper.UserLoginMapper;
import com.example.test.pojo.UserLogin;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TestApplicationTests {
	@Autowired
	UserLoginMapper userLoginMapper;
	@Test
	public void toTest(){
		List<UserLogin> userLogins = userLoginMapper.queryAll();
		userLogins.forEach(e-> System.out.println(e));
	}
}
