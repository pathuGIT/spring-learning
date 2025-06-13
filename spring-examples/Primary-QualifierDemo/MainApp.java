import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MainApp {

    @Autowired
    @Qualifier("desktop") // Comment this out to use the @Primary bean
    private Computer computer;

    public void run() {
        computer.compile();
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        MainApp app = context.getBean(MainApp.class);
        app.run();
    }
}