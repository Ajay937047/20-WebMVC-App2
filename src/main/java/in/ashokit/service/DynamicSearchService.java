package in.ashokit.service;

import java.util.List;

import in.ashokit.binding.ReportBinding;
import in.ashokit.binding.StudentRegistrationBinding;

public interface DynamicSearchService {

	public List<StudentRegistrationBinding> getlist(ReportBinding binding);
	
	public boolean deleteStudent(int studentid);
	
}
