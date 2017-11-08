# 코드스쿼드 블루 공통역량 인증 시험 
![](images/201706220149.png)

(문제 설명)
> 시간은 15시부터 23시 전까지
> 인터넷과 공부 자료를 참고할 수 있다. 그대로 베낄 경우 0점 
> 타인이 대신 답을 작성해 줄 수 없다. QA는 무방 
> 시험 시작시 슬랙 common-course 채널에 메시지를 남길 것 
> 시험 제출시에도 슬랙  common-course  채널에 매시지를 남길 것 
> 제출은 pdf등 읽을 수 있는 형태로 제출할 것 
> 손으로 쓴 답안을 사진으로 찍은 후 pdf로 변환 제출도 무방, 단 가독성을 확인할 것 
> 사람이 이해할 수 있는 쉬운 문장으로 기술할 것 

# part 1. git / github 

### 1. 다음 용어에 대해 간단히 설명하세요. 

> git
> github
> branch
> HEAD

### 2. revert 와 reset 의 차이에 대해 설명하세요.

### 3. 다음 명령의 의미하는 바는?
`git branch -f master HEAD~3`



# part2. 네트워크

### 4. 브라우저에서 `www.naver.com`을 타이핑했을 때부터 화면에 표시되는 과정을 기술하시오.

### 5. HTTP는 stateful / stateless? 
### 6. HTTP에서 세션을 유지하는 방법은? 
### 7. RESTful API와 일반 웹 페이지와의 차이점은 무엇인가?
### 8. RESTful API에서 인증은 무엇이고, 왜, 어떻게 하는가? 
### 9. `https://www.naver.com/user/151` 을 통해 151번 유저의 정보를 가져오고 싶다. 이를 구현하는 방식에 대해 기술하라. 



# part3. 데이터베이스

### 10. 트랜잭션이란 무엇인가? 
### 11. 정규화란 무엇이며 왜 하는가? 
### 12. 역정규화란 무엇이며 왜 하는가? 
### 13. 아래 쿼리의 의미는 무엇이고, 언제 왜 사용할까? 
```
SELECT UID, NAME, TITLE, DATE FROM ARTICLE WHERE NAME = 'HONUX' ORDER BY DATE DESC LIMIT 100,20
```
### 14. 위 쿼리의 성능을 높이기 위해서는 무엇을 해야 하는가? 단 pk= UID로 가정.
### 15. 참조무결성 제약조건이란 무엇인가?
### 16. 외래키를 사용하지 않고 조인을 할 수 있는가? 만약 할 수 있다면 실제 응용에서 써도 무방할까? 이유는? 



# part4. 알고리즘 

### 17. 빅오, 쎄타, 오메가의 수식과 의미에 대해 설명하라. 이중 가장 많이 사용하는 것은 무엇이며 왜 그렇다고 생각하는가?

### 18. 가장 좋아하는 자료구조와 이유는? 

### 19. 가장 많이 사용하는 자료구조 2 종류는 무엇인가?

### 20. 자바의 Hashmap과 Hashtable의 차이는 무엇인가?

### 21. merge sort를 구현하시오. 

### 22. 다양한 종류의 sort를 배운 이유는 무엇일까? 

### 23. DFS 알고리즘에 대해 한글로 설명하시오. 

### 24. 다이나믹 프로그래밍이란 무엇인가?

### 25. 그리디 정책이란 무엇인가?

### 26. 분할정복이란 무엇인가? 



# part5. 운영체제

### 27. 프로세스와 스레드에 대해 자세히 설명하시오.

### 28. 동기 / 비동기에 대해 설명하시오.

### 29. 날씨 확인 단추를 누르면 기상청에 접속해서 날씨 정보를 얻어와서 화면에 뿌리는 앱이 있다. 확인 단추를 누를 때마다 나머지 GUI 기능이 잠시 멈추는 데 왜 그렇게 될까? 그리고 해결책은 무엇일까? 

### 30. 한철수는 안드로이드에서 스레드를 하나  만들어서 GUI를 갱신하려고 했더니, 오류가 발생했다. 대체 왜 그럴까? 



# 기타

### 보너스. 아래 책들을 꼭 읽어 주세요. OK? (yes / no) - (20점) 
```
윤성우의 C언어 
윤성우의 자료구조 
윤성우의 윈도우즈 시스템 프로그래밍 
윤성우의 TCP/IP 
초보 디비서적 1권 
(옵션) 윤성우의 난 자바를 모른다구요?
```
