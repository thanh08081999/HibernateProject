package pojo;

import java.io.Serializable;
import java.util.Objects;



public class MonHoc implements Serializable{
	private String maMonHoc;
	private String tenMonHoc;
	private int soTinChi;

	public MonHoc(){
	}
	public MonHoc(String maMonHoc, String tenMonHoc, int soTinChi){
		this.maMonHoc = maMonHoc;
		this.tenMonHoc = tenMonHoc;
		this.soTinChi = soTinChi;
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
    
    /**
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o){
        if (o instanceof MonHoc no) {
            if (this.maMonHoc.equals(no.maMonHoc) &&
                this.tenMonHoc.equals(no.tenMonHoc))
                return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.maMonHoc);
        hash = 37 * hash + Objects.hashCode(this.tenMonHoc);
        return hash;
    }
}