import java.util.ArrayList;
public class InheritanceProgramRunner {

	public static void main(String[] args) {

		SchoolSubject s1 = new SchoolSubject();
		SchoolSubject s2 = new Math();
		//Math m1 = new SchoolSubject();
		Math m2 = new Math();
		
		s1.giveHomework();
		s1.giveTest();
		//s1.extraCredit();
		s2.giveHomework();
		s2.giveTest();
		//s2.extraCredit();
		m2.giveHomework();
		m2.giveTest();
		m2.extraCredit();

	}

}
