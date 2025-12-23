<!DOCTYPE html>
<html>
<head>
    <title>Result</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: #f0f4f8;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .card {
            background: #ffffff;
            padding: 30px 40px;
            border-radius: 12px;
            box-shadow: 0 8px 20px rgba(0,0,0,0.1);
            text-align: center;
            width: 350px;
        }

        h3 {
            color: #2c7be5;
            margin-bottom: 15px;
        }

        p {
            color: #333;
            margin: 6px 0;
        }

        a {
            display: inline-block;
            margin-top: 20px;
            text-decoration: none;
            background: #2c7be5;
            color: white;
            padding: 10px 18px;
            border-radius: 6px;
            transition: background 0.3s ease, transform 0.2s ease;
        }

        a:hover {
            background: #1a5dcc;
            transform: scale(1.05);
        }
    </style>
</head>
<body>

<div class="card">
    <h3>User Added Successfully</h3>
    <p><strong>Name:</strong> ${rcd.name}</p>
    <p><strong>Email:</strong> ${rcd.email}</p>
    <p><strong>Phone:</strong> ${rcd.phoneNo}</p>

    <a href="/">Go to Home</a>
    <a href="/product">Add Product</a>
    
</div>

</body>
</html>
