package com.springboot.payload.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.payload.Dao.PayloadDao;
import com.springboot.payload.entity.Load;

@Service
public class PayloadServiceImpl implements PayloadService {
	@Autowired
	PayloadDao payloadDao;
	public Load createLoading(Load load) {
		payloadDao.save(load);
		return load;
	}


}
