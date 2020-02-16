/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherited_classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import schoolApp.SqlConnection;

/**
 *
 * @author Iredafe
 */
public class LectureNotes {

            PreparedStatement pst;
            ResultSet rs;
         
            
//create a method for teacher to insert lecture notes into database
    public void insertLectureNotes(JTextField jTextFieldForEnterSubjectName, 
            JTextField jTextFieldForEnterTopic,
            JTextArea jTextAreaForTopicDescription, JTextField jTextFieldForUploadNotes, 
            JTextField jTextFieldForTopicNumber) {

           
            //verify the textfields are not empty before inserting into database    

            if (jTextFieldForTopicNumber.getText().equals("") || jTextFieldForEnterSubjectName.getText().equals("") 
                    || jTextFieldForEnterTopic.getText().equals("") ||
            jTextAreaForTopicDescription.getText().equals("") || jTextFieldForUploadNotes.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Do not leave any field empty!");
           
            }else{
                
            }
        
        
        //assign fields to variables below
        int topicId = Integer.parseInt(jTextFieldForTopicNumber.getText());
        String topicName = jTextFieldForEnterTopic.getText();
        String topicDescription = jTextAreaForTopicDescription.getText();
        String topicNotes = jTextFieldForUploadNotes.getText();
        String subjectName = jTextFieldForEnterSubjectName.getText();


        //list of variables from textfields 
        try {
            String queryForInsert = "INSERT INTO `schoolapp_db`.`topic` (`topic id`,`topic name`, `topic description`, "
                    + "`topic notes`, `subject name`) VALUES (?,?,?,?,?)";
            pst = SqlConnection.getConnection().prepareStatement(queryForInsert);

            pst.setInt(1, topicId);
            pst.setString(2, topicName);
            pst.setString(3, topicDescription);
            pst.setString(4, topicNotes);
            pst.setString(5, subjectName);

            if (pst.executeUpdate() > 0) {

                JOptionPane.showMessageDialog(null, "Successfully Added");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
    }

    //create a method that inserts data from database into JTable whenever it is called
    public void insertIntoJTable(JTable jTableForLectureNotes){
        
        DefaultTableModel LectureNoteTable= (DefaultTableModel) jTableForLectureNotes.getModel();
LectureNoteTable.setRowCount(0);
        
        
        // to fetch data from database into the Jtable

try{
    
    String query = "SELECT `topic id`, `subject name`,`topic name`,"
            + "`topic description`, `topic notes` FROM topic";
    
    pst = SqlConnection.getConnection().prepareStatement(query);
    rs=pst.executeQuery();
    
    while (rs.next()){
        
        String topic_Id = String.valueOf(rs.getInt("topic id"));
        String subject_Name = rs.getString("subject name");
        String topic_Name = rs.getString ("topic name");
        String topic_Description = rs.getString ("topic description");
        String topic_Notes = rs.getString("topic notes");
    
        
        LectureNoteTable.addRow(new Object [] { topic_Id, subject_Name, topic_Name, topic_Description, topic_Notes});
        
    }
}
 
catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
}

    }


//       create method to Display selected Rows in Jtextfields when clicked, this will enable us update the jtable easily
        
        public void displayWhenClicked(JTable jTableForLectureNotes, 
                JTextField jTextFieldForEnterSubjectName, JTextField jTextFieldForEnterTopic,
            JTextArea jTextAreaForTopicDescription, JTextField jTextFieldForUploadNotes, JTextField jTextFieldForTopicNumber){

      
            int i= jTableForLectureNotes.getSelectedRow();

        DefaultTableModel model = (DefaultTableModel)jTableForLectureNotes.getModel();
            jTextFieldForTopicNumber.setText(model.getValueAt(i, 0).toString());
            jTextFieldForEnterSubjectName.setText(model.getValueAt(i, 1).toString());
            jTextFieldForEnterTopic.setText(model.getValueAt(i, 2).toString());
            jTextAreaForTopicDescription.setText(model.getValueAt(i, 3).toString());
            jTextFieldForUploadNotes.setText(model.getValueAt(i, 4).toString());

        }
 
    //create a method for teacher to update lecture notes in database

        
    public void updateLectureNotes(JTextField jTextFieldForEnterSubjectName,
            JTextField jTextFieldForEnterTopic,
            JTextArea jTextAreaForTopicDescription, JTextField jTextFieldForUploadNotes, JTextField jTextFieldForTopicNumber)
    {
        //verify the textfields are not empty before inserting into database    

            if (jTextFieldForEnterSubjectName.getText().equals("") || jTextFieldForEnterTopic.getText().equals("") ||
            jTextAreaForTopicDescription.getText().equals("") || 
            jTextFieldForUploadNotes.getText().equals("")||jTextFieldForTopicNumber.getText().equals(null)){
                JOptionPane.showMessageDialog(null, "Do not leave any field empty!");

                //Revisit this code above **IMPORTANT NOTICE**
                /*this code above seems not to be providing the desired result as empty 
                *textfields are still being update into the database. This is strange 
                *because the same control flow statement was used for inserting values into the 
                  database above and it worked seamlessly */
            

}else{
                
            }

        //assign fields to variables below
        
        int topicIdUpdate = Integer.parseInt(jTextFieldForTopicNumber.getText());
        String topicNameUpdate = jTextFieldForEnterTopic.getText();
        String topicDescriptionUpdate = jTextAreaForTopicDescription.getText();
        String topicNotesUpdate = jTextFieldForUploadNotes.getText();
        String subjectNameUpdate = jTextFieldForEnterSubjectName.getText();

        
//update database with what is in textfield
        try {
            String queryUpdate = "UPDATE `schoolapp_db`.`topic` SET `topic id`='"+topicIdUpdate+"', "
                    + "`topic name`='"+topicNameUpdate+"',"
                    + " `topic description`='"+topicDescriptionUpdate+"', "
                    + "`topic notes`='"+topicNotesUpdate+"', "
                    + "`subject name`='"+subjectNameUpdate+"' "
                    + "WHERE `topic id`='"+topicIdUpdate+"'";
            
            pst = SqlConnection.getConnection().prepareStatement(queryUpdate);

          
//connect your fields to the database
                
           
   if (pst.executeUpdate()> 0) {
                                JOptionPane.showMessageDialog(null,"Data was successfully updated!");
                            } else {
                                JOptionPane.showMessageDialog(null,"Data was not updated!");
                            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }



    }

    //create a method for user to delete lecture notes in database

    public void deleteLectureNotes(JTextField jTextFieldForTopicNumber) {

        
        //assign fields to variables below
        
        int topicIdDelete = Integer.parseInt(jTextFieldForTopicNumber.getText());
        
        
//DELETE FROM database with what is in textfield
        try {
            String queryDelete = "DELETE FROM `schoolapp_db`.`topic` WHERE `topic id`='"+topicIdDelete+"'";
                   
            pst = SqlConnection.getConnection().prepareStatement(queryDelete);

          
//connect your fields to the database
                
           
   if (pst.executeUpdate()> 0) {
                                JOptionPane.showMessageDialog(null,"Data was successfully Deleted!");
                            } else {
                                JOptionPane.showMessageDialog(null,"Data was not Deleted!");
                            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
    
    }
    
}
