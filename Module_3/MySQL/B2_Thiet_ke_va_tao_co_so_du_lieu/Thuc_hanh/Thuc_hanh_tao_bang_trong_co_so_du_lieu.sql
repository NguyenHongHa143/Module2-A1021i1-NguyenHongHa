create table HocSinh(
MaHS int NOT NULL UNIQUE,
TenHS NVarchar(50) NOT NULL,
NgaySinh datetime,
LOP varchar(10) NOT NULL,
GT varchar(10) NOT NULL,
Primary Key(MaHS)
);

create table MonHoc(
MaMH int NOT NULL UNIQUE,
TenMH Nvarchar(20) not null,
MaGV int NOT NULL UNIQUE,
Primary key(MaMH),
constraint frk_MaGV FOREIGN KEY (MaGV) REFERENCES GiaoVien(MaGV)
);

create table BangDiem(
MaHS int NOT NULL UNIQUE,
MaMH int NOT NULL UNIQUE,
DiemThi double check (DiemThi >=0),
NgayKT datetime,
constraint frk_MaHS FOREIGN KEY (MaHS) references HocSinh(MaHS),
constraint frk_MaMH FOREIGN KEY (MaMH) REFERENCES MonHoc(MaMH)
);

create table GiaoVien(
MaGV int NOT NULL UNIQUE,
TenGV Nvarchar(20) NOT NULL,
SDT varchar(10),
primary key (MaGV)
);

alter table BangDiem
add primary key (MaHS,MaMH)
;