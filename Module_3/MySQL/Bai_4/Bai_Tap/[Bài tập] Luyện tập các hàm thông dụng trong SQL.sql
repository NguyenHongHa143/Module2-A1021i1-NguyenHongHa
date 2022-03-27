-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất. 
select * from subject
where Credit = (select max(Credit) from subject) ;
-- Hiển thị các thông tin môn học có điểm thi lớn nhất. 
select * from subject sub
inner join mark1 m on sub.subID = m.subID
where m.mark = (select max(mark) from mark1);

-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần 
select s.StudentID,s.StudentName,s.Address,s.Phone, avg(m.mark) as 'DIEM TB' from Student s 
left join mark1 m on m.StudentId = s.StudentID
group by s.StudentID
order by avg(m.mark) desc