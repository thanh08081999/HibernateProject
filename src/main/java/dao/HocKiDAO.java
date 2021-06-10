package dao;

import pojo.HocKi;
import pojo.IDHocKi;
import java.util.List;
import util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class HocKiDAO {
    public static List<HocKi> layDanhSachHocKi(){
        List<HocKi> dshk = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql  = "select hk from HocKi hk";
            Query query = session.createQuery(hql);
            dshk = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        }
        return dshk;
    }
    
    public static HocKi layThongTinHocKi(IDHocKi idHocKi) {
        HocKi hk = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            hk = (HocKi) session.get(HocKi.class, idHocKi);
        } catch (HibernateException ex) {
            System.err.println(ex);
        }
        return hk;
    }
    
    public static boolean themHocKi(HocKi hk) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (HocKiDAO.layThongTinHocKi(hk.getIdHocKi()) != null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(hk);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
    public static boolean capNhatThongTinHocKi(HocKi hk) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (HocKiDAO.layThongTinHocKi(hk.getIdHocKi()) == null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(hk);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
    
    public static boolean xoaHocKi(IDHocKi idHocKi) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        HocKi hk = HocKiDAO.layThongTinHocKi(idHocKi);
        if (hk == null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(hk);
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
