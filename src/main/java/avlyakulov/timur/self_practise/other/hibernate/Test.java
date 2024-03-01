package avlyakulov.timur.self_practise.other.hibernate;


import avlyakulov.timur.self_practise.other.hibernate.test.Human;
import avlyakulov.timur.self_practise.other.hibernate.util.DatabaseType;
import avlyakulov.timur.self_practise.other.hibernate.util.HibernateSingletonUtil;
import jakarta.persistence.NoResultException;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.IOException;

@Slf4j
public class Test {

    public static void main(String[] args) throws IOException {
        SessionFactory sessionFactory = HibernateSingletonUtil.getSessionFactory(DatabaseType.POSTGRES);
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();//открываем транзакцию
            Human human = new Human("Kolya");
            try {
                Human singleResult = session.createNamedQuery("findByName", Human.class).setParameter("name", human.getName()).getSingleResult();
            } catch (NoResultException e) {
                log.error("Human doesn't exist ");
                session.persist(human);
            }
            session.getTransaction().commit();//закрываем транзакцию
        }
    }

    public static String capitalizeFirstLetter(String input) {
        if (input == null || input.isEmpty()) {
            return input; // если строка пуста или null, возвращаем исходную строку
        } else {
            return input.substring(0, 1).toUpperCase() + input.substring(1);
        }
    }
}