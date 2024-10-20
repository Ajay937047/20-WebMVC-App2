package in.ashokit.binding;

import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Data
public class StudentRegistrationBinding {
	
	private Integer studentid;
	
	private String studentFirstName;
	
	private String studentLastName;
	
	private String studentEmail;
	
	private Long studentphno;
	
	private Date studentDateOfBirth;
	
	private String studentGender;
	
	private Integer studentCountry;
	
	private Integer studentState;
	
	private Integer studentCity;
	
	private Integer studentPWD;
	
	private String studentAccStatus;
	
	@CreationTimestamp
    private Date studentCreateDate;
    
	@UpdateTimestamp
    private Date studentUpdateDate;
    

}
