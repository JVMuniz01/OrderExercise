<H1>Java Course Exercise - Order Management</H1>
<H2>Features</H2>
  <p>Manage clients with name, email, and birth date.</p>
  <p>Create and manage orders with multiple items.</p>
  <p>Track order status using enums (OrderStatus).</p>
  <p>Simple console-based input/output.</p>

<h2>Project Structure</h2>
  <p></p>Client.java: Represents a client with a name, email, and birth date.
  <p></p>Product.java: Represents a product with a name and price.
  <p></p>Order.java: Represents an order, containing the client, order status, and a list of order items.
 <p></p> OrderItem.java: Represents an item in the order, containing the product, quantity, and price.
  <p></p>OrderStatus.java: Enum to represent the different stages of the order (PENDING_PAYMENT, PROCESSING, SHIPPED, DELIVERED).
  <p></p>JavaCourseExerciseOrder.java: The main class that orchestrates the input/output and business logic.

<h2>Technologies</h2>
  <p></p>Java SE: Core Java for object-oriented programming.
  <p></p>Java Date and Time API: Used to manage dates and times (SimpleDateFormat).
  <p></p>Collections Framework: To handle lists of items in an order (ArrayList).
  <p></p> Enums: To represent the order status in a type-safe manner.

<h2>Usage</h2>
<h3>Exemple input</h3>
<p></p>Enter client data:
<p></p>Name: John Doe
<p></p>Email: johndoe@example.com
<p></p>Birth date (DD/MM/YYYY): 15/04/1985

<p></p>Enter the order data:
<p></p>Status: PROCESSING

<p></p>How many items to this order? 2

<p></p>Enter #1 item data:
<p></p>Product name: Laptop
<p></p>Product price: 1200.00
<p></p>Quantity: 1

<p></p>Enter #2 item data:
<p></p>Product name: Headset
<p></p>Product price: 200.00
<p></p>Quantity: 2

<h3>Exemple output</h3>
<p></p>Order moment: 03/10/2024
<p></p>Order status: PROCESSING
<p></p>Client: John Doe (15/04/1985) - johndoe@example.com
<p></p>Order items:
<p></p>Laptop, $1200.00, Quantity: 1, Subtotal: $1200.00
<p></p>Headset, $200.00, Quantity: 2, Subtotal: $400.00
<p></p>Total price: $1600.00







