package cn.swingz.common.utils;

import sun.java2d.pipe.SpanShapeRenderer;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyUtil {

    public static String getCurrentTime(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String format = sdf.format(date);
        return format;
    }
}
