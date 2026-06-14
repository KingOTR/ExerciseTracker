package com.example.rungps.gym;

import com.example.rungps.data.ExerciseNameNormalizer;
import com.example.rungps.data.ExerciseTemplateEntity;
import com.example.rungps.data.GymCarryoverEntity;
import com.example.rungps.data.GymSetEntity;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: GymCarryover.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J0\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0014\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\tJ\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\t2\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0013J\u0016\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0013J(\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\u000f¨\u0006\u001e"}, d2 = {"Lcom/example/rungps/gym/GymCarryover;", "", "<init>", "()V", "isSetFilled", "", "set", "Lcom/example/rungps/data/GymSetEntity;", "incompleteFromTemplate", "", "Lcom/example/rungps/gym/GymCarryoverSpec;", "templates", "Lcom/example/rungps/data/ExerciseTemplateEntity;", "sessionSets", "sessionId", "", "encodeIndices", "", "indices", "", "decodeIndices", "raw", "defaultSets", "owedSetCount", "spec", "toEntity", "Lcom/example/rungps/data/GymCarryoverEntity;", "splitId", "templateDayId", "createdAtMs", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymCarryover {
    public static final int $stable = 0;
    public static final GymCarryover INSTANCE = new GymCarryover();

    private GymCarryover() {
    }

    public final boolean isSetFilled(GymSetEntity set) {
        Intrinsics.checkNotNullParameter(set, "set");
        Integer reps = set.getReps();
        return (reps != null ? reps.intValue() : 0) > 0 && set.getWeightKg() > 0.0d;
    }

    public final List<GymCarryoverSpec> incompleteFromTemplate(List<ExerciseTemplateEntity> templates, List<GymSetEntity> sessionSets, long sessionId) {
        Object obj;
        Intrinsics.checkNotNullParameter(templates, "templates");
        Intrinsics.checkNotNullParameter(sessionSets, "sessionSets");
        ArrayList arrayList = new ArrayList();
        for (ExerciseTemplateEntity exerciseTemplateEntity : templates) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : sessionSets) {
                if (ExerciseNameNormalizer.INSTANCE.matches(((GymSetEntity) obj2).getExerciseName(), exerciseTemplateEntity.getName())) {
                    arrayList2.add(obj2);
                }
            }
            List sortedWith = CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: com.example.rungps.gym.GymCarryover$incompleteFromTemplate$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Integer.valueOf(((GymSetEntity) t).getSetIndex()), Integer.valueOf(((GymSetEntity) t2).getSetIndex()));
                }
            });
            int coerceIn = RangesKt.coerceIn(exerciseTemplateEntity.getDefaultSets(), 1, 10);
            if (sortedWith.isEmpty()) {
                arrayList.add(new GymCarryoverSpec(exerciseTemplateEntity.getName(), CollectionsKt.emptyList(), sessionId));
            } else {
                ArrayList arrayList3 = new ArrayList();
                for (int i = 0; i < coerceIn; i++) {
                    Iterator it = sortedWith.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((GymSetEntity) obj).getSetIndex() == i) {
                            break;
                        }
                    }
                    GymSetEntity gymSetEntity = (GymSetEntity) obj;
                    if (gymSetEntity == null || !isSetFilled(gymSetEntity)) {
                        arrayList3.add(Integer.valueOf(i));
                    }
                }
                if (!arrayList3.isEmpty()) {
                    arrayList.add(new GymCarryoverSpec(exerciseTemplateEntity.getName(), arrayList3, sessionId));
                }
            }
        }
        return arrayList;
    }

    public final String encodeIndices(List<Integer> indices) {
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? "" : CollectionsKt.joinToString$default(CollectionsKt.sorted(indices), ",", null, null, 0, null, null, 62, null);
    }

    public final List<Integer> decodeIndices(String raw, int defaultSets) {
        Intrinsics.checkNotNullParameter(raw, "raw");
        String str = raw;
        if (StringsKt.isBlank(str)) {
            return CollectionsKt.toList(RangesKt.until(0, defaultSets));
        }
        List split$default = StringsKt.split$default((CharSequence) str, new char[]{AbstractJsonLexerKt.COMMA}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        Iterator it = split$default.iterator();
        while (it.hasNext()) {
            Integer intOrNull = StringsKt.toIntOrNull(StringsKt.trim((CharSequence) it.next()).toString());
            if (intOrNull != null) {
                arrayList.add(intOrNull);
            }
        }
        return CollectionsKt.sorted(CollectionsKt.distinct(arrayList));
    }

    public final int owedSetCount(GymCarryoverSpec spec, int defaultSets) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        return spec.getOwedSetIndices().isEmpty() ? defaultSets : spec.getOwedSetIndices().size();
    }

    public final GymCarryoverEntity toEntity(long splitId, long templateDayId, GymCarryoverSpec spec, long createdAtMs) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        return new GymCarryoverEntity(0L, splitId, templateDayId, spec.getExerciseName(), encodeIndices(spec.getOwedSetIndices()), spec.getFromSessionId(), createdAtMs, 1, null);
    }
}
