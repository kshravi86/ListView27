package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by listviewanimations on 7/7/16.
 */
public class Second3 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Ramanujan got only 57% in mathematics in his first examination of the Arts (FA exam). He is still a genius in mathematics. How is this possible?\n" +
                "and here is the source @http://www.thehindu.haarman/opinion/...\n" +
                "\n" +
                "Also Gandhiji failed in history exam during his tenth Grade but he is in all History text books, Dhirubhai Ambhani failed in maths at his tenth grade but he is a business king in India. How can calculate one's mental capability if not by grade?  Why in Today's world every school admission is based on Grades?, if it like now even Ramanujam wouldn't have got through any top University, as university will just throw away his application without seeing his profile. Why today's grading system totally not supporting set of people and supports only the persons who fit inside the box and not to the person who thinks totally outside the box.\n" +
                "Balaji Viswanathan, VP of Products at Invento - changing engineering education in India.\n" +
                "137k Views ·\n" +
                "Balaji has 30+ answers and 18 endorsements in\n" +
                "Education\n" +
                "If Ramanujan failed a Math test, it means the test failed itself. It speaks more about the failure of the system than about the capabilities of the person.\n" +
                "\n" +
                "System Design\n" +
                "I have always scored in the top 2/3 ranks in the class and usually 100/100 in math. Precisely because I was no math genius. If the test is designed for identifying who is the best average person, then the best will be the average. Our education system is primarily designed for addressing the problems of the middle of the bell curve. Because, this group represents the biggest chunk of the population and the outcomes are always measured in the averages [the average pass rate is 90% or the average proficiency of a student was x].\n" +
                "\n" +
                "Since the system is neither designed for the game changers nor for the people with genuine learning disabilities, they will both be given worst of the hardships. The worst part is that the system cannot identify the difference between the game changers and the people needing more help learning. It confuses the two and makes things worse for the game changers.\n" +
                "\n" +
                "Identifying a Genius\n" +
                "It is not easy for non-geniuses to identify a genius. Professor Hardy was a genius and he thus was able to identify Ramanujan's genius. Ramanujan was lucky here. 1000s of Ramanujans might languish with morons who have no sense of what a genius looks like. Our system is unfortunately populated by poor quality teachers recruited from the bottom of the barrel. They are often intolerant and incapable of having the patience to see the ingenuity.\n" +
                "\n" +
                "Although I despise reality television, I can still see some value in shows like \"America has got talent\" and all its regional variations. We are often stunned by the talent in the unknown, ordinary people. Think of how many such researchers or inventors are hiding behind the veil of mediocrity.\n" +
                "\n" +
                "\n" +
                "Education and Exams are about the box\n" +
                "Schools and colleges have a purpose. Historically, they educated students for the workforce.  The system has little capability of going far beyond that. Thus, if a student doesn't perform in those exams, it might just mean that he doesn't fit inside the box. Thomas Edison didn't. Steve Jobs didn't. Henry Ford didn't. and Ramanujan didn't. Of course, if you are testing these smart minds on how well they will fit in a box and the potential to work in some office, of course they will fail. Because, they are not born to work in an office.\n" +
                "\n" +
                "Some tips for government to get better:\n" +
                "Consciously look for geniuses. When you are really looking to identify these genius inventors, you might have better chance.\n" +
                "Once you identify, put them on a separate track. Don't get them lost in the din of mediocrity. Let them be challenged by their genius peers instead of feeling smug or lost when they are the only genius around.\n" +
                "Carefully groom them out of public attention. Don't put a premature spotlight. That might completely ruin them. Protect them from public glare until they are ready.\n" +
                "Really have the patience to groom geniuses. It is the geniuses who cause paradigmatic shift.\n");
    }

}
