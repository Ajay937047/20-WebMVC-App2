package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.StudentRegistrationEntity;

public interface UnlockRepository extends JpaRepository<StudentRegistrationEntity, Serializable>{
	
	public StudentRegistrationEntity findByStudentEmail(String studentEmail);

}
