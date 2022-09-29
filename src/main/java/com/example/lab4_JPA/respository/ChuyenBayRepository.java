package com.example.lab4_JPA.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lab4_JPA.entity.ChuyenBay;

public interface ChuyenBayRepository extends JpaRepository {

	
//	1.Cho biết các chuyến bay đi Đà Lạt (DAD)
	public List<ChuyenBay> findByGaDen(String gaDen);
	
	
}
