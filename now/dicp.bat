echo off
echo ��ʼ����weblogic 7001�˿ڷ���
set wl_log_path=C:\Oracle\Middleware\user_projects\domains\dsp_jheq1\dsp_log\%date:~0,4%%date:~5,2%%date:~8,2%X%time:~1,1%%time:~3,2%%time:~6,2%%time:~9,2%
C:\Oracle\Middleware\user_projects\domains\dsp_jheq1\startWebLogic.cmd 1>%wl_log_path%.log 2>%wl_log_path%.err
echo �������
pause