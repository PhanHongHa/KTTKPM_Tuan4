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
	
	
	//1
	@Override
	public List<ChuyenBay> findByGaDen(String gaDen) {
		// TODO Auto-generated method stub
		return chuyenBayRepository.findByGaDen(gaDen);
	}

	//4
	@Override
	public List<ChuyenBay> findByDoDaiDBNhoHon10000VaLoHon8000() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.findByDoDaiDBNhoHon10000VaLoHon8000();
	}
	
	//5
	@Override
	public List<ChuyenBay> findBySGtoBMT() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.findBySGtoBMT();
	}

	//6
	@Override
	public int sumCBFromSG() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.sumCBFromSG();
	}

	
}
