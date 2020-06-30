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

import burger.bean.loaisanpham;
import burger.bean.sanpham;


@Controller
public class user_burger_controller {
	@Autowired
	SessionFactory factory;
	ServletContext context;
	
	@Transactional
	@RequestMapping("trang-chu")
	public String home(ModelMap model,@ModelAttribute("idlsp") String idlsp) {
		Session session = factory.getCurrentSession();
		String hql = "From loaisanpham";
		Query query = session.createQuery(hql);
		List<loaisanpham> loaisanpham = query.list();
		model.addAttribute("LoaiSP", loaisanpham);
		
		if (idlsp.isEmpty()) {
			String hql1 = "From sanpham where id_loai = " + loaisanpham.get(0).getId_loai()+"";
			Query query1 = session.createQuery(hql1);
			List<sanpham> dsshop = query1.list();
			model.addAttribute("dsshop", dsshop);
			model.addAttribute("idlsp", loaisanpham.get(0).getId_loai());
		} else {
			String hql1 = "From sanpham where id_loai = " + idlsp +"";
			Query query1 = session.createQuery(hql1);
			List<sanpham> dsshop = query1.list();
			model.addAttribute("dsshop", dsshop);
			model.addAttribute("idlsp", idlsp);
		}
		
		return("user/home");
	}

}
