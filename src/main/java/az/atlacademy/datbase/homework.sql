--Create a table called "Products" that will contain the following columns:
CREATE TABLE Products (
    ProductID SERIAL PRIMARY KEY,
    Name VARCHAR(40),
    Price DECIMAL,
    Quantity NUMERIC,
    Description VARCHAR(50)
);
INSERT INTO Products (Name, Price, Quantity, Description)
VALUES ('Mouse', '20Azn', '2', 'Wireless'),
       ('Keyboard', '30Azn', '2', 'Wireless'),
       ('Notebook', '1400Azn', '2', 'Lenovo');

--Create a table called "Categories" to classify products based on categories. The
--columns for this table should be:
CREATE TABLE Categories (
    CategoryID SERIAL PRIMARY KEY,
    Name VARCHAR(40),
    FOREIGN KEY (CategoryID) REFERENCES Products(ProductID)
);

--Create a table called "Customers" to store information about the store's customers:
CREATE TABLE Customers (
    CustomerID SERIAL PRIMARY KEY,
    First_Name VARCHAR(15),
    Last_Name VARCHAR(15),
    Address VARCHAR(50),
    Email VARCHAR(20),
    Phone_Number NUMERIC
);

--Create a table called "Orders" to track orders placed by customers:
CREATE TABLE Orders (
    OrderID SERIAL PRIMARY KEY,
    CustomerID INT NOT NULL,
    Order_Date DATE NOT NULL
);

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