package in.ashokit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>
{
	//select * from student_dtls where studentAge=:age;
	public List<Student> findByStudentAge(Integer age);
	
	//select * from student_dtls where studentAge>=:age;
	public List<Student> findByStudentAgeGreaterThanEqual(Integer are);
	
	//select * from student_dtls where studentgeIn(:age,:age,..);
	public List<Student> findByStudentAgeIn(List<Integer> age);
	
	//select * from student_dtls where studentName=:name and studentAge=:age;
	public List<Student> findByStudentNameAndStudentAge(String name,Integer age);

}
