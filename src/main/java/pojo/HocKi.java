package pojo;

import java.sql.Date;
import java.io.Serializable;
import java.util.Objects;

public class HocKi implements Serializable{
    private IDHocKi idHocKi;
    private Date ngayBD;
    private Date ngayKT;
    private boolean HKHT;

    public HocKi() {
    }

    public HocKi(IDHocKi idHocKi, Date ngayBD, Date ngayKT, boolean HKHT) {
        this.idHocKi = idHocKi;
        this.ngayBD = ngayBD;
        this.ngayKT = ngayKT;
        this.HKHT = HKHT;
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

    public boolean isHKHT() {
        return HKHT;
    }

    public void setHKHT(boolean HKHT) {
        this.HKHT = HKHT;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.idHocKi);
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
        if (!Objects.equals(this.idHocKi, other.idHocKi)) {
            return false;
        }
        return true;
    }
}