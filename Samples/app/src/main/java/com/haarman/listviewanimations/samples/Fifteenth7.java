package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by listviewanimations on 9/7/16.
 */
public class Fifteenth7 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Start with the basics: 10 Must Reads: The Essentials\n" +
                "\n" +
                "Innovation & Entrepreneurship\n" +
                "Blue Ocean Strategy - This is a classic when it comes to creating completely new markets. Amazing.\n" +
                "The Innovator's Dilemma - A great book on innovation.\n" +
                "Rich Dad Poor Dad - A simple to read book on the importance of entrepreneurship\n" +
                "Who Moved My Cheese? - A very simple book on dealing with change as managers.\n" +
                "The Lean Startup: How Today's Entrepreneurs Use Continuous Innovation to Create Radically Successful Businesses - Start learning the tools to start quickly.\n" +
                "The Four Steps to the Epiphany - This book works well with the Lean Startup idea\n" +
                "\n" +
                "Psychology\n" +
                "Thinking, Fast and Slow - A Nobel winning classic on mind and behavior\n" +
                "Predictably Irrational - Another classic on how irrational our human mind is when it comes to our choices\n" +
                "The Power of Thinking Without Thinking - Blink is a great book on how people make decisons.\n" +
                "Irrational Exuberance - Robert's Shiller's classic on the dotcom bubble\n" +
                "\n" +
                "Finance\n" +
                "A Random Walk Down Wall Street: The Time-Tested Strategy for Successful Investing - A great book to emphasize the importance of prudent usage of index funds as your main method for investing.\n" +
                "Fooled by Randomness: The Hidden Role of Chance in Life and in the Markets - A Taleb's classic on the importance of luck.\n" +
                "The Black Swan - Taleb's landmark work\n" +
                "The Intelligent Investor - A hard to read investment classic that inspired guys like Warren Buffett.\n" +
                "When Genius Failed: The Rise and Fall of Long-Term Capital Management - A story of what happens when you let quants run the funds.\n" +
                "Barbarians at the Gate: The Fall of RJR Nabisco - On Mergers and Acqusitions\n" +
                "\n" +
                "Marketing\n" +
                "Made to Stick - A marketing/branding classic on how to make ideas stick\n" +
                "Presentation Zen: Simple Ideas on Presentation Design and Delivery - if you are a powerpoint presenter, read this.\n" +
                "Influence\n" +
                "Good to Great: Why Some Companies Make the Leap...And Others Don't - What makes great companies stand out from good companies?\n" +
                "\n" +
                "Productivity\n" +
                "Getting Things Done - A classic that has spawned a whole movement.\n" +
                "The 7 Habits of Highly Effective People: Powerful Lessons in Personal Change - A king of self-help books\n" +
                "The Power of Habit: Why We Do What We Do in Life and Business - \n" +
                "Nudge: Improving Decisions About Health, Wealth, and Happiness - \n" +
                "\n" +
                "Economics\n" +
                "Freakonomics - A classic on popular economics.\n" +
                "SuperFreakonomics\n" +
                "The Undercover Economist,\n" +
                "The Tipping Point: How Little Things Can Make a Big Difference - Malcolm Gladwell has a way of explaining even the most drab concepts in a very interesting way\n" +
                "The Great Crash of 1929 - Understand the Great Depression.");
    }






}

