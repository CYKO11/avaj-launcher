#!/bin/bash
git add .
git status
git commit -m "$1"
wait
git push