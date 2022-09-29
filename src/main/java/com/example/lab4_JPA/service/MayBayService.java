package com.example.lab4_JPA.service;

import java.util.List;

public interface MayBayService {
//	2. Cho biết các loại máy bay có tầm bay lớn hơn 10,000km.
	public List<String> findByTamBayLonHon10000();

}
