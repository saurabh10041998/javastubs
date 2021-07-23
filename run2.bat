javac -nowarn -cp ..\lib\*;. -d ..\classes demo\TestClassForFunction.java
java -cp ..\lib\*;..\classes;. demo.TestClassForFunction cmdline_args
