package cn.j1angvei.castk2.util;

import cn.j1angvei.castk2.qc.QCInfo;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * using gson convert object to text, or vice versa
 * Created by Wayne on 4/8 2018.
 */
public class GsonUtil {
    private static final Gson GSON = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();

    public static Gson getGson() {
        return GSON;
    }

    public static String toJson(QCInfo qcInfo) {
        return GSON.toJson(qcInfo);
    }

    public static QCInfo fromJson(String qcContent) {
        return GSON.fromJson(qcContent, QCInfo.class);
    }
}
