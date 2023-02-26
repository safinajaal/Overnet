package org.safinajaal.Overnet.repository;

import org.safinajaal.Overnet.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
// Здесь пишем long, потому что наш id, по которому будет поиск, имеет тип long
public interface UserRepository extends JpaRepository<User, Long> {
    // Если нету username, вернет не null, а optional -> программа не рухнет с NullPointerException
    Optional<User> findUserByUsername(String username);

    Optional<User> findUserByEmail(String email);

    Optional<User> findUserById(Long id);

}
