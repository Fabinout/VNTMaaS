package atlantic2.transaction.spring.infrastructure;

import atlantic2.transaction.controller.VaNiquerTaMereController;
import atlantic2.transaction.services.NiquageDeMere;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "atlantic2.transaction.presentation.ressource")
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
