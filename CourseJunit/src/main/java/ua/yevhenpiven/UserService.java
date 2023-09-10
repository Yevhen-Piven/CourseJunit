package ua.yevhenpiven;

import lombok.AllArgsConstructor;
import lombok.extern.java.Log;

@Log
@AllArgsConstructor
public class UserService {
private UserRepository userRepository;
public User login(String userName) {
	return UserRepository.getUserByUsername(userName);
}
}
