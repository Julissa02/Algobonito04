/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;
import clasesmetodos.Usuario_metodos;
import clases.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class Usuarios extends javax.swing.JInternalFrame {
Usuario_metodos umdao= new Usuario_metodos();
Usuario um=new Usuario();
Validaciones valida=new Validaciones();
Otros otros= new Otros();
    /**
     * Creates new form Usuarios
     */
    public Usuarios() {
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

        jPanel1 = new javax.swing.JPanel();
        txtnombrecompleto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtcontraseña = new javax.swing.JPasswordField();
        cbtipo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txttipo = new javax.swing.JTextField();
        btnregistrar = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtnombrecompleto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtnombrecompleto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombrecompleto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombrecompletoKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NOMBRE COMPLETO");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("USUARIO");

        txtusuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtusuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        txtusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtusuarioKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TIPO DE USUARIO");

        txtcontraseña.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtcontraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcontraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcontraseñaKeyTyped(evt);
            }
        });

        cbtipo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONA:", "ADMINISTRADOR", "EMPLEADO" }));
        cbtipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtipoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CONTRASEÑA");

        txttipo.setEditable(false);
        txttipo.setBackground(new java.awt.Color(255, 255, 255));
        txttipo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txttipo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnregistrar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnregistrar.setText("REGISTRAR USUARIO");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 16, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnombrecompleto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtusuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcontraseña, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txttipo, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(cbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtnombrecompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(btnregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 465, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void cbtipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtipoActionPerformed
      String t=(String) cbtipo.getSelectedItem();
     if(t.equals("SELECCIONA:")){
        txttipo.setText(null);
        // btnregistrar.setVisible(false);
    }
     else{
          txttipo.setText(t);
        //  btnregistrar.setVisible(true);
     }
     
    }//GEN-LAST:event_cbtipoActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
    try{
            String va[]={"","","",""};
            String me="N";
        String nomc= otros.novacio(txtnombrecompleto.getText());
       String tipo=otros.novacio(txttipo.getText());
        String con=txtcontraseña.getText();
        
         String usa=txtusuario.getText();
     int tip=cbtipo.getSelectedIndex();
    
   //     JOptionPane.showMessageDialog(null, me);
        
        if(valida.vtexto1(nomc)==false){
            me="ESCRIBE UN NOMBRE VALIDO";
            va[0]=me;
        }
        if(usa.length()<8){
            me="ESCRIBE ALMENOS 8 CARACTERES EN EL USUARIO";
            va[1]=me;
        }
        if(con.length()<8){
            me="ESCRIBE ALMENOS 8 CARACTERES EN LA CONTRASEÑA";
            va[2]=me;
        }
        
      if(valida.vtexto1(tipo)==false){
            me="SELECCIONA UN TIPO DE USUARIO";
            va[3]=me;
        }
        
    
    if(me.equals("N")){
    um.setNombre_completo(nomc);
    um.setNombre_us(usa);
    um.setContraseña(con);
    um.setTipo_usuario(tip);
    umdao.guardar_usuario(um);
    limpiar();
    JOptionPane.showMessageDialog(null,"USUARIO REGISTRADO CORRECTAMENTE");
    }else{
        JOptionPane.showMessageDialog(null,va);
    }
    
    }catch(Exception e){
            System.out.println(e);
}
    
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void txtnombrecompletoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombrecompletoKeyTyped
        valida.texto(evt, txtnombrecompleto, 35);
    }//GEN-LAST:event_txtnombrecompletoKeyTyped

    private void txtcontraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontraseñaKeyTyped
      valida.tamañocarecteres(evt, txtcontraseña,10);
    }//GEN-LAST:event_txtcontraseñaKeyTyped

    private void txtusuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuarioKeyTyped
         valida.tamañocarecteres(evt,  txtusuario,10);
    }//GEN-LAST:event_txtusuarioKeyTyped

    void limpiar(){
        txtnombrecompleto.setText(null);
        txtusuario.setText(null);
        txtcontraseña.setText(null);
        txttipo.setText(null);
        cbtipo.setSelectedIndex(0);
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnregistrar;
    private javax.swing.JComboBox<String> cbtipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtcontraseña;
    private javax.swing.JTextField txtnombrecompleto;
    private javax.swing.JTextField txttipo;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
