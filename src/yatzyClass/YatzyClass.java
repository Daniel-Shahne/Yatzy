package yatzyClass;

import java.util.Arrays;
import java.util.HashMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;
import javax.swing.JLabel;

public class YatzyClass extends javax.swing.JFrame {

    public YatzyClass() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblResults = new javax.swing.JTable();
        rDice1 = new javax.swing.JToggleButton();
        rDice2 = new javax.swing.JToggleButton();
        rDice3 = new javax.swing.JToggleButton();
        rDice4 = new javax.swing.JToggleButton();
        rDice5 = new javax.swing.JToggleButton();
        lblTur = new javax.swing.JLabel();
        lblKast = new javax.swing.JLabel();
        btnKastaOm = new javax.swing.JButton();
        btnSkriv = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        lblD1s = new javax.swing.JLabel();
        lblD2s = new javax.swing.JLabel();
        lblD3s = new javax.swing.JLabel();
        lblD4s = new javax.swing.JLabel();
        lblD5s = new javax.swing.JLabel();
        btnStryk = new javax.swing.JButton();
        btnFusk = new javax.swing.JButton();
        btnEnd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblResults.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        tblResults.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Ettor", null, null},
                {"Tvåor", null, null},
                {"Treor", null, null},
                {"Fyror", null, null},
                {"Femmor", null, null},
                {"Sexor", null, null},
                {"BONUS", null, null},
                {"Ett par", null, null},
                {"Två par", null, null},
                {"Tretal", null, null},
                {"Fyrtal", null, null},
                {"Kåk", null, null},
                {"Liten stege", null, null},
                {"Stor stege", null, null},
                {"Chans", null, null},
                {"Yatzy", null, null},
                {"SUMMA", null, null}
            },
            new String [] {
                "Deltagare", "Spelare 1", "Spelare 2"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblResults.setRowHeight(40);
        jScrollPane1.setViewportView(tblResults);
        if (tblResults.getColumnModel().getColumnCount() > 0) {
            tblResults.getColumnModel().getColumn(0).setMinWidth(200);
            tblResults.getColumnModel().getColumn(0).setPreferredWidth(200);
            tblResults.getColumnModel().getColumn(0).setMaxWidth(200);
            tblResults.getColumnModel().getColumn(1).setMinWidth(70);
            tblResults.getColumnModel().getColumn(1).setPreferredWidth(70);
            tblResults.getColumnModel().getColumn(1).setMaxWidth(70);
            tblResults.getColumnModel().getColumn(2).setMinWidth(70);
            tblResults.getColumnModel().getColumn(2).setPreferredWidth(70);
            tblResults.getColumnModel().getColumn(2).setMaxWidth(70);
        }

        rDice1.setEnabled(false);
        rDice1.setOpaque(false);
        rDice1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rDice1StateChanged(evt);
            }
        });

        rDice2.setEnabled(false);
        rDice2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rDice2StateChanged(evt);
            }
        });

        rDice3.setEnabled(false);
        rDice3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rDice3StateChanged(evt);
            }
        });

        rDice4.setEnabled(false);
        rDice4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rDice4StateChanged(evt);
            }
        });

        rDice5.setEnabled(false);
        rDice5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rDice5StateChanged(evt);
            }
        });

        lblTur.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblTur.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTur.setText("Det är Spelare 1s tur");

        lblKast.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblKast.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKast.setText("Antar kast kvar: 2");

        btnKastaOm.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnKastaOm.setText("Kasta om!");
        btnKastaOm.setEnabled(false);
        btnKastaOm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKastaOmActionPerformed(evt);
            }
        });

        btnSkriv.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnSkriv.setText("Skriv in");
        btnSkriv.setEnabled(false);
        btnSkriv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkrivActionPerformed(evt);
            }
        });

        lblError.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblError.setForeground(new java.awt.Color(210, 0, 0));
        lblError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnStart.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnStart.setText("Starta spel!");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        lblD1s.setText("X");

        lblD2s.setText("X");

        lblD3s.setText("X");

        lblD4s.setText("X");

        lblD5s.setText("X");

        btnStryk.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnStryk.setText("Stryk");
        btnStryk.setEnabled(false);
        btnStryk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStrykActionPerformed(evt);
            }
        });

        btnFusk.setText("test");
        btnFusk.setEnabled(false);
        btnFusk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuskActionPerformed(evt);
            }
        });

        btnEnd.setText("Sluta spel");
        btnEnd.setEnabled(false);
        btnEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEndActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(rDice1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(lblD1s)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(rDice2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(lblD2s)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(rDice3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(rDice4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(rDice5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(lblD3s)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblD5s)
                                        .addGap(50, 50, 50))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(btnFusk)
                                .addGap(50, 50, 50)
                                .addComponent(btnEnd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblTur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblKast, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblD4s)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnSkriv, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnKastaOm, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnStryk, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(lblTur, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblKast, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rDice5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rDice1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rDice2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rDice3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rDice4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblD1s)
                    .addComponent(lblD2s)
                    .addComponent(lblD3s)
                    .addComponent(lblD4s)
                    .addComponent(lblD5s))
                .addGap(37, 37, 37)
                .addComponent(btnKastaOm, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnSkriv, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnStryk, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFusk)
                    .addComponent(btnEnd))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKastaOmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKastaOmActionPerformed
    lblError.setText("");
        if (haveRollsLeft()){
            rollDices();
        }
    }//GEN-LAST:event_btnKastaOmActionPerformed

    private void rDice1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rDice1StateChanged
        diceSelectionStatus(rDice1, lblD1s);
    }//GEN-LAST:event_rDice1StateChanged

    private void rDice2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rDice2StateChanged
        diceSelectionStatus(rDice2, lblD2s);
    }//GEN-LAST:event_rDice2StateChanged

    private void rDice3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rDice3StateChanged
        diceSelectionStatus(rDice3, lblD3s);
    }//GEN-LAST:event_rDice3StateChanged

    private void rDice4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rDice4StateChanged
        diceSelectionStatus(rDice4, lblD4s);
    }//GEN-LAST:event_rDice4StateChanged

    private void rDice5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rDice5StateChanged
        diceSelectionStatus(rDice5, lblD5s);
    }//GEN-LAST:event_rDice5StateChanged

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        rollDices();
        rDice1.setEnabled(true);
        rDice2.setEnabled(true);
        rDice3.setEnabled(true);
        rDice4.setEnabled(true);
        rDice5.setEnabled(true);
        btnKastaOm.setEnabled(true);
        btnSkriv.setEnabled(true);
        btnStryk.setEnabled(true);
        btnStart.setEnabled(false);
        btnFusk.setEnabled(true);
        btnEnd.setEnabled(true);
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnSkrivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkrivActionPerformed
        lblError.setText("");
        write();
    }//GEN-LAST:event_btnSkrivActionPerformed

    private void btnStrykActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStrykActionPerformed
        stryk();
    }//GEN-LAST:event_btnStrykActionPerformed

    private void btnFuskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuskActionPerformed
        // Button only for debugging and testing
        
        dice_ints[0] = 2;
        dice_ints[1] = 2;
        dice_ints[2] = 2;
        dice_ints[3] = 2;
        dice_ints[4] = 2;
        
        refreshDiceMap();
    }//GEN-LAST:event_btnFuskActionPerformed

    private void btnEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEndActionPerformed
        gameEnd();
    }//GEN-LAST:event_btnEndActionPerformed

    /*
    Class variables initialisations, except for hashmap.
    */
    int[] dice_ints = new int[5];  
    int player_turn = 1;
    int rolls_left = 2;

    
    /*
    Method thats called once for each JToggleButton, i.e the dices.
    Rerolls the button sent as argument if its NOT selected. Saves its new int
    value in dice_ints and refreshes its image to show a dice with correct dots.
    
    @param index The index of the dice's respective int position in dice_ints.
    */
    private void rollDice(JToggleButton tbtn, int index){
        if (!(tbtn.isSelected())){
            int new_int = (int)(1 + Math.random()*6);
            dice_ints[index] = new_int;
            
            String path = "C:\\Users\\daani\\Documents\\NetBeansProjects\\Yatzy\\src\\yatzyClass\\dicepics\\dice" + new_int + ".jpg";
            Icon icon = new ImageIcon(path);
            tbtn.setIcon(icon);
        } 
    }
    
    private void rollDices(){
        rollDice(rDice1, 0);
        rollDice(rDice2, 1);
        rollDice(rDice3, 2);
        rollDice(rDice4, 3);
        rollDice(rDice5, 4);
        
        refreshDiceMap();
    }
    
    
    /*
    Called upon changed state of a dice. Changes its label underneath it to
    either ✓ or X depending on the toggle button being selected or not
    respectively.
    */
    private void diceSelectionStatus(JToggleButton tbtn, JLabel lbl){
        if (tbtn.isSelected()){
            lbl.setText("✓");
        }
        else if (!tbtn.isSelected()){
            lbl.setText("X");
        }
    }
    
    
    /*
    Checks how many re-rolls a player has left and updates the label showing it.
    Returns true if the player has re-rolls left, and subtracts one roll from
    rolls_left class variable.
    Returns false otherwise.
    */
    private boolean haveRollsLeft(){
        if (rolls_left > 0){
            rolls_left -= 1;
            lblKast.setText("Antal kast kvar: " + rolls_left);
            return true;
        }
        else{
            lblError.setText("Du har inga kast kvar!");
            return false;
        }
    }
    
    
    /*
    Changes player by changing player_turn to either 1 or 2, unselecting all 
    dice to reroll them all, and setting rolls_left to 2. Also updates labels
    */
    private void changePlayer(){
        if (player_turn == 1){
        player_turn = 2;}
        else{
        player_turn = 1;}
        
        rolls_left = 2;
        
        rDice1.setSelected(false);
        rDice2.setSelected(false);
        rDice3.setSelected(false);
        rDice4.setSelected(false);
        rDice5.setSelected(false);
        
        lblTur.setText("Det är spelare " + player_turn + "s tur");
        lblKast.setText("Antal kast kvar: 2");
        
        rollDices();
    }
    
    
    /*
    "Deletes" a row by setting its value to 0. player_turn also acts as a column
    index since its value of 1 or 2 is correct with column index.
    */
    private void stryk(){
        int row_index = tblResults.getSelectedRow();
        Object row_obj = tblResults.getValueAt(row_index, player_turn);
        
        if (row_obj == null && row_index != 6 && row_index != 16){
            tblResults.setValueAt(0, row_index, player_turn);
            changePlayer();
        }
        else if (row_index == 6 || row_index == 16){
            lblError.setText("Kan inte stryka BONUS och SUMMA");
        }
        else{
            lblError.setText("Kan inte stryka en använd rad");
        }
    }
    
    /*
    Attempts writing a result to the table. The method itself checks to see if
    the row has already been used by the player. If not, it calls one of the
    many methods below that attempt to write a result to that cell. player_turn
    also acts like a column index since its value of 1 or 2 is correct with 
    column index.
    
    TODO NEED TO FIX IF NO ROW SELECTED
    */
    private void write(){

        int row_index = tblResults.getSelectedRow();
        Object row_obj = tblResults.getValueAt(row_index, player_turn);
        
        if (row_obj == null){
            switch(row_index){
                case(0):
                    if (nOr(1) > 0){
                        tblResults.setValueAt(nOr(1), 0, player_turn);
                        changePlayer();
                        break;
                    }
                    else{
                        lblError.setText("Du har inga ettor");
                        break;
                    }
                case(1):
                    if (nOr(2) > 0){
                        tblResults.setValueAt(nOr(2), 1, player_turn);
                        changePlayer();
                        break;
                    }
                    else{
                        lblError.setText("Du har inga tvåor");
                        break;
                    }
                case(2):
                    if (nOr(3) > 0){
                        tblResults.setValueAt(nOr(3), 2, player_turn);
                        changePlayer();
                        break;
                    }
                    else{
                        lblError.setText("Du har inga treor");
                        break;
                    }
                case(3):
                    if (nOr(4) > 0){
                        tblResults.setValueAt(nOr(4), 3, player_turn);
                        changePlayer();
                        break;
                    }
                    else{
                        lblError.setText("Du har inga fyror");
                        break;
                    }
                case(4):
                    if (nOr(5) > 0){
                        tblResults.setValueAt(nOr(5), 4, player_turn);
                        changePlayer();
                        break;
                    }
                    else{
                        lblError.setText("Du har inga femmor");
                        break;
                    }
                case(5):
                    if (nOr(6) > 0){
                        tblResults.setValueAt(nOr(6), 5, player_turn);
                        changePlayer();
                        break;
                    }
                    else{
                        lblError.setText("Du har inga sexor");
                        break;
                    }
                case(6): // Spelare försöker skriva över BONUS
                    lblError.setText("BONUS räknas vid spelets slut");
                    break;
                case(7): // Ett par
                    if (onePair() > 0){
                        tblResults.setValueAt(onePair(), 7, player_turn);
                        changePlayer();
                        break;
                    }
                    else{
                        lblError.setText("Du har inga par");
                        break;
                    }
                case(8): // Två par
                    if (twoPairs() > 0){
                        tblResults.setValueAt(twoPairs(), 8, player_turn);
                        changePlayer();
                        break;
                    }
                    else{
                        lblError.setText("Du har inte två par");
                        break;
                    }
                case(9): // Tretal
                    if (tripple() > 0){
                        tblResults.setValueAt(tripple(), 9, player_turn);
                        changePlayer();
                        break;
                    }
                    else{
                        lblError.setText("Du har inte ett tretal");
                        break;
                    }
                case(10): // Fyrtal
                    if (quad() > 0){
                        tblResults.setValueAt(quad(), 10, player_turn);
                        changePlayer();
                        break;
                    }
                    else{
                        lblError.setText("Du har inte ett fyrtal");
                        break;
                    }
                case(11): // Kåk
                    if (kok() > 0){
                        tblResults.setValueAt(kok(), 11, player_turn);
                        changePlayer();
                        break;
                    }
                    else{
                        lblError.setText("Kåk kräver ett tretal och ett par");
                        break;
                    }
                case(12): // Liten stege
                    if (litenStege() > 0){
                        tblResults.setValueAt(litenStege(), 12, player_turn);
                        changePlayer();
                        break;
                    }
                    else{
                        lblError.setText("Liten stege kräver 1,2,3,4,5");
                        break;
                    }
                case(13): // Stor stege
                    if (storStege() > 0){
                        tblResults.setValueAt(storStege(), 13, player_turn);
                        changePlayer();
                        break;
                    }
                    else{
                        lblError.setText("Stor stege kräver 2,3,4,5,6");
                        break;
                    }
                case(14): // Chans
                    if (chans() > 0){
                        tblResults.setValueAt(chans(), 14, player_turn);
                        changePlayer();
                        break;
                    }
                    else{
                        lblError.setText("Hur fan lyckades du få 0 på chans");
                        break;
                    }
                case(15): // Yatzy
                    if (gotYatzy() > 0){
                        tblResults.setValueAt(gotYatzy(), 15, player_turn);
                        changePlayer();
                        break;
                    }
                    else{
                        lblError.setText("Yatzy kräver att alla tärninar är samma");
                        break;
                    }
                case(16): // Spelare försöker skriva över SUMMA
                    lblError.setText("SUMMA beräknas vid spelets slut");
                    break;
            }
        }
        else{
            lblError.setText("Rad redan använd");
        }
    }
    
    

    
    
    
    
    /*
    Used for ettor through sexor.
    
    @param n 1 for ettor, 3 for treor etc.
    */
    private int nOr(int n){
        int result = 0;
        for (int d : dice_ints){
            if (d == n){
                result += n;
            }
        }
        return result;
    }
    
    
    /*
    Compares dice_ints to liten stege requirement. First sorts dice_ints for
    comparison to work as order is accounted for, and for this creates a copy
    of dice_ints
    */
    private int litenStege(){
        int result = 0;
        
        int[] copiedArray = dice_ints.clone();
        Arrays.sort(copiedArray);
        
        int[] litenStege = {1,2,3,4,5};
        
        if (Arrays.equals(copiedArray, litenStege)){
            result = 15;
        }
        
        return result;
    }
    
    /*
    Same as above, but for stor stege which requires 2,3,4,5,6 and gives 20p.
    */
    private int storStege(){
        int result = 0;
        
        int[] copiedArray = dice_ints.clone();
        Arrays.sort(copiedArray);
        
        int[] storStege = {2,3,4,5,6};
        
        if (Arrays.equals(copiedArray, storStege)){
            result = 20;
        }
        
        return result;
    }
    
    
    /*
    Just sums up all the values in dice_ints.
    */
    private int chans(){
        int result = 0;
        for (int diceNum : dice_ints){
            result += diceNum;}
        return result;
    }
    
    
    /*
    Hashmap that will be used for the other parts of the yatzy protocol
    and should be refreshed upon each dice roll (using method below it). It
    counts how many repetitions of each dice number there are in a roll.
    */
    HashMap<Integer, Integer> diceCounts = new HashMap<>();
    
    /*
    Refreshes the diceCounts hashmap, using the elements of dice_ints. Is
    called upon each call of rollDices().
    */
    private void refreshDiceMap(){
        diceCounts.clear();
        
        diceCounts.put(1, 0);
        diceCounts.put(2, 0);
        diceCounts.put(3, 0);
        diceCounts.put(4, 0);
        diceCounts.put(5, 0);
        diceCounts.put(6, 0);
        
        for (int diceNum : dice_ints){
            diceCounts.replace(diceNum, diceCounts.get(diceNum) + 1);
        }
    }
    
    /*
    Returns the highest one-pair value, if player has 2 or more of one type of
    dice int.
    */
    private int onePair(){
        int highestNum = 0;
        for (int diceNum : diceCounts.keySet()){
            if (diceCounts.get(diceNum) >= 2 && diceNum > highestNum){
                highestNum = diceNum;
            }
        }
        return highestNum * 2;
    }
    
    
    
    /*
    Returns the sum of two pairs. First makes sure there are two pairs, i.e
    there are two values in the hashmap with the value 2.
    
    Sums by going over each dice number (the key) and checking if said key has
    a value of 2. If so += results with two times the dice number.
    */
    private int twoPairs(){
        int pairAmount = 0;
        for (int diceAmt : diceCounts.values()){
            if (diceAmt >= 2){
                pairAmount += 1;
            }
        }
        
        int result = 0;
        if (pairAmount == 2){
            for (int diceNum : diceCounts.keySet()){
                if (diceCounts.get(diceNum) >= 2){
                    result += (diceNum * 2);
                }
            }
        }
        
        return result;
    }
    
    
    /*
    Returns the triple value.
    */
    private int tripple(){
        int result = 0;
        
        for (int diceNum : diceCounts.keySet()){
            if (diceCounts.get(diceNum) >= 3){
                result = diceNum * 3;
            }
        }
        
        return result;
    }
    
    /*
    Returns the quad value.
    */
    private int quad(){
        int result = 0;
        
        for (int diceNum : diceCounts.keySet()){
            if (diceCounts.get(diceNum) >= 4){
                result = diceNum * 4;
            }
        }
        
        return result;
    }
    
    /*
    Kåk requires three dices to show one number, and the rest show another.
    First makes sure there is both a triple and one double, before summing
    the result.
    */
    private int kok(){
        int trippl = 0;
        int doubl = 0;
        int result = 0;
        
        for (int diceAmt : diceCounts.values()){
            if (diceAmt == 2){
                doubl += 1;}
            else if (diceAmt == 3){
                trippl += 1;}
        }
        
        if (doubl == 1 && trippl == 1){
            for (int diceNum : diceCounts.keySet()){
                if (diceCounts.get(diceNum) == 2){
                    result += (diceNum * 2);}
                else if (diceCounts.get(diceNum) == 3){
                    result += (diceNum * 3);}
            }
        }
        
        return result;
    }
    
    
    private int gotYatzy(){
        int result = 0;
        
        for (int diceAmt : diceCounts.values()){
            if (diceAmt == 5){
                result = 50;}
        }
        
        return result;
    }
    
    
    /*
    Ends the game by summarizing all the values and disabling all buttons.
    */
    private void gameEnd(){
        
        // Loops twice, once for each column of player data
        for (int col_index = 1; col_index < 3; col_index++){
            
            int totalSum = 0;
            
            // Sums up all the nOr rows, skips if row is empty
            for (int row_index = 0; row_index < 6; row_index++){
                Object row_obj = tblResults.getValueAt(row_index, col_index);
                if (row_obj == null){
                    continue;}
                int row_int = (Integer) row_obj;
                totalSum += row_int;
            }
            
            // Adds nOr BONUS to totalSum, if eligible.
            if (totalSum >= 63){
                tblResults.setValueAt(50, 6, col_index);
                totalSum += 50;
            }
            else{
                tblResults.setValueAt(0, 6, col_index);
            }
            
            // Sums up all the other rows with totalSum
            for (int row_index = 7; row_index < 16; row_index++){
                Object row_obj = tblResults.getValueAt(row_index, col_index);
                if (row_obj == null){
                    continue;}
                int row_int = (Integer) row_obj;
                totalSum += row_int;
            }
            
            // Writes sum to summa.
            tblResults.setValueAt(totalSum ,16, col_index);
            
        }
        
        // Declares the winner
        Integer p1Points = (Integer) tblResults.getValueAt(16, 1);
        Integer p2Points = (Integer) tblResults.getValueAt(16, 2);
        
        if (p1Points > p2Points){
            lblError.setText("Spelare 1 vinner!");}
        else{
            lblError.setText("Spelare 2 vinner!");}
        
        // Disables all the buttons
        btnKastaOm.setEnabled(false);
        btnSkriv.setEnabled(false);
        btnStryk.setEnabled(false);
        btnFusk.setEnabled(false);
        btnEnd.setEnabled(false);
    }
    
    
    
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
            java.util.logging.Logger.getLogger(YatzyClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YatzyClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YatzyClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YatzyClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YatzyClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnd;
    private javax.swing.JButton btnFusk;
    private javax.swing.JButton btnKastaOm;
    private javax.swing.JButton btnSkriv;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnStryk;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblD1s;
    private javax.swing.JLabel lblD2s;
    private javax.swing.JLabel lblD3s;
    private javax.swing.JLabel lblD4s;
    private javax.swing.JLabel lblD5s;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblKast;
    private javax.swing.JLabel lblTur;
    private javax.swing.JToggleButton rDice1;
    private javax.swing.JToggleButton rDice2;
    private javax.swing.JToggleButton rDice3;
    private javax.swing.JToggleButton rDice4;
    private javax.swing.JToggleButton rDice5;
    private javax.swing.JTable tblResults;
    // End of variables declaration//GEN-END:variables
}
