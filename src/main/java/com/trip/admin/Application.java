package com.trip.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//@EnableJpaAuditing
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }

/*    #spring.jpa.properties.hibernate.dialect.storage_engine=innodb
#spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.H2Dialect
#spring.datasource.hikari.jdbc-url=jdbc:h2:mem://localhost/~/test;MODE=MYSQL*/

}
