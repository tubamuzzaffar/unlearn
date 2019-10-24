<%@ page language="java" contentType="text/html; charset=ISO=8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "HTTP://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Pay for something</title>
</head>
<body>
<h1>
	Checkout
</h1>
    <form action="pay" method="post">
    	
    	Name on Card: <input type="text" name="name"/>
    	Card Number: <input type="text" name="cardnum"/>
    	CVV: <input type="text" name="cvv"/>
        Price: <input type="text" name="price"/>

        <input type="submit" value="Pay"/>
    </form>
</body>
</html>


