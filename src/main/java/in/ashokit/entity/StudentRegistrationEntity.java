package in.ashokit.entity;

import java.sql.Date;
import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name ="STUDENT_REGISTRATION")
@Entity
@Data
public class StudentRegistrationEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="STUDENT_ID")
	private Integer studentid;
	
	@Column(name="STUDENT_FIRST_NAME")
	private String studentFirstName;
	
	@Column(name="STUDENT_LAST_NAME")
	private String studentLastName;
	
	@Column(name="STUDENT_EMAIL", unique = true)
	private String studentEmail;
	
	@Column(name="STUDENT_PHNO")
	private Long studentphno;
	
	@Column(name="STUDENT_DOB")
	private Date studentDateOfBirth;
	
	@Column(name="USER_GENDER")
	private String studentGender;
	
	@Column(name="STUDENT_COUNTRY")
	private Integer studentCountry;
	
	@Column(name="STUDENT_STATE")
	private Integer studentState;
	
	@Column(name="USER_CITY")
	private Integer studentCity;
	
	@Column(name="STUDENT_PWD")
	private Integer studentPWD;
	
	@Column(name="STUDENT_ACC_STATUS")
	private String studentAccStatus;
	
	@Column(name="CREATED_DATE", columnDefinition = "TIMESTAMP",nullable = false, updatable = false)
	@CreationTimestamp
    private Date studentCreateDate;
    
	@Column(name="UPDATED_DATE", columnDefinition = "TIMESTAMP")
	@UpdateTimestamp
    private Date studentUpdateDate;

	
	
}
