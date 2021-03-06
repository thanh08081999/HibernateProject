import pojo.TaiKhoan;
import dao.TaiKhoanDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class QuanLyTaiKhoan extends javax.swing.JFrame {
    TaiKhoan taiKhoan;
    DefaultTableModel defaultTableModel;
    /**
     * Creates new form QuanLyTaiKhoan
     * @param taiKhoan
     */
    public QuanLyTaiKhoan(TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
        initComponents();
        
        defaultTableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }        
        };
        
        tbTaiKhoan.setModel(defaultTableModel);
        
        defaultTableModel.addColumn("Tài khoản");
        defaultTableModel.addColumn("Mật khẩu");
        defaultTableModel.addColumn("Chức danh");
        defaultTableModel.addColumn("Số điện thoại");
        defaultTableModel.addColumn("Email");
        
        themDuLieu();
    }
    
    private void themDuLieu() {
        List<TaiKhoan> dstk = TaiKhoanDAO.layDanhSachTaiKhoanGV();
        
        dstk.forEach(tk -> {
            defaultTableModel.addRow(new Object[]{tk.getTaiKhoan(), tk.getMatKhau(),
                tk.getChucDanh(), tk.getSoDienThoai(), tk.getEmail()});
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

        btnThem = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txfTimKiem = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbTaiKhoan = new javax.swing.JTable();
        btnQuayLai = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnResetMK = new javax.swing.JButton();
        btnTim = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnCapNhat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Tìm kiếm:");

        txfTimKiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tbTaiKhoan.setModel(new javax.swing.table.DefaultTableModel(
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
        tbTaiKhoan.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbTaiKhoan.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(tbTaiKhoan);

        btnQuayLai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnQuayLai.setText("Quay Lại");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        btnLamMoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnResetMK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnResetMK.setText("Reset mật khẩu");
        btnResetMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetMKActionPerformed(evt);
            }
        });

        btnTim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTim.setText("Tìm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnCapNhat)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa)
                        .addGap(18, 18, 18)
                        .addComponent(btnResetMK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLamMoi))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnQuayLai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTim)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txfTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuayLai)
                    .addComponent(btnTim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnCapNhat)
                    .addComponent(btnXoa)
                    .addComponent(btnLamMoi)
                    .addComponent(btnResetMK))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        new ThemTaiKhoanGiaoVu().setVisible(true);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int r = tbTaiKhoan.getSelectedRow();
        if (r == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn tài khoản muốn xóa", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            String tk = (String) tbTaiKhoan.getValueAt(r, 0);
            int confirm = JOptionPane.showConfirmDialog(QuanLyTaiKhoan.this, "Bạn có chắc muốn xóa tài khoản " + tk + " không?");
            if (confirm == JOptionPane.YES_OPTION) {
                if (TaiKhoanDAO.xoaTaiKhoan(tk)) {
                    JOptionPane.showMessageDialog(this, "Xóa tài khoản thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    defaultTableModel.setRowCount(0);
                    themDuLieu();
                }
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        String tk;
        int r = tbTaiKhoan.getSelectedRow();
        if (r == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn tài khoản muốn cập nhật", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            tk = (String) tbTaiKhoan.getValueAt(r, 0);
            new CapNhatThongTinGV(tk).setVisible(true);
        }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnResetMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetMKActionPerformed
        int r = tbTaiKhoan.getSelectedRow();
        if (r == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn tài khoản muốn reset mật khẩu", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            String tk = (String) tbTaiKhoan.getValueAt(r, 0);
            int confirm = JOptionPane.showConfirmDialog(QuanLyTaiKhoan.this, "Bạn có chắc muốn reset mật khẩu tài khoản " + tk + " không?");
            if (confirm == JOptionPane.YES_OPTION) {
                TaiKhoan rsTaiKhoan = TaiKhoanDAO.layThongTinTaiKhoan(tk);
                rsTaiKhoan.setMatKhau(rsTaiKhoan.getTaiKhoan());
                if (TaiKhoanDAO.capNhatThongTinTaiKhoan(rsTaiKhoan)) {
                    JOptionPane.showMessageDialog(this, "Reset mật khẩu tài khoản thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnResetMKActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        TaiKhoan tk = TaiKhoanDAO.layThongTinTaiKhoan(txfTimKiem.getText());
        if (tk != null) {
            defaultTableModel.setRowCount(0);
            defaultTableModel.addRow(new Object[]{tk.getTaiKhoan(), tk.getMatKhau(), 
                        tk.getChucDanh(), tk.getSoDienThoai(), tk.getEmail()});
        } else {
            defaultTableModel.setRowCount(0);
        }
    }//GEN-LAST:event_btnTimActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnResetMK;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbTaiKhoan;
    private javax.swing.JTextField txfTimKiem;
    // End of variables declaration//GEN-END:variables
}
