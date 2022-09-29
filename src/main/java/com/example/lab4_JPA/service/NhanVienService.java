package com.example.lab4_JPA.service;

import java.util.List;

import com.example.lab4_JPA.entity.NhanVien;

public interface NhanVienService {
//	3. Tìm các nhân viên có lương nhỏ hơn 10,000.
	public List<NhanVien> findByLuongNhoHon10000();
}
