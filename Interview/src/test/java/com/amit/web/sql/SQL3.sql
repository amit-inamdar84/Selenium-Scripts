select * from Orders;
select * from Info;

select i.CustomerID,FirstName, LastName,Order_date, Amount,City,Country
from Info i
inner join Orders o
on i.CustomerID = o.CustomerID;

select i.CustomerID,FirstName, LastName,Order_date, Amount,City,Country
from Info i
left join Orders o
on i.CustomerID = o.CustomerID;

select i.CustomerID,FirstName, LastName,Order_date, Amount,City,Country
from Info i
right join Orders o
on i.CustomerID = o.CustomerID;

select i.CustomerID,FirstName, LastName,Order_date, Amount,City,Country
from Info i
right join Orders o
on i.CustomerID = o.CustomerID
where FirstName is NULL;

select i.CustomerID,FirstName, LastName,Order_date, Amount,City,Country
from Info i
left join Orders o
on i.CustomerID = o.CustomerID
UNION
select i.CustomerID,FirstName, LastName,Order_date, Amount,City,Country
from Info i
right join Orders o
on i.CustomerID = o.CustomerID;

update Info
set City='Jacksonville'
where CustomerID='345';

-- Self join. 
-- Retrieve a list of customers from same city. Customer ID is different but city is same.
SELECT A.FirstName,A.LastName,A.City
FROM Info A, Info B
WHERE A.CustomerID <> B.CustomerID
AND A.City = B.City 
ORDER BY A.City;
