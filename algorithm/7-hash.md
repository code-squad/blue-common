<!-- $theme: default -->

# ![70%](images/img_blue.png) 
# 해시 테이블 
CodeSquad Master 
Hoyoung Jung

---
<!-- page_number: true -->
# 해시란 

![](images/hash.png)

자세한 내용은 화이트 코스 자료 참조

---
# 자바의 해시 

자바에는 해시맵과 해시테이블 두 종류가 존재

해시맵 : 동기화 미지원
해시테이블: 동기화 지원 

---
# Hashmap
```
//import java.util.HashMap
//same as Hashtable
HashMap <String, Integer> hashmap = 
    new HashMap<String, Integer>();
hashmap.put("honux", 5348);
hashmap.put("crong", 7777);
System.out.println(hashmap.get("honux"));
System.out.println(hashmap.get("crong"));

hashmap.put("honux", 9999);
System.out.println(hashmap.get("honux"));gg
```

---
# Hash 구현하기 

https://gist.github.com/honux77/11c105933f5990ce97af15e905f8b954


---
# 구현하기  

같은 키에 여러 값을 저장할 수 있는 해시맵을 구현하려면? 

---
## Hackerrank 문제 풀이

https://www.hackerrank.com/domains/data-structures/arrays

---
# 참고자료

코딩 인터뷰 완전분석

Introduction to algorithm

Data structure and Algorithms in C++

http://www.algolist.net/Data_structures/Stack
