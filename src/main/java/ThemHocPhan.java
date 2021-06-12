
import dao.GiaoVienDAO;
import dao.HocPhanDAO;
import dao.MonHocDAO;
import dao.PhongHocDAO;
import javax.swing.JOptionPane;
import pojo.GiaoVien;
import pojo.HocPhan;
import pojo.IDHocPhan;
import pojo.MonHoc;


public class ThemHocPhan extends javax.swing.JFrame {
    
    /**
     * Creates new form ThemHocPhan
     */
    public ThemHocPhan() {
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

        btnQuayLai = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txfMaMonHoc = new javax.swing.JTextField();
        txfMaGiaoVien = new javax.swing.JTextField();
        txfPhongHoc = new javax.swing.JTextField();
        cbbThu = new javax.swing.JComboBox<>();
        cbbCa = new javax.swing.JComboBox<>();
        txfSoSlot = new javax.swing.JTextField();
        btnXacNhan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnQuayLai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnQuayLai.setText("Quay lại");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("THÊM HỌC PHẦN");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Mã môn học:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Mã giáo viên:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Phòng học:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Ngày trong tuần:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Ca học:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Số slot:");

        txfMaMonHoc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txfMaGiaoVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txfPhongHoc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cbbThu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbbThu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thứ hai", "Thứ ba", "Thứ tư", "Thứ năm", "Thứ sáu", "Thứ bảy", "Chủ nhật" }));

        cbbCa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbbCa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7:30-9:30", "9:30-11:30", "13:30-15:30", "15:30-17:30" }));

        txfSoSlot.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnXacNhan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXacNhan.setText("Xác nhận");
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnQuayLai))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txfMaGiaoVien, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(54, 54, 54)
                                    .addComponent(txfMaMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txfPhongHoc, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                                        .addComponent(cbbThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbbCa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txfSoSlot)))))))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(177, 177, 177))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnXacNhan)
                        .addGap(227, 227, 227))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnQuayLai)
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txfMaMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txfMaGiaoVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txfPhongHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbbThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbbCa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txfSoSlot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(btnXacNhan)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnQuayLaiActionPerformed

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
        if (MonHocDAO.layThongTinMonHoc(txfMaMonHoc.getText()) != null) {
            if (GiaoVienDAO.layThongTinGiaoVien(txfMaGiaoVien.getText()) != null) {
                if (PhongHocDAO.layThongTinPhongHoc(txfPhongHoc.getText()) != null) {
                    try {
                        IDHocPhan idhp = new IDHocPhan(String.valueOf(txfPhongHoc.getText()), 
                                String.valueOf(cbbThu.getSelectedItem()), String.valueOf(cbbCa.getSelectedItem()));
                        if (HocPhanDAO.layThongTinHocPhan(idhp) == null) {
                            int soSlot = Integer.parseInt(txfSoSlot.getText());
                            MonHoc mh = MonHocDAO.layThongTinMonHoc(txfMaMonHoc.getText());
                            GiaoVien gv = GiaoVienDAO.layThongTinGiaoVien(txfMaGiaoVien.getText());
                            HocPhan hp = new HocPhan(idhp, mh, gv, soSlot);
                            HocPhanDAO.themHocPhan(hp);
                            JOptionPane.showMessageDialog(this, "Thêm học phần thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                            this.dispose();
                        } else {
                            JOptionPane.showMessageDialog(this, "Phòng " + String.valueOf(txfPhongHoc.getText()) + 
                                    ", " + String.valueOf(cbbThu.getSelectedItem()) + 
                                    ", ca " + String.valueOf(cbbCa.getSelectedItem()) + 
                                    " đã được sử dụng cho môn học khác", "Thông báo", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (NumberFormatException ex){
                        JOptionPane.showMessageDialog(this, "Số slot phải là một số nguyên", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else 
                    JOptionPane.showMessageDialog(this, "Phòng học không được trống", "Thông báo", JOptionPane.ERROR_MESSAGE);
            } else 
                JOptionPane.showMessageDialog(this, "Giáo viên không được trống", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else
            JOptionPane.showMessageDialog(this, "Mã môn học không được trống", "Thông báo", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnXacNhanActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JComboBox<String> cbbCa;
    private javax.swing.JComboBox<String> cbbThu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txfMaGiaoVien;
    private javax.swing.JTextField txfMaMonHoc;
    private javax.swing.JTextField txfPhongHoc;
    private javax.swing.JTextField txfSoSlot;
    // End of variables declaration//GEN-END:variables
}
