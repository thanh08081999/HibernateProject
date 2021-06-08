package dao;

import pojo.NgayTrongTuan;
//import java.util.List;
import util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
//import org.hibernate.Transaction;
//import org.hibernate.query.Query;

public class NgayTrongTuanDAO {
    public static NgayTrongTuan layThongTinNgayTrongTuan(String idThu) {
        NgayTrongTuan thu = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            thu = (NgayTrongTuan) session.get(NgayTrongTuan.class, idThu);
        } catch (HibernateException ex) {
            System.err.println(ex);
        }
        return thu;
    }
}
