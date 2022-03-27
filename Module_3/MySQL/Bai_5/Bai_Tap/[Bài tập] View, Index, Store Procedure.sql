-- Tạo Unique Index trên bảng Products (sử dụng cột productCode để tạo chỉ mục) 
alter table products add index index_code (productCode);
explain select productCode from products where productCode=1;
-- Tạo Composite Index trên bảng Products (sử dụng 2 cột productName và productPrice) 
alter table products add index index_name_price (productName,productPrice);
explain select * from products p where p.productName = 'Ha' and p.productPrice = 10;
-- Tạo view lấy về các thông tin: productCode, productName, productPrice, productStatus từ bảng products. 
create view product_view as
select productCode, productName, productPrice, productStatus from products;
select * from product_view;

-- Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product
delimiter //
create procedure pr_all()
begin 
 select * from products;
end //
delimiter ; 
call pr_all;
-- Tạo store procedure thêm một sản phẩm mới
 delimiter //
 create procedure insert_product(
 id_para int,
 productCode_para int,
 productName_para varchar(50),
 productPrice_para double,
 productAmount_para varchar(50),
 productDescription_para varchar(50),
 productStatus_para varchar(50)
 )
 begin 
 insert into products values 
 (id_para,productCode_para,productName_para,productPrice_para,productAmount_para,productDescription_para,productStatus_para);
 end //
 delimiter ;
 call insert_product(3,3,'Thanh',20,'ok','hay','ok');
 -- Tạo store procedure sửa thông tin sản phẩm theo id 
 delimiter //
 create procedure set_product(
 pid int,
 pCode int,
 pName varchar(50),
 pPrice double,
 pAmount varchar(50),
 pDecript varchar(50),
 pStatus varchar(50)
 )
 begin 
 update products set productCode = pCOde,productName = pName,productPrice = pPrice,productAmount = pAmount,productDescription = pDecript,productStatus = pStatus 
 where id = pId;
 end //
 delimiter ;
 -- Tạo store procedure xoá sản phẩm theo id 
 DELIMITER //
CREATE PROCEDURE delete_product_id(pid int)
BEGIN
DELETE FROM product WHERE id= pid;
END //
DELIMITER ;