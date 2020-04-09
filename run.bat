SET JAVA_HOME=%JAVA_11_HOME%
REM set GRADLE_OPTS=-Xmx50m
REM ./gradlew bootRun
call ./gradlew clean build 
call  "%JAVA_11_HOME%/bin/java" -XX:+UnlockExperimentalVMOptions -Xmx50m -jar build/libs/car.jar