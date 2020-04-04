/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DotGame.Utilities;

import DuckHunt.Constant.MessageType;
import com.DotGame.Other.GameGlobalVariables;
import com.DotGame.Main.ListenGroup;
import com.DotGame.Main.MainGame;
import com.DotGame.Request.GroupList;
import com.DotGame.Request.Message;
import com.DotGame.Request.RemoveMember;
import DuckHunt.Request.StartGame;

/**
 *
 * @author Sahaj
 */
public class GroupView extends javax.swing.JFrame {

    private int numOfPlayers; 
    
    private Thread listen;
    
    /**
     * Creates new form GroupView
     */
    public GroupView() {
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

        groupName = new javax.swing.JLabel();
        player1 = new javax.swing.JLabel();
        player2 = new javax.swing.JLabel();
        player3 = new javax.swing.JLabel();
        player4 = new javax.swing.JLabel();
        player5 = new javax.swing.JLabel();
        player6 = new javax.swing.JLabel();
        player7 = new javax.swing.JLabel();
        player8 = new javax.swing.JLabel();
        starter = new javax.swing.JButton();
        msgContent = new javax.swing.JTextField();
        send = new javax.swing.JButton();
        leaveGroup = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        chatArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        groupName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        player1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        player2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        player3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        player4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        player5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        player6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        player7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        player8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        starter.setText("Start Game");
        starter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                starterActionPerformed(evt);
            }
        });

        send.setText("Send");
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });

        leaveGroup.setText("Leave Group");
        leaveGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaveGroupActionPerformed(evt);
            }
        });

        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText(" ");

        chatArea.setColumns(20);
        chatArea.setRows(5);
        jScrollPane1.setViewportView(chatArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(player1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(player8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(player2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(player3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(player4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(player5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(player6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(player7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(255, 255, 255)
                                        .addComponent(leaveGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(37, 37, 37)
                                .addComponent(starter, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(groupName, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(msgContent, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(send, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(groupName, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(leaveGroup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(starter, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addComponent(player1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(player2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(player3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(player4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(player5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(player6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(player7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(msgContent, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(send, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(31, 31, 31)
                .addComponent(player8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void starterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_starterActionPerformed
        
        GameGlobalVariables.getInstance().getClient().sendMessage(new StartGame(GameGlobalVariables.getInstance().getSIZE()));
        
    }//GEN-LAST:event_starterActionPerformed

    private void leaveGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaveGroupActionPerformed

           GameGlobalVariables.getInstance().getClient().sendMessage(new RemoveMember(GameGlobalVariables.getInstance().getClient().getName()));
           GameGlobalVariables.getInstance().destroy();
           this.destroy();
           new Menu().setVisible(true);
           
    }//GEN-LAST:event_leaveGroupActionPerformed

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed

        GameGlobalVariables.getInstance().getClient().sendMessage(new Message(GameGlobalVariables.getInstance().getClient().getName(),GameGlobalVariables.getInstance().getClient().getGroupName(),msgContent.getText(),MessageType.UserToGroup));
        msgContent.setText("");
    }//GEN-LAST:event_sendActionPerformed

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
            java.util.logging.Logger.getLogger(GroupView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GroupView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GroupView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GroupView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GroupView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea chatArea;
    private javax.swing.JLabel groupName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton leaveGroup;
    private javax.swing.JTextField msgContent;
    private javax.swing.JLabel name;
    private javax.swing.JLabel player1;
    private javax.swing.JLabel player2;
    private javax.swing.JLabel player3;
    private javax.swing.JLabel player4;
    private javax.swing.JLabel player5;
    private javax.swing.JLabel player6;
    private javax.swing.JLabel player7;
    private javax.swing.JLabel player8;
    private javax.swing.JButton send;
    private javax.swing.JButton starter;
    // End of variables declaration//GEN-END:variables

    public void initialiser() {
        if (!GameGlobalVariables.getInstance().getClient().isIsOwner()) {
            starter.setVisible(false);
        }
        name.setText(GameGlobalVariables.getInstance().getClient().getName());
        groupName.setText(GameGlobalVariables.getInstance().getClient().getGroupName());
        GameGlobalVariables.getInstance().getClient().sendMessage(new GroupList(groupName.getText()));
        GroupList groupList = (GroupList) GameGlobalVariables.getInstance().getClient().receiveMessage();
        
        String[] x = groupList.getClients();
        chatArea.setEditable(false);
        player1.setText(x[0]);
        player2.setText(x[1]);
        player3.setText(x[2]);
        player4.setText(x[3]);
        player5.setText(x[4]);
        player6.setText(x[5]);
        player7.setText(x[6]);
        player8.setText(x[7]);
        
        listen = new Thread(new ListenGroup(this));
        listen.start();
        
        this.setVisible(true);
    }
    
    public void gotMessage(String msg){
        chatArea.setText(chatArea.getText() + "\n" + msg);
    }
    
    public void gotPlayer(String name){
        if(player1.getText().equals("")){
         player1.setText(name);   
        }else if(player2.getText().equals("")){
         player2.setText(name);   
        }else if(player3.getText().equals("")){
         player3.setText(name);   
        }else if(player4.getText().equals("")){
         player4.setText(name);   
        }else if(player5.getText().equals("")){
         player5.setText(name);   
        }else if(player6.getText().equals("")){
         player6.setText(name);   
        }else if(player7.getText().equals("")){
         player7.setText(name);   
        }else if(player8.getText().equals("")){
         player8.setText(name);   
        }
        chatArea.setText(chatArea.getText() + "\n\t\t" + name + " joined the room. ");
    }
     
    public void lostPlayer(String name){
        if(player1.getText().equals(name)){
         player1.setText("");   
        }else if(player2.getText().equals(name)){
         player2.setText("");   
        }else if(player3.getText().equals(name)){
         player3.setText("");   
        }else if(player4.getText().equals(name)){
         player4.setText("");   
        }else if(player5.getText().equals(name)){
         player5.setText("");   
        }else if(player6.getText().equals(name)){
         player6.setText("");   
        }else if(player7.getText().equals(name)){
         player7.setText("");   
        }else if(player8.getText().equals(name)){
         player8.setText("");   
        }
        chatArea.setText(chatArea.getText() + "\n\t\t" + name + " left the room. ");
    }

    private void destroy() {
        this.dispose();
        listen.stop();
    }

    public void startGame(int size) {
        new MainGame().initializer(size);
        this.destroy();
    }
    
}