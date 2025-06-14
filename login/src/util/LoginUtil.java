package util;

import entities.User;

import java.util.List;

public class LoginUtil {
    public static boolean register(List<User> users, String username, String useremail, String password){
        boolean exists = users.stream().anyMatch(u -> u.getUsername().equals(username) || u.getEmail().equals(useremail));
        if (exists) {
            return false;
        }

        users.add(new User(username, useremail, password));
        return true;
    }

    public static boolean login(List<User> users, String usernameOrEmail, String password) {
        if (users.stream().anyMatch(u -> (u.getUsername().equals(usernameOrEmail) || u.getEmail().equals(usernameOrEmail)) && u.getPassword().equals(password))) {
            return true;
        } else {
            return false;
        }
    }

    public static User getUsername (List<User> users, String usernameOrEmail) {
        for (User user : users) {
            if (user.getUsername().equals(usernameOrEmail) || user.getEmail().equals(usernameOrEmail)) {
                return user;
            }
        }
        return null;
    }
}
