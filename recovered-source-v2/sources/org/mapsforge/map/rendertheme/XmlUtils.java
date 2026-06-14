package org.mapsforge.map.rendertheme;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.logging.Logger;
import org.mapsforge.core.graphics.GraphicFactory;
import org.mapsforge.core.graphics.ResourceBitmap;
import org.mapsforge.map.model.DisplayModel;
import org.mapsforge.map.rendertheme.renderinstruction.RenderInstruction;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes5.dex */
public final class XmlUtils {
    private static final Logger LOGGER = Logger.getLogger(XmlUtils.class.getName());
    private static final String PREFIX_ASSETS = "assets:";
    public static final String PREFIX_FILE = "file:";
    private static final String PREFIX_JAR = "jar:";
    private static final String PREFIX_JAR_V1 = "jar:/org/mapsforge/android/maps/rendertheme";
    private static final String UNSUPPORTED_COLOR_FORMAT = "unsupported color format: ";

    public static void checkMandatoryAttribute(String str, String str2, Object obj) throws XmlPullParserException {
        if (obj == null) {
            throw new XmlPullParserException("missing attribute '" + str2 + "' for element: " + str);
        }
    }

    public static ResourceBitmap createBitmap(GraphicFactory graphicFactory, DisplayModel displayModel, String str, String str2, XmlThemeResourceProvider xmlThemeResourceProvider, int i, int i2, int i3) throws IOException {
        if (str2 == null || str2.length() == 0) {
            return null;
        }
        InputStream createInputStream = createInputStream(graphicFactory, str, str2, xmlThemeResourceProvider);
        try {
            StringBuilder append = new StringBuilder().append(getAbsoluteName(str, str2)).append(i).append(i2).append(i3);
            if (xmlThemeResourceProvider != null) {
                append.append(xmlThemeResourceProvider.getClass().getName());
            }
            int hashCode = append.toString().hashCode();
            if (str2.toLowerCase(Locale.ENGLISH).endsWith(".svg")) {
                try {
                    return graphicFactory.renderSvg(createInputStream, displayModel.getScaleFactor(), i, i2, i3, hashCode);
                } catch (IOException e) {
                    throw new IOException("SVG render failed " + str2, e);
                }
            }
            try {
                return graphicFactory.createResourceBitmap(createInputStream, displayModel.getScaleFactor(), i, i2, i3, hashCode);
            } catch (IOException e2) {
                throw new IOException("Reading bitmap file failed " + str2, e2);
            }
        } finally {
        }
        createInputStream.close();
    }

    public static void logUnknownAttribute(String str, String str2, String str3, int i) {
        LOGGER.warning("unknown attribute in element " + str + " " + i + " : " + str2 + " = " + str3);
    }

    public static int getColor(GraphicFactory graphicFactory, String str) {
        return getColor(graphicFactory, str, null, null);
    }

    public static int getColor(GraphicFactory graphicFactory, String str, ThemeCallback themeCallback, RenderInstruction renderInstruction) {
        if (str.isEmpty() || str.charAt(0) != '#') {
            throw new IllegalArgumentException(UNSUPPORTED_COLOR_FORMAT + str);
        }
        if (str.length() == 7) {
            return getColor(graphicFactory, str, 255, 1, themeCallback, renderInstruction);
        }
        if (str.length() == 9) {
            return getColor(graphicFactory, str, Integer.parseInt(str.substring(1, 3), 16), 3, themeCallback, renderInstruction);
        }
        throw new IllegalArgumentException(UNSUPPORTED_COLOR_FORMAT + str);
    }

    public static byte parseNonNegativeByte(String str, String str2) throws XmlPullParserException {
        byte parseByte = Byte.parseByte(str2);
        checkForNegativeValue(str, parseByte);
        return parseByte;
    }

    public static float parseNonNegativeFloat(String str, String str2) throws XmlPullParserException {
        float parseFloat = Float.parseFloat(str2);
        checkForNegativeValue(str, parseFloat);
        return parseFloat;
    }

    public static int parseNonNegativeInteger(String str, String str2) throws XmlPullParserException {
        int parseInt = Integer.parseInt(str2);
        checkForNegativeValue(str, parseInt);
        return parseInt;
    }

    private static void checkForNegativeValue(String str, float f) throws XmlPullParserException {
        if (f < 0.0f) {
            throw new XmlPullParserException("Attribute '" + str + "' must not be negative: " + f);
        }
    }

    private static InputStream createInputStream(GraphicFactory graphicFactory, String str, String str2, XmlThemeResourceProvider xmlThemeResourceProvider) throws IOException {
        InputStream inputStreamFromJar;
        if (xmlThemeResourceProvider != null) {
            try {
                InputStream createInputStream = xmlThemeResourceProvider.createInputStream(str, str2);
                if (createInputStream != null) {
                    return createInputStream;
                }
            } catch (IOException e) {
                LOGGER.fine("Exception trying to access resource: " + str2 + " using custom provider: " + e);
            }
        }
        if (str2.startsWith(PREFIX_ASSETS)) {
            str2 = str2.substring(PREFIX_ASSETS.length());
            inputStreamFromJar = inputStreamFromAssets(graphicFactory, str, str2);
        } else if (str2.startsWith(PREFIX_FILE)) {
            str2 = str2.substring(PREFIX_FILE.length());
            inputStreamFromJar = inputStreamFromFile(str, str2);
        } else if (str2.startsWith(PREFIX_JAR) || str2.startsWith(PREFIX_JAR_V1)) {
            if (str2.startsWith(PREFIX_JAR)) {
                str2 = str2.substring(PREFIX_JAR.length());
            } else if (str2.startsWith(PREFIX_JAR_V1)) {
                str2 = str2.substring(PREFIX_JAR_V1.length());
            }
            inputStreamFromJar = inputStreamFromJar(str, str2);
        } else {
            InputStream inputStreamFromFile = inputStreamFromFile(str, str2);
            inputStreamFromJar = inputStreamFromFile == null ? inputStreamFromAssets(graphicFactory, str, str2) : inputStreamFromFile;
            if (inputStreamFromJar == null) {
                inputStreamFromJar = inputStreamFromJar(str, str2);
            }
        }
        if (inputStreamFromJar == null && (inputStreamFromJar = inputStreamFromJar("/assets/", str2)) != null) {
            LOGGER.info("internal resource: " + str2);
        }
        if (inputStreamFromJar != null) {
            return inputStreamFromJar;
        }
        LOGGER.severe("invalid resource: " + str2);
        throw new FileNotFoundException("invalid resource: " + str2);
    }

    private static InputStream inputStreamFromAssets(GraphicFactory graphicFactory, String str, String str2) throws IOException {
        InputStream inputStream;
        try {
            inputStream = graphicFactory.platformSpecificSources(str, str2);
        } catch (IOException unused) {
            inputStream = null;
        }
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        if (r0.canRead() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if (r0.exists() == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static InputStream inputStreamFromFile(String str, String str2) throws IOException {
        File file = getFile(str, str2);
        if (!file.exists()) {
            if (str2.length() > 0 && str2.charAt(0) == File.separatorChar) {
                file = getFile(str, str2.substring(1));
            }
        } else {
            if (file.isFile()) {
            }
            file = null;
        }
        if (file != null) {
            return new FileInputStream(file);
        }
        return null;
    }

    private static InputStream inputStreamFromJar(String str, String str2) throws IOException {
        return XmlUtils.class.getResourceAsStream(getAbsoluteName(str, str2));
    }

    private static String getAbsoluteName(String str, String str2) {
        return str2.charAt(0) == File.separatorChar ? str2 : str + str2;
    }

    private static int getColor(GraphicFactory graphicFactory, String str, int i, int i2, ThemeCallback themeCallback, RenderInstruction renderInstruction) {
        int i3 = i2 + 2;
        int i4 = i2 + 4;
        int createColor = graphicFactory.createColor(i, Integer.parseInt(str.substring(i2, i3), 16), Integer.parseInt(str.substring(i3, i4), 16), Integer.parseInt(str.substring(i4, i2 + 6), 16));
        return themeCallback != null ? themeCallback.getColor(renderInstruction, createColor) : createColor;
    }

    private static File getFile(String str, String str2) {
        if (str2.charAt(0) == File.separatorChar) {
            return new File(str2);
        }
        return new File(str, str2);
    }

    private XmlUtils() {
        throw new IllegalStateException();
    }
}
