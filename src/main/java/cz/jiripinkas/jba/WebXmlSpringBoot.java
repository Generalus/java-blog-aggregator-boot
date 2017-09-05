package cz.jiripinkas.jba;

import cz.jiripinkas.jba.service.ConfigurationInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebXmlSpringBoot extends WebMvcConfigurerAdapter {

    @Autowired
    private ConfigurationInterceptor configurationInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(configurationInterceptor);
    }

}
