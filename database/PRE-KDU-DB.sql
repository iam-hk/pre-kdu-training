create database employee;
show databases;
use employee;
CREATE TABLE department (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(255) NOT NULL
);

CREATE TABLE employee (
    employee_id INT PRIMARY KEY,
    employee_name VARCHAR(255) NOT NULL,
    salary DECIMAL(10, 2) NOT NULL,
    department_id INT,
    FOREIGN KEY (department_id) REFERENCES department(department_id)
);
INSERT INTO department (department_id, department_name) VALUES
(1, 'HR'),
(2, 'IT'),
(3, 'Finance');
INSERT INTO employee (employee_id, employee_name, salary, department_id) VALUES
(1, 'Rajesh Kumar', 50000.00, 1),
(2, 'Priya Sharma', 60000.00, 2),
(3, 'Amit Patel', 75000.00, 3),
(4, 'Neha Gupta', 55000.00, 1);
SELECT e.employee_id, e.employee_name, d.department_name
FROM employee e
JOIN department d ON e.department_id = d.department_id;
SELECT employee_id, employee_name, salary
FROM employee
ORDER BY salary DESC;
SELECT d.department_name, AVG(e.salary) AS average_salary
FROM employee e
JOIN department d ON e.department_id = d.department_id
GROUP BY d.department_name;



