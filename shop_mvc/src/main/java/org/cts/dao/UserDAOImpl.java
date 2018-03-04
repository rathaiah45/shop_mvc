package org.cts.dao;

import java.util.ArrayList;
import java.util.List;

import org.cts.domain.CustomUser;
import org.cts.domain.Role;

public class UserDAOImpl {
	public CustomUser loadUserByUsername(final String username) {
		CustomUser user = new CustomUser();
		user.setFirstName("kb");
		user.setLastName("gc");
		user.setUsername("admin");
		user.setPassword("1234");
		Role r = new Role();
		r.setName("ROLE_USER");
		List<Role> roles = new ArrayList<Role>();
		roles.add(r);
		user.setAuthorities(roles);
		return user;
	}

}
