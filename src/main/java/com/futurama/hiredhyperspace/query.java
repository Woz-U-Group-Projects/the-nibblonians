package com.futurama.hiredhyperspace;

import java.lang.annotation.Annotation;
import org.springframework.data.mongodb.repository.Query;

public class query implements Query {

	@Override
	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String value() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String fields() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean count() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean exists() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String sort() {
		// TODO Auto-generated method stub
		return null;
	}

}
