#

## How to use

1. Clone https://github.com/kohsuke/file-leak-detector
2. Clone this project to folder next to file-leak-detectpr
3. Compile the file ExampleOpenFileDescriptor.java
4. Execture 'run.sh'

you should see the following output

tzach@tzach-P53E:~/work/file-leak-example$ ./run.sh 
File leak detector installed
Serving file leak stats on http://localhost:19999/ for stats


5. Surf to localhost:19999, you should see the stacktrace of the open descriptor
