package ua.yevhenpiven;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import lombok.Setter;


@Data
@AllArgsConstructor
public class User {
private  @Setter @Getter String userName;
private @Getter @Setter String password;

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public User(String userName, String password) {}
}
