# ![70%](images/img_blue.png) 
# Bash 1 - PATH 환경변수 알아보기
<p align='center'>
CodeSquad Master <br>
Hoyoung Jung
</p>

---
<!-- page_number: true -->
# shell

대화형 프로그램. 운영체제와 대화(?)하는데 사용됨 

# bash

리눅스에서 가장 많이 사용되는 셸의 한 종류

# zsh

요즘 꽤 인기있는 셸. 편리하다. 
> 검색 키워드: zsh 사용법, oh-my-zsh, zsh auto suggestion 

---

# 환경변수

셸에서 필요한 정보를 저장하는 변수들

주로 변수명에 대문자 사용 

`env` 명령으로 확인 가능
```
$ env
XDG_SESSION_ID=1
SHELL=/bin/bash
TERM=xterm-256color
SSH_CLIENT=192.168.56.1 50094 22
SSH_TTY=/dev/pts/0
USER=honux
# ...
```

---
# 환경변수의 개별 확인

> echo $환경변수명 

```
$ echo $USER
honux
$ echo $HOME
/home/honux
$ cd $HOME/somedir
$ echo $CWD
/home/honux/somedir
```

---
# 셸 명령어와 셸 프로그램 

셸에서 실행하는 명령어는 사실은 프로그램과 진짜(?) 명령어 두 종류가 있다.

## 프로그램 

C언어 등으로 작성하고 빌드한 결과물. 
* 특정 디렉토리에 저장됨 
* 실행시 프로세스가 생긴다. 
* 윈도우에서는 exe 확장자를 가지는데 unix에서는 그런거 없다.

## 프로세스 

**실행 중인 프로그램을 프로세스라고 함** :imp: 

---
# 프로그램은 어디에 저장되나요?

`which` 나 `whereis` 명령어로 확인 가능 

```
$ which ls
/bin/ls
$ which bash
/bin/bash
$ which python
/usr/bin/python
```

---
# 스크립트를 짜고 실행해 봅시다. 
```
$ cd
$ mkdir -p temp/somedir
$ cat << EOF >> temp/somedir/test.sh
> #!/bin/bash
> echo "I am some bash script"
> EOF
$ cat temp/somedir/test.sh
#!/bin/bash
echo "I am some bash script"
$ chmod +x temp/somedir/test.sh
$ ./temp/somedir/test.sh
I am some bash script
$ test.sh
test.sh: 명령을 찾을 수 없습니다
```
---
# 프로그램을 실행하려면 
- 전체 경로를 입력해야 합니다.
- 그런데 경로를 입력하지 않아도 되는 명령들이 있잖아요? 

> ls, ssh, cp 같은 기본 명령
> java, python, node, vi 같은 사용자가 설치한 프로그램들 

---
# PATH 환경변수 

 PATH 환경변수에 지정된 디렉토리들은 프로그램 실행시에 따로 입력할 필요가 없습니다. 
 
 bash가 해당 디렉토리들을 먼저 찾아봅니다.
 
```
$ echo $PATH
/home/honux/bin:/home/honux/.local/bin:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games:/usr/local/games
```

---
# PATH 환경변수에 디렉토리 추가하기

아래 명령처럼 지정한 디렉토리를 PATH에 추가할 수 있습니다.
대소문자에 주의하세요! 
실수해서 무언가 이상해지면 재접속하면 됩니다. 
```
$ export PATH=추가디렉토리경로:$PATH
```

```
$ test.sh
test.sh: 명령을 찾을 수 없습니다
$ export PATH=$HOME/temp/somedir:$PATH
$ test.sh
I am some bash script
```

---
# PATH 경로 영구적으로 지정하기
`export ...`의 내용을 $HOME/.bashrc에 추가합니다. 

> cp ~/.bashrc ~/.bashrc.old
> echo 'export PATH=$HOME/temp/somedir:$PATH' >> ~/.bashrc 
> cat ~/.bashrc

