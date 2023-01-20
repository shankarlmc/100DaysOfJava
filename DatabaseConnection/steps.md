# Database connection steps

- Step 1: Register the driver class
  Example to register the driver class

  ```
  Class.forName("com.mysql.jdbc.Driver");
  ```

- Step 2: Create a connection
  Example to create connection
  ```
  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java-example","your_username","your_password");
  ```
- Step 3: Create a statement
  Example to create statement

  ```
  Statement stmt = con.createStatement();
  ```

- Step 4: Execute a query
  Example to execute a query
  ```
  ResultSet rs = stmt.executeQuery("select * from employee");
  ```
- Step 5: Close the connection
  Example to close the connection
  ```
  con.close();
  ```
