-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 29, 2021 at 01:03 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbtokokue`
--

-- --------------------------------------------------------

--
-- Table structure for table `tblkue`
--

CREATE TABLE `tblkue` (
  `id_kue` varchar(4) NOT NULL,
  `nama_kue` varchar(30) NOT NULL,
  `harga` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tblkue`
--

INSERT INTO `tblkue` (`id_kue`, `nama_kue`, `harga`) VALUES
('K001', 'Brownies Cokelat', '180000'),
('K002', 'Vanilla Cheese Cake', '180000'),
('K003', 'Redvelvet Tart', '180000'),
('K004', 'Tiramisu Tart', '200000'),
('K005', 'Blackforest', '210000'),
('K006', 'Dessert Box Oreo', '45000'),
('K007', 'Dessert Box Regal', '50000'),
('K008', 'Dessert Box Tiramisu', '40000');

-- --------------------------------------------------------

--
-- Table structure for table `tblpembeli`
--

CREATE TABLE `tblpembeli` (
  `id_pembeli` varchar(4) NOT NULL,
  `nama_pembeli` varchar(30) NOT NULL,
  `no_hp` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tblpembeli`
--

INSERT INTO `tblpembeli` (`id_pembeli`, `nama_pembeli`, `no_hp`) VALUES
('P001', 'Gerrard', '082200000049'),
('P002', 'Nicodemus', '085100000098'),
('P003', 'Andi', '081200000024'),
('P004', 'Pratama', '081300000076'),
('P005', 'Panca', '085700000011');

-- --------------------------------------------------------

--
-- Table structure for table `tbltransaksi`
--

CREATE TABLE `tbltransaksi` (
  `id_transaksi` varchar(4) NOT NULL,
  `tgl_transaksi` date NOT NULL,
  `pembeli` varchar(50) NOT NULL,
  `id_kue` varchar(50) NOT NULL,
  `jumlah_beli` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbltransaksi`
--

INSERT INTO `tbltransaksi` (`id_transaksi`, `tgl_transaksi`, `pembeli`, `id_kue`, `jumlah_beli`) VALUES
('T001', '2021-12-29', 'P001 - Gerrard', 'K001', '1'),
('T002', '2021-12-29', 'P002 - Nicodemus', 'K005', '2'),
('T003', '2021-12-29', 'P003 - Andi', 'K007', '1'),
('T004', '2021-12-29', 'P004 - Pratama', 'K005', '4'),
('T005', '2021-12-29', 'P005 - Panca', 'K002', '1');

-- --------------------------------------------------------

--
-- Table structure for table `tbluser`
--

CREATE TABLE `tbluser` (
  `id_user` varchar(4) NOT NULL,
  `nama_user` varchar(30) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbluser`
--

INSERT INTO `tbluser` (`id_user`, `nama_user`, `password`) VALUES
('U001', 'Gerrard', '12345'),
('U002', 'Nicodemus', '54321'),
('U003', 'Budi', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tblkue`
--
ALTER TABLE `tblkue`
  ADD PRIMARY KEY (`id_kue`);

--
-- Indexes for table `tblpembeli`
--
ALTER TABLE `tblpembeli`
  ADD PRIMARY KEY (`id_pembeli`);

--
-- Indexes for table `tbltransaksi`
--
ALTER TABLE `tbltransaksi`
  ADD PRIMARY KEY (`id_transaksi`);

--
-- Indexes for table `tbluser`
--
ALTER TABLE `tbluser`
  ADD PRIMARY KEY (`id_user`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
