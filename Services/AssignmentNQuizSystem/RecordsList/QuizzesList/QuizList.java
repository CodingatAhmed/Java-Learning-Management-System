package Services.AssignmentNQuizSystem.RecordsList.QuizzesList;

import Services.AssignmentNQuizSystem.RecordsList.QuizQuestionsList.QuizQuestionsList;

public class QuizList {
    // QuizQuestionsList
    private QuizQuestionsList[] AllQuizList;
    private static int totalQuizzes;

    public QuizList() {
        this.AllQuizList = new QuizQuestionsList[0];
        QuizList.totalQuizzes = 0;
    }
    public QuizList(int totalQuizzes) {
        this.AllQuizList = new QuizQuestionsList[totalQuizzes];
        QuizList.totalQuizzes = 0; 
    }
    public QuizList(QuizList otherQuizList) {
        this.AllQuizList = new QuizQuestionsList[otherQuizList.AllQuizList.length];
        for (int i = 0; i< otherQuizList.AllQuizList.length; i++) {
            this.AllQuizList[i] = otherQuizList.AllQuizList[i];
        }
    }

    public boolean AddQuiz(QuizQuestionsList newQuizQuestions) {
        if (QuizList.totalQuizzes < AllQuizList.length) {
            AllQuizList[QuizList.totalQuizzes] = new QuizQuestionsList(newQuizQuestions);
            QuizList.totalQuizzes += 1; 
            return true;
        }
        else {
            return false;
        }
    }
}