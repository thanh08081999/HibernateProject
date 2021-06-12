package pojo;

import java.io.Serializable;
import java.util.Objects;

public class IDHocPhan implements Serializable {
    private String phongHoc;
    private String idThu;
    private String idCa;

    public IDHocPhan() {
    }

    public IDHocPhan(String phongHoc, String idThu, String idCa) {
        this.phongHoc = phongHoc;
        this.idThu = idThu;
        this.idCa = idCa;
    }

    public String getIdThu() {
        return idThu;
    }

    public void setIdThu(String idThu) {
        this.idThu = idThu;
    }

    public String getIdCa() {
        return idCa;
    }

    public void setIdCa(String idCa) {
        this.idCa = idCa;
    }

    public String getPhongHoc() {
        return phongHoc;
    }

    public void setPhongHoc(String phongHoc) {
        this.phongHoc = phongHoc;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.phongHoc);
        hash = 59 * hash + Objects.hashCode(this.idThu);
        hash = 59 * hash + Objects.hashCode(this.idCa);
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
        final IDHocPhan other = (IDHocPhan) obj;
        if (!Objects.equals(this.phongHoc, other.phongHoc)) {
            return false;
        }
        if (!Objects.equals(this.idThu, other.idThu)) {
            return false;
        }
        return Objects.equals(this.idCa, other.idCa);
    }

    
}
