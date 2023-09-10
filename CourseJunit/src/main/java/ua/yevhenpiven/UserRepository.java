package ua.yevhenpiven;

import java.util.List;

import lombok.extern.java.Log;
@Log
public class UserRepository {
private final List<User> fakeDB= List.of(new User("Dima","1234"));

public User GetUserByUsername(String userName) {
	log.info(String.format("%s Finding user by username %s",getClass(), userName));
	return fakeDB.stream()
			.filter(user->user.getUserName.equals(userName))
			
			.findFirst().orElseThrow(()-> new UserExceptions("User not foud"));
			
}
}
