# ![70%](images/img_blue.png) 
# Loop Invariant
CodeSquad Master 
Hoyoung Jung

---
<!-- page_number: true -->
 
# 실습 
Insertion Sort를 구현해 봅시다. 

https://youtu.be/DFG-XuyPYUQ
https://ko.wikipedia.org/wiki/%EC%82%BD%EC%9E%85_%EC%A0%95%EB%A0%AC

https://gist.github.com/honux77/31f67eabf0996a8656d3146ed19afb12

---
# Insertion Sort 모법답안

https://gist.github.com/honux77/72fca257b708eda92b74e6ed3af1f08c

---
# Loop Invariant 

## 알고리즘의 정확도를 검증하는 방법 

## 반복문 안에서 항상 참이 되는 어떤 조건 

---
# Loop Invariant의 특징

### Initialization
반복문 시작 전에 항상 참

### Maintenance
이전에 참이었다면 루프를 돌고 난 후에도 참 

### Termination 
루프를 종료한 후에 invariant는 알고리즘의 옮음을 보여주는 유용한 정보를 주어야 한다. 


--- 
# Insertion Sort의 Loop Invariant
>  n 번째 루프에서 [1...n-1] 배열은 원본 배열과 같은 원소를 가지고 있고 정렬되어 있다.  
## 검증
각자 해 보자. 

---
# 참고자료
Introduction to Algorithm, Chapter 2.