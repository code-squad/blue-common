# ![80%](images/img_blue.png) 
# MySQL Data Type
<p align='center'>
CodeSquad Master <br>
Hoyoung Jung
</p>

---
<!-- page_number: true -->
# MySQL에서 지원하는 Data Type
 
 | 타입         | 용도             |
| ---------- | -------------- |
| Numeric    | 숫자             |
| Date, Time | 날짜와 시간         |
| String     | 문자열            |
| Spatial    | 지리 데이터, 공간 데이터 |
| JSON       | Json 저장용       |


---
#  Numeric types

| 타입                        | 용도       | 기타                 |
| ------------------------- | -------- | ------------------ |
| INT ( = INTEGER)          | 정수       | 4 Byte 정수          |
| TINYINT, SMALLINT, BIGINT | 기타 정수    | 1,2,8              |
| DEC(10, 2)                | 8 + 2자리 실수  | 정확한 계산 |
| FLOAT, DOUBLE             | 부동소수점 실수 | 4, 8 바이트           |


---
#  Numeric types 

- 오버플로우에 주의할 것 

```
SELECT 9223372036854775807 + 1; 
```

---
# Date and Time types

| 타입        | 용도                |
| --------- | ----------------- |
| TIME      | 시간                |
| DATETIME  | 날짜와 시간            |
| DATE      | 날짜                |
| TIMESTAMP | 생성 및 변경시간을 자동 저장 |
| YEAR      | 년도                |

---
# Date and Time types
- DATETIME은 1000 ~ 9999년 범위 저장
- TIMESTMAP는 1970 ~ 2038년까지 저장 

- 날짜 계산에는 DATE_SUB()와 DATE_ADD()함수를 사용할 것 

- 그 외에도 timezone 등 여러가지 이슈가 많다. 

```
SELECT DATE_SUB(NOW(), INTERVAL 1 DAY); #YESTERDAY
```

---
# String Types

| 타입      | 용도                             |
| ------- | ------------------------------ |
| CHAR    | 고정길이 문자열                       |
| VARCHAR | 가변길이 문자열                       |
| BINARY  | 2진 데이터                         |
| BLOB    | 대용량 데이터, 파일 등 아무거나 저장용         |
| TEXT    | 대용량 텍스트, 인코딩 및 콜레이션 설정 가능 |

---
# 나머지는 공식 문서를 봅시다. 

https://dev.mysql.com/doc/refman/5.7/en/blob.html

- 콜레이션: http://chobodba.tistory.com/3 


