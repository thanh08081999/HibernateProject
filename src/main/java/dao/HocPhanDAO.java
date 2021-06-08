package dao;

import pojo.SinhVien;
import java.util.List;
import util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class HocPhanDAO {
    public static List<SinhVien> layDanhSachSinhVien(){
        List<SinhVien> dssv = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql  = "select sv from SinhVien sv";
            Query query = session.createQuery(hql);
            dssv = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        }
        return dssv;
    }
    
    public static SinhVien layThongTinSinhVien(String maSinhVien) {
        SinhVien sv = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            sv = (SinhVien) session.get(SinhVien.class, maSinhVien);
        } catch (HibernateException ex) {
            System.err.println(ex);
        }
        return sv;
    }
    
    public static boolean themSinhVien(SinhVien sv) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (SinhVienDAO.layThongTinSinhVien(sv.getMaSinhVien()) != null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(sv);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
    public static boolean capNhatThongTinSinhVien(SinhVien sv) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (SinhVienDAO.layThongTinSinhVien(sv.getMaSinhVien()) != null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(sv);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
    
    public static boolean xoaSinhVien(String maSinhVien) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (SinhVienDAO.layThongTinSinhVien(maSinhVien) != null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(maSinhVien);
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