-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Apr 06, 2019 at 11:00 AM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `maindb`
--

-- --------------------------------------------------------

--
-- Table structure for table `cart`
--

CREATE TABLE `cart` (
  `id` int(100) NOT NULL,
  `sup_id` varchar(100) NOT NULL,
  `ret_id` varchar(100) NOT NULL,
  `item_id` varchar(100) NOT NULL,
  `ammount` int(100) NOT NULL,
  `qnty` int(100) NOT NULL,
  `confirmed` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cart`
--

INSERT INTO `cart` (`id`, `sup_id`, `ret_id`, `item_id`, `ammount`, `qnty`, `confirmed`) VALUES
(47, 'prem@gmail.com', '123', '1', 2400, 12, 1),
(48, 'prem@gmail.com', '123', '1', 40000, 200, 0),
(49, 'prem@gmail.com', '123', '2', 3000, 30, 0);

-- --------------------------------------------------------

--
-- Table structure for table `confirmed_orders`
--

CREATE TABLE `confirmed_orders` (
  `ord_id` int(11) NOT NULL,
  `sup_id` varchar(100) NOT NULL,
  `ret_id` varchar(100) NOT NULL,
  `mat_id` varchar(100) NOT NULL,
  `qntity` int(100) NOT NULL,
  `amt` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Deals`
--

CREATE TABLE `Deals` (
  `pro_id` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `pro_name` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `pro_img_url` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `weight` int(100) NOT NULL,
  `base_amount` int(100) NOT NULL,
  `total_amount` int(100) NOT NULL,
  `disc` int(100) NOT NULL,
  `categories` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `brands` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `left_qnty` int(100) NOT NULL,
  `pro_unit` varchar(100) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `Deals`
--

INSERT INTO `Deals` (`pro_id`, `pro_name`, `pro_img_url`, `weight`, `base_amount`, `total_amount`, `disc`, `categories`, `brands`, `left_qnty`, `pro_unit`) VALUES
('1', 'Biscate', 'https://premnathindia.000webhostapp.com/pro_images/keerty.jpg', 26, 5, 200, 22, 'Candy', 'Sun', 0, 'kg'),
('2', 'Chocklate', 'https://premnathindia.000webhostapp.com/pro_images/tamanna.jpeg', 25, 10, 100, 11, 'Biscuit', 'britania', 0, 'litre');

-- --------------------------------------------------------

--
-- Table structure for table `retailer_main_table`
--

CREATE TABLE `retailer_main_table` (
  `UID` varchar(100) NOT NULL,
  `fname` varchar(100) NOT NULL,
  `lname` varchar(100) NOT NULL,
  `code` varchar(100) NOT NULL,
  `Is_sname_requirerd` varchar(100) NOT NULL,
  `primary_breat` varchar(100) NOT NULL,
  `secondary_beat` varchar(100) NOT NULL,
  `Is_secondary_beat_required` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `retailer_main_table`
--

INSERT INTO `retailer_main_table` (`UID`, `fname`, `lname`, `code`, `Is_sname_requirerd`, `primary_breat`, `secondary_beat`, `Is_secondary_beat_required`) VALUES
('1', '1', '1', '1', 'no', '1', '1', 'no'),
('123', '123', '132', '132', 'no', '132', '132', 'no'),
('159', '123', '313', '12', 'no', '32', '321', 'no'),
('48', '98', '8', '9', 'no', '8', '', 'no'),
('485', '8', '9', '98', 'no', '9', '8', 'no'),
('7', '78', '794', '9', 'no', '212', '13', 'no');

-- --------------------------------------------------------

--
-- Table structure for table `retailer_owner`
--

CREATE TABLE `retailer_owner` (
  `UID` varchar(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `emailId` varchar(100) NOT NULL,
  `phNO` bigint(100) NOT NULL,
  `mobNo` bigint(100) NOT NULL,
  `dob` date NOT NULL,
  `fax` varchar(100) NOT NULL,
  `shop_name` varchar(220) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `retailer_owner`
--

INSERT INTO `retailer_owner` (`UID`, `name`, `emailId`, `phNO`, `mobNo`, `dob`, `fax`, `shop_name`) VALUES
('123', '123', '1322', 123, 13, '0003-12-13', '132', 'Prems_EnterPrices'),
('1', '1', '1', 1, 1, '0001-01-11', '1', 'jaggu_ENterprises'),
('159', '2', '32', 132, 132, '0003-12-13', '132', 'Nayak_enterprises'),
('485', '98', '9', 8, 98, '0009-08-09', '89', 'ski_general store'),
('48', '546', '46', 54, 65, '0004-06-04', '6546', 'vcet_sweets'),
('7', '332', '2331', 312, 31, '0312-01-31', '3', 'tulunad_store');

-- --------------------------------------------------------

--
-- Table structure for table `retailer_personal_detailes`
--

CREATE TABLE `retailer_personal_detailes` (
  `UID` varchar(100) NOT NULL,
  `stae` varchar(100) NOT NULL,
  `district` varchar(100) NOT NULL,
  `sub_district` varchar(100) NOT NULL,
  `towm` varchar(100) NOT NULL,
  `Ward` varchar(100) NOT NULL,
  `cluster` varchar(100) NOT NULL,
  `street` varchar(100) NOT NULL,
  `pincode` bigint(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `retailer_personal_detailes`
--

INSERT INTO `retailer_personal_detailes` (`UID`, `stae`, `district`, `sub_district`, `towm`, `Ward`, `cluster`, `street`, `pincode`) VALUES
('123', '13', '132', '13', '132', '132', '13', '132', 123),
('1', '11', '1', '11', '11', '1', '1', '1', 11),
('159', '321', '32', '13', '21', '321', '32', '1', 3213),
('485', '98', '9', '89', '8', '98', '9', '89', 8),
('48', '7', '8787', '8', '787', '98', '979', '7897', 98798),
('7', '32123', '131', '321', '3213', '123', '131', '23', 31);

-- --------------------------------------------------------

--
-- Table structure for table `supplierform`
--

CREATE TABLE `supplierform` (
  `name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `code` varchar(100) NOT NULL,
  `adress1` longtext NOT NULL,
  `adress2` longtext NOT NULL,
  `BDPL-GSTIN` int(100) NOT NULL,
  `Supplier-Type` varchar(100) NOT NULL,
  `Company` varchar(100) NOT NULL,
  `State` varchar(100) NOT NULL,
  `Telephone` bigint(100) NOT NULL,
  `BIL-GSTN` int(100) NOT NULL,
  `isalive` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `supplierform`
--

INSERT INTO `supplierform` (`name`, `email`, `code`, `adress1`, `adress2`, `BDPL-GSTIN`, `Supplier-Type`, `Company`, `State`, `Telephone`, `BIL-GSTN`, `isalive`, `password`) VALUES
('prem', 'pkc@yahoo.com', '123123', 'GOOd', 'good', 132, '132', '132', '132', 132, 132, '132', '123'),
('prem', 'prem@gmail.com', '123asd', 'asdf13', 'asdfg123\r\n', 123, '123kjh', 'mnb', 'kar', 8722275074, 456, '456', '465');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cart`
--
ALTER TABLE `cart`
  ADD PRIMARY KEY (`id`),
  ADD KEY `sup_id` (`sup_id`),
  ADD KEY `ret_id` (`ret_id`);

--
-- Indexes for table `confirmed_orders`
--
ALTER TABLE `confirmed_orders`
  ADD PRIMARY KEY (`ord_id`),
  ADD KEY `sup_id` (`sup_id`),
  ADD KEY `ret_id` (`ret_id`);

--
-- Indexes for table `Deals`
--
ALTER TABLE `Deals`
  ADD PRIMARY KEY (`pro_id`);

--
-- Indexes for table `retailer_main_table`
--
ALTER TABLE `retailer_main_table`
  ADD PRIMARY KEY (`UID`);

--
-- Indexes for table `retailer_owner`
--
ALTER TABLE `retailer_owner`
  ADD KEY `UID` (`UID`);

--
-- Indexes for table `retailer_personal_detailes`
--
ALTER TABLE `retailer_personal_detailes`
  ADD KEY `UID` (`UID`);

--
-- Indexes for table `supplierform`
--
ALTER TABLE `supplierform`
  ADD PRIMARY KEY (`email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cart`
--
ALTER TABLE `cart`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=50;

--
-- AUTO_INCREMENT for table `confirmed_orders`
--
ALTER TABLE `confirmed_orders`
  MODIFY `ord_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `cart`
--
ALTER TABLE `cart`
  ADD CONSTRAINT `cart_ibfk_1` FOREIGN KEY (`sup_id`) REFERENCES `supplierform` (`email`) ON DELETE CASCADE,
  ADD CONSTRAINT `cart_ibfk_2` FOREIGN KEY (`ret_id`) REFERENCES `retailer_main_table` (`UID`) ON DELETE CASCADE;

--
-- Constraints for table `confirmed_orders`
--
ALTER TABLE `confirmed_orders`
  ADD CONSTRAINT `confirmed_orders_ibfk_1` FOREIGN KEY (`sup_id`) REFERENCES `supplierform` (`email`) ON DELETE CASCADE,
  ADD CONSTRAINT `confirmed_orders_ibfk_2` FOREIGN KEY (`ret_id`) REFERENCES `retailer_main_table` (`UID`) ON DELETE CASCADE;

--
-- Constraints for table `retailer_owner`
--
ALTER TABLE `retailer_owner`
  ADD CONSTRAINT `retailer_owner_ibfk_1` FOREIGN KEY (`UID`) REFERENCES `retailer_main_table` (`UID`) ON DELETE CASCADE;

--
-- Constraints for table `retailer_personal_detailes`
--
ALTER TABLE `retailer_personal_detailes`
  ADD CONSTRAINT `retailer_personal_detailes_ibfk_1` FOREIGN KEY (`UID`) REFERENCES `retailer_main_table` (`UID`),
  ADD CONSTRAINT `retailer_personal_detailes_ibfk_2` FOREIGN KEY (`UID`) REFERENCES `retailer_main_table` (`UID`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
