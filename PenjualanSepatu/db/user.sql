-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 06, 2020 at 09:52 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `user`
--

-- --------------------------------------------------------

--
-- Table structure for table `inputbrg`
--

CREATE TABLE `inputbrg` (
  `kode_sepatu` int(20) NOT NULL,
  `nama_sepatu` varchar(50) NOT NULL,
  `warna` varchar(50) NOT NULL,
  `harga` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `inputbrg`
--

INSERT INTO `inputbrg` (`kode_sepatu`, `nama_sepatu`, `warna`, `harga`) VALUES
(1, 'bataaa koko', 'merah', '150000'),
(2, 'bata koo', 'biru', '1000000'),
(3, 'no bata', 'hijau', '900000'),
(4, 'ko bata na', 'jingga', '100000'),
(5, 'babatata', 'merah', '50000');

-- --------------------------------------------------------

--
-- Table structure for table `karyawan`
--

CREATE TABLE `karyawan` (
  `NIK` int(10) NOT NULL,
  `Nama_Karyawan` varchar(50) NOT NULL,
  `Jabatan` varchar(20) NOT NULL,
  `Alamat` varchar(50) NOT NULL,
  `No_Telp` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `karyawan`
--

INSERT INTO `karyawan` (`NIK`, `Nama_Karyawan`, `Jabatan`, `Alamat`, `No_Telp`) VALUES
(1, 'wisnu munawar', 'manajer', 'cikoko', 87777777),
(2, 'emih', 'spv', 'cawang', 8665),
(3, 'wiwisnu', 'karyawan', 'cikoko', 98),
(4, 'paldi', 'Karyawan', 'jurang mangu', 98888);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `ID` int(10) NOT NULL,
  `Username` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL,
  `akses` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`ID`, `Username`, `Password`, `akses`) VALUES
(1, 'admin', 'admin', 'admin'),
(2, 'kasir', '12345', 'store');

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `Kode_Supplier` int(10) NOT NULL,
  `Nama_Supplier` varchar(30) NOT NULL,
  `Alamat` varchar(30) NOT NULL,
  `Email` varchar(20) NOT NULL,
  `No_Telp` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`Kode_Supplier`, `Nama_Supplier`, `Alamat`, `Email`, `No_Telp`) VALUES
(1, 'bujana', 'bujana tirta 5', 'bujana222@gmail.com', 219999);

-- --------------------------------------------------------

--
-- Table structure for table `transpenjualan`
--

CREATE TABLE `transpenjualan` (
  `no_transaksi` int(10) NOT NULL,
  `tanggal` date NOT NULL,
  `nama_sepatu` varchar(30) NOT NULL,
  `warna` varchar(20) NOT NULL,
  `harga` int(15) NOT NULL,
  `jumlah_beli` int(5) NOT NULL,
  `sub_total` int(15) NOT NULL,
  `total` int(15) NOT NULL,
  `bayar` int(15) NOT NULL,
  `kembalian` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transpenjualan`
--

INSERT INTO `transpenjualan` (`no_transaksi`, `tanggal`, `nama_sepatu`, `warna`, `harga`, `jumlah_beli`, `sub_total`, `total`, `bayar`, `kembalian`) VALUES
(20, '2020-05-01', 'bata koo', 'biru', 1000000, 1, 1000000, 1000000, 1000000, 0),
(22, '2020-05-03', 'bata koo', 'biru', 1000000, 2, 2000000, 2000000, 2000000, 0),
(67, '2020-05-01', 'bataaa koko', 'merah', 150000, 1, 150000, 150000, 200000, 50000),
(68, '2020-05-01', 'bataaa koko', 'merah', 150000, 1, 150000, 150000, 200000, 50000),
(69, '2020-05-01', 'bataaa koko', 'merah', 150000, 2, 300000, 300000, 350000, 50000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `inputbrg`
--
ALTER TABLE `inputbrg`
  ADD PRIMARY KEY (`kode_sepatu`);

--
-- Indexes for table `karyawan`
--
ALTER TABLE `karyawan`
  ADD PRIMARY KEY (`NIK`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`Kode_Supplier`);

--
-- Indexes for table `transpenjualan`
--
ALTER TABLE `transpenjualan`
  ADD PRIMARY KEY (`no_transaksi`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `inputbrg`
--
ALTER TABLE `inputbrg`
  MODIFY `kode_sepatu` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `transpenjualan`
--
ALTER TABLE `transpenjualan`
  MODIFY `no_transaksi` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=70;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
