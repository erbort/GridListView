package meilishuo.gridlistview;

import android.content.Context;
import android.os.Debug;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * weichenglin create in 15/8/31
 */
public class TestGridAdapter extends GridAdapter<TestItem>{
    public TestGridAdapter(Context context) {
        super(context);
    }

    public TestGridAdapter(Context context, int columns) {
        super(context, columns);
    }


    @Override
    protected View getItemView(int position, View convertView) {
        super.getItemView(position, convertView);
        ViewHolder holder;
        if (null == convertView) {
            convertView = inflater.inflate(R.layout.test_item, null);
            holder = new ViewHolder();
            holder.text1 = (TextView) convertView.findViewById(R.id.text1);
            convertView.setTag(holder);
            Log.i("tag_3", "convertView = null");
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.text1.setText(position + "");
        return convertView;
    }

    static class ViewHolder {
        TextView text1;
    }
}
