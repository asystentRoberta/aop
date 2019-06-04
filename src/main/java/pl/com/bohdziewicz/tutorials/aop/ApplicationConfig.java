package pl.com.bohdziewicz.tutorials.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("pl.com.bohdziewicz.tutorials.aop")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ApplicationConfig {

}
