import com.advancedjava.springjpa.SpringApplication;
import configuration.AppConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
    public static void main(String[] args) {

        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        context.getBeanFactory().createBean(SpringApplication.class).run();
        context.close();
    }
}
