-- Database: It is a collection of data stored in some organized fashion.
-- Table: A structured list of data of a specific type.
-- Schema: Information about database and table layout and properties.
-- Column: A single field in a table.
-- Rows: A record in a table.
-- Primary key: A column or set of columns whose values uniquely identify every row in a table.
-- A primary key should satisy these conditions - No two rows can have same primary key value, Every row must have a primary key value, Values in primary key columns
-- can never be modified or updated, Primary key values cannot be reused.i.e. if a row is deleted its primary key value cannot be reassigned to any new rows in future.
-- Ways to select data - Retrieving individual column, Retrieving multiple columns and Retrieving all columns.
-- ORDER BY is a clause used to sort the retrieved data. This clause should be the last clause in select statment.
-- We can also sort data by a column that is actually not used in the select statement.
-- We can sort data by single column, multiple column and column position. When using multiple columns data is sorted first by 1st column and then by 2nd column.
-- When sorting using column position consider the position of columns appearing in select statment.We can mix column position and column name in ORDER BY clause.
-- ORDER BY clause can specify ASC and DESC order. Default is ASC. We can specify both in a single clause. i.e. ASC for one column and DESC for another.
-- If column data is text we need settings to determine if A is same as a.
-- Where clause is used for filtering data. It comes right after the table name. ORDER BY clause comes after WHERE clause.
-- The operators that can be used in WHERE clause are =, <>, !=, <, <=, !<, >, >=, !>, BETWEEN, IS NULL.
-- WHERE clause can be used for: Checking against a single value, checking for nonmatches, cheking for a range of values, checking for no value.
-- A null column just has no value. It is not empty string, spaces or 0. IS NULL return rows that have null value for specified column.
-- AND operator is a logical operator which helps to filter by more than one column. It returns only the ROWS that match both the specified conditions. The conditions apply to each row. Here 2 different columns can be specified on the either side of AND.
-- OR operator is used in WHERE clause to specify that any ROWS matching either of the specified conditions should be retrieved.
-- Order of evaluation - AND operator is ranked first as against OR. However if there is OR operator within parenthesis it takes precendence.
-- Whenever we use AND and OR operators in WHERE clause it is better to use parenthesis to group the operations.
-- IN operator is used to specify multiple values. It works similar to OR operator. IN can be used for sub queries.
-- NOT operator can be used before a column name to negate the query result. It can also be used with IN operator after the column name.
-- Wildcards are special characters used to match parts of a value. LIKE operator is required to use wildcards. They can be used only with text fields.
-- %, _, [] are wild cards
-- Wild card search decreases performance. Should avoid using wildcards if possible. Search patterns that begin with wildcards are the slowest to process.
 
CREATE DATABASE customers;
 
CREATE TABLE Orders (
    OrderID int,
    Order_date varchar(255),
    Amount int,
    CustomerID int
);
CREATE TABLE Info (
    CustomerID int(255),
    LastName varchar(255),
    FirstName varchar(255),
    City varchar(255),
    Country varchar(255)
);

ALTER TABLE Orders
MODIFY COLUMN Amount int;

use customers;

select * from Orders;
select * from Info;

INSERT INTO Orders (OrderID, Order_date, Amount,CustomerID)
VALUES ('713','2000-05-15 00:00:00','833','789');

INSERT INTO Orders (OrderID, Order_date, Amount,CustomerID)
VALUES ('720','2000-05-15 00:00:00','1000','790');

INSERT INTO Orders (OrderID, Order_date, Amount,CustomerID)
VALUES ('723','2000-05-15 00:00:00','1098','791');

INSERT INTO Orders (OrderID, Order_date, Amount,CustomerID)
VALUES ('725','2023-09-28 00:00:00','209','792');

INSERT INTO Orders (OrderID, Order_date, Amount,CustomerID)
VALUES ('726','2023-10-05 00:00:00','680','792');

INSERT INTO Orders (Commission)
VALUES (9);

INSERT INTO Info (CustomerID,LastName, FirstName, City, Country)
VALUES ('456','Wanderhault','Van','Dublin', 'Ireland');

INSERT INTO Info (CustomerID,LastName, FirstName, City, Country)
VALUES ('789','Futterkiste','Alfreds','Berlin', 'Germany');

INSERT INTO Info (CustomerID,LastName, FirstName, City, Country)
VALUES ('790','Emparedados','Ana','México', 'Mexico');

INSERT INTO Info (CustomerID,LastName, FirstName, City, Country)
VALUES ('791','snabbköp','Berglunds','Luleå', 'Sweden');

INSERT INTO Info (CustomerID,LastName, FirstName, City, Country)
VALUES ('792','Hardy','Thomas','Berlin', 'Germany');

update Orders
set Commission = '15'
where OrderID = '725';

select OrderID,Commission from Orders where Commission = 15;

select Amount, CustomerID from Orders where Amount <> 765;

select OrderID,Commission from Orders where Commission != 41.65;

select OrderID,Commission from Orders where Commission < 10;

select OrderID,Commission from Orders where Commission <= 12;

select OrderID,Commission from Orders where Commission > 11;

select OrderID,Commission from Orders where Commission >= 25;

select * from Orders where CustomerID IS NULL;

select * from Orders where CustomerID IS NOT NULL;

select * from Orders where Amount between 100 and 500;

-- Conditions specified should be within a row and not within a column.
select * from Orders where CustomerID = 60 AND OrderID = 123 AND Amount = 234.25;
select * from info where Country = 'USA' AND City = 'Jacksonville';
select * from info where Country = 'France' AND City = 'Jacksonville';

select * from Orders where CustomerID = 60 OR CustomerID = 345;
select * from Orders where CustomerID = 60 OR Amount = 234.25;
select * from Orders where OrderID = 545 OR CustomerID = 60;

select * from info where (Country = 'USA' OR Country = 'UK') AND CustomerID > 50;

-- IN allows to specify multiple values within parenthesis seperated by comma. It is alternative for OR operator.
select * from Orders where OrderID in (123);
select * from Orders where CustomerID in ('60','345');
select * from info where FirstName in ('George','Van');
select * from Orders where OrderID in (545) OR CustomerID in (60);
select * from Orders where OrderID in (712) AND CustomerID in (789);
select * from info
where Country IN ('USA','France')
and CustomerID>60;

-- Negate the result
select OrderID,Commission from Orders where not Commission >= 25;
-- Here the result does not include NULL values in the specified column.
select * from Orders where CustomerID not in ('60','345');
-- Same as above
select * from Orders where not CustomerID in ('60','345');
select * from Info where Country in ('USA') and CustomerID>60;

-- Wild card filtering. % means match any no of occurrences of any character.
-- Starts with Wash and then any characters.
select * from Info where LastName like 'Wash%';

select * from info where City like '%unt%';

-- Starts with m and ends with e. Anything in between.
select * from Info where LastName like 'm%e';

-- Matched single charcater, then A and then any string.
select * from info
where FirstName LIKE '_A%';

-- _ matches just a single character.
-- Starts with J, 3 spaces with any characters and anything thereafter.
select * from Info where FirstName like 'J___%';
select * from Info where FirstName like 'J__';
select LastName, FirstName from info where LastName like '__sso';
select * from info where Country like '%SA';

-- Order By clause
select CustomerID,LastName from Info order by CustomerID;
-- Order by a column that is not selected for display 
select CustomerID from info order by Country;
-- Order by multiple column
select * from Info order by Country,City;
-- Order by column position
select City, FirstName from info order by 1,2;
-- Mix column position and column name in order by
select OrderID, Order_date, Amount from Orders order by OrderID,2,3;
-- Ascending and descending order
select OrderID,Order_date,CustomerID from Orders order by CustomerID desc; 
select CustomerID,LastName from Info order by LastName desc,CustomerID asc; 
select CustomerID,LastName from Info order by LastName desc,CustomerID desc; 
select CustomerID,LastName from Info order by LastName asc,CustomerID asc;
-- Order by should be the last clause.
select * from info where CustomerID>50 order by CustomerID;

-- Alias is just an alternate name for a column. It is alsoo called drived column. Specially used for calculated fields.
select OrderID as 'Order_ID',Amount as 'Amt', CustomerID as 'Cust_ID' from Orders;
select OrderID, Amount*Commission as Profit from Orders;


