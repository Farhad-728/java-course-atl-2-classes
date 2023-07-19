--Create a table called "Products" that will contain the following columns:
CREATE TABLE Products (
    ProductID SERIAL PRIMARY KEY,
    Name VARCHAR(40) NOT NULL,
    Price NUMERIC(10,2) NOT NULL,
    Quantity INT,
    Description VARCHAR(50),
    FOREIGN KEY (ProductID) REFERENCES Categories(CategoryID)
);

INSERT INTO Products (Name, Price, Quantity, Description, productid)
VALUES ('Notebook', 1400.00, 2, 'Lenovo', 1),
       ('TV', 700.00, 1, 'Led', 2),
       ('Book', 80.00, 2, 'Game Day', 3),
       ('Book', 50, 3, 'Hard Air', 4);

--Create a table called "Categories" to classify products based on categories. The
--columns for this table should be:
CREATE TABLE Categories (
    CategoryID SERIAL PRIMARY KEY,
    Name VARCHAR(40)
);

INSERT INTO categories (CategoryID, name)
VALUES (1,'Electronics'),
(2, 'Electronics'),
(3, 'Book'),
(4, 'Book');


--Create a table called "Customers" to store information about the store's customers:
CREATE TABLE Customers (
    CustomerID SERIAL PRIMARY KEY,
    First_Name VARCHAR(15) NOT NULL ,
    Last_Name VARCHAR(15),
    Address VARCHAR(50),
    Email VARCHAR(20) NOT NULL ,
    Phone_Number NUMERIC NOT NULL
);

ALTER TABLE Customers ALTER COLUMN Email TYPE VARCHAR(50);
ALTER TABLE Customers ADD CONSTRAINT Email_Check CHECK (Email LIKE '%mail.com%');

INSERT INTO Customers (First_Name, Last_Name, Address, Email, Phone_Number)
VALUES ('Farhad', 'Salamov', 'Mehdiabad', 'farhaad1987@gmail.com', 994505005000),
       ('Samir', 'Salamov', 'Vroslov', 'samir.salamov@hotmail.com', 994504545454),
       ('Asiman', 'Suleymanov', '9-cu mikrorayon', 'asiman.suleyman@gmail.com', 994554484848),
       ('Musa', 'Nifteliyev', 'Hezi Aslanov', 'musa.nif@gmail.com', 994704445566);

--Create a table called "Orders" to track orders placed by customers:
CREATE TABLE Orders (
    OrderID SERIAL PRIMARY KEY,
    CustomerID INT NOT NULL,
    Order_Date DATE NOT NULL
);

INSERT INTO Orders (CustomerID, Order_Date)
VALUES (2, '2023-07-10'),
       (1, '2023-06-25'),
       (3, '2023-07-18'),
       (4, '2023-07-01');

--Create a table called "OrderDetails" to store information about each item in an
--order:
CREATE TABLE Order_Details (
    Order_DetailID SERIAL PRIMARY KEY,
    OrderID INT,
    ProductID INT,
    Quantity NUMERIC,
    FOREIGN KEY (OrderID) REFERENCES Orders(OrderID),
    FOREIGN KEY (ProductID) REFERENCES Products(ProductID)
);

INSERT INTO Order_Details(OrderID, ProductID, Quantity)
VALUES (1, 3, 2),
       (2, 1, 4),
       (3, 2, 4),
       (4, 1, 3);

--Get a list of all products.
SELECT * FROM products;

--Get a list of all categories of products.
SELECT * FROM Categories;

--Get a list of all customers.
SELECT * FROM Customers;

--Get a list of all orders.
SELECT * FROM Orders;

--Get a list of all order details.
SELECT * FROM Order_Details;

--Get information about a specific product by its ID.
SELECT * FROM products WHERE ProductID = 2;

--Get a list of products in a specific category.
SELECT * FROM categories WHERE CategoryID=2;

--Get information about a customer by their ID.
SELECT * FROM Customers WHERE CustomerID=2;

--Get a list of orders for a specific customer.
SELECT * FROM Orders WHERE CustomerID=2;

--Get a list of order details for a specific order.
SELECT * FROM Order_Details WHERE orderid =2;

--Update the price of a product by its ID.
UPDATE Products SET Price = 100.00 WHERE ProductID = 4;

--Add a new product.
INSERT INTO Products(name, price, quantity, description, productid)
VALUES ('Excovator', 50000.00, 1, 'Machines', 6);
INSERT INTO Categories(Name) VALUES ('Technion');

--Delete a product by its ID.
DELETE FROM Products WHERE productid = 5;