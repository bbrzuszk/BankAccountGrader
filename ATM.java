/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Font;
import java.io.IOException;

import javax.swing.JOptionPane;

/**
 *
 * @author BBrzuszk
 */
public class ATM extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public ATM() {
        initComponents();
        setUsage();
    }
    
    
    private void setUsage(){
    	jB_depositInterest.setEnabled(false);
    	jTF_nameSearch.setEditable(false);
    	jTF_balanceSearch.setEditable(false);
    	jTA_output.setFont(new Font("Sans Serif", 1, 12));
    	jTA_output.setText("\n\nWelcome to \n\nB's Better Banking\n\nSearch for an account \nby number first");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTF_accNumSearch = new javax.swing.JTextField();
        jB_accNumSearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTF_nameSearch = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTF_balanceSearch = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTF_depWith = new javax.swing.JTextField();
        jB_deposit = new javax.swing.JButton();
        jB_withdraw = new javax.swing.JButton();
        jB_depositInterest = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTF_findByName = new javax.swing.JTextField();
        jB_findByName = new javax.swing.JButton();
        jTF_findByAccNum = new javax.swing.JTextField();
        jB_findByAccNum = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jTF_addName1 = new javax.swing.JTextField();
        jTF_balance = new javax.swing.JTextField();
        jTF_addAccNum = new javax.swing.JTextField();
        jCB_isChecking = new javax.swing.JCheckBox();
        jB_addAccount = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTA_output = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Account Number:");

        jTF_accNumSearch.setText("AccNum");

        jB_accNumSearch.setText("Find");
        jB_accNumSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_accNumSearchActionPerformed(evt);
            }
        });

        jLabel2.setText("Name");

        jLabel3.setText("Balance");

        jLabel4.setText("Deposit/Withdraw Amount");

        jTF_depWith.setText("0.00");

        jB_deposit.setText("Deposit");
        jB_deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_depositActionPerformed(evt);
            }
        });

        jB_withdraw.setText("Withdraw");
        jB_withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_withdrawActionPerformed(evt);
            }
        });

        jB_depositInterest.setText("Deposit Interest");
        jB_depositInterest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_depositInterestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB_depositInterest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTF_depWith)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(14, 14, 14))
                            .addComponent(jLabel3))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTF_nameSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(jTF_balanceSearch))
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jB_deposit, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jB_withdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTF_accNumSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jB_accNumSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTF_accNumSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_accNumSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTF_nameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTF_balanceSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(38, 38, 38)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTF_depWith, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_withdraw)
                    .addComponent(jB_deposit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jB_depositInterest, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Transactions", jPanel1);

        jTF_findByName.setText("Robyn Morales");

        jB_findByName.setText("Find");
        jB_findByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_findByNameActionPerformed(evt);
            }
        });

        jTF_findByAccNum.setText("87654321");

        jB_findByAccNum.setText("Find");
        jB_findByAccNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_findByAccNumActionPerformed(evt);
            }
        });

        jLabel5.setText("Add Accounts");

        jTF_addName1.setText("Name");

        jTF_balance.setText("Balance");

        jTF_addAccNum.setText("Account Number");

        jCB_isChecking.setText("Checking Account");
        jCB_isChecking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_isCheckingActionPerformed(evt);
            }
        });

        jB_addAccount.setText("Add Account");
        jB_addAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_addAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jTF_findByName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_findByName))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jTF_findByAccNum, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_findByAccNum))
                    .addComponent(jSeparator1)
                    .addComponent(jTF_addName1)
                    .addComponent(jTF_balance)
                    .addComponent(jTF_addAccNum)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jCB_isChecking)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jB_addAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTF_findByName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_findByName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTF_findByAccNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_findByAccNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTF_addName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTF_addAccNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTF_balance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCB_isChecking)
                    .addComponent(jB_addAccount))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add/Search Accounts", jPanel4);

        jTA_output.setColumns(20);
        jTA_output.setRows(5);
        jScrollPane1.setViewportView(jTA_output);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void jB_depositInterestActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    	try{
    		int accNum = Integer.parseInt(jTF_accNumSearch.getText().trim());
        	int loc = bank.findAccount(accNum);
        	Account acc = bank.getAccounts().get(loc);
        	if(acc instanceof CheckingAccount){
        		String output = "Previous Account Details: \n";
        		output += bank.displayAccount(accNum);
        		((CheckingAccount) acc).depositInterest();
        		output += "\n\nAccount Details after Transaction: \n";
        		output += bank.displayAccount(accNum);
            	jTA_output.setText(output);
            	jTF_nameSearch.setText("");
        		jTF_balanceSearch.setText("");
        		jTF_accNumSearch.setText("");
        		jB_depositInterest.setEnabled(false);
        		
        	}
        	
    	}catch(Exception e){
    		JOptionPane.showMessageDialog(null, "Unknown Error" );
    	}
    }                                                  

    private void jB_findByNameActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    
		
		try{
    		String owner = jTF_findByName.getText().trim();
    		int loc = bank.findAccount(owner);
    		if(loc == -1){
    			JOptionPane.showMessageDialog(null, "Account Does Not Exist");
    			jTF_findByName.setText("Robyn Morales");
    			jTF_findByAccNum.setText("87654321");
    			}
    		else{
    			String output = Util.splitAccounts(bank.displayAccounts(owner));
    			jTA_output.setText(output);
    			jTF_findByName.setText("Robyn Morales");
    			jTF_findByAccNum.setText("87654321");
    		}
    		
    	}catch(Exception e){
    		JOptionPane.showMessageDialog(null, "Account Number Must Be An Integer");
    	}
      
    }                                             

    private void jB_accNumSearchActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    	try{
    	int accNum = Integer.parseInt(jTF_accNumSearch.getText().trim());
    	int loc = bank.findAccount(accNum);
    	if(loc == -1)
    		JOptionPane.showMessageDialog(null, "Account Does Not Exits");
    	else{
    		Account acc = bank.getAccounts().get(loc);
    		jTF_nameSearch.setText(acc.getOwner());
    		jTF_balanceSearch.setText(String.valueOf(acc.getBalance()));
    		if(acc instanceof CheckingAccount){
    			jB_depositInterest.setEnabled(true);
    		}
    		else{
    			jB_depositInterest.setEnabled(false);
    		}
    	}
    	}catch(Exception e){
    		JOptionPane.showMessageDialog(null, "Only Integer Input Allowed");
    		jTF_nameSearch.setText("");
    		jTF_balanceSearch.setText("");
    	}
    	
    	
    }                                               

    private void jB_depositActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    	
    	try{
    		double amount = Double.parseDouble(jTF_depWith.getText().trim());
        	int accNum = Integer.parseInt(jTF_accNumSearch.getText().trim());
        	int loc = bank.findAccount(accNum);
        	if(loc == -1)
        		JOptionPane.showMessageDialog(null, "Account Does Not Exits");
        	else{
        		Account acc = bank.getAccounts().get(loc);
        		String output = "Previous Account Details: \n";
        		output += bank.displayAccount(accNum);
        		acc.deposit(amount);
        		output += "\n\nAccount Details after Transaction: \n";
        		output += bank.displayAccount(accNum);
            	jTA_output.setText(output);
        		
        	}
        	}catch(Exception e){
        		JOptionPane.showMessageDialog(null, "Only Double Input Allowed");
        		jTF_nameSearch.setText("");
        		jTF_balanceSearch.setText("");
        	}
        	
    	
    }                                          

    private void jB_withdrawActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    	
    	try{
    		double amount = Double.parseDouble(jTF_depWith.getText().trim());
        	int accNum = Integer.parseInt(jTF_accNumSearch.getText().trim());
        	int loc = bank.findAccount(accNum);
        	if(loc == -1)
        		JOptionPane.showMessageDialog(null, "Account Does Not Exits");
        	else{
        		Account acc = bank.getAccounts().get(loc);
        		String output = "Previous Account Details: \n";
        		output += bank.displayAccount(accNum);
        		if(acc.withdraw(amount) != -1){
        			output += "\n\nAccount Details after Transaction: \n";
        			output += bank.displayAccount(accNum);
        			jTA_output.setText(output);
        		}
        		else{
        			JOptionPane.showMessageDialog(null, "Over Drawn");
        		}
            	
        		
        	}
        	}catch(Exception e){
        		JOptionPane.showMessageDialog(null, "Only Double Input Allowed");
        		jTF_nameSearch.setText("");
        		jTF_balanceSearch.setText("");
        	}
    }                                           

    private void jB_findByAccNumActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    	try{
    		int accNum = Integer.parseInt(jTF_findByAccNum.getText().trim());
    		int loc = bank.findAccount(accNum);
    		if(loc == -1){
    			JOptionPane.showMessageDialog(null, "Account Does Not Exist");
    			jTF_findByName.setText("Search By Name");
    			jTF_findByAccNum.setText("87654321");
    			}
    		else{
    			jTA_output.setText(bank.displayAccount(accNum));
    			jTF_findByName.setText("Robyn Morales");
    			jTF_findByAccNum.setText("87654321");
    		}
    		
    	}catch(Exception e){
    		JOptionPane.showMessageDialog(null, "Account Number Must Be An Integer");
    	}
    }                                               

    private void jB_addAccountActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    	try{
    		String name = jTF_addName1.getText().trim();
    		int accNum = Integer.parseInt(jTF_addAccNum.getText().trim());
    		double bal = Double.parseDouble(jTF_balance.getText().trim());
    		boolean isCheck = jCB_isChecking.isSelected();
    		bank.addAccount(name, accNum, bal, isCheck);
    		jTF_addName1.setText("Name");
    		jTF_addAccNum.setText("Account Number");
    		jTF_balance.setText("Balance");
    		jCB_isChecking.setEnabled(false);
    	}catch(Exception e){
    		JOptionPane.showMessageDialog(null, "Fieds to add account are not \nfilled in correctly");
    		jTF_addName1.setText("Name");
    		jTF_addAccNum.setText("Account Number");
    		jTF_balance.setText("Balance");
    	}
    }                                             

    private void jCB_isCheckingActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    	int choice = JOptionPane.showConfirmDialog(null, "Confirm Checking", "Confirmation", 0);
    	if(choice == 1)
    		jCB_isChecking.setSelected(false);
    }                                              

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    	try {
			bank = new Bank(Util.getAccounts());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
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
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ATM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jB_accNumSearch;
    private javax.swing.JButton jB_addAccount;
    private javax.swing.JButton jB_deposit;
    private javax.swing.JButton jB_depositInterest;
    private javax.swing.JButton jB_findByAccNum;
    private javax.swing.JButton jB_findByName;
    private javax.swing.JButton jB_withdraw;
    private javax.swing.JCheckBox jCB_isChecking;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTA_output;
    private javax.swing.JTextField jTF_accNumSearch;
    private javax.swing.JTextField jTF_addAccNum;
    private javax.swing.JTextField jTF_addName1;
    private javax.swing.JTextField jTF_balance;
    private javax.swing.JTextField jTF_balanceSearch;
    private javax.swing.JTextField jTF_depWith;
    private javax.swing.JTextField jTF_findByAccNum;
    private javax.swing.JTextField jTF_findByName;
    private javax.swing.JTextField jTF_nameSearch;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration     
    private static Bank bank;
}