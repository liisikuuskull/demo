package kinokylastajaspringboot.demo.dao;

import kinokylastajaspringboot.demo.entity.User;

import java.util.List;

public interface UserDAO {

    List<User> findAll();
}
