
package semana5matrices;

import javax.swing.JOptionPane;


public class CalculadoraDeMatrices extends javax.swing.JFrame {
    
    int tamaño;

    public CalculadoraDeMatrices() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sumarMatriz = new javax.swing.JButton();
        restarMatriz = new javax.swing.JButton();
        trazarMatriz = new javax.swing.JButton();
        determinanteMatriz = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        sumarMatriz.setText("Sumar");
        sumarMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumarMatrizActionPerformed(evt);
            }
        });

        restarMatriz.setText("Restar");
        restarMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restarMatrizActionPerformed(evt);
            }
        });

        trazarMatriz.setText("Trazar");
        trazarMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trazarMatrizActionPerformed(evt);
            }
        });

        determinanteMatriz.setText("Determinante");
        determinanteMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                determinanteMatrizActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Descargas\\matriz.png")); // NOI18N

        Titulo.setText("Calculadora De Matrices");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trazarMatriz, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sumarMatriz, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(restarMatriz)
                    .addComponent(determinanteMatriz))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(Titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sumarMatriz)
                            .addComponent(restarMatriz))
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(determinanteMatriz)
                            .addComponent(trazarMatriz)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void determinanteMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_determinanteMatrizActionPerformed
         
        tamaño = Integer.parseInt(JOptionPane.showInputDialog("Tamaño de las matriz"));

        int mat1[][] = new int[tamaño][tamaño];
        int detA = 0, detB = 0, detC = 0, detD = 0, res = 0;
   
        if (tamaño == 2) {
            JOptionPane.showMessageDialog(null, "Llene la matriz");
            for (int i = 0; i < mat1.length; i++) {
                for (int j = 0; j < mat1.length; j++) {

                    mat1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("llenar posicion: fila: " + (i + 1) + "Columna: " + (j + 1)));
                }
            }

            JOptionPane.showMessageDialog(null, "obteniendo determinante....");
            for (int i = 0; i < mat1.length; i++) {
                for (int j = 0; j < mat1.length; j++) {
                    if (i == 0 && j== 0) {
                        detA += mat1[i][j];
                    }else if ( i == 0 && j == 1){
                        detC += mat1[i][j];
                    }else if ( i == 1 && j == 0){
                        detD += mat1[i][j];
                    }else if ( i == 1 && j == 1){
                        detB += mat1[i][j];
                    }
                }
            }

            JOptionPane.showMessageDialog(null, "Resultado = "+detA+"\t"+detB+"-\t"+detC+"\t"+detD);
            res = (detA*detB)-(detC*detD);
            JOptionPane.showMessageDialog(null, res);
        }
    }//GEN-LAST:event_determinanteMatrizActionPerformed

    private void sumarMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumarMatrizActionPerformed
         
        tamaño = Integer.parseInt(JOptionPane.showInputDialog("Tamaño de las matrices"));

        int mat1[][] = new int[tamaño][tamaño];
        int mat2[][] = new int[tamaño][tamaño];
        int mat3[][] = new int[tamaño][tamaño];

        if (tamaño > 1) {
            JOptionPane.showMessageDialog(null, "Llene las matrices");

            JOptionPane.showMessageDialog(null, "Matriz 1");
            for (int i = 0; i < mat1.length; i++) {
                for (int j = 0; j < mat1.length; j++) {

                    mat1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("llenar posicion: fila: " + (i + 1) + "Columna: " + (j + 1)));
                }
            }

            JOptionPane.showMessageDialog(null, "Matriz 2");
            for (int i = 0; i < mat2.length; i++) {
                for (int j = 0; j < mat2.length; j++) {

                    mat2[i][j] = Integer.parseInt(JOptionPane.showInputDialog("llenar posicion: fila: " + (i + 1) + "Columna: " + (j + 1)));
                }
            }

            JOptionPane.showMessageDialog(null, "sumando matrices....");
            for (int i = 0; i < mat3.length; i++) {
                for (int j = 0; j < mat3.length; j++) {
                    mat3[i][j] = mat1[i][j] + mat2[i][j];
                }
            }

            JOptionPane.showMessageDialog(null, "matriz resultante:");
            String s = "";

            for (int i = 0; i < mat3.length; i++) {
                for (int j = 0; j < mat3.length; j++) {
                    s += mat3[i][j];
                    s += "";

                }
                s += "\n";
            }
            JOptionPane.showMessageDialog(null, s);
        }
    
    }//GEN-LAST:event_sumarMatrizActionPerformed

    private void restarMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restarMatrizActionPerformed
        tamaño = Integer.parseInt(JOptionPane.showInputDialog("Tamaño de las matrices"));

        int mat1[][] = new int[tamaño][tamaño];
        int mat2[][] = new int[tamaño][tamaño];
        int mat3[][] = new int[tamaño][tamaño];

        if (tamaño > 1) {

            JOptionPane.showMessageDialog(null, "Llene las matrices");

            JOptionPane.showMessageDialog(null, "Matriz 1");
            for (int i = 0; i < mat1.length; i++) {
                for (int j = 0; j < mat1.length; j++) {

                    mat1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("llenar posicion: fila: " + (i + 1) + "Columna: " + (j + 1)));
                }
            }

            JOptionPane.showMessageDialog(null, "Matriz 2");
            for (int i = 0; i < mat2.length; i++) {
                for (int j = 0; j < mat2.length; j++) {

                    mat2[i][j] = Integer.parseInt(JOptionPane.showInputDialog("llenar posicion: fila: " + (i + 1) + "Columna: " + (j + 1)));
                }
            }

            JOptionPane.showMessageDialog(null, "restando matrices....");
            for (int i = 0; i < mat3.length; i++) {
                for (int j = 0; j < mat3.length; j++) {
                    mat3[i][j] = mat1[i][j] - mat2[i][j];
                }
            }

            JOptionPane.showMessageDialog(null, "matriz resultante:");
            String s = "";

            for (int i = 0; i < mat3.length; i++) {
                for (int j = 0; j < mat3.length; j++) {
                    s += mat3[i][j];
                    s += "";

                }
                s += "\n";
            }
            JOptionPane.showMessageDialog(null, s);
        }
    }//GEN-LAST:event_restarMatrizActionPerformed

    private void trazarMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trazarMatrizActionPerformed
        
        tamaño = Integer.parseInt(JOptionPane.showInputDialog("Tamaño de las matriz"));

        int mat1[][] = new int[tamaño][tamaño];
        int mat2[][] = new int[tamaño][tamaño];

        if (tamaño > 1) {
            JOptionPane.showMessageDialog(null, "Llene la matriz");
            for (int i = 0; i < mat1.length; i++) {
                for (int j = 0; j < mat1.length; j++) {

                    mat1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("llenar posicion: fila: " + (i + 1) + "Columna: " + (j + 1)));
                }
            }

            JOptionPane.showMessageDialog(null, "trazando matriz....");
            for (int i = 0; i < mat1.length; i++) {
                for (int j = 0; j < mat1.length; j++) {
                    if (i == j) {
                        mat2[i][j] = mat1[i][j];
                    }
                }
            }

            JOptionPane.showMessageDialog(null, "matriz resultante:");
            String s = "";

            for (int i = 0; i < mat2.length; i++) {
                for (int j = 0; j < mat2.length; j++) {
                    if (i == j) {
                        s += mat2[i][j];
                        s += "";
                    }
                }
                s += "+";
            }
            JOptionPane.showMessageDialog(null, "T = La suma de " + s);
        }
    }//GEN-LAST:event_trazarMatrizActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraDeMatrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraDeMatrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraDeMatrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraDeMatrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraDeMatrices().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton determinanteMatriz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton restarMatriz;
    private javax.swing.JButton sumarMatriz;
    private javax.swing.JButton trazarMatriz;
    // End of variables declaration//GEN-END:variables
}
