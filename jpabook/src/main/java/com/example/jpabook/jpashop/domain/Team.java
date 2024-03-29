package com.example.jpabook.jpashop.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Team extends BaseEntity {
	@Id @GeneratedValue
	private Long id;
	private String name;
}
