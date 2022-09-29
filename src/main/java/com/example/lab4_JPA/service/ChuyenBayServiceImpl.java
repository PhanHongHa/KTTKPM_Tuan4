package com.example.lab4_JPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lab4_JPA.entity.ChuyenBay;
import com.example.lab4_JPA.respository.ChuyenBayRepository;

@Service
public class ChuyenBayServiceImpl implements ChuyenBayService {

	@Autowired 
	private ChuyenBayRepository chuyenBayRepository;
	
	@Override
	public List<ChuyenBay> findByGaDen(String gaDen) {
		// TODO Auto-generated method stub
		return chuyenBayRepository.findByGaDen(gaDen);
	}

	
	
}
