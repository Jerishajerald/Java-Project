//package com.example.demo.security;
//
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//@Configuration
//@EnableGlobalMethodSecurity(jsr250Enabled = true)//method level security
//public class SecurityConfig extends WebSecurityConfigurerAdapter{
//@Autowired
//DataSource dataSource;
//
//@Autowired
//  BCryptPasswordEncoder encoder;
//
//	
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		
//		String sql="select u.user_name,a.authority from Jeri_authority a"
//				+ ",JERI_USER u where u.user_name=? AND u.user_name=a.username";
//		
//		auth.jdbcAuthentication().dataSource(dataSource).usersByUsernameQuery("select user_name,password,enabled from JERI_USER where user_name=?")
//		.authoritiesByUsernameQuery(sql).passwordEncoder(encoder);
//		
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeHttpRequests()
//		.antMatchers("api/v1/add")
//		.authenticated()
//		.and()
//		.httpBasic();	
//		
//	}
//	
//
//
//}
