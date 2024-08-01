package com.ivoronline.springboot_accessories_bean_destroy_destroymethod;

public class Person {

  //PROPERTIES
  public String name;
  
  //CONSTRUCTOR
  Person() {
    System.out.println("Person Created");
  }
  
  //DESTROY
  public void destroy() {
    System.out.println("Person Destroyed");
  }

}
