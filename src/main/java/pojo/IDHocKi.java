package pojo;

import java.io.Serializable;
import java.util.Objects;

public class IDHocKi implements Serializable {
    private String tenHocKi;
    private String namHoc;

    public IDHocKi() {
    }

    public IDHocKi(String tenHocKi, String namHoc) {
        this.tenHocKi = tenHocKi;
        this.namHoc = namHoc;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.tenHocKi);
        hash = 97 * hash + Objects.hashCode(this.namHoc);
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
        final IDHocKi other = (IDHocKi) obj;
        if (!Objects.equals(this.tenHocKi, other.tenHocKi)) {
            return false;
        }
        return Objects.equals(this.namHoc, other.namHoc);
    }
}
