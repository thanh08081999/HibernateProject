package dao;

import pojo.HocPhan;
import pojo.IDHocPhan;
import java.util.List;
import util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import pojo.IDSVDKHP;
import pojo.MonHoc;
import pojo.SVDKHP;

public class HocPhanDAO {
    public static List<HocPhan> layDanhSachHocPhan(){
        List<HocPhan> dshp = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql  = "select hp from HocPhan hp";
            Query query = session.createQuery(hql);
            dshp = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        }
        return dshp;
    }
    
    public static HocPhan layThongTinHocPhan(IDHocPhan idHocPhan) {
        HocPhan hp = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            hp = (HocPhan) session.get(HocPhan.class, idHocPhan);
        } catch (HibernateException ex) {
            System.err.println(ex);
        }
        return hp;
    }
    
    public static boolean themHocPhan(HocPhan hp) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (HocPhanDAO.layThongTinHocPhan(hp.getIdHocPhan()) != null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(hp);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
    public static boolean capNhatThongTinHocPhan(HocPhan hp) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (HocPhanDAO.layThongTinHocPhan(hp.getIdHocPhan()) == null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(hp);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
    
    public static boolean xoaHocPhan(IDHocPhan idHocPhan) {
        HocPhan hp = HocPhanDAO.layThongTinHocPhan(idHocPhan);
        if (hp == null) {
            return false;
        }
        MonHoc mh = hp.getMaMonHoc();
        IDHocPhan idhp = hp.getIdHocPhan();
        List<SVDKHP> dssvdkhp = SVDKHPDAO.layDanhSachSVDKHP();
        for (SVDKHP svdkhp : dssvdkhp) {
            IDSVDKHP id = svdkhp.getIdSVDKHP();
            if (id.getMaMonHoc().equals(mh.getMaMonHoc()) && 
                    idhp.getIdThu().equals(svdkhp.getThu()) &&
                    idhp.getIdCa().equals(svdkhp.getCaHoc()))
                SVDKHPDAO.xoaSVDKHP(id);
        }
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(hp);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
    
    public static void xoaTatCaHocPhan(){
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql  = "delete from HocPhan";
            session.createQuery(hql);
        } catch (HibernateException ex) {
            System.err.println(ex);
        }
    }
}
