package com.service.register.wrappers.request;

import java.io.Serializable;

public class RegisterRequest implements Serializable{

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("RegisterRequest{");
        sb.append("username='").append(username).append('\'');
        sb.append('}');
        return sb.toString();
    }



}
