package com.green.petfirst.security;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Role {
	
	ADMIN("관리자"),
	PETFIR("회원");

	private final String roleName;
	
	public final String roleName() {
		
		return roleName;
	}
	
}
