CREATE DATABASE test_db;

USE test_db;

CREATE TABLE `events` (
`id` INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
`date` DATETIME,
`event` VARCHAR(45)
);


INSERT INTO `events` (`date`, `event`)
VALUES
('2023-01-01 00:10:00', 'Event-1'),
('2023-01-01 00:15:00', 'Event-2'),
('2023-01-01 00:20:00', 'Event-3'),
('2023-01-02 00:10:00', 'Event-1'),
('2023-01-02 00:15:00', 'Event-2'),
('2023-01-02 00:20:00', 'Event-3'),
('2023-01-03 00:10:00', 'Event-1'),
('2023-01-03 00:20:00', 'Event-3'),
('2023-01-04 00:10:00', 'Event-1'),
('2023-01-04 00:15:00', 'Event-2'),
('2023-01-04 00:20:00', 'Event-3');