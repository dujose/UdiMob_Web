<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<title>UdiMob</title>

<link rel="stylesheet" href="<s:url value="/assets/plugins/bootstrap/css/bootstrap.min.css"/>" />
<link rel="stylesheet" href="<s:url value="/assets/plugins/font-awesome/css/font-awesome.min.css"/>" />
<link rel="stylesheet" href="<s:url value="/assets/fonts/style.css"/>" />
<link rel="stylesheet" href="<s:url value="/assets/css/main.css"/>" />
<link rel="stylesheet" href="<s:url value="/assets/css/main-responsive.css"/>" />
<link rel="stylesheet" href="<s:url value="/assets/plugins/iCheck/skins/all.css"/>" />
<link rel="stylesheet" href="<s:url value="/assets/plugins/bootstrap-colorpalette/css/bootstrap-colorpalette.css"/>" />
<link rel="stylesheet" href="<s:url value="/assets/plugins/perfect-scrollbar/src/perfect-scrollbar.css"/>" />
<link rel="stylesheet" href="<s:url value="/assets/css/theme_light.css"/>" />
<link rel="stylesheet" href="<s:url value="/assets/css/print.css"/>" type="text/css" media="print" />
<link rel="shortcut icon" href="favicon.ico" />

<script type="text/javascript" src='<s:url value="/assets/js/jquery-1.11.1.min.js" />'></script>
<script type="text/javascript" src='<s:url value="/assets/plugins/jquery-ui/jquery-ui-1.10.2.custom.min.js" />'></script>
<script type="text/javascript" src='<s:url value="/assets/plugins/bootstrap/js/bootstrap.min.js" />'></script>
<script type="text/javascript" src='<s:url value="/assets/plugins/bootstrap-hover-dropdown/bootstrap-hover-dropdown.min.js" />'></script>
<script type="text/javascript" src='<s:url value="/assets/plugins/blockUI/jquery.blockUI.js" />'></script>
<script type="text/javascript" src='<s:url value="/assets/plugins/iCheck/jquery.icheck.min.js" />'></script>
<script type="text/javascript" src='<s:url value="/assets/plugins/perfect-scrollbar/src/jquery.mousewheel.js" />'></script>
<script type="text/javascript" src='<s:url value="/assets/plugins/perfect-scrollbar/src/perfect-scrollbar.js" />'></script>
<script type="text/javascript" src='<s:url value="/assets/plugins/less/less-1.5.0.min.js" />'></script>
<script type="text/javascript" src='<s:url value="/assets/plugins/jquery-cookie/jquery.cookie.js" />'></script>
<script type="text/javascript" src='<s:url value="/assets/plugins/bootstrap-colorpalette/js/bootstrap-colorpalette.js" />'></script>
<script type="text/javascript" src='<s:url value="/assets/js/main.js" />'></script>

<script>                              
$(document).ready(function(){
	$('.btn-logout').click(function() {
		$(location).attr('href','index.jsp');
	});
	
});
</script>
</head>

	<body>
		<div class="navbar navbar-inverse navbar-fixed-top">
			<div class="container">
				<div class="row">
					<div class="col-lg-9 navbar-header">
						<button data-target=".navbar-collapse" data-toggle="collapse" class="navbar-toggle" type="button">
							<span class="clip-list-2"></span>
						</button>
						<a class="navbar-brand"  href="<s:url value="/principal"/>">
							UdiMob
						</a>
					</div>
					<div class="col-lg-3 navbar-header">
					<!-- start: TOP NAVIGATION MENU -->
						<div class="nav navbar-right" style="padding: 5px;">
							<form action="<s:url value="/principal"/>" method="post">	
								<button type="submit" class="btn btn-primary btn-sm btn-logout"> Logout </button>
							</form>
						</div>
					</div>
					
				</div>
			</div>
		</div>

		<div class="main-container">
			<div class="navbar-content">
				<div class="main-navigation navbar-collapse collapse">
					<div class="navigation-toggler">
						<i class="clip-chevron-left"></i>
						<i class="clip-chevron-right"></i>
					</div>
					<ul class="main-navigation-menu">
						<li>
							<a  href="<s:url value="/principal"/>"><i class="clip-home-3"></i>
								<span class="title"> UdiMob </span><span class="selected"></span>
							</a>
						</li>
						<li>
							<a href="maps.jsp"><i class="clip-screen"></i>
								<span class="title"> Mapa </span><span class="selected"></span>
							</a>
						</li>
					</ul>
				</div>
			</div>
			<div class="main-content">
				<div class="modal fade" id="panel-config" tabindex="-1" role="dialog" aria-hidden="true">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
									&times;
								</button>
								<h4 class="modal-title">Panel Configuration</h4>
							</div>
							<div class="modal-body">
								Here will be a configuration form
							</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-default" data-dismiss="modal">
									Close
								</button>
								<button type="button" class="btn btn-primary">
									Save changes
								</button>
							</div>
						</div>
					</div>
				</div>
				<div class="container">
					<div class="row">
						<div class="col-sm-12">
							<div class="col-sm-12">
								<div class="form-group">
									<input type="text" placeholder="Buscar Imóvel">
									<button class="submit">
										<i class="clip-search-3"></i>
									</button>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-sm-12">
							<div class="bs-example">
								<s:form action="resultAction" namespace="/" method="POST" enctype="multipart/form-data">
									<s:file name="fileUpload" label="Select a File to upload" size="40" />
									<s:submit value="submit" name="submit" />
								</s:form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="footer clearfix">
			<div class="footer-inner">
				2014 &copy; udiMob by udiMob.
			</div>
			<div class="footer-items">
				<span class="go-top"><i class="clip-chevron-up"></i></span>
			</div>
		</div>
	</body>
</html>