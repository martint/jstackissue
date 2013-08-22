This program demonstrates an issue in the JVM where jstack, jcmd, etc cannot connect to it.

First, build and run the program with:

    mvn compile exec:java
   
Then run 'jstack <pid>'. It should hang for a while and then print something like:

    17004: Unable to open socket file: target process not responding or HotSpot VM not loaded
    The -F option can be used when the target process is not responding

