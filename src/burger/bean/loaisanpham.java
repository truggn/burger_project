package burger.bean;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="loai_sp")
public class loaisanpham {
	@Id
	private Integer id_loai;
	@Column(name="ten_loai")
	private String ten_loai;
	@Column(name="ghi_chu")
	private String ghi_chu;
	
	@OneToMany(mappedBy = "id_loai", fetch = FetchType.EAGER)
	private Collection<sanpham> sanpham;
	
	public Integer getId_loai() {
		return id_loai;
	}
	public void setId_loai(Integer id_loai) {
		this.id_loai = id_loai;
	}
	public String getTen_loai() {
		return ten_loai;
	}
	public void setTen_loai(String ten_loai) {
		this.ten_loai = ten_loai;
	}
	public String getMo_ta() {
		return ghi_chu;
	}
	public void setMo_ta(String ghi_chu) {
		this.ghi_chu = ghi_chu;
	}
	
	public Collection<sanpham> getSanpham(){
		return sanpham;
	}
	public void setsanpham(Collection<sanpham> sanpham) {
		this.sanpham = sanpham;
	}
}
