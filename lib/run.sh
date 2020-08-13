#!/bin/bash
./lib/compile.sh
java -cp src com.avajlauncher.testpkg.$1 $2