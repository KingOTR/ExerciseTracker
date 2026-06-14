package org.mapsforge.map.rendertheme.rule;

import com.caverock.androidsvg.SVGParser;

/* loaded from: classes5.dex */
enum Closed {
    ANY,
    NO,
    YES;

    public static Closed fromString(String str) {
        if ("any".equals(str)) {
            return ANY;
        }
        if (SVGParser.XML_STYLESHEET_ATTR_ALTERNATE_NO.equals(str)) {
            return NO;
        }
        if ("yes".equals(str)) {
            return YES;
        }
        throw new IllegalArgumentException("Invalid value for Closed: " + str);
    }
}
