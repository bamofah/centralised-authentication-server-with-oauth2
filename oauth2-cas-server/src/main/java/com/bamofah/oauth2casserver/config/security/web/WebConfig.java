package com.bamofah.oauth2casserver.config.security.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"com.bamofah.oauth2casserver."})
public class WebConfig implements WebMvcConfigurer {


    @Bean
    public DataSource dataSource() {
        EmbeddedDatabase db = new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2)
                .setName("cas-server-db")
                .addScript("db/initial-db-table.sql")
                .addScript("db/user-and-authorities.sql")
                .addScript("db/insert-client-data.sql")
                .addScript("db/insert-user-and-authorities-data.sql")
                .build();

        return db;
    }
}
