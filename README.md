<H1>Java Course Exercise - Order Management</H1>
<H2>Features</H2>
-  Manage clients with name, email, and birth date.
-  Create and manage orders with multiple items.
-  Track order status using enums (OrderStatus).
-  Simple console-based input/output.

<h2>Project Structure</h2>
com.mycompany.javacourseexerciseorder │ ├── entities │ ├── Client.java │ ├── Order.java │ ├── OrderItem.java │ ├── Product.java │ └── enums │ └── OrderStatus.java │ └── JavaCourseExerciseOrder.java

-  Client.java: Represents a client with a name, email, and birth date.
-  Product.java: Represents a product with a name and price.
-  Order.java: Represents an order, containing the client, order status, and a list of order items.
-  OrderItem.java: Represents an item in the order, containing the product, quantity, and price.
-  OrderStatus.java: Enum to represent the different stages of the order (PENDING_PAYMENT, PROCESSING, SHIPPED, DELIVERED).
-  JavaCourseExerciseOrder.java: The main class that orchestrates the input/output and business logic.

<h2>Technologies</h2>
-  Java SE: Core Java for object-oriented programming.
-  Java Date and Time API: Used to manage dates and times (SimpleDateFormat).
-  Collections Framework: To handle lists of items in an order (ArrayList).
-  Enums: To represent the order status in a type-safe manner.

<h2>Usage</h2>
<h3>Exemple input</h3>
Enter client data:
Name: John Doe
Email: johndoe@example.com
Birth date (DD/MM/YYYY): 15/04/1985

Enter the order data:
Status: PROCESSING

How many items to this order? 2

Enter #1 item data:
Product name: Laptop
Product price: 1200.00
Quantity: 1

Enter #2 item data:
Product name: Headset
Product price: 200.00
Quantity: 2

<h3>Exemple output</h3>
Order moment: 03/10/2024
Order status: PROCESSING
Client: John Doe (15/04/1985) - johndoe@example.com
Order items:
Laptop, $1200.00, Quantity: 1, Subtotal: $1200.00
Headset, $200.00, Quantity: 2, Subtotal: $400.00
Total price: $1600.00







