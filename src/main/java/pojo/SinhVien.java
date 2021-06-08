package pojo;

import java.util.Date;
import java.io.Serializable;
import java.util.Objects;

public class SinhVien implements Serializable{
    private String maSinhVien;
    private String tenSinhVien;
    private String gioiTinh;
    private Date ngaySinh;
    private LopHoc lop;

    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String tenSinhVien, String gioiTinh, Date ngaySinh, LopHoc lop) {
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.lop = lop;
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

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public LopHoc getLop() {
        return lop;
    }

    public void setLop(LopHoc lop) {
        this.lop = lop;
    }

    
    
    /**
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o){
        SinhVien no = (SinhVien) o;
        return this.maSinhVien.equals(no.maSinhVien);
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 6;
        hash = 19 * hash + Objects.hashCode(this.maSinhVien);
        return hash;
    }
}