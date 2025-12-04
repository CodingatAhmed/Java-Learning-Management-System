package Services.AssignmentNQuizSystem.RecordsList.QuizzesList;

import java.util.*;

import Services.AssignmentNQuizSystem.Classes.Quizzes.Quiz;
import Services.AssignmentNQuizSystem.RecordsList.QuizQuestionsList.QuizQuestionsList;
import Services.CourseManagement.Classes.Courses.Course;
import Services.UserManagement.UsersList.UsersList;

public class QuizzesList {
    // QuizQuestionsList
    private Map<Course, List<Quiz>> AllQuizList = new HashMap<>();
    private static int totalQuizzes;

    public QuizzesList() {
        QuizzesList.totalQuizzes = 0;
    }

    public QuizzesList(int totalQuizzes, Map<Course, List<Quiz>> otherQuizzes) {
        for (Course GetCourse : otherQuizzes.keySet()) {
            List<Quiz> GetQuizList = otherQuizzes.get(GetCourse);
            List<Quiz> OriginalQuizList = new ArrayList<>(GetQuizList);
            this.AllQuizList.putIfAbsent(GetCourse, OriginalQuizList);
        }
    }

    public QuizzesList(QuizzesList otherQuizList) {
        for (Course GetCourse : otherQuizList.AllQuizList.keySet()) {
            List<Quiz> GetQuizList = otherQuizList.AllQuizList.get(GetCourse);
            List<Quiz> OriginalQuizList = new ArrayList<>(GetQuizList);
            this.AllQuizList.put(GetCourse, OriginalQuizList);
        }
        // this.AllQuizList = new QuizQuestionsList[otherQuizList.AllQuizList.length];
        // for (int i = 0; i < otherQuizList.AllQuizList.length; i++) {
        // this.AllQuizList[i] = otherQuizList.AllQuizList[i];
        // }
    }

    public boolean AddQuiz(Course newCourse, Quiz newQuiz) {
        // this.AllQuizList.get(newCourse).con
        if (this.AllQuizList.containsKey(newCourse) == false) {
            this.AllQuizList.put(newCourse, new ArrayList<>());
        }
        // this.AllQuizList.get(newCourse).contains(newQuiz);
        if (!this.AllQuizList.get(newCourse).contains(newQuiz)) {
            this.AllQuizList.get(newCourse).add(new Quiz(newQuiz));
            System.out.println("New Quiz Added Successfully for the Course " + newCourse.GetCourseCode());
            QuizzesList.totalQuizzes += 1;
            return true;
        } else {
            System.out.println("This Quiz Already exists for the Course " + newCourse.GetCourseCode());
            return false;
        }
        // for (Quiz GetQuiz : this.AllQuizList.get(newCourse)) {
        // if (GetQuiz.GetQuizHeader() == newQuiz.GetQuizHeader()) {
        // System.out.println("This Quiz Already exists for the Course " +
        // newCourse.GetCourseCode());
        // return false;
        // }
        // }
        // this.AllQuizList.get(newCourse).add(newQuiz);
        // QuizzesList.totalQuizzes += 1;
        // System.out.println("New Quiz Added Successfully for the Course " +
        // newCourse.GetCourseCode());
        // return true;
    }

    public boolean RemoveQuiz(Course newCourse, Quiz newQuiz) {
        if (this.AllQuizList.containsKey(newCourse) == false) {
            System.out.println("The Course " + newCourse.GetCourseCode() + " is not listed");
            return false;
        } else {
            for (Quiz GetQuiz : this.AllQuizList.get(newCourse)) {
                if (GetQuiz.GetQuizHeader() == newQuiz.GetQuizHeader()
                        && GetQuiz.QuizQuestionsList() == newQuiz.QuizQuestionsList()) {
                    this.AllQuizList.get(newCourse).remove(GetQuiz);
                    System.out.println("Quiz Successfully Removed for the Course " + newCourse.GetCourseCode());
                    QuizzesList.totalQuizzes -= 1;
                    return true;
                }
            }
            System.out.println("The Quiz is not listed for the Course " + newCourse.GetCourseCode());
            return false;
        }
        // if (QuizzesList.totalQuizzes < AllQuizList.length) {
        // AllQuizList[QuizzesList.totalQuizzes] = new
        // QuizQuestionsList(newQuizQuestions);

        // this.AllQuizList.get(newCourse).;
        // QuizzesList.totalQuizzes += 1;
    }

    public void IterateCourseQuizzes(Course newCourse) {
        System.out.println("There are total of " + this.AllQuizList.get(newCourse).size() + " Quizzes for the Course "
                + newCourse.GetCourseCode());
        for (Quiz GetQuiz : this.AllQuizList.get(newCourse)) {
            System.out.println(GetQuiz);
        }
    }

    public void IterateAllCourseQuizzes() {
        for (Course GetCourse : this.AllQuizList.keySet()) {
            this.IterateCourseQuizzes(GetCourse);
        }
    }

    public String ReturnAllQuizzes() {
        String AllQuizzes = "";
        for (Course GetCourse : this.AllQuizList.keySet()) {
            for (int i = 0; i < this.AllQuizList.get(GetCourse).size(); i++) {
                AllQuizzes += GetCourse + "\n";
                AllQuizzes += "Course " + GetCourse.GetCourseCode() + " has total of "
                        + this.AllQuizList.get(GetCourse).size() + " Quizzes";
                AllQuizzes += this.AllQuizList.get(GetCourse).get(i);
            }
            // AllQuizzes += ("\n" + this.AllQuizList.get(GetCourse));
        }
        return AllQuizzes;
    }

    // public Quiz GetQuiz(Course GetCourse, Quiz GetQuiz) {

    // }

    @Override
    public String toString() {
        return "There are a Total of " + QuizzesList.totalQuizzes + " Quizzes" + "\n"
                + "Here is the the List of all Quizzes:"
                + this.ReturnAllQuizzes();
    }

}