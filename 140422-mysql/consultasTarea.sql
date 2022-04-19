Select * from agents;
select agent_code, agent_name, working_area, commission from agents 
where commission < 0.15 order by working_area ;

select AGENT_NAME, PHONE_NO from agents 
where PHONE_NO like '077%' order by AGENT_NAME;

select * from customer;
select CUST_NAME, CUST_COUNTRY, GRADE from customer
where GRADE >= 2 and CUST_COUNTRY = 'India' order by GRADE desc;

select CUST_NAME, CUST_COUNTRY, GRADE from customer
where CUST_NAME like 's%' and GRADE < 2 order by CUST_COUNTRY;