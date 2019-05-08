package com.weichu.jinxiaocun.demo.comment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.thymeleaf.util.DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

public class DateUtil {
    private static Logger logger = LoggerFactory.getLogger(DateUtil.class);

    public static final String DEFAULT_DATETIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static final String DEFAULT_LASTDATETIME_FORMAT = "yyyy-MM-dd 23:59:59";

    public static final String DEFAULT_BGNDATETIME_FORMAT = "yyyy-MM-dd 00:00:00";

    public static final String DEFAULT_DATETIME24_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";

    private static final String DEFAULT_DATEMOBAN_FORMAT = "MM-dd HH:mm";

    private static final String DEFAULT_DATEFULLTIME_FORMAT = "yyyyMMddHHmmss";

    private static final long MILLISECONDS_A_DAY = 24 * 3600 * 1000;

    private static final long MILLISECONDS_A_HOUR = 3600 * 1000;

    private static final long MILLISECONDS_A_second = 1000;

    public static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd";

    public static final String YEAR_MONTH_FORMAT = "yyyy/MM";

    public static final String DEFAULT_YEAR_MONTH_FORMAT1 = "yyyy-MM";

    private static final String MILLISECOND_FORMAT = "yyyyMMddHHmmssSSS";

    public static final String DEFAULT_DATEFULLDATE_FORMAT = "yyyyMMdd";

    public static final String DEFAULT_YEAR_MONTH_FORMAT = "yyyyMM";

    public static final String DEFAULT_YEAR_FORMAT = "yyyy";

    public static final String DEFAULT_MONTH_FORMAT = "MM";

    public static final String DEFAULT_Day_FORMAT = "dd";

    //验证日期字符串，有效日期范围1900-1-1到2099-12-31.
    private static final Pattern pattern = Pattern
            .compile("(?:(?:19|20)\\d{2})-(?:0?[1-9]|1[0-2])-(?:0?[1-9]|[12][0-9]|3[01])");



    /**
     * @return String
     * @Description: 将时间转化格式为  yyyy-MM-dd HH:mm:ss 的字符串
     */
    public static String getDefaultTimeStr(Date date) {
        SimpleDateFormat format = new SimpleDateFormat(DEFAULT_DATETIME_FORMAT);
        return format.format(date);
    }

    /**
     * @return String
     * @Description: 将时间转化格式为  MM-dd HH:mm 的字符串
     */
    public static String getDefaultMOBANTimeStr(Date date) {
        SimpleDateFormat format = new SimpleDateFormat(DEFAULT_DATEMOBAN_FORMAT);
        return format.format(date);
    }


    /**
     * @return String
     * @Description: 将时间转化格式为  yyyy-MM-dd 23:59:59 的字符串
     */
    public static String getDefaultLastTimeStr(Date date) {
        SimpleDateFormat format = new SimpleDateFormat(DEFAULT_LASTDATETIME_FORMAT);
        return format.format(date);
    }

    /**
     * @return String
     * @Description: 将时间转化格式为  yyyy-MM-dd 00:00:00的字符串
     */
    public static String getDefaultBGNTimeStr(Date date) {

        SimpleDateFormat format = new SimpleDateFormat(DEFAULT_BGNDATETIME_FORMAT);
        return format.format(date);
    }

    /**
     * 将时间转化格式为  yyyy-MM-dd 的字符串
     * @param date
     * @return
     */
    public static String getDefaultTime2DateStr(Date date) {
        SimpleDateFormat format = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
        return format.format(date);
    }

    /**
     * 减去时间
     */
    public static String getZhiJian(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        // calendar.add(Calendar.YEAR, -1);//当前时间减去一年，即一年前的时间
        calendar.add(Calendar.MONTH, -1);//当前时间前去一个月，即一个月前的时间
        return getDefaultTime2DateStr( calendar.getTime());
    }

    /**
     * yyyyMMdd
     * 月年日
     */
    public static String yueNianRi(Date date){
        SimpleDateFormat format = new SimpleDateFormat(DEFAULT_DATEFULLDATE_FORMAT);
        return format.format(date);
    }


}
