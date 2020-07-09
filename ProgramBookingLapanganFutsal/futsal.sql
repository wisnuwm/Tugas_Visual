-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 05 Bulan Mei 2020 pada 20.37
-- Versi server: 10.4.6-MariaDB
-- Versi PHP: 7.3.9

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
-- Struktur dari tabel `booking`
--

CREATE TABLE `booking` (
  `id` int(8) NOT NULL,
  `tanggal` date NOT NULL,
  `jam` varchar(20) NOT NULL,
  `jam2` varchar(20) NOT NULL,
  `waktu` varchar(20) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `harga` varchar(20) NOT NULL,
  `dp` varchar(20) NOT NULL,
  `sisa` varchar(20) NOT NULL,
  `telp` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `booking`
--

INSERT INTO `booking` (`id`, `tanggal`, `jam`, `jam2`, `waktu`, `nama`, `harga`, `dp`, `sisa`, `telp`) VALUES
(123, '2020-05-01', '08.00', '09.00', '1 Jam', 'rere', '100000', '20000', '80000', '08767761'),
(333, '2020-05-01', '07.00', '10.00', '4 Jam', 'wqe', '400000', '4000', '96000', '2221121');

-- --------------------------------------------------------

--
-- Struktur dari tabel `form_booking`
--

CREATE TABLE `form_booking` (
  `kode_booking` varchar(50) NOT NULL,
  `tanggal_pemesan` date NOT NULL,
  `waktu` date NOT NULL,
  `nama_pemesan` varchar(50) NOT NULL,
  `nama_team` varchar(20) NOT NULL,
  `no_hp` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
  `id` int(8) NOT NULL,
  `waktu` varchar(20) NOT NULL,
  `harga` varchar(20) NOT NULL,
  `dp` varchar(20) NOT NULL,
  `sisa` varchar(20) NOT NULL,
  `jumlah` varchar(20) NOT NULL,
  `kembali` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `transaksi`
--

INSERT INTO `transaksi` (`id`, `waktu`, `harga`, `dp`, `sisa`, `jumlah`, `kembali`) VALUES
(4343, '1 Jam', '100000', '111111', '-11111', '111111', '-11111');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `booking`
--
ALTER TABLE `booking`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `form_booking`
--
ALTER TABLE `form_booking`
  ADD PRIMARY KEY (`kode_booking`);

--
-- Indeks untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
