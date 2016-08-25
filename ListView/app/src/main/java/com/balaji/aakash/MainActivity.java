package com.balaji.aakash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

 

    
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
       

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bindService(new Intent("com.android.vending.billing.InAppBillingService.BIND"), mServiceConn, Context.BIND_AUTO_CREATE);
    }
/*
    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        menu.findItem(R.id.menu_main_donate).setVisible(mService != null);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_main_github:
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(URL_GITHUB_IO));
                startActivity(intent);
                return true;
            case R.id.menu_main_beer:
                buy("beer");
                return true;
            case R.id.menu_main_beer2:
                buy("beer2");
                return true;
            case R.id.menu_main_beer3:
                buy("beer3");
                return true;
            case R.id.menu_main_beer4:
                buy("beer4");
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
	*/

    public void history(final View view) {
        Intent intent = new Intent(this, NoBoringActionBarActivity.class);
        startActivity(intent);
    }

    public void wisdom(final View view) {
        Intent intent = new Intent(this, SeventeenthActivity18.class);
        startActivity(intent);
    }

    public void tendulkar(final View view) {
        Intent intent = new Intent(this, SixteenthActivity18.class);
        startActivity(intent);
    }

    public void finance(final View view) {
        Intent intent = new Intent(this, SeventhActivity18.class);
        startActivity(intent);
    }

    public void dharma(final View view) {
        Intent intent = new Intent(this, FifthActivity18.class);
        startActivity(intent);
    }
	
	
	public void reading(final View view) {
        Intent intent = new Intent(this, FifteenthActivity18.class);
        startActivity(intent);
    }

    public void head(final View view) {
        Intent intent = new Intent(this, EighthActivity18.class);
        startActivity(intent);
    }

    public void education(final View view) {
        Intent intent = new Intent(this, SecondActivity18.class);
        startActivity(intent);
    }

    public void mahatma(final View view) {
        Intent intent = new Intent(this, TwelthActivity18.class);
        startActivity(intent);
    }
	public void writing(final View view) {
        Intent intent = new Intent(this, EighteenthActivity18.class);
        startActivity(intent);
    }

    public void middle(final View view) {
        Intent intent = new Intent(this, FourteenthActivity18.class);
        startActivity(intent);
    }
	public void conflict(final View view) {
        Intent intent = new Intent(this, FourthActivity18.class);
        startActivity(intent);
    }

    public void economy(final View view) {
        Intent intent = new Intent(this, SixthActivity18.class);
        startActivity(intent);
    }
	
	
	
/*
    @Override
    public void onDestroy() {
        super.onDestroy();
        unbindService(mServiceConn);
    }

    @Override
    protected void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {
            Toast.makeText(this, getString(R.string.thanks), Toast.LENGTH_LONG).show();

            new Thread(new ConsumePurchaseRunnable(data)).start();
        }
    }

    private void buy(final String sku) {
        try {
            Bundle buyIntentBundle = mService.getBuyIntent(3, getPackageName(), sku, "inapp", "bGoa+V7g/ysDXvKwqq+JTFn4uQZbPiQJo4pf9RzJ");
            PendingIntent pendingIntent = buyIntentBundle.getParcelable("BUY_INTENT");
            if (pendingIntent != null) {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 1001, new Intent(), 0, 0, 0);
            }
        } catch (RemoteException | SendIntentException ignored) {
            Toast.makeText(this, getString(R.string.exception), Toast.LENGTH_LONG).show();
        }
    }

    private class MyServiceConnection implements ServiceConnection {
        @Override
        public void onServiceDisconnected(final ComponentName name) {
            mService = null;
        }

        @Override
        public void onServiceConnected(final ComponentName name, final IBinder service) {
            mService = IInAppBillingService.Stub.asInterface(service);

            new Thread(new RetrievePurchasesRunnable()).start();
        }
    }

    private class RetrievePurchasesRunnable implements Runnable {
        @Override
        public void run() {
            try {
                Bundle ownedItems = mService.getPurchases(3, getPackageName(), "inapp", null);

                int response = ownedItems.getInt("RESPONSE_CODE");
                if (response == 0) {
                    Iterable<String> purchaseDataList = ownedItems.getStringArrayList("INAPP_PURCHASE_DATA_LIST");

                    if (purchaseDataList != null) {
                        for (String purchaseData : purchaseDataList) {
                            JSONObject json = new JSONObject(purchaseData);
                            mService.consumePurchase(3, getPackageName(), json.getString("purchaseToken"));
                        }
                    }
                }
            } catch (RemoteException | JSONException ignored) {
                Toast.makeText(MainActivity.this, getString(R.string.exception), Toast.LENGTH_LONG).show();
            }
        }
    }

    private class ConsumePurchaseRunnable implements Runnable {
        private final Intent mData;

        ConsumePurchaseRunnable(final Intent data) {
            mData = data;
        }

        @Override
        public void run() {
            try {
                JSONObject json = new JSONObject(mData.getStringExtra("INAPP_PURCHASE_DATA"));
                mService.consumePurchase(3, getPackageName(), json.getString("purchaseToken"));
            } catch (JSONException | RemoteException ignored) {
                Toast.makeText(MainActivity.this, getString(R.string.exception), Toast.LENGTH_LONG).show();
            }
        }
    }
	*/
}
