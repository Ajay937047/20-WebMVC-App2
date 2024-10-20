package in.ashokit.serciceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.StudentRegistrationEntity;
import in.ashokit.repository.UnlockRepository;
import in.ashokit.service.StudentLoginService;

@Service
public class StudentLoginServiceIMPL  implements StudentLoginService{

	
	@Autowired
	private UnlockRepository unlockRepository;
	
	public StudentLoginServiceIMPL(UnlockRepository unlockRepository) {
		this.unlockRepository=unlockRepository;
	}
	
	@Override
	public StudentRegistrationEntity loginStudent(StudentRegistrationEntity entity) {
		
		if(entity.getStudentEmail()!=null && !entity.getStudentEmail().equals("")) {
			String studentEmail = entity.getStudentEmail();
			
			StudentRegistrationEntity studentObject = unlockRepository.findByStudentEmail(studentEmail);
			if(studentObject.getStudentAccStatus().equals("UNLOCK")) {
				return studentObject;
			}else {
				return null;
			}
			
		}
		
		return null;
	}

}
