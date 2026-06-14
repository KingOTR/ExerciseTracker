package org.mapsforge.map.rendertheme.rule;

import androidx.autofill.HintConstants;
import com.google.firebase.firestore.model.Values;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.logging.Logger;
import org.maplibre.android.style.layers.Property;
import org.mapsforge.core.graphics.GraphicFactory;
import org.mapsforge.core.util.IOUtils;
import org.mapsforge.map.model.DisplayModel;
import org.mapsforge.map.rendertheme.XmlRenderTheme;
import org.mapsforge.map.rendertheme.XmlRenderThemeStyleLayer;
import org.mapsforge.map.rendertheme.XmlRenderThemeStyleMenu;
import org.mapsforge.map.rendertheme.XmlUtils;
import org.mapsforge.map.rendertheme.renderinstruction.Area;
import org.mapsforge.map.rendertheme.renderinstruction.Caption;
import org.mapsforge.map.rendertheme.renderinstruction.Circle;
import org.mapsforge.map.rendertheme.renderinstruction.Hillshading;
import org.mapsforge.map.rendertheme.renderinstruction.Line;
import org.mapsforge.map.rendertheme.renderinstruction.LineSymbol;
import org.mapsforge.map.rendertheme.renderinstruction.PathText;
import org.mapsforge.map.rendertheme.renderinstruction.RenderInstruction;
import org.mapsforge.map.rendertheme.renderinstruction.Symbol;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes5.dex */
public final class RenderThemeHandler {
    private static final String ELEMENT_NAME_RULE = "rule";
    private static final String UNEXPECTED_ELEMENT = "unexpected element: ";
    private Set<String> categories;
    private XmlRenderThemeStyleLayer currentLayer;
    private Rule currentRule;
    private final DisplayModel displayModel;
    private final GraphicFactory graphicFactory;
    private int level;
    private final XmlPullParser pullParser;
    private String qName;
    private RenderTheme renderTheme;
    private XmlRenderThemeStyleMenu renderThemeStyleMenu;
    private final XmlRenderTheme xmlRenderTheme;
    private static final Logger LOGGER = Logger.getLogger(RenderThemeHandler.class.getName());
    private static XmlPullParserFactory xmlPullParserFactory = null;
    private final Stack<Element> elementStack = new Stack<>();
    private final Stack<Rule> ruleStack = new Stack<>();
    private Map<String, Symbol> symbols = new HashMap();

    private enum Element {
        RENDER_THEME,
        RENDERING_INSTRUCTION,
        RULE,
        RENDERING_STYLE
    }

    public static RenderTheme getRenderTheme(GraphicFactory graphicFactory, DisplayModel displayModel, XmlRenderTheme xmlRenderTheme) throws IOException, XmlPullParserException {
        InputStream inputStream;
        Throwable th;
        XmlPullParser newPullParser = getXmlPullParserFactory().newPullParser();
        RenderThemeHandler renderThemeHandler = new RenderThemeHandler(graphicFactory, displayModel, xmlRenderTheme, newPullParser);
        try {
            inputStream = xmlRenderTheme.getRenderThemeAsStream();
        } catch (Throwable th2) {
            inputStream = null;
            th = th2;
        }
        try {
            newPullParser.setInput(inputStream, null);
            renderThemeHandler.processRenderTheme();
            RenderTheme renderTheme = renderThemeHandler.renderTheme;
            IOUtils.closeQuietly(inputStream);
            return renderTheme;
        } catch (Throwable th3) {
            th = th3;
            IOUtils.closeQuietly(inputStream);
            throw th;
        }
    }

    public static XmlPullParserFactory getXmlPullParserFactory() throws XmlPullParserException {
        if (xmlPullParserFactory == null) {
            xmlPullParserFactory = XmlPullParserFactory.newInstance();
        }
        return xmlPullParserFactory;
    }

    public static void setXmlPullParserFactory(XmlPullParserFactory xmlPullParserFactory2) {
        xmlPullParserFactory = xmlPullParserFactory2;
    }

    private RenderThemeHandler(GraphicFactory graphicFactory, DisplayModel displayModel, XmlRenderTheme xmlRenderTheme, XmlPullParser xmlPullParser) {
        this.pullParser = xmlPullParser;
        this.graphicFactory = graphicFactory;
        this.displayModel = displayModel;
        this.xmlRenderTheme = xmlRenderTheme;
    }

    public void processRenderTheme() throws XmlPullParserException, IOException {
        int eventType = this.pullParser.getEventType();
        do {
            if (eventType != 0) {
                if (eventType == 2) {
                    startElement();
                } else if (eventType == 3) {
                    endElement();
                }
            }
            eventType = this.pullParser.next();
        } while (eventType != 1);
        endDocument();
    }

    private void endDocument() {
        RenderTheme renderTheme = this.renderTheme;
        if (renderTheme == null) {
            throw new IllegalArgumentException("missing element: rules");
        }
        renderTheme.setLevels(this.level);
        this.renderTheme.complete();
    }

    private void endElement() {
        this.qName = this.pullParser.getName();
        this.elementStack.pop();
        if (ELEMENT_NAME_RULE.equals(this.qName)) {
            this.ruleStack.pop();
            if (this.ruleStack.empty()) {
                if (isVisible(this.currentRule)) {
                    this.renderTheme.addRule(this.currentRule);
                    return;
                }
                return;
            }
            this.currentRule = this.ruleStack.peek();
            return;
        }
        if (!"stylemenu".equals(this.qName) || this.xmlRenderTheme.getMenuCallback() == null) {
            return;
        }
        this.categories = this.xmlRenderTheme.getMenuCallback().getCategories(this.renderThemeStyleMenu);
    }

    private void startElement() throws XmlPullParserException {
        XmlRenderThemeStyleLayer layer;
        String name = this.pullParser.getName();
        this.qName = name;
        try {
            if ("rendertheme".equals(name)) {
                checkState(this.qName, Element.RENDER_THEME);
                this.renderTheme = new RenderThemeBuilder(this.graphicFactory, this.displayModel, this.qName, this.pullParser).build();
                return;
            }
            if (ELEMENT_NAME_RULE.equals(this.qName)) {
                checkState(this.qName, Element.RULE);
                Rule build = new RuleBuilder(this.qName, this.pullParser, this.ruleStack).build();
                if (!this.ruleStack.empty() && isVisible(build)) {
                    this.currentRule.addSubRule(build);
                }
                this.currentRule = build;
                this.ruleStack.push(build);
                return;
            }
            if ("area".equals(this.qName)) {
                checkState(this.qName, Element.RENDERING_INSTRUCTION);
                GraphicFactory graphicFactory = this.graphicFactory;
                DisplayModel displayModel = this.displayModel;
                String str = this.qName;
                XmlPullParser xmlPullParser = this.pullParser;
                int i = this.level;
                this.level = i + 1;
                RenderInstruction area = new Area(graphicFactory, displayModel, str, xmlPullParser, i, this.xmlRenderTheme.getRelativePathPrefix(), this.xmlRenderTheme.getResourceProvider());
                if (isVisible(area)) {
                    this.currentRule.addRenderingInstruction(area);
                    return;
                }
                return;
            }
            if ("caption".equals(this.qName)) {
                checkState(this.qName, Element.RENDERING_INSTRUCTION);
                RenderInstruction caption = new Caption(this.graphicFactory, this.displayModel, this.qName, this.pullParser, this.symbols);
                if (isVisible(caption)) {
                    this.currentRule.addRenderingInstruction(caption);
                    return;
                }
                return;
            }
            if ("cat".equals(this.qName)) {
                checkState(this.qName, Element.RENDERING_STYLE);
                this.currentLayer.addCategory(getStringAttribute("id"));
                return;
            }
            if ("circle".equals(this.qName)) {
                checkState(this.qName, Element.RENDERING_INSTRUCTION);
                GraphicFactory graphicFactory2 = this.graphicFactory;
                DisplayModel displayModel2 = this.displayModel;
                String str2 = this.qName;
                XmlPullParser xmlPullParser2 = this.pullParser;
                int i2 = this.level;
                this.level = i2 + 1;
                RenderInstruction circle = new Circle(graphicFactory2, displayModel2, str2, xmlPullParser2, i2);
                if (isVisible(circle)) {
                    this.currentRule.addRenderingInstruction(circle);
                    return;
                }
                return;
            }
            if ("layer".equals(this.qName)) {
                checkState(this.qName, Element.RENDERING_STYLE);
                this.currentLayer = this.renderThemeStyleMenu.createLayer(getStringAttribute("id"), Boolean.valueOf(getStringAttribute(Property.VISIBLE)).booleanValue(), getStringAttribute("enabled") != null ? Boolean.valueOf(getStringAttribute("enabled")).booleanValue() : false);
                String stringAttribute = getStringAttribute("parent");
                if (stringAttribute == null || (layer = this.renderThemeStyleMenu.getLayer(stringAttribute)) == null) {
                    return;
                }
                Iterator<String> it = layer.getCategories().iterator();
                while (it.hasNext()) {
                    this.currentLayer.addCategory(it.next());
                }
                Iterator<XmlRenderThemeStyleLayer> it2 = layer.getOverlays().iterator();
                while (it2.hasNext()) {
                    this.currentLayer.addOverlay(it2.next());
                }
                return;
            }
            if (Property.SYMBOL_PLACEMENT_LINE.equals(this.qName)) {
                checkState(this.qName, Element.RENDERING_INSTRUCTION);
                GraphicFactory graphicFactory3 = this.graphicFactory;
                DisplayModel displayModel3 = this.displayModel;
                String str3 = this.qName;
                XmlPullParser xmlPullParser3 = this.pullParser;
                int i3 = this.level;
                this.level = i3 + 1;
                RenderInstruction line = new Line(graphicFactory3, displayModel3, str3, xmlPullParser3, i3, this.xmlRenderTheme.getRelativePathPrefix(), this.xmlRenderTheme.getResourceProvider());
                if (isVisible(line)) {
                    this.currentRule.addRenderingInstruction(line);
                    return;
                }
                return;
            }
            if ("lineSymbol".equals(this.qName)) {
                checkState(this.qName, Element.RENDERING_INSTRUCTION);
                RenderInstruction lineSymbol = new LineSymbol(this.graphicFactory, this.displayModel, this.qName, this.pullParser, this.xmlRenderTheme.getRelativePathPrefix(), this.xmlRenderTheme.getResourceProvider());
                if (isVisible(lineSymbol)) {
                    this.currentRule.addRenderingInstruction(lineSymbol);
                    return;
                }
                return;
            }
            if (HintConstants.AUTOFILL_HINT_NAME.equals(this.qName)) {
                checkState(this.qName, Element.RENDERING_STYLE);
                this.currentLayer.addTranslation(getStringAttribute("lang"), getStringAttribute(Values.VECTOR_MAP_VECTORS_KEY));
                return;
            }
            if ("overlay".equals(this.qName)) {
                checkState(this.qName, Element.RENDERING_STYLE);
                XmlRenderThemeStyleLayer layer2 = this.renderThemeStyleMenu.getLayer(getStringAttribute("id"));
                if (layer2 != null) {
                    this.currentLayer.addOverlay(layer2);
                    return;
                }
                return;
            }
            if ("pathText".equals(this.qName)) {
                checkState(this.qName, Element.RENDERING_INSTRUCTION);
                RenderInstruction pathText = new PathText(this.graphicFactory, this.displayModel, this.qName, this.pullParser);
                if (isVisible(pathText)) {
                    this.currentRule.addRenderingInstruction(pathText);
                    return;
                }
                return;
            }
            if ("stylemenu".equals(this.qName)) {
                checkState(this.qName, Element.RENDERING_STYLE);
                this.renderThemeStyleMenu = new XmlRenderThemeStyleMenu(getStringAttribute("id"), getStringAttribute("defaultlang"), getStringAttribute("defaultvalue"));
                return;
            }
            if ("symbol".equals(this.qName)) {
                checkState(this.qName, Element.RENDERING_INSTRUCTION);
                Symbol symbol = new Symbol(this.graphicFactory, this.displayModel, this.qName, this.pullParser, this.xmlRenderTheme.getRelativePathPrefix(), this.xmlRenderTheme.getResourceProvider());
                if (isVisible(symbol)) {
                    this.currentRule.addRenderingInstruction(symbol);
                }
                String id = symbol.getId();
                if (id != null) {
                    this.symbols.put(id, symbol);
                    return;
                }
                return;
            }
            if (!"hillshading".equals(this.qName)) {
                throw new XmlPullParserException("unknown element: " + this.qName);
            }
            checkState(this.qName, Element.RULE);
            String str4 = null;
            byte b = 5;
            byte b2 = 5;
            byte b3 = 17;
            short s = 64;
            boolean z = false;
            for (int i4 = 0; i4 < this.pullParser.getAttributeCount(); i4++) {
                String attributeName = this.pullParser.getAttributeName(i4);
                String attributeValue = this.pullParser.getAttributeValue(i4);
                if ("cat".equals(attributeName)) {
                    str4 = attributeValue;
                } else if ("zoom-min".equals(attributeName)) {
                    b = XmlUtils.parseNonNegativeByte("zoom-min", attributeValue);
                } else if ("zoom-max".equals(attributeName)) {
                    b3 = XmlUtils.parseNonNegativeByte("zoom-max", attributeValue);
                } else if ("magnitude".equals(attributeName)) {
                    short parseNonNegativeInteger = (short) XmlUtils.parseNonNegativeInteger("magnitude", attributeValue);
                    if (parseNonNegativeInteger > 255) {
                        throw new XmlPullParserException("Attribute 'magnitude' must not be > 255");
                    }
                    s = parseNonNegativeInteger;
                } else if ("always".equals(attributeName)) {
                    z = Boolean.valueOf(attributeValue).booleanValue();
                } else if ("layer".equals(attributeName)) {
                    b2 = XmlUtils.parseNonNegativeByte("layer", attributeValue);
                }
            }
            int i5 = this.level;
            this.level = i5 + 1;
            Hillshading hillshading = new Hillshading(b, b3, s, b2, z, i5, this.graphicFactory);
            Set<String> set = this.categories;
            if (set == null || str4 == null || set.contains(str4)) {
                this.renderTheme.addHillShadings(hillshading);
            }
        } catch (IOException e) {
            LOGGER.warning("Rendertheme missing or invalid resource " + e.getMessage());
        }
    }

    /* renamed from: org.mapsforge.map.rendertheme.rule.RenderThemeHandler$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$mapsforge$map$rendertheme$rule$RenderThemeHandler$Element;

        static {
            int[] iArr = new int[Element.values().length];
            $SwitchMap$org$mapsforge$map$rendertheme$rule$RenderThemeHandler$Element = iArr;
            try {
                iArr[Element.RENDER_THEME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$mapsforge$map$rendertheme$rule$RenderThemeHandler$Element[Element.RULE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$mapsforge$map$rendertheme$rule$RenderThemeHandler$Element[Element.RENDERING_INSTRUCTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$mapsforge$map$rendertheme$rule$RenderThemeHandler$Element[Element.RENDERING_STYLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private void checkElement(String str, Element element) throws XmlPullParserException {
        int i = AnonymousClass1.$SwitchMap$org$mapsforge$map$rendertheme$rule$RenderThemeHandler$Element[element.ordinal()];
        if (i == 1) {
            if (!this.elementStack.empty()) {
                throw new XmlPullParserException(UNEXPECTED_ELEMENT + str);
            }
            return;
        }
        if (i == 2) {
            Element peek = this.elementStack.peek();
            if (peek != Element.RENDER_THEME && peek != Element.RULE) {
                throw new XmlPullParserException(UNEXPECTED_ELEMENT + str);
            }
            return;
        }
        if (i != 3) {
            if (i != 4) {
                throw new XmlPullParserException("unknown enum value: " + element);
            }
        } else if (this.elementStack.peek() != Element.RULE) {
            throw new XmlPullParserException(UNEXPECTED_ELEMENT + str);
        }
    }

    private void checkState(String str, Element element) throws XmlPullParserException {
        checkElement(str, element);
        this.elementStack.push(element);
    }

    private String getStringAttribute(String str) {
        int attributeCount = this.pullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (this.pullParser.getAttributeName(i).equals(str)) {
                return this.pullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    private boolean isVisible(RenderInstruction renderInstruction) {
        return this.categories == null || renderInstruction.getCategory() == null || this.categories.contains(renderInstruction.getCategory());
    }

    private boolean isVisible(Rule rule) {
        return this.categories == null || rule.cat == null || this.categories.contains(rule.cat);
    }
}
