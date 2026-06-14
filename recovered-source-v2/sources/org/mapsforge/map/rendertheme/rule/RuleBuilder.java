package org.mapsforge.map.rendertheme.rule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.regex.Pattern;
import org.mapsforge.map.rendertheme.XmlUtils;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes5.dex */
public class RuleBuilder {
    private static final String CAT = "cat";
    private static final String CLOSED = "closed";
    private static final String E = "e";
    private static final String K = "k";
    private static final Pattern SPLIT_PATTERN = Pattern.compile("\\|");
    private static final String STRING_NEGATION = "~";
    private static final String STRING_WILDCARD = "*";
    private static final String V = "v";
    private static final String ZOOM_MAX = "zoom-max";
    private static final String ZOOM_MIN = "zoom-min";
    String cat;
    ClosedMatcher closedMatcher;
    private Element element;
    ElementMatcher elementMatcher;
    private List<String> keyList;
    private String keys;
    private final Stack<Rule> ruleStack;
    private List<String> valueList;
    private String values;
    private Closed closed = Closed.ANY;
    byte zoomMin = 0;
    byte zoomMax = Byte.MAX_VALUE;

    private static ClosedMatcher getClosedMatcher(Closed closed) {
        int i = AnonymousClass1.$SwitchMap$org$mapsforge$map$rendertheme$rule$Closed[closed.ordinal()];
        if (i == 1) {
            return ClosedWayMatcher.INSTANCE;
        }
        if (i == 2) {
            return LinearWayMatcher.INSTANCE;
        }
        if (i == 3) {
            return AnyMatcher.INSTANCE;
        }
        throw new IllegalArgumentException("unknown closed value: " + closed);
    }

    /* renamed from: org.mapsforge.map.rendertheme.rule.RuleBuilder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$mapsforge$map$rendertheme$rule$Closed;
        static final /* synthetic */ int[] $SwitchMap$org$mapsforge$map$rendertheme$rule$Element;

        static {
            int[] iArr = new int[Element.values().length];
            $SwitchMap$org$mapsforge$map$rendertheme$rule$Element = iArr;
            try {
                iArr[Element.NODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$mapsforge$map$rendertheme$rule$Element[Element.WAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$mapsforge$map$rendertheme$rule$Element[Element.ANY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[Closed.values().length];
            $SwitchMap$org$mapsforge$map$rendertheme$rule$Closed = iArr2;
            try {
                iArr2[Closed.YES.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$mapsforge$map$rendertheme$rule$Closed[Closed.NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$mapsforge$map$rendertheme$rule$Closed[Closed.ANY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private static ElementMatcher getElementMatcher(Element element) {
        int i = AnonymousClass1.$SwitchMap$org$mapsforge$map$rendertheme$rule$Element[element.ordinal()];
        if (i == 1) {
            return ElementNodeMatcher.INSTANCE;
        }
        if (i == 2) {
            return ElementWayMatcher.INSTANCE;
        }
        if (i == 3) {
            return AnyMatcher.INSTANCE;
        }
        throw new IllegalArgumentException("unknown element value: " + element);
    }

    private static AttributeMatcher getKeyMatcher(List<String> list) {
        if ("*".equals(list.get(0))) {
            return AnyMatcher.INSTANCE;
        }
        AttributeMatcher attributeMatcher = Rule.MATCHERS_CACHE_KEY.get(list);
        if (attributeMatcher != null) {
            return attributeMatcher;
        }
        KeyMatcher keyMatcher = new KeyMatcher(list);
        Rule.MATCHERS_CACHE_KEY.put(list, keyMatcher);
        return keyMatcher;
    }

    private static AttributeMatcher getValueMatcher(List<String> list) {
        if ("*".equals(list.get(0))) {
            return AnyMatcher.INSTANCE;
        }
        AttributeMatcher attributeMatcher = Rule.MATCHERS_CACHE_VALUE.get(list);
        if (attributeMatcher != null) {
            return attributeMatcher;
        }
        ValueMatcher valueMatcher = new ValueMatcher(list);
        Rule.MATCHERS_CACHE_VALUE.put(list, valueMatcher);
        return valueMatcher;
    }

    public RuleBuilder(String str, XmlPullParser xmlPullParser, Stack<Rule> stack) throws XmlPullParserException {
        this.ruleStack = stack;
        extractValues(str, xmlPullParser);
    }

    public Rule build() {
        if (this.valueList.remove(STRING_NEGATION)) {
            return new NegativeRule(this, new NegativeMatcher(this.keyList, this.valueList));
        }
        return new PositiveRule(this, getKeyMatcher(this.keyList), getValueMatcher(this.valueList));
    }

    private void extractValues(String str, XmlPullParser xmlPullParser) throws XmlPullParserException {
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            if (E.equals(attributeName)) {
                this.element = Element.fromString(attributeValue);
            } else if (K.equals(attributeName)) {
                this.keys = attributeValue;
            } else if (V.equals(attributeName)) {
                this.values = attributeValue;
            } else if (CAT.equals(attributeName)) {
                this.cat = attributeValue;
            } else if (CLOSED.equals(attributeName)) {
                this.closed = Closed.fromString(attributeValue);
            } else if (ZOOM_MIN.equals(attributeName)) {
                this.zoomMin = XmlUtils.parseNonNegativeByte(attributeName, attributeValue);
            } else if (ZOOM_MAX.equals(attributeName)) {
                this.zoomMax = XmlUtils.parseNonNegativeByte(attributeName, attributeValue);
            } else {
                XmlUtils.logUnknownAttribute(str, attributeName, attributeValue, i);
            }
        }
        validate(str);
        Pattern pattern = SPLIT_PATTERN;
        this.keyList = new ArrayList(Arrays.asList(pattern.split(this.keys)));
        this.valueList = new ArrayList(Arrays.asList(pattern.split(this.values)));
        this.elementMatcher = getElementMatcher(this.element);
        this.closedMatcher = getClosedMatcher(this.closed);
    }

    private void validate(String str) throws XmlPullParserException {
        XmlUtils.checkMandatoryAttribute(str, E, this.element);
        XmlUtils.checkMandatoryAttribute(str, K, this.keys);
        XmlUtils.checkMandatoryAttribute(str, V, this.values);
        if (this.zoomMin > this.zoomMax) {
            throw new XmlPullParserException("'zoom-min' > 'zoom-max': " + ((int) this.zoomMin) + ' ' + ((int) this.zoomMax));
        }
    }
}
