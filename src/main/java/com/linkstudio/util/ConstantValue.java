package com.linkstudio.util;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;


public class ConstantValue {
    public static final String PINGYI_IP = "http://pingyi.fudan.edu.cn";
    //	public static final String PINGYI_IP = "pingyi/";
//	public static final String DB_USERNAME = "root";
    public static final String DB_USERNAME = "admin";
    public static enum PieName {
        /* 1 */好,
        /* 2 */中,
        /* 3 */差
    };
    private final static Color COLOR_IN_PIEGRAPH[] = {
		/* 1 */new Color(194, 214, 169),
		/* 2 */new Color(18, 154, 213),
		/* 3 */new Color(244, 167, 189),
		/* 4 */new Color(224, 97, 154),
		/* 5 */new Color(28, 164, 150),
		/* 6 */new Color(186,85,211),
		/* 7 */new Color(106,90,205)};
    private static Map<String, Integer> cnNameToNo = new HashMap<String, Integer>();
    public final static String cnNameArr[] = {
		/* 1 */"好",
		/* 2 */"中",
		/* 3 */"差"};
    public final static Color getShowColorOfName(String name) {
        return getShowColorOfEngine(getInnerPieName(name));
    }
    public final static PieName getInnerPieName(String strName){
        int pos = getPosOfStrName(strName);
        return PieName.values()[pos];
    }
    private final static int getPosOfStrName(String strName) {

        Integer pos = cnNameToNo.get(strName);
        if (null != pos)
            return pos.intValue();
        return 0;
    }
    public final static Color getShowColorOfEngine(PieName name) {
        return COLOR_IN_PIEGRAPH[name.ordinal()];
    }
//	public static final String DB_USERNAME = "admin";
    public final static int PIE_WIDTH = 500;//生成的饼图的宽
    public final static int PIE_HEIGHT = 500;//生成的饼图的高
}
