import pojo.TaiKhoan;
import pojo.SinhVien;
import pojo.LopHoc;
import pojo.HocPhan;
import pojo.MonHoc;
import pojo.IDHocPhan;
import pojo.NgayTrongTuan;
import pojo.CaHoc;
import pojo.HocKi;
import pojo.DSKiDKHP;
import pojo.DSSVDKHP;
import pojo.GiaoVien;
import pojo.PhongHoc;
import pojo.IDHocKi;
import dao.TaiKhoanDAO;
import dao.SinhVienDAO;
import dao.MonHocDAO;
import dao.HocPhanDAO;
import dao.GiaoVienDAO;
import dao.CaHocDAO;
import dao.NgayTrongTuanDAO;
import dao.HocKiDAO;
import java.util.List;
import java.sql.Date;


public class Main {
    public static void main(String[] args) {
        /*List<HocPhan> dshp = HocPhanDAO.layDanhSachHocPhan();
        for (int i = 0; i < dshp.size(); i++) {
            HocPhan hp = dshp.get(i);
            IDHocPhan idhp = hp.getIdHocPhan();
            MonHoc mh = MonHocDAO.layThongTinMonHoc(idhp.getMaMonHoc());
            NgayTrongTuan thu = NgayTrongTuanDAO.layThongTinNgayTrongTuan(idhp.getIdThu());
            GiaoVien gv = hp.getGiaoVien();
            PhongHoc ph = hp.getPhongHoc();
            CaHoc ca = CaHocDAO.layThongTinCaHoc(idhp.getIdCa());
            System.out.println("Ma mon hoc: " + mh.getMaMonHoc());
            System.out.println("Ten mon hoc: " + mh.getTenMonHoc());
            System.out.println("So tin chi: " + mh.getSoTinChi());
            System.out.println("Giao vien: " + gv.getTenGiaoVien());
            System.out.println("Phong hoc: " + ph.getMaPhong());
            System.out.println("Thu: " + thu.getTenThu());
            System.out.println("Ca: " + ca.getGioHoc());
            System.out.println("So slot: " + hp.getSoSlot());
        }*/
        //TaiKhoan tk = new TaiKhoan("171277", "1", "Sinh viên", null, null);
        
        if (TaiKhoanDAO.xoaTaiKhoan("171277")) {
            System.out.println("thanh cong!");
        } else {
            System.out.println("that bai!");
        }
        
        /*IDHocKi idhk = new IDHocKi("HK1", "2021-2022");
        Date bd = Date.valueOf("2021-09-01");
        Date kt = Date.valueOf("2021-01-31");
        HocKi hk = new HocKi(idhk, bd, kt);
        
        if (HocKiDAO.xoaHocKi(idhk)) {
            System.out.println("xoa thanh cong!");
        } else {
            System.out.println("xoa that bai!");
        }*/
        //System.out.println("MSMH: " + hp.);
        //System.out.println("Tên môn hoc: " + mh.getTenMonHoc());
        //System.out.println("Số tín chỉ: " + mh.getSoTinChi());
        //System.out.println("Ngày sinh: " + tk.getNgaySinh());
        //LopHoc lop = tk.getLop();
        //System.out.println("Tên lớp: " + lop.getTenLop());
    }
}
