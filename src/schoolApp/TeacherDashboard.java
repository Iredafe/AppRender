/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolApp;

import inherited_classes.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Iredafe
 */
public class TeacherDashboard extends javax.swing.JFrame {

    /**
     * Creates new form TeacherDashboard
     */
    public TeacherDashboard() {
        initComponents();

        setLocationRelativeTo(null);

LectureNotes myLectureNotes = new LectureNotes();
myLectureNotes.insertIntoJTable(jTableForLectureNotes);

LibraryBooks myLibraryBooks = new LibraryBooks();
myLibraryBooks.insertIntoJTable(jTableForLibrary);

LectureVideos myLectureVideos = new LectureVideos();
myLectureVideos.insertVideosIntoJTable(jTableForLectureVideos);
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jTabbedPaneForHomeAndDashboard = new javax.swing.JTabbedPane();
        teacherHomeDashboardPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        myLectureHome = new javax.swing.JButton();
        myScheduleHome = new javax.swing.JButton();
        myAssessmentsHome = new javax.swing.JButton();
        studentGradesHome = new javax.swing.JButton();
        myExaminationsHome = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        MainDashboardPanel = new javax.swing.JPanel();
        topDashboard = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        leftDashboard = new javax.swing.JPanel();
        assessmentBtn = new javax.swing.JButton();
        examsBtn = new javax.swing.JButton();
        gradesBtn = new javax.swing.JButton();
        scheduleBtn = new javax.swing.JButton();
        lectureBtn1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        subTopDashboard = new javax.swing.JPanel();
        settingsInSubTopPanel = new javax.swing.JLabel();
        labelForSubTopPanel = new javax.swing.JLabel();
        jLabelForPanels = new javax.swing.JLabel();
        jTabbedPaneForTeacherDashboard = new javax.swing.JTabbedPane();
        lecturePanel = new javax.swing.JPanel();
        jTabbedPaneForLectureBtn = new javax.swing.JTabbedPane();
        addSubjectPanel = new javax.swing.JPanel();
        jButtonForAttach = new javax.swing.JButton();
        jButtonForInsert = new javax.swing.JButton();
        jTextFieldForTopicNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldForUploadNotes = new javax.swing.JTextField();
        jButtonForClear = new javax.swing.JButton();
        jButtonForHome = new javax.swing.JButton();
        jButtonForVideo = new javax.swing.JButton();
        jButtonForLibrary = new javax.swing.JButton();
        jButtonForView = new javax.swing.JButton();
        jTextFieldForEnterTopic = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jButtonForEdit = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTableForLectureNotes = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextAreaForTopicDescription = new javax.swing.JTextArea();
        jButtonForDelete1 = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jTextFieldForEnterSubjectName = new javax.swing.JTextField();
        uploadVideoPanel = new javax.swing.JPanel();
        jButtonForAddVideo = new javax.swing.JButton();
        jButtonToHome = new javax.swing.JButton();
        jButtonForLibraryFromVideo = new javax.swing.JButton();
        jTextFieldForVideoUpload = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldForVideoName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaForVideoDescription = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButtonForViewFromVideo = new javax.swing.JButton();
        jButtonForUpdateVideo = new javax.swing.JButton();
        jButtonForAttachFromVideo = new javax.swing.JButton();
        jButtonForNotesFromVideo = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldForSubjectName = new javax.swing.JTextField();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTableForLectureVideos = new javax.swing.JTable();
        jTextFieldForVideoId = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jButtonForDelete2 = new javax.swing.JButton();
        jButtonForClear2 = new javax.swing.JButton();
        addToLibraryPanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldForBookSubject = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldForAuthorName = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jTextFieldForUploadBook = new javax.swing.JTextField();
        jButton21 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButtonForVideo1 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaForBookDescription = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTableForLibrary = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jTextFieldForBookName = new javax.swing.JTextField();
        jTextFieldForBookId = new javax.swing.JTextField();
        jButtonForClear1 = new javax.swing.JButton();
        ViewPanel = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        schedulePanel = new javax.swing.JPanel();
        assessmentPanel = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jTextFieldForEnterSubjectName1 = new javax.swing.JTextField();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTableForLectureNotes1 = new javax.swing.JTable();
        jTextFieldForTopicNumber1 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldForEnterTopic1 = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextAreaForTopicDescription1 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldForUploadNotes1 = new javax.swing.JTextField();
        jButtonForAttach1 = new javax.swing.JButton();
        jButtonForInsert1 = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        examsPanel = new javax.swing.JPanel();
        gradesPanel = new javax.swing.JPanel();
        Assignments = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jTextFieldForEnterSubjectName2 = new javax.swing.JTextField();
        jTextFieldForTopicNumber2 = new javax.swing.JTextField();
        jTextFieldForEnterTopic2 = new javax.swing.JTextField();
        jTextFieldForUploadNotes2 = new javax.swing.JTextField();
        jButtonForAttach2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTableForLectureNotes2 = new javax.swing.JTable();
        jButtonForInsert2 = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));
        setMinimumSize(new java.awt.Dimension(1210, 655));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        teacherHomeDashboardPanel.setBackground(new java.awt.Color(0, 102, 102));
        teacherHomeDashboardPanel.setMinimumSize(new java.awt.Dimension(1210, 640));
        teacherHomeDashboardPanel.setPreferredSize(new java.awt.Dimension(1210, 640));
        teacherHomeDashboardPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/black teacher.png"))); // NOI18N
        teacherHomeDashboardPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 810, 490));

        myLectureHome.setBackground(new java.awt.Color(153, 255, 153));
        myLectureHome.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        myLectureHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/presentation (1).png"))); // NOI18N
        myLectureHome.setText("My Lectures");
        myLectureHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        myLectureHome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        myLectureHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myLectureHomeActionPerformed(evt);
            }
        });
        teacherHomeDashboardPanel.add(myLectureHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 160, 120));

        myScheduleHome.setBackground(new java.awt.Color(153, 255, 153));
        myScheduleHome.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        myScheduleHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/work schedule.png"))); // NOI18N
        myScheduleHome.setText("My Schedule");
        myScheduleHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        myScheduleHome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        myScheduleHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myScheduleHomeActionPerformed(evt);
            }
        });
        teacherHomeDashboardPanel.add(myScheduleHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 160, 120));

        myAssessmentsHome.setBackground(new java.awt.Color(153, 255, 153));
        myAssessmentsHome.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        myAssessmentsHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/report.png"))); // NOI18N
        myAssessmentsHome.setText("My Assessments");
        myAssessmentsHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        myAssessmentsHome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        myAssessmentsHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myAssessmentsHomeActionPerformed(evt);
            }
        });
        teacherHomeDashboardPanel.add(myAssessmentsHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 160, 110));

        studentGradesHome.setBackground(new java.awt.Color(153, 255, 153));
        studentGradesHome.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        studentGradesHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/score.png"))); // NOI18N
        studentGradesHome.setText("Student Grades");
        studentGradesHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        studentGradesHome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        studentGradesHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentGradesHomeActionPerformed(evt);
            }
        });
        teacherHomeDashboardPanel.add(studentGradesHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 160, 120));

        myExaminationsHome.setBackground(new java.awt.Color(153, 255, 153));
        myExaminationsHome.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        myExaminationsHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/reunion.png"))); // NOI18N
        myExaminationsHome.setText("My Examinations");
        myExaminationsHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        myExaminationsHome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        myExaminationsHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myExaminationsHomeActionPerformed(evt);
            }
        });
        teacherHomeDashboardPanel.add(myExaminationsHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 160, 110));

        jButton5.setBackground(new java.awt.Color(153, 255, 153));
        jButton5.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jButton5.setText("Log Out");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        teacherHomeDashboardPanel.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Welcome To");
        teacherHomeDashboardPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 210, 30));

        jLabel3.setFont(new java.awt.Font("Goudy Stout", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("ABC GROUP OF SCHOOLS");
        teacherHomeDashboardPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jLabel30.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Teachers' Portal");
        teacherHomeDashboardPanel.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 110, -1));

        jTabbedPaneForHomeAndDashboard.addTab("tab1", teacherHomeDashboardPanel);

        MainDashboardPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        topDashboard.setBackground(new java.awt.Color(0, 102, 102));
        topDashboard.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        topDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        topDashboard.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 150, 40));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/search-icon (2).png"))); // NOI18N
        topDashboard.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, 40, 40));

        MainDashboardPanel.add(topDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 80));

        leftDashboard.setBackground(new java.awt.Color(0, 102, 102));
        leftDashboard.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        leftDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        assessmentBtn.setBackground(new java.awt.Color(153, 255, 153));
        assessmentBtn.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        assessmentBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/Apps-Google-Analytics-icon.png"))); // NOI18N
        assessmentBtn.setText("Assessment");
        assessmentBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        assessmentBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        assessmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assessmentBtnActionPerformed(evt);
            }
        });
        leftDashboard.add(assessmentBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 110, 70));

        examsBtn.setBackground(new java.awt.Color(153, 255, 153));
        examsBtn.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        examsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/examination.png"))); // NOI18N
        examsBtn.setText("Exams");
        examsBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        examsBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        examsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examsBtnActionPerformed(evt);
            }
        });
        leftDashboard.add(examsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 110, 70));

        gradesBtn.setBackground(new java.awt.Color(153, 255, 153));
        gradesBtn.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        gradesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/checklist.png"))); // NOI18N
        gradesBtn.setText("Grades");
        gradesBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gradesBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gradesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradesBtnActionPerformed(evt);
            }
        });
        leftDashboard.add(gradesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 110, 70));

        scheduleBtn.setBackground(new java.awt.Color(153, 255, 153));
        scheduleBtn.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        scheduleBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/administration.png"))); // NOI18N
        scheduleBtn.setText("Schedule");
        scheduleBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        scheduleBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        scheduleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleBtnActionPerformed(evt);
            }
        });
        leftDashboard.add(scheduleBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 110, 70));

        lectureBtn1.setBackground(new java.awt.Color(153, 255, 153));
        lectureBtn1.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        lectureBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/presentation (2).png"))); // NOI18N
        lectureBtn1.setText("Lecture");
        lectureBtn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lectureBtn1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lectureBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lectureBtn1ActionPerformed(evt);
            }
        });
        leftDashboard.add(lectureBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 110, 70));

        jButton3.setBackground(new java.awt.Color(153, 255, 153));
        jButton3.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/assignment icon.png"))); // NOI18N
        jButton3.setText("Assignments");
        jButton3.setToolTipText("Assignments");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setPreferredSize(new java.awt.Dimension(104, 62));
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        leftDashboard.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 110, 70));

        MainDashboardPanel.add(leftDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 200, 540));

        subTopDashboard.setBackground(new java.awt.Color(0, 153, 153));
        subTopDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        subTopDashboard.add(settingsInSubTopPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 40, 40));

        labelForSubTopPanel.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        labelForSubTopPanel.setForeground(new java.awt.Color(255, 255, 255));
        subTopDashboard.add(labelForSubTopPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 6, 160, 30));

        jLabelForPanels.setFont(new java.awt.Font("Georgia", 2, 12)); // NOI18N
        subTopDashboard.add(jLabelForPanels, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 120, 30));

        MainDashboardPanel.add(subTopDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 1010, 50));

        jTabbedPaneForTeacherDashboard.setMinimumSize(new java.awt.Dimension(1010, 570));
        jTabbedPaneForTeacherDashboard.setPreferredSize(new java.awt.Dimension(1010, 570));

        lecturePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPaneForLectureBtn.setBackground(new java.awt.Color(153, 255, 153));

        addSubjectPanel.setBackground(new java.awt.Color(153, 255, 153));
        addSubjectPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonForAttach.setBackground(new java.awt.Color(0, 255, 153));
        jButtonForAttach.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButtonForAttach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/attach icon.png"))); // NOI18N
        jButtonForAttach.setText("Attach");
        jButtonForAttach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonForAttachActionPerformed(evt);
            }
        });
        addSubjectPanel.add(jButtonForAttach, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 100, 30));

        jButtonForInsert.setBackground(new java.awt.Color(0, 255, 153));
        jButtonForInsert.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButtonForInsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/add.png"))); // NOI18N
        jButtonForInsert.setText("Insert");
        jButtonForInsert.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonForInsert.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonForInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonForInsertActionPerformed(evt);
            }
        });
        addSubjectPanel.add(jButtonForInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 70, 60));

        jTextFieldForTopicNumber.setBackground(new java.awt.Color(204, 255, 204));
        jTextFieldForTopicNumber.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jTextFieldForTopicNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldForTopicNumberActionPerformed(evt);
            }
        });
        addSubjectPanel.add(jTextFieldForTopicNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 200, 30));

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel5.setText("Upload Notes");
        addSubjectPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 100, 20));

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel6.setText("Description");
        addSubjectPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 90, -1));

        jTextFieldForUploadNotes.setBackground(new java.awt.Color(204, 255, 204));
        jTextFieldForUploadNotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldForUploadNotesActionPerformed(evt);
            }
        });
        addSubjectPanel.add(jTextFieldForUploadNotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 250, 30));

        jButtonForClear.setBackground(new java.awt.Color(0, 255, 153));
        jButtonForClear.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButtonForClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/Actions-edit-clear-icon.png"))); // NOI18N
        jButtonForClear.setText("Clear");
        jButtonForClear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonForClear.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonForClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonForClearActionPerformed(evt);
            }
        });
        addSubjectPanel.add(jButtonForClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, 60));

        jButtonForHome.setBackground(new java.awt.Color(0, 255, 153));
        jButtonForHome.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButtonForHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/Actions-home-icon.png"))); // NOI18N
        jButtonForHome.setText("Home");
        jButtonForHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonForHome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonForHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonForHomeActionPerformed(evt);
            }
        });
        addSubjectPanel.add(jButtonForHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 370, 80, -1));

        jButtonForVideo.setBackground(new java.awt.Color(0, 255, 153));
        jButtonForVideo.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButtonForVideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/video-player.png"))); // NOI18N
        jButtonForVideo.setText("Video");
        jButtonForVideo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonForVideo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonForVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonForVideoActionPerformed(evt);
            }
        });
        addSubjectPanel.add(jButtonForVideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 370, 80, -1));

        jButtonForLibrary.setBackground(new java.awt.Color(0, 255, 153));
        jButtonForLibrary.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButtonForLibrary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/Books-icon (1).png"))); // NOI18N
        jButtonForLibrary.setText("Library");
        jButtonForLibrary.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonForLibrary.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonForLibrary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonForLibraryActionPerformed(evt);
            }
        });
        addSubjectPanel.add(jButtonForLibrary, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, -1, -1));

        jButtonForView.setBackground(new java.awt.Color(0, 255, 153));
        jButtonForView.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButtonForView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/eye.png"))); // NOI18N
        jButtonForView.setText("View");
        jButtonForView.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonForView.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonForView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonForViewActionPerformed(evt);
            }
        });
        addSubjectPanel.add(jButtonForView, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 370, 80, -1));

        jTextFieldForEnterTopic.setBackground(new java.awt.Color(204, 255, 204));
        addSubjectPanel.add(jTextFieldForEnterTopic, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 250, 30));

        jLabel40.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel40.setText("Enter Topic No.");
        addSubjectPanel.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 20));

        jButtonForEdit.setBackground(new java.awt.Color(0, 255, 153));
        jButtonForEdit.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButtonForEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/update.png"))); // NOI18N
        jButtonForEdit.setText("Edit");
        jButtonForEdit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonForEdit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonForEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonForEditActionPerformed(evt);
            }
        });
        addSubjectPanel.add(jButtonForEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 70, 60));

        jScrollPane11.setBackground(new java.awt.Color(0, 204, 153));
        jScrollPane11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(0, 204, 102), new java.awt.Color(0, 204, 153), new java.awt.Color(0, 204, 102)));
        jScrollPane11.setViewportBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 102), new java.awt.Color(0, 204, 102), new java.awt.Color(0, 204, 102), new java.awt.Color(0, 204, 102)));
        jScrollPane11.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N

        jTableForLectureNotes.setBackground(new java.awt.Color(204, 255, 204));
        jTableForLectureNotes.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 255, 102), new java.awt.Color(0, 255, 0)));
        jTableForLectureNotes.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jTableForLectureNotes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Topic No", "Subject Name", "Topic", "Description", "Notes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableForLectureNotes.setGridColor(new java.awt.Color(51, 255, 102));
        jTableForLectureNotes.setRowHeight(25);
        jTableForLectureNotes.setRowMargin(10);
        jTableForLectureNotes.setShowVerticalLines(true);
        jTableForLectureNotes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableForLectureNotesMouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(jTableForLectureNotes);

        addSubjectPanel.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 70, 510, 230));

        jLabel7.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel7.setText("Enter Topic");
        addSubjectPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 90, 10));

        jTextAreaForTopicDescription.setBackground(new java.awt.Color(204, 255, 204));
        jTextAreaForTopicDescription.setColumns(20);
        jTextAreaForTopicDescription.setRows(5);
        jScrollPane8.setViewportView(jTextAreaForTopicDescription);

        addSubjectPanel.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 250, -1));

        jButtonForDelete1.setBackground(new java.awt.Color(0, 255, 153));
        jButtonForDelete1.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButtonForDelete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/x-button.png"))); // NOI18N
        jButtonForDelete1.setText("Delete");
        jButtonForDelete1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonForDelete1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonForDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonForDelete1ActionPerformed(evt);
            }
        });
        addSubjectPanel.add(jButtonForDelete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, -1, 60));

        jLabel41.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel41.setText("Enter Subject Name");
        addSubjectPanel.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 20));

        jTextFieldForEnterSubjectName.setBackground(new java.awt.Color(204, 255, 204));
        jTextFieldForEnterSubjectName.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jTextFieldForEnterSubjectName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldForEnterSubjectNameActionPerformed(evt);
            }
        });
        addSubjectPanel.add(jTextFieldForEnterSubjectName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 200, 30));

        jTabbedPaneForLectureBtn.addTab("tab1", addSubjectPanel);

        uploadVideoPanel.setBackground(new java.awt.Color(153, 255, 153));
        uploadVideoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonForAddVideo.setBackground(new java.awt.Color(0, 255, 153));
        jButtonForAddVideo.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButtonForAddVideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/uploading-archive.png"))); // NOI18N
        jButtonForAddVideo.setText("Add");
        jButtonForAddVideo.setToolTipText("Upload");
        jButtonForAddVideo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonForAddVideo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonForAddVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonForAddVideoActionPerformed(evt);
            }
        });
        uploadVideoPanel.add(jButtonForAddVideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 60, 60));

        jButtonToHome.setBackground(new java.awt.Color(51, 255, 153));
        jButtonToHome.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButtonToHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/Actions-home-icon.png"))); // NOI18N
        jButtonToHome.setText("Home");
        jButtonToHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonToHome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonToHomeActionPerformed(evt);
            }
        });
        uploadVideoPanel.add(jButtonToHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 410, -1, -1));

        jButtonForLibraryFromVideo.setBackground(new java.awt.Color(51, 255, 153));
        jButtonForLibraryFromVideo.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButtonForLibraryFromVideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/Books-icon (1).png"))); // NOI18N
        jButtonForLibraryFromVideo.setText("Library ");
        jButtonForLibraryFromVideo.setToolTipText("e-Library ");
        jButtonForLibraryFromVideo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonForLibraryFromVideo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonForLibraryFromVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonForLibraryFromVideoActionPerformed(evt);
            }
        });
        uploadVideoPanel.add(jButtonForLibraryFromVideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, -1, -1));
        uploadVideoPanel.add(jTextFieldForVideoUpload, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 300, 30));

        jLabel14.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel14.setText("Select Video");
        uploadVideoPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jTextFieldForVideoName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldForVideoNameActionPerformed(evt);
            }
        });
        uploadVideoPanel.add(jTextFieldForVideoName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 170, 30));

        jTextAreaForVideoDescription.setColumns(20);
        jTextAreaForVideoDescription.setRows(5);
        jScrollPane1.setViewportView(jTextAreaForVideoDescription);

        uploadVideoPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 300, 110));

        jLabel15.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel15.setText("Description");
        uploadVideoPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel16.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel16.setText("Video Name");
        uploadVideoPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jButtonForViewFromVideo.setBackground(new java.awt.Color(0, 255, 153));
        jButtonForViewFromVideo.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButtonForViewFromVideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/eye.png"))); // NOI18N
        jButtonForViewFromVideo.setText("View");
        jButtonForViewFromVideo.setToolTipText("View");
        jButtonForViewFromVideo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonForViewFromVideo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonForViewFromVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonForViewFromVideoActionPerformed(evt);
            }
        });
        uploadVideoPanel.add(jButtonForViewFromVideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 410, -1, -1));

        jButtonForUpdateVideo.setBackground(new java.awt.Color(0, 255, 153));
        jButtonForUpdateVideo.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButtonForUpdateVideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/update icon1.png"))); // NOI18N
        jButtonForUpdateVideo.setText("Edit");
        jButtonForUpdateVideo.setToolTipText("Update Video");
        jButtonForUpdateVideo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonForUpdateVideo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonForUpdateVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonForUpdateVideoActionPerformed(evt);
            }
        });
        uploadVideoPanel.add(jButtonForUpdateVideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, -1, 60));

        jButtonForAttachFromVideo.setBackground(new java.awt.Color(51, 255, 153));
        jButtonForAttachFromVideo.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButtonForAttachFromVideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/attach icon.png"))); // NOI18N
        jButtonForAttachFromVideo.setText("Attach");
        jButtonForAttachFromVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonForAttachFromVideoActionPerformed(evt);
            }
        });
        uploadVideoPanel.add(jButtonForAttachFromVideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, -1, 30));

        jButtonForNotesFromVideo.setBackground(new java.awt.Color(0, 255, 153));
        jButtonForNotesFromVideo.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButtonForNotesFromVideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/subject.png"))); // NOI18N
        jButtonForNotesFromVideo.setText("Notes");
        jButtonForNotesFromVideo.setToolTipText("Add Subject");
        jButtonForNotesFromVideo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonForNotesFromVideo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonForNotesFromVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonForNotesFromVideoActionPerformed(evt);
            }
        });
        uploadVideoPanel.add(jButtonForNotesFromVideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 80, -1));

        jLabel18.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel18.setText("Subject Name");
        uploadVideoPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 20));

        jTextFieldForSubjectName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldForSubjectNameActionPerformed(evt);
            }
        });
        uploadVideoPanel.add(jTextFieldForSubjectName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 170, 30));

        jScrollPane13.setBackground(new java.awt.Color(0, 204, 153));
        jScrollPane13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(0, 204, 102), new java.awt.Color(0, 204, 153), new java.awt.Color(0, 204, 102)));
        jScrollPane13.setViewportBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 102), new java.awt.Color(0, 204, 102), new java.awt.Color(0, 204, 102), new java.awt.Color(0, 204, 102)));
        jScrollPane13.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N

        jTableForLectureVideos.setBackground(new java.awt.Color(204, 255, 204));
        jTableForLectureVideos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTableForLectureVideos.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jTableForLectureVideos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Video ID", "Subject Name", "Video Name", "Description", "Video File"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableForLectureVideos.setGridColor(new java.awt.Color(0, 255, 51));
        jTableForLectureVideos.setOpaque(false);
        jTableForLectureVideos.setRowHeight(25);
        jTableForLectureVideos.setShowVerticalLines(true);
        jTableForLectureVideos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableForLectureVideosMouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(jTableForLectureVideos);

        uploadVideoPanel.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 510, 230));

        jTextFieldForVideoId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldForVideoIdActionPerformed(evt);
            }
        });
        uploadVideoPanel.add(jTextFieldForVideoId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 170, -1));

        jLabel20.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel20.setText("Video ID");
        uploadVideoPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jButtonForDelete2.setBackground(new java.awt.Color(0, 255, 153));
        jButtonForDelete2.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButtonForDelete2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/x-button.png"))); // NOI18N
        jButtonForDelete2.setText("Delete");
        jButtonForDelete2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonForDelete2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonForDelete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonForDelete2ActionPerformed(evt);
            }
        });
        uploadVideoPanel.add(jButtonForDelete2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, -1, 60));

        jButtonForClear2.setBackground(new java.awt.Color(0, 255, 153));
        jButtonForClear2.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButtonForClear2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/Actions-edit-clear-icon.png"))); // NOI18N
        jButtonForClear2.setText("Clear");
        jButtonForClear2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonForClear2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonForClear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonForClear2ActionPerformed(evt);
            }
        });
        uploadVideoPanel.add(jButtonForClear2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, 60));

        jTabbedPaneForLectureBtn.addTab("tab2", uploadVideoPanel);

        addToLibraryPanel.setBackground(new java.awt.Color(153, 255, 153));
        addToLibraryPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel12.setText("Book ID");
        addToLibraryPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 20));

        jTextFieldForBookSubject.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jTextFieldForBookSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldForBookSubjectActionPerformed(evt);
            }
        });
        addToLibraryPanel.add(jTextFieldForBookSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 240, 30));

        jLabel13.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel13.setText("Author Name");
        addToLibraryPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 100, 20));
        addToLibraryPanel.add(jTextFieldForAuthorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 240, 30));

        jButton16.setBackground(new java.awt.Color(0, 255, 153));
        jButton16.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/attach icon.png"))); // NOI18N
        jButton16.setText("Attach");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        addToLibraryPanel.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, -1, 30));

        jButton17.setBackground(new java.awt.Color(0, 255, 153));
        jButton17.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/update.png"))); // NOI18N
        jButton17.setText("Update");
        jButton17.setToolTipText("Update Library");
        jButton17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton17.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        addToLibraryPanel.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, -1, 60));

        jButton19.setBackground(new java.awt.Color(0, 255, 153));
        jButton19.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/eye.png"))); // NOI18N
        jButton19.setText("View");
        jButton19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton19.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        addToLibraryPanel.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, -1, -1));

        jButton20.setBackground(new java.awt.Color(0, 255, 153));
        jButton20.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/x-button.png"))); // NOI18N
        jButton20.setText("Delete");
        jButton20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton20.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        addToLibraryPanel.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 80, 60));

        jLabel22.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel22.setText("Book Description");
        addToLibraryPanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 110, 20));
        addToLibraryPanel.add(jTextFieldForUploadBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 260, 30));

        jButton21.setBackground(new java.awt.Color(0, 255, 153));
        jButton21.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/uploading-archive.png"))); // NOI18N
        jButton21.setText("Add");
        jButton21.setToolTipText("Upload Book");
        jButton21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton21.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        addToLibraryPanel.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 70, 60));

        jLabel34.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel34.setText("Book Name");
        addToLibraryPanel.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, 20));

        jButton2.setBackground(new java.awt.Color(0, 255, 153));
        jButton2.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/Actions-home-icon.png"))); // NOI18N
        jButton2.setText("Home");
        jButton2.setToolTipText("Home");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        addToLibraryPanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 400, -1, -1));

        jButton36.setBackground(new java.awt.Color(0, 255, 153));
        jButton36.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/subject.png"))); // NOI18N
        jButton36.setText("Notes");
        jButton36.setToolTipText("Add Subject");
        jButton36.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton36.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        addToLibraryPanel.add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 400, 80, -1));

        jButtonForVideo1.setBackground(new java.awt.Color(0, 255, 153));
        jButtonForVideo1.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButtonForVideo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/video-player.png"))); // NOI18N
        jButtonForVideo1.setText("Video");
        jButtonForVideo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonForVideo1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonForVideo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonForVideo1ActionPerformed(evt);
            }
        });
        addToLibraryPanel.add(jButtonForVideo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 400, 80, -1));

        jLabel23.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel23.setText("Upload Book");
        addToLibraryPanel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 100, 20));

        jTextAreaForBookDescription.setColumns(20);
        jTextAreaForBookDescription.setRows(5);
        jScrollPane3.setViewportView(jTextAreaForBookDescription);

        addToLibraryPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 270, -1));

        jScrollPane12.setBackground(new java.awt.Color(0, 204, 153));
        jScrollPane12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(0, 204, 102), new java.awt.Color(0, 204, 153), new java.awt.Color(0, 204, 102)));
        jScrollPane12.setViewportBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 102), new java.awt.Color(0, 204, 102), new java.awt.Color(0, 204, 102), new java.awt.Color(0, 204, 102)));
        jScrollPane12.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N

        jTableForLibrary.setBackground(new java.awt.Color(204, 255, 204));
        jTableForLibrary.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTableForLibrary.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jTableForLibrary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Book ID", "Subject Name", "Book Title", "Description", "Author Name", "File"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableForLibrary.setGridColor(new java.awt.Color(0, 255, 102));
        jTableForLibrary.setRowHeight(25);
        jTableForLibrary.setRowMargin(15);
        jTableForLibrary.setShowVerticalLines(true);
        jTableForLibrary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableForLibraryMouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(jTableForLibrary);

        addToLibraryPanel.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 520, 220));

        jLabel19.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel19.setText("Book Subject");
        addToLibraryPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 20));

        jTextFieldForBookName.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jTextFieldForBookName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldForBookNameActionPerformed(evt);
            }
        });
        addToLibraryPanel.add(jTextFieldForBookName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 240, 30));

        jTextFieldForBookId.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jTextFieldForBookId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldForBookIdActionPerformed(evt);
            }
        });
        addToLibraryPanel.add(jTextFieldForBookId, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 240, 30));

        jButtonForClear1.setBackground(new java.awt.Color(0, 255, 153));
        jButtonForClear1.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButtonForClear1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/Actions-edit-clear-icon.png"))); // NOI18N
        jButtonForClear1.setText("Clear");
        jButtonForClear1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonForClear1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonForClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonForClear1ActionPerformed(evt);
            }
        });
        addToLibraryPanel.add(jButtonForClear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, 60));

        jTabbedPaneForLectureBtn.addTab("tab3", addToLibraryPanel);

        ViewPanel.setBackground(new java.awt.Color(153, 255, 153));
        ViewPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        ViewPanel.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 400, 220));

        jButton10.setBackground(new java.awt.Color(51, 255, 153));
        jButton10.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/watch video.png"))); // NOI18N
        jButton10.setText("Watch");
        jButton10.setToolTipText("Watch Video");
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        ViewPanel.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 310, 80, 60));

        jLabel17.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel17.setText("Preview Video");
        ViewPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, -1, -1));

        jTabbedPaneForLectureBtn.addTab("tab4", ViewPanel);

        lecturePanel.add(jTabbedPaneForLectureBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1010, 540));

        jTabbedPaneForTeacherDashboard.addTab("tab1", lecturePanel);

        schedulePanel.setBackground(new java.awt.Color(153, 255, 153));
        schedulePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPaneForTeacherDashboard.addTab("tab2", schedulePanel);

        assessmentPanel.setBackground(new java.awt.Color(153, 255, 153));
        assessmentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel42.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel42.setText("Class Assessments");
        assessmentPanel.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, 20));

        jTextFieldForEnterSubjectName1.setBackground(new java.awt.Color(204, 255, 204));
        jTextFieldForEnterSubjectName1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jTextFieldForEnterSubjectName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldForEnterSubjectName1ActionPerformed(evt);
            }
        });
        assessmentPanel.add(jTextFieldForEnterSubjectName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 200, 30));

        jScrollPane14.setBackground(new java.awt.Color(0, 204, 153));
        jScrollPane14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(0, 204, 102), new java.awt.Color(0, 204, 153), new java.awt.Color(0, 204, 102)));
        jScrollPane14.setViewportBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 102), new java.awt.Color(0, 204, 102), new java.awt.Color(0, 204, 102), new java.awt.Color(0, 204, 102)));
        jScrollPane14.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N

        jTableForLectureNotes1.setBackground(new java.awt.Color(204, 255, 204));
        jTableForLectureNotes1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTableForLectureNotes1.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jTableForLectureNotes1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Topic No", "Subject Name", "Topic", "Description", "Notes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableForLectureNotes1.setGridColor(new java.awt.Color(153, 153, 153));
        jTableForLectureNotes1.setShowVerticalLines(true);
        jTableForLectureNotes1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableForLectureNotes1MouseClicked(evt);
            }
        });
        jScrollPane14.setViewportView(jTableForLectureNotes1);

        assessmentPanel.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 70, 510, 230));

        jTextFieldForTopicNumber1.setBackground(new java.awt.Color(204, 255, 204));
        jTextFieldForTopicNumber1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jTextFieldForTopicNumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldForTopicNumber1ActionPerformed(evt);
            }
        });
        assessmentPanel.add(jTextFieldForTopicNumber1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 200, 30));

        jLabel43.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel43.setText("Enter Topic No.");
        assessmentPanel.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 20));

        jLabel8.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel8.setText("Enter Topic");
        assessmentPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 90, 10));

        jTextFieldForEnterTopic1.setBackground(new java.awt.Color(204, 255, 204));
        assessmentPanel.add(jTextFieldForEnterTopic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 250, 30));

        jTextAreaForTopicDescription1.setBackground(new java.awt.Color(204, 255, 204));
        jTextAreaForTopicDescription1.setColumns(20);
        jTextAreaForTopicDescription1.setRows(5);
        jScrollPane9.setViewportView(jTextAreaForTopicDescription1);

        assessmentPanel.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 250, -1));

        jLabel9.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel9.setText("Description");
        assessmentPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 90, -1));

        jLabel10.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel10.setText("Upload Notes");
        assessmentPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 100, 20));

        jTextFieldForUploadNotes1.setBackground(new java.awt.Color(204, 255, 204));
        jTextFieldForUploadNotes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldForUploadNotes1ActionPerformed(evt);
            }
        });
        assessmentPanel.add(jTextFieldForUploadNotes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 250, 30));

        jButtonForAttach1.setBackground(new java.awt.Color(0, 255, 153));
        jButtonForAttach1.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButtonForAttach1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/attach icon.png"))); // NOI18N
        jButtonForAttach1.setText("Attach");
        jButtonForAttach1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonForAttach1ActionPerformed(evt);
            }
        });
        assessmentPanel.add(jButtonForAttach1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 100, 30));

        jButtonForInsert1.setBackground(new java.awt.Color(0, 255, 153));
        jButtonForInsert1.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButtonForInsert1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/add.png"))); // NOI18N
        jButtonForInsert1.setText("Insert");
        jButtonForInsert1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonForInsert1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonForInsert1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonForInsert1ActionPerformed(evt);
            }
        });
        assessmentPanel.add(jButtonForInsert1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 70, 60));

        jLabel44.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel44.setText("Enter Subject Name");
        assessmentPanel.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 20));

        jTabbedPaneForTeacherDashboard.addTab("tab3", assessmentPanel);

        examsPanel.setBackground(new java.awt.Color(153, 255, 153));
        examsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPaneForTeacherDashboard.addTab("tab4", examsPanel);

        gradesPanel.setBackground(new java.awt.Color(153, 255, 153));
        gradesPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPaneForTeacherDashboard.addTab("tab5", gradesPanel);

        Assignments.setBackground(new java.awt.Color(153, 255, 153));
        Assignments.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel45.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel45.setText("Enter Topic ");
        Assignments.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 20));

        jLabel46.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel46.setText("Assignments");
        Assignments.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 90, 20));

        jTextFieldForEnterSubjectName2.setBackground(new java.awt.Color(204, 255, 204));
        jTextFieldForEnterSubjectName2.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jTextFieldForEnterSubjectName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldForEnterSubjectName2ActionPerformed(evt);
            }
        });
        Assignments.add(jTextFieldForEnterSubjectName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 200, 30));

        jTextFieldForTopicNumber2.setBackground(new java.awt.Color(204, 255, 204));
        jTextFieldForTopicNumber2.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jTextFieldForTopicNumber2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldForTopicNumber2ActionPerformed(evt);
            }
        });
        Assignments.add(jTextFieldForTopicNumber2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 200, 30));

        jTextFieldForEnterTopic2.setBackground(new java.awt.Color(204, 255, 204));
        Assignments.add(jTextFieldForEnterTopic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 200, 30));

        jTextFieldForUploadNotes2.setBackground(new java.awt.Color(204, 255, 204));
        jTextFieldForUploadNotes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldForUploadNotes2ActionPerformed(evt);
            }
        });
        Assignments.add(jTextFieldForUploadNotes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 270, 30));

        jButtonForAttach2.setBackground(new java.awt.Color(0, 255, 153));
        jButtonForAttach2.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButtonForAttach2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/attach icon.png"))); // NOI18N
        jButtonForAttach2.setText("Attach");
        jButtonForAttach2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonForAttach2ActionPerformed(evt);
            }
        });
        Assignments.add(jButtonForAttach2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 100, 30));

        jLabel11.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel11.setText("Upload Questions");
        Assignments.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 120, 20));

        jLabel24.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel24.setText("Exercise Name");
        Assignments.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 130, 10));

        jScrollPane15.setBackground(new java.awt.Color(0, 204, 153));
        jScrollPane15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(0, 204, 102), new java.awt.Color(0, 204, 153), new java.awt.Color(0, 204, 102)));
        jScrollPane15.setViewportBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 102), new java.awt.Color(0, 204, 102), new java.awt.Color(0, 204, 102), new java.awt.Color(0, 204, 102)));
        jScrollPane15.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N

        jTableForLectureNotes2.setBackground(new java.awt.Color(204, 255, 204));
        jTableForLectureNotes2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTableForLectureNotes2.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jTableForLectureNotes2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Topic No", "Subject Name", "Topic", "Description", "Notes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableForLectureNotes2.setGridColor(new java.awt.Color(153, 153, 153));
        jTableForLectureNotes2.setShowVerticalLines(true);
        jTableForLectureNotes2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableForLectureNotes2MouseClicked(evt);
            }
        });
        jScrollPane15.setViewportView(jTableForLectureNotes2);

        Assignments.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 70, 510, 230));

        jButtonForInsert2.setBackground(new java.awt.Color(0, 255, 153));
        jButtonForInsert2.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButtonForInsert2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolApp/schoolicons/add.png"))); // NOI18N
        jButtonForInsert2.setText("Insert");
        jButtonForInsert2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonForInsert2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonForInsert2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonForInsert2ActionPerformed(evt);
            }
        });
        Assignments.add(jButtonForInsert2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 70, 60));

        jLabel47.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel47.setText("Enter Subject Name");
        Assignments.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 20));

        jTabbedPaneForTeacherDashboard.addTab("tab6", Assignments);

        MainDashboardPanel.add(jTabbedPaneForTeacherDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 1010, 540));

        jTabbedPaneForHomeAndDashboard.addTab("tab2", MainDashboardPanel);

        getContentPane().add(jTabbedPaneForHomeAndDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1210, 700));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myLectureHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myLectureHomeActionPerformed

        //this button calls the panel for students
        jTabbedPaneForHomeAndDashboard.setSelectedIndex(1);
        jTabbedPaneForTeacherDashboard.setSelectedIndex(0);
        labelForSubTopPanel.setText("My Lectures");
        // TODO add your handling code here:
    }//GEN-LAST:event_myLectureHomeActionPerformed

    private void myScheduleHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myScheduleHomeActionPerformed

        //this button calls the panel for schedule
        jTabbedPaneForHomeAndDashboard.setSelectedIndex(1);
        jTabbedPaneForTeacherDashboard.setSelectedIndex(1);
        labelForSubTopPanel.setText("My Schedule");

        // TODO add your handling code here:
    }//GEN-LAST:event_myScheduleHomeActionPerformed

    private void myAssessmentsHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myAssessmentsHomeActionPerformed

        //this button calls the panel for assignments
        jTabbedPaneForHomeAndDashboard.setSelectedIndex(1);
        jTabbedPaneForTeacherDashboard.setSelectedIndex(2);
        labelForSubTopPanel.setText("My Assessments");

        // TODO add your handling code here:
    }//GEN-LAST:event_myAssessmentsHomeActionPerformed

    private void studentGradesHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentGradesHomeActionPerformed

        //this button calls the panel for grades
        jTabbedPaneForHomeAndDashboard.setSelectedIndex(1);
        jTabbedPaneForTeacherDashboard.setSelectedIndex(4);
        labelForSubTopPanel.setText("Student Grades");

        // TODO add your handling code here:
    }//GEN-LAST:event_studentGradesHomeActionPerformed

    private void myExaminationsHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myExaminationsHomeActionPerformed

        //this button calls the panel for exams
        jTabbedPaneForHomeAndDashboard.setSelectedIndex(1);
        jTabbedPaneForTeacherDashboard.setSelectedIndex(3);
        labelForSubTopPanel.setText("My Examinations");

        // TODO add your handling code here:
    }//GEN-LAST:event_myExaminationsHomeActionPerformed

    private void scheduleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduleBtnActionPerformed
        jTabbedPaneForTeacherDashboard.setSelectedIndex(1);
        labelForSubTopPanel.setText("My Schedules");

        // TODO add your handling code here:
    }//GEN-LAST:event_scheduleBtnActionPerformed

    private void assessmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assessmentBtnActionPerformed
        jTabbedPaneForTeacherDashboard.setSelectedIndex(2);
        labelForSubTopPanel.setText("My Assessments");

        // TODO add your handling code here:
    }//GEN-LAST:event_assessmentBtnActionPerformed

    private void examsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examsBtnActionPerformed

        jTabbedPaneForTeacherDashboard.setSelectedIndex(3);
        labelForSubTopPanel.setText("My examinations");

        // TODO add your handling code here:
    }//GEN-LAST:event_examsBtnActionPerformed

    private void gradesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradesBtnActionPerformed

        jTabbedPaneForTeacherDashboard.setSelectedIndex(4);
        labelForSubTopPanel.setText("Student Grades");

// TODO add your handling code here:
    }//GEN-LAST:event_gradesBtnActionPerformed

    private void lectureBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lectureBtn1ActionPerformed
jTabbedPaneForTeacherDashboard.setSelectedIndex(0);
jTabbedPaneForLectureBtn.setSelectedIndex(0);
labelForSubTopPanel.setText("Lecture Notes");

// TODO add your handling code here:
    }//GEN-LAST:event_lectureBtn1ActionPerformed

        
    
    
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
//log out button to exit the application
 int response = JOptionPane.showConfirmDialog(this, "Do you want to Log Out?",
        "Confirm", JOptionPane.YES_NO_OPTION);
    if (response==JOptionPane.YES_OPTION){
        System.exit(0);
    }else{
        
    }
        
    

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
//panel for add lecture notes
        jTabbedPaneForLectureBtn.setSelectedIndex(0);
jLabelForPanels.setText("Lecture Notes");


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        //back to home
        jTabbedPaneForHomeAndDashboard.setSelectedIndex(0);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
//create an object from the class LibraryBooks and call the method that inserts book into library database

LibraryBooks myLibraryBooks = new LibraryBooks();
myLibraryBooks.insertLectureNotes(jTextFieldForBookSubject, 
        jTextFieldForBookName, jTextAreaForBookDescription, 
        jTextFieldForAuthorName, jTextFieldForBookId, jTextFieldForUploadBook);


//insert library book details from database to JTable
myLibraryBooks.insertIntoJTable(jTableForLibrary);



    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        //tabbedpane for view lecture notes
        jTabbedPaneForLectureBtn.setSelectedIndex(3);
jLabelForPanels.setText("View");
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed

        //create an instance pf the LibraryNotes class and call a method for updating the table using dot reference 
        LibraryBooks myLibraryBooks = new LibraryBooks();
        myLibraryBooks.updateLibraryBooks(jTextFieldForBookSubject, jTextFieldForBookName,
        jTextAreaForBookDescription, jTextFieldForAuthorName, 
        jTextFieldForBookId, jTextFieldForUploadBook);
        
// insert the updated database table into JTable

myLibraryBooks.insertIntoJTable(jTableForLibrary);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        BrowseFile myfile = new BrowseFile();
        myfile.AttachFile(jTextFieldForUploadBook);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jTextFieldForBookSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldForBookSubjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldForBookSubjectActionPerformed

    private void jButtonForAttachFromVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonForAttachFromVideoActionPerformed
        BrowseFile myvideo = new BrowseFile();
        myvideo.AttachFile2(jTextFieldForVideoUpload);


    }//GEN-LAST:event_jButtonForAttachFromVideoActionPerformed

    private void jButtonForUpdateVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonForUpdateVideoActionPerformed

LectureVideos myLectureVideos = new LectureVideos();
myLectureVideos.updateLectureVideos(jTextFieldForVideoId, jTextFieldForSubjectName, 
        jTextFieldForVideoName, jTextAreaForVideoDescription, jTextFieldForVideoUpload);

        // to fetch from database table into JTable, the method insertIntoJTable is called

myLectureVideos.insertVideosIntoJTable(jTableForLectureVideos);
    }//GEN-LAST:event_jButtonForUpdateVideoActionPerformed

    private void jButtonForViewFromVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonForViewFromVideoActionPerformed
        //tabbedpane for view lecture notes
        jTabbedPaneForLectureBtn.setSelectedIndex(3);
jLabelForPanels.setText("View");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonForViewFromVideoActionPerformed

    private void jTextFieldForVideoNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldForVideoNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldForVideoNameActionPerformed

    private void jButtonForLibraryFromVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonForLibraryFromVideoActionPerformed

        jTabbedPaneForLectureBtn.setSelectedIndex(2);
    jLabelForPanels.setText("Library");

    }//GEN-LAST:event_jButtonForLibraryFromVideoActionPerformed

    private void jButtonToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonToHomeActionPerformed

        jTabbedPaneForHomeAndDashboard.setSelectedIndex(0);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonToHomeActionPerformed

    private void jButtonForEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonForEditActionPerformed
//create an object of LectureNotes class and call the method for editting and updating the database table        
LectureNotes myLectureNotes = new LectureNotes();
myLectureNotes.updateLectureNotes(jTextFieldForEnterSubjectName, jTextFieldForEnterTopic, 
        jTextAreaForTopicDescription, jTextFieldForUploadNotes, jTextFieldForTopicNumber);

        // to fetch from database table into JTable, the method insertIntoJTable is called

myLectureNotes.insertIntoJTable(jTableForLectureNotes);

    }//GEN-LAST:event_jButtonForEditActionPerformed

    private void jButtonForViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonForViewActionPerformed

        //view panel for view lecture notes
        jTabbedPaneForLectureBtn.setSelectedIndex(3);
jLabelForPanels.setText("View");        
        
    }//GEN-LAST:event_jButtonForViewActionPerformed

    private void jButtonForLibraryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonForLibraryActionPerformed
        jTabbedPaneForLectureBtn.setSelectedIndex(2);
        jLabelForPanels.setText("Library"); 
        
    }//GEN-LAST:event_jButtonForLibraryActionPerformed

    private void jButtonForVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonForVideoActionPerformed

        jTabbedPaneForLectureBtn.setSelectedIndex(1);
jLabelForPanels.setText("Videos");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonForVideoActionPerformed

    private void jButtonForHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonForHomeActionPerformed
        jTabbedPaneForHomeAndDashboard.setSelectedIndex(0);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonForHomeActionPerformed

    private void jButtonForClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonForClearActionPerformed
                //clear textfields
jTextFieldForEnterSubjectName.setText("");
        jTextAreaForTopicDescription.setText("");
        jTextFieldForTopicNumber.setText("");
        jTextFieldForUploadNotes.setText("");
        jTextFieldForEnterTopic.setText("");


    }//GEN-LAST:event_jButtonForClearActionPerformed

    private void jTextFieldForUploadNotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldForUploadNotesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldForUploadNotesActionPerformed

    private void jTextFieldForTopicNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldForTopicNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldForTopicNumberActionPerformed

    private void jButtonForInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonForInsertActionPerformed
        // insert button adds entries into the database

        LectureNotes myLectureNotes = new LectureNotes();
        myLectureNotes.insertLectureNotes(jTextFieldForEnterSubjectName, jTextFieldForEnterTopic, 
                jTextAreaForTopicDescription, jTextFieldForUploadNotes, jTextFieldForTopicNumber);

        
        // to fetch from database table into JTable, the method insertIntoJTable is called
        
        myLectureNotes.insertIntoJTable(jTableForLectureNotes);
    }//GEN-LAST:event_jButtonForInsertActionPerformed

    private void jButtonForAttachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonForAttachActionPerformed
        BrowseFile myfile = new BrowseFile();
        myfile.AttachFile(jTextFieldForUploadNotes);

        //the code above helps you attach a file from system by getting the file path
    }//GEN-LAST:event_jButtonForAttachActionPerformed

    private void jButtonForNotesFromVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonForNotesFromVideoActionPerformed
//panel for lecture notes
        jTabbedPaneForLectureBtn.setSelectedIndex(0);
jLabelForPanels.setText("Lecture Notes");

    }//GEN-LAST:event_jButtonForNotesFromVideoActionPerformed

    private void jButtonForVideo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonForVideo1ActionPerformed
//panel for videos
        jTabbedPaneForLectureBtn.setSelectedIndex(1);
jLabelForPanels.setText("Videos");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonForVideo1ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
//call the method in LibraryBooks class to delete from the database table 
            LibraryBooks myLibraryBooks = new LibraryBooks();
            myLibraryBooks.deleteLibraryBooks(jTextFieldForBookId);

            // to fetch from database table into JTable, the method insertIntoJTable is called

myLibraryBooks.insertIntoJTable(jTableForLibrary);

    }//GEN-LAST:event_jButton20ActionPerformed

    private void jTextFieldForSubjectNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldForSubjectNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldForSubjectNameActionPerformed

    private void jButtonForDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonForDelete1ActionPerformed

        //call the method in LectureNotes class to delete from database table
        LectureNotes myLectureNotes = new LectureNotes();
myLectureNotes.deleteLectureNotes(jTextFieldForTopicNumber);

// to fetch from database table into JTable, the method insertIntoJTable is called

myLectureNotes.insertIntoJTable(jTableForLectureNotes);

    }//GEN-LAST:event_jButtonForDelete1ActionPerformed

    private void jTableForLectureNotesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableForLectureNotesMouseClicked
        //call method from LectureNotes class to Display selected Rows in Jtextfields when clicked
        LectureNotes myLectureNotes = new LectureNotes();
        myLectureNotes.displayWhenClicked(jTableForLectureNotes, jTextFieldForEnterSubjectName, 
                jTextFieldForEnterTopic, jTextAreaForTopicDescription, 
                jTextFieldForUploadNotes, jTextFieldForTopicNumber);

    }//GEN-LAST:event_jTableForLectureNotesMouseClicked

    private void jTextFieldForEnterSubjectNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldForEnterSubjectNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldForEnterSubjectNameActionPerformed

    private void jTableForLibraryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableForLibraryMouseClicked

LibraryBooks myLibraryBooks = new LibraryBooks();
myLibraryBooks.displayWhenClicked(jTextFieldForBookSubject, jTextFieldForBookName,
        jTextAreaForBookDescription, jTextFieldForAuthorName, jTextFieldForBookId,
        jTextFieldForUploadBook, jTableForLibrary);
        
    }//GEN-LAST:event_jTableForLibraryMouseClicked

    private void jTextFieldForBookNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldForBookNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldForBookNameActionPerformed

    private void jTextFieldForBookIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldForBookIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldForBookIdActionPerformed

    private void jButtonForClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonForClear1ActionPerformed

        jTextFieldForBookSubject.setText("");
        jTextFieldForBookName.setText("");
        jTextAreaForBookDescription.setText("");
        jTextFieldForAuthorName.setText("");
        jTextFieldForBookId.setText("");
        jTextFieldForUploadBook.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonForClear1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTableForLectureVideosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableForLectureVideosMouseClicked

        // insert the values in the table into the textfields when clicked
LectureVideos myLectureVideos= new LectureVideos();
myLectureVideos.displayWhenClicked(jTextFieldForVideoId, jTextFieldForSubjectName, 
        jTextFieldForVideoName, jTextAreaForVideoDescription, jTextFieldForVideoUpload, 
        jTableForLectureVideos);
        

    }//GEN-LAST:event_jTableForLectureVideosMouseClicked

    private void jTextFieldForVideoIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldForVideoIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldForVideoIdActionPerformed

    private void jButtonForAddVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonForAddVideoActionPerformed
//to insert videos into the database
LectureVideos myLectureVideos = new LectureVideos();
myLectureVideos.insertLectureVideos(jTextFieldForVideoId, jTextFieldForSubjectName, 
        jTextFieldForVideoName, jTextAreaForVideoDescription, jTextFieldForVideoUpload);


/// to insert the database table values into JTable

    myLectureVideos.insertVideosIntoJTable(jTableForLectureVideos);
    }//GEN-LAST:event_jButtonForAddVideoActionPerformed

    private void jButtonForDelete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonForDelete2ActionPerformed
// to delete video, call the method in the LectureVideos class created for video deletion
LectureVideos myLectureVideos = new LectureVideos();
myLectureVideos.deleteLectureVideos(jTextFieldForVideoId);


/// to insert the new database table values into JTable

    myLectureVideos.insertVideosIntoJTable(jTableForLectureVideos);


    }//GEN-LAST:event_jButtonForDelete2ActionPerformed

    private void jButtonForClear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonForClear2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonForClear2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTabbedPaneForTeacherDashboard.setSelectedIndex(5);
        labelForSubTopPanel.setText("Student Assignments");

        //this button calls the panel for assignments

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextFieldForEnterSubjectName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldForEnterSubjectName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldForEnterSubjectName1ActionPerformed

    private void jTableForLectureNotes1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableForLectureNotes1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableForLectureNotes1MouseClicked

    private void jTextFieldForTopicNumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldForTopicNumber1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldForTopicNumber1ActionPerformed

    private void jTextFieldForUploadNotes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldForUploadNotes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldForUploadNotes1ActionPerformed

    private void jButtonForAttach1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonForAttach1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonForAttach1ActionPerformed

    private void jButtonForInsert1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonForInsert1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonForInsert1ActionPerformed

    private void jTextFieldForEnterSubjectName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldForEnterSubjectName2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldForEnterSubjectName2ActionPerformed

    private void jTextFieldForTopicNumber2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldForTopicNumber2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldForTopicNumber2ActionPerformed

    private void jTextFieldForUploadNotes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldForUploadNotes2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldForUploadNotes2ActionPerformed

    private void jButtonForAttach2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonForAttach2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonForAttach2ActionPerformed

    private void jTableForLectureNotes2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableForLectureNotes2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableForLectureNotes2MouseClicked

    private void jButtonForInsert2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonForInsert2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonForInsert2ActionPerformed

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
            java.util.logging.Logger.getLogger(TeacherDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Assignments;
    private javax.swing.JPanel MainDashboardPanel;
    private javax.swing.JPanel ViewPanel;
    private javax.swing.JPanel addSubjectPanel;
    private javax.swing.JPanel addToLibraryPanel;
    private javax.swing.JButton assessmentBtn;
    private javax.swing.JPanel assessmentPanel;
    private javax.swing.JButton examsBtn;
    private javax.swing.JPanel examsPanel;
    private javax.swing.JButton gradesBtn;
    private javax.swing.JPanel gradesPanel;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonForAddVideo;
    private javax.swing.JButton jButtonForAttach;
    private javax.swing.JButton jButtonForAttach1;
    private javax.swing.JButton jButtonForAttach2;
    private javax.swing.JButton jButtonForAttachFromVideo;
    private javax.swing.JButton jButtonForClear;
    private javax.swing.JButton jButtonForClear1;
    private javax.swing.JButton jButtonForClear2;
    private javax.swing.JButton jButtonForDelete1;
    private javax.swing.JButton jButtonForDelete2;
    private javax.swing.JButton jButtonForEdit;
    private javax.swing.JButton jButtonForHome;
    private javax.swing.JButton jButtonForInsert;
    private javax.swing.JButton jButtonForInsert1;
    private javax.swing.JButton jButtonForInsert2;
    private javax.swing.JButton jButtonForLibrary;
    private javax.swing.JButton jButtonForLibraryFromVideo;
    private javax.swing.JButton jButtonForNotesFromVideo;
    private javax.swing.JButton jButtonForUpdateVideo;
    private javax.swing.JButton jButtonForVideo;
    private javax.swing.JButton jButtonForVideo1;
    private javax.swing.JButton jButtonForView;
    private javax.swing.JButton jButtonForViewFromVideo;
    private javax.swing.JButton jButtonToHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelForPanels;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPaneForHomeAndDashboard;
    private javax.swing.JTabbedPane jTabbedPaneForLectureBtn;
    private javax.swing.JTabbedPane jTabbedPaneForTeacherDashboard;
    private javax.swing.JTable jTableForLectureNotes;
    private javax.swing.JTable jTableForLectureNotes1;
    private javax.swing.JTable jTableForLectureNotes2;
    private javax.swing.JTable jTableForLectureVideos;
    private javax.swing.JTable jTableForLibrary;
    private javax.swing.JTextArea jTextAreaForBookDescription;
    private javax.swing.JTextArea jTextAreaForTopicDescription;
    private javax.swing.JTextArea jTextAreaForTopicDescription1;
    private javax.swing.JTextArea jTextAreaForVideoDescription;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextFieldForAuthorName;
    private javax.swing.JTextField jTextFieldForBookId;
    private javax.swing.JTextField jTextFieldForBookName;
    private javax.swing.JTextField jTextFieldForBookSubject;
    private javax.swing.JTextField jTextFieldForEnterSubjectName;
    private javax.swing.JTextField jTextFieldForEnterSubjectName1;
    private javax.swing.JTextField jTextFieldForEnterSubjectName2;
    private javax.swing.JTextField jTextFieldForEnterTopic;
    private javax.swing.JTextField jTextFieldForEnterTopic1;
    private javax.swing.JTextField jTextFieldForEnterTopic2;
    private javax.swing.JTextField jTextFieldForSubjectName;
    private javax.swing.JTextField jTextFieldForTopicNumber;
    private javax.swing.JTextField jTextFieldForTopicNumber1;
    private javax.swing.JTextField jTextFieldForTopicNumber2;
    private javax.swing.JTextField jTextFieldForUploadBook;
    private javax.swing.JTextField jTextFieldForUploadNotes;
    private javax.swing.JTextField jTextFieldForUploadNotes1;
    private javax.swing.JTextField jTextFieldForUploadNotes2;
    private javax.swing.JTextField jTextFieldForVideoId;
    private javax.swing.JTextField jTextFieldForVideoName;
    private javax.swing.JTextField jTextFieldForVideoUpload;
    private javax.swing.JLabel labelForSubTopPanel;
    private javax.swing.JButton lectureBtn1;
    private javax.swing.JPanel lecturePanel;
    private javax.swing.JPanel leftDashboard;
    private javax.swing.JButton myAssessmentsHome;
    private javax.swing.JButton myExaminationsHome;
    private javax.swing.JButton myLectureHome;
    private javax.swing.JButton myScheduleHome;
    private javax.swing.JButton scheduleBtn;
    private javax.swing.JPanel schedulePanel;
    private javax.swing.JLabel settingsInSubTopPanel;
    private javax.swing.JButton studentGradesHome;
    private javax.swing.JPanel subTopDashboard;
    private javax.swing.JPanel teacherHomeDashboardPanel;
    private javax.swing.JPanel topDashboard;
    private javax.swing.JPanel uploadVideoPanel;
    // End of variables declaration//GEN-END:variables
}
