# Exercise 5: Implementing and Testing an Online Shop Booking System

## Objective

Implement a booking system for an online shop and create comprehensive JUnit tests to ensure the functionality and reliability of the system.

## Task Instructions

1. **Understand the System Requirements:**
    - You need to implement a simple online shop system where users can add products to a cart, remove products, update quantities, and place orders.
    - The system should validate orders to ensure that there is sufficient stock for each product.

2. **Define the Classes and Their Responsibilities:**
    - Create the following classes with the specified attributes and methods:
        - `Product`: Represents a product with `id`, `name`, `price`, and `quantity`.
        - `CartItem`: Represents an item in the cart with a `Product` and `quantity`.
        - `Cart`: Manages a list of `CartItem` objects and provides methods to add, remove, update, and calculate the total price of the items.
        - `Order`: Represents an order with an `id`, a `Cart`, and a `totalPrice`.
        - `OnlineShop`: Manages products, creates carts, and processes orders with methods for adding products, finding products by ID, creating carts, creating orders, and validating orders.

3. **Implement Core Functionalities:**
    - Implement methods to add and remove products from the cart, update product quantities, calculate the total price of the cart, and create an order.
    - Ensure the system can handle validation of orders, such as checking for sufficient product stock.

4. **JUnit Tests:**
    - Write JUnit tests to cover the following scenarios:
        - Adding and removing products in the cart.
        - Updating the quantity of products in the cart.
        - Calculating the total price of the cart.
        - Creating an order from the cart.
        - Validating orders for sufficient stock and handling errors appropriately.

## Detailed Requirements

### 1. Understand the System Requirements

- The system should allow users to perform the following actions:
    - Add a product to the cart with a specified quantity.
    - Remove a product from the cart.
    - Update the quantity of a product in the cart.
    - Calculate the total price of the items in the cart.
    - Create an order from the items in the cart.
    - Validate the order to ensure that there is sufficient stock for each product.

### 2. Define the Classes and Their Responsibilities

- **Product**:
    - Attributes: `String id`, `String name`, `double price`, `int quantity`
    - Methods: Constructor, getters, and setters

- **CartItem**:
    - Attributes: `Product product`, `int quantity`
    - Methods: Constructor, getters, and setters

- **Cart**:
    - Attributes: `List<CartItem> items`
    - Methods:
        - `addProduct(Product product, int quantity)`: Adds a product to the cart with the specified quantity.
        - `removeProduct(String productId)`: Removes a product from the cart by its ID.
        - `updateProductQuantity(String productId, int quantity)`: Updates the quantity of a product in the cart.
        - `calculateTotalPrice()`: Calculates and returns the total price of all items in the cart.

- **Order**:
    - Attributes: `String id`, `Cart cart`, `double totalPrice`
    - Methods: Constructor, getters, and setters

- **OnlineShop**:
    - Attributes: `Map<String, Product> products`
    - Methods:
        - `addProduct(Product product)`: Adds a product to the shop's inventory.
        - `findProductById(String productId)`: Finds and returns a product by its ID.
        - `createCart()`: Creates and returns a new cart.
        - `createOrder(Cart cart)`: Creates an order from the cart and returns it.
        - `validateOrder(Order order)`: Validates an order to ensure sufficient stock is available for each product.

### 3. Implement Core Functionalities

- Implement the methods specified for each class, ensuring they meet the requirements and perform the necessary operations.

### 4. JUnit Tests

- Write comprehensive JUnit tests for each of the following scenarios:
    - **Add Product to Cart**: Test that a product can be added to the cart with the correct quantity.
    - **Remove Product from Cart**: Test that a product can be removed from the cart.
    - **Update Product Quantity**: Test that the quantity of a product in the cart can be updated.
    - **Calculate Total Price**: Test that the total price of the cart is calculated correctly.
    - **Create Order**: Test that an order can be created from the cart and that the total price is correct.
    - **Validate Order**: Test that an order is validated correctly and handles insufficient stock scenarios.

### Example Test Cases (JUnit)

- **Add Product to Cart**:
  ```java
  @Test
  public void testAddProductToCart() {
      Product product = shop.findProductById("1");
      cart.addProduct(product, 1);
      assertEquals(1, cart.getItems().size());
      assertEquals(1, cart.getItems().get(0).getQuantity());
  }
  ```

- **Remove Product from Cart**:
  ```java
  @Test
  public void testRemoveProductFromCart() {
      Product product = shop.findProductById("1");
      cart.addProduct(product, 1);
      cart.removeProduct("1");
      assertTrue(cart.getItems().isEmpty());
  }
  ```

- **Update Product Quantity**:
  ```java
  @Test
  public void testUpdateProductQuantity() {
      Product product = shop.findProductById("1");
      cart.addProduct(product, 1);
      cart.updateProductQuantity("1", 5);
      assertEquals(5, cart.getItems().get(0).getQuantity());
  }
  ```

- **Calculate Total Price**:
  ```java
  @Test
  public void testCalculateTotalPrice() {
      Product product1 = shop.findProductById("1");
      Product product2 = shop.findProductById("2");
      cart.addProduct(product1, 1);
      cart.addProduct(product2, 2);
      assertEquals(2000.0, cart.calculateTotalPrice());
  }
  ```

- **Create Order**:
  ```java
  @Test
  public void testCreateOrder() {
      Product product = shop.findProductById("1");
      cart.addProduct(product, 1);
      Order order = shop.createOrder(cart);
      assertNotNull(order);
      assertEquals(1000.0, order.getTotalPrice());
  }
  ```

- **Validate Order**:
  ```java
  @Test
  public void testValidateOrder() {
      Product product = shop.findProductById("1");
      cart.addProduct(product, 1);
      Order order = shop.createOrder(cart);
      assertTrue(shop.validateOrder(order));
  }
  ```

- **Validate Order with Insufficient Stock**:
  ```java
  @Test
  public void testValidateOrderInsufficientStock() {
      Product product = shop.findProductById("1");
      cart.addProduct(product, 20);
      Order order = shop.createOrder(cart);
      assertFalse(shop.validateOrder(order));
  }
  ```

### Submission

- Submit your implementation and JUnit test cases.
- Ensure all tests pass and the system behaves as expected.
```