package com.springstudy.webmvc.testcontroller.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor@NoArgsConstructor@Builder
public class ArticleVO {
	private int articleNO;
	private String title;
	private String content;
	private String write;
	private Date writeDate;
}
