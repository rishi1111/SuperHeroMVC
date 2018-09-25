package lti.quiz.service;

import java.util.List;

import lti.quiz.bean.QuizBean;
import lti.quiz.entity.Quiz;

public interface QuizService {

	List<Quiz> loadQuiz();
	

	String getResult(List<String> scores);
}
