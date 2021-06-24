package com.abc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.entity.Post;

@Repository

public interface PostRepository extends JpaRepository<Post, Integer> {

	Post[] save(Post[] user);

}
