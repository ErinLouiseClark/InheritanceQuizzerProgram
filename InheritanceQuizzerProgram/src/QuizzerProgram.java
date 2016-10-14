import java.util.Scanner;
import java.util.Collections;
public class QuizzerProgram {

	public static void main(String[] args) {
		
		double correct = 0.0;
		double incorrect = 0.0;
		
		System.out.println("Welcome to the inheritance quizzer!");
		System.out.println("How many questions would you like to answer? (1-13)");
		Scanner userInput = new Scanner(System.in);
		int numQuestions = userInput.nextInt();
		if(numQuestions > 11 || numQuestions < 1){
			System.out.println("That is not a valid option.");
			System.exit(0);
		}
		else{
			Questions.makeQuestions();
			Questions.fillArray();
			Collections.shuffle(Questions.questions);
			for(int i = 0; i < numQuestions-1; i++){
					System.out.println();
					System.out.println("What will print when " + Questions.questions.get(i).getQuestion() + " is run?");
					for(int k = 0; k < 5; k++){
						System.out.println(Questions.list.get(k));
					}
					Scanner userInput2 = new Scanner(System.in);
					String answer = userInput2.nextLine();
					if(answer.equals(Questions.questions.get(i).getAnswer())){
						System.out.println("That is correct!");
						correct++;
					}
					else{
						System.out.println("That is incorrect!");
						System.out.println("The correct answer is " + Questions.questions.get(i).getAnswer());
						incorrect++;
					}
			}
		}
		System.out.println("What would do to make m2.giveTest() and s2.giveTest() say that everybody passed rather than failed?");
		System.out.println("1. Add super when you instantiate m2 and s2");
		System.out.println("2. Replace the syso in the giveTest() method in the Math class with super.giveTest()");
		System.out.println("3. Add super() in a constructor in the SchoolSubject class");
		System.out.println("4. Not possible");
		Scanner userInput3 = new Scanner(System.in);
		int lastAns = userInput3.nextInt();
		if(lastAns == 2){
			System.out.println("Correct!");
			correct++;
		}
		else{
			System.out.println("Incorrect! The correct answer is #2!");
			incorrect++;
		}
		
		double percentage = (correct/numQuestions)*100;
		System.out.println("You got " + correct + " answers correct out of " + numQuestions + ". That is " + percentage + "%!");
	}

}
