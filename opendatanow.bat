@echo off
set MYSQL_PWD=mysql
cd "C:\Program Files\MySQL\MySQL Server 8.0\bin"

mysql -u root -e "show databases;"
mysql -u root -e "use serverproject; show tables;"
mysql -u root -e "SELECT * FROM serverproject.doctor;"

