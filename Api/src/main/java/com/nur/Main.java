package com.nur;

import com.nur.messenger.factories.ICommendFactory;
import com.nur.messenger.factories.IUserFactory;
import com.nur.repositories.reviews.ReviewCrudRepositoryImpl;
import com.nur.repositories.users.IUsersCrudRepository;
import com.nur.repositories.users.UsersCrudRepositoryImpl;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication()
@EnableJpaRepositories(basePackages = { "com.nur.repositories" })
@OpenAPIDefinition(info = @Info(title = "Domain", version = "1.0.0"))
@EntityScan(basePackages = { "com.nur.model" })
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Primary
    @Bean(name = "usersRepository")
    public IUserFactory usersRepository(){ return new UsersCrudRepositoryImpl(); }

    @Primary
    @Bean(name = "reviewRepository")
    public ICommendFactory reviewRepository(){ return new ReviewCrudRepositoryImpl(); }




}
