/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherited_classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import schoolApp.SqlConnection;

/**
 *
 * @author Iredafe
 */
public class StudentVideos {
 
    
    PreparedStatement pst;
    ResultSet rs;
    
    public void addVideosToComboBox(JComboBox jComboBoxForVideoSubject){
        
    //assign fields to variables
       
    
    
    String queryForVideoComboBox = "SELECT `subject name` FROM `video` ";
                        
        try {
                pst = SqlConnection.getConnection().prepareStatement(queryForVideoComboBox);
                rs = pst.executeQuery();
                        
                while (rs.next()) {
String videoComboBox = rs.getString("subject name");
    

//add subject to combobox if not already in combobox


                DefaultComboBoxModel combo2 = (DefaultComboBoxModel) jComboBoxForVideoSubject.getModel();
                if (combo2.getIndexOf(videoComboBox)== -1) {
                   jComboBoxForVideoSubject.addItem(videoComboBox);  
                }
        
                }
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } 
}
        public void addVideosToTable(JComboBox jComboBoxForVideoSubject, JTable jTableForStudentVideo){
       
        String videoComboName = (String) jComboBoxForVideoSubject.getSelectedItem();
        
//cast table to defaulttablemodel
        DefaultTableModel myVideo =(DefaultTableModel) jTableForStudentVideo.getModel();
//empty table
        myVideo.setRowCount(0);
        
//fetch products from database
        String queryForStudentVideo = "SELECT `video name` FROM video "
                + "WHERE `subject name` = '" + videoComboName + "'";
        
        try {
            pst = SqlConnection.getConnection().prepareStatement(queryForStudentVideo);
            rs = pst.executeQuery();
            while (rs.next()) {
                
                String videoName = rs.getString("video name");
                
//add selected products to table
                myVideo.addRow(new Object[] {
                   videoName }); 
            }
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }


    }
    

