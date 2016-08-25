package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 30/7/16.
 */
public class Second12 extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("I guess alright. 10 years ago, I had a backbench bubble at my college that we jealously guarded. \n" +
                "\n" +
                "We were rebels in some sense and were more intent on discussing things like NP-Completeness, different types of architecture and Knuth's works that our education system totally ignored.\n" +
                "\n" +
                "We had a carrot & stick policy and had a deliberate intent of ignoring poor quality teachers who had no commitment. In one of the poorly designed courses with a bad lecturer, we were deliberately reckless. The lecturer threatened to give bad grades for us and we asked her to execute her threat. In the internal tests we had a competition among us to get the lowest marks. The guy to the left of me got 1 mark out of 15, and he eventually ended up in Google's core search team. I got 2 and thus I had to settle for Microsoft core OS development team. The guy who got 3 out 15 did MBA and became a banker. We teased him enough.\n" +
                "\n" +
                "In another of the internal tests that I found to be totally stupid, we had a race to leave the hall early. I stood up within 5 seconds of getting the answer book. The examiner protested as I gave her an empty sheet. Thus, I wrote my name and gave back. She still protested that I'm leaving too early. So, I went back to my desk waited for 2 more minutes before leaving. A long time ago, I have even thrown my answer sheets on my teacher's face when I was pissed off with how answer evaluation worked. Hot headed teen times! Times have changed.\n" +
                "\n" +
                "There are plenty of motivations to be a backbencher:\n" +
                "Make more productive use of time. 4 years of college is at the peak of our energy and curiosity. Our teachers were killing this and time is a precious commodity for me. Thus, I often spent that time reading other topics from Russell & Norvig's AI to Ayn Rand's Atlas Shrugged. If I were reading a novel or preparing for the GRE in the front bench, it would have been distracting to other students. No one notices what happens in the backbench.\n" +
                "People are made different. Our education system tries to be procrustean - by trying to produce an artificial uniformity. If the startup accelerators existed back then, I might have dropped out. But, given the economic conditions of the family, I couldn't do any such rash thing. [Most popular dropouts had a strong family wealth btw] We used to joke about how even Einstein living in a progressive society had to do the same [sneak doing Physics while working as a clerk in a patent office] Thus, I had to keep my sanity while at the same go through the education system.\n" +
                "Different foods cook at different times. Pulses take longer to cook than say tomato. One is not better than the other. In the same way, different people peak in different times of their life. Some people's success periods come early in their life and for others it comes later. Although, this point didn't really apply to me, there are many in our society who just peak a lot later and our education system thinks a person's performance when they are 17 decides their life's worth. Thus, a back bencher could well be a late bloomer who has not finished cooking yet and the rest of the people around him had no idea of what type of food he is. \n" +
                "\n" +
                "To back up the last point, I can tell you the story of my two classmates there. Both of them failed in almost every exam in the class. One had 40 courses in the backlog and other had probably 35. If you think academically they would be the bottom 2.  As for the first guy, he had some filmi looking elopment & I'm not even sure if he finished all the backlog. But he runs a successful company and way stronger in tech than many of the top rankers. And if things had worked correct, he might made a massive revolution in education 5 years ago with his education device, but things didn't work out. \n" +
                "\n" +
                "The other guy was very aloof, slept most of the time and as he came from a very backward community he faced some kind of stereotyping from backward class students themselves. Everyone thought he was a total dud. The last month of our college, we held chess tournaments as we had nothing better to do. As for kicks, we invited this poor tribal guy too. You know what - he was invincible in chess. It was mindblowing. I swear, it is not some movie story. People initially joked when his name went on the front board, but then realized it was not a joke. I felt bad that even I had not talked a lot with him, although he probably adored me and I'm the one who usually befriend such discriminated students.\n" +
                "\n" +
                "Our exams were completely incapable of identifying such gems & a lot of them might be loitering in the backbenches awaiting discovery. Just because they didn't score well in some standardized test at age 17 doesn't mean they are stupid. It might be that they are the dal not the tomato and take longer to cook, but as tasty. \n" +
                "All said we thought of ourselves as rebels, we were not stupid. We picked the battles to fight. Make your point and get back. Thus, the guy who got 1 in that test eventually ended up as the academic topper. Ironically, I got the best outgoing student awards and IEEE Computer's Upsilon Pi Epsilon international award for academic excellence (IEEE Xplore Full-Text PDF). \n" +
                "\n" +
                "The guy who had 3 was the leader in a lot of student organizations. The couple of others in that backbench also are doing great and none of us fared poor in academics. [That said, the guy who didn't given shit to even that mark is probably the more successful than us in some aspects] Also, in complete contrast to undergrad, in my MS I sat in the front row, scored a perfect GPA and not skipped a day of classes as I thought the professors were quite awesome.");
    }




}
