#!/bin/bash
git add .
git status
git commit -m "$1"
read -n 1 -s key
echo "done"
# if [[ $key != $'\x0a' ]];        # if input == ENTER key
# then
# exit 0
# fi