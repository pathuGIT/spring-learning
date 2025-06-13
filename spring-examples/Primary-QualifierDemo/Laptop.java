import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // This bean will be injected by default if @Qualifier is not used
public class Laptop implements Computer {
    public void compile() {
        System.out.println("Compiling with 404 bugs but faster (Laptop)");
    }
}