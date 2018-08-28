CREATE TABLE `customer` (
  `customer_id` varchar(32) NOT NULL DEFAULT '',
  `member_id` varchar(32) DEFAULT NULL,
  `global_id` varchar(32) DEFAULT NULL,
  `company_name` varchar(64) DEFAULT NULL,
  `source` varchar(16) DEFAULT NULL,
  `company_type` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;