package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 30/7/16.
 */
public class Fifth11 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("It is not just India that has a taboo on beef. Cows are greatly respected in Nepal and Burma too.\n" +
                "People in the Vedic period were primarily pastoral. They relied on the cows for milk and dung. Cow dung is one of the main fuels in rural India and also served as a fertilizer. Cow dung and cow urine is also thought to be an disinfectant among ancient Indians and used to clean up home. Thus, cow provided the food, fuel, disinfectant and fertilizer for the Vedic people. \n" +
                "\n" +
                "Hindu scriptures have always considered milk as among the highest forms of food - Satvic. Cow's milk is believed to have a great calming effect and improves meditation.\n" +
                "A product of cow's milk - ghee (clarified butter) - is used for Yajna (fire worship). Fire worship is the highest form prayer for Hindus. This adds religious significance to cow's products.\n" +
                "Despite its big size, a cow is a calm animal and non-threatening - you could see cows quietly roaming Indian roads. Hindus have always appreciated the tolerance, patience and calmness of the cow. Thus, cows stood for the goodness of Hindu religion and considered a representative of Dharma. Also, a cow's affection to its calf is a beautiful thing and Vedas greatly appreciated this bonding.\n" +
                "Sustainability: Ancient Indians probably ate meat when they wandered in the grasslands. However, as soon as they settled and the population near Ganges exploded, they saw the issues cropping. The key was water pollution from the slaughterhouses. Both the leather industry and slaughter industry hugely polluting industries and thus taboos quickly came.\n" +
                "In some ways, cows for Indians are like the pets in the Western Culture. You don't see dog meat, cat meat or even horse meat in the US as these are the animals people have in their homes and form a special bonding with. For some Westerners, killing a dog for meat can be as gruesome as killing a human for meat. In the same way, many of us Indians formed a special bonding with our cows.\n" +
                "\n" +
                "Environmental Sustainability\n" +
                "These days we are understanding the impacts of beef better. Here are some of the recent research on the impact on beef on the environment:\n" +
                "Consequences of increased global meat consumption on the global environment -- trade in virtual water, energy & nutrients\n" +
                "Food Giants Want 'Sustainable' Beef. But What Does That Mean? \n" +
                "Sustainability of meat-based and plant-based diets and the environment\n" +
                "\n" +
                "Researchers are coming to the same conclusion as the early Hindus did - lacto-vegetarian diet is the most sustainable option for a denser world population.\n" +
                "\n" +
                "\n" +
                "Summary: Religious Hindu households always had a cow in their backyard until a couple of decades ago. They provided the family's daily:\n" +
                "Food (milk, buttermilk, curd, butter and ghee)\n" +
                "Products for worship (ghee)\n" +
                "Fuel for the kitchen (cow dung)\n" +
                "Antiseptic cleaning agent (cow dung and cow urine)\n" +
                "Clearing up extra growth in the farm before sowing.\n" +
                "\n" +
                "Hindus are very practical people. We worship those that are incredibly useful.\n");
    }
}
