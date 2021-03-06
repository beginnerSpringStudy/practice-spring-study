package com.study.myhome.user.service;

import com.study.myhome.common.service.Pageable;
import java.util.Date;
import javax.validation.constraints.NotNull;
import org.apache.ibatis.type.Alias;

@Alias("UserVO")
public class UserVO extends Pageable {

  // @Size(min = 4, max = 10)
  @NotNull
  private String username;

  @NotNull
  private String password;

  // 가입 날짜
  private String joinDate;

  // 사용자 권한
  private UserAuthorityVO userAuthority;

  public UserVO(String username) {
    super();
    this.username = username;
  }

  public UserVO(String username, String password, UserAuthorityVO userAuthority) {
    super();
    this.username = username;
    this.password = password;
    this.userAuthority = userAuthority;
  }

  public UserVO(String username, String password) {
    this.username = username;
    this.password = password;
    this.joinDate = new Date().toString();
  }

  public UserVO() {

  }

  public UserAuthorityVO getUserAuthority() {
    return userAuthority;
  }

  public void setUserAuthority(UserAuthorityVO userAuthority) {
    this.userAuthority = userAuthority;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getJoinDate() {
    return joinDate;
  }

  @Override
  public String toString() {
    return "UserVO{" +
        "username='" + username + '\'' +
        ", password='" + password + '\'' +
        ", joinDate=" + joinDate +
        ", userAuthority=" + userAuthority +
        '}';
  }
}
