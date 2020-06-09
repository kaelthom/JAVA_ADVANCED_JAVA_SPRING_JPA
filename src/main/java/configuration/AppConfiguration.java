package configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("com.advancedjava.springjpa.repository")
@ComponentScan(basePackages = "com.advancedjava.springjpa")
@Import(JpaConfiguration.class)
public class AppConfiguration {
}
