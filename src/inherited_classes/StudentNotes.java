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
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import schoolApp.SqlConnection;

/**
 *
 * @author Iredafe
 */
public class StudentNotes {


PreparedStatement pst;
ResultSet rs;

public void addSubjectsToComboBox(JComboBox jComboBoxForSelectSubject){
   
    //assign fields to variables
                String queryForSubjectComboBox = "SELECT `subject name` FROM `topic` ";
                        
        try {
                pst = SqlConnection.getConnection().prepareStatement(queryForSubjectComboBox);
                rs = pst.executeQuery();
                        
                while (rs.next()) {
String subjectComboBox = rs.getString("subject name");
                      

//add subject to combobox if not already in combobox
                DefaultComboBoxModel combo = (DefaultComboBoxModel) jComboBoxForSelectSubject.getModel();
                if (combo.getIndexOf(subjectComboBox)== -1) {
                    jComboBoxForSelectSubject.addItem(subjectComboBox);  
                }
                               
        
                }
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } 
}

    /**
     *
     * @param jTableForSelectTopic
     * @param jComboBoxForSelectSubject
     * @param jTextAreaForTopicDescription
     */
    public void addTopicsToTable(JTable jTableForSelectTopic, JComboBox jComboBoxForSelectSubject, JTextArea jTextAreaForTopicDescription) {
        String subjectName = (String) jComboBoxForSelectSubject.getSelectedItem();
        
//cast table to defaulttablemodel
        DefaultTableModel myTable=(DefaultTableModel) jTableForSelectTopic.getModel();
        
//empty table
        myTable.setRowCount(0);
        
//fetch products from database
        String queryForAddTopicToTable = "SELECT `topic name`,`topic description`, `topic notes` FROM topic "
                + "WHERE `subject name` = " + "'" + subjectName + "'";
        
        try {
            pst = SqlConnection.getConnection().prepareStatement(queryForAddTopicToTable);
            rs = pst.executeQuery();
            while (rs.next()) {
                
                String topicName = rs.getString("topic name");
    String topicDescription = rs.getString("topic description");
    String topicNoteLocation = rs.getString("topic notes");
//add selected products to table
                myTable.addRow(new Object[] {
                   topicName, topicDescription, topicNoteLocation }); 
            }
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

// create method to populate the topic description field when a topic is selected
public void  displayWhenClicked(JTextArea jTextAreaForTopicDescription, JTable jTableForSelectTopic){
    
    
int topicDescriptionRow= jTableForSelectTopic.getSelectedRow();

        DefaultTableModel model = (DefaultTableModel)jTableForSelectTopic.getModel();
            jTextAreaForTopicDescription.setText(model.getValueAt(topicDescriptionRow, 1).toString());
           

}

    
}