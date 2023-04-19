package com.example.springSecuritySample.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.springSecuritySample.entity.UserAccount;

@Mapper
public interface UserAccountMapper {
	public UserAccount getAccount(int accountId);
}
