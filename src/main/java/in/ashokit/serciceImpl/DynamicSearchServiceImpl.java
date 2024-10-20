package in.ashokit.serciceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import in.ashokit.binding.ReportBinding;
import in.ashokit.binding.StudentRegistrationBinding;
import in.ashokit.entity.StudentRegistrationEntity;
import in.ashokit.repository.StudentRegistrationRepository;
import in.ashokit.service.DynamicSearchService;

@Service
public class DynamicSearchServiceImpl implements DynamicSearchService {

	@Autowired
	private StudentRegistrationRepository repository;

	@Override
	public List<StudentRegistrationBinding> getlist(ReportBinding binding) {

		StudentRegistrationEntity stude = tocheck(binding);

		Example<StudentRegistrationEntity> of = Example.of(stude);
		List<StudentRegistrationEntity> all = repository.findAll(of);

		List<StudentRegistrationBinding> students = new ArrayList<StudentRegistrationBinding>();

		for (StudentRegistrationEntity st : all) {

			StudentRegistrationBinding restister = new StudentRegistrationBinding();
			BeanUtils.copyProperties(st, restister);
			students.add(restister);
		}
		  System.out.println(students);
		return students;
	}

	public StudentRegistrationEntity tocheck(ReportBinding binding) {

		StudentRegistrationEntity student = new StudentRegistrationEntity();

		if (!binding.getStudentAccStatus().equals("") && binding.getStudentAccStatus() != null) {

			student.setStudentAccStatus(binding.getStudentAccStatus());

		}

		return student;

	}

	@Override
	public boolean deleteStudent(int studentid) {
		 try {
	            repository.deleteById(studentid);
	            return true;
	        } catch (Exception e) {
	            return false;
	        }
	}
	
}
