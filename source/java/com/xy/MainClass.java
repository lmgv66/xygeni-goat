package com.xy;


import org.springframework.beans.CachedIntrospectionResults;
import org.springframework.beans.BeanUtils;

public class MainClass {

  public static void main(String[] args) {
    CachedIntrospectionResults.acceptClassLoader(MainClass.class.getClassLoader());
    BeanUtils.getPropertyDescriptors(MainClass.class);
  }

}
