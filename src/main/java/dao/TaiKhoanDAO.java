package dao;

import pojo.TaiKhoan;
import java.util.List;
import util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class TaiKhoanDAO {
    public static List<TaiKhoan> layDanhSachTaiKhoan(){
        List<TaiKhoan> dstk = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql  = "select tk from TaiKhoan tk";
            Query query = session.createQuery(hql);
            dstk = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        }
        return dstk;
    }
    
    public static TaiKhoan layThongTinTaiKhoan(String taiKhoan) {
        TaiKhoan tk = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tk = (TaiKhoan) session.get(TaiKhoan.class, taiKhoan);
        } catch (HibernateException ex) {
            System.err.println(ex);
        }
        return tk;
    }
    
    public static boolean themTaiKhoan(TaiKhoan tk) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (TaiKhoanDAO.layThongTinTaiKhoan(tk.getTaiKhoan()) != null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(tk);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
    public static boolean capNhatThongTinTaiKhoan(TaiKhoan tk) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (TaiKhoanDAO.layThongTinTaiKhoan(tk.getTaiKhoan()) != null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(tk);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
    
    public static boolean xoaTaiKhoan(String taiKhoan) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        TaiKhoan tk = TaiKhoanDAO.layThongTinTaiKhoan(taiKhoan);
        if (tk == null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(tk);
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
