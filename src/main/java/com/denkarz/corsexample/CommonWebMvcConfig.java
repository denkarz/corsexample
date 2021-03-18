//package com.denkarz.corsexample;
//
//import lombok.Setter;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.lang.NonNull;
//import org.springframework.web.method.support.HandlerMethodArgumentResolver;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//import java.util.Arrays;
//import java.util.List;
//
//@Configuration
//@EnableWebMvc
//public class CommonWebMvcConfig implements WebMvcConfigurer {
//    private final String[] allowedOrigins = {"*","null"};
//    @Override
//    public void addCorsMappings(@NonNull CorsRegistry registry) {
//        unsiCorsConfigurer().addCorsMappings(registry);
//    }
//
//    @Bean
//    public CorsConfigurer unsiCorsConfigurer() {
//        return registry -> {
//            registry.addMapping("/cors/*/")
//                    .allowedMethods("GET", "POST", "PUT", "DELETE")
//                    .allowedOrigins(allowedOrigins)
//            .allowedHeaders("*");
//        };
//    }
//
//    @Override
//    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
//    }
//
//    public interface CorsConfigurer {
//        void addCorsMappings(CorsRegistry registry);
//    }
//}
