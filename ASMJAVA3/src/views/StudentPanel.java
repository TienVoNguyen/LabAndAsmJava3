/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.StudentDAO;
import database.MyConnection;
import helper.ImageHelper;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableModel;
import models.Student;
import validation.MyValidation;

/**
 *
 * @author NTV
 */
public class StudentPanel extends javax.swing.JPanel {

    private byte[] personalImg;

    /**
     * Creates new form StudentPanel
     */
    public StudentPanel() {
        initComponents();
        fillToTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSV = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblImg = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        radNam = new javax.swing.JRadioButton();
        radNu = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDiachi = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        txtIDSV = new javax.swing.JTextField();
        txtFullname = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        btnMoHinh = new javax.swing.JButton();

        tblSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã SV", "Họ tên", "Email", "Số ĐT", "Giới tính", "Địa chỉ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSVMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSV);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setLayout(new java.awt.GridLayout(2, 2, 20, 20));

        btnNew.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utillies/icons/Add.png"))); // NOI18N
        btnNew.setText("New");
        btnNew.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jPanel5.add(btnNew);

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utillies/icons/Save.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel5.add(btnSave);

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utillies/icons/Delete.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setToolTipText("");
        btnDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel5.add(btnDelete);

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utillies/icons/Edit.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel5.add(btnUpdate);

        jPanel1.setLayout(new java.awt.GridLayout(6, 1, 0, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Ma SV:");
        jPanel1.add(jLabel2);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Họ tên:");
        jPanel1.add(jLabel4);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Email:");
        jPanel1.add(jLabel3);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Số ĐT:");
        jPanel1.add(jLabel5);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Giới Tính:");
        jPanel1.add(jLabel6);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Địa chỉ:");
        jPanel1.add(jLabel7);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setForeground(java.awt.Color.blue);
        jLabel1.setText("Quản Lý Sinh Viên");

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new java.awt.GridLayout(1, 1));

        lblImg.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImg.setToolTipText("");
        jPanel4.add(lblImg);

        jPanel3.setLayout(new java.awt.GridLayout(1, 2, 40, 0));

        buttonGroup1.add(radNam);
        radNam.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        radNam.setSelected(true);
        radNam.setText("Nam");
        radNam.setAlignmentX(0.5F);
        radNam.setMaximumSize(new java.awt.Dimension(100, 50));
        radNam.setMinimumSize(new java.awt.Dimension(100, 50));
        radNam.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/utillies/icons/Boy.png"))); // NOI18N
        jPanel3.add(radNam);

        buttonGroup1.add(radNu);
        radNu.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        radNu.setText("Nữ");
        radNu.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/utillies/icons/Girl.png"))); // NOI18N
        jPanel3.add(radNu);

        txtDiachi.setColumns(20);
        txtDiachi.setRows(5);
        jScrollPane1.setViewportView(txtDiachi);

        jPanel2.setLayout(new java.awt.GridLayout(4, 1, 0, 7));

        txtIDSV.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel2.add(txtIDSV);

        txtFullname.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel2.add(txtFullname);

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel2.add(txtEmail);

        txtSDT.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel2.add(txtSDT);

        btnMoHinh.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnMoHinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utillies/icons/Open file.png"))); // NOI18N
        btnMoHinh.setText("Mở hình");
        btnMoHinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoHinhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addComponent(btnMoHinh))))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMoHinh))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        txtIDSV.setText("");
        txtFullname.setText("");
        txtDiachi.setText("");
        txtEmail.setText("");
        txtSDT.setText("");
        personalImg = null;
        ImageIcon icon = new ImageIcon(getClass()
                .getResource("/utillies/icons/Open file.png"));
        lblImg.setIcon(icon);

    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            if (checkValid()) return;
            Student st = new Student();
            st.setMasv(txtIDSV.getText());
            st.setName(txtFullname.getText());
            st.setEmail(txtEmail.getText());
            st.setDiachi(txtDiachi.getText());
            st.setSdt(txtSDT.getText());
            st.setHinh(personalImg);
            if (radNam.isSelected()) {
                st.setGt(true);
            } else {
                st.setGt(false);
            }
            StudentDAO dao = new StudentDAO();
            if (dao.insert(st)) {
                JOptionPane.showMessageDialog(null, "Sinh viên đã được lưu!");
                fillToTable();
                btnNewActionPerformed(evt);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lưu sinh viên thất bại!");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        try {
            if (checkValid()) return;
            Student st = new Student();
            st.setMasv(txtIDSV.getText());
            st.setName(txtFullname.getText());
            st.setEmail(txtEmail.getText());
            st.setDiachi(txtDiachi.getText());
            st.setSdt(txtSDT.getText());
            st.setHinh(personalImg);
            if (radNam.isSelected()) {
                st.setGt(true);
            } else {
                st.setGt(false);
            }
            StudentDAO dao = new StudentDAO();
            if (ques("Bạn có muốn cập nhật sinh viên này?")) return;
            if (dao.update(st)) {
                JOptionPane.showMessageDialog(null, "Sinh viên đã được cập nhật!");
                fillToTable();
                btnNewActionPerformed(evt);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Cập nhật sinh viên thất bại!");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            if (MyValidation.isEmpty(txtIDSV, "Nhập id sinh viên cần xóa"));
            StudentDAO dao = new StudentDAO();
            if (ques("Bạn có muốn xóa sinh viên này?")) return;
            if (dao.delete(txtIDSV.getText())) {
                JOptionPane.showMessageDialog(null, "Sinh viên đã được xóa!");
                fillToTable();
                btnNewActionPerformed(evt);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Xóa sinh viên thất bại!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSVMouseClicked
        // TODO add your handling code here:
        int chon = tblSV.getSelectedRow();
        if (chon >= 0) {
            try {
                String id = (String) tblSV.getValueAt(chon, 0);
                Student st = StudentDAO.findByID(id);
                if (st != null) {
                    txtIDSV.setText(id);
                    txtFullname.setText(st.getName());
                    txtDiachi.setText(st.getDiachi());
                    txtEmail.setText(st.getEmail());
                    txtSDT.setText(st.getSdt());
                    if (st.isGt()) {
                        radNam.setSelected(true);
                    } else {
                        radNu.setSelected(true);
                    }
                    if (st.getHinh() != null) {
                        try {
                            Image img = ImageHelper.createImageFromByteArray(st.getHinh(), "jpg");
                            lblImg.setIcon(new ImageIcon(img));
                            personalImg = st.getHinh();
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    } else {
                        personalImg = st.getHinh();
                        ImageIcon icon = new ImageIcon(getClass()
                                .getResource("/utillies/icons/Open file.png"));
                        lblImg.setIcon(icon);
                        
                    }
                }
            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }
    }//GEN-LAST:event_tblSVMouseClicked

    private void btnMoHinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoHinhActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                if (f.isDirectory()) {
                    return true;
                } else {
                    return f.getName().toLowerCase().endsWith(".jpg");
                }
            }

            @Override
            public String getDescription() {
                return "Image File (*.jpg)";
            }
        });
        if (chooser.showOpenDialog(null) == JFileChooser.CANCEL_OPTION) {
            return;
        }

        File file = chooser.getSelectedFile();
        try {
            ImageIcon icon = new ImageIcon(file.getPath());
            Image img = ImageHelper.resize(icon.getImage(), 140, 160);
            ImageIcon resizedIcon = new ImageIcon(img);
            lblImg.setIcon(resizedIcon);
            lblImg.setText("");
            personalImg = ImageHelper.toArrayByte(img, "jpg");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnMoHinhActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnMoHinh;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblImg;
    private javax.swing.JRadioButton radNam;
    private javax.swing.JRadioButton radNu;
    private javax.swing.JTable tblSV;
    private javax.swing.JTextArea txtDiachi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JTextField txtIDSV;
    private javax.swing.JTextField txtSDT;
    // End of variables declaration//GEN-END:variables
    private void fillToTable() {
        DefaultTableModel tblModel = (DefaultTableModel) tblSV.getModel();
        tblModel.setRowCount(0);
        try {
            ArrayList<Student> lst = StudentDAO.viewAll();
            for (Student st : lst) {
                String gt = st.isGt() ? "Nam" : "Nữ";
                Object[] addRow = {
                    st.getMasv(), st.getName(), st.getEmail(), st.getSdt(), gt,
                    st.getDiachi()
                };
                tblModel.addRow(addRow);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private boolean checkValid() {
        if (MyValidation.isEmpty(txtIDSV, "Nhập mã sinh viên")) return true;
        if (MyValidation.isEmpty(txtFullname, "Nhập họ tên sinh viên")) return true;
        if (MyValidation.isEmpty(txtEmail, "Nhập email sinh viên")) return true;
        if (MyValidation.isNotEmail(txtEmail, "Nhập đúng email sinh viên ")) return true;
        if (MyValidation.isEmpty(txtSDT, "Nhập sdt sinh viên")) return true;
        if (MyValidation.isNotSDT(txtSDT, "Nhập đúng sdt sinh viên")) return true;
        if (MyValidation.isEmpty(txtDiachi, "Nhập sdt sinh viên")) return true;
        return false;
    }
    private boolean ques(String msg) {
        int chon = JOptionPane.showConfirmDialog(null, msg, "Question", JOptionPane.YES_NO_OPTION);
        if (chon == JOptionPane.YES_OPTION) {
            return false;
        }
        return true;
    }
}
