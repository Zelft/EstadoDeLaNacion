package estadonacion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author XPC
 */
public class SanJose extends javax.swing.JDialog {

  /**
   * Creates new form SanJose
   */
  public SanJose(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    difuminarBotones();
    cargarImagen();
  }
  
  public SanJose(){
    initComponents();
    difuminarBotones();
    cargarImagen();
  }
  
    public void abrirInformacion(String canton){
      Informacion i = new Informacion("SanJose", canton);
      i.setVisible(true);
      this.dispose();  
  }
  
  public void cargarImagen(){
    informacion.setText("<html>Reporte Cantonal de Provincia San José<br/>"
            + "Lista de Provincias: <br/><br/>1. San José<br/>2. Escazú"
            + "<br/>3. Desamparados<br/>4. Puriscal<br/>5. Tarrazú<br/>6. Aserrí"
            + "<br/>7. Mora<br/>8. Goicoechea<br/>9. Santa Ana<br/>10. Alajuelita"
            + "<br/>11. Coronado<br/>12. Acosta<br/>13. Tibás"
            + "<br/>14. Moravia<br/>15. Montes de Oca<br/>16. Turrubares<br/>17. Dota"
            + "<br/>18. Curridabat<br/>19. Perez Zeledón<br/>20. León Cortés</html>");
    ImageIcon imagen;
    imagen = new ImageIcon("C:\\Users\\XPC\\Desktop\\EstadoNacion\\SanJose.png");
    mapa.setIcon(imagen);
  }
  
  public void difuminarBotones(){
    ArrayList<JButton> botones = new ArrayList<JButton>();
    botones.add(b1);
    botones.add(b2);
    botones.add(b3);
    botones.add(b4);
    botones.add(b5);
    botones.add(b6);
    botones.add(b7);
    botones.add(b8);
    botones.add(b9);
    botones.add(b10);
    botones.add(b11);
    botones.add(b12);
    botones.add(b13);
    botones.add(b14);
    botones.add(b15);
    botones.add(b16);
    botones.add(b17);
    botones.add(b18);
    botones.add(b19);
    botones.add(b20);
    for(JButton boton: botones){
      boton.setOpaque(false);
      boton.setContentAreaFilled(false);
      boton.setBorderPainted(false);
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

        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b13 = new javax.swing.JButton();
        b14 = new javax.swing.JButton();
        b15 = new javax.swing.JButton();
        b16 = new javax.swing.JButton();
        b17 = new javax.swing.JButton();
        b18 = new javax.swing.JButton();
        b19 = new javax.swing.JButton();
        b20 = new javax.swing.JButton();
        mapa = new javax.swing.JLabel();
        exit1 = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        informacion = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        Fondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        b1.setText("San José");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 90, -1));

        b2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        b2.setText("Escazú");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, -1, 20));

        b3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b3.setText("Desamparados");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, -1, -1));

        b4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b4.setText("Puriscal");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        b5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        b5.setText("Tarrazú");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        getContentPane().add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, -1, -1));

        b6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        b6.setText("Aserrí");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        getContentPane().add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 80, -1));

        b7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        b7.setText("Mora");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        getContentPane().add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, -1, -1));

        b8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        b8.setText("Goicoechea");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        getContentPane().add(b8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, -1, -1));

        b9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        b9.setText("Santa Ana");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        getContentPane().add(b9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, -1, -1));

        b10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        b10.setText("Alajuelita");
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });
        getContentPane().add(b10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));

        b11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        b11.setText("Vázques de Coronado");
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });
        getContentPane().add(b11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, -1, -1));

        b12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        b12.setText("Acosta");
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });
        getContentPane().add(b12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, -1, -1));

        b13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        b13.setText("Tibás");
        b13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b13ActionPerformed(evt);
            }
        });
        getContentPane().add(b13, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, -1, -1));

        b14.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        b14.setText("Moravia");
        b14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b14ActionPerformed(evt);
            }
        });
        getContentPane().add(b14, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, -1, 20));

        b15.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        b15.setText("Montes de Oca");
        b15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b15ActionPerformed(evt);
            }
        });
        getContentPane().add(b15, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, -1, -1));

        b16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b16.setText("Turrubares");
        b16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b16ActionPerformed(evt);
            }
        });
        getContentPane().add(b16, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));

        b17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b17.setText("Dota");
        b17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b17ActionPerformed(evt);
            }
        });
        getContentPane().add(b17, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, -1, -1));

        b18.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        b18.setText("Curridabat");
        b18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b18ActionPerformed(evt);
            }
        });
        getContentPane().add(b18, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, -1, 20));

        b19.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        b19.setText("Pérez Zeledón");
        b19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b19ActionPerformed(evt);
            }
        });
        getContentPane().add(b19, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 440, -1, -1));

        b20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b20.setText("León Cortés");
        b20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b20ActionPerformed(evt);
            }
        });
        getContentPane().add(b20, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, -1, -1));

        mapa.setIcon(new javax.swing.ImageIcon("C:\\Users\\XPC\\Desktop\\EstadoNacion\\SanJose.png")); // NOI18N
        getContentPane().add(mapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 690, 620));

        exit1.setBackground(new java.awt.Color(0, 204, 51));
        exit1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exit1.setForeground(new java.awt.Color(255, 255, 255));
        exit1.setText("Atrás");
        exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit1ActionPerformed(evt);
            }
        });
        getContentPane().add(exit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 70, 30));

        exit.setBackground(new java.awt.Color(153, 0, 0));
        exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("X");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, 50, 30));

        informacion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 490, 540));

        titulo.setFont(new java.awt.Font("NSimSun", 1, 58)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("SAN JOSÉ");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 400, 80));

        Fondo2.setIcon(new javax.swing.ImageIcon("C:\\Users\\XPC\\Desktop\\EstadoNacion\\blue.jpg")); // NOI18N
        getContentPane().add(Fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Provincias p = new Provincias();
        p.setVisible(true);
    }//GEN-LAST:event_exit1ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
        // TODO add your handling code here:
        abrirInformacion(b11.getText());
    }//GEN-LAST:event_b11ActionPerformed

    private void b13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b13ActionPerformed
        // TODO add your handling code here:
        abrirInformacion(b13.getText());
    }//GEN-LAST:event_b13ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        abrirInformacion(b1.getText());
    }//GEN-LAST:event_b1ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
        abrirInformacion(b8.getText());
    }//GEN-LAST:event_b8ActionPerformed

    private void b14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b14ActionPerformed
        // TODO add your handling code here:
        abrirInformacion(b14.getText());
    }//GEN-LAST:event_b14ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        // TODO add your handling code here:
        abrirInformacion(b9.getText());
    }//GEN-LAST:event_b9ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        abrirInformacion(b2.getText());
    }//GEN-LAST:event_b2ActionPerformed

    private void b15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b15ActionPerformed
        // TODO add your handling code here:
        abrirInformacion(b15.getText());
    }//GEN-LAST:event_b15ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        // TODO add your handling code here:
        abrirInformacion(b7.getText());
    }//GEN-LAST:event_b7ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
        // TODO add your handling code here:
        abrirInformacion(b10.getText());
    }//GEN-LAST:event_b10ActionPerformed

    private void b18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b18ActionPerformed
        // TODO add your handling code here:
        abrirInformacion(b18.getText());
    }//GEN-LAST:event_b18ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        abrirInformacion(b3.getText());
    }//GEN-LAST:event_b3ActionPerformed

    private void b16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b16ActionPerformed
        // TODO add your handling code here:
        abrirInformacion(b16.getText());
    }//GEN-LAST:event_b16ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
        abrirInformacion(b4.getText());
    }//GEN-LAST:event_b4ActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
        // TODO add your handling code here:
        abrirInformacion(b12.getText());
    }//GEN-LAST:event_b12ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
        abrirInformacion(b6.getText());
    }//GEN-LAST:event_b6ActionPerformed

    private void b20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b20ActionPerformed
        // TODO add your handling code here:
        abrirInformacion(b20.getText());
    }//GEN-LAST:event_b20ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
        abrirInformacion(b5.getText());
    }//GEN-LAST:event_b5ActionPerformed

    private void b17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b17ActionPerformed
        // TODO add your handling code here:
        abrirInformacion(b17.getText());
    }//GEN-LAST:event_b17ActionPerformed

    private void b19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b19ActionPerformed
        // TODO add your handling code here:
        abrirInformacion(b19.getText());
    }//GEN-LAST:event_b19ActionPerformed

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
      java.util.logging.Logger.getLogger(SanJose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(SanJose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(SanJose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(SanJose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the dialog */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        SanJose dialog = new SanJose(new javax.swing.JFrame(), true);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
          @Override
          public void windowClosing(java.awt.event.WindowEvent e) {
            System.exit(0);
          }
        });
        dialog.setVisible(true);
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo2;
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b13;
    private javax.swing.JButton b14;
    private javax.swing.JButton b15;
    private javax.swing.JButton b16;
    private javax.swing.JButton b17;
    private javax.swing.JButton b18;
    private javax.swing.JButton b19;
    private javax.swing.JButton b2;
    private javax.swing.JButton b20;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton exit;
    private javax.swing.JButton exit1;
    private javax.swing.JLabel informacion;
    private javax.swing.JLabel mapa;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
