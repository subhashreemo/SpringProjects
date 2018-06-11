package com.split.configuration;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.instrument.classloading.InstrumentationLoadTimeWeaver;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@EnableWebMvc
//@EnableLoadTimeWeaving(aspectjWeaving = EnableLoadTimeWeaving.AspectJWeaving.ENABLED)
@ComponentScan("com.split")
public class ApplicationConfiguration extends AnnotationConfigWebApplicationContext{
//public class ApplicationConfiguration{
//	@Bean
/*public InstrumentationLoadTimeWeaver loadTimeWeaver()  throws Throwable {
		System.out.println("calling ApplicationConfiguration");
	    InstrumentationLoadTimeWeaver loadTimeWeaver = new InstrumentationLoadTimeWeaver();
	    return loadTimeWeaver;
}*/
	
}
