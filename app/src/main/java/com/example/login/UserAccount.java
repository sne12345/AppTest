package com.example.login;

//사용자 계정 정보 모델 클래스
public class UserAccount {
    private String Idtoken;//firebase 고유정보
    private String emailId;
    private String password;

    public UserAccount() { }

    public String getIdtoken() {
        return Idtoken;
    }

    public void setIdtoken(String idtoken) {
        Idtoken = idtoken;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
