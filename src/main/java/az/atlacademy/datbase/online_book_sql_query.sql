CREATE TABLE books
(
    id              SERIAL PRIMARY KEY,
    Title           VARCHAR(50),
    Author          VARCHAR(50),
    Publisher       VARCHAR(50),
    Production_date DATE,
    NumberOfCopies  INT
);
ALTER TABLE reader ALTER COLUMN phone_number TYPE NUMERIC(15);

CREATE TABLE reader
(
    id           SERIAL PRIMARY KEY,
    First_name   VARCHAR(50),
    Last_name    VARCHAR(50),
    Address      VARCHAR(50),
    Phone_number INT,
    Email        VARCHAR(50)
);

CREATE TABLE genre
(
    id   SERIAL PRIMARY KEY,
    Name VARCHAR(30)
);

CREATE TABLE author
(
    id         SERIAL PRIMARY KEY,
    First_name VARCHAR(50),
    Last_name  VARCHAR(50),
    Birth_year INT,
    Death_year INT
);

CREATE TABLE loan
(
    id          SERIAL PRIMARY KEY,
    book_id     INT,
    reader_id   INT,
    loan_date   DATE,
    return_date DATE,
    FOREIGN KEY (book_id) REFERENCES books (id),
    FOREIGN KEY (reader_id) REFERENCES reader (id)
);

CREATE TABLE authorship
(
    id        SERIAL PRIMARY KEY,
    book_id   INT,
    author_id INT,
    FOREIGN KEY (book_id) REFERENCES books (id),
    FOREIGN KEY (author_id) REFERENCES author (id)
);

CREATE TABLE GenreAssignment
(
    id       SERIAL PRIMARY KEY,
    book_id  INT,
    genre_id INT,
    FOREIGN KEY (book_id) REFERENCES books (id),
    FOREIGN KEY (genre_id) REFERENCES genre (id)
);

INSERT INTO books(title, author, publisher, production_date, numberofcopies)
VALUES ('A Tale of Two Cities', ' Charles Dickens', 'Chapman & Hall', '1775-05-30', 500),
       ('The Hound of the Baskervilles', 'Arthur Conan Doyle', 'George Newnes Ltd', '1902-04-25', 250),
       ('War and Peace', 'Leo Tolstoy', ' Russian Messenger', '1867-01-01', 200),
       ('Oliver Twist', ' Charles Dickens', 'Richard Bentley', '1839-04-28', 300),
       ('Animal Farm', 'George Orwell', 'Secker and Warburg', '1945-08-18', 500);

INSERT INTO Reader (First_name, Last_Name, Address, Phone_Number, Email)
VALUES ('John', 'Doe', 'Goven St', '5551234', 'john@gmail.com'),
       ('Jane', 'Smith', 'Elm St', '5555678', 'jane@gmail.com'),
       ('Alisa', 'Wonder', 'Man St', '5551343', 'alisa@gmail.com');

INSERT INTO genre(Name)
VALUES ('war'),
       ('detective'),
       ('historical friction'),
       ('fiction'),
       ('satire');

INSERT INTO author (First_name, Last_name, Birth_year, Death_year)
VALUES ('Charles', 'Dickens', 1821, 1870),
       ('Arthur', 'Conan', 1859, 1930),
       ('Leo', 'Tolstoy', 1829, 1910),
       ('George', 'Orwell', 1903, 1950);

INSERT INTO loan(book_id, reader_id, loan_date, return_date)
VALUES (2, 1, '2023-05-07', '2023-06-01'),
       (1, 3, '2023-07-01', '2023-07-15'),
       (5, 2, '2023-07-10', '2023-07-30');

INSERT INTO authorship(book_id, author_id)
VALUES (1, 1),
       (2, 2),
       (3, 3),
       (4, 1),
       (5, 4);

INSERT INTO genreassignment (book_id, genre_id)
VALUES (1, 3),
       (2, 2),
       (3, 1),
       (4, 4),
       (5, 4);

--Query for adding a new book.
INSERT INTO books(title, author, publisher, production_date, numberofcopies)
VALUES ('Chess', 'Stephan Zveyk', 'Parlaq imzalar', '2020-01-01', 5);

--Query for registering a new reader.
INSERT INTO Reader (First_name, Last_Name, Address, Phone_Number, Email)
VALUES ('Farhad', 'Salamov', 'Mehdiabad', '994507287282', 'farhaad1987@gmail.com');

--Query for issuing a book to a reader.
SELECT  * FROM reader r WHERE r.id = 3;
SELECT * FROM  books b WHERE  b.title LIKE '%Farm%';

INSERT INTO loan(book_id, reader_id, loan_date, return_date)
VALUES (5,3, current_date, current_date + 5);

--Query for returning a book from a reader.
SELECT * FROM books;
UPDATE books SET numberofcopies = numberofcopies - 1 WHERE id = 5;
UPDATE books SET numberofcopies = numberofcopies + 1 WHERE  id = 5;

--Query for searching books based on various criteria.
SELECT * FROM books WHERE NumberOfCopies < 300;
SELECT  * FROM books WHERE Title LIKE '%_Tw%';
SELECT  * FROM books WHERE Production_date >= '1900-01-01'::date;

--Query for searching currently available books.
SELECT Title, NumberOfCopies FROM books;