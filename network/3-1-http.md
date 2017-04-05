# ![70%](images/img_blue.png) 
# HTTP의 기초
<p align='center'>
CodeSquad Master <br>
Hoyoung Jung
</p>

---
<!-- page_number: true -->
# 인터넷과 웹 
## 웹 = WWW = World Wide Web

### 팀 버너스리에 의해 개발됨 

- 웹과 인터넷은 다른 것 
- 웹의 3요소: HTTP, HTML, URL

### 참고 영상
테드 
생활코딩

---

# HTTP = HyperText Transfer Protocol

WWW 상에서 정보를 주고받을 수 있는 프로토콜. 주로 HTML 문서를 주고받는 데에 쓰인다. TCP와 UDP를 사용하며, 80번 포트를 사용한다.

![80%](images/w301.png)


---
# Web Client와 Server

![](images/w3-1.GIF)

엄청난 추상화가 되어 있는 그림


---

클라이언트: 주로 웹 브라우저로 항상 요청만 한다. 

서버: 클라이언트의 요청에 대해 적당한 문서를 제공해 준다. 

프록시: 클라이언트와 서버 사이에 존재. 무언가 일을 해 준다. 
	
* 캐싱, 필터링, 로드 밸런싱, 인증, 로깅 등의 다양한 기능을 수행  


---
 # HTTP의 특징
 - 간단
 - 확장 가능
 - 상태가 없다. = stateless
 - <b>세션은 존재 = 쿠키를 이용해</b>
 - HTTP1 --> HTTP/1.1 --> HTTP/2 로 발전 

---
# 파이썬으로 웹 서버 띄우기 
```
$ echo "<h1>hello</h1>" > index.html
# python2
$ python -m SimpleHTTPServer 8000
# python3 
$ python -m http.server 8000
```
---
# 웹 클라이언트 테스트 

## 웹 브라우저로 열어 보기

## curl로 열어보기
```bash
$ curl 127.0.0.1:8000
```

---
## telnet으로 열어 보기
HTTP request를 직접 보내기

아래 내용을 입력한다.
```
$ telnet 127.0.0.1 8000
GET / HTTP/1.0 
Host: localhost:8000 
# 엔터 두번 입력 
```
---

# HTTP Response example
```html 
HTTP/1.0 200 OK
Server: SimpleHTTP/0.6 Python/3.5.2
Date: Sun, 02 Apr 2017 08:03:08 GMT
Content-type: text/html
Content-Length: 15
Last-Modified: Sun, 02 Apr 2017 07:10:05 GMT

<h1>Hello</h1>
Connection closed by foreign host.
```

---


웹 브라우저로 다시 열어 봅시다. 

개발자 도구의 네트워크 탭을 열고 새로 고침을 해 봅시다.


---

# HTTP 동작방식

![](images/w302.png)

* 실제로는 DNS 서버가 개입한다. 

---

# HTTP Request 메시지의 구조

![](images/w303.png)


---

# HTTP Response 메시지의 구조

![](images/w304.png)

---

# 브라우저의 동작
- 최초에는 HTML 을 가져옴
- HTML에서 CSS, js, 이미지에 대한 링크 정보를 추출
- 추출한 정보의 URL을 이용 새로운 요청을 보냄 
- 모든 웹 자원을 받아와서 렌더링 시작 
- 1.1 은 파이프라인, 2.0은 병렬처리로 성능개선 

---

# URL: Uniform Resource Locator
## (URI = URL + URN)

리소스를 식별하는 주소 
> 스킴:사용자이름:비번@호스트:포트/경로;패러미터?쿼리#프래그먼트


```
https://honux77:pw1234@github.com:443/
honux77/MMT?file=sum.py#30
```
- 쿼리: 편의상 =과 &를 사용한다. 
- 프래그먼트: 클라이언트만 사용 

---

# 포맷
MIME (Multipurpose Internel Mail Extensions) 타입으로 포맷을 분류 
원래는 전자 우편을 위한 표준 
```
Content-Type: 
text/plain
text/html
text/css
image/jpeg
image/png
audio/mpeg
audio/ogg
audio/*
video/mp4
application/octet-stream
multipart/mixed
```
- https://developer.mozilla.org/ko/docs/Web/HTTP/Basics_of_HTTP/MIME_types 


---

# TCP의 3-way Handshake
![](images/w305.png) 


---

# HTTP method
![](images/w306.png) 
주로 많이 사용: GET, POST

---

# GET VS POST
- GET은 URL 뒤에 쿼리스트링으로 패러미터를 전달
- POST는 요청 바디에 숨겨져 보내짐 
- form을 이용한 대용량 파일 전송 
- 구글 주소창에서 검색을 하면? 

---
# HTTP 응답 코드 

| 상태 | 응답 | 의미 |
| --- | --- | --- |
| 200 | OK | 정상적인 처리|
| 302| See Other | 주로 리다이렉트 용도|
|404| Not Found | 리소스가 없다 |
|403| Forbidden | 권한 없음 |
|500| Internal Server Error | 서버 내부 오류 |
|502| Bad Gateway | 중간 계층 오류 |
|503| Service Unavailable | 서비스 제공불가 |


---

# 로그인 상태란 어떤 상태일까? 

---

# 사용자 식별 - 인증을 위한 방법
- IP 추적
- HTTP Authentication
- URL에 식별자 포함
- Cookie 

---

# 쿠키 

![](images/w307.png)

## 쿠키의 용도
- 세션관리
- 개인화 (예: 장바구니)
- 트래킹

---

# session

![](images/w308.png)


---
# 추가로 알아야 하는 것들
- TCP / IP
- 소켓 통신
- 네트워크 기본 지식 
- 추천서적1: 그림으로 배우는 HTTP & Network Basic 
- 추천서적2: 풍부한 그림으로 배우는 TCP / IP 쉽게 더 쉽게

---

# 참고자료
- www3.ntu.edu.sg/home/ehchua/programming/webprogramming/HTTP_Basics.html
- https://developer.mozilla.org/ko/docs/Web/HTTP/Overview 
- https://howdns.works/ep1/ 
- http://www.slideshare.net/deview/d2-campus-http 
- https://developer.mozilla.org/ko/docs/Web/HTTP/Cookies
-  http://www.kyobobook.co.kr/product/detailViewKor.laf?mallGb=KOR&ejkGb=KOR&barcode=9788931447897





