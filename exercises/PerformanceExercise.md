### Exercise 3 - Performance Testing

For this exercise, your goal is to increase the performance of a program, SlowCode.  In so doing, you should NOT modify the behavior of the program in any way other than to increase its speed.  That is, the output for any given value should be exactly the same.

You can download VisualVM from https://visualvm.java.net/

Note that all behavior must be EXACTLY the same, even what you may think are defects.

SlowCode accepts one integer argument, and will give you some analysis of the integer.

Specifically, it will provide the following statistics:

1. Chirpy number
2. Nirpy number
3. Schnirpiness level
4. Threat level
5. DEFCON

Fork the repository https://github.com/laboon/SlowCode.  Clone it to your local machine and use VisualVm and time (or Measure-Command if you are on Windows) and optimize for the minimal amount of time to run.

This is the only performance indicator that you will be concerned about.  Increased CPU, memory, code size, or disk drive usage are all acceptable.

Tips:

1. Use the profiler to figure out where the big slowdowns are.  Focus on the biggest problems before working on smaller ones.
2. Try copying and pasting the results of the original runs to ensure that your code modifications aren't causing any issues.
3. Use git!  Remember to commit often as you make changes so you have "save points" you can jump back to.
4. You may want to copy the original code to a different directory, so that you can hop back and forth to ensure that you get the same results.
5. Be sure to use `time` or a similar tool to ensure that you are in fact reducing the amount of time it takes to run the program.
6. Keep the 10,000-ms sleep in SlowCode.java until you have the final version.  This will enable you to have enough time to connect VisualVM to the Java process.