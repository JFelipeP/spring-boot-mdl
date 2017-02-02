package material.design.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import material.design.model.UsersAndAuthorities;

public class UsersRepositoryImpl implements UsersAndAuthoritiesJdbc {
	
	private final JdbcTemplate jdbc;	
	private static final String SELECT_USERS_WITH_AUTHORITIES = "select users.username, users.password, users.enabled, authorities.authority from users, authorities where users.username = authorities.username";

	@Autowired
	public UsersRepositoryImpl(JdbcTemplate jdbc) {		
		this.jdbc = jdbc;
	}

	@Override
	public List<UsersAndAuthorities> JdbcFindUsersWithAuthorities() {
		
		return jdbc.query(SELECT_USERS_WITH_AUTHORITIES, (rs, row) -> {
			String username = rs.getString(1);
			String password = rs.getString(2);
			boolean enabled = rs.getBoolean(3);
			String authority = rs.getString(4);
			return new UsersAndAuthorities(username, password, enabled, authority);
			
		});
	}

}
