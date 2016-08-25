package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 30/7/16.
 */
public class Second10 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Inflation: India's rate of inflation is about 9% over the past few years. Assuming you went to your kindergarten in 1990 and it cost Rs.3000/year back then, the same quality of education would cost Rs.23000/year. Never ignore the power of inflation.\n" +
                "Realestate & building costs: Realestate costs have skyrocketed in the past 20 years and schools require a good chunk of land. The land prices have outstripped inflation substationally. Even if you don't calculate the opportunity costs of your existing land, you will have to account for higher costs of expansions & rent. \n" +
                "Teacher salaries: In a good school, the recommended teacher to student ratio is 1:15. Let us suppose you collect Rs.25000/year for each student. That is a fees of Rs.375,000 per class/year. Now, you need to include the potential \"rent\" for that classroom (that could half the size of an apartment). Even if you ignore that, you need to include all the utilities (electricity bills, internet, water), administration overheads (from principal to desk clerk), capital purchases (computers, library books, chemicals), non-teaching staff (lab, library, playground). If you take away all that, what does it leave to pay the teacher? If you reduce the fees to Rs.10000/year, you wouldn't be able to run a school. In the past, teachers were paid like shit, but now the private schools are paying a little better.\n" +
                "\n" +
                "Finally, the facilities\n" +
                "When we studied, the schools had substantially lesser facilities. The library and computer lab had scant resources. We used outdated 486s donated by software companies. As schools are pushing into iPads and interactive learning, the schools needed to buy a lot of new stuff. They also buy a good chunk of educational software for interactive learning. Teacher salaries have increased and the classrooms also are better equipped. \n" +
                "\n" +
                "This is just the beginning. In the next few years, fees & wages will converge across the world. The wages for manual labor in the West would stagnate while those in the East will skyrocket until they meet. If you are in a set mindset that Rs. 7000 is good, Rs. 30000 is high etc, you will have a lot to relearn.\n");
    }




}
