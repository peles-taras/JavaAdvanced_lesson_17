package ua.lviv.lgs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ua.lviv.lgs.domain.University;
import ua.lviv.lgs.service.UniversityService;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		UniversityService service = ctx.getBean(UniversityService.class);

		University university1 = new University("some name 1", "level 1",11, 1000, "some adress 1");
//		University university2 = new University("some name 2", "level 2",12, 2000, "some adress 2");
//		University university3 = new University("some name 3", "level 3",13, 3000, "some adress 3");
//		University university4 = new University("some name 4", "level 4",14, 4000, "some adress 4");
//	
		service.save(university1);
//		service.save(university2);
//		service.save(university3);
//		service.save(university4);

		dash("find single university by id");
		System.out.println(service.findById(1));

//		University toUpgrade = service.findById(3);
//		toUpgrade.setName("upgraded name");
//		toUpgrade.setAdress("upgraded adress");
//		toUpgrade.setInstitutesQuantity(6969);

//		service.update(toUpgrade);

//		service.deleteById(4);
		dash("find all after updating & removing");
		service.findAll().stream().forEach(System.out::println);

		dash("find by accreditation level");
		System.out.println(service.findByAccreditationLevel("level 3"));

		dash("find by adress");
		System.out.println(service.findByAdress("some adress 1"));

		dash("find by student quantity");
		System.out.println(service.findByStudentsQuantity(2000));

	}

	private static void dash(String text) {
		System.out.println("------------- " + text + " ------------------------->");
	}

}
