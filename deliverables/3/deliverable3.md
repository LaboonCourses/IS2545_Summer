# IS2545 - Software Quality Assurance
Summer Semester 2016

DUE 29 Jun 2016

## Deliverable 3

For this assignment, you will write systems-level, automated black-box tests for a Ruby compilation visualizer using the BDD model discussed in class.  That is, you will write user stories (features) and scenarios, and then use JUnit and Selenium tests.  You should substantially the functionality for the project, and note in the "Testing Concerns" section what other aspects you would additionally add for full testing if this were a professional product.

Tests and code should be on GitHub or GitLab by the beginning of class on the due date.

There are NO partners for this deliverable.  Everybody is responsible for working on their own assignment.  As a reminder, copying code from others will result in a minimal penalty of getting a 0 on the assignment, and may be submitted to the dean as a violation of academic integrity.

The Ruby compilation visualizer, Hoodpopper, is located here: http://lit-bayou-7912.herokuapp.com/

If you are interested, this is a Rails application written by me for Ruby compilation analysis so that I could improve performance in a Ruby app.  The code is located here: https://github.com/laboon/hoodpopper The tests you write can be black-box tests; you should not need to look at this code unless you're interested.  If you'd prefer to do some grey-box testing, feel free to check out the code, but once again, it is not necessary.

## Format
Everyone should have a title page with:
* The name of the project under test
* Your name
* The title "IS2545 - DELIVERABLE 3: Web Testing with BDD"

For the summary, add a description of issues you faced when writing these tests and problems you would expect going forward based on your experiences.  If any tests you wrote fail, they should be included here.  Also note if there are any special steps to get the tests running.

At the end of this section, note where your test code is located.  

After this, there should be a printout or screen shot of the test execution results.

There is no need to print out the code.  It should be put on a publicly-available site such as GitHub BY THE BEGINNING OF CLASS.

There shall be 3 (three) user stories - no more, no less.  Each user story should have multiple (at least two) scenarios.  There shall be a total of at least 9 scenarios.  One way to do this would be three scenarios per user story, but you may find that it makes more sense to have, say, five scenarios for one story, and two scenarios each for the other story.

User stories should all follow the Connextra template.  Scenarios should all follow the Given/When/Then template (but note that some scenarios may not require all three elements).

The JUnit tests shall have the scenario that they are testing written in the comments above the particular test.  All tests shall correspond to a scenario and vice-versa.  They should be separated by user story and the user story should be specified above the section where scenarios for that user story are written.  See RedditTest.java in the sample_code directory for an example.

Remember that scenarios are USER-level tests; they should discuss things in a way that an intelligent user of the software would understand.  Remember the differences between scenario tests and unit tests!

## Ruby Basics

I do not expect you to learn yet another language for this course.  However, you will often be thrown into situations where you do not have deep domain knowledge but you will have to work on tests.  Here is a basic primer for the application.

Ruby is a dynamic, reflective, object-oriented language.  It is heavily used in web applications (via Rails and Sinatra frameworks).

Variable types are not specified.  Just assign a value to a variable and use it.

```ruby
a = 10
```

Ruby supports all of the basic arithmetic operations and follows normal precedence.

```ruby
a = 5
b = 6
c = a + (b * 4)
```

The equivalent of System.out.println("foo") is `puts "foo"`

```ruby
the_best_cat = "Noogie Cat"
puts "The best cat is: " + the_best_cat
```

This is all the Ruby you will need to know

Now, for some compiler theory.  If you have taken compilers, this is a very brief, hand-wavy and possibly less-than-accurate introduction (depending on the compiler).  Compiling a program consists of three stages: tokenization, parsing, and actually compiling to bytecode.  First, the tokenizer goes through and separates the code you have written into tokens, e.g., "public", space, "static", space, etc.  The parser puts this into an abstract syntax tree (AST) - just think of it as a regular tree with the structure of your program.  Finally, the compiler goes through the AST and writes the actual machine-level instructions to an executable.  This is how your Java code become JVM bytecode, or your C code becomes x86 instructions.  In this case, we will construct bytecode for the YARV (Ruby's virtual machine).

I do not expect you to understand the entire compilation process, or memorize all of the operations.  Understanding the following should be enough to write sufficient tests for this assignment.

_Tokenization_: Know that any spaces should show up at `:on_sp`.  Identifiers for functions such as `puts` should show up as `:on_ident`.  Variables such as `a` are also identifiers.  Newlines should show up as `:on_nl`.  Operators such as `+` and `*` are identified with `:on_op`.

_Parsing_: Any non-whitespace (e.g. `:op_nl` or `:on_sp`) tokens (such as `+`, `-`, or `puts`) which appear when being tokenized should also appear in the AST (parse tree).  Whitespace tokens should not appear in the AST.

_Compiling_: Any program that contains `puts` should also have the `putstring` YARV operation.  A program which contains `+` should call the opt_plus operation, plus put any of the values specified on the stack using the `putobject` operation.  Any program which contains `-` (subtraction) should contain the `opt_minus` operation, any program with `/`(division) should contain `opt_div`, any program with `*` should contain `opt_mult`.

## Note on Firefox / Selenium in Windows

To open the Selenium IDE from Firefox in Windows, right click the top bar of firefox, between the open tabs and the minimize button. Click "Menu Bar" so the menu bar shows up in the top left corner. Under "Tools" is "Selenium IDE".

Alternatively, "ctrl+alt+s" while in the Firefox window should also bring up the IDE.

## Grading
* Summary and Testing concerns - 10% 
* Screen shot or printout of test results - 10%
* User Stories and Scenarios, written in the proper format - 30%
* JUnit Tests - 50%

Reminder that all code (project under test AND test code) should be available to me.

Please feel free to email me or come to office hours to discuss any problems you have. 
 
