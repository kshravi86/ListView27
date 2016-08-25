package com.handmark.pulltorefresh.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.venki18.aakash.appfromapp108.R;

/**
 * Created by pulltorefresh on 7/7/16.
 */
public class Third6 extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Coding since 1995.\n" +
                "\n" +
                "    A computer program is a sequence of instructions to the machine to perform one or more tasks. The task could be as simple as printing your name in the screen and could be as complex as rendering a 3-dimensional model in a airline simulator.\n" +
                "    A programming activity typically works like this. First the client gives a bunch of requirements, then the team works out things internally and comes back with a functional specification document, called the spec. Once the client approves this, the software architects start developing the design blueprint that is analogous to an construction architect's blueprint. Then the developers start working on implementing the blueprint, followed by integrating their individual modules. Finally the software is maintained and eventually retired. Each step in this flow is thoroughly tested. (Note: not all programming teams carry out all these steps in the modern times).\n" +
                "    Although majority of the development in computing happened during the second world war, the field of computing was much older than that. The first computer is the Charles Babbage machine -and the English man is generally termed as the father of computing.\n" +
                "\n" +
                "    Programs are related to computer software in the same way nuts/bolts are related to a machine. In short, computer software is a collection of programs that are stored locally in your computer. Software can be subdivided into system software (one that works under the wraps) such as your Operating System, and application software (shortened as app) that interacts directly with the user.\n" +
                "    Although programming is currently overpopulated by males, the first programmer was in fact a woman coding for the Babbage machine. Lady Ada Lovelace created the first program in 1843 to calculate Bernoulli numbers. Celebrating Ada Lovelace: the 'world's first programmer'\n" +
                "\n" +
                "    Before a programmer sits to write the \"code\" (synonym of program), he/she writes down a series of logical steps written down in simple English and Math (and not in a programming language). This is known as an algorithm.\n" +
                "    To visually see an algorithm in working, some create a mental map called a flowchart. This is just map of how control passes through different parts of the program.\n" +
                "\n" +
                "\n" +
                "    Most computer programs have two forms - the source code written in a form that a human could understand and the executable written in a form that only a computer (and some extremely weird persons) can understand. At Microsoft Windows, our source code could well range in the order of 100 million+ lines of code.\n" +
                "    A compiler is  a program that converts the (usually) human written source code into a  computer readable form. Depending on how big the source code is, the  process could take minutes, hours or even days. A programmer's typical day consists of a lot of coding along while constantly compiling your programs, along with the rest of the code.\n" +
                "    In the dark ages, humans used to write down code that can directly be understood by the computer (called machine language). However, soon it was found to be unproductive. The first languages that were written in English were Fortran, Cobol and Lisp all developed in mid 1950s. But the biggest revolution in programming came with the 1972 relase of C - one of the all time favorite languages.\n" +
                "    As a tradition, programmers start with printing hello world main() {        printf(\"hello, world\"); } whenever they  are learning a new language or even starting a new project. This is a  convention that was first set in 1974 by Brian Kernighan of Bell Labs.\n" +
                "    Just as humans have developed a multitude of languages to communicate with one another, computer scientists have created 100s of programming languages that can do the task of communicating between the programmer and the computer. Each language has its own set of strengths and weaknesses. Some are complex and powerful, while others are small & simple. For instance, many industry applications use Java/Python, while PHP is used by many older web applications, Ruby is used by smaller startups and C/C++ is used for environments requiring a very high level of running efficiency.\n" +
                "\n" +
                "    Programming languages are primarily classified into two main paradigms - imperative and declarative. Imperative languages are written as a sequence of steps that the machine has to perform. Most major languages including C/C++, Java fall in this category. Declarative languages are those that does not specify how to control the machine, but specify primarily what to accomplish, leaving the language to figure out the \"how\" part. These tend to be very high languages such as Erlang, Haskell, Scala and Lisp, and are getting more used in advanced industrial applications.\n" +
                "    For  real programmers, programming is one of the most joyful things as you  are in a perfect world where you can change almost anything. Within your  code you can be the masters of the universe.Although this is not entirely true in industry-grade applications, it is still a joyous experience.\n" +
                "    Real programmers love xkcd: - here is what a programming student does, if given the assignment to write something 500 times.");
    }

}
