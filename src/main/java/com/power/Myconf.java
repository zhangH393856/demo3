package com.power;

import com.power.interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName: Myconf
 * @Description: TODO
 * @Author: lenovo
 * @Date: 15:37 2021/7/26
 * @Version 1.0
 **/
@Configuration
public class Myconf implements WebMvcConfigurer {
    private static final List<String> EXCLUDE_PATH= Arrays.asList("/","/dist/css/**","/dist/js/**","/dist/img/**","/dist/modules/**");


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
      registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**").excludePathPatterns("/login").excludePathPatterns("/register")
              .excludePathPatterns("/loginuser").excludePathPatterns("/openregister")
      .excludePathPatterns(EXCLUDE_PATH);
    }
}
