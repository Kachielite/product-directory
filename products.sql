{\rtf1\ansi\ansicpg1252\cocoartf2758
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 CREATE TABLE IF NOT EXISTS products (\
    id INT AUTO_INCREMENT PRIMARY KEY,\
    name VARCHAR(100) NOT NULL,\
    description TEXT,\
    price DECIMAL(10, 2) NOT NULL,\
    quantity INT NOT NULL\
);\
\
INSERT INTO products (name, description, price, quantity) VALUES\
    ('Product 1', 'Description for Product 1', 19.99, 50),\
    ('Product 2', 'Description for Product 2', 29.99, 30),\
    ('Product 3', 'Description for Product 3', 9.99, 100),\
    ('Product 4', 'Description for Product 4', 14.99, 70),\
    ('Product 5', 'Description for Product 5', 39.99, 20),\
    ('Product 6', 'Description for Product 6', 49.99, 15),\
    ('Product 7', 'Description for Product 7', 24.99, 45),\
    ('Product 8', 'Description for Product 8', 7.99, 80),\
    ('Product 9', 'Description for Product 9', 59.99, 10),\
    ('Product 10', 'Description for Product 10', 12.99, 60);\
}