CREATE TABLE `mmr` (
  `aadhaar` varchar(12) NOT NULL,
  `fullname` varchar(50) NOT NULL,
  `phone` varchar(10) DEFAULT NULL,
  `vaccine` varchar(20) DEFAULT NULL,
  `dose` varchar(10) DEFAULT NULL,
  `vaccinedate` date DEFAULT NULL,
  PRIMARY KEY (`aadhaar`)
) 