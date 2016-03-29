package com.sapient.ai.media.planner.security;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class MediaAppSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private AuthenticationProvider authenticationProvider;

	@Bean
	public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
		Properties props = new Properties();
		props.put("arvind", "test,ROLE_USER,enabled");
		return new InMemoryUserDetailsManager(props);
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//auth.authenticationProvider(authenticationProvider);
		auth.userDetailsService(inMemoryUserDetailsManager());
	}

}
