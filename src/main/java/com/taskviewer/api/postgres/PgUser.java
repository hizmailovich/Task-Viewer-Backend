package com.taskviewer.api.postgres;

import com.taskviewer.api.model.User;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class PgUser implements User {

  private Long id;
  private String username;
  private String email;
  private String role;
  private String firstname;
  private String lastname;
  private String password;
  private LocalDateTime created;

  @Override
  public Long id() {
    return this.id;
  }

  @Override
  public String username() {
    return this.username;
  }

  @Override
  public String role() {
    return this.role;
  }

  @Override
  public String email() {
    return this.email;
  }

  @Override
  public String firstname() {
    return this.firstname;
  }

  @Override
  public String lastname() {
    return this.lastname;
  }

  @Override
  public String password() {
    return this.password;
  }
}
