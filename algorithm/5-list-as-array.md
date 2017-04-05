# ![70%](images/img_blue.png) 
# 배열, 리스트, 스트링 
CodeSquad Master 
Hoyoung Jung

---
<!-- page_number: true -->
# 참고 

```
$ brew install javarepl
$ javarepl
java> System.out.println("Hello, repl");
Hello, repl
```

---
# 배열과 리스트 사용해 보기 

```
import java.util.list;
import java.util.ArrayList;
import java.util.LinkedList;

int[] a = new int[];
```

---
# ArrayList의 특성

원소가 많아지면 두 배씩 크기가 커짐

이 때의 복잡도는 O(n)

그래도 괜찮다. 

## *not synchronized!*

https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html

---
 # 구현하기
배열을 이용해서 Linear List를 구현해 봅시다. 

IntegerList -> ObjectList -> GenericList 순으로 구현합니다.

```
public class LinearList {

   private Object[] objList;
   
   public LinearList();
   public boolean empty();
   public int size();
   public Object get(int index);
   public int indexOf(Object o);
   public void insert(Object o);
   public String output();   
}
```
---
# String
특별한 클래스

new 없이 생성 가능 

immutable

StringBuffer와 혼용해서 사용함 

---
# String과 StringBuffer 성능비교

# 시간재기

---
# 배열 또는 문자열 관련 문제들 

1. 주어진 문자열을 뒤짚는 메소드를 작성하라.
2. 배열에 하나만 숫자가 중복되어 있다고 할 때 해당하는 숫자를 리턴하는 메소드를 작성하라.
	- 공간복잡도 O(1) 로 가능한가?
	- 시간복잡도 O(n) 으로 가능한가?

## Hackerrank 문제 풀이

https://www.hackerrank.com/domains/data-structures/arrays

---
# 참고자료

코딩 인터뷰 완전분석
Introduction to algorithm
Data structure and Algorithms in C++
