package ohtu.services;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import ohtu.domain.User;
import ohtu.data_access.UserDao;

@Component
public class AuthenticationService {

    private final UserDao userDao;

    @Autowired
    public AuthenticationService(UserDao userDao) {
        this.userDao = userDao;
    }

    public boolean logIn(String username, String password) {
        for (User user : userDao.listAll()) {
            if (user.getUsername().equals(username)
                    && user.getPassword().equals(password)) {
                return true;
            }
        }

        return false;
    }

    public boolean createUser(String username, String password) {
        if (userDao.findByName(username) != null) {
            return false;
        }

        if (invalid(username, password)) {
            return false;
        }

        userDao.add(new User(username, password));

        return true;
    }

    private boolean invalid(String username, String password) {
        if(!username.matches("[a-z]{3,}?")){
            return true;
        }else if(password.length() < 8 || (!password.matches(".*([0-9]|//W).*"))){
            return true;
        }
        return false;                                                  
    }
}
