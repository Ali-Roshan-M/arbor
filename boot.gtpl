<!DOCTYPE html>
<html style="direction: rtl;" lang="fa">
<head>
	<title></title>
	<link rel="stylesheet" href="node_modules/bootstrap/dist/css/bootstrap.min.css">
	<link rel="stylesheet" href="styles.css">
	<script type="text/javascript" src="node_modules/jquery/dist/jquery.min.js"></script>
	<script type="text/javascript" src="node_modulesj/bootstrap/dist/js/boottrap.min.js"></script>
</head>
<body class="text-right">


<nav class="nav nav-pills nav-justified">
  <a class="nav-link active" href="#">خانه</a>
  <a class="nav-link" href="boot.gtpl">جزییات درخواست</a>
  <a class="nav-link" href="boot2.gtpl">گردش کار</a>
  
</nav>

<div class="container">
	<form action="/login" method="post">
	<div class="updiv">
	<div class="row">
    <div class="col">
      <label  for="number">شماره ثبت:</label>
		<input type="text" name="number">
	    <input type="submit" value="Login">

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



<div class="updiv">

<div>
	 <label  style="width: 150px;" for="requester">درخواست کننده:</label>
		<select class="form-control" name = "requester">
		<option style="color: #cdcfd3">نام درخواست کننده را انتخاب کنید.</option>
      <option value = "1">1</option>
      <option>2</option>
      <option>3</option>
      <option>4</option>
      <option>5</option>
    </select>

</div>

<div>
	 <label  style="width: 150px;" for="mission-type">نوع ماموریت:</label>
		<select class="form-control" name="mission_type">
		<option style="color: #cdcfd3">نوع ماموریت را انتخاب کنید.</option>

      <option value = "1">1</option>
      <option value = "2">2</option>
      <option value = "3">3</option>
      <option>4</option>
      <option>5</option>
    </select>

</div>

<div class="row">
	<div class="col">
		 <label  style="width: 150px;" >محل ماموریت:</label>
		<select class="form-control" name="mission_place">
		<option style="color: #cdcfd3">محل ماموریت را انتخاب کنید.</option>

      <option>1</option>
      <option>2</option>
      <option>3</option>
      <option>4</option>
      <option>5</option>
    </select>
		
	</div>

	<div class="col">
		<label  style="width: 150px;" >کشتی</label>
		<select class="form-control" name="ship">
		<option style="color: #cdcfd3"> کشتی را انتخاب کنید. </option>

      <option>1</option>
      <option>2</option>
      <option>3</option>
      <option>4</option>
      <option>5</option>
    </select>
		
	</div>

</div>

<div class="row" style="padding: 5px; margin-top: 9px;"> 
<div class="col">
	<label  for="fromda">از تاریخ:</label>
		<input type="text" name="fromda">
</div>

<div class="col">
	<label  for="todate">تا تاریخ:</label>
		<input type="text" name="todate">
</div>

<div class="col">
	<label  for="duration">به مدت:</label>
		<input type="text" name="duration">
</div>
</div>

<div class="row" style="margin-top: 9px;">
	<div class="col" >
	 <label  for="misssub">موضوع ماموریت:</label>
		<input type="text" name="misssub"  style="width: 100%">
	</div>
</div>

<div class="row" style="margin-top:  9px;">
	<div class="col">
	 <label  for="misspurp">هدف ماموریت:</label>
		<input type="text" name="misspurp" style="width: 100%">
		</div>
</div>

<div class="row">
	<div class="col">
	<div class="form-group">
    <label for="reqtext" style="width: 150px">متن درخواست:</label>
    <textarea name= "request_body" class="form-control" id="reqtext" rows="3"></textarea>
    </div>
  </div>
</div>


</div>

</div>
</form>
</body>
</html>