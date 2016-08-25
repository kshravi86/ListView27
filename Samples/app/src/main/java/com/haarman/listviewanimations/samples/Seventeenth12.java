package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by Sharathchandra B M on 7/30/2016.
 */
public class Seventeenth12 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Starting a religion is not as hard, if you can convince a lot of people. You must be able to write and convince as good as Tim Ferriss. Also understand that a lot of people in the world have a lot of \"free space\" in their minds to accept \"new\" ideas.  I surveyed the 100 religions started in the past century and found a lot of great stuff.\n" +
                "\n" +
                "Ten Commandments to create a new religion.\n" +
                "First, create an outrageous concept that appeals to people's innate fears. Death is good. Aliens are even better. Think of modern religions such as Raëlism and Scientology that started as alien books that appealed to people's fear/curiosity of aliens. The book should be extremely convincing. However, it can also be as hamless as Jediism. \n" +
                "Second, find various fallacies (you need to base your new religion on these, so make it sound good). You should try to make sure that your followers understand that plural of anecdote is fact. If you have seen smokey stuff in the middle of the night, they must be ghosts. If you have bad dreams, call it as visions. Some ancient religions can help you in that. Take this example: LaVeyan Satanism\n" +
                "Third, make sure that your followers believe that correlation and causation are same. That means if your church stay open on a rainy day that means your church is the cause of all the rain.\n" +
                "Fourth, make some touchy-feely rhetoric that no one can oppose anything. Say something like universal brotherhood or believing in truth. Try to follow the footsteps of Unitarian Universalism.\n" +
                "Create fantastic gods and goddesses. Bonus points for erotic images.  Feraferia \n" +
                "\n" +
                "\n" +
                "Healing is always greatly appreciated. Find a way to create a story that would make you curer of \"impossible\" to cure ailments. Create a rumor that you have cured the HIV/AIDS of a few patients that common medical treatments can't. Branhamism\n" +
                "Create really cool and unique vocabulary. Cults need these vocabulary. Japanese religion of Mahikari has terms such as Tenrikyo, Konkokyo, Oomoto and Sekai Kyūsei Kyō.\n" +
                "Always try to connect with existing religion in some ways. For instance, the Vietnamese religion of Cao Dai uses terms like Buddha. The crazy religions in the US, use the term church for their congregations. Antoinism is an European religion that is based on Christianity. \n" +
                "Create some curious and thoughtful symbols. If you can't think original, a variation of a traditional star works. For instance, the British religion of Wicca that uses witchcraft as the core philosophy uses this:\n" +
                "\n" +
                "The religion of Ordo Templi Orientis  uses Cross:\n" +
                "\n" +
                "\n" +
                "Design anachronistic clothes that look funny, but can get people out of boredom. If you are an European, Druids are a good bet. Neo-Druidism\n" +
                "\n" +
                "\n" +
                "Religiosity vs. GDP (again remember Point 3)\n");

    }

}
