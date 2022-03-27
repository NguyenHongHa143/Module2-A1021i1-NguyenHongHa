-- Hiển thị số lượng sinh viên ở từng nơi
select s.Address , count(1) as 'So luong SV' from student s
group by s.Address;
-- Tính điểm trung bình các môn học của mỗi học viên
select s.StudentName , avg(m.mark) as 'Điểm Trung Bình' from mark1 m
inner join student s on s.StudentId = m.StudentId
group by s.StudentName; 

-- Hiển thị những bạn học viên co điểm trung bình các môn học lớn hơn 11
 select s.StudentName, avg(m.mark) as 'Diem TB' from mark1 m
inner join student s on s.StudentId = m.StudentId
group by s.StudentName
having avg(m.Mark)>11;

-- Hiển thị thông tin các học viên có điểm trung bình lớn nhất. 
select  s.StudentName, avg(m.Mark)  as 'diem TB top1' from mark1 m
inner join student s on s.StudentId = m.StudentId
group by s.StudentName
having avg(m.Mark) >= all(select avg(m.Mark) from mark1 m
inner join student s on s.StudentId = m.StudentId)





 




