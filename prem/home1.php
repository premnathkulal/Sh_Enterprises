<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>SB Admin - Charts</title>

    <!-- Bootstrap core CSS-->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom fonts for this template-->
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

    <!-- Page level plugin CSS-->
    <link href="vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="css/sb-admin.css" rel="stylesheet">

  </head>

  <body id="page-top">

    <nav class="navbar navbar-expand navbar-dark bg-dark static-top">

      <a class="navbar-brand mr-1" href=" index.php">Start Bootstrap</a>

      <button class="btn btn-link btn-sm text-white order-1 order-sm-0" id="sidebarToggle" href="#">
        <i class="fas fa-bars"></i>
      </button>

    </nav>

    <div id="wrapper">

      <!-- Sidebar -->
      <ul class="sidebar navbar-nav">
        <li class="nav-item">
          <a class="nav-link" href="index.php">
            <i class="fas fa-fw fa-tachometer-alt"></i>
            <span>HOME</span>
          </a>
        </li>
      
		
		 <li class="nav-item active">
          <a class="nav-link" href="home1.php">
            <i class="fas fa-fw fa-folder"></i>
            <span>form1</span></a>
        </li>
		
		
      </ul>

      <div id="content-wrapper">

        <div class="container-fluid">

          <!-- Breadcrumbs-->
          <ol class="breadcrumb">
            <li class="breadcrumb-item">
              <a href="index.php">HOME</a>
            </li>
            <li class="breadcrumb-item active">FORM-1</li>
          </ol>

          <!-- Area Chart Example-->
          <div class="card mb-3" >
              <div class="card-header" style="background-color:white;">
			   <input type="checkbox" name="checkbox1" id = "checkbox0" />
			   <label for="love">Active </label>
			   
				&nbsp &nbsp &nbsp &nbsp &nbsp
				SM
				<input type="text" name="list" list="citynames">
					<datalist id="citynames">
						<option value="premnath">
						<option value="is great">
						<option value="is strong">
						<option value="is good">
						<option value="is great">
					</datalist>
				</input>
				
				
				&nbsp &nbsp &nbsp &nbsp &nbsp
				<label for="list2">Beat</label>
				<input type="text" name="list1" list="beat">
					<datalist id="beat">
						<option value="beat1">
						<option value="beat2">
					</datalist>
				</input>
				
				&nbsp &nbsp &nbsp &nbsp &nbsp 
				
				<form class="d-none d-md-inline-block form-inline ml-auto mr-0 mr-md-3 my-2 my-md-0">
							<div class="input-group">
									<input type="text" class="form-control" placeholder="Search for..." aria-label="Search" aria-describedby="basic-addon2">
									<div class="input-group-append">
										<button class="btn btn-primary" type="button">
										<i class="fas fa-search"></i>
										</button>
									</div>
							</div>
				</form>
				
				<input type = "button" name = "print" value="Print">
				<input type = "button" name = "preview" value="Preview" >
				
				<br>
				<i><font color = "red">NOTE : Please Don't use special characters like $,#,@,*,',-</font></i>
		  </div>
			  
			  <br>
			  <table width="100%" height="100%">
			 

			<form action="" method="POST">	

				<tr>
					<td>
						SHOP NAME
					</td>
					<td>
						<input type="text" name="shop_name"/>
					</td>
				
				</tr>

    
				<tr>
					<td>
						Retailer UID
					</td>
					<td>
						<input type="text" name="uid"/>
					</td>
					<td>
						Retailer name
					</td>
					<td>
						<input type="text" name="retailername"/>
					</td>
				</tr>
				
				<tr>
					<td>
						Retailer code(14383)
					</td>
					<td>
						<input type="text" name="retailercode"/>
					</td>
					<td>
						Retailer second name
					</td>
					<td>
						<input type="text" name="retailersecondname" />
					</td>
				</tr>
				
				<tr>
					<td>
						Is sec name required 
					</td>
					<td>
						<input type="checkbox" name="checkbox1" value="yes"/>
					</td>
					<td>
						 Secondery beat(s)
					</td>
					<td>
						<input type="text" name="sbeat" list="sbeat">
							<datalist id="sbeat">
							<option value="beat1">
							<option value="beat">
							</datalist>
						</input>
					</td>
				</tr>
				
				<tr>
					<td>
						Primary (default) Beat
					</td>
					<td>
						<input type="text" name="prib" list="beat">
							<datalist id="beat">
							<option value="beat1">
							<option value="beat">
							</datalist>
						</input>
					</td>
					<td>
						 Is secondary beat is required
					</td>
					<td>
						<input type="checkbox" name="checkbox2" value="yes"/>
					</td>
				</tr>
				
			  </table>
			  
			   <br>
			  <a href = "#">click here to set channel hierarchy</a>
			  <br>
			  
          </div>
		  

          <div class="card mb-3" >
              <div class="card-header" style="background-color:white;">
          
               <table width="100%" height="100%">
			 
			  
				<tr>
					<td>
						State
					</td>
					<td>
						<input type="text" name="State" list="state">
							<datalist id="state">
							<option value="Gujrath">
							<option value="Karnataka">
							</datalist>
						</input>
					</td>
					<td>
						Distric
					</td>
					<td>
						<input type="text" name="Distric" list="Distric">
							<datalist id="Distric">
							<option value="DK">
							<option value="UK">
							</datalist>
						</input>
					</td>
				</tr>
				
				<tr>
					<td>
						Sub-Distric
					</td>
					<td>
						<input type="text" name="SubD" list="taluk" >
							<datalist id="taluk">
							<option value="Bantwal">
							<option value="puttur">
							</datalist>
						</input>
					</td>
					<td>
						Village/Town
					</td>
					<td>
						<input type="text" name="Village" list="Village">
							<datalist id="Village">
							<option value="Agrar">
							<option value="Nagara">
							</datalist>
						</input>
					</td>
				</tr>
				
				<tr>
					<td>
						Ward
					</td>
					<td>
						<input type="text" name="Ward" list="ward">
							<datalist id="ward">
							<option value="secind">
							<option value="third">
							</datalist>
						</input>
					</td>
					<td>
						 Cluster
					</td>
					<td>
						<input type="text" name="Cluster" list="cluster">
							<datalist id="cluster">
							<option value="abc">
							<option value="cde">
							</datalist>
						</input>
					</td>
				</tr>
				
				<tr>
					<td>
						Street-Adress
					</td>
					<td>
						<input type="text" name="streetAd" />
					</td>
					<td>
						 Pincode
					</td>
					<td>
						<input type="number_format" name="Pincode"/>
					</td>
				</tr>
				
			  </table>
			  
				<hr style="background-color:yellow; height:3px;"></hr>
				
				<table width="100%" height="100%">
			 
			  
				<tr>
					<td>
						Owner name
					</td>
					<td>
						<input type="text" name="Owner" ></input>
					</td>
					<td>
						Email ID
					</td>
					<td>
						<input type="text" name="email"/>
					</td>
				</tr>
				
				<tr>
					<td>
						Phone-Number
					</td>
					<td>
						<input type="text" name="phone" />
					</td>
					<td>
						Mobile-Number
					</td>
					<td>
						<input type="text" name="Mobile" />
					</td>
				</tr>
				
				<tr>
					<td>
						Date of birth
					</td>
					<td>
						<input type="date" name="birth" />
					</td>
					<td>
						 Fax
					</td>
					<td>
						<input type="text" name="fax" />
					</td>
				</tr>
				
				
			  </table>
			  
			  <hr style="background-color:yellow; height:3px;"></hr>
				GST Type &nbsp &nbsp &nbsp
				<input type="radio" id="rad1" name="gst" value="val1">Registerd
				&nbsp&nbsp&nbsp<input type="radio" id="rad1" name="gst" value="val2">UnRegisterd
				&nbsp&nbsp&nbsp<input type="radio" id="rad1" name="gst" value="val3">Composit
				
				<table width="100%" height="100%">
			 
			  
				<tr>
					<td>
						GST TIN
					</td>
					<td>
						<input type="text" name="tin"/>
					</td>
					<td>
						Pricing state
					</td>
					<td>
						<input type="text" name="Pricing" list="Pricing">
							<datalist id="Pricing">
							<option value="Karnataka">
							<option value="Tamilnadu">
							</datalist>
						</input>
					</td>
				</tr>
				
				<tr>
					<td>
						Retailer type
					</td>
					<td>
						<input type="text" name="Retailer-type" list="Retailer-type" >
							<datalist id="Retailer-type">
							<option value="General_retailer">
							<option value="private retailer">
							</datalist>
						</input>
					</td>
					<td>
						Outletcategory
					</td>
					<td>
						<input type="text" name="Outletcategory" list="Outletcategory">
							<datalist id="Outletcategory">
							<option value="outlet1">
							<option value="outlet2">
							</datalist>
						</input>
					</td>
				</tr>
				
				<tr>
					<td>
						CST No
					</td>
					<td>
						<input type="text" name="cst" />
					</td>
					<td>
						 TIN No/ST No
					</td>
					<td>
						<input type="text" name="TIN-no" list="TIN-no">
							<datalist id="TIN-no">
							<option value="123">
							<option value="234">
							</datalist>
						</input>
					</td>
				</tr>
				
				<tr>
					<td>
						Interest CST
					</td>
					<td>
						<input type="number" name="Interest"/>
					</td>
					<td>
						 Tax type
					</td>
					<td>
						<input type="text" name="Tax type" list="Tax type">
							<datalist id="Tax type">
							<option value="GST">
							<option value="CGST">
							</datalist>
						</input>
					</td>
				</tr>
				
				<tr>
					<td>
						Credit Limit(Rs)
					</td>
					<td>
						<input type="number" name="Limit"/>
					</td>
					<td>
						 Credit Duration(Days)
					</td>
					<td>
						<input type="number" name="Duration"/>
					</td>
				</tr>
				
				<tr>
					<td>
						Cash Discount
					</td>
					<td>
						<input type="number" name="Discount"/>
					</td>
					<td>
						 FSSI no
					</td>
					<td>
						<input type="text" name="FSSI"/>
					</td>
				</tr>
				<tr>
					<td>
						Bill Series
					</td>
					<td>
						<input type="text" name="billseries" list="bser">
							<datalist id="bser">
							<option value="1">
							<option value="2">
							</datalist>
						</input>
					</td>
					<td>
						 Curr.acc.Balence
					</td>
					<td>
						<input type="number" name="cab" list="cab">
							<datalist id="cab">
							<option value="abc">
							<option value="cde">
							</datalist>
						</input>
					</td>
				</tr>
				
			  </table>
			  
			  	<hr style="background-color:yellow; height:3px;"></hr>
			  <br>
			  
			   <table width="50%" height="100%">
			  <tr>
				
					<td>
					
						<input type="submit" name="save" value="Save" style="width:41%"/>
							
					</td>
			
				</tr>
				</table>
		<form/>	  
              </div>
            </div>
          </div>

        
        </div>
		
        <!-- /.container-fluid -->

        <!-- Sticky Footer -->
        <footer class="sticky-footer">
          <div class="container my-auto">
            <div class="copyright text-center my-auto">
              <span>Copyright © Your Website 2018</span>
            </div>
          </div>
        </footer>

      </div>
      <!-- /.content-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
      <i class="fas fa-angle-up"></i>
    </a>

    <!-- Logout Modal-->
    <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
            <button class="close" type="button" data-dismiss="modal" aria-label="Close">
              <span aria-hidden="true">×</span>
            </button>
          </div>
          <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
          <div class="modal-footer">
            <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
            <a class="btn btn-primary" href="login.html">Logout</a>
          </div>
        </div>
      </div>
    </div>

    <!-- Bootstrap core JavaScript-->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Core plugin JavaScript-->
    <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Page level plugin JavaScript-->
    <script src="vendor/chart.js/Chart.min.js"></script>

    <!-- Custom scripts for all pages-->
    <script src="js/sb-admin.min.js"></script>

    <!-- Demo scripts for this page-->
    <script src="js/demo/chart-area-demo.js"></script>
    <script src="js/demo/chart-bar-demo.js"></script>
    <script src="js/demo/chart-pie-demo.js"></script>

	
	<?php
			
     if(isset($_POST['save']))
    {
	 
	  require "init.php";
	  
      $p1=$_POST['uid'];
	  $p2=$_POST['retailername'];
	  $p3=$_POST['retailercode'];
	  $p4=$_POST['retailersecondname'];
	  $p5="";
	  $p8="";
	  
	  if (isset($_POST['checkbox1']) && ($_POST['checkbox1'] == "yes")) {
			 $p5 = "yes";
	  } else {
			 $p5 = "no";
	  }
	  
	  $p7=$_POST['sbeat'];
	  $p6=$_POST['prib'];
	
	  
	   if (isset($_POST['checkbox2']) && ($_POST['checkbox2'] == "yes")) {
			 $p8 = "yes";
	  } else {
			 $p8 = "no";
	  }
	  


	  $sql1 = "insert into retailer_main_table values('$p1','$p2','$p4','$p3','$p5','$p6','$p7','$p8')";
	  (mysqli_query($con,$sql1));
		
		
	  $p0=$_POST['State'];
	  $p22=$_POST['Distric'];
	  $p33=$_POST['SubD'];
	  $p44=$_POST['Village'];
	  $p66=$_POST['Ward'];
	  $p77=$_POST['Cluster'];
	  $p88=$_POST['streetAd'];
	  $p99=$_POST['Pincode'];
	  $sql2 = "insert into retailer_personal_detailes values('$p1','$p0','$p22','$p33','$p44','$p66','$p77','$p88','$p99')";
	  mysqli_query($con,$sql2);
	  
	  $p00=$_POST['Owner'];
	  $p222=$_POST['email'];
	  $p333=$_POST['phone'];
	  $p444=$_POST['Mobile'];
	  $p666=$_POST['birth'];
	  $p777=$_POST['fax'];
	  $p9=$_POST['shop_name'];
	  $sql3 = "insert into retailer_owner values('$p1','$p00','$p222','$p333','$p444','$p666','$p777','$p9')";
	  mysqli_query($con,$sql3);
	  
	}
    ?>
	
	
  </body>
</html>
