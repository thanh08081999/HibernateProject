import pojo.TaiKhoan;

public class ChucNangGiaoVu extends javax.swing.JFrame {
    TaiKhoan taiKhoan;
    /**
     * Creates new form ChucNangGiaoVu
     * @param taiKhoan
     */
    public ChucNangGiaoVu(TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGVQLTK = new javax.swing.JButton();
        btnGVQLMH = new javax.swing.JButton();
        btnGVQLLH = new javax.swing.JButton();
        btnGVQLHK = new javax.swing.JButton();
        lbGiaoVu = new javax.swing.JLabel();
        btnGVQLKDKHP = new javax.swing.JButton();
        btnGVQLKQDKHP = new javax.swing.JButton();
        btnQuayLai = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnGVTTTK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnGVQLTK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGVQLTK.setText("Quản lý tài khoản");
        btnGVQLTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGVQLTKActionPerformed(evt);
            }
        });

        btnGVQLMH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGVQLMH.setText("Quản lý môn học");
        btnGVQLMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGVQLMHActionPerformed(evt);
            }
        });

        btnGVQLLH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGVQLLH.setText("Quản lý lớp học");
        btnGVQLLH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGVQLLHActionPerformed(evt);
            }
        });

        btnGVQLHK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGVQLHK.setText("Quản lý học kì");
        btnGVQLHK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGVQLHKActionPerformed(evt);
            }
        });

        lbGiaoVu.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbGiaoVu.setText("GIÁO VỤ");

        btnGVQLKDKHP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGVQLKDKHP.setText("Quản lý kì đăng ký học phần");
        btnGVQLKDKHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGVQLKDKHPActionPerformed(evt);
            }
        });

        btnGVQLKQDKHP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGVQLKQDKHP.setText("Xem kết quả đăng kí học phần");
        btnGVQLKQDKHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGVQLKQDKHPActionPerformed(evt);
            }
        });

        btnQuayLai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnQuayLai.setText("Quay lại");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        btnThoat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnGVTTTK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGVTTTK.setText("Thông tin tài khoản");
        btnGVTTTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGVTTTKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnQuayLai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(lbGiaoVu)
                .addGap(183, 183, 183))
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnGVQLKDKHP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGVQLHK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGVQLLH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGVQLMH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGVQLTK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGVQLKQDKHP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGVTTTK, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnThoat)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lbGiaoVu))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnQuayLai)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(btnGVTTTK)
                .addGap(18, 18, 18)
                .addComponent(btnGVQLTK)
                .addGap(18, 18, 18)
                .addComponent(btnGVQLMH)
                .addGap(18, 18, 18)
                .addComponent(btnGVQLLH)
                .addGap(18, 18, 18)
                .addComponent(btnGVQLHK)
                .addGap(18, 18, 18)
                .addComponent(btnGVQLKDKHP)
                .addGap(18, 18, 18)
                .addComponent(btnGVQLKQDKHP)
                .addGap(39, 39, 39)
                .addComponent(btnThoat)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGVQLTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGVQLTKActionPerformed
        new QuanLyTaiKhoan(taiKhoan).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGVQLTKActionPerformed

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        new DangNhap().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQuayLaiActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnGVTTTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGVTTTKActionPerformed
        new ThongTinTaiKhoan(taiKhoan).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGVTTTKActionPerformed

    private void btnGVQLMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGVQLMHActionPerformed
        new QuanLyMonHoc(taiKhoan).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGVQLMHActionPerformed

    private void btnGVQLHKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGVQLHKActionPerformed
        new QuanLyHocKi(taiKhoan).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGVQLHKActionPerformed

    private void btnGVQLLHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGVQLLHActionPerformed
        new QuanLyLopHoc(taiKhoan).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGVQLLHActionPerformed

    private void btnGVQLKDKHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGVQLKDKHPActionPerformed
        new QuanLyKiDKHP(taiKhoan).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGVQLKDKHPActionPerformed

    private void btnGVQLKQDKHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGVQLKQDKHPActionPerformed
        new DanhSachSinhVienDangKyHocPhan(taiKhoan).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGVQLKQDKHPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGVQLHK;
    private javax.swing.JButton btnGVQLKDKHP;
    private javax.swing.JButton btnGVQLKQDKHP;
    private javax.swing.JButton btnGVQLLH;
    private javax.swing.JButton btnGVQLMH;
    private javax.swing.JButton btnGVQLTK;
    private javax.swing.JButton btnGVTTTK;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel lbGiaoVu;
    // End of variables declaration//GEN-END:variables
}
