package com.example.springSecuritySample.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.example.springSecuritySample.entity.UserAccount;
import com.example.springSecuritySample.mapper.UserAccountMapper;

public class SampleUserDetailsService implements UserDetailsService {

	@Autowired
	UserAccountMapper mapper;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserAccount user = mapper.getAccount(Integer.valueOf(username));
		if (user == null) {
			throw new UsernameNotFoundException("not found : " + username);
		}
		// TODO 自動生成されたメソッド・スタブ
		return (new SampleUserDetails(user));
	}

}
