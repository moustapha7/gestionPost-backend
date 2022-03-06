package com.example.gestionPost.repository;

import com.example.gestionPost.model.Post;
import com.example.gestionPost.model.Subreddit;
import com.example.gestionPost.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
