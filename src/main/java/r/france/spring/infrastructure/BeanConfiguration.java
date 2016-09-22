package r.france.spring.infrastructure;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import r.france.controller.VaNiquerTaMereController;
import r.france.services.NiquageDeMere;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "r.france.presentation.ressource")
class BeanConfiguration {

    @Bean
    public NiquageDeMere niquageDeMere() {
        return new NiquageDeMere();
    }

    @Bean
    public VaNiquerTaMereController vaNiquerTaMereController() {
        return new VaNiquerTaMereController(niquageDeMere());
    }
}
