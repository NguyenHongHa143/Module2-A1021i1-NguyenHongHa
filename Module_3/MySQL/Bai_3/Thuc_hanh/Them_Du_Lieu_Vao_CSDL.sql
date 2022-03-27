CREATE TABLE Class
(
    ClassID   INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    ClassName VARCHAR(60) NOT NULL,
    StartDate DATETIME    NOT NULL,
    Status    BIT
);

create table Student(
	StudentId   INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    StudentName VARCHAR(30) NOT NULL,
    Address     VARCHAR(50),
    Phone       VARCHAR(20),
    Status      BIT,
    ClassId     INT         NOT NULL,
    FOREIGN KEY (ClassId) REFERENCES Class (ClassID)
);

CREATE TABLE Subject
(
    SubId   INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    SubName VARCHAR(30) NOT NULL,
    Credit  TINYINT     NOT NULL DEFAULT 1 CHECK ( Credit >= 1 ),
    Status  BIT                  DEFAULT 1
);

CREATE TABLE Mark1
(
   MarkId    INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  SubId     INT NOT NULL,
   StudentId INT NOT NULL,
   Mark      FLOAT   DEFAULT 0 CHECK ( Mark BETWEEN 0 AND 100),
    ExamTimes TINYINT DEFAULT 1,
    UNIQUE (SubId, StudentId),
    FOREIGN KEY (SubId) REFERENCES Subject (SubId),
    FOREIGN KEY (StudentId) REFERENCES Student (StudentId)
);
select * from mark1;
select * from class;
insert into class (ClassID,ClassName,StartDate,Status) 
values 
(1,'A1','2008-12-20',1),
(2,'A2','2008-12-22',1),
(3,'B3',current_date(),0);

insert into Student (StudentName, Address, Phone, Status, ClassId)
values 
('Hung', 'Ha Noi', '0912113113', 1, 1),
('Hoa', 'Hai phong','', 1, 1),
('Manh', 'HCM', '0123123123', 0, 2);

insert into Subject (SubID,SubName,Credit,Status) 
values
(1, 'CF', 5, 1),
(2, 'C', 6, 1),
(3, 'HDJ', 5, 1),
(4, 'RDBMS', 10, 1);

insert into  Mark1 (SubId, StudentId, Mark, ExamTimes)
values 
(1, 1, 8, 1),
(1, 2, 10, 2),
(2, 1, 12, 1);

select * from student;
select * from student
where Status = 1;
select * from subject
where Credit <10;
select c.ClassName, s.StudentName from 
Class c inner join student s on c.ClassID=s.ClassId
where c.className = 'A1';
select s.studentName, sub.subName, m.mark from
Student s 
left join mark1 m on s.studentId = m.StudentId
left join subject sub on sub.SubId = m.SubId
where sub.subName = 'CF';
