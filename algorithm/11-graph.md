# ![70%](images/img_blue.png)
# Tree
CodeSquad Master
Hoyoung Jung

---
<!-- page_number: true -->
# 트리
https://en.wikipedia.org/wiki/Tree_(data_structure)


---
# 2진 검색 트리 
https://visualgo.net/ko/bst

---
# 자주 사용하는 용어들
- 이진 트리
- 이진 순회 트리 
- 균형트리 / 불균형 트리
- 완전이진트리 
- **순회**
- AVL 트리, 레드블랙 트리 
- 트라이

---
# 2진 트리를 구현하는 방법
1. 배열을 이용한 방법
2. 참조를 이용한 방법 
```
    5
   / \
  3   7
   \   \
    4   9
```
배열 howto?

---
# 2진 검색 트리(BST) 구현하기 
- find(v)
- insert(v)
- erase(v)
- printAll()

---
# find(v)
```
TreeNode find(int v)
```
binary search를 이용해 검색 수행 
찾을 경우 해당 노드를 리턴
못 찾을 경우 `null` 리턴

---
# insert(v)

중복값을 허용하는 않는 방식으로 구현하는 편이 쉬움

`find(v)` 알고리즘을 수행, 값이 존재하면 해당 위치에 덮어쓰기 수행 

못 찾을 경우 들어갈 노드의 부모 노드에 새 노드를 만들어서 삽입

삽입시 부모의 왼쪽인지 오른쪽인지를 대소 비교로 결정 

---
# erase(v)
- case 1, 해당 노드가 리프 노드일 경우 -그냥 삭제 
- case 2, 자식수가 1일 경우 - 부모와 자식을 연결 
- case 3, 자식수가 2일 경우 - 오른쪽 트리에서 가장 작은 값을 현재 노드로 옮김

https://visualgo.net/en/bst 참조해서 구현하자 

---
## erase(v) case 3

```java
node = find(v)
node2 = findMin(node.right)
node.value = node2.value
node2.erase(v)
```

---
# BST 구현하기 
https://gist.github.com/honux77/f855ca307cfb2eb29e2861d618590a34


---
# 2진 트리의 순회(traversal)
https://en.wikipedia.org/wiki/Tree_traversal
- 전위
- 중위
- 후위
면접때 자주 물어보므로 꼭 알아야 함 

---
# 전위(Pre-order) 순회
1. 현재 노드가 비어 있는지 검사 
2. 현재 노드를 출력 
3. 왼쪽 서브 트리에 대해 pre-order 호출
4. 오른쪽 서브 트리에 대해 pre-order 호출 
![](https://upload.wikimedia.org/wikipedia/commons/thumb/d/d4/Sorted_binary_tree_preorder.svg/220px-Sorted_binary_tree_preorder.svg.png)
> F, B, A, D, C, E, G, I, H.

---
# 전위 순회
```java
public void preorder(Tree t)
if (t != null) {
    visit(t)
    preorder(t.left)
    preorder(t.right)
}
```
---
# 중위(In-order) 순회

1. 현재 노드가 비어 있는지 검사 
2. 왼쪽 서브 트리에 대해 in-order 호출
3. 현재 노드를 출력 
4. 오른쪽 서브 트리에 대해 in-order 호출 

---
# 후위(Post-order) 순회
1. 현재 노드가 비어 있는지 검사 
2. 왼쪽 서브 트리에 대해 post-order 호출
3. 오른쪽 서브 트리에 대해 post-order 호출 
4. 현재 노드를 출력 


---
# 기타 트리 관련 문제 
- 주어진 이진 트리가 균형 이진 트리인지 판별하는 함수를 구현하시오.
- 정렬된 배열로부터 높이가 가장 낮은 BST를 생성하는 알고리즘을 구현하시오.
- 이진 트리를 순회하는 알고리즘을 작성하시오. 재귀를 사용하지 않는 방법은? 
- 이진 트리가 이진 탐색 트리인지 판별하려면? 
- 트리를 차수별로 출력하는 알고리즘을 작성하시오.   
---
# 참고자료
위키 
코딩인터뷰 완전분석
Data Structure, Algortihms and Applications in C++ 
Introduction to algorithms