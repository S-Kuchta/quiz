# quiz
An assignment for street of code java tutorial


### How to run project?

  - Clone git repository with your IDE - https://github.com/S-Kuchta/quiz.git
  - or
  - Download zip and open it in your IDE
  - Run Main.class in src/main/java/


### How to play?

  - To select a quiz, simply input the number preceding the quiz's name (A list of quizzes will be printed)
  - Enter your answers into the console using a single letter(e.g., 'a', 'A', 'b', etc.) - without using quotation marks
  - In cases where there are multiple correct answers(which will be announced after each question), input them all in one line(e.g., 'abc', 'aCb','a b d', etc.) - without using quotation marks
  - It's important to enter the exact number of answers for questions with multiple correct responses; otherwise, your answer will be considered incorrect


### Highlights

  - Quizzes are dynamically retrieved from the quizDb.json file
  - Invalid inputs are not accepted; you will receive notifications after each incorrect entry
  - You have the option to select a quiz randomly
  - Questions and answers are shuffled before the start of each quiz
  - To include a new quiz, question, or answer, simply append it to the quizDb.json file. No modifications are necessary in the code, as everything is dynamically configured

### Constraints

  - A question can have a maximum of 5 answers; otherwise, any additional answers will not be shown.

### What to improve
  - Remove unnecessary empty correctAnswers array in quizDb.json 
