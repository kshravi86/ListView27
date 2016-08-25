package com.balaji.aakash;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by aakash on 9/7/16.
 */
public class Fourteenth4 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("10 things about Israel history. \n" +
                "Jewish culture originated around 1800 BC in Cannan / Levant - a region comprising of the present day Israel, Palestine, Jordon, Lebanon and Syria. \n" +
                "\n" +
                "Egypt Influence: During the Bronze age (1500-1200 BC), the Canaan region was under the Egypt. Then, the Philistines from Greece dominated the region for a few centuries.\n" +
                "Assyrian/Babylon Influence: In the 8th century BC, the Assyrians of modern Iraq wrecked Judah. The mythology talk about the Ten Lost Tribes who were lost due to the Assyrian attack. In the next 6 centuries, the kingdoms of modern Iraq (Babylon) would dominate over the region.  Siege of Jerusalem (587 BC).\n" +
                "Roman influence: After coming under the Persian and Greek empires, Israel fell into the hands of the Roman empire by the time of Jesus. The Israelites would revolt multiple times against Roman persecution (Kitos War) and each time would be crushed by the Romans. A lot of Jews migrated to modern Iran that had a much tolerant religious outlook.\n" +
                "Byzantine era: By 4th century AD Roman empire disintegrated into Byzantine empire and the Western Roman Empire. Although the Byzantines tolerated Judaism, they also imposed huge restrictions on the Jews leading to further migration towards Baltic area.\n" +
                "Arab era: By 7th century AD, the Arabs started conquering all of West Asia. Temple Mount was built during period and a good chunk of the region converted to Islam.  \n" +
                "Crusades era: During the crusades (11-13th century AD) Christian kings of Europe repeated attacked the region to capture the holy land of Jerusalem. A large number of Jews perished during these attacks. Jews were blamed for every disaster, including the plague. Massive persecutions of Jews happened all over Europe forcing Jewish migrations to North Africa, Poland and Turkey. Rome had built forced Jewish ghettos until 1880s. \n" +
                "Ottoman era: After the Crusades, the region came under the Ottomans of Turkey (1517-1920).\n" +
                "British Mandate: At the end of the World War I, Ottomans were in disarray and Britain took over Palestine. By that time sympathy for Jews was already growing in Britain and they also promised part of Ottomon territory to Jews to secure American support during the war. British Mandate for Palestine and started a migration of Jews to the region. \n" +
                "Holocaust: More than a third of the 16 million Jews who lived before the WW-II perished in the war. The present Jewish population of 13 million is primarily distributed in the US and Israel (little more than 5 million in each).\n" +
                "\n" +
                "Judaism is part ethnicity, part religion and part nationality. Who is a Jew? is a complex question. The term Jew comes from the historic Kingdom of Judah.");
    }






}

