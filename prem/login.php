<?php
 
 require  "init.php";
 $user_name = $_GET["email"];
 $password = $_GET["password"];
 
 
 
 $sql="select * from supplierform where email='$user_name' and password  = '$password'";
 $result=mysqli_query($con,$sql);

 if(!(mysqli_num_rows($result)>0))
 {
	$status = "failed";
	echo json_encode(array("response"=>$status));
 }
 else
{
	$row =  mysqli_fetch_assoc($result);
	$name = $row['name'];
	$email = $row['email'];	
	$status = "ok";	
	echo json_encode(array("response"=>$status,"name"=>$name,"email"=>$email));
}
  
  mysqli_close($con);
  
 ?>

