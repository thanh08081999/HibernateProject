package pojo;

import java.io.Serializable;
import java.util.Objects;

public class HocPhan implements Serializable{
    private MonHoc monHoc;
    private GiaoVien giaoVien;
    private PhongHoc phongHoc;
    private NgayTrongTuan thu;
    private CaHoc ca;
    private int soSlot;

    public HocPhan() {
    }

    public HocPhan(MonHoc monHoc, GiaoVien giaoVien, PhongHoc phongHoc, NgayTrongTuan thu, CaHoc ca, int soSlot) {
        this.monHoc = monHoc;
        this.giaoVien = giaoVien;
        this.phongHoc = phongHoc;
        this.thu = thu;
        this.ca = ca;
        this.soSlot = soSlot;
    }

    public MonHoc getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(MonHoc monHoc) {
        this.monHoc = monHoc;
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

    public NgayTrongTuan getThu() {
        return thu;
    }

    public void setThu(NgayTrongTuan thu) {
        this.thu = thu;
    }

    public CaHoc getCa() {
        return ca;
    }

    public void setCa(CaHoc ca) {
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
        HocPhan no = (HocPhan) o;
        return this.monHoc.equals(no.monHoc) &&
                this.thu.equals(no.thu) &&
                this.ca.equals(no.ca);
    }

    @Override
    public int hashCode() {
        int hash = 4;
        hash = 17 * hash + Objects.hashCode(this.monHoc);
        hash = 17 * hash + Objects.hashCode(this.thu);
        hash = 17 * hash + Objects.hashCode(this.ca);
        return hash;
    }
}