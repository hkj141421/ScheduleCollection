package com.knight.Util;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/**
 * Created by forget on 2019/12/30.
 */
public class LanguageUtil {

    private static Set<Character.UnicodeBlock> mChineseUnicodeBlocks = new HashSet<Character.UnicodeBlock>() {{
        add(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS);
        add(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS);
        add(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A);
        add(Character.UnicodeBlock.GENERAL_PUNCTUATION);
        add(Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION);
        add(Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS);
    }};

    private static Set<Character.UnicodeBlock> mJapaneseUnicodeBlocks = new HashSet<Character.UnicodeBlock>() {{
        add(Character.UnicodeBlock.HIRAGANA);
        add(Character.UnicodeBlock.KATAKANA);
        add(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS);
    }};

    /**
     * 去除标点符号
     * @param inputStr
     * @return
     */
    public static String formatToRemoveSign(String inputStr) {
        String resultStr = inputStr.replaceAll("[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……& amp;*（）——+|{}【】‘；：\"_”“’。，、？-]", "");
        return resultStr;
    }

    /** 去除数字*/
    public static String formatToRemoveNums(String inputStr){
        String resultStr =  inputStr.replaceAll("\\d+","").trim();
        return resultStr;
    }

    /** 去除空行，空字符*/
    public static String formatToRemoveBalnkLineAndSpace(String inputStr){
        if(inputStr.trim().equals("")){
            return "";
        }
        Pattern linePattern = Pattern.compile("\\s*|\t|\r|\n");
        String resultStr = linePattern.matcher(inputStr).replaceAll("");
        return resultStr;
    }

    public static boolean checkEnglishChar(String inputStr) {
        String s1=formatToRemoveSign(formatToRemoveNums(formatToRemoveBalnkLineAndSpace(inputStr)));
        //true:全文英文 false:反之
        return s1.matches("[a-zA-Z]+");
    }

    /** 判断字符是否为日文 */
    public static boolean isJapaneseChar(String c) {
        char ch[]=c.toCharArray();
        for (char c1:ch) {
            if(!mJapaneseUnicodeBlocks.contains(Character.UnicodeBlock.of(c1))){
                return false;
            }
        }
        return true;
    }
    /** 判断是否全部为韩文*/
    public static boolean checkKoreaChar(String s1) {
        for (int i = 0; i < s1.length(); i++) {
            if (!((s1.charAt(i) > 0x3130 && s1.charAt(i) < 0x318F)
                    || (s1.charAt(i) >= 0xAC00 && s1.charAt(i) <= 0xD7A3))) {
                return false;
            }
        }
        return true;
    }

    /** 判断字符串是否为中文 */
    public static boolean isChineseChar(String c) {

        char ch[]=c.toCharArray();
        for (char c1:ch) {
            if(!mChineseUnicodeBlocks.contains(Character.UnicodeBlock.of(c1))){
                return false;
            }
        }
        return true;
    }

    public static String checkLanguage(String Str){
        String s1=formatToRemoveSign(formatToRemoveNums(formatToRemoveBalnkLineAndSpace(Str)));
        if (isChineseChar(s1))return "中文";
        if (checkEnglishChar(s1))return "英文";
        if (isJapaneseChar(s1))return "日文";
        if (checkKoreaChar(s1))return "韩文";
        return "未知";
    }

}
