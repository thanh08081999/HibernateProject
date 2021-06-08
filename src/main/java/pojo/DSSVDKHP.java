package pojo;



import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class DSSVDKHP implements Serializable{
    private String maSinhVien;
    private String tenSinhVien;
    private String maMonHoc;
    private String tenMonHoc;
    private String giaoVien;
    private String ca;
    private Date thoiGianDKHP;

    public DSSVDKHP() {
    }

    public DSSVDKHP(String maSinhVien, String tenSinhVien, String maMonHoc, String tenMonHoc, String giaoVien, String ca, Date thoiGianDKHP) {
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
        this.giaoVien = giaoVien;
        this.ca = ca;
        this.thoiGianDKHP = thoiGianDKHP;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
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

    public String getGiaoVien() {
        return giaoVien;
    }

    public void setGiaoVien(String giaoVien) {
        this.giaoVien = giaoVien;
    }

    public String getCa() {
        return ca;
    }

    public void setCa(String ca) {
        this.ca = ca;
    }

    public Date getThoiGianDKHP() {
        return thoiGianDKHP;
    }

    public void setThoiGianDKHP(Date thoiGianDKHP) {
        this.thoiGianDKHP = thoiGianDKHP;
    }
    
    /**
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o){
        DSSVDKHP no = (DSSVDKHP) o;
        return this.maSinhVien.equals(no.maSinhVien) &&
                this.maMonHoc.equals(no.maMonHoc) &&
                this.tenMonHoc.equals(no.tenMonHoc) &&
                this.giaoVien.equals(no.giaoVien) &&
                this.ca.equals(no.ca);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.maSinhVien);
        hash = 37 * hash + Objects.hashCode(this.maMonHoc);
        hash = 37 * hash + Objects.hashCode(this.tenMonHoc);
        hash = 37 * hash + Objects.hashCode(this.giaoVien);
        hash = 37 * hash + Objects.hashCode(this.ca);
        return hash;
    }
}