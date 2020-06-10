import com.application.model.IMusician;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.Scanner;

public class SpringApplication {

    @Autowired
    @Qualifier("pianist")
    IMusician musician;

    public void run(AbstractApplicationContext context) {
        if (musician == null) {
            Scanner sc = new Scanner(System.in);
            musician = (IMusician) context.getBean(sc.nextLine());
        }

        System.out.println(musician);

        musician.play();
    }
}
