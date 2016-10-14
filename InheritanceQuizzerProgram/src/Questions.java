import java.util.ArrayList;

public class Questions {
	
	public String question;
	public String answer;
	static ArrayList<Questions> questions = new ArrayList<Questions>();
	static ArrayList<String> list = new ArrayList<String>();

	public Questions(String q, String a){
		question = q;
		answer = a;
	}

	
	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}


	public static void makeQuestions(){
		
		questions.add(new Questions("s1.giveHomework()","1"));
		questions.add(new Questions("s1.giveTest()","2"));
		questions.add(new Questions("s1.extraCredit()","5"));
		questions.add(new Questions("s2.giveHomework()","1"));
		questions.add(new Questions("s2.giveTest()","3"));
		questions.add(new Questions("s2.extraCredit()","5"));
		questions.add(new Questions("m1.giveHomework()","5"));
		questions.add(new Questions("m1.giveTest()","5"));
		questions.add(new Questions("m1.extraCredit()","5"));
		questions.add(new Questions("m2.giveHomework()","1"));
		questions.add(new Questions("m2.giveTest()","3"));
		questions.add(new Questions("m2.extraCredit()","4"));
	}
	
	public static void fillArray(){
		list.add("1. The teacher gave a lot of homework today!");
		list.add("2. The teacher gave a test today! Everyobody passed!");
		list.add("3. The teacher gave a test today! Everyone failed!");
		list.add("4. There is extra credit available if you bring in supplies!");
		list.add("5. The code will not execute.");
	}
}

