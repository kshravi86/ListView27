

package com.balaji.aakash;
import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 7/7/16.
 */
public class Second5 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("The education system is a complex one. There are plenty of parts. In this answer I will focus on one part - higher education.\n" +
                "\n" +
                "The Problem\n" +
                "Our present system was designed after the Industrial Revolution, when factories and offices needed a lot of people and you will spend your whole life doing one thing. For instance, you will spend years studying about accounting so that you will become an accountant for life. Or carpentry, engineering or medicine. One skill, learned for life.\n" +
                "\n" +
                "The concepts from college hardly changed in decades and thus you could afford to memorize stuff hard once in your life and then do, do, do throughout life.\n" +
                "\n" +
                "However, technological progress is rendering this workflow irrelevant. You cannot just learn one career path during a 4 year college and expect to do that for 40 years. Career paths change once every 5-7 years for modern workers. I was a developer, then an entrepreneur and now a product manager -3 careers in a span of 5 years. Many of the new career paths don't need years at college.\n" +
                "\n" +
                "That means we need to interleave learning with working, instead of seeing these as separate things. The work should be carefully monitored so that you are doing the stuff you like, are good at and get challenged at the right level.\n" +
                "\n" +
                "Karthavya (कर्तव्य) system\n" +
                "In Mahabharata, Pandavas and Kauravas went through a mentor-led education. Drona took meticulous care of his students. He not only taught them skillsets, but also provided them opportunities to use the skills in real life [like fighting a war with Drupada] while doing the studies.\n" +
                "\n" +
                "How can we build a system inspired by this?\n" +
                "Identity skillsets: After the 6th standard, students will go through a bunch of \"skill identification\" tests to find out where they are good at. It is not about pass/fail, but finding the relative order of skills. Maybe you are really good at design, while someone is really good at writing. This test should be taken every year or if the student wants, even more times too - until he/she sets with the right skillsets that both match interests and core strengths.\n" +
                "Apprenticeship: Allocate one hour a day of school for students to work on this skill under the tutelage of a mentor. Let us assume, you are good at programming/logical skills. You might have a programming mentor who will give you tasks from his real life. Maybe you might help develop a simple website for his client. Or maybe you can help setup a robotic controller for an industrial client. Or shoot a short film or count inventory or bake cookies.  You do real work and get real feedback.\n" +
                "Track, monitor, and assign more tasks: Your progress will also tracked by a central system and that might recommend more fine tuned skills based on your performance. For instance, if you are good with mechanical aspects, maybe you can be given robotics kits to assemble. If you get really smart at robotics, maybe a highly specialized robotics instructor at a major lab will be assigned to work with you. Such instructors want to work with smart people and get your work for almost free. You acquire valuable skills that your books can never teach.\n" +
                "If you are stuck, change path: Let us assume you got initially interested in a marketing track and started helping a company do basic promotions. After a year you find that job boring or you don't have skills. Either the mentor could assign you the right courses that could improve your skills or could recommend a different career path. For every semester, you might be able to switch a new career path. This way, you try with a number of different careers before you are even 17.\n" +
                "Keep increasing the work time: For each year, increase the time they will spend at the skill by 1 hour. For instance, in 7th standard they will spend 2 hours a day, in 8th - 3 hours a day and so on. By the time they come to 12th, work will be more than 80% of the school. You would also be paid at this time. Instead of doing random jobs, you would be doing highly specialized jobs with high level of mastery that you love and have skills in. More importantly, doing work should not take anything of the play time, but just take out the meaningless time spent on homework and tests. For instance, by 12th standard, you might be doing 5 hours a day of work for Google, play for 3-4 hours and have academics for 2-3 hours [make sure the 2 hours of academics is intense and exciting]. This still leaves a lot of time for sleep & other entertainment.\n" +
                "Create companies: Entrepreneurship should be a basic thing that everyone should experience. If you show good work skills, you could go to the next stage. Let us assume schools allocate Rs.50,000 per student to bootstrap his startup [that he must start with 3-4 others]. The money could be brought in by investors, government or even parents. The 3-4 people in your team work with the mentor in building the company out of this seed money of about 2 lakh rupees. From the previous step, if you are good in robotics maybe the company could sell robotics toys to geeks. You could be assisted by someone from marketing track, someone from programming track. As you make sales, the school will attempt to take its seed money and maybe you could repay the school in some cases so that you will own 100% of the company. If not, the investors/parents/government or whomever who paid that money lose that seed money and see it as an education.\n" +
                "\n" +
                "This is not replacement for textbook based learning. But, it will greatly complement it. Instead of reading about programming from a dry text, you would be working on increasingly challenging real life programming tasks under the careful guidance of a mentor. Then when you sit down with the book, you might be able to relate a lot.\n" +
                "\n" +
                "The key component here is the mentor/guru who gets your work for almost free and in return spends his precious time coaching you with real world knowledge you cannot get anywhere else. He/She watches your progress in a very professional way and molds you like Drona did with Arjuna.\n");
    }

}
