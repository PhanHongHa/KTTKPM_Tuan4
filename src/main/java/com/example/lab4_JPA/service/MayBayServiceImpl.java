package com.example.lab4_JPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.lab4_JPA.respository.MayBayRepository;

public class MayBayServiceImpl implements MayBayService {

	@Autowired
	private MayBayRepository mayBayRepository;
	
	@Override
	public List<String> findByTamBayLonHon10000() {
		// TODO Auto-generated method stub
		return mayBayRepository.findByTamBayLonHon10000();
	}
}
