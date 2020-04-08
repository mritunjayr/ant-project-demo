##Steps for create jar file using command

creating a startable jar-file needs more steps: 
create a manifest-file containing the start class, 
creating the target directory and 
archiving the files.

`echo "Main-Class: oata.HelloWorld" >myManifest`
`mkdir build/jar`
`jar cfm build/jar/HelloWorld.jar myManifest -C build/classes .`
`java -jar build/jar/HelloWorld.jar`