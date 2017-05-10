<!-- page_number: true -->

![](images/img_blue.png)
# Shell Script Basic 

CodeSquad Master 
Hoyoung Jung 

---
# 팁: 하루 10초 나를 바꾸기 프로젝트 
pc 패스워드를 잊지 말아야 할 목표나 소원으로 정한다.
> 롤챌린저되자
> 매일영어공부
> 10키로빼기
> 50분마다10분휴식

---
# 리눅스 기본 명령어 

```bash
man
help
pwd
ls
cp, rm, mv
cd 
echo 
cat
vi
env
```

---
# 사용자 관련 명령어
```bash
sudo
adduser
addgroup
usermod
who, w, last
chown
chmod
chgrp
```
---

# 시스템 관련 명령어
```bash
df
du
find
grep
free
kill
ln
mount
ps
```
---
# 패키지 관련 명령
```bash
rpm 
yum 
dpkg
apt-get, apt
```
---
# 기타 명령
```
htop
tmux
zsh
```

---
# 환경 변수
```
$ env
$ echo $HOME
$ echo $SHELL
$ echo $PWD
$ echo $PATH
```

---
# export, source
```
$ export 변수명=값 #새로운 환경변수 설정
$ source 스크립트파일 #현재 셸에서 스크립트 실행 
```
스크립트 파일을 이용해서 환경변수를 설정하기 위해서는 source 명령을 써야 한다!

---
# Shell에서 파일을 실행하면? 
1. 셸은 프로세스를 하나 생성 - fork
2. 프로세스를 실행한 프로그램으로 변경 - exec 
3. 프로그램이 완료되면 해당 프로세스는 사라짐 

---
# 시작 스크립트 
```javascript
[ .profile, .bashrc, .bash_profile ]
```
셸을 시작할 때 자동으로 시작되는 스크립트들 
주로 셸 초기화, 환경변수 설정 등을 위해 사용됨 

---
# Hello 1

hello.sh 작성 
```
#!/bin/bash
echo "Hello"
```

---
# Hello 2
```
$ ./hello2.sh James 
Hello, James
I am hello2.sh
```
어떤 명령이 필요한가요? 

---
# 스크립트에서 사용할 수 있는 변수들
```bash
$ VAR1=$#
$ echo "num=$#"
$ echo "parameter: $0 $1 $2 $3" 
$ echo "parameters: $@"
$ echo "VAR1 = $VAR1"
$ echo 'VAR1 = $VAR1'
$ true
$ echo $?
$ false
$ echo $?
$ echo $RANDOM
$ echo $RANDOM
```

---
# 리다이렉션 
shell에서 입력과 출력의 방향을 바꾸는 명령

표준입력 0 - 키보드
표준출력 1 - 터미널 화면
표준에러 2 - 터미널 화면 
```
> : 표준 출력을 지정 파일로  
< : 키보드 대신 파일로부터 입력받음
2> : 표준 에러를 지정 파일로 
2>&1 : 표준 에러를 표준 출력으로 
1>&2 : 표준 출력을 표준 에러로 
```

---
# 파이프 
앞 프로그램의 출력의 후속 프로그램의 입력으로 사용 
```
ps -A | grep ssh 
```
---
# 키보드 입력 받기
```bash
$ read INPUT
Hello, Stove 
$ echo $INPUT
Hello, Stove
```

---
# 환경 변수 Iteration 
```
#!/bin/bash
NUM=0
for i in $@
do
	echo "$NUM : $i"
	NUM=$(($NUM+1))
done
```

---
# if 구문
형식
```bash
if [ expr ]
then
	...
elif [ expr ]
	...
else
	...
fi
```

---
# test 
```
test 조건식
```
조건식이 참이면 0, 거짓이면 1을 리턴함 
```
$ test 1 = 2; echo $?
$ [ 1 = 2 ]; echo $?
```

---
# file and string test
```
[ -d file ]
[ -f file ]
[ -z string ]
```

---
# 숫자 비교
```
[ 3 -eq 5 ]
[ 3 -ne 5 ]
[ 3 -gt 5 ]
[ 3 -ge 5 ]
[ 3 -le 5 ]
[ 3 -lt 5 ]
```
---
# 문자열 비교 
[[ expr ]] 를 사용하는 것이 좋다. 
```bash
[[ $a == $b ]] 
[[ $a == hello* ]]
[[ $a != $b ]]
```

---
# cron / crontab
주기적으로 스크립트를 자동실행하게 할 수 있는 프로그램
http://www.slideshare.net/hoyoung2jung/crontab-39470064 

---
# 실습 
## 자동 배포 스크립트 짜기
1. git fetch
2. git merge origin/master
3. maven build
4. tomcat 중지
5. 이전 디렉토리 삭제
6. 빌드된 결과물 복사
7. tomcat 재시작 
### 힌트 
- `cd, rm -rf, cp` 명령을 적절히 잘 활용한다. 

---


# 도전 과제 1 
변경 사항이 없다면 아무 것도 하지 않고 스크립트를 종료한다.

# 도전 과제 2
1. cron 에 등록 5분마다 한번씩 실행 
2. master 에 변경이 발생하면 배포 스크립트를 실행 

## 도전과제 힌트 
```
$ git fetch 
$ git rev-parse master
$ git rev-parse origin/master
```
