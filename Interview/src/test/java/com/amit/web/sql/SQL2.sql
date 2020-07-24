-- Aggregate functions are used to summarize data without actually retrieving the data. These functions operate on a set of rows to calculate and return a single value.
-- AVG(), COUNT(), MAX(), MIN(), SUM() are the types of aggregate functions.
-- AVG() is used to return the average value of a specific column.
-- COUNT() is used to count the no of rows in a table or no of rows that match a specific criterion.
-- COUNT(*) is used to count the no of rows in a table, whether columns contain values or NULL values.
-- COUNT(column name) counts the no of rows that have values in a specific column, ignoring NULL values.
-- MAX() returns the highest value in a specified column. It requires that the column be specified.
-- MIN() returns the lowest value in a specified column. It requires that the column be specified.
-- SUM() returns the sum of values in a specific column. Can also be used to total calculated values.
-- Aggregate functions can be used with distinct argument to include only distinct values. Default argument is ALL which includes all rows.
-- date_format(colname, '%y') function takes argument col name and  %y to format the column as year
-- date_format(colname, '%b') function takes argument col name and  %b to format the column as month

select * from Orders;
select * from Info;

-- Aggregate functions
select AVG(Commission) as avg_comm from Orders;
select AVG(Commission) as avg_comm, AVG(Amount) as avg_amt from Orders;
select count(*) as cnt from orders;
select count(CustomerID) as cntcust from orders;
select max(OrderID) as max_ID from orders;
-- Text data max is the same as sorted data last value.
select max(Country) as max_country from info;
select min(OrderID) as min_ID from orders;
select sum(Amount) as sum_amt, SUM(Commission) as sum_comm from Orders;
select sum(Amount*Commission) as profit from Orders;
select sum(Amount) from Orders;
select max(Amount) from Orders
where CustomerID='789';

-- Aggregate with distinct
select avg(distinct CustomerID) as avg_cust from orders;
select count(distinct City) as cty from info;
select sum(distinct CustomerID) as cid from Orders;
select DISTINCT Country from Info;

-- Multiple aggregate functions
select count(*) as cnt, max(Amount) as max_amt, min(Amount) as min_amt, avg(Amount) as avg_amt from Orders;

select Country, count(*) from Info group by Country;

-- Same as alias
select count(*) Country from Info;

select CustomerID, count(*), max(Amount), min(Amount), avg(Amount) from Orders group by CustomerID;

select Order_date, count(*), max(Amount), min(Amount), avg(Amount) from Orders group by Order_date;

-- Date functions
select date_format(Order_Date, '%b') month, count(*) from Orders group by date_format(Order_Date, '%b') order by month;

select date_format(Order_Date, '%y') year,date_format(Order_Date, '%b') month, count(*) from Orders group by date_format(Order_Date, '%y'),date_format(Order_Date, '%b');

-- Having clause
select CustomerID, count(*) from Orders group by CustomerID having count(*)>=2;

select date_format(Order_Date, '%b') month, count(*) from Orders group by date_format(Order_Date, '%b') having month='Dec';

select date_format(Order_Date, '%b') month, count(*) from Orders group by date_format(Order_Date, '%b') having month in ('Dec','Nov');

select date_format(Order_Date, '%y') year, count(*) from Orders group by date_format(Order_Date, '%y') having year='14';

select date_format(Order_Date, '%y') year,date_format(Order_Date, '%b') month, count(*) from Orders group by date_format(Order_Date, '%b') having year='12';

select date_format(Order_Date, '%y') year,date_format(Order_Date, '%b') month, count(*) from Orders group by date_format(Order_Date, '%b') having year='14' and month='Jul';

select CustomerID, count(*) 
from Orders 
where date_format(Order_Date, '%y')='10' and date_format(Order_Date, '%b')='May' 
group by date_format(Order_Date, '%y'),date_format(Order_Date, '%b')
having count(*)>=1;

update Orders
set Order_Date='2010-05-15 00:00:00'
where OrderID='1099';
