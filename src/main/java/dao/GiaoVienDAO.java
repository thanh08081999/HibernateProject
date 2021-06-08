package dao;

import pojo.GiaoVien;
//import java.util.List;
import util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
//import org.hibernate.Transaction;
//import org.hibernate.query.Query;

public class GiaoVienDAO {
    public static GiaoVien layThongTinGiaoVien(String maGiaoVien) {
        GiaoVien gv = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            gv = (GiaoVien) session.get(GiaoVien.class, maGiaoVien);
        } catch (HibernateException ex) {
            System.err.println(ex);
        }
        return gv;
    }
}
