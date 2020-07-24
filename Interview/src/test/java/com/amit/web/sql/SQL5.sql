-- Grouping lets you divide data into logical sets so that you can perform aggregate calculations on each group.
-- GROUP BY clause instructs the DBMS to group the data and then perform aggregate on each group rather than on the entire result set.
-- Can contain multiple columns. Can contain retrieved column or expressions but not aggregate columns.
-- If expression is used the same shoud be used in clause. Alias cannot be used.
-- NULL values will be grouped together.
-- WHERE filters rows and having filters groups. HAVING supports all of WHERE operator.
-- WHERE filters before data is grouped and HAVING filters after data is grouped.
-- Hierarchy of statement: SELECT, FROM, WHERE, GROUP BY, HAVING, ORDER BY.
-- Sub queries are used when output of inner query is used as input of outer query.
-- Sub queries can be used in WHERE clause using IN operator and for populating calculated columns.
-- Data is stored in separate tables to avoid multiple occurences of same data. There is a relationship established between these tables for data retrieval. This is the
-- basis for relational database design. The data stored in multiple tables is retrieved using joins.
-- Join is a mechanism used to associate tables within a SELECT statement.
-- Join is not physical entity. It just exists for the duration of the query execution.
-- If an invalid vendor ID is stored in products table, those products would be inaccessible because they are not related to any vendor. To prevent this from occuring
-- the database can be insructed to allow only valid values present in the vendor ID column.  This is called referential integrity.
-- When you join two tables, you are actually pairing every row in the first table with every row in the second table. The WHERE clause acts as a filter to include only
-- rows that match the specified filter condition.
-- Types of joins: Inner join, Self join, Natural join and Outer join(Left outer join and right outer join and full outer join(not supported by Mysql and SQL server))
-- The join based on testing of equality between two tables is called equijoin or inner join.
-- Self joins are used to replace sub queries that retrieve data from same table as the outer statement.
-- Outer joins include table rows that have no associated rows in the related table.

use sam;
select * from customers;
select * from orderitems;
select * from orders;
select * from products;
select * from vendors;

-- Groups vend_id and lists the no of products per vendor.
select vend_id, count(*) from products group by vend_id;
-- Multiple group by
select prod_id, vend_id, count(*) from products group by vend_id,prod_id;
-- Lists the total price for each order number.
select order_num, quantity*item_price as total_price from orderitems group by order_num;

-- Having clause
-- Below query lists groups of cust_id's and their no of orders.
select cust_id, count(*) from orders group by cust_id;
-- As an extension having clause filters those groups to retrieve cust_id's having more than or equal to 2 orders.
select cust_id, count(*) from orders group by cust_id having count(*)>=2;
-- Using where and having clause together.
-- Lists all vendors who have two or more products priced at 4 or more.
select vend_id, count(*) as num_prods from products where prod_price >= 4 group by vend_id having count(*) >= 2;
-- Using group by and order by together
-- Retrieves the order number and no of items ordered for all orders containing 3 or more items.
select order_num, count(*) as items from orderitems group by order_num having count(*) >= 3 order by items;

-- Sub queries
-- Retrieves a list of all customers who ordered a particular item.
select cust_name, cust_contact from customers where cust_id in(
select cust_id from orders where order_num in(
select order_num from orderitems where prod_id='RGAN01'
));

-- Retrieve the total no of orders placed by every customer. Here the orders column is a calculated column from sub query.
select cust_id,cust_name,cust_state,(select count(*) from orders where orders.cust_id=customers.cust_id) as
orders
from customers
order by cust_name;

-- Retrieve 2nd lowest product price. Below query doesnt work in Mysql because of subquery limit support.
select prod_id,prod_price
from products
where prod_price IN
(select distinct prod_price
from products
order by prod_price asc
limit 2
)
order by prod_price desc
limit 1;

-- Another way for above problem
select distinct(prod_price) from products order by prod_price asc limit 1,1;

-- Inner join
-- It lists all vendors who have a product in products table.
select vend_name, prod_name, prod_price
from vendors, products
where vendors.vend_id = products.vend_id;

-- Same example using inner join syntax
select vend_name, prod_name, prod_price
from vendors inner join products
on vendors.vend_id = products.vend_id;

select orders.order_num, order_item, prod_id
from orders inner join orderitems
on orders.order_num = orderitems.order_num and orderitems.order_num = 20006;

-- Retrieves a list of all customers who ordered a particular item.
-- Repeated example but using inner joins and aliases
select cust_name, cust_contact
from customers as C inner join orders as O inner join orderitems as OI
on C.cust_id = O.cust_id and O.order_num = OI.order_num and prod_id='RGAN01';

-- Self joins
-- Retrieve email of all employees for the same company as ABC.
-- Using subquery
select cust_id, cust_name, cust_contact
from customers
where cust_name = ( select cust_name 
from customers 
where cust_contact = 'Jim Jones'
);

-- Using self join
select c1.cust_id, c1.cust_name, c1.cust_contact
from customers as c1, customers as c2
where c1.cust_name = c2.cust_name
and c2.cust_contact = 'Jim Jones';

-- Left Outer join
-- Retrieves one extra row 1000000002 which has no orders in orders table as against inner join
select c.cust_id, o.order_num
from customers as c left outer join orders as o
on c.cust_id = o.cust_id;

-- Right outer join
select o.order_num, c.cust_id
from  orders as o right outer join customers as c
on o.cust_id = c.cust_id;

-- Joins with aggregate functions
select c.cust_id, COUNT(o.order_num) as num_orders
from customers as c inner join orders as o
on c.cust_id = o.cust_id
group by c.cust_id;

select c.cust_id, COUNT(o.order_num) as num_orders
from customers as c left outer join orders as o
on c.cust_id = o.cust_id
group by c.cust_id;

