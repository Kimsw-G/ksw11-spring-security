package com.example.ksw09.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()// 기본 제약조건들을 설정한다
                .antMatchers("/**").permitAll() // 해당 페이지는 아무 제약없이 접근 가능!
                .antMatchers("/admin/**").hasRole("USER") // 해당 페이지는 "USER" 권한?인증?이필요하다
                .anyRequest().authenticated() // 나머지 인증들에 대해 요청을 요구
                .and()
            .formLogin() // 로그인이 필요한 페이지로 가면, 이 곳으로 리다이렉트 된다!
                .loginPage("/login").permitAll()
                .and()
            .logout();
    }
}
