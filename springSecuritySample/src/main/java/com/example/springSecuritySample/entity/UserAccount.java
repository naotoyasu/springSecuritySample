package com.example.springSecuritySample.entity;

import java.io.Serializable;

public record UserAccount(int accountId,String password) implements Serializable{

}
