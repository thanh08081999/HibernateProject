package pojo;

import java.io.Serializable;
import java.util.Objects;



public class HocPhan implements Serializable{
	private String maMonHoc;
	private String tenMonHoc;
	private int soTinChi;
	private String giaoVienLT;
	private String phongHoc;
	private String thu;
	private String ca;
	private int soSlot;

	public HocPhan(){}
	public HocPhan(String maMonHoc, String tenMonHoc, int soTinChi, String giaoVienLT, String phongHoc, String thu, String ca, int soSlot){
		this.maMonHoc = maMonHoc;
		this.tenMonHoc = tenMonHoc;
		this.soTinChi = soTinChi;
		this.giaoVienLT = giaoVienLT;
		this.phongHoc = phongHoc;
		this.thu = thu;
		this.ca = ca;
		this.soSlot = soSlot;
	}

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    public String getGiaoVienLT() {
        return giaoVienLT;
    }

    public void setGiaoVienLT(String giaoVienLT) {
        this.giaoVienLT = giaoVienLT;
    }

    public String getPhongHoc() {
        return phongHoc;
    }

    public void setPhongHoc(String phongHoc) {
        this.phongHoc = phongHoc;
    }

    public String getThu() {
        return thu;
    }

    public void setThu(String thu) {
        this.thu = thu;
    }

    public String getCa() {
        return ca;
    }

    public void setCa(String ca) {
        this.ca = ca;
    }

    public int getSoSlot() {
        return soSlot;
    }

    public void setSoSlot(int soSlot) {
        this.soSlot = soSlot;
    }
    
    /**
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o){
        if (o instanceof HocPhan no) {
            if (this.maMonHoc.equals(no.maMonHoc) &&
                this.tenMonHoc.equals(no.tenMonHoc) &&
                this.giaoVienLT.equals(no.giaoVienLT) &&
                this.phongHoc.equals(no.phongHoc) &&
                this.thu.equals(no.thu) &&
                this.ca.equals(no.ca))
                return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 4;
        hash = 17 * hash + Objects.hashCode(this.maMonHoc);
        hash = 17 * hash + Objects.hashCode(this.tenMonHoc);
        hash = 17 * hash + Objects.hashCode(this.giaoVienLT);
        hash = 17 * hash + Objects.hashCode(this.phongHoc);
        hash = 17 * hash + Objects.hashCode(this.thu);
        hash = 17 * hash + Objects.hashCode(this.ca);
        return hash;
    }
}