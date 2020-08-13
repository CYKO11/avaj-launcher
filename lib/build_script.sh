#!/bin/bash
if [ $1 ]
then
tput setaf 2
touch $1.sh
chmod 0755 $1.sh
echo "#!/bin/bash" > $1.sh
echo "Script Created"
else
tput setaf 1
echo "Error No Script Name"
exit 0
fi