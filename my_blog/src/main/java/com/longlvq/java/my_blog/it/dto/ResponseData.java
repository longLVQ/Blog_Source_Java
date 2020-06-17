package com.longlvq.java.my_blog.it.dto;

import lombok.Data;

@Data
public class ResponseData {
	private Object data;
	private int status;
	private Object message;
}
