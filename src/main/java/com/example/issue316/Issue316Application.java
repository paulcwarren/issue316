package com.example.issue316;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.versions.jpa.config.JpaLockingAndVersioningConfig;

import internal.org.springframework.content.commons.config.StoreFragments;

@SpringBootApplication
public class Issue316Application {

	public static void main(String[] args) {
		SpringApplication.run(Issue316Application.class, args);
	}
	
	@Configuration
	@Import(JpaLockingAndVersioningConfig.class)
	public static class Config implements InitializingBean {
	    
	    @Autowired
	    private StoreFragments fragments;

        @Override
        public void afterPropertiesSet() throws Exception {
            int i=0;
        }
	}
}
