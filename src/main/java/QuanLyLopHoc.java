
import dao.LopHocDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pojo.LopHoc;
import pojo.TaiKhoan;



public class QuanLyLopHoc extends javax.swing.JFrame {
    TaiKhoan taiKhoan;
    DefaultTableModel defaultTableModel;
    /**
     * Creates new form QuanLyLopHoc
     * @param taiKhoan
     */
    public QuanLyLopHoc(TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
        initComponents();
        
        defaultTableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }        
        };
        tbLopHoc.setModel(defaultTableModel);
        
        defaultTableModel.addColumn("Lớp");
        defaultTableModel.addColumn("Tổng sinh viên");
        defaultTableModel.addColumn("Tổng nam");
        defaultTableModel.addColumn("Tổng nữ");
        
        themDuLieu();
    }
    
    private void themDuLieu() {
        List<LopHoc> dslh = LopHocDAO.layDanhSachLopHoc();
        
        dslh.forEach(lh -> {
            defaultTableModel.addRow(new Object[]{lh.getTenLop(), lh.getTongSinhVien(),
                lh.getTongNam(), lh.getTongNu()});
        });
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
        tbLopHoc = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        btnXemSinhVien = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnQuayLai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnQuayLai.setText("Quay Lại");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        tbLopHoc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbLopHoc.setModel(new javax.swing.table.DefaultTableModel(
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
        tbLopHoc.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbLopHoc.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tbLopHoc);

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

        btnLamMoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        btnXemSinhVien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnXemSinhVien.setText("Xem Sinh Viên");
        btnXemSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemSinhVienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnQuayLai)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa)
                        .addGap(18, 18, 18)
                        .addComponent(btnXemSinhVien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLamMoi)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnQuayLai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnLamMoi)
                    .addComponent(btnXemSinhVien))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        new ThemLopHoc().setVisible(true);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int r = tbLopHoc.getSelectedRow();
        if (r == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn lớp học muốn xóa", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            String tenLop = (String) tbLopHoc.getValueAt(r, 0);
            int confirm = JOptionPane.showConfirmDialog(QuanLyLopHoc.this, "Các sinh viên trong lớp cũng sẽ bị xóa."
                    + "Bạn có chắc muốn xóa lớp " + tenLop + " không?");
            if (confirm == JOptionPane.YES_OPTION) {
                if (LopHocDAO.xoaLopHoc(tenLop)) {
                    JOptionPane.showMessageDialog(this, "Xóa lớp học thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    defaultTableModel.setRowCount(0);
                    themDuLieu();
                }
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnXemSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemSinhVienActionPerformed
        int r = tbLopHoc.getSelectedRow();
        if (r == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn lớp học muốn xem", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            String tenLop = (String) tbLopHoc.getValueAt(r, 0);
            new QuanLySinhVien(taiKhoan, tenLop).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnXemSinhVienActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXemSinhVien;
    private javax.swing.JButton btnXoa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbLopHoc;
    // End of variables declaration//GEN-END:variables
}