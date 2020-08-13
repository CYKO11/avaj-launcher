#!/bin/bash
git add .
git status
git commit -m "$1"
read -s -N 1 -t 1 key
if [[ $key != $'\x0a' ]];        # if input == ENTER key
then
exit 0
fi