package com.haarman.listviewanimations.samples;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by listviewanimations on 9/7/16.
 */
public class Tenth2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Included now 28 states & 2 Union Territories. \n" +
                "Kerala is best for Ayurveda, anything to do with Coconuts, backwaters, great transportation and highest human development indicators and their mixed culture(Hindu, Muslim and Christian religions share their culture equally). The state is very famous for its decorated elephants and boat racing. \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Tamilnadu is best for strong focus on schooling, Carnatic music, Bharatanatyam, quaint traditions, automobile factories, ease of doing business, dosas, Nilgiris tea and most importantly the temples.There are plenty of temples with UNESCO world heritage badge.\n" +
                "\n" +
                "\n" +
                "Andhra Pradesh is known for its massive rivers, rice production, mangoes, Tirupathi, big human resource and the art of Kuchipudi, language too(Italian of the east, most of the carnatic music written in telugu). The state has plenty of Indian Cobras - among the most venomous and most revered snakes in India. \n" +
                "\n" +
                "Telangana India's youngest state has a hybrid of the Nizam's Islamic heritage along with a long heritage of ancient Indian kings. The Charminar in Hyderabad uniquely identifies the state.\n" +
                "\n" +
                "\n" +
                "Karnataka is best for its splendid architecture, untouched beauty of the forests, nature safaris, technology, Mysore culture (best for food). \n" +
                "\n" +
                "\n" +
                "Maharashtra is best known for its strong Hindu roots, colleges, cotton & sugarcane, financial center, industries, Bollywood, massive decorated caves in Ajantha/Ellora. It is among India's richest states. Western Ghats (recently declared as Heritage Site) during the monsoons, Konkan Region and a few Pristine Beaches.  \n" +
                "\n" +
                "\n" +
                "Goa is great for its beaches, feni and laid back culture. It is known for its rave parties around New Year. \n" +
                "\n" +
                "\n" +
                "Gujarat is great for its business friendliness, iconic leaders - Gandhi, Patel,  & Jinnah, big industrial infrastructure, scrappy entrepreneurs (Ambani, Tata, Premji, Palonji et al) and delicious thali. The state houses the world's only reserve for Asiatic Lions at Gir. \n" +
                "\n" +
                "\n" +
                "Rajasthan is great for its palaces, tiger reserves, Jain culture, chilies, weaving and marbles. The state is also famous for its camels and sand dunes. \n" +
                "\n" +
                "\n" +
                "Punjab is known for its food production, great rivers, dhabas, gurudwaras, Bhangra dance.\n" +
                "\n" +
                "Haryana is known for its dairy production, automobile factories & refineries. The Hindu epic of Mahabharata is mainly centered around this place. Both Indraprasta and Kurkshetra are here. \n" +
                "\n" +
                "\n" +
                "Himachal is known for its snow-clad peaks, fruits. Himachal is where British Raj relaxed. The state is famous for its snow leopards - the dying breed of Central Asian leopards. \n" +
                "\n" +
                "\n" +
                "Jammu & Kashmir is India's Switzerland - a paradise of mountains, pashmina shawl (the word Cashmere used for fine wool - comes from the old spelling of the valley) valleys, rivers and caves. J&K is best for its Sapphire, apples, cricket bats, wool, saffron, house boats, pilgrimage (Amarnath & Vaishnodevi)\n" +
                "\n" +
                "Delhi is best known for its historic architecture and the magnificence of the Rashtrapati Bhavan. It is a very open culture, albeit a very flaunt one. \n" +
                "\n" +
                "\n" +
                "Uttarkhand is known for its white water rapids, trekking & camping, Hindu religious pilgrimages, Skiing (auli) and Corbett national park. \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Uttar Pradesh has been the heart of Indian politics for over 5 centuries. Famous for Taj Mahal, Kashi pilgrimage, leather goods, refineries etc. \n" +
                "\n" +
                "\n" +
                "Madhya Pradesh is best known for Khajuraho and ancient history (including Ujjain, Sanchi and Mandu) \n" +
                "\n" +
                "\n" +
                "Chattisgarh is known for heavy industries (such as Bhilai steel plant) and Chitrakoot Falls - India's Niagara. \n" +
                "\n" +
                "\n" +
                "Bihar is known for its historic sites, metal industries and fruits. India's greatest dynasties - Maurya and Gupta began from here. Its landscape is dotted with Buddhist Pilgrimages and is famous for Bodhgaya,the place where Lord Buddha gained enlightenment.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Jharkhand - is the steel state of India with Bokaro, Jamshedpur and Ranchi. It was originally a part of Bihar, but had a certain distinct characteristics - low density, more tribals, deep forests - that afforded a separate state. The main attractions of the state are in the Chotanagpur plateau that holds two national parks. The region has plenty of forests and water falls to trek to. \n" +
                "\n" +
                "\n" +
                "Odisha for its dance forms, temples and Mahanadi river. The state has some of the most surreal temples in India - Puri Jagannath, Konark sun temple and the Lingaraj temple. The English term - Juggernaut came from the Jagannath chariot procession that was sometimes unstoppable.\n" +
                "\n" +
                "\n" +
                "West Bengal is known for its literary culture (that gave people like Vivekananda and Tagore), Jute cloth, trams of Calcutta, teas of Darjeeling, attraction to communists, Sunderban forests (with Royal Bengal tigers), tasty sweets (oh Rosgollah) \n" +
                "\n" +
                "\n" +
                "Sikkim - Sikkim is our paradise No. 2. Amazing mountains and lakes. Known for Rumtek monastry (the second biggest seat of Tibetan buddhism), Natula pass (one of the highest roads in the world and the only open land border with China), Kanjenjunga (India's tallest peak) and the cute Red Pandas (state animal of Sikkim).  \n" +
                "\n" +
                "\n" +
                "\n" +
                " \n" +
                "Arunachal Pradesh (the land of rising sun) - The land of the Brahmaputra that China calls her own. Spectacular landscapes, massive water resources and quiant Tibetan culture. Tawang Gompa is the world's second largest Buddhist monastery- - Tawang Monastery  \n" +
                "\n" +
                "\n" +
                " http://en.wikipedia.org/wiki/Taw...\n" +
                "Assam - Assam is the core of India's northeast and the main economic power of that region. It is famous for Assam tea, oil & gas (India's first oil fields were stuck there as well as Asia's first Oil Refinery in Digboi), the One-horned Rhinos of Kaziranga (the only region with the almost extinct India Rhinos), Kamakhya Temple, Highest Tiger Density of the world (In pictures: Highest tiger density in Kaziranga, India), World's largest and smallest river island - Majuli and Umananda Temple respectively, the oldest ampitheatre of Asia - Rang Ghar.\n" +
                "\n" +
                " \n" +
                "Meghalaya (the abode of clouds) - Meghalaya is known for its rain - It receives the largest amounts of rainfall in the world in Cherrapunji and Mawsyndrum. The state's animal is Clouded Leopard - an endangered species found in East Asia. Credit to  Subhasis Das: Living root bridges of Meghalaya deserve a mention here. \n" +
                "\n" +
                "Manipur - The state is known for its famous Manipuri dance and culture. The Manipuri dance forms celebrate Krishna's divine plays. The state is home to the almost extinct Sangai deer. \n" +
                "\n" +
                "\n" +
                "Mizoram - This is a state with almost complete literacy. The state has dramatic landscapes and friendly tribals. The region also has the rare Wild Water Buffalos.\n" +
                "\n" +
                "Nagaland - The state is known for its warrior Naga tribals (an equivalent of Pathans in India's far west) who had help defeat the Japanese in WW-II in the critical war at Kohima. That decisive defeat changed the game in the Asian theater. The state has great tribal dance forms that are demonstrated in the annual hornbill festival. \n" +
                "\n" +
                "Tripura - Tripura is famous for its temple - Tripureshwari. The state has diverse ethnic mix of tribals and Bengalis with very sweet dance forms. The state is also famous for its leaf monkeys.\n" +
                "\n" +
                "Andaman & Nicobar Islands - This is India's Hawaii. This long group of islands offers excellent range of water activities. The state is known for its history (during British raj it was a penal territory) and extremely isolated tribals.\n" +
                "\n" +
                "Lakshadweep - These have the India's only coral atolls and the state is great for relaxation. \n" +
                "\n" +
                "Wildlife map of India\n" +
                "\n" +
                "\n" +
                "\n" +
                "Food map of India. Every state has their own best cuisine.\n" +
                "\n" +
                "\n" +
                "Culture map of India\n" +
                "\n");
    }
}