package info.development;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


@Service
public class MyAccountService implements AccountService {

	private final RiskAssessor riskAssessor;
	private final RiskAssessor ravali;
	

	public MyAccountService(RiskAssessor riskAssessor, RiskAssessor ravali) {
		System.out.println("ravali constuctor added");
		this.riskAssessor = riskAssessor;
		this.ravali = ravali;
	}

	@Autowired
	private void servicemethod() {
		System.out.println("service method ");
		riskAssessor.display();
	
	}
}
