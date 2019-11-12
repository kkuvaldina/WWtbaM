public class QAndA {
   private String[] questionList = new String[]{ //array of questions
/*1st*/ "According to an Aesop's fable, you shouldn't count what before they are hatched?",
/*2nd*/ "What adjective best describes a type of reaction that is automatic and unthinking?",
/*3rd*/ "Which of the following describes the extrasensory ability to communicate from one mind to another?",
/*4th*/ "Which of the following is the symbol sometimes placed over the \"n\" in the Spanish language?",
/*5th*/ "Which profession completes the Shakespeare line, \"The first thing we do, let's kill all the\" what?",
/*6th*/ "In the movie \"The Exorcist\", what spirit does young Regan talk to through a Ouija board?",
/*7th*/ "What insect shorted out an early supercomputer and inspired the term \"computer bug?\""};
   
   private String[][] answerList = new String[][]{//two dimensional array of potential answers
/*1st*/ {"A: Fingers", "B: Chickens", "C: Snakes", "D: Guppies"},
/*2nd*/ {"A: Head-kick", "B: Neck-twist", "C: Knee-jerk", "D: Ankle-swing"},
/*3rd*/ {"A: Telepathy", "B: Therapy", "C: Tsunami", "D: Typhus"},
/*4th*/ {"A: Tilde", "B: Umlaut", "C: Circumflex", "D: Cedilla"},
/*5th*/ {"A: Doctors", "B: Lawyers", "C: Bankers", "D: Chefs"},
/*6th*/ {"A: Zuul", "B: Azazel", "C: Damien", "D: Captain Howdy"},
/*7th*/ {"A: Moth", "B: Roach", "C: Fly", "D: Japanese beetle"}
   };
   
   private char[] correctAnswerList = new char[]{ //array of correct answers
/*1st*/ 'B',
/*2nd*/ 'C', 
/*3rd*/ 'A',
/*4th*/ 'A',
/*5th*/ 'B',
/*6th*/ 'D',
/*7th*/ 'A'  
   };
   
   private boolean isCorrect;
   
   public String getQuestion(int roundNumber) { //getter for question
      return questionList[roundNumber];
   }
   
   public String getAnswer(int roundNumber, int answerNumber) { //getter for set of answers
      return answerList[roundNumber][answerNumber];             //to corresponding question
   }
   
   public boolean compareAnswer(int roundNumber, char userAnswer) { //compares user answer
      userAnswer = Character.toUpperCase(userAnswer);               //with correct answer
      if(userAnswer == correctAnswerList[roundNumber]) {            //from correctAnswerList array
         isCorrect = true;
      }
      else {
         isCorrect = false;
      }
      return isCorrect;
   }
}