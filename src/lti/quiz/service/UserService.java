package lti.quiz.service;

import lti.quiz.bean.ForgetBean;
import lti.quiz.bean.LoginBean;
import lti.quiz.bean.RegisterBean;
import lti.quiz.entity.User;

public interface UserService {

	User authenticate(LoginBean login);

	boolean register(User register);

	boolean validate(ForgetBean forget);

	boolean update(LoginBean change);

	boolean updateProfile(User user);
}
