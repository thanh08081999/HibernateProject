package pojo;



import java.util.Date;
import java.io.Serializable;
import java.util.Objects;


public class DSHocKi implements Serializable{
    private String tenHocKi;
    private String namHoc;
    private Date ngayBD;
    private Date ngayKT;

    public DSHocKi() {
    }

    public DSHocKi(String tenHocKi, String namHoc, Date ngayBD, Date ngayKT) {
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
        if (o instanceof DSHocKi no) {
            if (this.tenHocKi.equals(no.tenHocKi) &&
                this.namHoc.equals(no.namHoc))
                return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash = 71 * hash + Objects.hashCode(this.tenHocKi);
        hash = 71 * hash + Objects.hashCode(this.namHoc);
        return hash;
    }
}