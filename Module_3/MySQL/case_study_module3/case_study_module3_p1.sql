-- Thêm mới thông tin cho tất cả các bảng có trong CSDL để có thể thoả mãn các yêu cầu bên dưới. 
-- Câu 2: 2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 kí tự. 
select * from nhan_vien where 
(HO_TEN like 'H%'or Ho_ten like 'T%' or ho_ten like 'K%') and (length(HO_TEN)<15) ;
-- Câu 3 3.	Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
select * from khach_hang where 
((year(now())-year(ngay_sinh)) between 18 and 50) and ((Dia_chi like '%Nang') or (dia_chi like '%Quang Tri')); 
-- Câu 4 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”. 
select kh.Ma_KH, lk.TEN_LK , kh.HO_ten, count(kh.MA_KH) as 'so_lan_dat_phong' from khach_hang kh
inner join  hop_dong hd on kh.MA_KH = hd.MA_KHACH_HANG
inner join loai_khach lk on kh.MA_LOAI_KHACH = lk.MA_LK
group by kh.Ma_KH
having lk.TEN_LK = 'diamond'
order by count(kh.MA_KH);
-- 5.	Hiển thị ma_khach_hang, ho_ten, ten_loai_khach, ma_hop_dong, ten_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc, tong_tien 
-- (Với tổng tiền được tính theo công thức như sau: Chi Phí Thuê + Số Lượng * Giá, với Số Lượng và Giá là từ bảng dich_vu_di_kem, hop_dong_chi_tiet) 
-- cho tất cả các khách hàng đã từng đặt phòng. (những khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).
select kh.MA_KH, kh.HO_TEN, lk.TEn_LK,hd.MA_HD ,dv.Ten_DV,hd.ngay_lam_HD,hd.Ngay_ket_thuc, sum(dv.CHI_PHI_THUE+(dvdk.GIA*hdct.SO_LUONG)) as 'Tong tien' from khach_hang kh 
left join hop_dong hd on hd.MA_KHACH_HANG = kh.MA_KH
left join loai_khach lk on  kh.MA_LOAI_KHACH = lk.MA_LK
left join dich_vu dv on hd.MA_DICH_VU = dv.Ma_DV
left join hop_dong_chi_tiet hdct on hdct.MA_HOP_DONG = hd.MA_HD
left join dich_vu_di_kem dvdk on hdct.MA_DICH_VU_DK = dvdk.ma_dv_dk
group by kh.ma_kh,kh.HO_TEN, lk.TEn_LK,hd.MA_HD ,dv.Ten_DV,hd.ngay_lam_HD,hd.Ngay_ket_thuc;

-- 6.	Hiển thị ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, ten_loai_dich_vu của tất cả các 
-- loại dịch vụ chưa từng được khách hàng thực hiện đặt từ quý 1 của năm 2021 (Quý 1 là tháng 1, 2, 3). 
select dv.ma_dv , dv.ten_dv, dv.dien_tich , dv.chi_phi_thue, ldv.ten_ldv from dich_vu dv 
inner join loai_dich_vu ldv on dv.MA_LOAI_DV = ldv.MA_LDV
where not exists (
select * from hop_dong hd 
where hd.ma_dich_vu = dv.ma_dv
and ( year(hd.ngay_ket_thuc)='2021' ) and month(hd.ngay_ket_thuc) between 1 and 3
);

-- 11.	Hiển thị thông tin các dịch vụ đi kèm đã được sử dụng bởi những khách hàng có ten_loai_khach là “Diamond” và có dia_chi ở “Vinh” hoặc “Quảng Ngãi”.
select dvdk.ma_dv_dk ,dvdk.TEN_DV_DK from dich_vu_di_kem dvdk
inner join hop_dong_chi_tiet hdct on hdct.MA_DICH_VU_DK = dvdk.ma_dv_dk
inner join hop_dong hd on hdct.MA_HOP_DONG = hd.MA_HD
inner join khach_hang kh on kh.MA_KH = hd.MA_KHACH_HANG
inner join loai_khach lk on lk.MA_LK = kh.MA_loai_khach
where lk.TEN_LK = 'diamond' and (kh.DIA_CHI like '%Vinh' or kh.DIA_CHI like '%Ngai');
 
--  12.	Hiển thị thông tin ma_hop_dong, ho_ten (nhân viên), ho_ten (khách hàng), so_dien_thoai (khách hàng), ten_dich_vu, so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở dich_vu_di_kem), 
-- tien_dat_coc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2020 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2021.
select hd.ma_hd from dich_vu dv
inner join hop_dong hd on hd.MA_DICH_VU = dv.MA_DV
inner join nhan_vien nv on nv.MA_NV = hd.MA_NHAN_VIEN
inner join khach_hang kh on kh.MA_KH = hd.MA_KHACH_HANG
inner join hop_dong_chi_tiet hdct on hdct.MA_HOP_DONG = hd.MA_HD
inner join dich_vu_di_kem dvdk on hdct.MA_DICH_VU_DK = dvdk.ma_dv_dk
where  (hd.ngay_ket_thuc between '2020-10-01'
	AND '2020-12-30') and 
(hd.ngay_ket_thuc not between '2021-01-01'
	AND '2020-06-30')
    group by hd.MA_HD;
-- inner join nhan_vien nv on nv.MA_NV = hd.MA_NHAN_VIEN 
-- inner join khach_hang kh on kh.MA_KH = hd.MA_KHACH_HANG
-- inner join dich_vu dv on dv.MA_DV = hd.MA_DICH_VU
-- inner join hop_dong_chi_tiet hdct on hdct.MA_HOP_DONG = hd.MA_HD


--
select hd.MA_HD from hop_dong hd
where  (hd.ngay_ket_thuc between '2020-10-01' AND '2020-12-30') and 
(hd.ngay_ket_thuc not between '2021-01-01' AND '2020-06-30')
group by hd.MA_HD;
    
-- 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).
with table_max as 
(select dvdk.ma_dv_dk, dvdk.ten_dv_dk, count(dvdk.ma_dv_dk) as 'so_lan_su_dung' from hop_dong hd
inner join hop_dong_chi_tiet hdct on hdct.MA_HOP_DONG = hd.MA_HD
inner join dich_vu_di_kem dvdk on dvdk.ma_dv_dk = hdct.MA_DICH_VU_DK
group by dvdk.ma_dv_dk)
select * from table_max where so_lan_su_dung = (select min(so_lan_su_dung) from table_max );
-- 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. 
-- Thông tin hiển thị bao gồm ma_hop_dong, ten_loai_dich_vu, ten_dich_vu_di_kem, so_lan_su_dung (được tính dựa trên việc count các ma_dich_vu_di_kem).
with table_max as (
select hd.ma_hd, ldv.Ten_ldv, dvdk.ten_dv_dk, count(dvdk.ma_dv_dk) as 'so_lan_su_dung' from hop_dong hd
inner join dich_vu dv on dv.ma_dv = hd.MA_DICH_VU
inner join loai_dich_vu ldv on ldv.MA_LDV = dv.ma_loai_dv
inner join hop_dong_chi_tiet hdct on hdct.ma_hop_dong = hd.MA_HD
inner join dich_vu_di_kem dvdk on dvdk.ma_dv_dk = hdct.MA_DICH_VU_DK
group by dvdk.ma_dv_dk
) select * from table_max where so_lan_su_dung = 1;





