/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Calculator1;

/**
 *
 * @author bulit
 */
public class Calculator1 extends javax.swing.JFrame {

    /**
     * Creates new form Calculator1
     */
    double enternum1;
    double enternum2;
    double result;
    String op ;
    public Calculator1() {
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

        jComboBox1 = new javax.swing.JComboBox<>();
        jtxt = new javax.swing.JTextField();
        jbtnce = new javax.swing.JButton();
        jbtnb = new javax.swing.JButton();
        jbtnpandm = new javax.swing.JButton();
        jbtnc = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jbtnp = new javax.swing.JButton();
        jbtn9 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtnm = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtnmul = new javax.swing.JButton();
        jbtn1 = new javax.swing.JButton();
        jbtn0 = new javax.swing.JButton();
        jbtndot = new javax.swing.JButton();
        jbtnd = new javax.swing.JButton();
        jbtne = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtxt.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jtxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtActionPerformed(evt);
            }
        });

        jbtnce.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnce.setText("CE");
        jbtnce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnceActionPerformed(evt);
            }
        });

        jbtnb.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnb.setIcon(new javax.swing.ImageIcon("C:\\Users\\bulit\\Downloads\\icons8-clear-symbol-24.png")); // NOI18N
        jbtnb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnbActionPerformed(evt);
            }
        });

        jbtnpandm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnpandm.setText("+/-");
        jbtnpandm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnpandmActionPerformed(evt);
            }
        });

        jbtnc.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnc.setText("C");
        jbtnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtncActionPerformed(evt);
            }
        });

        jbtn8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtn8.setText("8");
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });

        jbtn7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtn7.setText("7");
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });

        jbtnp.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnp.setText("+");
        jbtnp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnpActionPerformed(evt);
            }
        });

        jbtn9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtn9.setText("9");
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });

        jbtn5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtn5.setText("5");
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });

        jbtn4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtn4.setText("4");
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });

        jbtnm.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnm.setText("-");
        jbtnm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnmActionPerformed(evt);
            }
        });

        jbtn6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtn6.setText("6");
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });

        jbtn3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtn3.setText("3");
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });

        jbtn2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtn2.setText("2");
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });

        jbtnmul.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnmul.setText("*");
        jbtnmul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnmulActionPerformed(evt);
            }
        });

        jbtn1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtn1.setText("1");
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });

        jbtn0.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtn0.setText("0");
        jbtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn0ActionPerformed(evt);
            }
        });

        jbtndot.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtndot.setText(".");
        jbtndot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndotActionPerformed(evt);
            }
        });

        jbtnd.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnd.setText("/");
        jbtnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndActionPerformed(evt);
            }
        });

        jbtne.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtne.setText("=");
        jbtne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtndot, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtne, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnd, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnmul, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jbtnp, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jbtnb, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jbtnce, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jbtnc, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jbtnpandm, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jbtnm, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnb, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnce, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnc, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnpandm, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnp, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnm, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnmul, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtndot, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtne, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtActionPerformed
        
    }//GEN-LAST:event_jtxtActionPerformed

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn5ActionPerformed
        enternumber("5");
    }//GEN-LAST:event_jbtn5ActionPerformed

    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn1ActionPerformed
        enternumber("1");
    }//GEN-LAST:event_jbtn1ActionPerformed

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn2ActionPerformed
        enternumber("2");
    }//GEN-LAST:event_jbtn2ActionPerformed

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn3ActionPerformed
        enternumber("3");
    }//GEN-LAST:event_jbtn3ActionPerformed

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn4ActionPerformed
        enternumber("4");
    }//GEN-LAST:event_jbtn4ActionPerformed

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn6ActionPerformed
        enternumber("6");
    }//GEN-LAST:event_jbtn6ActionPerformed

    private void jbtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn0ActionPerformed
        enternumber("0");
    }//GEN-LAST:event_jbtn0ActionPerformed

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn9ActionPerformed
        enternumber("9");
    }//GEN-LAST:event_jbtn9ActionPerformed

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn8ActionPerformed
        enternumber("8");
    }//GEN-LAST:event_jbtn8ActionPerformed

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn7ActionPerformed
        enternumber("7");
    }//GEN-LAST:event_jbtn7ActionPerformed

    private void jbtndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndActionPerformed
        enternum1= Double.parseDouble(jtxt.getText());
        jtxt.setText("");
        op = "/";
    }//GEN-LAST:event_jbtndActionPerformed

    private void jbtnmulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnmulActionPerformed
        enternum1= Double.parseDouble(jtxt.getText());
        jtxt.setText("");
        op = "*";
    }//GEN-LAST:event_jbtnmulActionPerformed

    private void jbtnmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnmActionPerformed
        enternum1= Double.parseDouble(jtxt.getText());
        jtxt.setText("");
        op = "-";
    }//GEN-LAST:event_jbtnmActionPerformed

    private void jbtnpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnpActionPerformed
        enternum1= Double.parseDouble(jtxt.getText());
        jtxt.setText("");
        op = "+";
    }//GEN-LAST:event_jbtnpActionPerformed

    private void jbtncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtncActionPerformed
        jtxt.setText("");
    }//GEN-LAST:event_jbtncActionPerformed

    private void jbtnceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnceActionPerformed
        jtxt.setText("");
        String fn,sn;
        fn= String.valueOf(enternum1);
        sn= String.valueOf(enternum2);
        fn="";
        sn="";
        
    }//GEN-LAST:event_jbtnceActionPerformed

    private void jbtnpandmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnpandmActionPerformed
        double nums = Double.parseDouble(jtxt.getText());
        nums = nums*(-1);
        jtxt.setText(String.valueOf(nums));
        
    }//GEN-LAST:event_jbtnpandmActionPerformed

    private void jbtnbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnbActionPerformed
       String backspaces = null ;
       if (jtxt.getText().length()>0)
       {
           StringBuilder spacebacks = new StringBuilder(jtxt.getText());
           spacebacks.deleteCharAt(jtxt.getText().length()-1);
           backspaces=spacebacks.toString();
           jtxt.setText(backspaces);
       }
    }//GEN-LAST:event_jbtnbActionPerformed

    private void jbtndotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndotActionPerformed
        if ( ! jtxt.getText().contains("."))
        {
            jtxt.setText( jtxt.getText()+jbtndot.getText());
        }
    }//GEN-LAST:event_jbtndotActionPerformed

    private void jbtneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtneActionPerformed
        enternum2= Double.parseDouble(jtxt.getText());
        if(op == "+")
        {
            result=enternum1+enternum2;
            jtxt.setText(String.valueOf(result));
        }
        if(op == "-")
        {
            result=enternum1-enternum2;
            jtxt.setText(String.valueOf(result));
        }
        if(op == "*")
        {
            result=enternum1*enternum2;
            jtxt.setText(String.valueOf(result));
        }
        if(op == "/")
        {
            result=enternum1/enternum2;
            jtxt.setText(String.valueOf(result));
        }
    }//GEN-LAST:event_jbtneActionPerformed
    private void enternumber(String x)
    {
        String num = jtxt.getText()+ x;
        jtxt.setText(num);
    }
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
            java.util.logging.Logger.getLogger(Calculator1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JButton jbtn0;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JButton jbtnb;
    private javax.swing.JButton jbtnc;
    private javax.swing.JButton jbtnce;
    private javax.swing.JButton jbtnd;
    private javax.swing.JButton jbtndot;
    private javax.swing.JButton jbtne;
    private javax.swing.JButton jbtnm;
    private javax.swing.JButton jbtnmul;
    private javax.swing.JButton jbtnp;
    private javax.swing.JButton jbtnpandm;
    private javax.swing.JTextField jtxt;
    // End of variables declaration//GEN-END:variables
}
