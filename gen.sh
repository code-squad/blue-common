#!/bin/zsh

FILE=1-1.md

if [ $# -eq 1 ]; then 
	DIRNAME=$1
else
	num=($(ls | grep week | sort -r | head -1 | grep -o '[0-9]'))
	if [[ $num == "" ]]; then; num=0; fi
	DIRNAME=week$(expr $num + 1)
fi

cp -a template $DIRNAME
mv $DIRNAME/sample.md $DIRNAME/$FILE

echo "Done"
