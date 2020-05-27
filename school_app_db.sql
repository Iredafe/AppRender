-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: May 27, 2020 at 11:06 PM
-- Server version: 5.1.53
-- PHP Version: 5.3.4

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `schoolapp_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `library`
--

CREATE TABLE IF NOT EXISTS `library` (
  `book id` int(50) NOT NULL AUTO_INCREMENT,
  `book name` varchar(50) NOT NULL,
  `book description` text NOT NULL,
  `author name` varchar(50) NOT NULL,
  `book file` varchar(500) NOT NULL,
  `subject name` varchar(50) NOT NULL,
  PRIMARY KEY (`book id`),
  KEY `subject name` (`subject name`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=100 ;

--
-- Dumping data for table `library`
--

INSERT INTO `library` (`book id`, `book name`, `book description`, `author name`, `book file`, `subject name`) VALUES
(1, 'Head First Java', 'it talks about the basics of java programming', 'Iredafenevesho Owolabi', 'C:UsersIredafeDocumentsCREATE A TABLE WITH FOREIGN KEY.txt', 'Computer'),
(3, 'Wave Duality', 'teaches you how to understand waves like Lionel Messi himself', 'Lionel Richie', 'C:\\Users\\Iredafe\\Documents\\DIGITAL REVOLUTION.pptx', 'Physics'),
(2, 'Physics and Mechanics', 'teaches you how to dribble like Lionel Messi himself', 'Lionel Messi', 'C:\\Users\\Iredafe\\Documents\\DIGITAL REVOLUTION.pptx', 'Physics'),
(4, 'Torque', 'explains a lot about bending moments and shear moments', 'Dafe Owolabi', 'C:\\Users\\Iredafe\\Documents\\DIGITAL REVOLUTION.pptx', 'Physics'),
(5, 'CPU', 'explains a lot about processing systems', 'Dafe Owolabi', 'C:\\Users\\Iredafe\\Documents\\DIGITAL REVOLUTION.pptx', 'Computer'),
(6, 'Idioms', 'explains a lot about the use of idioms', 'Dr Dafe Owolabi', 'C:\\Users\\Iredafe\\Documents\\DIGITAL REVOLUTION.pptx', 'English '),
(7, 'English for Dummies', 'this book shows all there is to know', 'Dr Dafe Owolabi', 'C:\\Users\\Iredafe\\Documents\\CREATE A TABLE WITH FOREIGN KEY.txt', 'English'),
(8, 'Physics for Dummies', 'explains how take powerful shots at goal', 'Prof Christiano Ronaldo', 'C:\\Users\\Iredafe\\Documents\\DIGITAL REVOLUTION.pptx', 'Physics');

-- --------------------------------------------------------

--
-- Table structure for table `students assessment`
--

CREATE TABLE IF NOT EXISTS `students assessment` (
  `student id` int(50) NOT NULL AUTO_INCREMENT,
  `student class` varchar(50) NOT NULL,
  `assignments score` varchar(50) DEFAULT NULL,
  `test score` int(50) DEFAULT NULL,
  `exam score` int(50) DEFAULT NULL,
  `overall score` int(50) DEFAULT NULL,
  `student grade` int(50) DEFAULT NULL,
  `student name` varchar(50) NOT NULL,
  `subject name` varchar(50) NOT NULL,
  PRIMARY KEY (`student id`),
  KEY `subject name` (`subject name`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `students assessment`
--


-- --------------------------------------------------------

--
-- Table structure for table `students assignment`
--

CREATE TABLE IF NOT EXISTS `students assignment` (
  `assignment id` int(50) NOT NULL AUTO_INCREMENT,
  `subject name` varchar(50) NOT NULL,
  `topic` text NOT NULL,
  `exercise` text NOT NULL,
  `assignment question` varchar(50) NOT NULL,
  `assignment answers` varchar(50) NOT NULL,
  `student name` varchar(50) NOT NULL,
  PRIMARY KEY (`assignment id`),
  KEY `student name` (`student name`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `students assignment`
--

INSERT INTO `students assignment` (`assignment id`, `subject name`, `topic`, `exercise`, `assignment question`, `assignment answers`, `student name`) VALUES
(1, 'Computer Science', '', '', '', '', 'Sam'),
(2, 'English Language', '', '', '', '', 'Sam');

-- --------------------------------------------------------

--
-- Table structure for table `students data`
--

CREATE TABLE IF NOT EXISTS `students data` (
  `student id` int(50) NOT NULL AUTO_INCREMENT,
  `student class` varchar(50) NOT NULL,
  `student name` varchar(50) NOT NULL,
  PRIMARY KEY (`student id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `students data`
--


-- --------------------------------------------------------

--
-- Table structure for table `students grade`
--

CREATE TABLE IF NOT EXISTS `students grade` (
  `student id` int(50) NOT NULL AUTO_INCREMENT,
  `subject name` varchar(50) NOT NULL,
  `student name` varchar(50) NOT NULL,
  `assignment score` int(50) DEFAULT NULL,
  `test score` int(50) DEFAULT NULL,
  `exam score` int(50) DEFAULT NULL,
  `grade` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`student id`),
  KEY `student name` (`student name`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `students grade`
--


-- --------------------------------------------------------

--
-- Table structure for table `subject`
--

CREATE TABLE IF NOT EXISTS `subject` (
  `subject id` int(50) NOT NULL AUTO_INCREMENT,
  `subject name` varchar(50) NOT NULL,
  `subject code` varchar(50) NOT NULL,
  `subject requirement` text NOT NULL,
  PRIMARY KEY (`subject id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `subject`
--


-- --------------------------------------------------------

--
-- Table structure for table `topic`
--

CREATE TABLE IF NOT EXISTS `topic` (
  `topic id` int(50) NOT NULL AUTO_INCREMENT,
  `topic name` varchar(50) NOT NULL,
  `topic description` text NOT NULL,
  `topic notes` varchar(500) NOT NULL,
  `subject name` varchar(50) NOT NULL,
  PRIMARY KEY (`topic id`),
  KEY `subject name` (`subject name`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=19 ;

--
-- Dumping data for table `topic`
--

INSERT INTO `topic` (`topic id`, `topic name`, `topic description`, `topic notes`, `subject name`) VALUES
(1, 'Python', 'the wonderful possibilities of Python programming.', 'C:\\Users\\Iredafe\\Desktop\\Programming books\\Head First Python ( PDFDrive.com ).pdf', 'Computer Science');

-- --------------------------------------------------------

--
-- Table structure for table `video`
--

CREATE TABLE IF NOT EXISTS `video` (
  `video id` int(50) NOT NULL AUTO_INCREMENT,
  `video name` varchar(50) NOT NULL,
  `video description` text NOT NULL,
  `video file` varchar(500) NOT NULL,
  `subject name` varchar(50) NOT NULL,
  PRIMARY KEY (`video id`),
  KEY `subject name` (`subject name`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Dumping data for table `video`
--

INSERT INTO `video` (`video id`, `video name`, `video description`, `video file`, `subject name`) VALUES
(1, 'Respiration', 'This video describes the human respiratory system in a basic way', 'C:\\Users\\Iredafe\\Desktop\\dafe backup\\prog videos\\[FreeTutorials.Us] corejavamadeeasy\\04 Static Members and their execution control flow\\018 Static and Non Static Contexts.mp4', 'Biology'),
(3, 'Human Anatomy', 'This video describes the human body in a basic way', 'C:\\Users\\Iredafe\\Desktop\\dafe backup\\prog videos\\[FreeTutorials.Us] corejavamadeeasy\\04 Static Members and their execution control flow\\018 Static and Non Static Contexts.mp4', 'Biology'),
(2, 'Reproduction', 'This video describes the human reproductive system in a basic way', 'C:\\Users\\Iredafe\\Desktop\\dafe backup\\prog videos\\[FreeTutorials.Us] corejavamadeeasy\\04 Static Members and their execution control flow\\018 Static and Non Static Contexts.mp4', 'Biology'),
(4, 'Wave', 'This video describes wave particulate nature of matter', 'C:\\Users\\Iredafe\\Desktop\\dafe backup\\prog videos\\[FreeTutorials.Us] corejavamadeeasy\\04 Static Members and their execution control flow\\018 Static and Non Static Contexts.mp4', 'Physics'),
(5, 'Velocity', 'This video describes how escape velocity can be derived', 'C:\\Users\\Iredafe\\Desktop\\dafe backup\\prog videos\\[FreeTutorials.Us] corejavamadeeasy\\04 Static Members and their execution control flow\\018 Static and Non Static Contexts.mp4', 'Physics'),
(6, 'Momentum', 'This video describes how momentum laws can be derived', 'C:\\Users\\Iredafe\\Desktop\\dafe backup\\prog videos\\[FreeTutorials.Us] corejavamadeeasy\\04 Static Members and their execution control flow\\018 Static and Non Static Contexts.mp4', 'Physics'),
(7, 'bio', 'explains the use of tech in biology', 'C:\\Users\\Iredafe\\Desktop\\dafe backup\\prog videos\\[FreeTutorials.Us] Udemy - Learn JavaScript Full-Stack from Scratch\\0. Websites you may like\\1. (FreeTutorials.Us) Download Udemy Paid Courses For Free.url', 'Biotech');
