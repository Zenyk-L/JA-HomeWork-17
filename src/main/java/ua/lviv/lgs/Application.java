package ua.lviv.lgs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ua.lviv.lgs.domain.Univercity;
import ua.lviv.lgs.service.UnivercityService;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Application.class);
        UnivercityService service = context.getBean(UnivercityService.class);

//        Univercity univercity = new Univercity();
//        univercity.setName("First");
//        univercity.setAdress("Lviv");
//        univercity.setInstitut(20);
//        univercity.setLevel("High");
//        univercity.setStudent(1500);
//
//        service.save(univercity);
//
//        Univercity univercity2 = new Univercity();
//        univercity2.setName("Second");
//        univercity2.setAdress("Rivne");
//        univercity2.setInstitut(20);
//        univercity2.setLevel("Midle");
//        univercity2.setStudent(1000);
//
//        service.save(univercity2);
//
//        Univercity univercity3 = new Univercity();
//        univercity3.setName("Third");
//        univercity3.setAdress("Kyiv");
//        univercity3.setInstitut(30);
//        univercity3.setLevel("High");
//        univercity3.setStudent(5000);
//
//        service.save(univercity3);
//
//        Univercity univercity4 = new Univercity();
//        univercity4.setName("Fourth");
//        univercity4.setAdress("Odesa");
//        univercity4.setInstitut(10);
//        univercity4.setLevel("Low");
//        univercity4.setStudent(500);
//
//        service.save(univercity4);

        service.findAll().stream().forEach(System.out::println);

        Univercity tempUnivercity = service.findById(9L);
        System.out.println(tempUnivercity);
        tempUnivercity.setName("1-st");
        service.update(tempUnivercity);

        System.out.println("By Level");
        service.findByLevel("High").stream().forEach(System.out::println);
        System.out.println("By Institut");
        service.findByInstitut(10).stream().forEach(System.out::println);
        System.out.println("By Student");
        service.findByStudent(500).stream().forEach(System.out::println);
        System.out.println("By Adress");
        service.findByAdress("Rivne").stream().forEach(System.out::println);
        context.close();
    }
}
