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
public class StudentLibrary {
    
PreparedStatement pst;
ResultSet rs;

    
    
public void addSubjectsToLibraryComboBox( JComboBox jComboBoxForLibrarySubject){
 
    
    //assign fields to variables
                String queryForSubjectComboBox = "SELECT `subject name` FROM `library` ";
                        
        try {
                pst = SqlConnection.getConnection().prepareStatement(queryForSubjectComboBox);
                rs = pst.executeQuery();
                        
                while (rs.next()) {
String libraryComboBox = rs.getString("subject name");
    
                    

//add subject to combobox if not already in combobox
                
                                DefaultComboBoxModel combo2 = (DefaultComboBoxModel) jComboBoxForLibrarySubject.getModel();
                if (combo2.getIndexOf(libraryComboBox)== -1) {
                   jComboBoxForLibrarySubject.addItem(libraryComboBox);  
                }
        
                }
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } 
}

    public void addBooksToTable(JComboBox jComboBoxForLibrarySubject, JTable jTableForLibraryBook){
       
        String libraryComboName = (String) jComboBoxForLibrarySubject.getSelectedItem();
        
//cast table to defaulttablemodel
        DefaultTableModel myBookTable=(DefaultTableModel) jTableForLibraryBook.getModel();
        
//empty table
        myBookTable.setRowCount(0);
        
//fetch products from database
        String queryForAddBookToLibrary = "SELECT `book name`, `author name`, `book file`, `book description` FROM library "
                + "WHERE `subject name` = " + "'" + libraryComboName + "'";
        
        try {
            pst = SqlConnection.getConnection().prepareStatement(queryForAddBookToLibrary);
            rs = pst.executeQuery();
            while (rs.next()) {
                
                String bookName = rs.getString("book name");
                String authorName=rs.getString("author name");
                String bookFileLocation= rs.getString("book file");
                String bookDescription = rs.getString("book description");
//add selected products to table
                myBookTable.addRow(new Object[] {
                   bookName, authorName, bookDescription, bookFileLocation }); 
            }
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public void  displayWhenClicked(JTextArea jTextAreaForLibraryBookDescription, JTable jTableForLibraryBook){
    
    
int bookDescription = jTableForLibraryBook.getSelectedRow();

        DefaultTableModel model = (DefaultTableModel)jTableForLibraryBook.getModel();
            jTextAreaForLibraryBookDescription.setText(model.getValueAt(bookDescription, 2).toString());
           

}


    }
    
    

