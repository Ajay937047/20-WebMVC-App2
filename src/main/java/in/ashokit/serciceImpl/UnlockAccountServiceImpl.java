package in.ashokit.serciceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.constant.WebConstant;
import in.ashokit.entity.StudentRegistrationEntity;
import in.ashokit.repository.UnlockRepository;
import in.ashokit.service.UnlockAccountService;



@Service
public class UnlockAccountServiceImpl implements UnlockAccountService {

	@Autowired
	private UnlockRepository unlockRepository;

	public UnlockAccountServiceImpl(UnlockRepository unlockRepository) {
		this.unlockRepository = unlockRepository;
	}

	@Override
	public String unloackService(String studentEmail) {
		
			StudentRegistrationEntity student = unlockRepository.findByStudentEmail(studentEmail);
		
			if(student==null) {
				return WebConstant.INVALID_EMAIL_ID;
			}

		if (student.getStudentAccStatus().equals(WebConstant.UNLOCK)) {
			return WebConstant.ACCOUNT_IS_ALREADY_UNLOCK;
			
		} else if (student != null && !student.getStudentAccStatus().equals(WebConstant.UNLOCK)) {
			
				student.setStudentAccStatus(WebConstant.UNLOCK);
					StudentRegistrationEntity save = unlockRepository.save(student);
					if(save != null) {
						return WebConstant.ACCOUNT_UNLOCK_SUCCESS;
					}
					
				}
			
		return null;
	}
	
}
	
