<!DOCTYPE html>
<html>
<head>
    <title>User & Product Form</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: #f0f4f8;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        form {
            background: #ffffff;
            padding: 30px 40px;
            border-radius: 12px;
            box-shadow: 0 8px 20px rgba(0,0,0,0.1);
            width: 350px;
        }

        h3 {
            margin-bottom: 15px;
            color: #333333;
            text-align: center;
        }

        label {
            display: block;
            margin: 10px 0 5px;
            color: #555555;
            font-weight: 500;
        }

        input[type="text"], input[type="email"], input[type="number"] {
            width: 100%;
            padding: 10px;
            border-radius: 6px;
            border: 1px solid #ccc;
            box-sizing: border-box;
            transition: all 0.3s ease;
        }

        input[type="text"]:focus, input[type="email"]:focus, input[type="number"]:focus {
            border-color: #4a90e2;
            box-shadow: 0 0 5px rgba(74,144,226,0.5);
            outline: none;
        }

        input[type="submit"] {
            width: 100%;
            padding: 12px;
            margin-top: 20px;
            border: none;
            border-radius: 6px;
            background-color: #4a90e2;
            color: white;
            font-size: 16px;
            cursor: pointer;
            transition: background 0.3s ease, transform 0.2s ease;
        }

        input[type="submit"]:hover {
            background-color: #357abd;
            transform: scale(1.03);
        }

        .product-row {
            display: flex;
            gap: 10px;
        }

        .product-row input {
            flex: 1;
        }
    </style>
</head>
<body>

<form action="/" method="post">

    <h3>User Details</h3>
    <label>Name</label>
    <input type="text" name="name">

    <label>Email</label>
    <input type="email" name="email">

    <label>Phone</label>
    <input type="text" name="phoneNo">

  

    <input type="submit" value="Submit">

</form>

</body>
</html>
