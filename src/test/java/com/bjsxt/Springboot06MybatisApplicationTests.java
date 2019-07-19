package com.bjsxt;

import com.bjsxt.mapper.StarMapper;
import com.bjsxt.pojo.Star;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot06MybatisApplicationTests {

	@Autowired
	private StarMapper starMapper;
	@Test
	public void contextLoads() {
		Star star = new Star();
		star.setName("小黄");
		star.setAge(26);
		starMapper.insertSelective(star);
	}

}
