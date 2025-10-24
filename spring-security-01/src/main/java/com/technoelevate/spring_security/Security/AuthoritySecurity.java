package com.technoelevate.spring_security.Security;

import com.technoelevate.spring_security.entity.Authority;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

@RequiredArgsConstructor
public class AuthoritySecurity implements GrantedAuthority {

    private final Authority authority;

    @Override
    public String getAuthority() {
        return authority.getName();
    }
}
