package com.abc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.entity.Post;
import com.abc.repository.PostRepository;

@RestController
public class PostController {

	@Autowired
	private PostRepository postRepository;

	@GetMapping("/posts")
	public List<Post> findAll() {
		return postRepository.findAll();
	}
}
