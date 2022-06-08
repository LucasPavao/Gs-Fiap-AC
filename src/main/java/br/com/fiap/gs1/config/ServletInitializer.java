package br.com.fiap.gs1.config;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import br.com.fiap.gs1.Gs1Application;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder gs1Application) {
		return gs1Application.sources(Gs1Application.class);
	}

}
