/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.CustomerBooking;

import Business.Airliners;
import Business.AirlinersDirectory;
import Business.FlightScheDirectory;
import Business.Flights;
import Business.Passenger;
import Business.PassengerDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adhar
 */
public class bestFlightJPanel extends javax.swing.JPanel {
    
    public JPanel rightJPanel;
    public FlightScheDirectory flightScheDirectory;
    
   // private AirlinersDirectory airlinersDirectory;
    //private Airliners airliners;
    
    public PassengerDirectory passengerDirectory;
    public Passenger passenger;
    public Flights flights;
    //public ArrayList<Flights> getFlightData();
    /**
     * Creates new form bestFlightJPanel
     */
    
   public bestFlightJPanel(JPanel rightJPanel, FlightScheDirectory flightScheDirectory, PassengerDirectory passengerDirectory, Flights flights) {
        initComponents();
        this.flightScheDirectory = flightScheDirectory;
        this.rightJPanel = rightJPanel;
        //this.airlinersDirectory = airlinersDirectory;
       // this.airliners = airliners;
       this.passengerDirectory = passengerDirectory;
        this.passenger = passenger; 
        this.flights = flights;
       //populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        listTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        bookBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        fromtxtField = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        toTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dateTextField = new javax.swing.JTextField();

        listTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airliner Name :", "Airplane Name :", "Flight Name :", "Departure Time :", "Departure Date :", "FROM :", "TO :", "Price"
            }
        ));
        jScrollPane2.setViewportView(listTable1);

        jLabel1.setText("Search Flights");

        bookBtn.setText("Book Ticket");
        bookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookBtnActionPerformed(evt);
            }
        });

        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel4.setText("Search Flight :");

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("From :");

        jLabel3.setText("TO :");

        jLabel5.setText("Date :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addGap(272, 272, 272)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addComponent(bookBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel4)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dateTextField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fromtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(27, 27, 27)
                        .addComponent(toTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchBtn)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backBtn))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fromtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(toTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(bookBtn)
                .addContainerGap(230, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        rightJPanel.remove(this);
        CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.previous(rightJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void bookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookBtnActionPerformed
        // TODO add your handling code here:
        int selectedrow = listTable1.getSelectedRow();
        if(selectedrow<0)
        {
            JOptionPane.showMessageDialog(null,"Please select any row");
        
        }
        else{
            
        
        Flights flights = (Flights)listTable1.getValueAt(selectedrow,0);
        ticketCustJPanel panel = new ticketCustJPanel(rightJPanel,  flights, passengerDirectory, flightScheDirectory);
        rightJPanel.add("ticketCustJPanel", panel);
        CardLayout layout = (CardLayout)rightJPanel.getLayout();
        layout.next(rightJPanel);
        
           
        } 
       /*  int selectedRow = listTable.getSelectedRow();
        if (selectedRow  >=  0)
        {
                 
                
              //  int total = flight.getPrice()
            JOptionPane.showMessageDialog(null,"Ticket has been booked!  Enjoy");
        }*/
    }//GEN-LAST:event_bookBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        
         int input =0;
       // flightName = searchTextField.getText();
       String from = fromtxtField.getText();
       String to = toTextField.getText();
       String da = dateTextField.getText();
       if(from.equalsIgnoreCase("") || to.equalsIgnoreCase("") || da.equals(""))
       {
           JOptionPane.showMessageDialog(null, "Field(s) can't be empty!");
       }
       
       else{
          
        DefaultTableModel dtm = (DefaultTableModel)listTable1.getModel();
        dtm.setRowCount(0);
        for ( Flights flights : flightScheDirectory.getFlightData())
        {
            if (from.equalsIgnoreCase(flights.getDeparture()) && (to.equalsIgnoreCase(flights.getArrive())) && (da.equals(flights.getDepDate())))
        
        {   //input =1;
            Object row[]= new Object [8];
            row[0] = flights;
            row[1] = flights.getAirplaneName();
            row[2] = flights.getFlightName();
            row[3] = flights.getDepTime();
            row[4] = flights.getDepDate();
            row[5] = flights.getDeparture();
            row[6] = flights.getArrive();
            row[7] = flights.getPrice();
            dtm.addRow(row);
            
            
        }
         }
       }
       
    }//GEN-LAST:event_searchBtnActionPerformed
 /*private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel)listTable1.getModel();
        dtm.setRowCount(0);
        for ( Flights flight : flightScheDirectory.getFlightData())
        {
            Object row[]= new Object [7];
            row[0] = flight;
            row[1] = flight.getFlightName();
            row[2] = flight.getDepTime();
            row[3] = flight.getDepDate();
            row[4] = flight.getDeparture();
            row[5] = flight.getArrive();
            row[6] = flight.getPrice();
            dtm.addRow(row);
            
            
        }
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton bookBtn;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JTextField fromtxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable listTable1;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField toTextField;
    // End of variables declaration//GEN-END:variables
}

