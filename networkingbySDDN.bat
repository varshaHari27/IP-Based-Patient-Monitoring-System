@echo off
title Network Connection Script

REM Display a connection message
echo Connection made through the network!
timeout /t 2 /nobreak >nul

REM Display some network-related information
ipconfig
timeout /t 2 /nobreak >nul

REM Animate a loading bar from 0% to 100%
setlocal enabledelayedexpansion
set "progress_bar="
for /L %%i in (0,5,100) do (
    set "progress_bar=["
    for /L %%j in (1,1,%%i) do set "progress_bar=!progress_bar!#"
    set "progress_bar=!progress_bar!] %%i%%%"
    <nul set /p =!progress_bar!
    timeout /t 1 /nobreak >nul
    cls
)
echo.
echo Loading complete!
pause
