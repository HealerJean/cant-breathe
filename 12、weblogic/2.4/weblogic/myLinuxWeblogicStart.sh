#!/bin/bash

echo 开始启动weblogic 7001端口服务

export wl_log_path="/usr/local/weblogic/user_projects/domains/healer_domain/log/$(date '+%Y%m%d-%H%M%S')"

echo 输入 ctrl + c 退出

/usr/local/weblogic/user_projects/domains/healer_domain/startWebLogic.sh  1>$wl_log_path.log  2>$wl_log_path.err 

echo 启动完毕
sleep 

