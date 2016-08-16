package test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.team.entity.User;
import com.team.service.UserService;

public class SpringMybitsTest {
	ApplicationContext context = null;
	UserService userService = null;

	@Before
	public void initContext() {
		this.context = new FileSystemXmlApplicationContext(
				"WebContent/WEB-INF/applicationContext.xml");
		this.userService = (UserService) context.getBean("userService");
	}
//
//	@Test
//	public void countAll() {
//		System.out.println("数据库中的记录条数:" + userService.countAll());
//	}

//	@Test
//	public void insert() {
//		User user = new User();
//		user.setUsername("苏若年");
//		
//		userService.insert(user);
//	}

//	@Test
//	public void selectAll() {
//		List<User> list = userService.selectAll();
//		for (int i = 0; i < list.size(); i++) {
//			User user = list.get(i);
//			System.out.println("用户名:" + user.getUser_name() +
//
//			"\t密码:" + user.getLogin_pwd());
//		}
//	}

//	@Test
//	public void update() {
//		User user = new User();
//		user.setUsername("苏若年");
//		
//		userService.update(user);
//	}

//	@Test
//	public void delete() {
//		userService.delete("苏若年");
//	}

	@Test
	public void findByName() {
		User user = userService.findByUserName("林碧榕");
		System.out.println("用户名:" + user.getUser_name() + "\t密码:"
				+ user.getLogin_pwd());

	}
	
	
}