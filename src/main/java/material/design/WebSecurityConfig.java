package material.design;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	DataSource dataSource;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
				.antMatchers("/country").authenticated()
				.antMatchers("/admin").hasRole("ADMIN")
				.anyRequest().permitAll()
				.and()
			.exceptionHandling()
				.accessDeniedPage("/login?denied")
				.and()
			.formLogin()
				.loginPage("/login")
				.permitAll()				
				.and()
			.logout()
				.permitAll();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().withUser("user").password("password").roles("USER");
		
		auth
			.jdbcAuthentication()
				.dataSource(dataSource)
				.passwordEncoder( new Md5PasswordEncoder());
	}
	
	
	
	

}
