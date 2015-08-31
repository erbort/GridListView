package meilishuo.gridlistview;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {
    private TestGridAdapter adapter;
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(R.id.list_view);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<TestItem> list = new ArrayList<TestItem>();
                for (int i = 0; i < 2; i++) {
                    TestItem itemView = new TestItem();
                    list.add(itemView);
                }
                adapter.addAll(list);

            }
        });

        adapter = new TestGridAdapter(this, 5);

        //点击item的事件，当然你也可以在getItemView里面自己去实现
        adapter.setOnItemClickListener(new GridAdapter.ItemClickListener() {
            @Override
            public void onItemClick(int position, View itemView) {
                Log.v("tag_3","onItemClickPos = " + position);
            }
        });

        ArrayList<TestItem> list = new ArrayList<TestItem>();
        for (int i = 0; i < 2; i++) {
            TestItem itemView = new TestItem();
            list.add(itemView);
        }
        adapter.setData(list);
        mListView.setAdapter(adapter);
    }


}
