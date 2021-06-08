package pojo;

import java.io.Serializable;
import java.util.Objects;

public class HocPhan implements Serializable{
    private IDHocPhan idHocPhan;
    private GiaoVien giaoVien;
    private PhongHoc phongHoc;
    private int soSlot;

    public HocPhan() {
    }

    public HocPhan(IDHocPhan idHocPhan, GiaoVien giaoVien, PhongHoc phongHoc, int soSlot) {
        this.idHocPhan = idHocPhan;
        this.giaoVien = giaoVien;
        this.phongHoc = phongHoc;
        this.soSlot = soSlot;
    }

    public IDHocPhan getIdHocPhan() {
        return idHocPhan;
    }

    public void setIdHocPhan(IDHocPhan idHocPhan) {
        this.idHocPhan = idHocPhan;
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

    public int getSoSlot() {
        return soSlot;
    }

    public void setSoSlot(int soSlot) {
        this.soSlot = soSlot;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.idHocPhan);
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
        final HocPhan other = (HocPhan) obj;
        return Objects.equals(this.idHocPhan, other.idHocPhan);
    }
}