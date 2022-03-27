create table Customer (
cID int primary key,
cName varchar(25),
cAge tinyint
);

create table Product(
pID int primary key,
pName varchar(25),
pPrice int
);

create table `Order`(
oID int primary key,
cID int,
oDate datetime,
oTotalPrice int,
constraint frk_cID foreign key (cID) References Customer (cID)
);

create table OrderDetail(
oID int,
pID int,
odQTY int,
constraint frk_oID foreign key (oID) References `Order` (oID),
constraint frk_pID foreign key (pID) References Product (pID)
);

insert into Customer (cID,cName,cAge) values
(1,'Minh Quan',10),
(2,'Ngoc Oanh',20),
(3,'Hong Ha',50);

insert into `Order` (oId,cID,oDate) values
(1,1,'2006/3/21'),
(2,2,'2006/3/23'),
(3,1,'2006/3/16');

update `Order` set oDate = '2006-3-21'
where oID=1;
update `Order` set oDate = '2006-3-23'
where oID=2;
update `Order` set oDate = '2006-3-16'
where oID=3;

insert into Product (pID,pName,pPrice) values
(1,'May Giat',3),
(2,'Tu Lanh',5),
(3,'Dieu Hoa',7),
(4,'Quat',1),
(5,'Bep Dien',2);

insert into OrderDetail (oID,pID,odQTY) values
(1,1,3),
(1,3,7),
(1,4,2),
(2,1,1),
(3,1,8),
(2,5,4),
(2,3,3);

-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
select oID,oDate,oTotalPrice from `Order`;

-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
select c.cName,p.pName from customer c 
inner join `order` o on c.cID=o.cID
inner join OrderDetail d on o.oID = d.oID
inner join Product p on p.pID = d.pID;

-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
select c.cName as 'Ten khach hang' from customer c 
left join `order` o on c.cID = o.cID
where o.oID is null;
 
 -- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn. Giá bán của từng loại được tính = odQTY*pPrice)
 select o.oID, o.oDate, sum(d.odQTY*p.pPrice) as 'Tong tien hoa don' from `Order` o
 inner join OrderDetail d on d.oID = o.oID
 inner join Product p on d.pID = p.pID
 group by o.oID 
 


