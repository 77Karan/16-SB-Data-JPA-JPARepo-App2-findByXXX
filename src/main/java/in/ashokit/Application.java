package in.ashokit;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Student;
import in.ashokit.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context =SpringApplication.run(Application.class, args);
		StudentRepository repo = context.getBean(StudentRepository.class);
		
		/*System.out.println("=====Noramal predefined method========");
		List<Student> students = repo.findAll();
		for(Student student : students)
		{
			System.out.println(student);
		}
		System.out.println("=====Normal predefined method========");*/
		
		/*System.out.println("=======findByStudentAge()==============");
		List<Student> students = repo.findByStudentAge(19);
		for(Student student : students)
		{
			System.out.println(student);
		}
		System.out.println("=======findByStudentAge()==============");*/

		/*System.out.println("=======findByStudentAgeGreatherthanEqual()==============");
		List<Student> students = repo.findByStudentAgeGreaterThanEqual(13);
		for(Student student : students)
		{
			System.out.println(student);
		}
		System.out.println("=======findByStudentAgGreaterthanEqual()==============");*/
		
		/*System.out.println("=======findByStudentAgeIn()==============");
		List<Student> students = repo.findByStudentAgeIn(Arrays.asList(13,19));
		for(Student student : students)
		{
			System.out.println(student);
		}
		System.out.println("=======findByStudentAgeIn()==============");*/
		
		System.out.println("=======findByStudentNameAndStudentAge()==============");
		List<Student> students = repo.findByStudentNameAndStudentAge("RASHID",19);
		for(Student student : students)
		{
			System.out.println(student);
		}
		System.out.println("=======findByStudentNameAndStudentAge()==============");

		
		
		
	}

}
