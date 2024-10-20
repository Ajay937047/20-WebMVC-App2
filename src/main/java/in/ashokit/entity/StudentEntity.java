package in.ashokit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "MVC_Student")

public class StudentEntity {
	
	@Id
	@Column(name = "ID")
	private Integer stdId;
	
	@Column(name = "STUDENT_NAME")
	private String stdName;
	
	@Column(name = "LOCATION")
	private String location;
	
	@Column(name = "COLLAGE_NAME")
	private String collageName;


}
