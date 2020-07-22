package burger.controller;



import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


import burger.bean.Admin;

import burger.bean.md5;

@Transactional
@Controller
@RequestMapping("admin")
public class admin_controller {

	@Autowired
	SessionFactory factory;
	ServletContext context;
	
	
	
	@RequestMapping("login-page-burgermaster")
	public String login(ModelMap model, HttpSession ss ) {
		
		ss.setAttribute("usersname", null);
		model.addAttribute("login", new Admin());
		// remove addtribute 
		ss.removeAttribute("role");
		ss.removeAttribute("usersname");
		return "admin/login";
	}
	
	@RequestMapping("login")
	public String login(ModelMap model, @ModelAttribute("login") Admin login, HttpSession ss) {
		
			Session session = factory.getCurrentSession();	
		
			String hql="FROM Admin Us WHERE Us.user_name = :haha";
			Query query = session.createQuery(hql);	
			query.setParameter("haha", login.getUser_name());
			
			Admin user = (Admin) query.uniqueResult();
			
					try {
					if(user.getPassword().equals(md5.getMd5(login.getPassword()))) {
						ss.setAttribute("user_name", user.getUser_name());
						
						ss.setAttribute("role", user.getRole());
						
						if(user.getRole().equals("admin")) {
							return "redirect:/admin/home";
						}else {
							return "redirect:/user/login";
						}
					}else {
						model.addAttribute("ERRO","Password False");
					}
				} catch (Exception e) {
					model.addAttribute("ERRO","Password False");
				}
			

		return "redirect:/admin/login";
		
	}
	
	
	
}
