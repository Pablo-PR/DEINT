/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author pablo
 */
public class blackjackGame extends javax.swing.JFrame {
    
    private String player1 = null;
    private String player2 = null;
    private String gameTitle = null;

    /**
     * Creates new form blackjackGame
     */
    public blackjackGame() {
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

        registerWindow = new javax.swing.JDialog();
        registerWindowTitle = new javax.swing.JLabel();
        player1Field = new javax.swing.JTextField();
        player1Label = new javax.swing.JLabel();
        player2Field = new javax.swing.JTextField();
        player2Label = new javax.swing.JLabel();
        acceptPlayersButton = new javax.swing.JButton();
        gameTitleField = new javax.swing.JTextField();
        gameTitleLabel = new javax.swing.JLabel();
        gameWindow = new javax.swing.JDialog();
        vsLabel = new javax.swing.JLabel();
        player1LabelGame = new javax.swing.JLabel();
        player2LabelGame = new javax.swing.JLabel();
        throwButtonPlayer1 = new javax.swing.JButton();
        throwButtonPlayer2 = new javax.swing.JButton();
        endPlayer1TurnButton = new javax.swing.JButton();
        endPlayer2TurnButton = new javax.swing.JButton();
        blackjackTitle = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        playButton = new javax.swing.JButton();

        registerWindow.setSize(new java.awt.Dimension(400, 300));

        registerWindowTitle.setFont(new java.awt.Font("Academy Engraved LET", 1, 24)); // NOI18N
        registerWindowTitle.setText("Registrar jugadores");

        player1Label.setText("Jugador 1");

        player2Label.setText("Jugador 2");

        acceptPlayersButton.setText("Aceptar");
        acceptPlayersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptPlayersButtonActionPerformed(evt);
            }
        });

        gameTitleLabel.setText("Nombre partida");

        javax.swing.GroupLayout registerWindowLayout = new javax.swing.GroupLayout(registerWindow.getContentPane());
        registerWindow.getContentPane().setLayout(registerWindowLayout);
        registerWindowLayout.setHorizontalGroup(
            registerWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerWindowLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(player1Label)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(registerWindowLayout.createSequentialGroup()
                .addGroup(registerWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerWindowLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(registerWindowTitle))
                    .addGroup(registerWindowLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(registerWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(registerWindowLayout.createSequentialGroup()
                                .addComponent(player2Label)
                                .addGap(18, 18, 18)
                                .addGroup(registerWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(player1Field, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                    .addComponent(player2Field)))
                            .addGroup(registerWindowLayout.createSequentialGroup()
                                .addComponent(gameTitleLabel)
                                .addGap(18, 18, 18)
                                .addGroup(registerWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(acceptPlayersButton)
                                    .addComponent(gameTitleField, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))))))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        registerWindowLayout.setVerticalGroup(
            registerWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerWindowLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(registerWindowTitle)
                .addGap(34, 34, 34)
                .addGroup(registerWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player1Label))
                .addGap(18, 18, 18)
                .addGroup(registerWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player2Label))
                .addGap(18, 18, 18)
                .addGroup(registerWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gameTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gameTitleLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(acceptPlayersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        gameWindow.setSize(new java.awt.Dimension(400, 500));

        vsLabel.setFont(new java.awt.Font("Academy Engraved LET", 3, 24)); // NOI18N
        vsLabel.setText("VS");

        player1LabelGame.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        player1LabelGame.setText("player1");

        player2LabelGame.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        player2LabelGame.setText("player2");

        throwButtonPlayer1.setLabel("Tirar");

        throwButtonPlayer2.setLabel("Tirar");

        endPlayer1TurnButton.setText("Terminar");
        endPlayer1TurnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endPlayer1TurnButtonActionPerformed(evt);
            }
        });

        endPlayer2TurnButton.setText("Terminar");

        javax.swing.GroupLayout gameWindowLayout = new javax.swing.GroupLayout(gameWindow.getContentPane());
        gameWindow.getContentPane().setLayout(gameWindowLayout);
        gameWindowLayout.setHorizontalGroup(
            gameWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameWindowLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(gameWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(gameWindowLayout.createSequentialGroup()
                        .addComponent(endPlayer1TurnButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(endPlayer2TurnButton))
                    .addGroup(gameWindowLayout.createSequentialGroup()
                        .addComponent(throwButtonPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(player1LabelGame)
                        .addGap(31, 31, 31)
                        .addComponent(vsLabel)
                        .addGap(36, 36, 36)
                        .addComponent(player2LabelGame)
                        .addGap(18, 18, 18)
                        .addComponent(throwButtonPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        gameWindowLayout.setVerticalGroup(
            gameWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameWindowLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(gameWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vsLabel)
                    .addComponent(player1LabelGame)
                    .addComponent(player2LabelGame)
                    .addComponent(throwButtonPlayer1)
                    .addComponent(throwButtonPlayer2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(gameWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endPlayer1TurnButton)
                    .addComponent(endPlayer2TurnButton))
                .addContainerGap(213, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        blackjackTitle.setFont(new java.awt.Font("Academy Engraved LET", 3, 24)); // NOI18N
        blackjackTitle.setText("BLACKJACK");

        registerButton.setText("Registrar jugadores");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        playButton.setText("Jugar");
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(128, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registerButton)
                    .addComponent(blackjackTitle))
                .addGap(125, 125, 125))
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(playButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(blackjackTitle)
                .addGap(43, 43, 43)
                .addComponent(registerButton)
                .addGap(18, 18, 18)
                .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
        this.registerWindow.setVisible(true);
    }//GEN-LAST:event_registerButtonActionPerformed

    private void acceptPlayersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptPlayersButtonActionPerformed
        // TODO add your handling code here:
        player1 = player1Field.getText();
        player2 = player2Field.getText();
        gameTitle = gameTitleField.getText();
        this.registerWindow.setVisible(false);
    }//GEN-LAST:event_acceptPlayersButtonActionPerformed

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        // TODO add your handling code here:
        if (player1 != null && player2 != null){
            this.gameWindow.setVisible(true);
            this.gameWindow.setTitle(gameTitle);
            this.player1LabelGame.setText(player1);
            this.player2LabelGame.setText(player2);
        }
    }//GEN-LAST:event_playButtonActionPerformed

    private void endPlayer1TurnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endPlayer1TurnButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endPlayer1TurnButtonActionPerformed

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
            java.util.logging.Logger.getLogger(blackjackGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(blackjackGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(blackjackGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(blackjackGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new blackjackGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptPlayersButton;
    private javax.swing.JLabel blackjackTitle;
    private javax.swing.JButton endPlayer1TurnButton;
    private javax.swing.JButton endPlayer2TurnButton;
    private javax.swing.JTextField gameTitleField;
    private javax.swing.JLabel gameTitleLabel;
    private javax.swing.JDialog gameWindow;
    private javax.swing.JButton playButton;
    private javax.swing.JTextField player1Field;
    private javax.swing.JLabel player1Label;
    private javax.swing.JLabel player1LabelGame;
    private javax.swing.JTextField player2Field;
    private javax.swing.JLabel player2Label;
    private javax.swing.JLabel player2LabelGame;
    private javax.swing.JButton registerButton;
    private javax.swing.JDialog registerWindow;
    private javax.swing.JLabel registerWindowTitle;
    private javax.swing.JButton throwButtonPlayer1;
    private javax.swing.JButton throwButtonPlayer2;
    private javax.swing.JLabel vsLabel;
    // End of variables declaration//GEN-END:variables
}