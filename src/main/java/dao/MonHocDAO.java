package dao;

import pojo.MonHoc;
import java.util.List;
import util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import pojo.HocPhan;

public class MonHocDAO {
    public static List<MonHoc> layDanhSachMonHoc(){
        List<MonHoc> dsmh = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql  = "select mh from MonHoc mh";
            Query query = session.createQuery(hql);
            dsmh = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        }
        return dsmh;
    }
    
    public static MonHoc layThongTinMonHoc(String maMonHoc) {
        MonHoc mh = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            mh = (MonHoc) session.get(MonHoc.class, maMonHoc);
        } catch (HibernateException ex) {
            System.err.println(ex);
        }
        return mh;
    }
    
    public static boolean themMonHoc(MonHoc mh) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (MonHocDAO.layThongTinMonHoc(mh.getMaMonHoc()) != null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(mh);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
    public static boolean capNhatThongTinMonHoc(MonHoc mh) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (MonHocDAO.layThongTinMonHoc(mh.getMaMonHoc()) == null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(mh);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
    
    public static boolean xoaMonHoc(String maMonHoc) {
        List<HocPhan> dshp = HocPhanDAO.layDanhSachHocPhan();
        dshp.forEach(hp -> {
            MonHoc mh = hp.getMaMonHoc();
            if (mh.getMaMonHoc().equals(maMonHoc)) {
                HocPhanDAO.xoaHocPhan(hp.getIdHocPhan());
            }
        });
        Session session = HibernateUtil.getSessionFactory().openSession();
        MonHoc mh = MonHocDAO.layThongTinMonHoc(maMonHoc);
        if (mh == null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(mh);
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