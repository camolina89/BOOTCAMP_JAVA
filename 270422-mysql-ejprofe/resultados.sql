select * from customers;
select * from customers where state = 'TX' order by city, first_name;
select * from customers where email like '%gmail%' and phone != 'null' order by state, city;

select * from stores;
select * from orders;
select store_name, order_date, count(*) as cantidad 
from orders 
join stores on stores.store_id = orders.store_id
group by store_name, order_date
order by cantidad desc;

select * from staffs;
select * from orders;
select * from stores;

select last_name, first_name, count(*) as Ventas_personales
from orders
join staffs on staffs.staff_id = orders.staff_id
where orders.store_id = 1
group by last_name
order by Ventas_personales desc limit 1;

select * from order_items;
select * from orders;

select last_name, first_name, sum( quantity * (list_price - discount)) as monto 
from order_items
join orders on orders.order_id = order_items.order_id
join staffs on staffs.staff_id = orders.staff_id
where orders.store_id = 3
group by last_name;