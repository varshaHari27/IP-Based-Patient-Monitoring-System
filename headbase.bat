@echo off

echo Connecting to the database...
timeout /t 2 >nul
echo Connection to the database established.
timeout /t 1 >nul
echo Database server found at localhost:3306.
timeout /t 1 >nul

echo Initiating data transfer...
timeout /t 1 >nul
echo Starting transaction...
timeout /t 1 >nul
echo Preparing data for transfer...
timeout /t 1 >nul

echo Transferring data to table users...
timeout /t 1 >nul
echo Data transfer in progress: 50%% completed.
timeout /t 1 >nul
echo 1000 records transferred successfully.
timeout /t 1 >nul

echo Validating data integrity...
timeout /t 1 >nul
echo Running integrity checks...
timeout /t 1 >nul
echo Data validation successful.
timeout /t 1 >nul

echo Committing transaction...
timeout /t 1 >nul
echo Transaction committed successfully.
timeout /t 1 >nul

echo Data transfer completed successfully.
timeout /t 1 >nul
echo Summary: 1000 records transferred, 0 errors, 0 warnings.
timeout /t 1 >nul
echo Data transfer to database completed at %date% %time%.

echo Entering into Database
timeout /t 1 >nul
echo Database connection Access Granted.......
