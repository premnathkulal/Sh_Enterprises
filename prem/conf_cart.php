<?php
 
 require  "init.php";

 $p1  = $_GET['p1'];
 $p2  = $_GET['p2']; 


       $sql="DELETE FROM cart WHERE sup_id = '$p1' and ret_id = '$p2'";
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



