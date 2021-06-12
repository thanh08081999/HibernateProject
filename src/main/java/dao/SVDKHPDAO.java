package dao;

import pojo.SVDKHP;
import java.util.List;
import util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import pojo.IDSVDKHP;

public class SVDKHPDAO {
    public static List<SVDKHP> layDanhSachSVDKHP(){
        List<SVDKHP> dsSVDKHP = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql  = "select svdkhp from SVDKHP svdkhp";
            Query query = session.createQuery(hql);
            dsSVDKHP = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        }
        return dsSVDKHP;
    }
    
    public static SVDKHP layThongTinSVDKHP(IDSVDKHP idSVDKHP) {
        SVDKHP svdkhp = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            svdkhp = (SVDKHP) session.get(SVDKHP.class, idSVDKHP);
        } catch (HibernateException ex) {
            System.err.println(ex);
        }
        return svdkhp;
    }
    
    public static boolean themSVDKHP(SVDKHP svdkhp) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (SVDKHPDAO.layThongTinSVDKHP(svdkhp.getIdSVDKHP()) != null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(svdkhp);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
    public static boolean capNhatThongTinSVDKHP(SVDKHP svdkhp) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (SVDKHPDAO.layThongTinSVDKHP(svdkhp.getIdSVDKHP()) == null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(svdkhp);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
    
    public static boolean xoaSVDKHP(IDSVDKHP idSVDKHP) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        SVDKHP svdkhp = SVDKHPDAO.layThongTinSVDKHP(idSVDKHP);
        if (svdkhp == null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(svdkhp);
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
