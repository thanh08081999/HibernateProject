package dao;

import pojo.KiDKHP;
import pojo.IDHocKi;
import java.util.List;
import util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class KiDKHPDAO {
    public static List<KiDKHP> layDanhSachKiDKHP(){
        List<KiDKHP> dskidkhp = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql  = "select ki from KiDKHP ki";
            Query query = session.createQuery(hql);
            dskidkhp = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        }
        return dskidkhp;
    }
    
    public static KiDKHP layThongTinKiDKHP(IDHocKi idHocKi) {
        KiDKHP ki = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            ki = (KiDKHP) session.get(KiDKHP.class, idHocKi);
        } catch (HibernateException ex) {
            System.err.println(ex);
        }
        return ki;
    }
    
    public static boolean themKiDKHP(KiDKHP ki) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (KiDKHPDAO.layThongTinKiDKHP(ki.getIdHocKi()) != null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(ki);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
    public static boolean capNhatThongTinKiDKHP(KiDKHP ki) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (KiDKHPDAO.layThongTinKiDKHP(ki.getIdHocKi()) == null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(ki);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
    
    public static boolean xoaKiDKHP(IDHocKi idHocKi) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        KiDKHP ki = KiDKHPDAO.layThongTinKiDKHP(idHocKi);
        if (ki == null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(ki);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
}
