select * from autos;
update autos set stock = 5 where id in (1, 2, 3, 4, 5);
alter table autos add check (stock >= 0);
select * from ventas;
delete from ventas where cliente = 'Freddy Turbina';

start transaction;
insert into ventas values ('2022-04-25',5,'Mohamed Salah',1110,20000000,'credito');
update autos set stock = stock - 1 where id = 5;
commit;

start transaction;
insert into ventas values ('2022-04-24',2,'Freddy Turbina',31313131,4000000,'debito');
update autos set stock = stock - 1 where id = 2;
savepoint ventas_trucha;
insert into ventas values ('2022-02-24',3,'Freddy Turbina',31313133,8000000,'debito');
update autos set stock = stock - 6 where id = 3;

rollback to ventas_trucha;


