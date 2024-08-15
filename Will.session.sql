-- show databases;
-- DROP DATABASE artist;
-- CREATE DATABASE music;
-- show databases;
-- use music;
-- show tables;
-- CREATE table artist (id int, title VARCHAR(255), genre VARCHAR(255), year int, price int);
-- ALTER TABLE artist RENAME cd;
-- create table artist (id int, first_name VARCHAR(255), last_name VARCHAR(255), instrument VARCHAR(255));
-- INSERT into cd (id, title, genre, year, price) VALUES (1,'Take Care', 'Rap', 2012, 15),(2, 'Her loss', 'Rap', 2022, 18),
-- (3, 'Nostalgia', 'R&B', 2015,10),(4, 'Thurl', 'Rap',2024, 18),(4,'She Knows', 'Country', 2020,9);
-- INSERT into artist (id, first_name, last_name, instrument) VALUES (1, 'Aubrey', 'Graham', 'Drums'),(2,'21','Savage','Flute'),(3, 'Rod','Wave','Tuba'),(4,'Kur','Jackson','Piano'),(5, 'Kate','Middleton','Trumpet');
-- UPDATE cd SET id = 5 where price = 9;
-- select * from cd;
-- CREATE table artist_cd (artist_id int, cd_id int);
-- INSERT into artist_cd (cd_id) VALUES (1),(1),(2),(2),(3),(4),(5);
INSERT into artist_cd (artist_id) VALUES (1),(2),(1),(2),(3),(4),(5);
-- DELETE from artist_cd where cd_id is null and artist_id is null;
select * from artist_cd;

