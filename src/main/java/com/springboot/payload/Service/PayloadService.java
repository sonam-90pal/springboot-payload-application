package com.springboot.payload.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.payload.Dao.PayloadDao;
import com.springboot.payload.entity.Load;


public interface PayloadService {
	public Load createLoading(Load load);

	
}
