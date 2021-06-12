package pojo;

import java.io.Serializable;
import java.util.Objects;

public class IDSVDKHP implements Serializable {
    private String maSinhVien;
    private String maMonHoc;

    public IDSVDKHP() {
    }

    public IDSVDKHP(String maSinhVien, String maMonHoc) {
        this.maSinhVien = maSinhVien;
        this.maMonHoc = maMonHoc;
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
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.maSinhVien);
        hash = 43 * hash + Objects.hashCode(this.maMonHoc);
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
        return Objects.equals(this.maMonHoc, other.maMonHoc);
    }
    
    
}
