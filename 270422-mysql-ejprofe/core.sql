select * from billing;
select * from clients;
select * from leads;
select * from sites;

-- 1 ¿Qué consulta ejecutaría para obtener los ingresos totales para marzo de 2012?
select monthname(charged_datetime) as marzo_2012, sum(amount) as total from billing where charged_datetime between '2012-03-01' and '2012-03-31';

-- 2 ¿Qué consulta ejecutaría para obtener los ingresos totales recaudados del cliente con una identificación de 2?
select client_id, sum(amount) as monto from billing where client_id = 2;

-- 3 ¿Qué consulta ejecutaría para obtener todos los sitios que posee client = 10?
select client_id, domain_name from sites where client_id = 10;

-- 4 ¿Qué consulta ejecutaría para obtener el número total de sitios creados por mes por año para el cliente con una identificación de 1? 
-- ¿Qué pasa con el cliente = 20?
select client_id, count(domain_name), monthname(created_datetime) as mes, year(created_datetime) as anio 
from sites where client_id = 1 group by client_id, mes, anio;

-- 5 ¿Qué consulta ejecutaría para obtener el número total de clientes potenciales generados para cada uno de los sitios
--  entre el 1 de enero de 2011 y el 15 de febrero de 2011?
select sites.domain_name, count(first_name), registered_datetime from leads join sites on sites.site_id = leads.site_id 
where registered_datetime between '2011-01-01' and '2011-02-15' group by sites.domain_name;

-- 6 ¿Qué consulta ejecutaría para obtener una lista de nombres de clientes y el número total de clientes potenciales 
-- que hemos generado para cada uno de nuestros clientes entre el 1 de enero de 2011 y el 31 de diciembre de 2011?
select concat(clients.first_name, ' ' ,clients.last_name) as name_client, count(leads.leads_id) 
from leads join sites on leads.site_id = sites.site_id join clients on sites.client_id = clients.client_id
where registered_datetime between '2011-01-01' and '2011-12-31' group by sites.domain_name ;

-- 7 ¿Qué consulta ejecutaría para obtener una lista de nombres de clientes y el número total de clientes potenciales que hemos generado para cada 
-- cliente cada mes entre los meses 1 y 6 del año 2011?