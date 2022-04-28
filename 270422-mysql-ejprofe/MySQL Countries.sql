-- 1
select * from languages;
select * from countries;
select * from cities;
select name, language, percentage  from languages
join countries on countries.id = languages.country_id
where language = 'slovene'
order by percentage desc;

-- 2
select countries.name, count(*) as cantidad_ciudades from countries
join cities on cities.country_id = countries.id
group by countries.name
order by cantidad_ciudades desc;


-- 3
select cities.name, cities.population from cities
join countries on countries.id = cities.country_id
where cities.population > 500000 and countries.name = 'Mexico'
order by population desc;

-- 4
select name, language, percentage from languages
join countries on countries.id = languages.country_id
where percentage > 89
order by percentage desc;

-- 5
select name, surface_area, population from countries
where surface_area < 501 and population > 100000
order by name;

-- 6
select name, government_form, life_expectancy from countries
where government_form = 'Constitutional Monarchy' and capital > 200 and life_expectancy > 75;

select name, life_expectancy from countries
where name = 'Chile';

-- 7
select countries.name, cities.name, district, cities.population from countries
join cities on cities.country_id = countries.id
where cities.district = 'Buenos Aires' and cities.population > 500000
order by cities.population desc;

-- 8
select region, count(*) as num_paises from countries
group by region
order by num_paises desc;
