create table Customer(
cID int not null unique primary key,
cName nVarchar(50) not null,
cAge int 
);

create table OrderC(
oID int not null unique primary key,
cID int not null,
oDate datetime,
oTotalPrice double check (oTotalPrice>=0),
constraint frk_cID FOREIGN KEY (cID) REFERENCES Customer(cID)
);

create table Orderdetail(
oID int not null unique,
pID int not null unique,
odQTY int check (odQTY>=0),
constraint Primary key (oID,pID),
constraint frk_oID FOREIGN KEY (oID) REFERENCES OrderC(oID),
constraint frk_pID FOREIGN KEY (pID) REFERENCES Product(pID)
);

create table Product(
pID int not null unique primary key,
pName Nvarchar(50) not null,
pPrice double check (pPrice>=0)
);