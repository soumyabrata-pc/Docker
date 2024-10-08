package com.lern.sbmongo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Student {

	@Id
	private int sno;
	private String sname;
	private String sadd;
}
