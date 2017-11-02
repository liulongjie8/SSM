@echo off

cd /d %~dp0
del .\src\main\webapp\WEB-INF\lib /F /Q

call mvn war:inplace -U
call mvn compile
pause