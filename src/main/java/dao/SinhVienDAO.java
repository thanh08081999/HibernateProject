package dao;

import pojo.SinhVien;
import java.util.List;
import util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import pojo.IDSVDKHP;
import pojo.SVDKHP;

public class SinhVienDAO {
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
    
    public static List<SinhVien> layDanhSachSinhVienTrongLop(String tenLop){
        List<SinhVien> dssv = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql  = "select sv from SinhVien sv";
            hql = hql + " where sv.lop = '" + tenLop + "'";
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
        if (SinhVienDAO.layThongTinSinhVien(sv.getMaSinhVien()) == null) {
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
        SinhVien sv = SinhVienDAO.layThongTinSinhVien(maSinhVien);
        if (sv == null) {
            return false;
        }
        List<SVDKHP> dssvdkhp = SVDKHPDAO.layDanhSachSVDKHP();
        for (SVDKHP svdkhp : dssvdkhp){
            IDSVDKHP id = svdkhp.getIdSVDKHP();
            if (id.getMaSinhVien().equals(maSinhVien))
                SVDKHPDAO.xoaSVDKHP(id);
        }
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(sv);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
    
    public static boolean xoaSinhVienTrongLop(String tenLop) {
        List<SinhVien> dssv = SinhVienDAO.layDanhSachSinhVienTrongLop(tenLop);
        if (dssv == null) {
            return false;
        }
        dssv.forEach(sv -> {
            SinhVienDAO.xoaSinhVien(sv.getMaSinhVien());
        });
        return true;
    }
}
