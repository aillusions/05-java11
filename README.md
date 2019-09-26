
mvn --version | grep -i java 
    Java version: 1.8.0_181, vendor: Oracle Corporation, runtime: /Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre


echo $JAVA_HOME
    /Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home

export JAVA_HOME=/Users/alex/work/jdk-11.0.4.jdk/Contents/Home

mvn --version | grep -i java
    Java version: 11.0.4, vendor: Oracle Corporation, runtime: /Users/alex/work/jdk-11.0.4.jdk/Contents/Home
    
mvn clean package
    BUILD SUCCESS
    
    
java --list-modules