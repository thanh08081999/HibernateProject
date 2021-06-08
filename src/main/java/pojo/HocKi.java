package pojo;

import java.sql.Date;
import java.io.Serializable;
import java.util.Objects;

public class HocKi implements Serializable{
    private IDHocKi idHocKi;
    private Date ngayBD;
    private Date ngayKT;

    public HocKi() {
    }

    public HocKi(IDHocKi idHocKi, Date ngayBD, Date ngayKT) {
        this.idHocKi = idHocKi;
        this.ngayBD = ngayBD;
        this.ngayKT = ngayKT;
    }

    public IDHocKi getIdHocKi() {
        return idHocKi;
    }

    public void setIdHocKi(IDHocKi idHocKi) {
        this.idHocKi = idHocKi;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.idHocKi);
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
        final HocKi other = (HocKi) obj;
        return Objects.equals(this.idHocKi, other.idHocKi);
    }
}