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
public class LibraryBooks {

            PreparedStatement pst;
            ResultSet rs;
         
            
//create a method for teacher to insert library books into database
    public void insertLectureNotes(JTextField jTextFieldForBookSubject, 
            JTextField jTextFieldForBookName,
            JTextArea jTextAreaForBookDescription, JTextField jTextFieldForAuthorName, 
            JTextField jTextFieldForBookId, JTextField jTextFieldForUploadBook) {

           
            //verify the textfields are not empty before inserting into database    

            if (jTextFieldForBookId.getText().equals("") || jTextFieldForUploadBook.getText().equals("")||jTextFieldForBookName.getText().equals("") 
                    || jTextFieldForBookSubject.getText().equals("") ||
            jTextAreaForBookDescription.getText().equals("") || jTextFieldForAuthorName.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Do not leave any field empty!");
           
            }else{
                
            }
        
        
        //assign fields to variables below
        int bookIdInsert = Integer.parseInt(jTextFieldForBookId.getText());
        String bookNameInsert = jTextFieldForBookName.getText();
        String bookDescriptionInsert = jTextAreaForBookDescription.getText();
        String authorNameInsert = jTextFieldForAuthorName.getText();
        String subjectNameInsert =jTextFieldForBookSubject.getText();
        String uploadLibraryBook =   jTextFieldForUploadBook.getText();

        //list of variables from textfields 
        try {
            String queryForInsert = "INSERT INTO `schoolapp_db`.`library` (`book id`, `book name`, "
                    + "`book description`, `author name`, `book file`, `subject name`) VALUES (?,?,?,?,?,?)";
            pst = SqlConnection.getConnection().prepareStatement(queryForInsert);

            pst.setInt(1, bookIdInsert);
            pst.setString(2, bookNameInsert);
            pst.setString(3, bookDescriptionInsert);
            pst.setString(4, authorNameInsert);
            pst.setString(5, uploadLibraryBook);
            pst.setString(6, subjectNameInsert);

            if (pst.executeUpdate() > 0) {

                JOptionPane.showMessageDialog(null, "Successfully Added");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
    }
    
    //create a method that inserts data from database into JTable whenever it is called
    public void insertIntoJTable(JTable jTableForLibrary){
        
        DefaultTableModel LibraryBooksTable= (DefaultTableModel) jTableForLibrary.getModel();
LibraryBooksTable.setRowCount(0);
        
        
    

            // to fetch data from database into the Jtable

try{
    
    String queryForJTable = "SELECT `book id`, `book name`, "
                    + "`book description`, `author name`, `book file`, `subject name` FROM `schoolapp_db`.`library`";
    
    pst = SqlConnection.getConnection().prepareStatement(queryForJTable);
    rs=pst.executeQuery();
    
    while (rs.next()){
        
      String book_Id = String.valueOf(rs.getInt("book id"));
        String book_Name = rs.getString("book name");
        String book_Description = rs.getString ("book description");
        String author_Name = rs.getString ("author name");
        String book_File = rs.getString("book file");
        String subject_Name = rs.getString("subject name");
    
        
        LibraryBooksTable.addRow(new Object [] { book_Id, subject_Name, book_Name, book_Description, author_Name, book_File});
        
    }
}
 
catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
}

    }
//       create method to Display selected Rows in Jtextfields when clicked, this will enable us update the jtable easily
        
        public void displayWhenClicked(JTextField jTextFieldForBookSubject, 
            JTextField jTextFieldForBookName,
            JTextArea jTextAreaForBookDescription, JTextField jTextFieldForAuthorName, 
            JTextField jTextFieldForBookId, JTextField jTextFieldForUploadBook, JTable jTableForLibrary) {

        int selectRow = jTableForLibrary.getSelectedRow();

        DefaultTableModel model = (DefaultTableModel)jTableForLibrary.getModel();
            jTextFieldForBookId.setText(model.getValueAt(selectRow, 0).toString());
            jTextFieldForBookSubject.setText(model.getValueAt(selectRow, 1).toString());
            jTextFieldForBookName.setText(model.getValueAt(selectRow, 2).toString());
            jTextFieldForAuthorName.setText(model.getValueAt(selectRow, 4).toString());
            jTextAreaForBookDescription.setText(model.getValueAt(selectRow, 3).toString());
            jTextFieldForUploadBook.setText(model.getValueAt(selectRow, 5).toString());

        }

        
            //create a method for teacher to update lecture notes in database

        
    public void updateLibraryBooks(JTextField jTextFieldForBookSubject, 
            JTextField jTextFieldForBookName,
            JTextArea jTextAreaForBookDescription, JTextField jTextFieldForAuthorName, 
            JTextField jTextFieldForBookId, JTextField jTextFieldForUploadBook) {

        //verify the textfields are not empty before inserting into database    

            if (jTextFieldForBookId.getText().equals("") || jTextFieldForUploadBook.getText().equals("")||jTextFieldForBookName.getText().equals("") 
                    || jTextFieldForBookSubject.getText().equals("") ||
            jTextAreaForBookDescription.getText().equals("") || jTextFieldForAuthorName.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Do not leave any field empty!");
           
            }else{
                
            }
                //Revisit this code above **IMPORTANT NOTICE**
                /*this code above seems not to be providing the desired result as empty 
                *textfields are still being update into the database. This is strange 
                *because the same control flow statement was used for inserting values into the 
                  database above and it worked seamlessly */
            
                

//assign fields to variables below
        String bookSubjectUpdate = jTextFieldForBookSubject.getText();
        int bookIdUpdate = Integer.parseInt(jTextFieldForBookId.getText());
        String bookNameUpdate = jTextFieldForBookName.getText();
        String bookDescriptionUpdate = jTextAreaForBookDescription.getText();
        String uploadBookUpdate = jTextFieldForUploadBook.getText();
        String authorNameUpdate = jTextFieldForAuthorName.getText();



      //update database with what is in textfield
        try {
            String queryForLibraryUpdate = "UPDATE `schoolapp_db`.`library` SET `book id`='"+bookIdUpdate+"', "
                    + "`book name`='"+bookNameUpdate+"',"
                    + " `book description`='"+bookDescriptionUpdate+"', "
                    + "`author name`='"+authorNameUpdate+"', "
                    + "`book file`='"+uploadBookUpdate+"', "
                    + "`subject name`='"+bookSubjectUpdate+"' "
            + "WHERE `book id`='"+bookIdUpdate+"'";
            
            
            pst = SqlConnection.getConnection().prepareStatement(queryForLibraryUpdate);

          
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

    //create a method for teacher to delete lecture notes in database

    public void deleteLibraryBooks( JTextField jTextFieldForBookId) {

        
        //assign fields to variables below
        
        int bookIdDelete = Integer.parseInt(jTextFieldForBookId.getText());
        

        
//DELETE FROM database with what is in textfield
        try {
            String queryDeleteForLibrary = "DELETE FROM `schoolapp_db`.`library` WHERE `book id`='"+bookIdDelete+"'";
                   
            pst = SqlConnection.getConnection().prepareStatement(queryDeleteForLibrary);

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


