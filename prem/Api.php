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

 if($p1 == "ALL" && $p2 == "ALL"){
 $stmt = $conn->prepare("SELECT pro_name, weight,total_amount,pro_img_url,pro_id,left_qnty,pro_unit,base_amount,disc,brands,categories  FROM Deals");    
 
 }else if($p2 == "cat"){
  
 $stmt = $conn->prepare("SELECT pro_name, weight,total_amount,pro_img_url,pro_id,left_qnty,pro_unit,base_amount,disc,brands,categories  FROM Deals where categories  = '$p1'");    
     
 }else{

$stmt = $conn->prepare("SELECT pro_name, weight,total_amount,pro_img_url,pro_id,left_qnty,pro_unit,base_amount,disc,brands,categories  FROM Deals where pro_id  = '$p1'"); 

 }
 
 //executing the query 
 $stmt->execute();
 
 //binding results to the query 
 $stmt->bind_result($pro_name, $weight,$total_amount,$pro_img_url,$pro_id,$left_qnty,$pro_unit,$base_amount,$disc,$brands,$categories);
 
 $products = array(); 
 
 //traversing through all the result 
 while($stmt->fetch()){
 $temp = array();
 $temp['pro_name'] = $pro_name; 
 $temp['weight'] = $weight; 

 $temp['base_amount'] = $base_amount; 
 $temp['disc'] = $disc; 
 $temp['brands'] = $brands; 

 $temp['categories'] = $categories; 
 

 
 $temp['pro_unit'] = $pro_unit; 

 $temp['pro_id'] = $pro_id; 
 
 $temp['pro_img_url'] = $pro_img_url;
 
 $temp['total_amount'] = $total_amount; 

 $temp['left_qnty'] = $left_qnty; 
 
 array_push($products, $temp);
 }
 
 //displaying the result in json format 
 echo json_encode($products);


