package com.ivoronline.springboot_accessories_bean_destroy_destroymethod;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

  //PERSON
  @Bean(destroyMethod = "destroy")
  public Person person() {
    return new Person();
  }

}
