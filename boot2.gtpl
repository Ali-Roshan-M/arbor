<!DOCTYPE html>
<html style="direction: rtl;" lang="fa">
<head>
	<title></title>
	<link rel="stylesheet" href="node_modules/bootstrap/dist/css/bootstrap.min.css">
	<link rel="stylesheet" href="styles.css">
	<script type="text/javascript" src="node_modules/jquery/dist/jquery.min.js"></script>
	<script type="text/javascript" src="node_modulesj/bootstrap/dist/js/boottrap.min.js"></script>

	<style type="text/css">
		.back{
			background-color: #dedfdf;
			
		} 
		.fonti{
			font: bold;
		}

	</style>
</head>
<body class="text-right">

<nav class="nav nav-pills nav-justified">
  <a class="nav-link active" href="#">خانه</a>
  <a class="nav-link" href="boot.html">جزییات درخواست</a>
  <a class="nav-link" href="boot2.html">گردش کار</a>
  
</nav>



<div class="container">
	<form>
	<div class="updiv">
	<div class="row">
    <div class="col">
      <label  for="number">شماره ثبت:</label>
		<input type="text" name="number">
    </div>
    <div class="col">
       <label  for="date">تاریخ ثبت:</label>
		<input type="text" name="date">
    </div>
    <div class="col">
       <label  for="situation">وضعیت:</label>
		<input type="text" name="situation">
    </div>
  </div>

</div>
	<div class=" col updiv">
		<div class="row back" ><b>تایید امور</b> </div>
		<div class="row">
			<label  style="width: 150px;" for="accepter">تایید کننده:</label>
			 <input type="text" class="form-control" name="accepter" >

			 <label  style="width: 150px;" for="hamesh">هامش:</label>
			 <textarea class="form-control" rows="3" name="hamesh"></textarea> 
		</div>
	</div>



<div class=" col updiv">
	<div class="row back"><b>تایید مدیر</b></div>
		<div class="row">
			<label  style="width: 150px;" for="accepter1">تایید کننده:</label>
			 <input type="text" class="form-control" name="accepter1">

			 <label  style="width: 150px;" for="hamesh1">هامش:</label>
			 <textarea class="form-control" rows="3" name="hamesh1"></textarea> 
		</div>
	</div>

	<div class=" col updiv">
	<div class="row back"><b>تایید مدیر</b></div>
		<div class="row">
			<label  style="width: 150px;" for="accepter2">تایید کننده:</label>
			 <input type="text" class="form-control" name="accepter2">

			 <label  style="width: 150px;" for="hamesh2">هامش:</label>
			 <textarea class="form-control" rows="3" name="hamesh2"></textarea> 
		</div>
	</div>

	<div class=" col updiv">
	<div class="row back" ><b>تصویب نهایی</b></div>
		<div class="row">
			<label  style="width: 150px;" for="finacc">تصویب کننده:</label>
			 <input type="text" class="form-control" name="finacc" >

			 <label  style="width: 150px;" for="hamesh3">هامش:</label>
			 <textarea class="form-control" rows="3" name="hamesh3"></textarea> 
		</div>
	</div>

</div>
</form>
</body>
</html>