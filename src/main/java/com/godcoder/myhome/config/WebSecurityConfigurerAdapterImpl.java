package com.godcoder.myhome.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

//@Configuration
//@EnableWebSecurity
public class WebSecurityConfigurerAdapterImpl extends WebSecurityConfigurerAdapter {

    @Autowired
    DataSource dataSource;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((requests) -> requests
                        .antMatchers("/", "/h2/**").permitAll()
                        .anyRequest().authenticated()
                )
                .formLogin((form) -> form
                        .loginPage("/account/login")
                        .permitAll()
                )
                .logout((logout) -> logout.permitAll())
                .csrf().disable()
                .headers().frameOptions().disable()
        ;
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth)
            throws Exception {
        auth.jdbcAuthentication()
                .dataSource(dataSource)
                .passwordEncoder(this.passwordEncoder())
                .usersByUsernameQuery("select username, password, enabled "
                        + "from user_table  "
                        + "where username = ?")
                .authoritiesByUsernameQuery("select username, name "
                        + "from user_role ur inner join user_table u on ur.user_id = u.id "
                        + "inner join role r on ur.role_id = r.id "
                        + "where username = ?");
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}