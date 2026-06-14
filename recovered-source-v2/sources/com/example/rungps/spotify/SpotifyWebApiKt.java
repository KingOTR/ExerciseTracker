package com.example.rungps.spotify;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* compiled from: SpotifyWebApi.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¨\u0006\u0004"}, d2 = {"bestCoverUrl", "", "", "Lcom/example/rungps/spotify/SpotifyImage;", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpotifyWebApiKt {
    public static final String bestCoverUrl(List<SpotifyImage> list) {
        Object next;
        String url;
        String obj;
        String str;
        List<SpotifyImage> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        Iterator it = SequencesKt.mapNotNull(CollectionsKt.asSequence(list), new Function1() { // from class: com.example.rungps.spotify.SpotifyWebApiKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Pair bestCoverUrl$lambda$1;
                bestCoverUrl$lambda$1 = SpotifyWebApiKt.bestCoverUrl$lambda$1((SpotifyImage) obj2);
                return bestCoverUrl$lambda$1;
            }
        }).iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int intValue = ((Number) ((Pair) next).getSecond()).intValue();
                do {
                    Object next2 = it.next();
                    int intValue2 = ((Number) ((Pair) next2).getSecond()).intValue();
                    if (intValue < intValue2) {
                        next = next2;
                        intValue = intValue2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Pair pair = (Pair) next;
        if (pair != null && (str = (String) pair.getFirst()) != null) {
            return str;
        }
        SpotifyImage spotifyImage = (SpotifyImage) CollectionsKt.firstOrNull((List) list);
        if (spotifyImage == null || (url = spotifyImage.getUrl()) == null || (obj = StringsKt.trim((CharSequence) url).toString()) == null || StringsKt.isBlank(obj)) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair bestCoverUrl$lambda$1(SpotifyImage img) {
        String obj;
        Intrinsics.checkNotNullParameter(img, "img");
        String url = img.getUrl();
        if (url != null && (obj = StringsKt.trim((CharSequence) url).toString()) != null) {
            if (StringsKt.isBlank(obj)) {
                obj = null;
            }
            if (obj != null) {
                Integer width = img.getWidth();
                int intValue = width != null ? width.intValue() : 0;
                Integer height = img.getHeight();
                return TuplesKt.to(obj, Integer.valueOf(intValue * (height != null ? height.intValue() : 0)));
            }
        }
        return null;
    }
}
