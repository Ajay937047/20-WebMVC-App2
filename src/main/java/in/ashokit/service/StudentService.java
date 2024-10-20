package in.ashokit.service;

import java.util.List;

import in.ashokit.entity.StudentEntity;
import in.ashokit.entity.StudentRegistrationEntity;

public interface StudentService {

	List<StudentEntity> getstudentlist();
	
	List<StudentRegistrationEntity> getRegisterList();
}
