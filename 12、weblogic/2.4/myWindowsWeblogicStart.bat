echo off
echo 开始启动weblogic 7001端口服务

set wl_log_path=D:\ProgramFiles\Study\weblogic\user_projects\domains\base_domain\log\%date:~0,4%%date:~5,2%%date:~8,2%_%time:~0,2%%time:~3,2%%time:~6,2%
D:\ProgramFiles\Study\weblogic\user_projects\domains\base_domain\startWebLogic.cmd  1>%wl_log_path%.log 2>%wl_log_path%.err & tail -f %wl_log_path%.log
echo 启动完毕
pause