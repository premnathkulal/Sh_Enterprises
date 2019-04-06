<?php
 
 require  "init.php";

 $p1  = $_GET['p1'];
 $p2  = $_GET['p2']; 
 $p3  = $_GET['p3'];
 $p4  = $_GET['p4'];
$p5  = $_GET['p5'];


       $sql="insert into cart(sup_id,ret_id,item_id,ammount,qnty) values('$p1','$p2','$p3','$p4','$p5');";
	 if(mysqli_query($con,$sql))
	 {
		 $status = "ok";
		
	 }
	 else
	 {
		 $status = "error";
	 }
 
  echo json_encode(array("response"=>$status));

  mysqli_close($con);
  
  ?>



