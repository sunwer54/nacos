package com.nacos.pojo;


public class TUser {

  private long id;
  private String uname;
  private String pwd;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getUname() {
    return uname;
  }

  public void setUname(String uname) {
    this.uname = uname;
  }


  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }

  @Override
  public String toString() {
    return "TUser{" +
            "id=" + id +
            ", uname='" + uname + '\'' +
            ", pwd='" + pwd + '\'' +
            '}';
  }
}
