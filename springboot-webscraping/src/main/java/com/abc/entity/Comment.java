package com.abc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {

	@Column(length = 500)
	private Integer postId;

	@Id
	@Column(length = 500)
	private Integer id;

	@Column(length = 5000)
	private String name;
	private String email;
	@Column(length = 100000)
	private String body;

}