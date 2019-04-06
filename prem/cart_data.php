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
 
 //creating a query
 $p1  = $_REQUEST['p1'];
 $p2  = $_REQUEST['p2'];


$stmt = $conn->prepare("SELECT id, sup_id, ret_id, item_id, ammount, qnty, pro_img_url,pro_name  FROM cart c, Deals d where c.item_id = d.pro_id and ret_id = '$p1' and c.confirmed  != 1 and sup_id = '$p2'");    
 

 //executing the query 
 $stmt->execute();
 
 //binding results to the query 
 $stmt->bind_result($id, $sup_id, $ret_id, $item_id, $ammount, $qnty, $pro_img_url, $pro_name);
 
 $products = array(); 
 
 //traversing through all the result 
 while($stmt->fetch()){
 $temp = array();

 $temp['id'] = $id; 

 $temp['sup_id'] = $sup_id; 

 $temp['ret_id'] = $ret_id; 

 $temp['item_id'] = $item_id; 
 $temp['ammount'] = $ammount; 
 $temp['qnty'] = $qnty; 

 $temp['pro_img_url'] = $pro_img_url; 
 
 $temp['pro_name'] = $pro_name; 

 
 array_push($products, $temp);
 }
 
 //displaying the result in json format 
 echo json_encode($products);


