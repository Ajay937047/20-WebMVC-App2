package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.StudentEntity;
import in.ashokit.entity.StudentRegistrationEntity;
import in.ashokit.repository.StudentRegistrationRepository;
import in.ashokit.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo studentRepo;


	@Autowired
	private StudentRegistrationRepository studentRegistrationRepository;
	
	public StudentServiceImpl(StudentRepo studentRepo,StudentRegistrationRepository studentRegistrationRepository) {
		this.studentRepo = studentRepo;
		this.studentRegistrationRepository = studentRegistrationRepository;
	}
	
	
	
	

	@Override
	public List<StudentEntity> getstudentlist() {
		List<StudentEntity> all = studentRepo.findAll();
		return all;
	}

	@Override
	public List<StudentRegistrationEntity> getRegisterList() {
		List<StudentRegistrationEntity> registerstdList = studentRegistrationRepository.findAll();
		return registerstdList;
	}

	
	
}
