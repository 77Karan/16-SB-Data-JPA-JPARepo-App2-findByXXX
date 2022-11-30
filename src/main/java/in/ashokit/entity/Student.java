package in.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="STUDENT_DTLS")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Student 
{
	@Id
	@Column(name="STUDENT_ID")
	private Integer studentID;
	@Column(name="STUDENT_NAME")
	private String studentName;
	@Column(name="STUDENT_EMAIL")
	private String studentEmail;
	@Column(name="STUDENT_AGE")
	private Integer studentAge;
	

}
