#!/bin/sh
#
echo 开始启动 tomcat7 8080 端口服务

export tomcat7_log_path="/usr/local/tomcat7/logs/startLog/$(date '+%Y%m%d-%H%M%S')"

echo 输入 ctrl + c 退出

/usr/local/tomcat7/bin/startup.sh  1>$tomcat7_log_path.log  2>$tomcat7_log_path.err.log

echo 启动 tomcat7 完毕
sleep
