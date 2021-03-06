
import dao.HocKiDAO;
import dao.KiDKHPDAO;
import dao.MonHocDAO;
import dao.SVDKHPDAO;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pojo.GiaoVien;
import pojo.HocKi;
import pojo.IDHocKi;
import pojo.IDSVDKHP;
import pojo.KiDKHP;
import pojo.MonHoc;
import pojo.PhongHoc;
import pojo.SVDKHP;
import pojo.TaiKhoan;


public class KetQuaDangKyHocPhan extends javax.swing.JFrame {
    TaiKhoan taiKhoan;
    DefaultTableModel defaultTableModel;
    /**
     * Creates new form KetQuaDangKyHocPhan
     * @param taiKhoan
     */
    public KetQuaDangKyHocPhan(TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
        initComponents();
        defaultTableModel = (DefaultTableModel)tbKQDKHP.getModel();
        List<HocKi> hk = HocKiDAO.layThongTinHocKiHienTai();
        HocKi hkht = hk.get(0);
        IDHocKi idhk = hkht.getIdHocKi();
        KiDKHP ki = KiDKHPDAO.layThongTinKiDKHP(idhk);
        lbNgay.setText(String.valueOf(ki.getNgayKT()));
        themDuLieu();
    }
    
    private void themDuLieu() {
        List<SVDKHP> dshpsvdk = SVDKHPDAO.layDanhSachSVDKHP();
        
        dshpsvdk.forEach(svdkhp -> {
            
            IDSVDKHP idSVDKHP = svdkhp.getIdSVDKHP();
            if (idSVDKHP.getMaSinhVien().equals(taiKhoan.getTaiKhoan())) {
                MonHoc mh = MonHocDAO.layThongTinMonHoc(idSVDKHP.getMaMonHoc());
                GiaoVien gv = svdkhp.getGiaoVien();
                PhongHoc ph = svdkhp.getPhongHoc();
                defaultTableModel.addRow(new Object[]{mh.getMaMonHoc(), mh.getTenMonHoc(),
                mh.getSoTinChi(), gv.getTenGiaoVien(), ph.getMaPhong(), svdkhp.getThu(), svdkhp.getCaHoc()});
            }
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
        tbKQDKHP = new javax.swing.JTable();
        btnXoa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbNgay = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnQuayLai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnQuayLai.setText("Quay l???i");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        tbKQDKHP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbKQDKHP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "M?? m??n h???c", "T??n m??n h???c", "S??? t??n ch???", "Gi??o vi??n", "Ph??ng h???c", "Th???", "Ca h???c", "Ch???n"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbKQDKHP.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbKQDKHP.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tbKQDKHP);
        if (tbKQDKHP.getColumnModel().getColumnCount() > 0) {
            tbKQDKHP.getColumnModel().getColumn(0).setPreferredWidth(70);
            tbKQDKHP.getColumnModel().getColumn(1).setPreferredWidth(280);
            tbKQDKHP.getColumnModel().getColumn(2).setPreferredWidth(70);
            tbKQDKHP.getColumnModel().getColumn(3).setPreferredWidth(110);
            tbKQDKHP.getColumnModel().getColumn(4).setPreferredWidth(70);
            tbKQDKHP.getColumnModel().getColumn(5).setPreferredWidth(70);
            tbKQDKHP.getColumnModel().getColumn(6).setPreferredWidth(70);
            tbKQDKHP.getColumnModel().getColumn(7).setPreferredWidth(30);
        }

        btnXoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXoa.setText("X??a");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Ng??y k???t th??c k?? ????ng k??:");

        lbNgay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNgay.setText("ng??y");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 922, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnXoa)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnQuayLai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuayLai)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNgay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnXoa)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        new ChucNangSinhVien(taiKhoan).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQuayLaiActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        List<HocKi> hk = HocKiDAO.layThongTinHocKiHienTai();
        HocKi hkht = hk.get(0);
        IDHocKi idhk = hkht.getIdHocKi();
        KiDKHP ki = KiDKHPDAO.layThongTinKiDKHP(idhk);
        Date ngayHT = Date.valueOf(LocalDate.now());
        
        if (ki.getNgayKT().compareTo(ngayHT) > 0) {
            for (int i = 0; i < tbKQDKHP.getRowCount(); i++) {
                if (String.valueOf(tbKQDKHP.getValueAt(i, 7)).equals("true")){
                    IDSVDKHP idsvdkhp = new IDSVDKHP(taiKhoan.getTaiKhoan(), String.valueOf(tbKQDKHP.getValueAt(i, 0)));
                    SVDKHPDAO.xoaSVDKHP(idsvdkhp);
                }
            }
        }
        JOptionPane.showMessageDialog(this, "X??a th??nh c??ng", "Th??ng b??o", JOptionPane.INFORMATION_MESSAGE);
        defaultTableModel.setRowCount(0);
        themDuLieu();
    }//GEN-LAST:event_btnXoaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbNgay;
    private javax.swing.JTable tbKQDKHP;
    // End of variables declaration//GEN-END:variables
}
