package com.example.lab4_JPA.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.lab4_JPA.entity.NhanVien;

public interface NhanVienRepository extends JpaRepository<NhanVien, String> {
//	3. Tìm các nhân viên có lương nhỏ hơn 10,000.
	@Query(value = "select * from [dbo].[nhanvien] where [Luong]<10000",nativeQuery = true)
	public List<NhanVien> findByLuongNhoHon10000();
}
