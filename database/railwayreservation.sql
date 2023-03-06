-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 26, 2020 at 08:25 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `railwayreservation`
--

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `FirstName` varchar(50) NOT NULL,
  `LastName` varchar(50) NOT NULL,
  `Emailid` varchar(50) NOT NULL,
  `Username` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`FirstName`, `LastName`, `Emailid`, `Username`, `Password`) VALUES
('Deep', 'Parekh', 'parekhd03@gmail.com', 'Deep', 'deep03'),
('dhruti', 'prekh', 'ftrrftf', 'dhruti', 'deep'),
('Dhruv', 'Shah', 'dhs262003@gmail.com', 'Dhruv', 'dhso'),
('Hitesh', 'Parekh', 'hitesh@gmail.com', 'Hitesh', 'deep0312'),
('Deep', 'Parekh', 'deep@gmail.com', 'raj', 'deep03');

-- --------------------------------------------------------

--
-- Table structure for table `traindetails`
--

CREATE TABLE `traindetails` (
  `TRAINNO` int(6) DEFAULT NULL,
  `TRAINNAME` varchar(21) DEFAULT NULL,
  `SOURCE` varchar(50) NOT NULL,
  `DESTINATION` varchar(50) NOT NULL,
  `DEPARTUREDATE` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `traindetails`
--

INSERT INTO `traindetails` (`TRAINNO`, `TRAINNAME`, `SOURCE`, `DESTINATION`, `DEPARTUREDATE`) VALUES
(123905, 'Gujrat Express', 'Mumbai', 'Ahemdabad', '22-03-2021'),
(124506, 'Rajdhani Express', 'Goa', 'Mumbai', '21-01-2021'),
(321567, 'Duranto Express', 'Ahemdabad', 'Mumbai', '22-08-2021'),
(234651, 'Double Decker Express', 'Kolkata', 'Delhi', '04-04-2021'),
(891762, 'Gujrat Express', 'Udaipur', 'Jaipur', '19-08-2021'),
(981762, 'Gatiman Express', 'Mumbai', 'Kerela', '16-07-2021'),
(451243, 'Duranto Express', 'Kerela', 'Delhi', '08-12-2021'),
(681972, 'Rajdhani Express', 'Ahemdabad', 'Agra', '06-11-2021'),
(782543, 'Garib Rath Express', 'Bihar', 'Punjab', '14-05-2021'),
(142356, 'Shatabdi Express', 'Ahemdabad', 'Mumbai', '30-12-2021'),
(901345, 'Gujrat Express', 'Mumbai', 'Goa', '12-11-2021'),
(912368, 'Rajdhani Express', 'Udaipur', 'Delhi', '16-09-2021'),
(851234, 'Double Decker Express', 'Mumbai', 'Agra', '14-08-2021'),
(441234, 'Gujrat Express', 'Ahemdabad', 'Mumbai', '29-09-2021'),
(581256, 'Garib Rath Express', 'Delhi', 'Chennai', '02-02-2021'),
(561784, 'Gatiman Express', 'Agra', 'Chennai', '16-01-2021'),
(781243, 'Double Decker Express', 'Udaipur', 'Kerela', '16-04-2021'),
(782415, 'Gujrat Express', 'Mumbai', 'Goa', '05-05-2021'),
(990123, 'Gatiman Express', 'Ahemdabad', 'Mumbai', '06-08-2021'),
(126782, 'Garib Rath Express', 'Punjab', 'Bihar', '09-09-2021'),
(765211, 'Rajdhani Express', 'Agra', 'Punjab', '26-11-2021'),
(991245, 'Gujrat Express', 'Kerela', 'Bihar', '03-12-2021'),
(341252, 'Shatabdi Express', 'Delhi', 'Punjab', '11-11-2021'),
(881234, 'Humsafar Express', 'Chennai', 'Mumbai', '16-09-2021'),
(991233, 'Rajdhani Express', 'Mumbai', 'Ahemdabad', '03-10-2021'),
(872676, 'Gujrat Express', 'Jaipur', 'Nagpur', '09-12-2021'),
(901123, 'Garib Rath Express', 'Ahemdabad', 'Delhi', '04-12-2021'),
(441234, 'Duratdo Express', 'Nagpur', 'Mumbai', '03-04-2021'),
(667876, 'Shatabdi Express', 'Mumbai', 'Bihar', '16-11-2021'),
(922343, 'Gujrat Express', 'Delhi', 'Ahemdabad', '01-01-2021'),
(872112, 'Rajdhani Express', 'Ahemdabad', 'Mumbai', '03-08-2021');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`Username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
