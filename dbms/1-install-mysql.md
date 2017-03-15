<!-- page_number: true -->
# ![30%](images/img_blue.png) 
# MySQL 설치
<p align='center'>
CodeSquad Master <br>
Hoyoung Jung
</p>

---
# 설치 과정 
- ubuntu 16.04 설치 
- **중요: ubuntu 스냅샷 생성**
- mysql 설치 
- root password를 꼭 넣어야 함!  
```
$ sudo apt install mysql-server
$ sudo service mysql start
$ sudo update-rc.d mysql defaults
$ mysql -u root -p
```

---
# utf-8 설정
https://github.com/honux77/practice/wiki/mysql-ko-utf8

/etc/mysql/my.cnf 아래에 아래 추가
```
[client]
default-character-set = utf8
 
[mysqld]
init_connect = SET collation_connection = utf8_general_ci
init_connect = SET NAMES utf8
character-set-server = utf8
collation-server = utf8_general_ci
 
[mysqldump]
default-character-set = utf8
 
[mysql]
default-character-set = utf8
```

---
# 일반사용자 외부 접속 허용
```
$ cd /etc/mysql
$ grep -r 'bind'
# bind-adress=127.0.0.1 내용 주석처리 
$ sudo sevice mysql restart
```
root 사용자의 외부 접속은 허용하면 안 됩니다. 

---
# 재부팅시 mysqld 자동 실행
```bash
$ sudo update-rc.d mysql defaults
# sudo update-rc.d mysql remove
```

---
# 데이터베이스 및 일반 사용자 생성 
```sql
CREATE DATABASE mydb;
--- 아이디 및 패스워드 설정 
CREATE USER 'myuserid'@'%' IDENTIFIED BY 'mypassword';
GRANT ALL ON mydb.* TO 'myuserid'@'%';
FLUSH PRIVILEGES;
```
`mydb`: 데이터베이스 이름
`myuserid`: 사용자 id
`mypassword`: 사용자 패스워드 

---
# GUI 이용 접속
## macOS
https://www.sequelpro.com/

## windows
HeidiSQL
http://www.heidisql.com/

---
# 참고자료 
https://dev.mysql.com/doc/refman/5.7/en/