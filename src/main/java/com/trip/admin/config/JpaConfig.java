package com.trip.admin.config;

//스프링 시큐어 테스트 연동을 위한 EnableJpaAuditing 추가

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing
public class JpaConfig {
}
