# SELECT 
# 	name,
#     unit_price,
#     unit_price * 1.1 AS new_price
# FROM products

# > >= < <= = !=  <> Comparision operators
# SELECT *
# FROM customers
# WHERE NOT
# 	birth_date <= '1990-01-01'AND 
#     points <= 1000

# Order placed this year
# SELECT *
# FROM orders
# WHERE order_date >= '2019-01-01' 

# from the order items table, get the items for order #6 where  total price > 30
# SELECT *
# FROM order_items
# WHERE order_id = 6 AND unit_price * quantity > 30

# SELECT *
# FROM customers
# WHERE state IN ('VA', 'FL', 'GA')

# Retunr products with quantity in stock eqaul to 49, 28,72
# SELECT *
# FROM products
# WHERE quantity_in_stock IN (49, 38, 72)

# SELECT *
# FROM customers
# WHERE points BETWEEN 1000 AND 3000

# customers born bw jan 1990 & 2000

# SELECT *
# FROM customers
# WHERE birth_date BETWEEN '1990-01-01' AND '2020-01-01'

# SELECT *
# FROM customers
# WHERE last_name LIKE '%b%'

# SELECT *
# FROM customers
# WHERE address LIKE '%trail%' OR address LIKE '%avenue%'

# field$|mac|rose [gim]e
# ^	beginning
# $	end
# | logical OR
# [abcd]
# [a-h]
# SELECT *
# FROM customers
# WHERE last_name REGEXP '[a-h]e'

# SELECT *
# FROM customers
# WHERE last_name REGEXP 'b[ru]'

# SELECT *
# FROM customers
# WHERE phone IS NOT NULL

# SELECT *
# FROM customers
# ORDER BY state DESC, first_name DESC 

# SELECT *
# FROM order_items
# WHERE order_id = 2
# ORDER BY quantity * unit_price DESC


# SELECT *
# FROM customers
# LIMIT 6, 3

# SELECT *
# FROM customers
# ORDER BY points DESC
# LIMIT 3

# SELECT order_id, o.customer_id, first_name, last_name
# FROM orders o
# JOIN customers 
# 	ON o.customer_id = customers.customer_id

# SELECT order_id, oi.product_id, quantity, oi.unit_price
# FROM order_items oi
# JOIN products AS p ON oi.product_id = p.product_id

# SELECT
# 	p.date,
#     p.invoice_id,
#     p.amount,
#     c.name,
#     pm.name
# FROM payments p
# JOIN clients c
# 	ON p.client_id = c.client_id
# JOIN payment_methods pm
# 	ON p.payment_method = pm.payment_method_id

# SELECT *
# FROM order_items oi
# JOIN order_item_notes oin
# 	ON oi.order_id = oin.order_id
#     AND oi.product_id = oin.product_id

# OUter join  
# SELECT
# 	c.customer_id,
#     c.first_name,
#     o.order_id
# FROM customers c
# LEFT JOIN orders o
# 	ON c.customer_id = o.customer_id
# ORDER BY c.customer_id

# SELECT 
# 	p.product_id,
#     p.name,
#     oi.quantity
# FROM products p
# LEFT JOIN order_items oi
# 	ON p.product_id = oi.product_id

# SELECT
# 	c.customer_id,
#     c.first_name,
#     o.order_id,
#     sh.name AS shipper
# FROM customers c
# LEFT JOIN orders o
# 	ON c.customer_id = o.customer_id
# LEFT JOIN shippers sh
# 	ON o.shipper_id = sh.shipper_id
# ORDER BY c.customer_id


# SELECT
# 	o.order_id,
#     o.order_date,
#     c.first_name AS customer,
#     sh.name AS shipper
# FROM orders o
# JOIN customers c
# 	ON o.customer_id = c.customer_id
# JOIN shippers sh
# 	ON o.shipper_id = sh.shipper_id


# SELECT
# 	p.date,
#     c.name AS client,
#     p.amount,
#     pm.name AS payment_method
# FROM payments p
# JOIN clients c USING (client_id)
# JOIN payment_methods pm
# 	ON p.payment_method = pm.payment_method_id

INSERT INTO customers
VALUES (
	DEFAULT,
    'JOHN',
    'Smith',
    '1990-01-01',
    NULL,
    'address',
    'city',
    'CA',
    DEFAULT
)



