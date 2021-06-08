package dao;

import pojo.CaHoc;
//import java.util.List;
import util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
//import org.hibernate.Transaction;
//import org.hibernate.query.Query;

public class CaHocDAO {
    public static CaHoc layThongTinCaHoc(String idCa) {
        CaHoc ca = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            ca = (CaHoc) session.get(CaHoc.class, idCa);
        } catch (HibernateException ex) {
            System.err.println(ex);
        }
        return ca;
    }
}
