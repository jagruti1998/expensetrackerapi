package project.expensetrackerapi.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.expensetrackerapi.entity.User;
import project.expensetrackerapi.entity.UserModel;
import project.expensetrackerapi.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Override
    public User createUser(UserModel user) {
        User newUser=new User();
        BeanUtils.copyProperties(user,newUser);
        return userRepository.save(newUser);
        }
}
