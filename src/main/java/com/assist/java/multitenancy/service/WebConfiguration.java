package com.assist.java.multitenancy.service;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfiguration {

  @Bean
  public FilterRegistrationBean<TenantFilter> tenantFilter() {
    FilterRegistrationBean<TenantFilter> registrationBean = new FilterRegistrationBean<>();
    registrationBean.setFilter(new TenantFilter());
    registrationBean.addUrlPatterns("/api/v1/choirs/*");
    return registrationBean;
  }
}
