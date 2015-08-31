package meilishuo.gridlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class MyBaseAdapter<T> extends BaseAdapter {
    protected List<T> list = new ArrayList<T>();
    protected LayoutInflater inflater;

    public MyBaseAdapter(Context context) {
        super();
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return list == null ? 0 : list.size();
    }

    @Override
    public T getItem(int arg0) {
        if (arg0 >= list.size()) {
            return null;
        }
        return list.get(arg0);
    }

    @Override
    public long getItemId(int arg0) {
        return arg0;
    }

    public void add(T t) {
        if (null != t) {
            list.add(t);
            notifyDataSetChanged();
        }
    }

    public void add(int pos, T t) {
        if (null != t && pos >= 0 && pos <= list.size() - 1) {
            list.add(pos, t);

        } else if (null != t && pos == list.size()) {
            list.add(t);
        }
        notifyDataSetChanged();
    }

    public void remove(int pos) {
        if (list != null && pos < list.size()) {
            list.remove(pos);
            notifyDataSetChanged();
        }
    }

    public void clear() {
        list.clear();
    }

    public void addAll(Collection<? extends T> collection) {
        if (null != collection) {
            list.addAll(collection);
            notifyDataSetChanged();
        }
    }

    public void addAll(int position, Collection<? extends T> collection) {
        if (null != collection && position >= 0 && position <= list.size() - 1) {
            list.addAll(position, collection);

        } else if (null != collection && position == list.size()) {
            list.addAll(collection);
        }
        notifyDataSetChanged();
    }

    public void setData(Collection<? extends T> collection) {
        if (null != collection) {
            list.clear();
            list.addAll(collection);
            notifyDataSetChanged();
        }
    }

    public List<T> getData() {
        return list;
    }
}
