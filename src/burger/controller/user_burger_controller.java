package burger.controller;



import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import burger.bean.sanpham;


@Controller
public class user_burger_controller {
	@Autowired
	SessionFactory factory;
	ServletContext context;
	
	@Transactional
	@RequestMapping("trang-chu")
	public String home(ModelMap model) {
		Session session = factory.getCurrentSession();
		try {
			
			String hql = "FROM sanpham";
			Query query = session.createQuery(hql);
			List<sanpham> list = query.list();
			model.addAttribute("Sanpham", list);
		
		} catch (Exception e) {
			System.out.println("Lỗi truy vấn dữ liệu");
		}
		return("user/home");
	}
}
