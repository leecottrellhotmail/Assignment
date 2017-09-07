/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phillyorderform;

import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author lee_c
 */
public class PhillyOrderJFrame extends javax.swing.JFrame implements ActionListener, ItemListener {

    private double orderTotal = 0;
    private double change = 0;
    private double tendered = 0;

    /**
     * Creates new form PhillyOrderJFrame
     */
    public PhillyOrderJFrame() {
        initComponents();
        Toolkit tools = Toolkit.getDefaultToolkit();

        this.setCheeseEnabled(false);

        chkBurger.addItemListener(this);
        btnorder.addActionListener(this);
        btnmoney.addActionListener(this);
    }

    private void setCheeseEnabled(boolean value) {
        cheesePanel.setVisible(value);
        radAmerican.setEnabled(value);
        radSwiss.setEnabled(value);
        radCheddar.setEnabled(value);
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public double getChange() {
        return change;
    }

    public void setChange(double change) {
        this.change = change;
    }

    public double getTendered() {
        return tendered;
    }

    public void setTendered(double tendered) {
        this.tendered = tendered;
    }

    public JButton getBtnmoney() {
        return btnmoney;
    }

    public void setBtnmoney(JButton btnmoney) {
        this.btnmoney = btnmoney;
    }

    public JButton getBtnorder() {
        return btnorder;
    }

    public void setBtnorder(JButton btnorder) {
        this.btnorder = btnorder;
    }

    public ButtonGroup getCheeseGroup() {
        return cheeseGroup;
    }

    public void setCheeseGroup(ButtonGroup cheeseGroup) {
        this.cheeseGroup = cheeseGroup;
    }

    public JPanel getCheesePanel() {
        return cheesePanel;
    }

    public void setCheesePanel(JPanel cheesePanel) {
        this.cheesePanel = cheesePanel;
    }

    public JCheckBox getChkBurger() {
        return chkBurger;
    }

    public void setChkBurger(JCheckBox chkBurger) {
        this.chkBurger = chkBurger;
    }

    public JCheckBox getChkCheeseSteak() {
        return chkCheeseSteak;
    }

    public void setChkCheeseSteak(JCheckBox chkCheeseSteak) {
        this.chkCheeseSteak = chkCheeseSteak;
    }

    public JCheckBox getChkChicken() {
        return chkChicken;
    }

    public void setChkChicken(JCheckBox chkChicken) {
        this.chkChicken = chkChicken;
    }

    public JCheckBox getChkFish() {
        return chkFish;
    }

    public void setChkFish(JCheckBox chkFish) {
        this.chkFish = chkFish;
    }

    public JCheckBox getChkFries() {
        return chkFries;
    }

    public void setChkFries(JCheckBox chkFries) {
        this.chkFries = chkFries;
    }

    public JCheckBox getChkPierogi() {
        return chkPierogi;
    }

    public void setChkPierogi(JCheckBox chkPierogi) {
        this.chkPierogi = chkPierogi;
    }

    public JCheckBox getChkRings() {
        return chkRings;
    }

    public void setChkRings(JCheckBox chkRings) {
        this.chkRings = chkRings;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JLabel getLblchange() {
        return lblchange;
    }

    public void setLblchange(JLabel lblchange) {
        this.lblchange = lblchange;
    }

    public JLabel getLbltotal() {
        return lbltotal;
    }

    public void setLbltotal(JLabel lbltotal) {
        this.lbltotal = lbltotal;
    }

    public JPanel getMoneyPanel() {
        return moneyPanel;
    }

    public void setMoneyPanel(JPanel moneyPanel) {
        this.moneyPanel = moneyPanel;
    }

    public JLabel getPrompt1() {
        return prompt1;
    }

    public void setPrompt1(JLabel prompt1) {
        this.prompt1 = prompt1;
    }

    public JRadioButton getRadAmerican() {
        return radAmerican;
    }

    public void setRadAmerican(JRadioButton radAmerican) {
        this.radAmerican = radAmerican;
    }

    public JRadioButton getRadCheddar() {
        return radCheddar;
    }

    public void setRadCheddar(JRadioButton radCheddar) {
        this.radCheddar = radCheddar;
    }

    public JRadioButton getRadSwiss() {
        return radSwiss;
    }

    public void setRadSwiss(JRadioButton radSwiss) {
        this.radSwiss = radSwiss;
    }

    public JPanel getSandwichPanel() {
        return sandwichPanel;
    }

    public void setSandwichPanel(JPanel sandwichPanel) {
        this.sandwichPanel = sandwichPanel;
    }

    public JPanel getSidesPanel() {
        return sidesPanel;
    }

    public void setSidesPanel(JPanel sidesPanel) {
        this.sidesPanel = sidesPanel;
    }

    public JTextField getTxtTendered() {
        return txtTendered;
    }

    public void setTxtTendered(JTextField txtTendered) {
        this.txtTendered = txtTendered;
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
        cheeseGroup = new javax.swing.ButtonGroup();
        cheesePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        radAmerican = new javax.swing.JRadioButton();
        radSwiss = new javax.swing.JRadioButton();
        radCheddar = new javax.swing.JRadioButton();
        sandwichPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        chkBurger = new javax.swing.JCheckBox();
        chkChicken = new javax.swing.JCheckBox();
        chkCheeseSteak = new javax.swing.JCheckBox();
        chkFish = new javax.swing.JCheckBox();
        sidesPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        chkFries = new javax.swing.JCheckBox();
        chkRings = new javax.swing.JCheckBox();
        chkPierogi = new javax.swing.JCheckBox();
        moneyPanel = new javax.swing.JPanel();
        prompt1 = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();
        Tendered = new javax.swing.JLabel();
        txtTendered = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lblchange = new javax.swing.JLabel();
        btnorder = new javax.swing.JButton();
        btnmoney = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cheesePanel.setLayout(new java.awt.GridLayout(5, 1));

        jLabel2.setText("Cheese");
        cheesePanel.add(jLabel2);

        cheeseGroup.add(radAmerican);
        radAmerican.setSelected(true);
        radAmerican.setText("American");
        cheesePanel.add(radAmerican);

        cheeseGroup.add(radSwiss);
        radSwiss.setText("Swiss");
        cheesePanel.add(radSwiss);

        cheeseGroup.add(radCheddar);
        radCheddar.setText("Cheddar");
        cheesePanel.add(radCheddar);

        sandwichPanel.setLayout(new java.awt.GridLayout(5, 1));

        jLabel1.setText("Sandiches");
        sandwichPanel.add(jLabel1);

        chkBurger.setText("Burger");
        sandwichPanel.add(chkBurger);

        chkChicken.setText("Chicken");
        sandwichPanel.add(chkChicken);

        chkCheeseSteak.setText("Cheesesteak");
        sandwichPanel.add(chkCheeseSteak);

        chkFish.setText("Fish");
        sandwichPanel.add(chkFish);

        sidesPanel.setLayout(new java.awt.GridLayout(5, 1));

        jLabel3.setText("Sides");
        sidesPanel.add(jLabel3);

        chkFries.setText("French Fries");
        sidesPanel.add(chkFries);

        chkRings.setText("Onion Rings");
        sidesPanel.add(chkRings);

        chkPierogi.setText("Pierogies");
        sidesPanel.add(chkPierogi);

        moneyPanel.setLayout(new java.awt.GridLayout(5, 2));

        prompt1.setText("Total Price");
        moneyPanel.add(prompt1);

        lbltotal.setText("$0.00");
        moneyPanel.add(lbltotal);

        Tendered.setText("Tendered");
        moneyPanel.add(Tendered);
        moneyPanel.add(txtTendered);

        jLabel6.setText("Change");
        moneyPanel.add(jLabel6);

        lblchange.setText("$0.00");
        moneyPanel.add(lblchange);

        btnorder.setText("Order Food");
        moneyPanel.add(btnorder);

        btnmoney.setText("Make Change");
        moneyPanel.add(btnmoney);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sandwichPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sidesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cheesePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(moneyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sandwichPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sidesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cheesePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moneyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(PhillyOrderJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhillyOrderJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhillyOrderJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhillyOrderJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhillyOrderJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Tendered;
    private javax.swing.JButton btnmoney;
    private javax.swing.JButton btnorder;
    private javax.swing.ButtonGroup cheeseGroup;
    private javax.swing.JPanel cheesePanel;
    private javax.swing.JCheckBox chkBurger;
    private javax.swing.JCheckBox chkCheeseSteak;
    private javax.swing.JCheckBox chkChicken;
    private javax.swing.JCheckBox chkFish;
    private javax.swing.JCheckBox chkFries;
    private javax.swing.JCheckBox chkPierogi;
    private javax.swing.JCheckBox chkRings;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblchange;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JPanel moneyPanel;
    private javax.swing.JLabel prompt1;
    private javax.swing.JRadioButton radAmerican;
    private javax.swing.JRadioButton radCheddar;
    private javax.swing.JRadioButton radSwiss;
    private javax.swing.JPanel sandwichPanel;
    private javax.swing.JPanel sidesPanel;
    private javax.swing.JTextField txtTendered;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent a) {
        orderTotal = 0;
        if (a.getSource().equals(btnorder)) {
            if (chkBurger.isSelected()) {
                orderTotal += 6.75;
            }
            if (chkChicken.isSelected()) {
                orderTotal += 7.75;
            }
            if (chkFish.isSelected()) {
                orderTotal += 6.75;
            }
            if (chkFries.isSelected()) {
                orderTotal++;
            }
            if (chkRings.isSelected()) {
                orderTotal += 6.75;
            }
            if (chkPierogi.isSelected()) {
                orderTotal += 2;
            }
            lbltotal.setText(orderTotal + "");

        }
        if (a.getSource().equals(btnmoney)) {
            tendered = Double.parseDouble(this.txtTendered.getText());
            change = tendered - orderTotal;
            lblchange.setText(change + "");
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (chkBurger.isSelected()) {
            setCheeseEnabled(false);
        } else {
            setCheeseEnabled(true);
        }
    }
}
