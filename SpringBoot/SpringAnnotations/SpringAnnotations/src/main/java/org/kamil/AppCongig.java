package org.kamil;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.kamil")
public class AppCongig {

/*    @Bean
    public Samsung getPhone(){ //exchange for beans in xml
        return new Samsung();
    }
    @Bean
    public MobileProcessor getProcessor(){
        return new Snapdragon();
    }*/
}
