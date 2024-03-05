-- https://www.scribd.com/doc/21390228/SQL-Queries
-- https://www.whoishostingthis.com/resources/ansi-sql-standards/#:~:text=1989%3A%20The%20American%20National%20Standards,SQLI%2C%20adding%20some%20new%20features.
-- https://artoftesting.com/qa-interview-questions

select * from orders;

select * from Info;

SELECT * FROM Info 
WHERE CustomerID IN 
(SELECT CustomerID 
FROM Info 
WHERE Country='Ireland') ;

select Max(Amount) from orders; 
-- Select 2nd highest amount value
select Max(Amount)
from orders
where not Amount in(
select Max(Amount)
from Orders
order by Amount desc
);


SELECT Amount
FROM Orders as o1
WHERE 2 = (
                SELECT COUNT( DISTINCT ( o2.Amount ) )
                FROM Orders as o2
                WHERE o2.Amount > o1.Amount
            );



ALTER TABLE Orders ADD Commission int(20);

update Orders
set Commission=Amount*5/100;

-- Get first 3 characters of Last name from info table
select substring(LastName,1,3) from info;

-- Get the position of a specific character.
select locate('o', FirstName) as position from info where FirstName = 'George';

-- Remove white spaces from right side. For left use LTRIM
select RTRIM(FirstName) as TT from info;

-- Display order ID's older than or equal to 10 years.
select OrderID from Orders
where date_format(now(),'%y')-date_format(Order_date,'%y')>=10;

-- Display the list of orders placed before 30-JUN-2010 or after 01-JAN-2015
select OrderID from Orders
where date_format(Order_date,'%Y-%m-%d')<'2010-06-30' or date_format(Order_date,'%Y-%m-%d')>'2015-01-01';

-- Length of a column's value
select FirstName from info
where length(FirstName)=3;

-- Upper case
select upper(FirstName) as UPName from info;

-- Concat columns
select concat(FirstName, ' ',LastName) as FullName from info;

-- Write a query to fetch city wise count of customers sorted by city count in ascending order.
select city, count(CustomerID) as CustCount
from info
group by city
order by city asc;

use sam;
select * from customers;
select * from orderitems;
select * from orders;
select * from products;
select * from vendors;
-- Find vendors count who have a product id in products table.
select vendors.vend_id, count(*)
from vendors inner join products
on vendors.vend_id = products.vend_id
group by vendors.vend_id;

-- Write a query to retrieve the last 3 records from the table.
select * from info
where CustomerID > 
( (select COUNT(*) from info) - 3);

-- Write a query to retrieve countries who have less than 2 customers.
select Country, Count(*)
from info
group by Country
having count(*)<2;

-- Write a query to retrieve CustomerID's along with total salaries paid by each of them
select CustomerID, Amount*Commission as Salary
from Orders
group by CustomerID;


