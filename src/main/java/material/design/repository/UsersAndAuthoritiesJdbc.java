package material.design.repository;

import java.util.List;

import material.design.model.UsersAndAuthorities;

public interface UsersAndAuthoritiesJdbc {
	
	public List<UsersAndAuthorities> JdbcFindUsersWithAuthorities();	

}
