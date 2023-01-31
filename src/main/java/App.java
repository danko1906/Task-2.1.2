import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHello = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanHello2 = (HelloWorld) applicationContext.getBean("helloworld");
        Cat beanCat = (Cat) applicationContext.getBean("cat");
        Cat beanCat2 = (Cat) applicationContext.getBean("cat");

        System.out.println(beanHello.getMessage());
        System.out.println(beanHello2.getMessage());
        System.out.println(beanCat.getName());
        System.out.println(beanCat2.getName());

        System.out.println(beanHello.equals(beanHello2));
        System.out.println(beanCat.equals(beanCat2));
    }
}