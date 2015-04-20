package tw.com.fis.ponapp;//程式分類 透過package來分類

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;    //類似using    前面的android.view  就是package name


public class MainActivity extends ActionBarActivity {  //extends 繼承  於 ActionBarActivity 這個class

    @Override //annotation 類似標籤   比較新的java語法
    //從 ActionBarActivity 覆寫這個 method
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//透過這段把layout畫面載入  前面的R 是 ReSource  來源是res資料夾
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {   //系統自動產生一個menu
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu); //menu要放哪些項目 透過這個檔案載入
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) { //menu 下拉下來  選擇哪個項目
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
