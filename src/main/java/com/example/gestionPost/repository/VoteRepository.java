package com.example.gestionPost.repository;

import com.example.gestionPost.model.Post;
import com.example.gestionPost.model.User;
import com.example.gestionPost.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
