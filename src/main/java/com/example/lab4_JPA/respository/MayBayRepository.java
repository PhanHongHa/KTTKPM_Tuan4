package com.example.lab4_JPA.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.lab4_JPA.entity.MayBay;

public interface MayBayRepository extends JpaRepository<MayBay, Integer> {
//	2. Cho biết các loại máy bay có tầm bay lớn hơn 10,000km.
	@Query(value = "select loai from [dbo].[maybay] where [TamBay]>10000", nativeQuery = true)
	public List<String> findByTamBayLonHon10000();

}
