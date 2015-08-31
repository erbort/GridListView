package meilishuo.gridlistview;

import android.content.Context;
import android.util.DisplayMetrics;

/**
 * weichenglin create in 15/8/31
 */
public class utils {
    private static int mScreenWidth = 0, mScreenHeight = 0;

    public static int getScreenWidth(Context context) {
        if (mScreenWidth <= 0) {
            initScreenSize(context);
        }
        return mScreenWidth;
    }

    public static int getScreenHeight(Context context) {
        if (mScreenHeight <= 0) {
            initScreenSize(context);
        }
        return mScreenHeight;
    }

    private static void initScreenSize(Context context) {
        DisplayMetrics dm = context.getResources().getDisplayMetrics();
        mScreenWidth = dm.widthPixels;
        mScreenHeight = dm.heightPixels;
    }
}
