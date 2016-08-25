package com.handmark.pulltorefresh.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.venki18.aakash.appfromapp108.R;

/**
 * Created by pulltorefresh on 9/7/16.
 */
public class Eleventh3 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Historically, that was the purpose of dowry. In rich families all the immovable properties (home/land/business/fields) were given to the sons and all the movable properties (cash/gold/jewelry/clothes/vehicle) went to the daughters. This way the family could provide an equitable share to the sons and daughters share while also avoid splitting the ancestral home or agriculture land. It was a part of most civilizations.\n" +
                "\n" +
                "Among the business families, the cash/gold provided enough liquidity for the newly wed to start their own trade after the wedding. This is how some of the major business stalwarts like Dhirubhai Ambani got started. \n" +
                "\n" +
                "However, like most social practices in India, this one decayed over time and became completely something else. Dowries no longer became a division of property in rich families, but a demanded one even of poor families. Families were asked to divide something that was not even there. In other places, the families were forced to cash out their properties or businesses at very low prices just to pay the dowry.\n" +
                "\n" +
                "It became an instrument of force and a justification of violence. It is evil, because it began to get demanded - even if the bride's father had to take loans/pledge all his assets. It became a brutal, social evil - because it became forced. \n" +
                "\n" +
                "The problems with dowry:\n" +
                "Is responsible for one of the largest portion of bridal deaths and cruelties. Despite our progress elsewhere, dowry deaths are increasing not decreasing. One girl dies every hour - let that sink in. \n" +
                "\n" +
                "It is a big cause of financial stress and debt. As mentioned earlier, families are forced to borrow money just to pay the dowry. This is like an Albatross hanging over our economy, giving the loan sharks a free day. Many families commit suicide, unable to pay the constant demand for dowry, even years after the wedding. Debt and dowry harassment drive family to end life.\n" +
                "It is unfair. In the dowry system, girls had no rights to the family's immovable properties. What if the girl liked the family home more than her brothers? What if the girl had more capabilities to run the family business?\n" +
                "And the worst of all, it has discouraged people from having girl babies. Babies are terminated for no fault of their own, because they become \"liabilities\" for their families. A massive demographic bomb is waiting the top countries in the list below. \n" +
                "\n" +
                "\n" +
                "It is not a mere gender issue. The victims tend to be both women and men (fathers & brothers of brides) and the perpetrators tend to be both men (husbands) and women (MIL & FIL). Thus, it is a deeply meshed social issue that must be completely destroyed. \n" +
                "\n" +
                "Do you know the biggest terrorists and threats to the Indian society? It is us. Whenever you ask dowry for your son, brother, cousin, you kill a small part of India. Dowries kill far more people than all of terrorist units in India combined. In a single week it kills far more people, than the soldiers India lost in major China war. It has killed far more Indians than what Pakistan could dream of. \n" +
                "\n" +
                "Forget corruption, naxalite mafias, pirates and nuclear armed enemies. If we don't solve this problem soon enough, we will implode due to the demographic crisis - many states in India have only 80 girls for every 100 boys. India has to fight this problem as though we are at war. Instead of seeing this as a women's issue - we have to see this as our own issue (especially how it can affect our sisters and daughters) as it significantly weakens our nation.\n" +
                "\n" +
                "In short, a dowry is no longer a simplified form of property sharing and no longer relevant. Since 1956, Indian government has provided daughters an equal share in all property - movable and immovable. Dowry is a massive evil - plain and simple");
    }
}
