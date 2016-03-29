package com.sapient.ai.media.planner.security;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component
public class MediaAppAuthenticationProvider implements AuthenticationProvider{

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		return new UsernamePasswordAuthenticationToken(authentication.getPrincipal(),authentication.getCredentials());
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return true;
	}

}
