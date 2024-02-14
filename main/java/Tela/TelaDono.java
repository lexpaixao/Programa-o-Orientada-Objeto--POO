/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tela;

import Dao.ExcluirCardapioDAO;
import Dao.ExcluirFuncionarioDAO;
import Dao.InserirCardapioDAO;
import Dao.InserirFuncionarioDAO;
import com.mycompany.planetas.Cliente;
import com.mycompany.planetas.Funcionarios;
import javax.swing.JOptionPane;

/**
 *
 * @author Positivo
 */
public class TelaDono extends javax.swing.JFrame {
    Cliente cadastro= new Cliente();
    Funcionarios colaborador= new Funcionarios();
    /**
     * Creates new form TelaDono
     */
    public TelaDono() {
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

        Supremo = new javax.swing.JPanel();
        Intermediario = new javax.swing.JPanel();
        Final = new javax.swing.JPanel();
        ccardapio = new javax.swing.JButton();
        cfuncionario = new javax.swing.JButton();
        excardapio = new javax.swing.JButton();
        exfuncionario = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cardapio = new javax.swing.JButton();
        funcionario = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Supremo.setBackground(new java.awt.Color(102, 102, 102));

        Intermediario.setBackground(new java.awt.Color(255, 255, 255));

        Final.setBackground(new java.awt.Color(153, 255, 255));

        ccardapio.setBackground(new java.awt.Color(153, 255, 153));
        ccardapio.setFont(new java.awt.Font("Segoe UI", 3, 10)); // NOI18N
        ccardapio.setText("Cadastrar Cardapio");
        ccardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccardapioActionPerformed(evt);
            }
        });

        cfuncionario.setBackground(new java.awt.Color(153, 255, 153));
        cfuncionario.setFont(new java.awt.Font("Segoe UI", 3, 10)); // NOI18N
        cfuncionario.setText("Cadastrar Funcionario");
        cfuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cfuncionarioActionPerformed(evt);
            }
        });

        excardapio.setBackground(new java.awt.Color(255, 153, 153));
        excardapio.setFont(new java.awt.Font("Segoe UI", 3, 10)); // NOI18N
        excardapio.setText("Excluir Cardapio");
        excardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excardapioActionPerformed(evt);
            }
        });

        exfuncionario.setBackground(new java.awt.Color(255, 102, 102));
        exfuncionario.setFont(new java.awt.Font("Segoe UI", 3, 10)); // NOI18N
        exfuncionario.setText("Excluir Funcionario");
        exfuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exfuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FinalLayout = new javax.swing.GroupLayout(Final);
        Final.setLayout(FinalLayout);
        FinalLayout.setHorizontalGroup(
            FinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FinalLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(FinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ccardapio, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(excardapio, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exfuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cfuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        FinalLayout.setVerticalGroup(
            FinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FinalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ccardapio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cfuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(excardapio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exfuncionario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton5.setBackground(new java.awt.Color(153, 153, 153));
        jButton5.setFont(new java.awt.Font("Segoe UI", 3, 10)); // NOI18N
        jButton5.setText("Historico");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe Script", 2, 14)); // NOI18N
        jLabel1.setText("Planeta dos Sabores");

        cardapio.setBackground(new java.awt.Color(153, 153, 153));
        cardapio.setFont(new java.awt.Font("Segoe UI", 3, 10)); // NOI18N
        cardapio.setText("Cardapio");
        cardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardapioActionPerformed(evt);
            }
        });

        funcionario.setBackground(new java.awt.Color(153, 153, 153));
        funcionario.setFont(new java.awt.Font("Segoe UI", 3, 10)); // NOI18N
        funcionario.setText("Funcionarios");
        funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IntermediarioLayout = new javax.swing.GroupLayout(Intermediario);
        Intermediario.setLayout(IntermediarioLayout);
        IntermediarioLayout.setHorizontalGroup(
            IntermediarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IntermediarioLayout.createSequentialGroup()
                .addGroup(IntermediarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IntermediarioLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(IntermediarioLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(Final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IntermediarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cardapio)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(funcionario)
                .addGap(36, 36, 36))
        );
        IntermediarioLayout.setVerticalGroup(
            IntermediarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IntermediarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(Final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IntermediarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(cardapio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(funcionario))
                .addGap(1, 1, 1))
        );

        logo.setBackground(new java.awt.Color(255, 255, 255));
        logo.setFont(new java.awt.Font("Segoe Script", 2, 16)); // NOI18N
        logo.setForeground(new java.awt.Color(153, 255, 255));
        logo.setText("Restaurante");

        jButton6.setBackground(new java.awt.Color(255, 102, 102));
        jButton6.setText("X");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SupremoLayout = new javax.swing.GroupLayout(Supremo);
        Supremo.setLayout(SupremoLayout);
        SupremoLayout.setHorizontalGroup(
            SupremoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SupremoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Intermediario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(SupremoLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6))
        );
        SupremoLayout.setVerticalGroup(
            SupremoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SupremoLayout.createSequentialGroup()
                .addGroup(SupremoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SupremoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logo))
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Intermediario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Supremo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Supremo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exfuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exfuncionarioActionPerformed
        // TODO add your handling code here:
        String idtexto=JOptionPane.showInputDialog("Informe o codigo da linha a ser excluida");
        if(idtexto!=null){
            colaborador.id = Integer.parseInt(idtexto);
            JOptionPane.showInternalMessageDialog(null, "Codigo a ser excluido: "+idtexto);
           ExcluirFuncionarioDAO.ExcluirFuncionarios(colaborador.id);
        }
        else{
        JOptionPane.showInternalMessageDialog(null,"Erro: Valor inválido inserido.");
        }
    }//GEN-LAST:event_exfuncionarioActionPerformed

    private void ccardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccardapioActionPerformed
        // TODO add your handling code here:
        String precostring=JOptionPane.showInputDialog("Informe o  preço");
        cadastro.produton=JOptionPane.showInputDialog("Informe o  produto");
        cadastro.categoria=JOptionPane.showInputDialog("Informe a categoria");
        if (precostring == null && cadastro.produton==cadastro.categoria && cadastro.categoria==precostring) {
            JOptionPane.showInternalMessageDialog(null,"Nenhum valor inserido.");
        } else {
            try {
                
                cadastro.precon = Double.parseDouble(precostring);
               
                 InserirCardapioDAO.inserirRestaurante(cadastro.precon, cadastro.produton,cadastro.categoria);
                 JOptionPane.showInternalMessageDialog(null,"Cadastro de Cardapio Realizado com Sucesso!");
                
            } catch (NumberFormatException e) {

                JOptionPane.showInternalMessageDialog(null,"Erro: Valor inválido inserido.");
            }
        }
    }//GEN-LAST:event_ccardapioActionPerformed

    private void cardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardapioActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }//GEN-LAST:event_cardapioActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
         java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                new Telahistorico().setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton5ActionPerformed

    private void cfuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cfuncionarioActionPerformed
        // TODO add your handling code here:
        colaborador.cpfnovo=JOptionPane.showInputDialog("Informe o  cpf");
        colaborador.nomenovo=JOptionPane.showInputDialog("Informe o  nome");
        String nascimento=JOptionPane.showInputDialog("Informe a data de nascimento");
        String acesso=JOptionPane.showInputDialog("Informe o nivel de acesso \n(0-total\n1-Parcial\n2-Básico)");
        String senha=JOptionPane.showInputDialog("Informe a senha de acesso (ex: data 01012008 cpf 333 333 300 00\n"
                + "senha de acesso 01010000)");
        
                colaborador.nvnivel = Integer.parseInt(acesso);
                while(colaborador.nvnivel<0 || colaborador.nvnivel>2){
                acesso=JOptionPane.showInputDialog("Informe o nivel de acesso \n(0-total\n1-Parcial\n2-Básico)");
                }
        if (senha == null && colaborador.nomenovo==colaborador.cpfnovo && colaborador.cpfnovo==nascimento && nascimento==acesso) {
            JOptionPane.showInternalMessageDialog(null,"Nenhum valor inserido.");
        } else {
            try {
                
                
                colaborador.nvnivel = Integer.parseInt(acesso);
                colaborador.data = Integer.parseInt(nascimento);
                colaborador.reg = Integer.parseInt(senha);
                
                 
                 InserirFuncionarioDAO.inserirFuncionarios(colaborador.cpfnovo, colaborador.nomenovo, colaborador.data, colaborador.nvnivel, colaborador.reg);
                 
                 JOptionPane.showInternalMessageDialog(null,"Cadastro de Funcionario Realizado com Sucesso!");
                
            } catch (NumberFormatException e) {
                
                JOptionPane.showInternalMessageDialog(null,"Erro: Valor inválido inserido.");
            }
        }
    }//GEN-LAST:event_cfuncionarioActionPerformed

    private void funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcionarioActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Telafuncionarios().setVisible(true);
            }
        });
    }//GEN-LAST:event_funcionarioActionPerformed

    private void excardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excardapioActionPerformed
        // TODO add your handling code here:
        String idstr=JOptionPane.showInputDialog("Informe o codigo da linha a ser excluida");
        if(idstr!=null){
            cadastro.id = Integer.parseInt(idstr);
            JOptionPane.showInternalMessageDialog(null, "Codigo a ser excluido: "+idstr);
           ExcluirCardapioDAO.ExcluirRestaurante(cadastro.id);
        }
        else{
        JOptionPane.showInternalMessageDialog(null,"Erro: Valor inválido inserido.");
        }
       
    }//GEN-LAST:event_excardapioActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
                setVisible(false);
                
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaDono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDono().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Final;
    private javax.swing.JPanel Intermediario;
    private javax.swing.JPanel Supremo;
    private javax.swing.JButton cardapio;
    private javax.swing.JButton ccardapio;
    private javax.swing.JButton cfuncionario;
    private javax.swing.JButton excardapio;
    private javax.swing.JButton exfuncionario;
    private javax.swing.JButton funcionario;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
