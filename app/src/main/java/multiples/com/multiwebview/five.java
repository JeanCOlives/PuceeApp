package multiples.com.multiwebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class five extends AppCompatActivity {

    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);

        webView=(WebView) findViewById(R.id.wubicacion);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.google.com/maps/@0.9708198,-79.6558132,18z");

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(webView.canGoBack()) {
            webView.goBack();
        }else
        {
            super.onBackPressed();
        }
    }
}
