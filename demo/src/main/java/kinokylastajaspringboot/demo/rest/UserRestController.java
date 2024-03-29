package kinokylastajaspringboot.demo.rest;

import kinokylastajaspringboot.demo.dao.UserDAO;
import kinokylastajaspringboot.demo.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserRestController {

    private UserDAO userDAO;

    public UserRestController(UserDAO theUserDAO) {
        userDAO = theUserDAO;
    }

    @GetMapping("/users")
    public List<User> findAll() {
        return userDAO.findAll();
    }
}
