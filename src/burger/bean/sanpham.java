package burger.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity 
@Table(name="sanpham")
public class sanpham {

	@Id
	@GeneratedValue
	@Column(name="id_sp")
	private Integer id_sp;
	@Column(name="ten_sp")
	private String ten_sp;
	@Column(name="images")
	private String images;
	@Column(name="gia_goc")
	private Double gia_goc;
	@Column(name="phan_tram")
	private Integer phan_tram;
	
	@ManyToOne
	@JoinColumn(name="id_loai")
	private loaisanpham id_loai;
	
	@Column(name="mo_ta")
	private String mo_ta;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@Column(name="create_date")
	private Date create_date;
	
	

	public Integer getId_sp() {
		return id_sp;
	}
	public void setId_sp(Integer id_sp) {
		this.id_sp = id_sp;
	}
	public String getTen_sp() {
		return ten_sp;
	}
	public void setTen_sp(String ten_sp) {
		this.ten_sp = ten_sp;
	}
	public Double getGia_ban() {
		return gia_goc;
	}
	public void setGia_ban(Double gia_goc) {
		this.gia_goc = gia_goc;
	}
	public Integer getPhan_tram() {
		return phan_tram;
	}
	public void setPhan_tram(Integer phan_tram) {
		this.phan_tram = phan_tram;
	}
	public String getImage() {
		return images;
	}
	public void setImage(String images) {
		this.images = images;
	}

	public loaisanpham getId_loai() {
		return id_loai;
	}
	public void setId_loai(loaisanpham id_loai) {
		this.id_loai = id_loai;
	}
	public String getMo_ta() {
		return mo_ta;
	}
	public void setMo_ta(String mo_ta) {
		this.mo_ta = mo_ta;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
		
}
