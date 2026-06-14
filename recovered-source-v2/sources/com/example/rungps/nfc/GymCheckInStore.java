package com.example.rungps.nfc;

import android.content.Context;
import com.caverock.androidsvg.SVGParser;
import com.example.rungps.tracking.TrackingService;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: GymCheckInStore.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000b\u001a\u00020\fJ\u001e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/example/rungps/nfc/GymCheckInStore;", "", "<init>", "()V", "PREFS", "", "KEY_JSON", "MAX", "", "record", "", "context", "Landroid/content/Context;", "kind", "locationName", "cardName", SVGParser.XML_STYLESHEET_ATTR_MEDIA_ALL, "", "Lcom/example/rungps/nfc/GymCheckIn;", TrackingService.BATTERY_SAVE, "list", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymCheckInStore {
    public static final int $stable = 0;
    public static final GymCheckInStore INSTANCE = new GymCheckInStore();
    private static final String KEY_JSON = "checkin_history_json";
    private static final int MAX = 60;
    private static final String PREFS = "gym_nfc";

    private GymCheckInStore() {
    }

    public static /* synthetic */ void record$default(GymCheckInStore gymCheckInStore, Context context, String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        gymCheckInStore.record(context, str, str2, str3);
    }

    public final void record(Context context, String kind, String locationName, String cardName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(kind, "kind");
        List mutableList = CollectionsKt.toMutableList((Collection) all(context));
        mutableList.add(0, new GymCheckIn(System.currentTimeMillis(), kind, locationName, cardName));
        save(context, CollectionsKt.take(mutableList, 60));
    }

    public final List<GymCheckIn> all(Context context) {
        Object m7905constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getSharedPreferences("gym_nfc", 0).getString(KEY_JSON, null);
        if (string == null) {
            return CollectionsKt.emptyList();
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            GymCheckInStore gymCheckInStore = this;
            JSONArray jSONArray = new JSONArray(string);
            List createListBuilder = CollectionsKt.createListBuilder();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String optString = jSONObject.optString("locationName", "");
                String optString2 = jSONObject.optString("cardName", "");
                long j = jSONObject.getLong("atMs");
                String optString3 = jSONObject.optString("kind", "tap");
                Intrinsics.checkNotNullExpressionValue(optString3, "optString(...)");
                Intrinsics.checkNotNull(optString);
                String str = optString.length() > 0 ? optString : null;
                Intrinsics.checkNotNull(optString2);
                createListBuilder.add(new GymCheckIn(j, optString3, str, optString2.length() > 0 ? optString2 : null));
            }
            m7905constructorimpl = Result.m7905constructorimpl(CollectionsKt.build(createListBuilder));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        List emptyList = CollectionsKt.emptyList();
        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
            m7905constructorimpl = emptyList;
        }
        return (List) m7905constructorimpl;
    }

    private final void save(Context context, List<GymCheckIn> list) {
        JSONArray jSONArray = new JSONArray();
        for (GymCheckIn gymCheckIn : list) {
            JSONObject put = new JSONObject().put("atMs", gymCheckIn.getAtMs()).put("kind", gymCheckIn.getKind());
            String locationName = gymCheckIn.getLocationName();
            String str = "";
            if (locationName == null) {
                locationName = "";
            }
            JSONObject put2 = put.put("locationName", locationName);
            String cardName = gymCheckIn.getCardName();
            if (cardName != null) {
                str = cardName;
            }
            jSONArray.put(put2.put("cardName", str));
        }
        context.getSharedPreferences("gym_nfc", 0).edit().putString(KEY_JSON, jSONArray.toString()).apply();
    }
}
