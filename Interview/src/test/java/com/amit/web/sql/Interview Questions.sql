-- 2nd highest salary
SELECT TOP 1 salary
FROM(
SELECT TOP 3 salary
FROM employee_table
ORDER BY salary DESC) AS emp
ORDER BY salary ASC;

-- Select 2nd highest salary value. limit arguments - offset (0,1,2) and no of rows(1,2).
-- Offset can also be seen as index in java array
select distinct(salary) from employee_table order by salary desc limit 1,1;

-- Display date
SELECT CURRENT_DATE();
-- Displays date and time
SELECT NOW();

-- Display the various customers along with totalnumber of orders placed for each customer.The output should contain only those customers with more than 1 order.
select i.CustomerID,FirstName, count(o.CustomerID)
from Info i
inner join Orders o
on i.CustomerID = o.CustomerID
group by i.CustomerID
having count(o.CustomerID)>1;

-- Display the name of the customer who earns highest commission
select * from Orders
where Commission=
(select max(Commission) 
from Orders);

-- Upper case
select upper(FirstName) as UPName from info;

-- Lower case
select lower(Lastname) as lowname from Info;

-- Get first 3 characters of Last name from info table
select substring(LastName,1,3) from info;

-- Display order ID's older than or equal to 10 years.
select OrderID from Orders
where date_format(now(),'%y')-date_format(Order_date,'%y')>=10;

-- Display the list of orders placed before 30-JUN-2010 or after 01-JAN-2015
select OrderID from Orders
where date_format(Order_date,'%Y-%m-%d')<'2010-06-30' or date_format(Order_date,'%Y-%m-%d')>'2015-01-01';

-- Write a query to fetch city wise count of customers sorted by city count in ascending order.
select city, count(CustomerID) as CustCount
from info
group by city
order by city asc;

-- Write a query to retrieve countries who have less than 2 customers.
select Country, Count(*)
from info
group by Country
having count(*)<2;

-- Write a query to retrieve CustomerID's along with total salaries paid by each of them
select CustomerID, Amount*Commission as Salary
from Orders
group by CustomerID;

-- Self join. 
-- Retrieve a list of customers from same city. Customer ID is different but city is same.
SELECT A.FirstName,A.LastName,A.City
FROM Info A, Info B
WHERE A.CustomerID <> B.CustomerID
AND A.City = B.City 
ORDER BY A.City;