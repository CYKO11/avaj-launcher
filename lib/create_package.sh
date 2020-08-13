#!/bin/bash
if [ $1 ]
then
tput setaf 2
mkdir src/com/avajlauncher/$1
touch src/com/avajlauncher/$1/$1.java
echo 'package com.avajlauncher.'$1';

public class '$1' {
	public static void main(String[] args) {
		System.out.println("ex-u-plosion");
	}
}' > src/com/avajlauncher/$1/$1.java
echo "Packge Created"
else
tput setaf 1
echo "No Package Name"
exit 0
fi