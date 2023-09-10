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

}