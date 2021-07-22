package info.development;

import org.springframework.context.annotation.Configuration;

@Configuration
public class RiskAssessor {
	
public RiskAssessor() {
	System.out.println("zero parameterized constructor");
}
	
	public String display() {
		System.out.println("display method executed");
		return null;
	}
}
