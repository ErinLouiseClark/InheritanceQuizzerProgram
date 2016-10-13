import java.util.Scanner;
import java.util.Collections;
public class QuizzerProgram {

	public static void main(String[] args) {
		
		int correct = 0;
		int incorrect = 0;
		
		System.out.println("Welcome to the inheritance quizzer!");
		System.out.println("How many questions would you like to answer? (1-11)");
		Scanner userInput = new Scanner(System.in);
		int numQuestions = userInput.nextInt();
		if(numQuestions > 11 || numQuestions < 1){
			System.out.println("That is not a valid option.");
			System.exit(0);
		}
		else{
			for(int i = 1; i < numQuestions; i++){
				for(int j = 0; j < Questions.questions.size(); j++){
					Collections.shuffle(Questions.questions);
					System.out.println(i + "What will print when " + Questions.questions.get(i-1).getQuestion() + " is run?");
					for(int k = 0; k < 5; k++){
						System.out.println(Questions.list.get(k));
					}
					Scanner userInput2 = new Scanner(System.in);
					String answer = userInput2.nextLine();
					if(answer.equals(Questions.questions.get(i-1).getAnswer())){
						System.out.println("That is correct!");
						correct++;
					}
					else{
						System.out.println("That is incorrect!");
						incorrect++;
					}
				}
			}
		}
	}

}
