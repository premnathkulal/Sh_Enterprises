<?php 
 
 /*
 * Created by Belal Khan
 * website: www.simplifiedcoding.net 
 * Retrieve Data From MySQL Database in Android
 */
 
 //database constants
 define('DB_HOST', 'localhost');
 define('DB_USER', 'root');
 define('DB_PASS', '');
 define('DB_NAME', 'maindb');
 
 //connecting to database and getting the connection object
 $conn = new mysqli(DB_HOST, DB_USER, DB_PASS, DB_NAME);
 
 //Checking if any error occured while connecting
 if (mysqli_connect_errno()) {
 echo "Failed to connect to MySQL: " . mysqli_connect_error();
 die();
 }
 

 $stmt = $conn->prepare("SELECT UID, shop_name  FROM retailer_owner");    

 
 //executing the query 
 $stmt->execute();
 
 //binding results to the query 
 $stmt->bind_result($UID, $name);
 
 $products = array(); 
 
 //traversing through all the result 
 while($stmt->fetch()){

 $temp = array();
 $temp['name'] = $name; 
 $temp['UID'] = $UID; 
 
 array_push($products, $temp);
 }
 
 //displaying the result in json format 
 echo json_encode($products);


