<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<base href="${pageContext.servletContext.contextPath}/">
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<!doctype html>
<html class="no-js" lang="zxx">

<head>
	<meta charset="utf-8">
	<meta http-equiv="x-ua-compatible" content="ie=edge">
	<title>Burger</title>
	<meta name="description" content="">
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<!-- <link rel="manifest" href="site.webmanifest"> -->
	<link rel="shortcut icon" type="image/x-icon" href="img/favicon.png">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<!-- Place favicon.ico in the root directory -->

	<!-- CSS here -->
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="css/owl.carousel.min.css">
	<link rel="stylesheet" href="css/magnific-popup.css">
	<link rel="stylesheet" href="css/font-awesome.min.css">
	<link rel="stylesheet" href="css/themify-icons.css">
	<link rel="stylesheet" href="css/nice-select.css">
	<link rel="stylesheet" href="css/flaticon.css">
	<link rel="stylesheet" href="css/animate.css">
	<link rel="stylesheet" href="css/slicknav.css">
	<link rel="stylesheet" href="css/style.css">
	<link rel="stylesheet" href="css/home.css">
	
	<!-- <link rel="stylesheet" href="css/responsive.css"> -->
</head>

<body>
        <!-- header-start -->
        <header>
        	<div class="header-area ">
        		<div id="sticky-header" class="main-header-area">
        			<div class="container-fluid p-0">
        				<div class="row align-items-center no-gutters">
        					<div class="col-xl-5 col-lg-5">
        						<div class="main-menu  d-none d-lg-block">
        							<nav>
        								<ul id="navigation">
        									<li><a class="active" href="trang-chu.html">home</a></li>		
        									<li><a href="khuyen-mai.html">Khuyễn Mãi</a></li>
        									<li><a href="cua-hang.html">Cửa Hàng</a></li>
        									<li><a href="lien-he.html">Liên hệ</a></li>
        								</ul>
        							</nav>
        						</div>
        					</div>
        					<div class="col-xl-2 col-lg-2">
        						<div class="logo-img">
        							<a href="index.html">
        								<img src="img/logo.png" alt="">
        							</a>
        						</div>
        					</div>
        					<div class="col-xl-5 col-lg-5 d-none d-lg-block">
        						<div class="book_room">
        							<div class="socail_links">
        								<ul>
        									<li>
        										<a href="#">
        											<i class="fa fa-instagram"></i>
        										</a>
        									</li>
        									<li>
        										<a href="#">
        											<i class="fa fa-twitter"></i>
        										</a>
        									</li>
        									<li>
        										<a href="#">
        											<i class="fa fa-facebook"></i>
        										</a>
        									</li>
        									<li>
        										<a href="#">
        											<i class="fa fa-google-plus"></i>
        										</a>
        									</li>
        								</ul>
        							</div>
        							<div class="book_btn d-none d-xl-block">
        								<a class="fa fa-cart-plus" href="#">Cart</a>
        							</div>
        						</div>
        					</div>
        					<div class="col-12">
        						<div class="mobile_menu d-block d-lg-none"></div>
        					</div>
        				</div>
        			</div>
        		</div>
        	</div>
        </header>
        <!-- header-end -->
       
        <jsp:include page="${param.view}"/>
        
        <!-- instragram_area_end -->

        <footer class="footer">
        	<div class="footer_top">
        		<div class="container">
        			<div class="row">
        				<div class="col-xl-4 col-md-6 col-lg-4">
        					<div class="footer_widget text-center ">
        						<h3 class="footer_title pos_margin">
        							New York
        						</h3>
        						<p>5th flora, 700/D kings road, <br> 
        							green lane New York-1782 <br>
        							<a href="#">info@burger.com</a></p>
        							<a class="number" href="#">+10 378 483 6782</a>

        						</div>
        					</div>
        					<div class="col-xl-4 col-md-6 col-lg-4">
        						<div class="footer_widget text-center ">
        							<h3 class="footer_title pos_margin">
        								California
        							</h3>
        							<p>5th flora, 700/D kings road, <br> 
        								green lane New York-1782 <br>
        								<a href="#">info@burger.com</a></p>
        								<a class="number" href="#">+10 378 483 6782</a>

        							</div>
        						</div>
        						<div class="col-xl-4 col-md-12 col-lg-4">
        							<div class="footer_widget">
        								<h3 class="footer_title">
        									Stay Connected
        								</h3>
        								<form action="#" class="newsletter_form">
        									<input type="text" placeholder="Enter your mail">
        									<button type="submit">Sign Up</button>
        								</form>
        								<p class="newsletter_text">Stay connect with us to get exclusive offer!</p>
        							</div>
        						</div>
        					</div>
        					<div class="row justify-content-center">
        						<div class="col-lg-4">
        							<div class="socail_links text-center">
        								<ul>
        									<li>
        										<a href="#">
        											<i class="ti-instagram"></i>
        										</a>
        									</li>
        									<li>
        										<a href="#">
        											<i class="ti-twitter-alt"></i>
        										</a>
        									</li>
        									<li>
        										<a href="#">
        											<i class="ti-facebook"></i>
        										</a>
        									</li>
        									<li>
        										<a href="#">
        											<i class="fa fa-google-plus"></i>
        										</a>
        									</li>
        								</ul>
        							</div>
        						</div>
        					</div>
        				</div>
        			</div>
        			<div class="copy-right_text">
        				<div class="container">
        					<div class="footer_border"></div>
        					<div class="row">
        						<div class="col-xl-12">
        							<p class="copy_right text-center">
        								<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
        								Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
        								<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
        							</p>
        						</div>
        					</div>
        				</div>
        			</div>
        		</footer>


        		<!-- JS here -->
        		<script src="js/vendor/modernizr-3.5.0.min.js"></script>
        		<script src="js/vendor/jquery-1.12.4.min.js"></script>
        		<script src="js/popper.min.js"></script>
        		<script src="js/bootstrap.min.js"></script>
        		<script src="js/owl.carousel.min.js"></script>
        		<script src="js/isotope.pkgd.min.js"></script>
        		<script src="js/ajax-form.js"></script>
        		<script src="js/waypoints.min.js"></script>
        		<script src="js/jquery.counterup.min.js"></script>
        		<script src="js/imagesloaded.pkgd.min.js"></script>
        		<script src="js/scrollIt.js"></script>
        		<script src="js/jquery.scrollUp.min.js"></script>
        		<script src="js/wow.min.js"></script>
        		<script src="js/nice-select.min.js"></script>
        		<script src="js/jquery.slicknav.min.js"></script>
        		<script src="js/jquery.magnific-popup.min.js"></script>
        		<script src="js/plugins.js"></script>

        		<!--contact js-->
        		<script src="js/contact.js"></script>
        		<script src="js/jquery.ajaxchimp.min.js"></script>
        		<script src="js/jquery.form.js"></script>
        		<script src="js/jquery.validate.min.js"></script>
        		<script src="js/mail-script.js"></script>

        		<script src="js/main.js"></script>

        	</body>

        	</html>
</body>
</html>