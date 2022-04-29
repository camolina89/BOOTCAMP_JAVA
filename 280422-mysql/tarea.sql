select * from friendships;
select * from users;

SELECT users.first_name, users.last_name, user2.first_name as friend_firstName, user2.last_name as friend_lastName FROM users 
LEFT JOIN friendships ON friendships.user_id = users.id 
LEFT JOIN users as user2 ON user2.id = friendships.friend_id;

-- 1
SELECT users.first_name, users.last_name FROM users 
LEFT JOIN friendships ON friendships.user_id = users.id 
LEFT JOIN users as user2 ON user2.id = friendships.friend_id
where friendships.friend_id = 4; -- amigos de kemit

-- 2
select users.first_name, users.last_name, count(*) as cantidad_amigos from users
left join friendships on friendships.user_id = users.id
left join users as users2 on users2.id = friendships.friend_id
group by users.first_name, users.last_name;

-- 3
select users.first_name, users.last_name, count(*) as cantidad_amigos from users
left join friendships on friendships.user_id = users.id
left join users as users2 on users2.id = friendships.friend_id
group by users.first_name, users.last_name
order by cantidad_amigos desc limit 1;

-- 4
insert into users values (null, 'Cristóbal', 'Molina', '2022-04-28', null); -- id= 6 amigo de id 2, 4, y 5
insert into friendships values (null, 6, 2, '2022-04-28', null);
insert into friendships values (null, 6, 4, '2022-04-28', null);
insert into friendships values (null, 6, 5, '2022-04-28', null);

-- 5
SELECT user2.first_name, user2.last_name FROM users 
LEFT JOIN friendships ON friendships.user_id = users.id 
LEFT JOIN users as user2 ON user2.id = friendships.friend_id
where users.id = 2 -- amigos de eli
order by user2.first_name ;

-- 6 marky (id=5) ya no es amigo de eli(id=2) :(
delete from friendships where id=5;

-- 7
SELECT users.first_name, users.last_name, user2.first_name as friend_firstName, user2.last_name as friend_lastName FROM users 
LEFT JOIN friendships ON friendships.user_id = users.id 
LEFT JOIN users as user2 ON user2.id = friendships.friend_id
where user2.first_name is not null;