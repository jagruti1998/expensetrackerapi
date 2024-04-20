package project.expensetrackerapi.service;

import project.expensetrackerapi.entity.User;
import project.expensetrackerapi.entity.UserModel;

public interface UserService {
   User createUser(UserModel user);
}
