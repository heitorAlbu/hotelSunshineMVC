package org.hotelSunshine.conf;

import org.hotelSunshine.controllers.HomeController;
import org.hotelSunshine.controllers.QuartoController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import dao.QuartoDAO;

//annotation que serve para habilitar o web MVC no nosso projeto
@EnableWebMvc
//informar o pacote de controllers
//@ComponentScan(basePackages= {"org.hotelSunshine.controllers"})
@ComponentScan(basePackageClasses= {QuartoController.class, QuartoDAO.class})
public class AppWebConfiguration {
	
	//método que retorna a InternalResourceViewResolver que é uma classe nativa do spring
	@Bean // Annotation nativa do Spring(Classe de retorno gerenciada pelo spring)
	public InternalResourceViewResolver InternalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();//instância
		resolver.setPrefix("/WEB-INF/Views/");//seta o prefixo
		resolver.setSuffix(".jsp");//seta o sufixo(padrão de página dinâmica do JAVA)
		return resolver;
	}
}
