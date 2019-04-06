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
 
 $stmt = $conn->prepare("SELECT sup_id,ret_id,item_id,ammount,pro_img_url,qnty FROM cart c, Deals d where c.sup_id = '$p1' and d.pro_id = item_id");     
 
 //executing the query 
 $stmt->execute();
 
 //binding results to the query 
 $stmt->bind_result($sup_id, $ret_id,$item_id,$ammount,$url,$qnty);
 
 $products = array(); 
 
 //traversing through all the result 
 while($stmt->fetch()){
 $temp = array();
 $temp['sup_id'] = $sup_id; 
 $temp['ret_id'] = $ret_id; 
 $temp['item_id'] = $item_id; 
 $temp['amount'] = $ammount; 
 $temp['url'] = $url; 
 $temp['qnty'] = $qnty; 
 
 array_push($products, $temp);
 }
 
 //displaying the result in json format 
 echo json_encode($products);


