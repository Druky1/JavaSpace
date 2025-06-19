import java.util.Scanner;

public class QuestionService{
  Question[] questions = new Question[5];
  int[] userAnswers = new int[5];

  public QuestionService(){
    questions[0] = new Question(1, "What is the capital of France?", "Berlin", "Madrid", "Paris", "Rome", "Paris");
    questions[1] = new Question(2, "What is 2 + 2?", "3", "4", "5", "6", "4");
    questions[2] = new Question(3, "What is the largest planet?", "Earth", "Mars", "Jupiter", "Saturn", "Jupiter");
    questions[3] = new Question(4, "What is the boiling point of water?", "90°C", "100°C", "110°C", "120°C", "100°C");
    questions[4] = new Question(5, "What is the chemical symbol for gold?", "Au", "Ag", "Fe", "Hg", "Au");
  }

  public void playQuiz(){
    int ind = 0;
    for(Question question : questions){
      System.out.println("Question " + question.getId() + ": " + question.getQuestion());
      System.out.println("1. " + question.getOpt1());
      System.out.println("2. " + question.getOpt2());
      System.out.println("3. " + question.getOpt3());
      System.out.println("4. " + question.getOpt4());
      System.out.println("Please select the correct answer (1-4):");
      
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter your answer (1-4): ");
      userAnswers[ind++] = sc.nextInt();
    }
    for(int answer : userAnswers){
      System.out.println(answer);
    }
    public void calScore(){
      int score = 0;
      for(int i = 0 ; i < questions.length; i++){
        if(questions[i].getAnswer().equals(questions[userAnswers[i] - 1].getAnswer())){
          score++;
        }
      }
    }
    System.out.println("Your score is: " + score + "/" + questions.length);
  }
}