## Steps to create jar file using command

creating a startable jar-file needs more steps:

1. create a manifest-file containing the start class, 
2. creating the target directory and 
3. archiving the files.


        echo "Main-Class: oata.HelloWorld" >myManifest
        mkdir build/jar
        jar cfm build/jar/HelloWorld.jar myManifest -C build/classes .
        java -jar build/jar/HelloWorld.jar
