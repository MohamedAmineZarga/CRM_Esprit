-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : lun. 29 août 2022 à 14:08
-- Version du serveur :  10.4.18-MariaDB
-- Version de PHP : 7.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `crm_esprit`
--

-- --------------------------------------------------------

--
-- Structure de la table `reclamations`
--

CREATE TABLE `reclamations` (
  `id_r` int(11) NOT NULL,
  `date` date NOT NULL,
  `description` longtext NOT NULL,
  `typeR` varchar(255) NOT NULL,
  `etatR` tinyint(1) NOT NULL,
  `id_u` int(11) DEFAULT NULL,
  `id_s` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `reclamations`
--

INSERT INTO `reclamations` (`id_r`, `date`, `description`, `typeR`, `etatR`, `id_u`, `id_s`) VALUES
(2, '2022-08-05', 'ccccc', 'ccc', 0, 6, 8),
(44, '2022-08-01', 'waza', 'wazaaa', 0, 6, 8),
(45, '2022-08-01', 'exa', 'exa', 0, NULL, NULL),
(46, '2022-08-01', 'exa', 'exa', 0, NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `services`
--

CREATE TABLE `services` (
  `id_s` int(11) NOT NULL,
  `nom` varchar(255) NOT NULL,
  `email_address` varchar(255) NOT NULL,
  `phone_number` varchar(255) NOT NULL,
  `typeS` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `services`
--

INSERT INTO `services` (`id_s`, `nom`, `email_address`, `phone_number`, `typeS`) VALUES
(8, 'fffffffff', 'ffffffffff', '556555', 'eleve');

-- --------------------------------------------------------

--
-- Structure de la table `users`
--

CREATE TABLE `users` (
  `id_u` int(11) NOT NULL,
  `nom` varchar(255) NOT NULL,
  `prenom` varchar(255) NOT NULL,
  `genre` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `date_n` date DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` varchar(255) NOT NULL,
  `etat` varchar(255) NOT NULL,
  `logged_in` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `users`
--

INSERT INTO `users` (`id_u`, `nom`, `prenom`, `genre`, `address`, `date_n`, `email`, `password`, `role`, `etat`, `logged_in`) VALUES
(3, 'amine', 'bbbbbb', 'homme', 'ggggg', '2000-10-09', 'amine@esprit.tn', 'aaa12A', 'hhhhh', 'hhghgjhg', 0),
(4, 'bayram', 'bayram', 'homme', 'ggggg', '2000-10-09', 'bayram@esprit.tn', 'bayrambayram', 'bayram', 'bayram', 1),
(5, 'AMINEAMINE', 'AMINEAMINE', 'homme', 'ggggg', '2000-10-09', 'AMINEAMINE@esprit.tn', 'AMINEAMINEAMINEAMINEAMINEAMINEAMINEAMINE', 'AMINEAMINE', 'AMINEAMINE', 0),
(6, 'amine', 'bbbbbb', 'homme', 'ggggg', '2000-10-10', 'amine@esprit.tn', 'aaa12A', 'hhhhh', 'hhghgjhg', 0),
(8, 'xxxxxxx', 'xxxxxxxx', 'homme', 'ggggg', '2000-10-08', 'xxxxxxx@esprit.tn', 'aaa12A', 'hhhhh', 'hhghgjhg', 0),
(18, 'cccccc', 'ccccc', 'ccccc', 'cccccc', '2022-08-09', 'cc', 'cccc', 'ccc', 'cccc', 1),
(19, 'cccccc', 'ccccc', 'ccccc', 'cccccc', '2022-08-09', 'cc', '', 'ccc', 'cccc', 0);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `reclamations`
--
ALTER TABLE `reclamations`
  ADD PRIMARY KEY (`id_r`),
  ADD KEY `fk_user` (`id_u`),
  ADD KEY `fk_service` (`id_s`);

--
-- Index pour la table `services`
--
ALTER TABLE `services`
  ADD PRIMARY KEY (`id_s`);

--
-- Index pour la table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id_u`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `reclamations`
--
ALTER TABLE `reclamations`
  MODIFY `id_r` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=47;

--
-- AUTO_INCREMENT pour la table `services`
--
ALTER TABLE `services`
  MODIFY `id_s` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT pour la table `users`
--
ALTER TABLE `users`
  MODIFY `id_u` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `reclamations`
--
ALTER TABLE `reclamations`
  ADD CONSTRAINT `fk_service` FOREIGN KEY (`id_s`) REFERENCES `services` (`id_s`),
  ADD CONSTRAINT `fk_user` FOREIGN KEY (`id_u`) REFERENCES `users` (`id_u`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
