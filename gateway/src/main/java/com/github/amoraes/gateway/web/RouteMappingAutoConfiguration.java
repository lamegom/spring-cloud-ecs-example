package com.github.amoraes.gateway.web;

import org.springframework.cloud.netflix.zuul.filters.discovery.PatternServiceRouteMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteMappingAutoConfiguration {

  	@Bean
	public PatternServiceRouteMapper serviceRouteMapper() {
		return new PatternServiceRouteMapper(
				"(?<name>.+)(-service-)(?<version>v.*$)",
				"${version}/${name}");
	}

}
