#!/bin/bash
git add .
git status
git commit -m "$1"
echo "Press enter to push or any key to cancel push"
read -n 1 -s key
if [[ $key == $'\x0a' ]];        # if input == ENTER key
then
echo "pushing ......"
git push
echo "done";
else
echo "aborting push......"
exit 0
fi