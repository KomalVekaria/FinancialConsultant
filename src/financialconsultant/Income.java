/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financialconsultant;

import financialconsultant.Menu;

/**
 *
 * @author Lovely Menaria
 */
public class Income extends javax.swing.JFrame {

    /**
     * Creates new form Income
     */
    public Income() {
        
        initComponents();
        lblHomePay.setVisible(false);
        lblPension.setVisible(false);
        lblInvestmentIncome.setVisible(false);
        lblBenefits.setVisible(false);
        lblOtherIncome.setVisible(false);
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtHomePay = new javax.swing.JTextField();
        txtPension = new javax.swing.JTextField();
        txtInvestmentIncome = new javax.swing.JTextField();
        txtBenefits = new javax.swing.JTextField();
        txtOtherIncome = new javax.swing.JTextField();
        txtTotalIncome = new javax.swing.JTextField();
        cmbHomePay = new javax.swing.JComboBox();
        cmbPension = new javax.swing.JComboBox();
        cmbInvestmentIncome = new javax.swing.JComboBox();
        cmbBenefits = new javax.swing.JComboBox();
        cmbOtherIncome = new javax.swing.JComboBox();
        cmdClearIncome = new javax.swing.JButton();
        cmdCalculateIncome = new javax.swing.JButton();
        cmdBack = new javax.swing.JButton();
        lblHomePay = new javax.swing.JLabel();
        lblPension = new javax.swing.JLabel();
        lblInvestmentIncome = new javax.swing.JLabel();
        lblBenefits = new javax.swing.JLabel();
        lblOtherIncome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome to the Specialist Fianacial Consultant...");
        setBackground(new java.awt.Color(204, 204, 255));
        setBounds(new java.awt.Rectangle(550, 270, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Income Calculator");

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Home Pay:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Pension:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Investment Income:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Benefits:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Other:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Total Income:");

        txtHomePay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtHomePay.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtPension.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtInvestmentIncome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtBenefits.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtOtherIncome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtTotalIncome.setEditable(false);
        txtTotalIncome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        cmbHomePay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cmbHomePay.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose one....", "Weekly", "Monthly", "Quarterly", "Yearly" }));
        cmbHomePay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbHomePayActionPerformed(evt);
            }
        });

        cmbPension.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cmbPension.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose one....", "Weekly", "Monthly", "Quarterly", "Yearly" }));
        cmbPension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPensionActionPerformed(evt);
            }
        });

        cmbInvestmentIncome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cmbInvestmentIncome.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose one....", "Weekly", "Monthly", "Quarterly", "Yearly" }));
        cmbInvestmentIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbInvestmentIncomeActionPerformed(evt);
            }
        });

        cmbBenefits.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cmbBenefits.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose one....", "Weekly", "Monthly", "Quarterly", "Yearly" }));
        cmbBenefits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBenefitsActionPerformed(evt);
            }
        });

        cmbOtherIncome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cmbOtherIncome.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose one....", "Weekly", "Monthly", "Quarterly", "Yearly" }));
        cmbOtherIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOtherIncomeActionPerformed(evt);
            }
        });

        cmdClearIncome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdClearIncome.setText("Clear");
        cmdClearIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdClearIncomeActionPerformed(evt);
            }
        });

        cmdCalculateIncome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdCalculateIncome.setText("Calculate");
        cmdCalculateIncome.setMaximumSize(new java.awt.Dimension(93, 25));
        cmdCalculateIncome.setMinimumSize(new java.awt.Dimension(93, 25));
        cmdCalculateIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalculateIncomeActionPerformed(evt);
            }
        });

        cmdBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdBack.setText("Back");
        cmdBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtHomePay, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPension, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtInvestmentIncome, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBenefits, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOtherIncome, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotalIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbHomePay, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbPension, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbInvestmentIncome, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbBenefits, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbOtherIncome, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(cmdClearIncome, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdBack, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblPension)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblHomePay)
                                .addContainerGap(56, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblInvestmentIncome)
                                    .addComponent(lblBenefits))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblOtherIncome)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdCalculateIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHomePay)
                            .addComponent(cmbHomePay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblHomePay)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPension, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbPension, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblPension)))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtInvestmentIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbInvestmentIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblInvestmentIncome))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtBenefits, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbBenefits, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblBenefits))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOtherIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbOtherIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOtherIncome))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdClearIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdBack, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdCalculateIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        txtHomePay.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdClearIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdClearIncomeActionPerformed
        
        txtHomePay.setText("");
        txtPension.setText("");
        txtInvestmentIncome.setText("");
        txtBenefits.setText("");
        txtOtherIncome.setText("");
        txtTotalIncome.setText("");
        cmbHomePay.setSelectedItem("Choose one...");
        cmbPension.setSelectedItem("Choose one...");
        cmbBenefits.setSelectedItem("Choose one...");
        cmbInvestmentIncome.setSelectedItem("Choose one...");
        cmbOtherIncome.setSelectedItem("Choose one...");
        
    }//GEN-LAST:event_cmdClearIncomeActionPerformed

    private void cmbHomePayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbHomePayActionPerformed
       
        if("Weekly".equals((String) cmbHomePay.getSelectedItem())){
            
            String priceStr = txtHomePay.getText();
            double price = Double.parseDouble(priceStr);
            price = price * 4 + price / 3;
            priceStr = Double.toString(Math.round(price*100)/100.00);
            lblHomePay.setText(priceStr);
            
        }
        
        else if("Monthly".equals((String) cmbHomePay.getSelectedItem())){
            
            String priceStr = txtHomePay.getText();
            double price = Double.parseDouble(priceStr);
            price = price * 1;
            priceStr = Double.toString(Math.round(price*100)/100.00);
            lblHomePay.setText(priceStr);
            
        }
         
        else if("Quarterly".equals((String) cmbHomePay.getSelectedItem())){
            
            String priceStr = txtHomePay.getText();
            double price = Double.parseDouble(priceStr);
            price = price / 3;
            priceStr = Double.toString(Math.round(price*100)/100.00);
            lblHomePay.setText(priceStr);
            
        }    
        
        else if("Yearly".equals((String) cmbHomePay.getSelectedItem())){
   
            String priceStr = txtHomePay.getText();
            double price = Double.parseDouble(priceStr);
            price = price / 12;
            priceStr = Double.toString(Math.round(price*100)/100.00);
            lblHomePay.setText(priceStr);
            
        } 
                
    }//GEN-LAST:event_cmbHomePayActionPerformed

    private void cmbPensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPensionActionPerformed

        if("Weekly".equals((String) cmbPension.getSelectedItem())){
            
            String priceStr = txtPension.getText();
            double price = Double.parseDouble(priceStr);
            price = price * 4 + price / 3;
            priceStr = Double.toString(Math.round(price*100)/100.00);
            lblPension.setText(priceStr);
            
        }
        
        else if("Monthly".equals((String) cmbPension.getSelectedItem())){
            
            String priceStr = txtPension.getText();
            double price = Double.parseDouble(priceStr);
            price = price * 1;
            priceStr = Double.toString(Math.round(price*100)/100.00);
            lblPension.setText(priceStr);
            
        }
         
        else if("Quarterly".equals((String) cmbPension.getSelectedItem())){
            
            String priceStr = txtPension.getText();
            double price = Double.parseDouble(priceStr);
            price = price / 3;
            priceStr = Double.toString(Math.round(price*100)/100.00);
            lblPension.setText(priceStr);
            
        }    
        
        else if("Yearly".equals((String) cmbPension.getSelectedItem())){
   
            String priceStr = txtPension.getText();
            double price = Double.parseDouble(priceStr);
            price = price / 12;
            priceStr = Double.toString(Math.round(price*100)/100.00);
            lblPension.setText(priceStr);
            
        } 
        
    }//GEN-LAST:event_cmbPensionActionPerformed

    private void cmbInvestmentIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbInvestmentIncomeActionPerformed
        
        if("Weekly".equals((String) cmbInvestmentIncome.getSelectedItem())){
            
            String priceStr = txtInvestmentIncome.getText();
            double price = Double.parseDouble(priceStr);
            price = price * 4 + price / 3;
            priceStr = Double.toString(Math.round(price*100)/100.00);
            lblInvestmentIncome.setText(priceStr);
            
        }
        
        else if("Monthly".equals((String) cmbInvestmentIncome.getSelectedItem())){
            
            String priceStr = txtInvestmentIncome.getText();
            double price = Double.parseDouble(priceStr);
            price = price * 1;
            priceStr = Double.toString(Math.round(price*100)/100.00);
            lblInvestmentIncome.setText(priceStr);
            
        }
         
        else if("Quarterly".equals((String) cmbInvestmentIncome.getSelectedItem())){
            
            String priceStr = txtInvestmentIncome.getText();
            double price = Double.parseDouble(priceStr);
            price = price / 3;
            priceStr = Double.toString(Math.round(price*100)/100.00);
            lblInvestmentIncome.setText(priceStr);
            
        }    
        
        else if("Yearly".equals((String) cmbInvestmentIncome.getSelectedItem())){
   
            String priceStr = txtInvestmentIncome.getText();
            double price = Double.parseDouble(priceStr);
            price = price / 12;
            priceStr = Double.toString(Math.round(price*100)/100.00);
            lblInvestmentIncome.setText(priceStr);
            
        } 
        
    }//GEN-LAST:event_cmbInvestmentIncomeActionPerformed

    private void cmbBenefitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBenefitsActionPerformed
        
        if("Weekly".equals((String) cmbBenefits.getSelectedItem())){
            
            String priceStr = txtBenefits.getText();
            double price = Double.parseDouble(priceStr);
            price = price * 4 + price / 3;
            priceStr = Double.toString(Math.round(price*100)/100.00);
            lblBenefits.setText(priceStr);
            
        }
        
        else if("Monthly".equals((String) cmbBenefits.getSelectedItem())){
            
            String priceStr = txtBenefits.getText();
            double price = Double.parseDouble(priceStr);
            price = price * 1;
            priceStr = Double.toString(Math.round(price*100)/100.00);
            lblBenefits.setText(priceStr);
            
        }
         
        else if("Quarterly".equals((String) cmbBenefits.getSelectedItem())){
            
            String priceStr = txtBenefits.getText();
            double price = Double.parseDouble(priceStr);
            price = price / 3;
            priceStr = Double.toString(Math.round(price*100)/100.00);
            lblBenefits.setText(priceStr);
            
        }    
        
        else if("Yearly".equals((String) cmbBenefits.getSelectedItem())){
   
            String priceStr = txtBenefits.getText();
            double price = Double.parseDouble(priceStr);
            price = price / 12;
            priceStr = Double.toString(Math.round(price*100)/100.00);
            lblBenefits.setText(priceStr);
            
        }
       
    }//GEN-LAST:event_cmbBenefitsActionPerformed

    private void cmbOtherIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOtherIncomeActionPerformed
        
        if("Weekly".equals((String) cmbOtherIncome.getSelectedItem())){
            
            String priceStr = txtOtherIncome.getText();
            double price = Double.parseDouble(priceStr);
            price = price * 4 + price / 3;
            priceStr = Double.toString(Math.round(price*100)/100.00);
            lblOtherIncome.setText(priceStr);
            
        }
        
        else if("Monthly".equals((String) cmbOtherIncome.getSelectedItem())){
            
            String priceStr = txtOtherIncome.getText();
            double price = Double.parseDouble(priceStr);
            price = price * 1;
            priceStr = Double.toString(Math.round(price*100)/100.00);
            lblOtherIncome.setText(priceStr);
            
        }
         
        else if("Quarterly".equals((String) cmbOtherIncome.getSelectedItem())){
            
            String priceStr = txtOtherIncome.getText();
            double price = Double.parseDouble(priceStr);
            price = price / 3;
            priceStr = Double.toString(Math.round(price*100)/100.00);
            lblOtherIncome.setText(priceStr);
            
        }    
        
        else if("Yearly".equals((String) cmbOtherIncome.getSelectedItem())){
   
            String priceStr = txtOtherIncome.getText();
            double price = Double.parseDouble(priceStr);
            price = price / 12;
            priceStr = Double.toString(Math.round(price*100)/100.00);
            lblOtherIncome.setText(priceStr);
            
        }
              
    }//GEN-LAST:event_cmbOtherIncomeActionPerformed

    private void cmdCalculateIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalculateIncomeActionPerformed
        
        double valueOne = Double.parseDouble(lblHomePay.getText());
        double valueTwo = Double.parseDouble(lblPension.getText());
        double valueThree= Double.parseDouble(lblInvestmentIncome.getText());
        double valueFour = Double.parseDouble(lblBenefits.getText());
        double valueFive = Double.parseDouble(lblOtherIncome.getText());
        double income = valueOne + valueTwo + valueThree + valueFour + valueFive;
        String totalIncome = Double.toString(Math.round(income*100)/100.00);
        txtTotalIncome.setText(String.valueOf(totalIncome));
        
    }//GEN-LAST:event_cmdCalculateIncomeActionPerformed

    private void cmdBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBackActionPerformed
        
        new Menu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cmdBackActionPerformed

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
            java.util.logging.Logger.getLogger(Income.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Income.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Income.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Income.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
            new Income().setVisible(true);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbBenefits;
    private javax.swing.JComboBox cmbHomePay;
    private javax.swing.JComboBox cmbInvestmentIncome;
    private javax.swing.JComboBox cmbOtherIncome;
    private javax.swing.JComboBox cmbPension;
    private javax.swing.JButton cmdBack;
    private javax.swing.JButton cmdCalculateIncome;
    private javax.swing.JButton cmdClearIncome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBenefits;
    private javax.swing.JLabel lblHomePay;
    private javax.swing.JLabel lblInvestmentIncome;
    private javax.swing.JLabel lblOtherIncome;
    private javax.swing.JLabel lblPension;
    private javax.swing.JTextField txtBenefits;
    private javax.swing.JTextField txtHomePay;
    private javax.swing.JTextField txtInvestmentIncome;
    private javax.swing.JTextField txtOtherIncome;
    private javax.swing.JTextField txtPension;
    private javax.swing.JTextField txtTotalIncome;
    // End of variables declaration//GEN-END:variables
}
