package com.example.rungps.gym;

import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.gym.GymPulleySelection;
import com.example.rungps.gym.GymPulleyStore;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: GymPulleySelection.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0010\u001a\u00020\u0011J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/example/rungps/gym/GymPulleySelection;", "", "configs", "", "Lcom/example/rungps/gym/GymPulleyStore$Config;", "<init>", "(Ljava/util/Set;)V", "getConfigs", "()Ljava/util/Set;", "isEmpty", "", "()Z", "effectiveRatio", "", "getEffectiveRatio", "()F", "label", "", "component1", "copy", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "Companion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GymPulleySelection {
    private final Set<GymPulleyStore.Config> configs;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final GymPulleySelection NONE = new GymPulleySelection(SetsKt.setOf(GymPulleyStore.Config.NONE));

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GymPulleySelection copy$default(GymPulleySelection gymPulleySelection, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            set = gymPulleySelection.configs;
        }
        return gymPulleySelection.copy(set);
    }

    public final Set<GymPulleyStore.Config> component1() {
        return this.configs;
    }

    public final GymPulleySelection copy(Set<? extends GymPulleyStore.Config> configs) {
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new GymPulleySelection(configs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GymPulleySelection) && Intrinsics.areEqual(this.configs, ((GymPulleySelection) other).configs);
    }

    public int hashCode() {
        return this.configs.hashCode();
    }

    public String toString() {
        return "GymPulleySelection(configs=" + this.configs + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GymPulleySelection(Set<? extends GymPulleyStore.Config> configs) {
        Intrinsics.checkNotNullParameter(configs, "configs");
        this.configs = configs;
    }

    public final Set<GymPulleyStore.Config> getConfigs() {
        return this.configs;
    }

    public final boolean isEmpty() {
        if (!this.configs.isEmpty()) {
            Set<GymPulleyStore.Config> set = this.configs;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    if (((GymPulleyStore.Config) it.next()) != GymPulleyStore.Config.NONE) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final float getEffectiveRatio() {
        Set<GymPulleyStore.Config> set = this.configs;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (((GymPulleyStore.Config) obj) != GymPulleyStore.Config.NONE) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        float f = 1.0f;
        if (arrayList2.isEmpty()) {
            return 1.0f;
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            f *= ((GymPulleyStore.Config) it.next()).getEffectiveRatio();
        }
        return RangesKt.coerceIn(f, 0.2f, 4.0f);
    }

    public final String label() {
        if (isEmpty()) {
            return GymPulleyStore.Config.NONE.getLabel();
        }
        if (this.configs.size() == 1) {
            return ((GymPulleyStore.Config) CollectionsKt.first(this.configs)).getLabel();
        }
        Set<GymPulleyStore.Config> set = this.configs;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (((GymPulleyStore.Config) obj) != GymPulleyStore.Config.NONE) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.joinToString$default(arrayList, " + ", null, null, 0, null, new Function1() { // from class: com.example.rungps.gym.GymPulleySelection$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                CharSequence label$lambda$4;
                label$lambda$4 = GymPulleySelection.label$lambda$4((GymPulleyStore.Config) obj2);
                return label$lambda$4;
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence label$lambda$4(GymPulleyStore.Config it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getLabel();
    }

    /* compiled from: GymPulleySelection.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/example/rungps/gym/GymPulleySelection$Companion;", "", "<init>", "()V", "NONE", "Lcom/example/rungps/gym/GymPulleySelection;", "getNONE", "()Lcom/example/rungps/gym/GymPulleySelection;", "fromIds", "ids", "", "toIds", "selection", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final GymPulleySelection getNONE() {
            return GymPulleySelection.NONE;
        }

        public final GymPulleySelection fromIds(String ids) {
            String str = ids;
            if (str == null || StringsKt.isBlank(str) || Intrinsics.areEqual(ids, GymPulleyStore.Config.NONE.getId())) {
                return getNONE();
            }
            List split$default = StringsKt.split$default((CharSequence) str, new char[]{AbstractJsonLexerKt.COMMA}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(split$default, 10));
            Iterator it = split$default.iterator();
            while (it.hasNext()) {
                arrayList.add(StringsKt.trim((CharSequence) it.next()).toString());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                String str2 = (String) obj;
                if (str2.length() > 0 && !Intrinsics.areEqual(str2, GymPulleyStore.Config.NONE.getId())) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = arrayList2;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(GymPulleyStore.INSTANCE.configById((String) it2.next()));
            }
            Set set = CollectionsKt.toSet(arrayList4);
            return set.isEmpty() ? getNONE() : new GymPulleySelection(set);
        }

        public final String toIds(GymPulleySelection selection) {
            Intrinsics.checkNotNullParameter(selection, "selection");
            Set<GymPulleyStore.Config> configs = selection.getConfigs();
            ArrayList arrayList = new ArrayList();
            for (Object obj : configs) {
                if (((GymPulleyStore.Config) obj) != GymPulleyStore.Config.NONE) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = arrayList;
            return arrayList2.isEmpty() ? GymPulleyStore.Config.NONE.getId() : CollectionsKt.joinToString$default(arrayList2, ",", null, null, 0, null, new Function1() { // from class: com.example.rungps.gym.GymPulleySelection$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    CharSequence ids$lambda$4;
                    ids$lambda$4 = GymPulleySelection.Companion.toIds$lambda$4((GymPulleyStore.Config) obj2);
                    return ids$lambda$4;
                }
            }, 30, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence toIds$lambda$4(GymPulleyStore.Config it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getId();
        }
    }
}
