package com.example.lab4_JPA.service;

import java.util.List;

import com.example.lab4_JPA.entity.ChuyenBay;

public interface ChuyenBayService {
	//1.Cho biết các chuyến bay đi Đà Lạt (DAD)
	public List<ChuyenBay> findByGaDen(String gaDen);

	//4.Cho biết các chuyến bay có độ dài đường bay nhỏ hơn 10.000km và lớn hơn 8.000km.
	public List<ChuyenBay> findByDoDaiDBNhoHon10000VaLoHon8000();

	// 5.Cho biết các chuyến bay xuất phát từ Sài Gòn (SGN) đi Ban Mê Thuộc (BMV).
	public List<ChuyenBay> findBySGtoBMT();

	// 6.Có bao nhiêu chuyến bay xuất phát từ Sài Gòn (SGN).
	public int sumCBFromSG();
}
