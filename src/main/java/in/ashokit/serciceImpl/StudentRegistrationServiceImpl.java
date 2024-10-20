package in.ashokit.serciceImpl;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.binding.StudentRegistrationBinding;
import in.ashokit.constant.WebConstant;
import in.ashokit.entity.StudentRegistrationEntity;
import in.ashokit.exceptionHandler.RegAppException;
import in.ashokit.repository.StudentRegistrationRepository;
import in.ashokit.service.StudentRegistrationService;
import in.ashokit.utils.StudentEmailUtils;

@Service
public class StudentRegistrationServiceImpl implements StudentRegistrationService{
	
	
	@Autowired
	private StudentRegistrationRepository studentRegistrationRepository;
	
	
	@Autowired
	private StudentEmailUtils studentEmailUtils;
	
	public StudentRegistrationServiceImpl(StudentRegistrationRepository studentRegistrationRepository) {
		this.studentRegistrationRepository = studentRegistrationRepository;
	}
	

	@Override
	public StudentRegistrationEntity registerUser(StudentRegistrationBinding student) {

		StudentRegistrationEntity entity = new StudentRegistrationEntity();

		
		if (student!= null && !student.equals("")) {
			
			student.setStudentAccStatus(WebConstant.LOCKED);
			student.setStudentPWD(generatePWD());

			
			BeanUtils.copyProperties(student, entity);
             
			StudentRegistrationEntity save = studentRegistrationRepository.save(entity);

			System.out.println("Student object:: IMPL"+entity);
			if (null != save.getStudentid()) {

				sendEmail(student);

				return save;

			}
		}
		return null;

	}

	private boolean sendEmail(StudentRegistrationBinding student) {
		boolean emailSend = false;
		String subject = WebConstant.USER_REGISTRATION_SUCCESS;
		String body = readMailBody(WebConstant.UNLOCK_ACC_EMAIL_BODY_TEMPLATE_TXT, student);

		studentEmailUtils.sendMail(subject, body, student.getStudentEmail());

		return emailSend;
	}

	public String readMailBody(String fileName, StudentRegistrationBinding student) {
		String mailBody = null;
		StringBuffer buffer = new StringBuffer();
		Path path = Paths.get(fileName);
		try (Stream<String> stream = Files.lines(path)) {
			stream.forEach(line -> {
				buffer.append(line);
			});
			mailBody = buffer.toString();
			mailBody = mailBody.replace("{FNAME}", student.getStudentFirstName());
			mailBody = mailBody.replace("{EMAIL}", student.getStudentEmail());
			mailBody = mailBody.replace("{TEMP-PWD}", Integer.toString(student.getStudentPWD()));
			return mailBody;

		} catch (Exception e) {

			throw new RegAppException(e.getMessage());
		}

	}

	private int generatePWD() {

		Integer passwd = null;

		int min = 50000; // Minimum value of range
		int max = 500000; // Maximum value of range
		passwd = (int) Math.floor(Math.random() * (max - min + 1) + min);

		return passwd;
	}
	
	
	
	

	

	
}
