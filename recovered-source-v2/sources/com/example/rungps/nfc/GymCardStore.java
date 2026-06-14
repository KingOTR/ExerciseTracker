package com.example.rungps.nfc;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.autofill.HintConstants;
import com.caverock.androidsvg.SVGParser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: GymCardStore.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002¢\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0005J*\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005J\u001e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005J \u0010\u001b\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005J\u0016\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0005J\u0016\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0005J\u001e\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u0010\u0010 \u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\"\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/example/rungps/nfc/GymCardStore;", "", "<init>", "()V", "PREFS", "", "KEY_CARDS_JSON", "LEGACY_UID", "prefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", SVGParser.XML_STYLESHEET_ATTR_MEDIA_ALL, "", "Lcom/example/rungps/nfc/RegisteredGymCard;", "hasAny", "", "findByUid", "uid", "add", HintConstants.AUTOFILL_HINT_NAME, "locationId", "updateName", "", "id", "updateLocationLink", "remove", "removeByUid", "saveAll", "cards", "migrateLegacySingle", "parseJson", "raw", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymCardStore {
    public static final int $stable = 0;
    public static final GymCardStore INSTANCE = new GymCardStore();
    private static final String KEY_CARDS_JSON = "gym_cards_json";
    private static final String LEGACY_UID = "registered_tag_uid";
    private static final String PREFS = "gym_nfc";

    private GymCardStore() {
    }

    private final SharedPreferences prefs(Context context) {
        return context.getSharedPreferences("gym_nfc", 0);
    }

    public final List<RegisteredGymCard> all(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        migrateLegacySingle(context);
        String string = prefs(context).getString(KEY_CARDS_JSON, null);
        return string == null ? CollectionsKt.emptyList() : parseJson(string);
    }

    public final boolean hasAny(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return !all(context).isEmpty();
    }

    public final RegisteredGymCard findByUid(Context context, String uid) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uid, "uid");
        Iterator<T> it = all(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (StringsKt.equals(((RegisteredGymCard) obj).getUid(), uid, true)) {
                break;
            }
        }
        return (RegisteredGymCard) obj;
    }

    public static /* synthetic */ RegisteredGymCard add$default(GymCardStore gymCardStore, Context context, String str, String str2, String str3, int i, Object obj) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        return gymCardStore.add(context, str, str2, str3);
    }

    public final RegisteredGymCard add(Context context, String uid, String name, String locationId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(name, "name");
        migrateLegacySingle(context);
        String str = "card_" + System.currentTimeMillis();
        String obj = StringsKt.trim((CharSequence) name).toString();
        if (obj.length() == 0) {
            obj = "Gym card";
        }
        RegisteredGymCard registeredGymCard = new RegisteredGymCard(str, obj, StringsKt.trim((CharSequence) uid).toString(), locationId);
        saveAll(context, CollectionsKt.plus((Collection<? extends RegisteredGymCard>) all(context), registeredGymCard));
        return registeredGymCard;
    }

    public final void updateName(Context context, String id, String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        List<RegisteredGymCard> all = all(context);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(all, 10));
        for (RegisteredGymCard registeredGymCard : all) {
            if (Intrinsics.areEqual(registeredGymCard.getId(), id)) {
                String obj = StringsKt.trim((CharSequence) name).toString();
                if (obj.length() == 0) {
                    obj = registeredGymCard.getName();
                }
                registeredGymCard = RegisteredGymCard.copy$default(registeredGymCard, null, obj, null, null, 13, null);
            }
            arrayList.add(registeredGymCard);
        }
        saveAll(context, arrayList);
    }

    public final void updateLocationLink(Context context, String id, String locationId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(id, "id");
        List<RegisteredGymCard> all = all(context);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(all, 10));
        for (RegisteredGymCard registeredGymCard : all) {
            if (Intrinsics.areEqual(registeredGymCard.getId(), id)) {
                registeredGymCard = RegisteredGymCard.copy$default(registeredGymCard, null, null, null, locationId, 7, null);
            }
            arrayList.add(registeredGymCard);
        }
        saveAll(context, arrayList);
    }

    public final void remove(Context context, String id) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(id, "id");
        List<RegisteredGymCard> all = all(context);
        ArrayList arrayList = new ArrayList();
        for (Object obj : all) {
            if (!Intrinsics.areEqual(((RegisteredGymCard) obj).getId(), id)) {
                arrayList.add(obj);
            }
        }
        saveAll(context, arrayList);
    }

    public final void removeByUid(Context context, String uid) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uid, "uid");
        List<RegisteredGymCard> all = all(context);
        ArrayList arrayList = new ArrayList();
        for (Object obj : all) {
            if (!StringsKt.equals(((RegisteredGymCard) obj).getUid(), uid, true)) {
                arrayList.add(obj);
            }
        }
        saveAll(context, arrayList);
    }

    private final void saveAll(Context context, List<RegisteredGymCard> cards) {
        JSONArray jSONArray = new JSONArray();
        for (RegisteredGymCard registeredGymCard : cards) {
            JSONObject put = new JSONObject().put("id", registeredGymCard.getId()).put(HintConstants.AUTOFILL_HINT_NAME, registeredGymCard.getName()).put("uid", registeredGymCard.getUid());
            String locationId = registeredGymCard.getLocationId();
            if (locationId == null) {
                locationId = "";
            }
            jSONArray.put(put.put("locationId", locationId));
        }
        prefs(context).edit().putString(KEY_CARDS_JSON, jSONArray.toString()).apply();
    }

    private final void migrateLegacySingle(Context context) {
        String string;
        SharedPreferences prefs = prefs(context);
        String string2 = prefs.getString(KEY_CARDS_JSON, null);
        if ((string2 == null || StringsKt.isBlank(string2)) && (string = prefs.getString(LEGACY_UID, null)) != null) {
            String str = !StringsKt.isBlank(string) ? string : null;
            if (str == null) {
                return;
            }
            saveAll(context, CollectionsKt.listOf(new RegisteredGymCard("card_legacy", "Gym card", str, null, 8, null)));
            prefs.edit().remove(LEGACY_UID).apply();
        }
    }

    private final List<RegisteredGymCard> parseJson(String raw) {
        Object m7905constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            GymCardStore gymCardStore = this;
            JSONArray jSONArray = new JSONArray(raw);
            List createListBuilder = CollectionsKt.createListBuilder();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String optString = jSONObject.optString("locationId", "");
                String string = jSONObject.getString("id");
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String optString2 = jSONObject.optString(HintConstants.AUTOFILL_HINT_NAME, "Gym card");
                Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
                String string2 = jSONObject.getString("uid");
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                Intrinsics.checkNotNull(optString);
                if (optString.length() <= 0) {
                    optString = null;
                }
                createListBuilder.add(new RegisteredGymCard(string, optString2, string2, optString));
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
