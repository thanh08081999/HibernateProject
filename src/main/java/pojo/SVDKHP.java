package pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class SVDKHP implements Serializable{
    private IDSVDKHP idSVDKHP;
    private GiaoVien giaoVien;
    private PhongHoc phongHoc;
    private String thu;
    private String caHoc;
    private Date thoiGianHoc;
    private Date thoiGianDKHP;

    public SVDKHP() {
    }

    public SVDKHP(IDSVDKHP idSVDKHP, GiaoVien giaoVien, PhongHoc phongHoc, String thu, String caHoc, Date thoiGianHoc, Date thoiGianDKHP) {
        this.idSVDKHP = idSVDKHP;
        this.giaoVien = giaoVien;
        this.phongHoc = phongHoc;
        this.thu = thu;
        this.caHoc = caHoc;
        this.thoiGianHoc = thoiGianHoc;
        this.thoiGianDKHP = thoiGianDKHP;
    }

    public IDSVDKHP getIdSVDKHP() {
        return idSVDKHP;
    }

    public void setIdSVDKHP(IDSVDKHP idSVDKHP) {
        this.idSVDKHP = idSVDKHP;
    }

    public GiaoVien getGiaoVien() {
        return giaoVien;
    }

    public void setGiaoVien(GiaoVien giaoVien) {
        this.giaoVien = giaoVien;
    }

    public PhongHoc getPhongHoc() {
        return phongHoc;
    }

    public void setPhongHoc(PhongHoc phongHoc) {
        this.phongHoc = phongHoc;
    }

    public String getThu() {
        return thu;
    }

    public void setThu(String thu) {
        this.thu = thu;
    }

    public String getCaHoc() {
        return caHoc;
    }

    public void setCaHoc(String caHoc) {
        this.caHoc = caHoc;
    }

    public Date getThoiGianHoc() {
        return thoiGianHoc;
    }

    public void setThoiGianHoc(Date thoiGianHoc) {
        this.thoiGianHoc = thoiGianHoc;
    }

    public Date getThoiGianDKHP() {
        return thoiGianDKHP;
    }

    public void setThoiGianDKHP(Date thoiGianDKHP) {
        this.thoiGianDKHP = thoiGianDKHP;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.idSVDKHP);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SVDKHP other = (SVDKHP) obj;
        if (!Objects.equals(this.idSVDKHP, other.idSVDKHP)) {
            return false;
        }
        return true;
    }

    
}