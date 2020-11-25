import com.kuang.pojo.userT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testT {
    public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
      userT userT = (com.kuang.pojo.userT) context.getBean("user");
      userT.show();

    }
}
