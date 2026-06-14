package androidx.core.graphics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class TypefaceCompat$$ExternalSyntheticBackport0 {
    public static /* synthetic */ Object m(Object obj, Object obj2) {
        return obj != null ? obj : Objects.requireNonNull(obj2, "defaultObj");
    }

    public static /* synthetic */ List m(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(Objects.requireNonNull(obj));
        }
        return Collections.unmodifiableList(arrayList);
    }
}
