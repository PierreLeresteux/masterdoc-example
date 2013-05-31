package fr.pierre.api.dto;

import java.io.Serializable;

public class Actor implements Serializable {
  private String  firstname;
  private String  lastname;
  private Integer age;

  public Actor() {
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }
}
