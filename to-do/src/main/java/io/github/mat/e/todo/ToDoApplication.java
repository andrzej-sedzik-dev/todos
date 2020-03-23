package io.github.mat.e.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@SpringBootApplication
public class ToDoApplication implements RepositoryRestConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(ToDoApplication.class, args);
	}


	// RepositoryRestConfigurer
	// dodaje nam metody - dzięki którym możemy symulowac klienta (frontend)

	@Bean
	Validator validator() {
		return new LocalValidatorFactoryBean();
	}


	// obiekt zwrócony z tej metody typu Validator, będzie klasą zarządzaną przez Springa tak ja np. Repozytorium.
	@Override
	public void configureValidatingRepositoryEventListener(ValidatingRepositoryEventListener validatingListener) {
		validatingListener.addValidator("beforeCreate", validator());
		validatingListener.addValidator("beforeSave", validator());
	}




}
