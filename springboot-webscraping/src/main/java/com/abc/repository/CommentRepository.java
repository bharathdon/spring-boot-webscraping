package com.abc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.entity.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {

	Comment[] save(Comment[] comment);

}
