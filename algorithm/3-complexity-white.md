# ![70%](images/img_blue.png) 
# 알고리즘과 복잡도 복습
CodeSquad Master 
Hoyoung Jung

---
<!-- page_number: true -->
 
# 복잡도(complexity) 분석

- 성능 분석을 위해 사용됨

## 공간복잡도

## 시간복잡도  

---
# Asymptotic notation

- 알고리즘 복잡도를 단순히 표현하기 위해 사용됨
- Big-O 표기법이 가장 유명 

---
# Big-O notation

$$ f(x) = O(g(x)) $$

or if and only if there exist constants n and c such that 

$$ 0 \le|f(x)| \le c|g(x)|\ for\ all\ x > n $$


---
# Big-O notation

![](images/3-bo.gif)

---
# Big-O notation의 의미
- 인풋의 크기가 충분히 커진 상태의 성능
- 최악의 성능을 의미 
## *Upper Bound*

---

# Big O에서 자주 사용하는 함수

$$O(1), O(log\ n), O(n), O(n\ log\ n), O(n^2), O(2^n), O(n!), O(n^n) $$

---
# Theata Notation

$$ f(x) = \Theta (g(x)) $$

or if and only if there exist constants n, c1, and c2 such that 

$$ 0 \le c_1g(x) \le |f(x)| \le c_2|g(x)|\ for\ all\ x > n $$

## *asymptotically tight bound*

---
# Omega Notation 

$$ f(x) = \Omega (g(x)) $$

or if and only if there exist constants n, c1, and c2 such that 

$$ 0 \le c_1g(x) \le |f(x)| \le c_2|g(x)|\ for\ all\ x > n $$

## *asymptotic lower bound*