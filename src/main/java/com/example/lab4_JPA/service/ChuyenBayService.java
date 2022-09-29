package com.example.lab4_JPA.service;

import java.util.List;

import com.example.lab4_JPA.entity.ChuyenBay;

public interface ChuyenBayService {
//	1.Cho biết các chuyến bay đi Đà Lạt (DAD)
	public List<ChuyenBay> findByGaDen(String gaDen);
	
}
