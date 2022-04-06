-- 7.	Hiển thị thông tin ma_dich_vu, ten_dich_vu, dien_tich, so_nguoi_toi_da, chi_phi_thue, 
-- ten_loai_dich_vu của tất cả các loại dịch vụ đã từng được khách hàng 
-- đặt phòng trong năm 2020 nhưng chưa từng được khách hàng đặt phòng trong năm 2021. 
select dv.ma_dv, dv.ten_dv , dv.dien_tich , dv.so_ng_toi_da, ldv.ten_ldv from dich_vu dv 
inner join loai_dich_vu ldv on ldv.ma_ldv = dv.ma_loai_dv
inner join hop_dong hd on hd.MA_DICH_VU = dv.MA_DV
where (year(hd.ngay_ket_thuc)='2020') and not exists 
(select * from hop_dong hd where (hd.MA_DICH_VU = dv.MA_DV) and (year(hd.ngay_ket_thuc)='2021'))
group by dv.MA_DV;
-- 8.	Hiển thị thông tin ho_ten khách hàng có trong hệ thống, với yêu cầu ho_ten không trùng nhau. 
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên
select distinct ho_ten  from khach_hang;
-- 9.	Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2021 
-- thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
select month(ngay_ket_thuc) as 'thang',count(month(ngay_ket_thuc)) as 'so_luong_khach_hang' from hop_dong
where not year(ngay_ket_thuc)='2020'
group by month(ngay_ket_thuc)
order by month(ngay_ket_thuc);
-- 10.	Hiển thị thông tin tương ứng với từng hợp đồng thì đã sử dụng bao nhiêu dịch vụ đi kèm. 
-- Kết quả hiển thị bao gồm ma_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, so_luong_dich_vu_di_kem 
-- (được tính dựa trên việc sum so_luong ở dich_vu_di_kem). 
select hd.ma_hd, hd.ngay_lam_hd, hd.ngay_ket_thuc,hd.tien_dat_coc, sum(hdct.so_luong) as 'so_luong_dich_vu_di_kem' from hop_dong hd
left join hop_dong_chi_tiet hdct on hdct.MA_HOP_DONG = hd.MA_HD
group by hd.MA_HD;

-- 11.	Hiển thị thông tin các dịch vụ đi kèm đã được sử dụng bởi những khách hàng 
-- có ten_loai_khach là “Diamond” và có dia_chi ở “Vinh” hoặc “Quảng Ngãi”. 

-- 15.	Hiển thi thông tin của tất cả nhân viên bao gồm ma_nhan_vien, ho_ten, ten_trinh_do, ten_bo_phan, so_dien_thoai,
--  dia_chi mới chỉ lập được tối đa 3 hợp đồng từ năm 2020 đến 2021.
select nv.ma_nv, nv.ho_ten, td.ten_td , bp.ten_bp, nv.sdt,nv.dia_chi from nhan_vien nv
inner join hop_dong hd on nv.MA_nv = hd.MA_NHAN_VIEN
inner join trinh_do td on td.ma_td = nv.ma_trinh_do
inner join bo_phan bp on bp.ma_bp = nv.MA_BO_PHAN
group by nv.ma_nv
having count(1) <3;

-- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2019 đến năm 2021.
select nv.ma_nv, nv.ho_ten from nhan_vien nv 
where  nv.ma_nv not in (select nv.ma_nv from nhan_vien nv inner join hop_dong hd on hd.MA_NHAN_VIEN = nv.ma_nv group by nv.MA_NV);
-- 17.	Cập nhật thông tin những khách hàng có ten_loai_khach từ Platinum lên Diamond,
--  chỉ cập nhật những khách hàng đã từng đặt phòng với Tổng Tiền thanh toán trong năm 2021 là lớn hơn 10.000.000 VNĐ.


update khach_hang set ma_loai_khach =1 
where ma_khach_hang in (
select  tb.MA_Kh from (
with table_top as(
select kh.ma_kh, kh.ho_ten,lk.ma_lk , sum(dv.chi_phi_thue) as tong_chi_phi from khach_hang kh 
inner join hop_dong hd on hd.MA_KHACH_HANG = kh.MA_KH
inner join dich_vu dv on dv.MA_DV = hd.MA_DICH_VU
inner join loai_khach lk on lk.ma_lk = kh.ma_loai_khach
group by kh.ma_kh
having MA_LK = 2 or MA_LK = 1
)select tt.ma_kh,tt.ho_ten, hd.MA_hd ,(tt.tong_chi_phi+ sum(hdct.SO_LUONG*dvdk.gia)) as tong_chi from table_top tt
left join hop_dong hd on tt.ma_kh = hd.ma_khach_hang
left join hop_dong_chi_tiet hdct on hdct.MA_HOP_DONG = hd.ma_hd
left join dich_vu_di_kem dvdk on hdct.MA_DICH_VU_DK = dvdk.ma_dv_dk
group by tt.ma_kh
)as tb);

 -- 18.	Xóa những khách hàng có hợp đồng trước năm 2021 (chú ý ràng buộc giữa các bảng).
 
 delete from khach_hang where (
 select kh.ma_kh from hop_dong hd inner join khach_hang kh on kh.MA_KH = hd.MA_KHACH_HANG where year(hd.ngay_ket_thuc) = 2020);
 
 -- 19.	Cập nhật giá cho các dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2020 lên gấp đôi.
update dich_vu_di_kem set gia = gia*2
where ma_dv_dk in (select tb.ma_dv_dk from (
select dvdk.ma_dv_dk, sum(hdct.so_luong) as so_luong from dich_vu_di_kem dvdk
inner join hop_dong_chi_tiet hdct on hdct.MA_DICH_VU_DK = dvdk.ma_dv_dk
inner join hop_dong hd on hdct.MA_HOP_DONG = hd.ma_hd
where year(hd.ngay_ket_thuc) = 2020
group by dvdk.ma_dv_dk
having SO_LUONG >10
) as tb);
 -- 20.	Hiển thị thông tin của tất cả các nhân viên và khách hàng có trong hệ thống, 
 -- thông tin hiển thị bao gồm id (ma_nhan_vien, ma_khach_hang), ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi.
select ma_kh, ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi, 'khach hàng' as Loai from khach_hang
union all
select ma_nv, ho_ten, email, sdt,ngay_sinh,dia_chi,'nhân viên' as Loai from nhan_vien;
 
 -- 21 Tạo khung nhìn có tên là v_nhan_vien để lấy được thông tin của tất cả
-- các nhân viên có địa chỉ là “Yên Bái” và đã từng lập hợp đồng cho một
-- hoặc nhiều khách hàng bất kì với ngày lập hợp đồng là “25/04/2021”.
 create view view_nhan_vien as
 select nv.MA_NV , nv.ho_ten, nv.dia_chi from nhan_vien nv 
 inner join hop_dong hd on hd.MA_NHAN_VIEN = nv.MA_NV
 where nv.dia_chi like '%Bái%' and hd.ngay_lam_hd='2021-04-25'
 ;
 select * from view_nhan_vien;
 drop view view_nhan_vien;
 -- 22. Thông qua khung nhìn v_nhan_vien thực hiện cập nhật địa chỉ thành “Liên Chiểu” đối với tất cả các nhân viên được nhìn thấy bởi khung nhìn này.
update view_nhan_vien nv set nv.dia_chi = 'Liên Chiểu';

 -- 23 Tạo Stored Procedure sp_xoa_khach_hang dùng để xóa thông tin của một khách hàng nào đó với ma_khach_hang được truyền vào như là 1 tham số của sp_xoa_khach_hang.
 delimiter // 
 create procedure sp_xoa_khach_hang (ma_khach_hang int)
 begin 
 delete from khach_hang kh where ma_khach_hang = kh.MA_KH;
 end //
delimiter ;
 -- 24 Tạo Stored Procedure sp_them_moi_hop_dong dùng để thêm mới vào bảng hop_dong với yêu cầu sp_them_moi_hop_dong phải thực hiện 
 -- kiểm tra tính hợp lệ của dữ liệu bổ sung, với nguyên tắc không được trùng khóa chính và đảm bảo toàn vẹn tham chiếu đến các bảng liên quan.
delimiter //

 
 
 