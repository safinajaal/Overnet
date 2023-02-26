package org.safinajaal.Overnet.repository;


import org.safinajaal.Overnet.entity.Post;
import org.safinajaal.Overnet.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    //select * from post as p when User='user' sort desc
    List<Post> findAllByUserOrderByCreatedDateDesc(User user);

    List<Post> findAllByOrderByCreatedDateDesc();

    Optional<Post> findPostByIdAndUser(Long id, User user);
}
