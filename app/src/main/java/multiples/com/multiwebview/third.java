package multiples.com.multiwebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class third extends AppCompatActivity {

    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        webView=(WebView) findViewById(R.id.wbiblioteca);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://siabuc.pucese.edu.ec/reservacion/index.php");

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
