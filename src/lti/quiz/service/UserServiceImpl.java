package lti.quiz.service;

import java.util.Base64;
import java.util.Base64.Encoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lti.quiz.bean.ForgetBean;
import lti.quiz.bean.LoginBean;
import lti.quiz.bean.RegisterBean;
import lti.quiz.entity.User;
import lti.quiz.repo.UserRepo;
import lti.quiz.repo.UserRepoImpl;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo repo;

	@Override
	public User authenticate(LoginBean login) {

		Encoder encoder = Base64.getEncoder();
		String encodedPass = encoder.encodeToString(login.getPassword().getBytes());
		login.setPassword(encodedPass);

		return repo.authenticate(login);
	}

	@Override
	public boolean register(User register) {

		Encoder encoder = Base64.getEncoder();
		String encodedPass = encoder.encodeToString(register.getPassword().getBytes());
		String encodedAns = encoder.encodeToString(register.getAnswer().getBytes());

		register.setAnswer(encodedAns);
		register.setPassword(encodedPass);

		return repo.register(register);
	}

	@Override
	public boolean validate(ForgetBean forget) {

		Encoder encoder = Base64.getEncoder();
		String encodedAns = encoder.encodeToString(forget.getAnswer().getBytes());
		forget.setAnswer(encodedAns);

		return repo.validate(forget);
	}

	@Override
	public boolean update(LoginBean change) {

		Encoder encoder = Base64.getEncoder();
		String encodedPass = encoder.encodeToString(change.getPassword().getBytes());
		change.setPassword(encodedPass);

		return repo.update(change);
	}

	@Override
	public boolean updateProfile(User user) {

		return repo.updateProfile(user);
	}

}
