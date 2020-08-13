#!/bin/bash
git add .
git commit -m "$1"
git status
if [[ $key == $'\x0a' ]];        # if input == ENTER key
then
git push
else
exit 0
fi