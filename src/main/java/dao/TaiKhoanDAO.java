package dao;

import pojo.TaiKhoan;
import java.util.List;
import util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class TaiKhoanDAO {
    public static List<TaiKhoan> layDanhSachTaiKhoan(){
        List<TaiKhoan> ds = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql  = "select tk from TaiKhoan tk";
            Query query = session.createQuery(hql);
            ds = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        }
        return ds;
    }
}
