
package com.balaji.aakash;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 7/7/16.
 */
public class Second7 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("In my 8th standard Chemist lab, we were doing some experiments using the filter paper. The filtration process was quite slow and I was impatient. Thus, I used the stirrer to poke a hole in the filter cone. You know what happens when you poke hole in a filter? A teacher who recklessly gives out grades is as useful as a filter paper with a hole.\n" +
                "In grad school, I graded student papers for 2 years as a TA and it was often depressing to fail a student. While I often took the student's overall performance into account [such as class performance and projects] when they were on the border of failing grade, I didn't hesitate to give failing grades to students who really didn't take the course seriously. This way those students who were not cut out for algorithms & data structures had enough time to change to another major. By giving them passing grades, I would have given them a false sense of competence & destroyed their careers by making them stick to the wrong course majors.\n" +
                "\n" +
                "Broader issues\n" +
                "Case 1: When only a few teachers give high grades: When this happens other students are effectively screwed. Since all grades are relative, the students who had the misfortune to study under more stringent teachers will be unfairly punished. The students who study under a liberal teacher get an unfair advantage not out of their skills or hardwork, but pure luck.\n" +
                "\n" +
                "Case 2: What if everyone gives high grades. It increases the randomness in the system. If everyone gets an A, then the topper will essentially be chosen by the toss of a coin. In India, our school final exams are too generous with marks and a big chunk of students score 95% or more. In my class, 20 of us scored over 98% in the math& science subjects. However, only a small fraction of us could get to the top colleges. Thus, a student with 99.7% would get in while a student with 99.5% would not. However, the 0.2% difference between them is not statistically significant and is essentially a random factor [due to difference in examiner's subjectivity the same paper could get 95 or 100 marks]\n" +
                "\n" +
                "The role of a teacher\n" +
                "By giving equally high grades to both students who work hard and students who don't, you disincentivize hard work. You make them lazy and not understand the true value of labor. You make them feel entitled and make them expect the fruits even when they don't toil. You are also quite unfair on the truly hardworking students who no longer get recognition & rewards for being good. Of course, be human, be flexible and do understand their specific learning problems. But, don't take the shortcuts.\n" +
                "\n" +
                "Don't give in to short term gratifications. Teachers have to put up with short term hatred as their benefit will only be seen in the long term. At school, my math, history and english teachers relentlessly challenged us and pushed us to the edge. That made us work hard and most of my classmates did well. Dream to be that teacher who brings out the best in students. If you can't, please find another career.\n");
    }

}
