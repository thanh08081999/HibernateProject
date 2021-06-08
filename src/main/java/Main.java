import pojo.TaiKhoan;
import pojo.SinhVien;
import pojo.LopHoc;
import pojo.HocPhan;

import dao.TaiKhoanDAO;
import dao.SinhVienDAO;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        SinhVien tk = SinhVienDAO.layThongTinSinhVien("1712771");
        /*for (int i = 0; i < dstk.size(); i++) {
            TaiKhoan tk = dstk.get(i);
            System.out.println("Tai khoan: " + tk.getTaiKhoan());
            System.out.println("Mat khau: " + tk.getMatKhau());
            System.out.println("Chuc danh: " + tk.getChucDanh());
            System.out.println("So dien thoai: " + tk.getSoDienThoai());
            System.out.println("Email: " + tk.getEmail());
        }*/
        System.out.println("MSSV: " + tk.getMaSinhVien());
        System.out.println("Tên sinh viên: " + tk.getTenSinhVien());
        System.out.println("Giới tính: " + tk.getGioiTinh());
        System.out.println("Ngày sinh: " + tk.getNgaySinh());
        LopHoc lop = tk.getLop();
        System.out.println("Tên lớp: " + lop.getTenLop());
    }
}
