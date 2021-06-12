package dao;

import pojo.PhongHoc;
import util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class PhongHocDAO {
    public static PhongHoc layThongTinPhongHoc(String maPhong) {
        PhongHoc ph = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            ph = (PhongHoc) session.get(PhongHoc.class, maPhong);
        } catch (HibernateException ex) {
            System.err.println(ex);
        }
        return ph;
    }
}
