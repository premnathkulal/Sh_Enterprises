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
          <a class="nav-link" href=" index.php">
            <i class="fas fa-fw fa-tachometer-alt"></i>
            <span>HOME</span>
          </a>
        </li>
      
		
		 
		
		 <li class="nav-item active">
          <a class="nav-link" href="form2.php">
            <i class="fas fa-fw fa-folder"></i>
            <span>form2</span></a>
        </li>
		
		
      </ul>

      <div id="content-wrapper">

        <div class="container-fluid">

          <!-- Breadcrumbs-->
          <ol class="breadcrumb">
            <li class="breadcrumb-item">
              <a href="index.php">HOME</a>
            </li>
            <li class="breadcrumb-item active">Charts</li>
          </ol>

          <!-- Area Chart Example-->
          <div class="card mb-3" >
              <div class="card-header" style="background-color:white;">
			  
			  <i><font color = "red">NOTE : Please Don't use special characters like $,#,@,*,',-</font></i>
				&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp
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
			
		  </div>
			  
			  <br>
		<form action="" method="POST">	  
				<table width="100%" height="100%">
			 
			  
				<tr>
					<td>
						Supplier Name
					</td>
					<td>
						<input type="text" name="Name" required/>
					</td>
					<td>
						Supplier Type
					</td>
					<td>
						<input type="text" name="Type" required/>
					</td>
				</tr>
				
				<tr>
					<td>
						Code
					</td>
					<td>
						<input type="text" name="Code" required/>
					</td>
					<td>
						Company
					</td>
					<td>
						<input type="text" name="Company" required/>
					</td>
				</tr>
				
				<tr>
					<td>
						Address-1
					</td>
					<td>
						<input type="text" name="Address-1" required/>
					</td>
					<td>
						 Address-2
					</td>
					<td>
						<input type="text" name="Address-2" required/>
					</td>
				</tr>
				
				<tr>
					<td>
						City
					</td>
					<td>
						<input type="text" name="city" required/>
					</td>
					<td>
						 State
					</td>
					<td>
						<input type="text" name="state" required/>
					</td>
				</tr>
				
				<tr>
					<td>
						Email ID
					</td>
					<td>
						<input type="email" name="email" required/>
					</td>
					<td>
						 Telephone
					</td>
					<td>
						<input type="number" name="phone" required/>
					</td>
				</tr>
				
				<tr>
					<td>
						BDPL GSTIN
					</td>
					<td>
						<input type="text" name="BDPL" required/>
					</td>
					<td>
						 BIL GSTN
					</td>
					<td>
						<input type="text" name="BIL" required/>
					</td>
				</tr>
				
				<tr>
					<td>
						Is Active
					</td>
					<td>
						<input type="checkbox" name="active" value="yes"> 
					</td>
					<td>
						 <!--none-->
					</td>
					<td>
						 <!--none-->
					</td>
				</tr>
			
			  </table>
				
              </div>
				<input type="submit" name="save" value="save" />
				<input type="reset" name="clrar" value="clear" />
		</form>
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
	  
      $p1=$_POST['Name'];
	  $p2=$_POST['email'];
	  $p3=$_POST['Code'];
	  $p4=$_POST['Address-1'];
	  $p5=$_POST['Address-2'];
	  $p6=$_POST['BDPL'];
	  $p7=$_POST['Type'];
	  $p8=$_POST['Company'];
	  $p9=$_POST['state'];
	  $p10=$_POST['phone'];
	  $p11=$_POST['BIL'];
	  $p12 = "";
	  if (isset($_POST['active']) && ($_POST['active'] == "yes")) {
			$p12 .= "yes";
	  } else {
			$p12 .= "no";
	  }


	  $sql = "insert into SupplierForm values('','$p1','$p2','$p3','$p4','$p5','$p6','$p7','$p8','$p9','$p10','$p11','$p12')";
	  if(mysqli_query($con,$sql))
		{
				$status = "ok";
		?><script>
			alert("User Scucessfully Registerd");
		  </script><?php
		}
	  else{
			$status = "failed";
		}
	}
    ?>
	
	

  </body>

</html>
