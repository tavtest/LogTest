import knights.BraveKnight;
import knights.Knight;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LogTestApplication {

    public static void main(String... args)
    {

        System.out.println("Starting LogTestApplication...");

        ApplicationContext context = new ClassPathXmlApplicationContext("LogTestConfig.xml");
// Получение компонента knight
//        BraveKnight knight = (BraveKnight) context.getBean("knight");
// Использование компонента knight
//        knight.embarkOnQuest();
    }
}
