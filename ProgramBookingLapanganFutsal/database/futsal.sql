-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 28, 2020 at 08:45 AM
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
-- Database: `futsal`
--

-- --------------------------------------------------------

--
-- Table structure for table `book_lapangan`
--

CREATE TABLE `book_lapangan` (
  `no_book` int(25) NOT NULL,
  `nama_team` varchar(50) NOT NULL,
  `no_telp` int(30) NOT NULL,
  `kode_petugas` int(20) NOT NULL,
  `nama_petugas` varchar(50) NOT NULL,
  `kode_lapangan` int(20) NOT NULL,
  `nama_lapangan` varchar(50) NOT NULL,
  `harga_perjam` int(50) NOT NULL,
  `sewa` int(30) NOT NULL,
  `total_harga` int(100) NOT NULL,
  `tanggal_book` date NOT NULL,
  `jam_masuk` varchar(30) NOT NULL,
  `jam_keluar` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `book_lapangan`
--

INSERT INTO `book_lapangan` (`no_book`, `nama_team`, `no_telp`, `kode_petugas`, `nama_petugas`, `kode_lapangan`, `nama_lapangan`, `harga_perjam`, `sewa`, `total_harga`, `tanggal_book`, `jam_masuk`, `jam_keluar`) VALUES
(1, 'madun', 123111, 1, 'amar', 1, 'camp nou', 50000, 1, 50000, '1970-01-01', '07.00', '08.00'),
(2, 'ojan', 2111222, 2, 'mamar', 1, 'camp nou', 50000, 3, 150000, '1970-01-01', '09.00', '12.00'),
(3, 'nudam', 9872222, 3, 'namar', 3, 'wembley', 100000, 1, 100000, '2020-06-23', '07.00', '08.00'),
(4, 'Juventus', 899789, 4, 'Fasisal', 3, 'wembley', 100000, 2, 200000, '2020-06-28', '07.00', '09.00'),
(5, 'Barselona', 8977678, 3, 'Pamar', 2, 'old trafod', 100000, 3, 300000, '2020-06-11', '07.00', '08.00');

-- --------------------------------------------------------

--
-- Table structure for table `karyawan`
--

CREATE TABLE `karyawan` (
  `nik` int(25) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `jabatan` varchar(30) NOT NULL,
  `alamat` varchar(154) NOT NULL,
  `telp` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `karyawan`
--

INSERT INTO `karyawan` (`nik`, `nama`, `jabatan`, `alamat`, `telp`) VALUES
(1, 'Ammar', 'Manajer', 'jJl.Sawangan', 87654988),
(2, 'Rebihe', 'Karyawan', 'depok', 87421),
(3, 'Pamar', 'Manajer', 'Jl.Pemda', 87998878),
(4, 'Fasisal', 'Manajer', 'Jl.Mampang Perapatan', 89657798);

-- --------------------------------------------------------

--
-- Table structure for table `lapangan`
--

CREATE TABLE `lapangan` (
  `kode_lapangan` int(25) NOT NULL,
  `nama_lapangan` varchar(50) NOT NULL,
  `harga` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `lapangan`
--

INSERT INTO `lapangan` (`kode_lapangan`, `nama_lapangan`, `harga`) VALUES
(1, 'camp nou', 50000),
(2, 'old trafod', 100000),
(3, 'wembley', 100000),
(5, 'hagowe', 50000),
(6, 'lol', 100000),
(7, 'lola', 50000);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id` int(20) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `akses` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `username`, `password`, `akses`) VALUES
(1, 'admin', 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `pembayaran`
--

CREATE TABLE `pembayaran` (
  `notrans` int(25) NOT NULL,
  `tanggal` date NOT NULL,
  `kode_booking` int(30) NOT NULL,
  `nama_team` varchar(50) NOT NULL,
  `sewa` varchar(50) NOT NULL,
  `total` int(50) NOT NULL,
  `bayar` int(50) NOT NULL,
  `kembalian` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pembayaran`
--

INSERT INTO `pembayaran` (`notrans`, `tanggal`, `kode_booking`, `nama_team`, `sewa`, `total`, `bayar`, `kembalian`) VALUES
(1, '2020-06-21', 2, 'ojan', '3', 150000, 200000, 50000),
(2, '2020-06-21', 1, 'madun', '1', 50000, 50000, 0),
(3, '2020-06-23', 3, 'nudam', '1', 100000, 100000, 0),
(4, '2020-06-28', 4, 'Juventus', '2', 200000, 200000, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `book_lapangan`
--
ALTER TABLE `book_lapangan`
  ADD PRIMARY KEY (`no_book`);

--
-- Indexes for table `karyawan`
--
ALTER TABLE `karyawan`
  ADD PRIMARY KEY (`nik`);

--
-- Indexes for table `lapangan`
--
ALTER TABLE `lapangan`
  ADD PRIMARY KEY (`kode_lapangan`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pembayaran`
--
ALTER TABLE `pembayaran`
  ADD PRIMARY KEY (`notrans`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
