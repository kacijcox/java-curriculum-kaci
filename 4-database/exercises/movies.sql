DROP DATABASE IF EXISTS movies;
CREATE DATABASE movies;
USE movies;

CREATE TABLE genres (
genre_id INT PRIMARY KEY AUTO_INCREMENT,
genre_name VARCHAR(50)
);

CREATE TABLE movie (
	movie_id INT PRIMARY KEY, 
	title VARCHAR(50) NOT NULL,
    release_date DATE,
    rating VARCHAR(25) NOT NULL,
    director VARCHAR(50) NOT NULL,
    genre_id INT, -- fk
    
    CONSTRAINT fk_movie_genre_id FOREIGN KEY (genre_id) REFERENCES genres(genre_id)
);

CREATE TABLE actors (
	actor_id INT PRIMARY KEY AUTO_INCREMENT, -- pk
    movie_id INT, -- fk
	actor_first_name VARCHAR(25) NOT NULL, 
    actor_last_name VARCHAR(25) NOT NULL,
    date_of_birth DATE,
        
    CONSTRAINT fk_actors_movie_id FOREIGN KEY (movie_id) REFERENCES movie(movie_id)
);

CREATE TABLE movie_actor (
	movie_id INT,
    actor_id INT,
    
	CONSTRAINT pk_movie_actor PRIMARY KEY (actor_id, movie_id),
    
    CONSTRAINT fk_movie_actor_movie_id FOREIGN KEY (movie_id) REFERENCES movie(movie_id),
	CONSTRAINT fk_movie_actor_actor_id FOREIGN KEY (actor_id) REFERENCES actors(actor_id)
    );
