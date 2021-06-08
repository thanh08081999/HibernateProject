package pojo;

import java.io.Serializable;
import java.util.Objects;

public class IDHocPhan implements Serializable {
    private String maMonHoc;
    private String idThu;
    private String idCa;

    public IDHocPhan() {
    }

    public IDHocPhan(String maMonHoc, String idThu, String idCa) {
        this.maMonHoc = maMonHoc;
        this.idThu = idThu;
        this.idCa = idCa;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.maMonHoc);
        hash = 43 * hash + Objects.hashCode(this.idThu);
        hash = 43 * hash + Objects.hashCode(this.idCa);
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
        if (!Objects.equals(this.maMonHoc, other.maMonHoc)) {
            return false;
        }
        if (!Objects.equals(this.idThu, other.idThu)) {
            return false;
        }
        return Objects.equals(this.idCa, other.idCa);
    }
    
    
}
