delimiter $$

CREATE TABLE `book` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `author` varchar(50) NOT NULL,
  `description` varchar(1000) NOT NULL,
  `isbn` varchar(10) NOT NULL,
  `title` varchar(250) NOT NULL,
  `reader_username` varchar(25) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_reader_username` (`reader_username`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4$$

