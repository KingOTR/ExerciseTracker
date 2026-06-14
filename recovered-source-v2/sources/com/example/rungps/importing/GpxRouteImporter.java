package com.example.rungps.importing;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.xml.parsers.SAXParserFactory;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.osmdroid.util.GeoPoint;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

/* compiled from: GpxRouteImporter.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lcom/example/rungps/importing/GpxRouteImporter;", "", "<init>", "()V", "readPoints", "", "Lorg/osmdroid/util/GeoPoint;", "resolver", "Landroid/content/ContentResolver;", "uri", "Landroid/net/Uri;", "input", "Ljava/io/InputStream;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GpxRouteImporter {
    public static final int $stable = 0;
    public static final GpxRouteImporter INSTANCE = new GpxRouteImporter();

    private GpxRouteImporter() {
    }

    public final List<GeoPoint> readPoints(ContentResolver resolver, Uri uri) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(uri, "uri");
        InputStream openInputStream = resolver.openInputStream(uri);
        if (openInputStream != null) {
            InputStream inputStream = openInputStream;
            try {
                List<GeoPoint> readPoints = INSTANCE.readPoints(inputStream);
                CloseableKt.closeFinally(inputStream, null);
                return readPoints;
            } finally {
            }
        } else {
            return CollectionsKt.emptyList();
        }
    }

    public final List<GeoPoint> readPoints(InputStream input) {
        Intrinsics.checkNotNullParameter(input, "input");
        final ArrayList arrayList = new ArrayList(2048);
        final ArrayList arrayList2 = new ArrayList(512);
        final ArrayList arrayList3 = new ArrayList(512);
        DefaultHandler defaultHandler = new DefaultHandler() { // from class: com.example.rungps.importing.GpxRouteImporter$readPoints$handler$1
            @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
            public void startElement(String uri, String localName, String qName, Attributes attrs) {
                Double doubleOrNull;
                if (localName == null) {
                    localName = qName == null ? "" : qName;
                }
                String lowerCase = localName.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                String substringAfterLast$default = StringsKt.substringAfterLast$default(lowerCase, AbstractJsonLexerKt.COLON, (String) null, 2, (Object) null);
                if (attrs == null) {
                    return;
                }
                int hashCode = substringAfterLast$default.hashCode();
                if (hashCode == 117947) {
                    if (substringAfterLast$default.equals("wpt")) {
                        String value = attrs.getValue("lat");
                        Double doubleOrNull2 = value != null ? StringsKt.toDoubleOrNull(value) : null;
                        String value2 = attrs.getValue("lon");
                        doubleOrNull = value2 != null ? StringsKt.toDoubleOrNull(value2) : null;
                        if (doubleOrNull2 == null || doubleOrNull == null) {
                            return;
                        }
                        arrayList3.add(new GeoPoint(doubleOrNull2.doubleValue(), doubleOrNull.doubleValue()));
                        return;
                    }
                    return;
                }
                if (hashCode == 108837799) {
                    if (substringAfterLast$default.equals("rtept")) {
                        String value3 = attrs.getValue("lat");
                        Double doubleOrNull3 = value3 != null ? StringsKt.toDoubleOrNull(value3) : null;
                        String value4 = attrs.getValue("lon");
                        doubleOrNull = value4 != null ? StringsKt.toDoubleOrNull(value4) : null;
                        if (doubleOrNull3 == null || doubleOrNull == null) {
                            return;
                        }
                        arrayList2.add(new GeoPoint(doubleOrNull3.doubleValue(), doubleOrNull.doubleValue()));
                        return;
                    }
                    return;
                }
                if (hashCode == 110631025 && substringAfterLast$default.equals("trkpt")) {
                    String value5 = attrs.getValue("lat");
                    Double doubleOrNull4 = value5 != null ? StringsKt.toDoubleOrNull(value5) : null;
                    String value6 = attrs.getValue("lon");
                    doubleOrNull = value6 != null ? StringsKt.toDoubleOrNull(value6) : null;
                    if (doubleOrNull4 == null || doubleOrNull == null) {
                        return;
                    }
                    arrayList.add(new GeoPoint(doubleOrNull4.doubleValue(), doubleOrNull.doubleValue()));
                }
            }
        };
        SAXParserFactory newInstance = SAXParserFactory.newInstance();
        newInstance.setNamespaceAware(true);
        newInstance.newSAXParser().parse(input, defaultHandler);
        return arrayList.size() >= 2 ? arrayList : arrayList2.size() >= 2 ? arrayList2 : arrayList3.size() >= 2 ? arrayList3 : CollectionsKt.emptyList();
    }
}
