package com.abc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.abc.entity.Comment;
import com.abc.repository.CommentRepository;

@RestController
public class CommentController {

	@Autowired
	private CommentRepository commentRepository;

	public List<Comment> findAll() {
		return commentRepository.findAll();
	}
}
