package api.admin;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import burger.bean.sanpham;

@RestController(value="newAPIOfAdmin")

public class new_api {

	
	@PostMapping("/api/new")
	public  sanpham createNew(@RequestBody sanpham sanpham) {
		return sanpham;
	}
	
	@PutMapping("/api/new")
	public  sanpham updateNew(@RequestBody sanpham sanpham) {
		return sanpham;
	}
	
	@DeleteMapping("/api/new")
	public  void deteteNew(@RequestBody long[] ids) {
	}
}
