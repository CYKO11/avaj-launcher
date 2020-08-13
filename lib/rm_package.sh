#!/bin/bash
if [ $1 ];
then
    tput setaf 1
    echo "Are you sure you want to remove package $1"
    echo "Press [ Y ] to remove"
    read -n 1 -s key
    if [ $key == 'Y' ] || [ $key == 'y' ];
    then
        tput setaf 2
        rm -rf src/com/avajlauncher/$1
        echo "Packge removed"
    else
        tput setaf 2
        echo "Package not removed"
    fi
else
    tput setaf 1
    echo "No Package Name"
    exit 0
fi
