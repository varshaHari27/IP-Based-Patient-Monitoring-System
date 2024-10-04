@echo off
setlocal
for /f "tokens=2 delims=:" %%A in ('ipconfig ^| findstr /i "IPv4"') do set IP=%%A
for /f %%A in ('hostname') do set HOSTNAME=%%A
echo Connection established
echo Hostname: %HOSTNAME%
echo IP Address: %IP%
endlocal
