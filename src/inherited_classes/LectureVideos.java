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
public class LectureVideos {
    
                PreparedStatement pst;
            ResultSet rs;
         
            
//create a method for teacher to insert lecture notes into database
    public void insertLectureVideos(JTextField jTextFieldForVideoId, 
            JTextField jTextFieldForSubjectName,
             JTextField jTextFieldForVideoName, JTextArea jTextAreaForVideoDescription, 
            JTextField jTextFieldForVideoUpload) {

           
            //verify the textfields are not empty before inserting into database    

            if (jTextFieldForVideoId.getText().equals("") || jTextFieldForSubjectName.getText().equals("") 
                    || jTextFieldForVideoName.getText().equals("") ||
            jTextAreaForVideoDescription.getText().equals("") || jTextFieldForVideoUpload.getText().equals("")){
     
                JOptionPane.showMessageDialog(null, "Do not leave any field empty!");
           
            }else{
                
            }
        
        
        //assign fields to variables below
        int videoId = Integer.parseInt(jTextFieldForVideoId.getText());
        String videoSubjectName = jTextFieldForSubjectName.getText();
        String videoName = jTextFieldForVideoName.getText();
        String videoDescription = jTextAreaForVideoDescription.getText();
        String videoFile = jTextFieldForVideoUpload.getText();


           //list of variables from textfields 
        try {
            String queryForVideoInsert = "INSERT INTO `schoolapp_db`.`video` (`video id`,`video name`, `video description`, "
                    + "`video file`, `subject name`) VALUES (?,?,?,?,?)";
            pst = SqlConnection.getConnection().prepareStatement(queryForVideoInsert);

            pst.setInt(1, videoId);
            pst.setString(2, videoName);
            pst.setString(3, videoDescription);
            pst.setString(4, videoFile);
            pst.setString(5, videoSubjectName);

            if (pst.executeUpdate() > 0) {

                JOptionPane.showMessageDialog(null, "Successfully Added");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
 
    
    
  }

    //create a method that inserts data from database into JTable whenever it is called

    public void insertVideosIntoJTable(JTable jTableForLectureVideos){
        
        DefaultTableModel LectureVideoTable= (DefaultTableModel) jTableForLectureVideos.getModel();
LectureVideoTable.setRowCount(0);
        
        
        // to fetch data from database into the Jtable

        try{
    
    String videoQuery = "SELECT `video id`, `video name`,`video description`,"
            + "`video file`, `subject name` FROM video";
    
    pst = SqlConnection.getConnection().prepareStatement(videoQuery);
    rs=pst.executeQuery();
    
    while (rs.next()){
        
        String video_Id = String.valueOf(rs.getInt("video id"));
        String subject_Name = rs.getString("subject name");
        String video_Name = rs.getString ("video name");
        String video_Description = rs.getString ("video description");
        String video_File = rs.getString("video file");
    
        
        LectureVideoTable.addRow(new Object [] { video_Id, subject_Name, video_Name, video_Description, video_File});
        
    }
}
 
catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
}

    }

//       create method to Display selected Rows in Jtextfields when clicked, this will enable us update the jtable easily
        
        public void displayWhenClicked (JTextField jTextFieldForVideoId, 
            JTextField jTextFieldForSubjectName,
             JTextField jTextFieldForVideoName, JTextArea jTextAreaForVideoDescription, 
            JTextField jTextFieldForVideoUpload, JTable jTableForLectureVideos) {

        int i= jTableForLectureVideos.getSelectedRow();

        DefaultTableModel model = (DefaultTableModel)jTableForLectureVideos.getModel();
            jTextFieldForVideoId.setText(model.getValueAt(i, 0).toString());
            jTextFieldForSubjectName.setText(model.getValueAt(i, 1).toString());
            jTextFieldForVideoName.setText(model.getValueAt(i, 2).toString());
            jTextAreaForVideoDescription.setText(model.getValueAt(i, 3).toString());
            jTextFieldForVideoUpload.setText(model.getValueAt(i, 4).toString());

        }
 
    //create a method for teacher to update lecture notes in database

        
    public void updateLectureVideos(JTextField jTextFieldForVideoId, 
            JTextField jTextFieldForSubjectName,
             JTextField jTextFieldForVideoName, JTextArea jTextAreaForVideoDescription, 
            JTextField jTextFieldForVideoUpload) {

        //verify the textfields are not empty before inserting into database    


            if (jTextFieldForVideoId.getText().equals("") || jTextFieldForSubjectName.getText().equals("") 
                    || jTextFieldForVideoName.getText().equals("") ||
            jTextAreaForVideoDescription.getText().equals("") || jTextFieldForVideoUpload.getText().equals("")){
     
                JOptionPane.showMessageDialog(null, "Do not leave any field empty!");
           
            }else{
                
            }

                //Revisit this code above **IMPORTANT NOTICE**
                /*this code above seems not to be providing the desired result as empty 
                *textfields are still being update into the database. This is strange 
                *because the same control flow statement was used for inserting values into the 
                  database above and it worked seamlessly */
            
  
        //assign fields to variables below
        
        int videoIdUpdate = Integer.parseInt(jTextFieldForVideoId.getText());
        String subjectNameUpdate = jTextFieldForSubjectName.getText();
        String videoNameUpdate = jTextFieldForVideoName.getText();
        String videoDescriptionUpdate = jTextAreaForVideoDescription.getText();
        String videoUploadUpdate = jTextFieldForVideoUpload.getText();

        
//update database with what is in textfield
        try {
            String queryUpdate = "UPDATE `schoolapp_db`.`video` SET `video id`='"+videoIdUpdate+"', "
                    + "`subject name`='"+subjectNameUpdate+"',"
                    + " `video name`='"+videoNameUpdate+"', "
                    + "`video description`='"+videoDescriptionUpdate+"', "
                    + "`video file`='"+videoUploadUpdate+"' "
                    + "WHERE `video id`='"+videoIdUpdate+"'";
            
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

    public void deleteLectureVideos(JTextField jTextFieldForVideoId) {

        
        //assign fields to variables below
        
        int videoIdDelete = Integer.parseInt(jTextFieldForVideoId.getText());
        
        
//DELETE FROM database with what is in textfield
        try {
            String queryDeleteVideo = "DELETE FROM `schoolapp_db`.`video` WHERE `video id`='"+videoIdDelete+"'";
                   
            pst = SqlConnection.getConnection().prepareStatement(queryDeleteVideo);

          
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