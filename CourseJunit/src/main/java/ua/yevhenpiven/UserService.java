package ua.yevhenpiven;

import lombok.AllArgsConstructor;
import lombok.extern.java.Log;

@Log
@AllArgsConstructor
public class UserService {
private UserRepository userRepository;
public User login(String userName) {log.info(String.format("%s - Finding user by userName: %s", getClass(), userName));
return userRepository.getUserByUsername(userName);

}
}
