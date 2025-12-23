<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add Customer & Product</title>
    <style>
        body { font-family: Arial, sans-serif; background: #f0f4f8; padding: 30px; }
        form { background: #fff; padding: 25px; border-radius: 10px; width: 500px; margin: auto; box-shadow: 0 6px 15px rgba(0,0,0,0.1); }
        h3 { color: #2c7be5; margin-bottom: 10px; }
        label { display: block; margin-top: 10px; font-weight: bold; }
        input { width: 100%; padding: 8px; margin-top: 5px; }
        button { margin-top: 20px; padding: 10px; width: 100%; background: #2c7be5; color: white; border: none; border-radius: 5px; cursor: pointer; }
    </style>
</head>
<body>

<form action="/product" method="post">

    <h3>Customer ID</h3>
    <input type="hidden" name="customerId" value="${customer.id}" />

    <h3>Product Details</h3>
    <label>Product Name</label>
    <input type="text" name="name" />

    <label>Brand</label>
    <input type="text" name="brandName" />

    <label>Model</label>
    <input type="text" name="modelNumber" />

    <label>Description</label>
    <input type="text" name="description" />

    <label>Quantity</label>
    <input type="number" name="quantity" />

    
    <button type="submit">Save Data</button>

</form>
</body>
</html>
