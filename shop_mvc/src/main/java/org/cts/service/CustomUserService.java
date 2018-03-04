package org.cts.service;

import org.cts.dao.UserDAOImpl;
import org.cts.domain.CustomUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserService implements UserDetailsService {
	@Autowired
	private UserDAOImpl userDao;

	public CustomUser loadUserByUsername(String username)
			throws UsernameNotFoundException {
		return userDao.loadUserByUsername(username);
	}
}
