select * from customer;
select sum(payment_amt) as 'total_payment' from customer;

select concat(cust_country,'-',cust_city) as 'ciudad' , count(cust_city) as 'cuantos_en_ciudad' from customer 
group by cust_city order by CUST_COUNTRY ;