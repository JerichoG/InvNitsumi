-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 03, 2022 at 01:44 PM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 8.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `invnitsumi`
--

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `ID` int(11) NOT NULL,
  `Kode_Barang` varchar(50) NOT NULL,
  `Quantity` int(20) DEFAULT NULL,
  `Harga` bigint(20) DEFAULT NULL,
  `Total_Harga` bigint(20) DEFAULT NULL,
  `Tanggal` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`ID`, `Kode_Barang`, `Quantity`, `Harga`, `Total_Harga`, `Tanggal`) VALUES
(5, 'Grm', 9, 15500, 139500, '2021-12-03'),
(7, 'Gi', 7, 5500, 38500, '2021-12-09'),
(10, 'Grm', 7, 5000, 35000, '2021-12-28'),
(11, 'Gi', 6, 900, 5400, '2021-12-29'),
(12, 'Grm', 8, 5000, 40000, '2021-12-29');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `ID` int(11) NOT NULL,
  `Kode_Barang` varchar(50) NOT NULL,
  `Nama_Barang` varchar(100) NOT NULL,
  `Harga` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`ID`, `Kode_Barang`, `Nama_Barang`, `Harga`) VALUES
(5, 'Grm', 'Garam', 5000),
(6, 'Gi', 'Gula', 900);

-- --------------------------------------------------------

--
-- Table structure for table `purchase`
--

CREATE TABLE `purchase` (
  `ID` int(11) NOT NULL,
  `Kode_Barang` varchar(50) NOT NULL,
  `Kode_Supplier` varchar(50) NOT NULL,
  `Quantity` int(11) DEFAULT NULL,
  `Harga` bigint(20) DEFAULT NULL,
  `Total_Harga` bigint(20) DEFAULT NULL,
  `Tanggal` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `purchase`
--

INSERT INTO `purchase` (`ID`, `Kode_Barang`, `Kode_Supplier`, `Quantity`, `Harga`, `Total_Harga`, `Tanggal`) VALUES
(7, 'Gi', 'hld1', 10, 7000, 70000, '2021-12-05'),
(8, 'Gi', 'sup3', 7, 6500, 45500, '2021-12-09'),
(9, 'Grm', 'Jrch', 9, 5500, 49500, '2021-12-03'),
(10, 'Grm', 'hld1', 8, 8000, 64000, '2021-12-08'),
(12, 'Grm', 'Jrch', 9, 5000, 45000, '2021-12-09'),
(13, 'Gi', 'sup3', 7, 9000, 63000, '2021-12-10'),
(14, 'Grm', 'sup3', 9, 3000, 27000, '2021-12-25'),
(15, 'Gi', 'hld1', 9, 9000, 81000, '2021-12-28');

-- --------------------------------------------------------

--
-- Table structure for table `stock`
--

CREATE TABLE `stock` (
  `ID` int(11) NOT NULL,
  `Kode_Barang` varchar(50) NOT NULL,
  `Quantity` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `stock`
--

INSERT INTO `stock` (`ID`, `Kode_Barang`, `Quantity`) VALUES
(1, 'Grm', 11),
(2, 'Gi', 10);

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `ID` int(11) NOT NULL,
  `Kode_Supplier` varchar(30) NOT NULL,
  `Nama_Toko` varchar(50) NOT NULL,
  `Alamat` varchar(100) NOT NULL,
  `No_HP` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`ID`, `Kode_Supplier`, `Nama_Toko`, `Alamat`, `No_HP`) VALUES
(4, 'hld1', 'Hilda', 'Petojo', '055555'),
(6, 'sup3', 'Niken', 'Kota Bumi', '088888'),
(7, 'Jrch', 'Jericho', 'Cengkareng', '077777');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `ID` int(11) NOT NULL,
  `Username` varchar(50) NOT NULL,
  `Password` varchar(100) NOT NULL,
  `Posisi` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`ID`, `Username`, `Password`, `Posisi`) VALUES
(1, 'admin', '21232f297a57a5a743894a0e4a801fc3', 'owner'),
(5, 'Jericho', 'f20c70113b0e8d2c860621b6215e2e99', 'PM');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `purchase`
--
ALTER TABLE `purchase`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `stock`
--
ALTER TABLE `stock`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `orders`
--
ALTER TABLE `orders`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `purchase`
--
ALTER TABLE `purchase`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `stock`
--
ALTER TABLE `stock`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `supplier`
--
ALTER TABLE `supplier`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
