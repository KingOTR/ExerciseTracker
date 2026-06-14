package com.example.rungps.nfc;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.autofill.HintConstants;
import com.caverock.androidsvg.SVGParser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: GymLocationStore.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002¢\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000fJ\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u000b\u001a\u00020\fJ\u001c\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014J&\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bJ6\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u000fJ\u0016\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0005J\u000e\u0010 \u001a\u00020!2\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010$\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/example/rungps/nfc/GymLocationStore;", "", "<init>", "()V", "PREFS", "", "KEY_LOCATIONS_JSON", "KEY_RADIUS_DEFAULT", "prefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "defaultRadiusM", "", "setDefaultRadiusM", "", "radiusM", SVGParser.XML_STYLESHEET_ATTR_MEDIA_ALL, "", "Lcom/example/rungps/nfc/GymLocation;", "saveAll", "locations", "add", HintConstants.AUTOFILL_HINT_NAME, "lat", "", "lon", "update", "id", "remove", "hasAny", "", "migrateLegacySingle", "parseJson", "raw", "DEFAULT_RADIUS_M", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymLocationStore {
    public static final int $stable = 0;
    private static final float DEFAULT_RADIUS_M = 150.0f;
    public static final GymLocationStore INSTANCE = new GymLocationStore();
    private static final String KEY_LOCATIONS_JSON = "gym_locations_json";
    private static final String KEY_RADIUS_DEFAULT = "gym_radius_m";
    private static final String PREFS = "gym_nfc";

    private GymLocationStore() {
    }

    private final SharedPreferences prefs(Context context) {
        return context.getSharedPreferences("gym_nfc", 0);
    }

    public final float defaultRadiusM(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return RangesKt.coerceIn(prefs(context).getFloat(KEY_RADIUS_DEFAULT, 150.0f), 50.0f, 500.0f);
    }

    public final void setDefaultRadiusM(Context context, float radiusM) {
        Intrinsics.checkNotNullParameter(context, "context");
        prefs(context).edit().putFloat(KEY_RADIUS_DEFAULT, RangesKt.coerceIn(radiusM, 50.0f, 500.0f)).apply();
    }

    public final List<GymLocation> all(Context context) {
        List<GymLocation> listOf;
        Intrinsics.checkNotNullParameter(context, "context");
        String string = prefs(context).getString(KEY_LOCATIONS_JSON, null);
        String str = string;
        if (str != null && !StringsKt.isBlank(str)) {
            return parseJson(string);
        }
        GymLocation migrateLegacySingle = migrateLegacySingle(context);
        return (migrateLegacySingle == null || (listOf = CollectionsKt.listOf(migrateLegacySingle)) == null) ? CollectionsKt.emptyList() : listOf;
    }

    public final void saveAll(Context context, List<GymLocation> locations) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(locations, "locations");
        JSONArray jSONArray = new JSONArray();
        for (GymLocation gymLocation : locations) {
            jSONArray.put(new JSONObject().put("id", gymLocation.getId()).put(HintConstants.AUTOFILL_HINT_NAME, gymLocation.getName()).put("lat", gymLocation.getLat()).put("lon", gymLocation.getLon()).put("radiusM", gymLocation.getRadiusM()));
        }
        prefs(context).edit().putString(KEY_LOCATIONS_JSON, jSONArray.toString()).apply();
    }

    public final GymLocation add(Context context, String name, double lat, double lon) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        String str = "gym_" + System.currentTimeMillis();
        String obj = StringsKt.trim((CharSequence) name).toString();
        if (obj.length() == 0) {
            obj = "Gym";
        }
        GymLocation gymLocation = new GymLocation(str, obj, lat, lon, defaultRadiusM(context));
        saveAll(context, CollectionsKt.plus((Collection<? extends GymLocation>) all(context), gymLocation));
        return gymLocation;
    }

    public final void update(Context context, String id, String name, double lat, double lon, float radiusM) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        List<GymLocation> all = all(context);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(all, 10));
        for (GymLocation gymLocation : all) {
            if (Intrinsics.areEqual(gymLocation.getId(), id)) {
                String obj = StringsKt.trim((CharSequence) name).toString();
                if (obj.length() == 0) {
                    obj = gymLocation.getName();
                }
                gymLocation = GymLocation.copy$default(gymLocation, null, obj, lat, lon, RangesKt.coerceIn(radiusM, 50.0f, 500.0f), 1, null);
            }
            arrayList.add(gymLocation);
        }
        saveAll(context, arrayList);
    }

    public final void remove(Context context, String id) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(id, "id");
        List<GymLocation> all = all(context);
        ArrayList arrayList = new ArrayList();
        for (Object obj : all) {
            if (!Intrinsics.areEqual(((GymLocation) obj).getId(), id)) {
                arrayList.add(obj);
            }
        }
        saveAll(context, arrayList);
    }

    public final boolean hasAny(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return !all(context).isEmpty();
    }

    private final GymLocation migrateLegacySingle(Context context) {
        Double gymLat = GymNfcConfig.INSTANCE.gymLat(context);
        if (gymLat != null) {
            double doubleValue = gymLat.doubleValue();
            Double gymLon = GymNfcConfig.INSTANCE.gymLon(context);
            if (gymLon != null) {
                GymLocation gymLocation = new GymLocation("legacy", "Gym", doubleValue, gymLon.doubleValue(), GymNfcConfig.INSTANCE.gymRadiusM(context));
                saveAll(context, CollectionsKt.listOf(gymLocation));
                prefs(context).edit().remove("gym_lat").remove("gym_lon").apply();
                return gymLocation;
            }
        }
        return null;
    }

    private final List<GymLocation> parseJson(String raw) {
        Object m7905constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            GymLocationStore gymLocationStore = this;
            JSONArray jSONArray = new JSONArray(raw);
            List createListBuilder = CollectionsKt.createListBuilder();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString("id");
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String optString = jSONObject.optString(HintConstants.AUTOFILL_HINT_NAME, "Gym");
                Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
                createListBuilder.add(new GymLocation(string, optString, jSONObject.getDouble("lat"), jSONObject.getDouble("lon"), (float) jSONObject.optDouble("radiusM", 150.0d)));
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
}
