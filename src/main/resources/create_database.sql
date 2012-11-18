DROP DATABASE IF EXISTS youtube-evidence;
CREATE DATABASE youtube-evidence CHARACTER SET utf8 COLLATE utf8_general_ci;
GRANT ALL ON youtube-evidence.* TO youtube-evidence@localhost IDENTIFIED BY "youtube-evidence";
FLUSH PRIVILEGES;