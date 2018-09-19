package com.example.config;


import com.example.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan("com.example")
@PropertySource(value = {"classpath:jdbc.properties"})
public class IocConfig {
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private  String url;
    @Value("${jdbc.username}")
    private  String username;
    @Value("${jdbc.password}")
    private  String password;

    @Override
    public String toString() {
        return "IocConfig{" +
                "driver='" + driver + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    @Bean
    public DataSource dataSource() {
         DataSource dataSource =new DataSource();
         dataSource.setDriver(driver);
         dataSource.setUrl(url);
         dataSource.setUsername(username);
         dataSource.setPassword(password);
         return  new DataSource();
    }


}
