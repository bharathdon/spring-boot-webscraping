package com.abc;

import java.io.IOException;

import javax.annotation.PostConstruct;

import org.jsoup.Jsoup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.abc.entity.Comment;
import com.abc.entity.Post;
import com.abc.repository.CommentRepository;
import com.abc.repository.PostRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class SpringbootWebscrapingApplication {

	@Autowired
	private PostRepository postRepository;

	@Autowired
	private CommentRepository commentRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebscrapingApplication.class, args);
	}

	@PostConstruct
	public void init() throws IOException {

		String document = Jsoup.connect("https://jsonplaceholder.typicode.com/posts").ignoreContentType(true).execute()
				.body();

		ObjectMapper objectMapper = new ObjectMapper();
		Post[] user = objectMapper.readValue(document, Post[].class);
		System.out.println(user);
		for (Post post : user) {
			postRepository.save(post);
		}

		String document1 = Jsoup.connect("https://jsonplaceholder.typicode.com/comments").ignoreContentType(true)
				.execute().body();

		ObjectMapper objectMapper1 = new ObjectMapper();
		Comment[] comment = objectMapper1.readValue(document1, Comment[].class);
		System.out.println(comment);

		for (Comment comment2 : comment) {

			commentRepository.save(comment2);
		}

	}
}
