package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.constant.WebConstant;
import in.ashokit.service.UnlockAccountService;

@RestController
public class UnlockAccount {
	
	@Autowired
	private UnlockAccountService unlockAccountService;
	
	@GetMapping("/unlock")
	public  String unlockAccount(@RequestParam String  studentEmail) {
		String unloack = unlockAccountService.unloackService(studentEmail);
		return unloack;
			
	}	
		
}
