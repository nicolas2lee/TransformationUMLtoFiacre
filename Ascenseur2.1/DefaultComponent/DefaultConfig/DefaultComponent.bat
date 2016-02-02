echo off

set RHAP_JARS_DIR=C:/ProgramData/IBM/Rational/Rhapsody/8.1.1/Share\LangJava\lib
set FRAMEWORK_NONE_JARS=C:/ProgramData/IBM/Rational/Rhapsody/8.1.1/Share\LangJava\lib\oxf.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.1.1/Share\LangJava\lib\anim.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.1.1/Share\LangJava\lib\animcom.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.1.1/Share\LangJava\lib\oxfInstMock.jar;
set FRAMEWORK_ANIM_JARS=C:/ProgramData/IBM/Rational/Rhapsody/8.1.1/Share\LangJava\lib\oxf.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.1.1/Share\LangJava\lib\anim.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.1.1/Share\LangJava\lib\animcom.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.1.1/Share\LangJava\lib\oxfInst.jar;
set SOURCEPATH=%SOURCEPATH%
set CLASSPATH=%CLASSPATH%;.
set PATH=%RHAP_JARS_DIR%;%PATH%;
set INSTRUMENTATION=Animation   

set BUILDSET=Debug

if %INSTRUMENTATION%==Animation goto anim

:noanim
set CLASSPATH=%CLASSPATH%;%FRAMEWORK_NONE_JARS%
goto setEnv_end

:anim
set CLASSPATH=%CLASSPATH%;%FRAMEWORK_ANIM_JARS%

:setEnv_end

if "%1" == "" goto compile
if "%1" == "build" goto compile
if "%1" == "clean" goto clean
if "%1" == "rebuild" goto clean
if "%1" == "run" goto run

:clean
echo cleaning class files
if exist Ascenseur\stop.class del Ascenseur\stop.class
if exist Ascenseur\TimeoutOrArrive.class del Ascenseur\TimeoutOrArrive.class
if exist Ascenseur\receive.class del Ascenseur\receive.class
if exist Ascenseur\cabinArrived.class del Ascenseur\cabinArrived.class
if exist Ascenseur\Door.class del Ascenseur\Door.class
if exist Ascenseur\braked.class del Ascenseur\braked.class
if exist Ascenseur\Ascenseur_pkgClass.class del Ascenseur\Ascenseur_pkgClass.class
if exist Ascenseur\Cabin.class del Ascenseur\Cabin.class
if exist Ascenseur\sendMessage.class del Ascenseur\sendMessage.class
if exist Ascenseur\GoSleep.class del Ascenseur\GoSleep.class
if exist Ascenseur\stopFromController.class del Ascenseur\stopFromController.class
if exist Ascenseur\CloseDoor.class del Ascenseur\CloseDoor.class
if exist Ascenseur\goDown.class del Ascenseur\goDown.class
if exist Ascenseur\sendFloorAndUpOrDown.class del Ascenseur\sendFloorAndUpOrDown.class
if exist Ascenseur\Press.class del Ascenseur\Press.class
if exist Ascenseur\receiveCabinMoved.class del Ascenseur\receiveCabinMoved.class
if exist Ascenseur\ControllerSys.class del Ascenseur\ControllerSys.class
if exist Ascenseur\receiveFromButton_Ex.class del Ascenseur\receiveFromButton_Ex.class
if exist Ascenseur\moveCabin.class del Ascenseur\moveCabin.class
if exist Ascenseur\Pressed.class del Ascenseur\Pressed.class
if exist Ascenseur\moveCabinUp.class del Ascenseur\moveCabinUp.class
if exist Ascenseur\Winch.class del Ascenseur\Winch.class
if exist Ascenseur\readyToOpenDoor.class del Ascenseur\readyToOpenDoor.class
if exist Ascenseur\OpenDoor.class del Ascenseur\OpenDoor.class
if exist Ascenseur\readyToGo.class del Ascenseur\readyToGo.class
if exist Ascenseur\detected.class del Ascenseur\detected.class
if exist Ascenseur\sendFloorAndCloseDoor.class del Ascenseur\sendFloorAndCloseDoor.class
if exist Ascenseur\sending.class del Ascenseur\sending.class
if exist Ascenseur\Sensor.class del Ascenseur\Sensor.class
if exist Ascenseur\moveCabinDown.class del Ascenseur\moveCabinDown.class
if exist Ascenseur\cabinGone.class del Ascenseur\cabinGone.class
if exist Ascenseur\Button_ex.class del Ascenseur\Button_ex.class
if exist MainDefaultComponent.class del MainDefaultComponent.class
if exist Ascenseur\goUp.class del Ascenseur\goUp.class
if exist Ascenseur\receiveFloorAndCloseDoor.class del Ascenseur\receiveFloorAndCloseDoor.class

if "%1" == "clean" goto end

:compile   
if %BUILDSET%==Debug goto compile_debug
echo compiling JAVA source files
javac  @files.lst
goto end

:compile_debug
echo compiling JAVA source files
javac -g  @files.lst
goto end

:run

java %2

:end


