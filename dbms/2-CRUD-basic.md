# ![80%](images/img_blue.png) 
# MySQL CRUD Basic
<p align='center'>
CodeSquad Master <br>
Hoyoung Jung
</p>

---
<!-- page_number: true -->
# CRUD란?

- Create
- Retreival
- Update
- Delete

가장 기본적인 데이터베이스 연산

---
# 테이블 생성 
```sql
DROP TABLE IF EXISTS USER;
CREATE TABLE USER (
    USERID INT PRIMARY KEY AUTO_INCREMENT,
    EMAIL VARCHAR(64),
    NAME VARCHAR(64),
    PASSWORD VARCHAR(64),
    COMMENT TEXT,
    START_DATE DATETIME,
    );
```

---
# INSERT 
Create 에 해당 
```
INSERT INTO USER VALUES (NULL, ...);
INSERT INTO USER(NAME, PW) VALUES ('honux', 'asdf');
```

---
# SELECT 
Retrieval에 해당
```
SELECT * FROM USER;
SELECT ID, NAME FROM USER;
SELECT ID, NAME FROM USER WHERE ID=3;
```

---
# UPDATE

팁: UPDATE 문과 SELECT 문은 거의 비슷함, SELECT를 먼저 수행해 본다. 

```
UPDATE USER SET MONEY = 0; #모든 값 업데이트
UPDATE USER SET NAME = 'Honux' WHERE ID=2;
```

---
# DELETE

팁: DELETE 문과 SELECT 문은 거의 비슷함
실수를 방지하기 위해 SELECT를 먼저 수행해 보자. 
```
DELETE FROM USER; #모든 레코드 삭제 
DELETE FROM USER WHERE ID = 4;
```


---
## 실습: CRUD  

- 테이블 생성
```
USER(USERID, EMAIL, NAME)
BOARD(BOARDID, USERID, TITLE, BODY, POST_DATE)
```
- 데이터 삽입 5개
- 갱신 3번 
- 삭제 3번

꼭 직접 타이핑해서 실습하세요! 

---
# 참고자료 
https://dev.mysql.com/doc/refman/5.7/en/