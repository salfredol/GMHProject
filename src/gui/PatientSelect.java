package gui;
import java.sql.*;
import dbutils.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;

public class PatientSelect extends javax.swing.JFrame {

    /**
     * Creates new form PatientSelect
     */
    public PatientSelect() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_demographics = new javax.swing.JTable();
        lbl_patientid = new javax.swing.JLabel();
        lbl_patientname = new javax.swing.JLabel();
        btn_retrieveall = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btn_toGMH = new javax.swing.JButton();
        btn_toSOB = new javax.swing.JButton();
        btn_toAT = new javax.swing.JButton();
        btn_formlock = new javax.swing.JButton();
        btn_toDEM = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        btn_lastsearch = new javax.swing.JButton();
        txt_lastsearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_demographics.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Patient ID", "Last Name", "First Name"
            }
        ));
        tbl_demographics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_demographicsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_demographics);

        lbl_patientid.setText("ID: ");

        lbl_patientname.setText("Current Patient:");

        btn_retrieveall.setText("RETRIEVE ALL PATIENTS");
        btn_retrieveall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_retrieveallActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));

        btn_toGMH.setText("GMH");
        btn_toGMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_toGMHActionPerformed(evt);
            }
        });

        btn_toSOB.setText("Shortness of Breath");

        btn_toAT.setText("Activities Tolerance");
        btn_toAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_toATActionPerformed(evt);
            }
        });

        btn_formlock.setText("EDIT MODE");
        btn_formlock.setName("btn_formlock"); // NOI18N
        btn_formlock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_formlockActionPerformed(evt);
            }
        });

        btn_toDEM.setText("Demographics");
        btn_toDEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_toDEMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_toGMH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_toAT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_toSOB, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_formlock, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btn_toDEM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btn_toAT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_toSOB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_toGMH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_toDEM)
                .addGap(18, 18, 18)
                .addComponent(btn_formlock)
                .addContainerGap(258, Short.MAX_VALUE))
        );

        jLabel23.setFont(new java.awt.Font("Bahnschrift", 0, 48)); // NOI18N
        jLabel23.setText("PATIENT SELECT");

        btn_lastsearch.setText("Search by Last Name");
        btn_lastsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lastsearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_patientid, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_lastsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_lastsearch))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btn_retrieveall, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_patientname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(18, Short.MAX_VALUE)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_lastsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_lastsearch))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_retrieveall)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_patientname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_patientid)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_demographicsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_demographicsMouseClicked
        int selectedRow = tbl_demographics.getSelectedRow();
        if (selectedRow != -1)
        {
            String pidStr = tbl_demographics.getValueAt(selectedRow, 0).toString();
            int pidInt = Integer.parseInt(pidStr);
            GlobalData.patientID = pidInt;
            lbl_patientname.setText(
                "Current Patient: " + tbl_demographics.getValueAt(selectedRow, 1).toString()
                + ", " + tbl_demographics.getValueAt(selectedRow, 2).toString() );

            GlobalData.patientName = tbl_demographics.getValueAt(selectedRow, 1).toString()
            + ", " + tbl_demographics.getValueAt(selectedRow, 2).toString();
            
            lbl_patientid.setText("ID: " + pidStr);
            System.out.println("DEBUG: Clicked Patient ID: " + pidStr);

            try
            {
                Connection conn = GlobalData.ConnectToDB("root", "password");
                ResultSet rs = DBUtilsPatient.GetPatient_FromID(conn, pidInt);
                
                conn.close();
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage() );
            }
        }
    }//GEN-LAST:event_tbl_demographicsMouseClicked

    private void btn_retrieveallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_retrieveallActionPerformed
        try
        {
            Connection conn = GlobalData.ConnectToDB("root", "password");
            ResultSet rs = DBUtilsPatient.GetAllPatients(conn);

            DefaultTableModel tbl = new DefaultTableModel();
            tbl.setColumnCount(3);
            tbl.setColumnIdentifiers(new String[] {"Patient ID", "Last Name", "First Name"});
            while(rs.next() )
            {
                String tbData[] = {rs.getString(1), rs.getString(2), rs.getString(3) };
                tbl.addRow(tbData);
            }
            tbl_demographics.setModel(tbl);
            conn.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage() );
        }
    }//GEN-LAST:event_btn_retrieveallActionPerformed

    private void btn_toGMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_toGMHActionPerformed
          //UNCOMMENT AFTER INTEGRATING GMH FORM
          
//        GeneralMedicalHistory gmhFrame = new GeneralMedicalHistory();
//        gmhFrame.setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_btn_toGMHActionPerformed

    private void btn_formlockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_formlockActionPerformed
        boolean editMode = btn_formlock.getText().equals("VIEW MODE");
        DBUtilsGeneral.toggleFormMode(getContentPane(), editMode);
    }//GEN-LAST:event_btn_formlockActionPerformed

    private void btn_lastsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lastsearchActionPerformed
        try
        {
            Connection conn = GlobalData.ConnectToDB("root", "password");
            ResultSet rs = DBUtilsPatient.GetPatient_LastName(conn, txt_lastsearch.getText());

            DefaultTableModel tbl = new DefaultTableModel();
            tbl.setColumnCount(3);
            tbl.setColumnIdentifiers(new String[] {"Patient ID", "Last Name", "First Name"});

            while(rs.next() )
            {
                String tbData[] = {rs.getString(1), rs.getString(2), rs.getString(3) };
                tbl.addRow(tbData);
            }
            tbl_demographics.setModel(tbl);
            conn.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage() );
        }
    }//GEN-LAST:event_btn_lastsearchActionPerformed

    private void btn_toDEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_toDEMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_toDEMActionPerformed

    private void btn_toATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_toATActionPerformed
        ActivityTolerance atFrame = new ActivityTolerance(); 
        atFrame.setVisible(true); 
        this.dispose(); 
    }//GEN-LAST:event_btn_toATActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PatientSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientSelect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_formlock;
    private javax.swing.JButton btn_lastsearch;
    private javax.swing.JButton btn_retrieveall;
    private javax.swing.JButton btn_toAT;
    private javax.swing.JButton btn_toDEM;
    private javax.swing.JButton btn_toGMH;
    private javax.swing.JButton btn_toSOB;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_patientid;
    private javax.swing.JLabel lbl_patientname;
    private javax.swing.JTable tbl_demographics;
    private javax.swing.JTextField txt_lastsearch;
    // End of variables declaration//GEN-END:variables
}
