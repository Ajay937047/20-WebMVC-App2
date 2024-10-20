package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import in.ashokit.entity.StudentEntity;

@Repository 
@EnableTransactionManagement
public interface StudentRepo extends JpaRepository<StudentEntity, Serializable>{

	
	
	
}
