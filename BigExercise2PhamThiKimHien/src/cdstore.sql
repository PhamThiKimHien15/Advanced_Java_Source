-- phpMyAdmin SQL Dump
-- version 4.4.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Sep 20, 2016 at 10:51 AM
-- Server version: 5.6.26
-- PHP Version: 5.6.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cdstore`
--

-- --------------------------------------------------------

--
-- Table structure for table `cd`
--

CREATE TABLE IF NOT EXISTS `cd` (
  `id` int(11) NOT NULL,
  `name` varchar(150) CHARACTER SET utf8 NOT NULL,
  `singer` varchar(150) CHARACTER SET utf8 NOT NULL,
  `numbersongs` int(11) NOT NULL,
  `price` double NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `cd`
--

INSERT INTO `cd` (`id`, `name`, `singer`, `numbersongs`, `price`) VALUES
(2, 'Em dung quay ve day', 'Trinh Thang Binh', 8, 240000),
(4, 'Mot ai do khac', 'The men', 10, 250000),
(5, 'Goc ban cong', 'Vu Cat Tuong', 10, 300000),
(6, 'Gui Anh xa nho', 'Bich Phuong', 5, 150000),
(7, 'Co anh o day roi', 'Trinh Quang Minh', 6, 160000),
(8, 'Bon Chu lam', 'Van Mai Huong', 5, 80000),
(9, 'Lang nge nuoc mat', 'Luong Bich Huu', 5, 100000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cd`
--
ALTER TABLE `cd`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cd`
--
ALTER TABLE `cd`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=10;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
