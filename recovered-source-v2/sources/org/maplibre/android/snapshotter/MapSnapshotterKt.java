package org.maplibre.android.snapshotter;

import android.text.Html;
import android.text.Spanned;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.maplibre.android.style.layers.Property;

/* compiled from: MapSnapshotter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001b\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"fromHTML", "Landroid/text/Spanned;", "kotlin.jvm.PlatformType", Property.SYMBOL_Z_ORDER_SOURCE, "", "(Ljava/lang/String;)Landroid/text/Spanned;", "MapLibreAndroid_drawableRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MapSnapshotterKt {
    public static final Spanned fromHTML(String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return Html.fromHtml(source, 0);
    }
}
