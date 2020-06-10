import com.application.config.AppConfig;
import com.application.model.Guitarist;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Application {


    public static void main(String[] args){

 //       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-context.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

      //  Guitarist guitarist = (Guitarist)context.getBean("guitarist");
      //  guitarist.play();

      /*  Scanner sc = new Scanner(System.in);
        System.out.println("Who should play? pianist/guitarist: ");
        String choice = sc.nextLine();
        if("pianist".equals(choice) || "guitarist".equals(choice)) {
            IMusician musician = (IMusician) conf.getBean(choice);
            musician.play();

        }else{
            System.out.println("Wrong musician...");
        }*/

        context.getBeanFactory().createBean(SpringApplication.class).run(context);
        context.close();
    }
}
