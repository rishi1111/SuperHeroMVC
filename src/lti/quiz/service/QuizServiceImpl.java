package lti.quiz.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import lti.quiz.entity.Quiz;
import lti.quiz.repo.QuizRepo;

public class QuizServiceImpl implements QuizService {
	@Autowired
	private QuizRepo repo;
	private String[] codes = { "SP", "SM", "IM", "BM", "DP", "BP", "HK" };

	@Override
	public List<Quiz> loadQuiz() {
		return repo.loadQuiz();

	}

	@Override
	public String getResult(List<String> scores) {
		int[] result = new int[7];
		for (String value : scores) {
			String[] star = value.split("");
			for (int i = 0; i < star.length; i++) {
				result[i] += Integer.parseInt(star[i]);
			}
		}
		int[] clone = result.clone();
		Arrays.sort(clone);

		int idx = -1;
		for (int i = 0; i < result.length; i++) {
			if (result[i] == clone[6]) {
				idx = i;
				break;
			}
		}
		return repo.getResult(codes[idx]);
	}

}
