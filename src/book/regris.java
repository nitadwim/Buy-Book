/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;
//mengimport program agar bisa konek dengan SQL
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class regris extends javax.swing.JFrame {
private static Connection connec;
public static Statement st;
//KONEKSI DATABASE
private void data (){
try {
Class.forName("com.mysql.jdbc.Driver");
connec=DriverManager.getConnection("jdbc:mysql://localhost:3306/rincian?zeroDateTimeBehavior=convertToNull", "root", "");
st = connec.createStatement();
JOptionPane.showMessageDialog(null, "Tersambung");
} catch (Exception e) {
JOptionPane.showMessageDialog(null, "Gagal Memuat KeDatabase, Aktifkan Database Sebelum Memulai");
}
}
//clear isian
private void Clear(){
rnama.setText("");
rhp.setText("");
remail.setText("");
ralamat.setText("");
rpassword.setText("");
}
private String database="";
private String nama="", hp="", password="", alamat="",email="";


    /**
     * Creates new form regris
     */
    public regris() {
        initComponents();
        data();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        regrisnama = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rhp = new javax.swing.JTextField();
        remail = new javax.swing.JTextField();
        ralamat = new javax.swing.JTextField();
        rnama = new javax.swing.JTextField();
        rsave = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        rpassword = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel1.setText("Registrasi Akun Baru");

        jLabel2.setText("Nama");

        jLabel3.setText("No Hp");

        jLabel4.setText("Email");

        jLabel5.setText("Alamat");

        rnama.setToolTipText("");

        rsave.setText("Save");
        rsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsaveActionPerformed(evt);
            }
        });

        jLabel6.setText("Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rsave)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(rpassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addComponent(ralamat, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(remail, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(rhp, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(rnama, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(301, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rhp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(remail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ralamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(rsave)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsaveActionPerformed
        nama = String.valueOf(rnama.getText());
        hp= String.valueOf(rhp.getText());
        password = String.valueOf(rpassword.getText());
        alamat = String.valueOf(ralamat.getText());
        email= String.valueOf(remail.getText());
        
        //INPUT DATA KE DATABASE
try{

database = "INSERT INTO data (Nama, No Hp, Email, Alamat, Password) VALUE ('"+nama+"','"+hp+"','"+email+"','"+alamat+"','"+password+"')";
st=connec.createStatement();
st.execute(database);
Clear();
JOptionPane.showMessageDialog(null, "Data Disimpan");
} catch (Exception e) {
JOptionPane.showMessageDialog(null, "ERROR \n Data Gagal Disimpan"+e.getMessage());
}


    
    }//GEN-LAST:event_rsaveActionPerformed

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
            java.util.logging.Logger.getLogger(regris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(regris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(regris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(regris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new regris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField ralamat;
    private javax.swing.JTextField regrisnama;
    private javax.swing.JTextField remail;
    private javax.swing.JTextField rhp;
    private javax.swing.JTextField rnama;
    private javax.swing.JTextField rpassword;
    private javax.swing.JButton rsave;
    // End of variables declaration//GEN-END:variables
}
