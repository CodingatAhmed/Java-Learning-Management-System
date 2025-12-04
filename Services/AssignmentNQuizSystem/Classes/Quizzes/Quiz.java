package Services.AssignmentNQuizSystem.Classes.Quizzes;

import java.util.*;
import Services.AssignmentNQuizSystem.Classes.Quizzes.QuizHeader.*;
import Services.AssignmentNQuizSystem.Classes.Quizzes.QuizQuestion.*;

public class Quiz {
    private QuizHeader QuizHeader;
    private ArrayList<QuizQuestion> allQuestionsList = new ArrayList<>();

    public Quiz(QuizHeader addQuizHeader) {
        this.QuizHeader = new QuizHeader(addQuizHeader);
    }

    public Quiz(QuizHeader otherQuizHeader, ArrayList<QuizQuestion> allQuestions) {
        this.QuizHeader = new QuizHeader(otherQuizHeader);
        for (QuizQuestion eachQuestion : allQuestionsList) {
            this.allQuestionsList.add(eachQuestion);
        }

    }

    public Quiz(Quiz otherQuiz) {
        this.QuizHeader = new QuizHeader(otherQuiz.QuizHeader);
        for (QuizQuestion eachQuestion : otherQuiz.allQuestionsList) {
            this.allQuestionsList.add(eachQuestion);
        }
    }

    public QuizHeader GetQuizHeader() {
        return this.QuizHeader;
    }

    public ArrayList<QuizQuestion> QuizQuestionsList() {
        return this.allQuestionsList;
    }

    @Override
    public boolean equals(Object otherQuiz) {
        if (this == otherQuiz) {
            return true;
        }
        if (!(otherQuiz instanceof Quiz))
            return false;
        Quiz OtherQuiz = (Quiz) otherQuiz;
        return Objects.equals(this.GetQuizHeader(), OtherQuiz.GetQuizHeader());
    }

    public boolean AddQuizQuestion(QuizQuestion addQuestion) {
        try {
            this.allQuestionsList.add(new QuizQuestion(addQuestion));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean RemoveQuizQuestion(QuizQuestion RemoveQuestion) {
        try {
            for (QuizQuestion GetQuizQuestion : this.allQuestionsList) {
                if (Objects.equals(GetQuizQuestion, RemoveQuestion)) {
                    this.allQuestionsList.remove(GetQuizQuestion);
                    System.out.println("Question has been removed successfully");
                    return true;
                }
            }
            System.out.println("The Question is not found in the Course");
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void IterateHeaderDetails() {
        System.out.println(this.QuizHeader);
    }

    public void IterateAllQuestions() {
        for (int i = 0; i < this.allQuestionsList.size(); i++) {
            System.out.println("Question No. " + i + " " + this.allQuestionsList.get(i));
        }
    }

    public void ShowFullAssignment() {
        IterateHeaderDetails();
        IterateAllQuestions();
    }

    public String ReturnAllQuestions() {
        String allQuestions = "";
        for (int i = 0; i < this.allQuestionsList.size(); i++) {
            allQuestions += ("\n" + "Q" + (i + 1) + ": " + this.allQuestionsList.get(i));
        }
        return allQuestions;
    }

    @Override
    public String toString() {
        return (this.QuizHeader.toString() + "\n\n" + "It has total of " + this.allQuestionsList.size()
                + " Questions: \n" + this.ReturnAllQuestions());
    }
}
