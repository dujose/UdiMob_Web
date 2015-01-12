<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<!-- saved from url=(0062)http://www.cliptheme.com/preview/admin/clip-one/login_example2 -->
<html lang="en" class="no-js"><!--<![endif]--><!-- start: HEAD --><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Clip-One - Responsive Admin Template</title>
		<!-- start: META -->
		<meta charset="utf-8">
		<!--[if IE]><meta http-equiv='X-UA-Compatible' content="IE=edge,IE=9,IE=8,chrome=1" /><![endif]-->
		<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
		<meta name="apple-mobile-web-app-capable" content="yes">
		<meta name="apple-mobile-web-app-status-bar-style" content="black">
		<meta content="" name="description">
		<meta content="" name="author">
		<!-- end: META -->
		<!-- start: MAIN CSS -->
				
		<link rel="stylesheet" href="css/bootstrap.min.css">
		<link rel="stylesheet" href="css/font-awesome.min.css">
		<link rel="stylesheet" href="css/style.css">
		<link rel="stylesheet" href="css/main.css">
		<link rel="stylesheet" href="css/main-responsive.css">
		<link rel="stylesheet" href="css/all.css">
		<link rel="stylesheet" href="css/bootstrap-colorpalette.css">
		<link rel="stylesheet" href="css/perfect-scrollbar.css">
	
		
		<!--[if IE 7]>
		<link rel="stylesheet" href="assets/plugins/font-awesome/css/font-awesome-ie7.min.css">
		<![endif]-->
		<!-- end: MAIN CSS -->
		<!-- start: CSS REQUIRED FOR THIS PAGE ONLY -->
		<!-- end: CSS REQUIRED FOR THIS PAGE ONLY -->
	</head>
	<!-- end: HEAD -->
	<!-- start: BODY -->
	<body class="login example2" style='background-image: url("imagem/bg_2.png"); background-color: rgba(255, 255, 255, 0);'>
		<div class="main-login col-sm-4 col-sm-offset-4">
			<div class="logo">UdiMob
			</div>
			<!-- start: LOGIN BOX -->
			<div class="box-login" style="display: block;">
				<h3>Faça o login na sua conta</h3>
				<p>
					Por favor entre com o seu usuário e senha para fazer o login
				</p>
				<form class="form-login" action="http://www.cliptheme.com/preview/admin/clip-one/index.html" novalidate="novalidate">
					<div class="errorHandler alert alert-danger no-display">
						<i class="fa fa-remove-sign"></i> You have some form errors. Please check below.
					</div>
					<fieldset>
						<div class="form-group">
							<span class="input-icon">
								<input type="text" class="form-control" name="usuario" placeholder="Usuário">
								</span>
						</div>
						<div class="form-group form-actions">
							<span class="input-icon">
								<input type="password" class="form-control password" name="password" placeholder="Senha">								
							</span>
						</div>
						<div class="form-actions">
							
							<button type="submit" class="btn btn-bricky pull-right">
								Login 
							</button>
						</div>
						<div class="new-account">
							Não tem uma conta ainda?
							<a href="<s:url value="/cadastroImobiliaria"/>" class="register">
								Crie sua conta aqui
							</a>
						</div>
					</fieldset>
				</form>
			</div>
			<!-- end: LOGIN BOX -->
			<!-- start: FORGOT BOX -->
			<div class="box-forgot">
				<h3>Forget Password?</h3>
				<p>
					Enter your e-mail address below to reset your password.
				</p>
				<form class="form-forgot" novalidate="novalidate">
					<div class="errorHandler alert alert-danger no-display">
						<i class="fa fa-remove-sign"></i> You have some form errors. Please check below.
					</div>
					<fieldset>
						<div class="form-group">
							<span class="input-icon">
								<input type="email" class="form-control" name="email" placeholder="Email">
								<i class="fa fa-envelope"></i> </span>
						</div>
						<div class="form-actions">
							<a class="btn btn-light-grey go-back">
								<i class="fa fa-circle-arrow-left"></i> Back
							</a>
							<button type="submit" class="btn btn-bricky pull-right">
								Submit <i class="fa fa-arrow-circle-right"></i>
							</button>
						</div>
					</fieldset>
				</form>
			</div>
			<!-- end: FORGOT BOX -->
			
			<!-- start: COPYRIGHT -->
			<div class="copyright">
				2014 © UdiMob.
			</div>
			<!-- end: COPYRIGHT -->
		</div>
		<!-- start: MAIN JAVASCRIPTS -->
		<!--[if lt IE 9]>
		<script src="assets/plugins/respond.min.js"></script>
		<script src="assets/plugins/excanvas.min.js"></script>
		<script type="text/javascript" src="assets/plugins/jQuery-lib/1.10.2/jquery.min.js"></script>
		<![endif]-->
		
	
	<!-- end: BODY -->
</body>
</html>