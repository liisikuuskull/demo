package kinokylastajaspringboot.demo.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import kinokylastajaspringboot.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOJpaImpl implements UserDAO {

    // define field for entitymanager
    private EntityManager entityManager;

    // set up constructor injection
    @Autowired
    public UserDAOJpaImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public List<User> findAll() {

        // create a query
        TypedQuery<User> theQuery = entityManager.createQuery("from User", User.class);

        // execute query and get result list
        List<User> users = theQuery.getResultList();

        // return the results
        return users;
    }
}
