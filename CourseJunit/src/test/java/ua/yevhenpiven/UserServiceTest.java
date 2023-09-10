package ua.yevhenpiven;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import lombok.var;

class UserServiceTest {
private final UserRepository userRepository = Mockito.mock(UserRepository.class);
private final UserService userService=new UserService(userRepository);
	@Test
	void userExist_getUser() {
		String userName="Dima";
		String password="1234";
		when(userRepository.getUserByUsername(userName)).thenReturn(new User(userName, password));
		
		var user = userService.login(userName);
		
		assertEquals(userName, user.getUserName());
		assertEquals(password, user.getPassword());
	}

}
