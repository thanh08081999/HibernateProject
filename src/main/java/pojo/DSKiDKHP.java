package pojo;



import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class DSKiDKHP implements Serializable{
    private String tenHocKi;
    private String namHoc;
    private Date ngayBD;
    private Date ngayKT;

    public DSKiDKHP() {
    }

    public DSKiDKHP(String tenHocKi, String namHoc, Date ngayBD, Date ngayKT) {
        this.tenHocKi = tenHocKi;
        this.namHoc = namHoc;
        this.ngayBD = ngayBD;
        this.ngayKT = ngayKT;
    }

    public String getTenHocKi() {
        return tenHocKi;
    }

    public void setTenHocKi(String tenHocKi) {
        this.tenHocKi = tenHocKi;
    }

    public String getNamHoc() {
        return namHoc;
    }

    public void setNamHoc(String namHoc) {
        this.namHoc = namHoc;
    }

    public Date getNgayBD() {
        return ngayBD;
    }

    public void setNgayBD(Date ngayBD) {
        this.ngayBD = ngayBD;
    }

    public Date getNgayKT() {
        return ngayKT;
    }

    public void setNgayKT(Date ngayKT) {
        this.ngayKT = ngayKT;
    }
    
    /**
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o){
        if (o instanceof DSKiDKHP no) {
            if (this.tenHocKi.equals(no.tenHocKi) &&
                this.namHoc.equals(no.namHoc))
                return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 2;
        hash = 67 * hash + Objects.hashCode(this.tenHocKi);
        hash = 67 * hash + Objects.hashCode(this.namHoc);
        return hash;
    }
}