package com.example.rungps.data;

import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;

/* compiled from: RouteDedupe.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\n\u001a\u00020\tJ\u001a\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\tH\u0002¨\u0006\u0011"}, d2 = {"Lcom/example/rungps/data/RouteDedupe;", "", "<init>", "()V", DatabaseFileArchive.COLUMN_KEY, "", "latLon", "", "Lkotlin/Pair;", "", "distanceM", "keysMatch", "", "a", "b", "round5", "v", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RouteDedupe {
    public static final int $stable = 0;
    public static final RouteDedupe INSTANCE = new RouteDedupe();

    private RouteDedupe() {
    }

    public final String key(List<Pair<Double, Double>> latLon, double distanceM) {
        Intrinsics.checkNotNullParameter(latLon, "latLon");
        if (latLon.size() < 2) {
            return "empty:" + MathKt.roundToInt(distanceM);
        }
        Pair pair = (Pair) CollectionsKt.first((List) latLon);
        Pair pair2 = (Pair) CollectionsKt.last((List) latLon);
        Pair<Double, Double> pair3 = latLon.get(latLon.size() / 2);
        StringBuilder sb = new StringBuilder();
        RouteDedupe routeDedupe = INSTANCE;
        sb.append(routeDedupe.round5(((Number) pair.getFirst()).doubleValue())).append(AbstractJsonLexerKt.COMMA).append(routeDedupe.round5(((Number) pair.getSecond()).doubleValue()));
        sb.append('|');
        sb.append(routeDedupe.round5(pair3.getFirst().doubleValue())).append(AbstractJsonLexerKt.COMMA).append(routeDedupe.round5(pair3.getSecond().doubleValue()));
        sb.append('|');
        sb.append(routeDedupe.round5(((Number) pair2.getFirst()).doubleValue())).append(AbstractJsonLexerKt.COMMA).append(routeDedupe.round5(((Number) pair2.getSecond()).doubleValue()));
        sb.append('|').append(latLon.size());
        sb.append('|').append(MathKt.roundToInt(distanceM));
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public final boolean keysMatch(String a, String b) {
        String str = a;
        return (str == null || StringsKt.isBlank(str) || !Intrinsics.areEqual(a, b)) ? false : true;
    }

    private final String round5(double v) {
        String format = String.format("%.5f", Arrays.copyOf(new Object[]{Double.valueOf(v)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
