package com.example.rungps.ble;

import android.content.Context;
import androidx.autofill.HintConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: SavedBleWatchStore.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rJ \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005J\u0016\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0005J\u001e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/example/rungps/ble/SavedBleWatchStore;", "", "<init>", "()V", "PREFS", "", "KEY", "MAX", "", "load", "", "Lcom/example/rungps/ble/SavedBleWatch;", "context", "Landroid/content/Context;", "remember", "", "address", HintConstants.AUTOFILL_HINT_NAME, "remove", "persist", "watches", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavedBleWatchStore {
    public static final int $stable = 0;
    public static final SavedBleWatchStore INSTANCE = new SavedBleWatchStore();
    private static final String KEY = "savedBleWatches";
    private static final int MAX = 8;
    private static final String PREFS = "settings";

    private SavedBleWatchStore() {
    }

    public final List<SavedBleWatch> load(Context context) {
        Object m7905constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getSharedPreferences(PREFS, 0).getString(KEY, null);
        if (string == null) {
            return CollectionsKt.emptyList();
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            SavedBleWatchStore savedBleWatchStore = this;
            JSONArray jSONArray = new JSONArray(string);
            List createListBuilder = CollectionsKt.createListBuilder();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String optString = jSONObject.optString("address", "");
                Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
                String obj = StringsKt.trim((CharSequence) optString).toString();
                if (obj.length() != 0) {
                    String optString2 = jSONObject.optString(HintConstants.AUTOFILL_HINT_NAME);
                    Intrinsics.checkNotNull(optString2);
                    if (StringsKt.isBlank(optString2)) {
                        optString2 = null;
                    }
                    createListBuilder.add(new SavedBleWatch(obj, optString2, jSONObject.optLong("lastConnectedMs", 0L)));
                }
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
        return CollectionsKt.sortedWith((Iterable) m7905constructorimpl, new Comparator() { // from class: com.example.rungps.ble.SavedBleWatchStore$load$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Long.valueOf(((SavedBleWatch) t2).getLastConnectedMs()), Long.valueOf(((SavedBleWatch) t).getLastConnectedMs()));
            }
        });
    }

    public final void remember(Context context, String address, String name) {
        String obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(address, "address");
        String obj2 = StringsKt.trim((CharSequence) address).toString();
        if (obj2.length() == 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        List<SavedBleWatch> load = load(context);
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : load) {
            if (!StringsKt.equals(((SavedBleWatch) obj3).getAddress(), obj2, true)) {
                arrayList.add(obj3);
            }
        }
        List mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        String str = null;
        if (name != null && (obj = StringsKt.trim((CharSequence) name).toString()) != null && obj.length() > 0) {
            str = obj;
        }
        mutableList.add(0, new SavedBleWatch(obj2, str, currentTimeMillis));
        persist(context, CollectionsKt.take(mutableList, 8));
        context.getSharedPreferences(PREFS, 0).edit().putString("bleLastAddress", obj2).apply();
    }

    public final void remove(Context context, String address) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(address, "address");
        String obj = StringsKt.trim((CharSequence) address).toString();
        List<SavedBleWatch> load = load(context);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : load) {
            if (!StringsKt.equals(((SavedBleWatch) obj2).getAddress(), obj, true)) {
                arrayList.add(obj2);
            }
        }
        persist(context, arrayList);
    }

    private final void persist(Context context, List<SavedBleWatch> watches) {
        JSONArray jSONArray = new JSONArray();
        for (SavedBleWatch savedBleWatch : watches) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("address", savedBleWatch.getAddress());
            String name = savedBleWatch.getName();
            if (name == null) {
                name = "";
            }
            jSONObject.put(HintConstants.AUTOFILL_HINT_NAME, name);
            jSONObject.put("lastConnectedMs", savedBleWatch.getLastConnectedMs());
            jSONArray.put(jSONObject);
        }
        context.getSharedPreferences(PREFS, 0).edit().putString(KEY, jSONArray.toString()).apply();
    }
}
