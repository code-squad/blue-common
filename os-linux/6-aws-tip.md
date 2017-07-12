<!-- page_number: true -->

![](images/img_blue.png)
# AWS 제어하기 

CodeSquad Master 
Hoyoung Jung 

---
# AWS CLI 설치
맥에서 
```
pip install awscli
```
윈도우는 홈페이지 다운로드 및 설치
https://aws.amazon.com/ko/cli/

---
# 키 생성하기 
IAM 서비스 - 사용자 - access key 및 secret key 생성 


---
# access key 및 secret key 등록

```
aws configure
AWS Access Key ID [****************2TMA]:
AWS Secret Access Key [****************gt+P]:
Default region name [ap-northeast-2]:
Default output format [json]:
```


---
# 확인 
```
cat ~/.aws/credentials
cat ~/.aws/config
```

---
# 사용해 보기 

```
aws ec2 describe-instances
aws s3 ls 
```

---
# aws ec2 조회 스크립트 
```
ec2 describe-instances \
--filters "Name=tag:Name,Values=honux*"

ec2 describe-instance --instance-ids i-1234abcd
ec2 start-instances --instance-ids i-1234abcd
ec2 stop-instances --instance-ids i-1234abcd
```

---
# ec2 start / stop script
https://gist.github.com/honux77/2ba863f74b2277df74e35942e723aa81


---
# 팁:슬랙 연동해 보기 
http://seotory.tistory.com/24 를 참고해서 먼저 incoming webhook 설정을 한다. 

설정을 마치면 생성한 webhook-url을 잘 관리한다. (비공개 파일로) 

---
# 스크립트 
```
#!/bin/bash

url=webhook url here

if [ $# -ge 1 ]; then
	msg=$@
else
	msg="hello world"
fi

payload='{"text": "'$msg'"}'
echo Try send $payload to Slack channel

curl -X POST -H 'Content-type: application/json' \
--data "$payload" $url

```

---
# ec2 시작시 알려주기 

## /home/ubuntu/slack.sh
<pre style="font-size:.5em">
#!/bin/bash
ip=`/usr/bin/curl -s -w '\n' http://169.254.169.254/latest/meta-data/public-ipv4`
instance=`/usr/bin/curl -s -w '\n' http://169.254.169.254/latest/meta-data/instance-id`
url=WEBHOOK_URL_HERE
name="YOURNAME HERE"

payload="{\"text\": \"`date`: $name $instance $ip started\"}"

/usr/bin/curl -X POST -H 'Content-type: application/json' \
--data "$payload" $url
</pre>

---
## /etc/systemd/system/slack.service
> sudo vi /etc/systemd/system/slack.service
```
[Unit]
Description=Slack IP Notification
Wants=network-online.target
After=network-online.target

[Service]
Type=oneshot
WorkingDirectory=/home/ubuntu/script
ExecStart=/home/ubuntu/script/slack.sh

[Install]
WantedBy=multi-user.target
```
> sudo systemctl enable slack.service
> sudo systemctl status slack