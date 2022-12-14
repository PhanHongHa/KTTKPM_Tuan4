package com.example.lab4_JPA.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.lab4_JPA.entity.ChuyenBay;

public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String> {

	
//	1.Cho biết các chuyến bay đi Đà Lạt (DAD)
	public List<ChuyenBay> findByGaDen(String gaDen);
	
//  4.Cho biết các chuyến bay có độ dài đường bay nhỏ hơn 10.000km và lớn hơn 8.000km.
	@Query(value = "select * from chuyenbay where dodai < 10000 and dodai > 8000", nativeQuery = true)
	public List<ChuyenBay>findByDoDaiDBNhoHon10000VaLoHon8000();
	
//  5.Cho biết các chuyến bay xuất phát từ Sài Gòn (SGN) đi Ban Mê Thuộc (BMV).
	@Query(value = "select * from chuyenbay where GaDi = 'SGN' and GaDen = 'BMV'", nativeQuery = true)
	public List<ChuyenBay> findBySGtoBMT();
	
//	6.Có bao nhiêu chuyến bay xuất phát từ Sài Gòn (SGN).
	@Query(value = "select count(*) from chuyenbay where GaDi = 'SGN'", nativeQuery = true)
	public int sumCBFromSG();
}
