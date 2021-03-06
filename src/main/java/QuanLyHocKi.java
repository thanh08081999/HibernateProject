
import dao.HocKiDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pojo.HocKi;
import pojo.IDHocKi;
import pojo.TaiKhoan;

public class QuanLyHocKi extends javax.swing.JFrame {
    TaiKhoan taiKhoan;
    DefaultTableModel defaultTableModel;
    /**
     * Creates new form QuanLyHocKi
     * @param taiKhoan
     */
    public QuanLyHocKi(TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
        initComponents();
        defaultTableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }        
        };
        
        tbHocKi.setModel(defaultTableModel);
        
        defaultTableModel.addColumn("Tên học kì");
        defaultTableModel.addColumn("Năm học");
        defaultTableModel.addColumn("Ngày bắt đầu");
        defaultTableModel.addColumn("Ngày kết thúc");
        
        themDuLieu();
    }
    
    private void themDuLieu() {
        List<HocKi> dshk = HocKiDAO.layDanhSachHocKi();
        for (HocKi hk : dshk) {
            defaultTableModel.addRow(new Object[]{hk.getIdHocKi().getTenHocKi(),
                hk.getIdHocKi().getNamHoc(), hk.getNgayBD(), hk.getNgayKT()});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnQuayLai = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHocKi = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSetHK = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnQuayLai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnQuayLai.setText("Quay lại");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        tbHocKi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbHocKi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbHocKi.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbHocKi.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tbHocKi);

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSetHK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSetHK.setText("Set học kì hiện tại");
        btnSetHK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetHKActionPerformed(evt);
            }
        });

        btnLamMoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnQuayLai)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa)
                        .addGap(18, 18, 18)
                        .addComponent(btnSetHK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLamMoi)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnQuayLai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnSetHK)
                    .addComponent(btnLamMoi))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        new ChucNangGiaoVu(taiKhoan).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQuayLaiActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        defaultTableModel.setRowCount(0);
        themDuLieu();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        new ThemHocKi().setVisible(true);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int r = tbHocKi.getSelectedRow();
        if (r == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn học kì muốn xóa", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int confirm = JOptionPane.showConfirmDialog(QuanLyHocKi.this, "Bạn có chắc muốn xóa không?");
            if (confirm == JOptionPane.YES_OPTION) {
                String hk = (String) tbHocKi.getValueAt(r, 0);
                String namHoc = (String) tbHocKi.getValueAt(r, 1);
                IDHocKi idhk = new IDHocKi(hk, namHoc);
                if (HocKiDAO.xoaHocKi(idhk)) {
                    JOptionPane.showMessageDialog(this, "Xóa học kì thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    defaultTableModel.setRowCount(0);
                    themDuLieu();
                }
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSetHKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetHKActionPerformed
        int r = tbHocKi.getSelectedRow();
        if (r == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn học kì muốn set", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            List<HocKi> dshk = HocKiDAO.layDanhSachHocKi();
            for (HocKi hk : dshk) {
                if (hk.isHKHT()) {
                    hk.setHKHT(false);
                    HocKiDAO.capNhatThongTinHocKi(hk);
                }
            }
            String hk = (String) tbHocKi.getValueAt(r, 0);
            String namHoc = (String) tbHocKi.getValueAt(r, 1);
            IDHocKi idhk = new IDHocKi(hk, namHoc);
            HocKi HK = HocKiDAO.layThongTinHocKi(idhk);
            HK.setHKHT(true);
            HocKiDAO.capNhatThongTinHocKi(HK);
            JOptionPane.showMessageDialog(this, "Set học kì hiện tại thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSetHKActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnSetHK;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbHocKi;
    // End of variables declaration//GEN-END:variables
}
