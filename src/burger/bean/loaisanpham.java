package burger.bean;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="loai_sp")
public class loaisanpham {
	@Id
	private Integer id_loai;
	@Column(name="ten_loai")
	private String ten_loai;
	@Column(name="ghi_chu")
	private String ghi_chu;
	@Column(name="img_loai")
	private String img_loai;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@Column(name="create_date")
	private Date create_date;
	
	public String getGhi_chu() {
		return ghi_chu;
	}
	public void setGhi_chu(String ghi_chu) {
		this.ghi_chu = ghi_chu;
	}
	public String getImg_loai() {
		return img_loai;
	}
	public void setImg_loai(String img_loai) {
		this.img_loai = img_loai;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public void setSanpham(Collection<sanpham> sanpham) {
		this.sanpham = sanpham;
	}
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
