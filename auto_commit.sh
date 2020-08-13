#!/bin/bash
git add .
git status
git commit -m "$1"
echo "."
echo "."
echo "Press [ P ] to push or any other key to cancel push"
read -n 1 -s key
if [[ $key == $'p' || $key == $'P']];        # if input == ENTER key
then
echo "pushing ......"
git push
echo "done";
else
echo "aborting push......"
exit 0
fi