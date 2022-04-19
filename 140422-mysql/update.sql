Select * from agents;
update agents set agent_name = 'Alexander' where agent_code = 'A003';

update agents set working_area = 'New Delhi' where working_area = 'Bangalore';

select agent_name, WORKING_AREA, commission from agents
where WORKING_AREA in ('London','New York', 'San Jose');

select agent_name, WORKING_AREA, commission from agents
where WORKING_AREA not in ('London','New York', 'San Jose');

delete from agents where agent_code = 'A008';



