# ![70%](images/img_blue.png)
# 퀵소트 성능분석
CodeSquad Master
Hoyoung Jung

---
<!-- page_number: true -->
# Java Sorting 예제
https://github.com/code-squad/blue-common/blob/master/algorithm/codes/common-blue/src/codesquad/Car.java

https://github.com/code-squad/blue-common/blob/master/algorithm/codes/common-blue/src/codesquad/CollectionSort.java

---
# 퀵소트와 삽입 정렬 구현하기

https://github.com/code-squad/blue-common/blob/master/algorithm/codes/common-blue/src/codesquad/MySort.java

---

평균 $O(n\log n)$

최악 $O(n^2)$

언제 최악이 될까? 이미 정렬이 된 경우

개선하려면? 피봇의 위치를 잘 정해야 함
 - 랜덤 피봇
 - 배열의 시작, 중간, 끝 값의 중간값

---
# 실제 성능 비교
- 100건 정도의 갯수에 대해 실제 수행시간을 재 보자.
- 이미 정렬된 배열의 재정렬
- 랜덤하게 생성된 배열의 정렬

---
# 참고자료

코딩 인터뷰 완전분석

Introduction to algorithm

Data structure and Algorithms in C++

http://www.algolist.net/Data_structures/Stack
