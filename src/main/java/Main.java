import pojo.TaiKhoan;
import java.util.List;
import dao.TaiKhoanDAO;

public class Main {
    public static void main(String[] args) {
        List<TaiKhoan> dstk = TaiKhoanDAO.layDanhSachTaiKhoan();
        for (int i = 0; i < dstk.size(); i++) {
            TaiKhoan tk = dstk.get(i);
            System.out.println("Tai khoan: " + tk.getTaiKhoan());
            System.out.println("Mat khau: " + tk.getMatKhau());
            System.out.println("Chuc danh: " + tk.getChucDanh());
            System.out.println("So dien thoai: " + tk.getSoDienThoai());
            System.out.println("Email: " + tk.getEmail());
        }
    }
}
