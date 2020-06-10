import com.application.dao.UserDao;
import com.application.model.IMusician;
import com.application.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.Scanner;

public class SpringApplication {

    @Autowired
    @Qualifier("pianist")
    IMusician musician;

    @Autowired
    UserDao userDao;

    public void run(AbstractApplicationContext context) {
        if (musician == null) {
            Scanner sc = new Scanner(System.in);
            musician = (IMusician) context.getBean(sc.nextLine());
        }

     /*   System.out.println(musician);
        musician.play();
     */

        System.out.println(userDao.findUser("John"));
        userDao.addUser(new User("Jacky", "Doe",2000));
    }
}
