package in.ashokit.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class MySecurityConfig {

	@Value("${app.security.user1.username}")
	private String user1Username;

	@Value("${app.security.user1.password}")
	private String user1Password;

	@Value("${app.security.user1.roles}")
	private String user1Roles;

	@Value("${app.security.user2.username}")
	private String user2Username;

	@Value("${app.security.user2.password}")
	private String user2Password;

	@Value("${app.security.user2.roles}")
	private String user2Roles;

	@Bean
	public UserDetailsService userDetailsService() {
		UserDetails user1 = User.withUsername(user1Username).password(passwordEncoder().encode(user1Password))
				.roles(user1Roles.split(",")).build();

		UserDetails user2 = User.withUsername(user2Username).password(passwordEncoder().encode(user2Password))
				.roles(user2Roles.split(",")).build();

		return new InMemoryUserDetailsManager(user1, user2);
	}

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeRequests().anyRequest().authenticated().and().formLogin().permitAll().and().logout().permitAll();
		return http.build();
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	
	 
	
}
