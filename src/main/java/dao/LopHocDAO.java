package dao;

import pojo.LopHoc;
import java.util.List;
import util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class LopHocDAO {
    public static List<LopHoc> layDanhSachLopHoc(){
        List<LopHoc> dslh = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql  = "select lh from LopHoc lh";
            Query query = session.createQuery(hql);
            dslh = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        }
        return dslh;
    }
    
    public static LopHoc layThongTinLopHoc(String tenLop) {
        LopHoc lh = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            lh = (LopHoc) session.get(LopHoc.class, tenLop);
        } catch (HibernateException ex) {
            System.err.println(ex);
        }
        return lh;
    }
    
    public static boolean themLopHoc(LopHoc lh) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (LopHocDAO.layThongTinLopHoc(lh.getTenLop()) != null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(lh);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
    public static boolean capNhatThongTinLopHoc(LopHoc lh) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (LopHocDAO.layThongTinLopHoc(lh.getTenLop()) == null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(lh);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
    
    public static boolean xoaLopHoc(String tenLop) {
        SinhVienDAO.xoaSinhVienTrongLop(tenLop);
        Session session = HibernateUtil.getSessionFactory().openSession();
        LopHoc lh = LopHocDAO.layThongTinLopHoc(tenLop);
        if (lh == null) {
            return false;
        }
        Transaction transaction = null;
        try {
            
            transaction = session.beginTransaction();
            session.delete(lh);
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
