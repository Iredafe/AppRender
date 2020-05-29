/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherited_classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import schoolApp.SqlConnection;

/**
 *
 * @author Iredafe
 */
public class Assignment {
 

    
        public void addAssignment (JTextArea jTextAreaForAssignment){
    
    try{
FileReader reader = new FileReader("C:\\Users\\Iredafe\\Desktop\\Programming books\\English Assignment.txt");  
BufferedReader br = new BufferedReader (reader);
jTextAreaForAssignment.read(br, null);
br.close();
//jTextArea1.requestFocus();    
    
} catch(Exception e){
    
    JOptionPane.showMessageDialog(null, e);
    
}

    
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*    
PreparedStatement pst;
ResultSet rs;

public void addAssignmentSubjectsToComboBox(JComboBox jComboBoxForSelectAssignmentSubject){
   
    //assign fields to variables
                String queryForSubjectComboBox = "SELECT `subject name` FROM `students assignment` ";
                        
        try {
                pst = SqlConnection.getConnection().prepareStatement(queryForSubjectComboBox);
                rs = pst.executeQuery();
                        
                while (rs.next()) {
String subjectComboBox = rs.getString("subject name");
                      

//add subject to combobox if not already in combobox
                DefaultComboBoxModel combo = (DefaultComboBoxModel) jComboBoxForSelectAssignmentSubject.getModel();
                if (combo.getIndexOf(subjectComboBox)== -1) {
                    jComboBoxForSelectAssignmentSubject.addItem(subjectComboBox);  
                }
                               
        
                }
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } 
}


*/


}
