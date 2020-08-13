#!/bin/bash
git add .
git commit -m "$1"
git status
read -s -N 1 -t 1 key
if [[ $key == $'\x0a' ]];        # if input == ENTER key
then
git push
else
exit 0
fi