package com.flight.project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("sai").password("password2").roles("USER");
		auth.inMemoryAuthentication().withUser("team6").password("team6").roles("ADMIN");
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	http.csrf().disable();
		http.authorizeRequests().antMatchers("/api/user/**").hasAnyRole("USER").anyRequest().fullyAuthenticated().and().httpBasic();
	//	http.authorizeRequests().antMatchers("/api/Admin/**").hasAnyRole("ADMIN").anyRequest().fullyAuthenticated().and().httpBasic();
		}

	protected void configure1(HttpSecurity http) throws Exception {
	http.csrf().disable();
	//	http.authorizeRequests().antMatchers("/api/user/**").hasAnyRole("USER").anyRequest().fullyAuthenticated().and().httpBasic();
		http.authorizeRequests().antMatchers("/api/Admin/**").hasAnyRole("ADMIN").anyRequest().fullyAuthenticated().and().httpBasic();
		}

	
	
	@SuppressWarnings("deprecation")
	@Bean
	public static NoOpPasswordEncoder passwordEncoder() {
		return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
	}

}
