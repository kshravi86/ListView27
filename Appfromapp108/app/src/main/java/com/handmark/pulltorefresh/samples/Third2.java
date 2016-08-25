package com.handmark.pulltorefresh.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.venki18.aakash.appfromapp108.R;

/**
 * Created by pulltorefresh on 7/7/16.
 */
public class Third2 extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("1. Financial vs. Managerial: Accounting has two main disciplines: managerial is the one you use internally for keeping track of things and financial is the one you present externally to investors, banks and the government. For instance, in your managerial accounting you will enter the day-to-day expenses and sales, while your financial accounting will be a summary of all those transactions.\n" +
                "\n" +
                "\n" +
                "2. Double entry book-keeping: Every transaction must be entered in two accounts and these must eventually balance. This ensures that you are on the right track. Although accounting is as old as human civilization, double entry book-keeping was invented only in the 14th century. Fundamentally, all an accountant does is balance the books - make sure all the transactions are entered in two accounts and they all eventually balance (like the last line in the image below).\n" +
                "\n" +
                "\n" +
                "3. Assets & Liabilities. These are the foundations of accounting. Assets include everything you own - your home, car, factory, equipments are all your assets. Liabilities include everything you owe - this includes all your loans. A lot of transactions involve increasing both. For instance, when you buy a home with a loan, you increase both your assets and liabilities.\n" +
                "\n" +
                "4. Equity. The gap between assets and liabilities is your fundamental worth - equity. For instance, if you own a car worth $10,000 and your auto loan balance is only $3000, your equity on the car is $10,000 - $3000 = $7000. If your overall equity is less than zero, that means you are broke.\n" +
                "\n" +
                "                               Equity = Assets - Liabilities\n" +
                "\n" +
                "5. Credit vs. Debit. This is the yin & yang of accounting system. Credit (Cr) is an entry that increases your liabilities and debit (Dr) is an entry that increases your assets. Debit in general means adding a positive number to an account and Credit in general means adding a negative number. Credit is traditionally written on the right side of a ledger, and debit is usually written on the left side of a ledger.\n" +
                "\n" +
                "6. Ledger. The image that you see above is a part of a ledger. A ledger is a principal book, where you enter the money transactions in the format above. Companies typically keep 3 types of ledgers: General Ledger - for keeping track of all expenses, income, assets, liabilities and equity, Sales Ledger - for keeping track of customers who have purchases, but not yet paid for their goods and Purchase Ledger - for keeping track of all purchases we have made for which we have not paid yet.\n" +
                "\n" +
                "From the ledger, we create financial statements that summarize a company's overall position. International standards mandate companies to keep four main types of financial statements. See: Financial statement\n" +
                "\n" +
                "7. Balance sheet - This is the snapshot of a business. It states how much assets are there in various categories (bank accounts, buildings, equipments and the amount you need to receive from your customers), how much liabilities are there in various categories (short term loans, long term loans, amount you need to pay your suppliers) and the overall ownership equity - how many shares of the company are held and how much money was got from the owners.\n" +
                "\n" +
                "8. Income statement - This records the incomes and expenses in various categories. For instance, following is a part of Coca Cola's income statement. http://www.thecoca-colacompany.c... You can see that they have made $46,542 million (top line) in 2011 and are left with a profit of $8634 million (bottom line). Given that the profits are written in the bottomline, you have this common expression bottomline that refers to the final results, while topline is used to show the overall sales that a company makes.\n" +
                "\n" +
                "9. Cash flow statement - If you have run a business, you know that cash is the king & it is very important to understand how a business manages its cash. For instance, if you have made a sales of $10 million, but none of your customers have repayed yet, you can no longer afford to be happy that you have made $10 million in sales. The cash flow statement records how a company got and spent its cash. The cash flow statement shows whether the company is growing its cash and how it is spending the cash (new equipments, repaying loans, paying more wages, etc).\n" +
                "\n" +
                "10. Accounting is not an exact science. Accounting, contrary to popular perception, is not an exact science but involves a lot of judgment. For instance, if 3 of your customers have not paid in 6 months, you must decide if you have to keep them in the account receivable or write it off. Also, you are required to understand tax policies, how inventories are increasing/decreasing in prices and what is the lifetime of the assets you are own. ");
    }

}
