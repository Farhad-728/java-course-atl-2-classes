1. SELECT * FROM employees;
2. SELECT name,email FROM customers;
3. SELECT * FROM orders WHERE status = 'Completed';
4. SELECT name, price FROM products WHERE category = 'Electronics';
5. SELECT SUM(revenue) AS Totalrevenue FROM sales;
6. SELECT SUM(quantity) AS Totalquantity FROM inventory;
7. SELECT firstname, lastname FROM employees WHERE position = 'Manager';
8. SELECT * FROM orders WHERE customerid = 2;
9. SELECT * FROM sales WHERE quantity >= 10;
10. SELECT * FROM products WHERE price = (SELECT MAX(price) FROM products);