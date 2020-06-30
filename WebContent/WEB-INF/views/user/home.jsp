 <%@ page pageEncoding="utf-8"%>
 <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<div class="top">
	<div class="best_burgers_area">
			<div class="menu-bar">
				<div class="container" id="pd-bt">
		      					<ul class="nav justify-content-center">
									<c:forEach var="lsp" items="${LoaiSP}">
			        					<li class="item" style="margin-right: 40px">      					
			        						<a href="trang-chu.html?idlsp=${lsp.id_loai }" items="${Burger}">
			        							<img class="rounded-circle" src="https://burgerking.vn/media/wysiwyg/navigation/P-BURGER.jpg">
			        							</br>&emsp;<strong>${lsp.ten_loai }</strong>
			        						</a>      					      							
			        					</li>
			        				</c:forEach>	     					
		        				</ul> 		
		        	</div>
			</div>
        	<div class="container">
        		<div class="row">
  
        			<div class="col-lg-12">
        				<div class="section_title text-center mb-80">
        					<span>Burger Menu</span>
        					<h3>Best Ever Burgers</h3>
        				</div>
        			</div>
        		</div>
        		<div class="row">
        		
        		<!-- //////////////////Load data san pham/////////////////////// -->
        		
        		<c:forEach var="sp" items="${dsshop}">
        					<div class="col-xl-6 col-md-6 col-lg-6">
        				<div class="single_delicious d-flex align-items-center">
        					<div class="thumb">
        						<img src="img/burger/${sp.images}" alt="${sp.ten_sp}">
        					</div>
        					<div class="info">
        						<h3>${sp.ten_sp}</h3>
        						<p>${sp.mo_ta}</p>
        						<div class="row">
        						<span>${sp.gia_goc}&ensp;VND</span>
        						<button type="button" class=" ml-3 btn btn-outline-primary">Add To Cart</button> 
        						</div>
        						
        					</div>
        				</div>
        			</div>      				
        		</c:forEach>
        		
		<!-- //////////////////Load data san pham/////////////////////// -->
	
	
        		</div>
        		<div class="row">
        			<div class="col-lg-12">
        				<div class="iteam_links">
        					<a class="boxed-btn5" href="Menu.html">More Items</a>
        				</div>
        			</div>
        		</div>
        	</div>
        </div>
</div>
 