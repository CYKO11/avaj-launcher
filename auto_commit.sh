#!/bin/bash
git add .
git status
wait
git commit -m "$1"
git push