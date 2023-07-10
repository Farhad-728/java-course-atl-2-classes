SCREATE TABLE Sales (
ID SERIAL PRIMARY KEY,
Product VARCHAR(50),
Quantity INTEGER,
Price DECIMAL(10, 2)
);
INSERT INTO Sales (Product, Quantity, Price) VALUES
('Apple', 5, 2.50),
('Orange', 3, 1.75),
('Banana', 2, 0.50),
('Apple', 4, 2.20),
('Orange', 2, 1.80);

CREATE TABLE Orders (
OrderID SERIAL PRIMARY KEY,
CustomerID INTEGER,
OrderDate DATE
);

INSERT INTO Customers (Name) VALUES
('John'),
('Alice'),
('Bob'),
('Mary');
INSERT INTO Orders (CustomerID, OrderDate) VALUES
(1, '2023-06-01'),
(2, '2023-06-02'),
(3, '2023-06-03'),
(4, '2023-06-04'),
(1, '2023-06-05');

CREATE TABLE Suppliers (
SupplierID SERIAL PRIMARY KEY,
Name VARCHAR(50)
);
INSERT INTO Suppliers (Name) VALUES
('Alice'),
('Bob'),
('Eve');

--Group Function:
SELECT product, SUM(quantity) AS TotalQuantity,
AVG(price) AS AveragePrice
FROM sales GROUP BY product;
SELECT * FROM sales;

--Types of Group Functions:
SELECT SUM(price), AVG(price), MIN(price), MAX(price), COUNT(price) FROM sales;

--Using the AVG and SUM Functions:
CREATE TABLE expenses(
id SERIAL PRIMARY KEY,
category VARCHAR(10),
amount DECIMAL(10,2)
);
INSERT INTO expenses(category, amount)
VALUES('A','800.00'),
('B', '50.00'),
('C', '400.00');
SELECT * FROM expenses;
SELECT category, SUM(amount) AS TotalAmount,
AVG(amount) AS AverageAmount FROM expenses GROUP BY category;

--Using the MIN and MAX Functions:
CREATE TABLE products(
id SERIAL PRIMARY KEY,
name VARCHAR(30),
price DECIMAL(10,2)
);
INSERT INTO products(name, price)
VALUES('Honor', 700),
('Samsung', '500'),
('iPhone', '2400')
);
SELECT * FROM products;
INSERT INTO products(name, price)
VALUES('Honor', 750),
('Samsung', '700'),
('iPhone', '1500');
SELECT name, MIN(price) AS MinimumPrices,
MAX(price) AS MaxsimumPrices FROM products GROUP BY name;

SELECT MIN(price), MAX(price) FROM products;
SELECT * FROM products WHERE price IN (SELECT MAX(price), MIN(price) FROM products);

--Using a Subquery to Solve a Problem:
CREATE TABLE students(
id SERIAL PRIMARY KEY,
name VARCHAR(30),
age INT,
group_id VARCHAR(10)
);
CREATE TABLE grades(
studentid SERIAL PRIMARY KEY,
grade DECIMAL(10,2),
student_id INT REFERENCES students(ID)
);

SELECT * FROM grades;
INSERT INTO students(name, age, group_id)
VALUES('İlqar', '19', '111a'),
('Musa', '22', '221a'),
('Samir', '20', '111a'),
('Farhad', '22', '221a'),
('Murad', '21', '195a');

INSERT INTO grades(grade, student_id)
VALUES('70.25', '1'),
('85.00', '2'),
('83.00', '3'),
('70.00', '4'),
('84.00', '2');

INSERT INTO students(name, age, group_id)
VALUES('Emin', '22', '221a');
INSERT INTO grades(grade, student_id)
VALUES('40.00', '5');

SELECT * FROM students;
SELECT * FROM grades;
SELECT * FROM grades WHERE grade < (SELECT AVG(grade) FROM grades);

--Subquery Syntax:
Provide a brief explanation of the syntax used for subqueries in SQL.

--Using SET Operators:
CREATE TABLE male_students(
id SERIAL PRIMARY KEY,
first_name VARCHAR(15),
surname VARCHAR(15),
age INT,
group_id DECIMAL(10,2)
);
CREATE TABLE female_students(
id SERIAL PRIMARY KEY,
first_name VARCHAR(15),
surname VARCHAR(15),
age INT,
group_id DECIMAL(10,2)
);

INSERT INTO male_students(first_name, surname, age, group_id)
VALUES('Eddi', 'Israfilov', '20', '111'),
      ('Musa', 'Qurbanli', '21', '221'),
      ('Kylian', 'Mbappe', '22', '111'),
      ('Ramil', 'Sheydayev', '27', '221'),
      ('Messi', 'Lionel', '35', '001'),
      ('Ronaldo', 'Cristiano', '36', '001');

INSERT INTO female_students(first_name, surname, age, group_id)
VALUES('Sevinc', 'Qarayeva', '19', '111'),
      ('Arzu', 'Aliyeva', '21', '221'),
      ('Marta', 'Diaz', '22', '111'),
      ('Janie', 'Frampton', '27', '221'),
      ('Roya', 'Ayxan', '35', '001'),
      ('Aygun', 'Kazimova', '36', '001');

SELECT * FROM male_students
UNION
SELECT * FROM female_students;
SELECT * FROM male_students
INTERSECT
SELECT * FROM female_students;
SELECT * FROM male_students
EXCEPT
SELECT * FROM female_students;