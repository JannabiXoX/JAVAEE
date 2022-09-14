import dao.UserDaoOrc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;
import service.UserServiceImpl;

public class test {
    public static void main(String[] args) {
//        UserService service = new UserServiceImpl();
//        service.getUser();
//        UserServiceImpl service = new UserServiceImpl();
//        service.setUserDao(new UserDaoOrc());
//        service.getUser();
        ApplicationContext context =  new ClassPathXmlApplicationContext("beans.xml");

        UserServiceImpl service = (UserServiceImpl) context.getBean("service");

        service.getUser();



    }
}
