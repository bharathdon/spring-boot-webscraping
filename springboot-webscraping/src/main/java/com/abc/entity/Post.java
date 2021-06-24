package com.abc.entity;

import java.io.Serializable;

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
public class Post implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer userId;
	@Id
	private Integer id;
	private String title;
	private String body;

	

}