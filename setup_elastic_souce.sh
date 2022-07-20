#!/bin/bach

# Font Colors
NC=$(tput sgr 0)
RED=$(tput setaf 1)
GREEN=$(tput setaf 2)
DIR_FILE_PATH_SCRIPT=`pwd`

#start script and set project path
function select_file_path {
  echo "${GREEN}" 
  if [ -e  file_path.txt ]; then 
    echo "The path of your project:"
    cat "file_path.txt"
    return 0
  else
    echo "Please enter a new path!"
    echo "Example: 
      /file/folder/
    $NC"
    read -p "Pass the new file path: " FILE_PATH
    
    echo "The path of your project:"
    echo "$FILE_PATH"
    echo "$FILE_PATH" > file_path.txt
  fi
}

while :; do
  echo "${NC}
  #############################
                            
      Select an options:     " 
  read -p "
    1) -  Start elastic_search;    
    2) -  Start Kibana:         
    3) -  Gerar novo token:   
    4) -  :
    0) -  Exit:                 
                            
  #############################
    : " OPTIONS


      case "$OPTIONS" in

        1)
          clear
          echo "Start elasticsearch"
          elasticsearch
          ;;
        2)
          clear
          Kibana
          ;;

        3)
          clear
          bin\elasticsearch-create-enrollment-token.bat" --scope kibana
          ;;
        
        4)
          clear
          ;;
        0)
          clear
          echo "Exit program"
          break
          ;;
        *)
          clear
          echo "${RED}Invalid option"
          ;;
      esac
done
