package pojo;

import java.io.Serializable;
import java.util.Objects;

public class IDSVDKHP implements Serializable {
    private String maSinhVien;
    private String maMonHoc;
    private String giaoVien;
    private String ca;

    public IDSVDKHP() {
    }

    public IDSVDKHP(String maSinhVien, String maMonHoc, String giaoVien, String ca) {
        this.maSinhVien = maSinhVien;
        this.maMonHoc = maMonHoc;
        this.giaoVien = giaoVien;
        this.ca = ca;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.maSinhVien);
        hash = 43 * hash + Objects.hashCode(this.maMonHoc);
        hash = 43 * hash + Objects.hashCode(this.giaoVien);
        hash = 43 * hash + Objects.hashCode(this.ca);
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
        final IDSVDKHP other = (IDSVDKHP) obj;
        if (!Objects.equals(this.maSinhVien, other.maSinhVien)) {
            return false;
        }
        if (!Objects.equals(this.maMonHoc, other.maMonHoc)) {
            return false;
        }
        if (!Objects.equals(this.giaoVien, other.giaoVien)) {
            return false;
        }
        if (!Objects.equals(this.ca, other.ca)) {
            return false;
        }
        return true;
    }
    
    
}
