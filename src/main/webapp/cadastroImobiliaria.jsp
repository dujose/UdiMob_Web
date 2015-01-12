<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<!-- saved from url=(0080)http://www.cliptheme.com/preview/admin/clip-one/login_example2.html?box=register -->
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
		<link rel="stylesheet" href="<s:url value="/css/bootstrap.min.css"/>" >
		<link rel="stylesheet" href="<s:url value="/css/font-awesome.min.css"/>" >
		<link rel="stylesheet" href="<s:url value="/css/style.css"/>" >
		<link rel="stylesheet" href="<s:url value="/css/main.css"/>" >
		<link rel="stylesheet" href="<s:url value="/css/main-responsive.css"/>" >
		<link rel="stylesheet" href="<s:url value="/css/all.css"/>" >
		<link rel="stylesheet" href="<s:url value="/css/bootstrap-colorpalette.css"/>" >
		<link rel="stylesheet" href="<s:url value="/css/perfect-scrollbar.css"/>" >
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
			
			
			<!-- start: REGISTER BOX -->
			<div class="box-register" style="display: block;">
				<h3>Cadastro</h3>
				<p style="font-weight: bold;color: #C83A2A;">
					Informações de Endereço
				</p>
				<form class="form-register" novalidate="novalidate" method="post" action="../cadastroImobiliaria/cadastrar">
					
					<fieldset>
						
						<div class="form-group">
							<span class="input-icon">
								<input type="text" class="form-control" name="u.endereco" placeholder="Endereço">
							</span>
						</div>
						
						<div class="form-group">
							<span class="input-icon">
								<input type="text" class="form-control" name="u.cidade" placeholder="Cidade">
							</span>
						</div>
						
						<div class="form-group">
							<span class="input-icon">
								<input type="text" class="form-control" name="u.bairro" placeholder="Bairro">
							</span>
						</div>
						
						<p style="font-weight: bold;color: #C83A2A;">
							Informações da imobiliária
						</p>
						
						<div class="form-group">
							<span class="input-icon">
								<input type="text" class="form-control" name="u.nomeImobiliaria" placeholder="Nome da imobiliária">
							</span>
						</div>
						
						<div class="form-group">
							<span class="input-icon">
								<input type="email" class="form-control" name="u.email" placeholder="Email">
							</span>
						</div>
						
						<div class="form-group">
							<span class="input-icon">
								<input type="text" class="form-control" name="u.telefone" placeholder="Telefone">
							</span>
						</div>
						
						<div class="form-group">
							<span class="input-icon">
								<input type="text" class="form-control" name="u.cnpj" placeholder="CNPJ">
							</span>
						</div>
						
						<div class="form-group">
							<span class="input-icon">
								<input type="text" class="form-control" name="u.razaoSocial" placeholder="Razão Social">
							</span>
						</div>
						
						<p style="font-weight: bold;color: #C83A2A;">
							Informações para acesso
						</p>
						
						<div class="form-group">
							<span class="input-icon">
								<input type="text" class="form-control" name="u.login" placeholder="Usuário">
							</span>
						</div>
						
						<div class="form-group">
							<span class="input-icon">
								<input type="password" class="form-control" id="senha" name="u.senha" placeholder="Senha">
							</span>
						</div>
						<div class="form-group">
							<span class="input-icon">
								<input type="password" class="form-control" name="senha" placeholder="Confirmar Senha">
							</span>
						</div>
						
						<div class="form-actions">
							<a class="btn btn-light-grey go-back">
								Voltar
							</a>
							<button type="submit" class="btn btn-bricky pull-right">
								Cadastrar 
							</button>
						</div>
					</fieldset>
				</form>
			</div>
			<!-- end: REGISTER BOX -->
			<!-- start: COPYRIGHT -->
			<div class="copyright">
				2015 © UdiMob.
			</div>
			<!-- end: COPYRIGHT -->
		</div>
	
	<!-- end: BODY -->
</body>
</html>