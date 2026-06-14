package com.example.rungps.ui.main;

import androidx.compose.material3.ColorScheme;
import androidx.compose.runtime.MutableState;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.RecoveryEventEntity;
import com.example.rungps.data.Repository;
import com.example.rungps.recovery.RecoveryEventLabels;
import com.example.rungps.ui.components.RecoveryTimelineSegment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: HomeRecoveryHub.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.HomeRecoveryHubKt$HomeRecoveryHub$3$1", f = "HomeRecoveryHub.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class HomeRecoveryHubKt$HomeRecoveryHub$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<RecoveryEventEntity> $active;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ ColorScheme $scheme;
    final /* synthetic */ long $timelineNow;
    final /* synthetic */ MutableState<List<RecoveryTimelineSegment>> $timelineSegments$delegate;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeRecoveryHubKt$HomeRecoveryHub$3$1(List<RecoveryEventEntity> list, Repository repository, long j, ColorScheme colorScheme, MutableState<List<RecoveryTimelineSegment>> mutableState, Continuation<? super HomeRecoveryHubKt$HomeRecoveryHub$3$1> continuation) {
        super(2, continuation);
        this.$active = list;
        this.$repo = repository;
        this.$timelineNow = j;
        this.$scheme = colorScheme;
        this.$timelineSegments$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeRecoveryHubKt$HomeRecoveryHub$3$1(this.$active, this.$repo, this.$timelineNow, this.$scheme, this.$timelineSegments$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeRecoveryHubKt$HomeRecoveryHub$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: HomeRecoveryHub.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/example/rungps/ui/components/RecoveryTimelineSegment;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.main.HomeRecoveryHubKt$HomeRecoveryHub$3$1$1", f = "HomeRecoveryHub.kt", i = {0, 0, 1, 1}, l = {105, 105}, m = "invokeSuspend", n = {"destination$iv$iv", "e", "destination$iv$iv", "e"}, s = {"L$2", "L$4", "L$2", "L$4"})
    /* renamed from: com.example.rungps.ui.main.HomeRecoveryHubKt$HomeRecoveryHub$3$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends RecoveryTimelineSegment>>, Object> {
        final /* synthetic */ List<RecoveryEventEntity> $active;
        final /* synthetic */ Repository $repo;
        final /* synthetic */ ColorScheme $scheme;
        final /* synthetic */ long $timelineNow;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(List<RecoveryEventEntity> list, Repository repository, long j, ColorScheme colorScheme, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$active = list;
            this.$repo = repository;
            this.$timelineNow = j;
            this.$scheme = colorScheme;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$active, this.$repo, this.$timelineNow, this.$scheme, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends RecoveryTimelineSegment>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<RecoveryTimelineSegment>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<RecoveryTimelineSegment>> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00f6, code lost:
        
            r16 = r4;
            r4 = r11;
            r3 = null;
            r11 = r2;
            r2 = r10;
            r10 = r12;
            r12 = r9;
            r8 = r7;
            r7 = r14;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0157  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0126  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0121  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00dc -> B:6:0x00dd). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00f2 -> B:7:0x00f6). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Repository repository;
            long j;
            ColorScheme colorScheme;
            ArrayList arrayList;
            Iterator it;
            Repository repository2;
            Object obj2;
            ColorScheme colorScheme2;
            Iterator it2;
            RecoveryEventEntity recoveryEventEntity;
            long j2;
            Collection collection;
            GymSessionEntity gymSessionEntity;
            String str;
            Collection collection2;
            String str2;
            RecoveryEventEntity recoveryEventEntity2;
            Long templateDayId;
            String kind;
            String str3;
            long tertiary;
            AnonymousClass1 anonymousClass1 = this;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = anonymousClass1.label;
            String str4 = "GYM";
            int i2 = 2;
            int i3 = 1;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List<RecoveryEventEntity> list = anonymousClass1.$active;
                repository = anonymousClass1.$repo;
                j = anonymousClass1.$timelineNow;
                colorScheme = anonymousClass1.$scheme;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                it = list.iterator();
                if (!it.hasNext()) {
                }
            } else if (i == 1) {
                j2 = anonymousClass1.J$0;
                collection = (Collection) anonymousClass1.L$5;
                recoveryEventEntity = (RecoveryEventEntity) anonymousClass1.L$4;
                it2 = (Iterator) anonymousClass1.L$3;
                arrayList = (Collection) anonymousClass1.L$2;
                colorScheme2 = (ColorScheme) anonymousClass1.L$1;
                Repository repository3 = (Repository) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                repository2 = repository3;
                obj2 = obj;
                gymSessionEntity = (GymSessionEntity) obj2;
                if (gymSessionEntity != null) {
                }
                str = str4;
                collection2 = arrayList;
                str2 = null;
                arrayList = collection;
                it = it2;
                colorScheme = colorScheme2;
                recoveryEventEntity2 = recoveryEventEntity;
                j = j2;
                repository = repository2;
                long coerceAtLeast = RangesKt.coerceAtLeast(recoveryEventEntity2.getEndsAtMs() - j, 0L);
                String timelineLabel = RecoveryEventLabels.INSTANCE.timelineLabel(recoveryEventEntity2, str2);
                String kind2 = recoveryEventEntity2.getKind();
                long startedAtMs = recoveryEventEntity2.getStartedAtMs();
                long endsAtMs = recoveryEventEntity2.getEndsAtMs();
                kind = recoveryEventEntity2.getKind();
                str3 = str;
                if (Intrinsics.areEqual(kind, str3)) {
                }
                arrayList.add(new RecoveryTimelineSegment(timelineLabel, kind2, startedAtMs, endsAtMs, tertiary, RecoveryEventLabels.INSTANCE.timelineSubtitle(coerceAtLeast, recoveryEventEntity2.getEndsAtMs()), null));
                anonymousClass1 = this;
                arrayList = collection2;
                str4 = str3;
                coroutine_suspended = coroutine_suspended;
                i2 = 2;
                i3 = 1;
                if (!it.hasNext()) {
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j2 = anonymousClass1.J$0;
                collection = (Collection) anonymousClass1.L$5;
                recoveryEventEntity = (RecoveryEventEntity) anonymousClass1.L$4;
                it2 = (Iterator) anonymousClass1.L$3;
                arrayList = (Collection) anonymousClass1.L$2;
                colorScheme2 = (ColorScheme) anonymousClass1.L$1;
                Repository repository4 = (Repository) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                Object dayNameForTemplate = obj;
                str = "GYM";
                str2 = (String) dayNameForTemplate;
                collection2 = arrayList;
                arrayList = collection;
                it = it2;
                colorScheme = colorScheme2;
                recoveryEventEntity2 = recoveryEventEntity;
                j = j2;
                repository = repository4;
                long coerceAtLeast2 = RangesKt.coerceAtLeast(recoveryEventEntity2.getEndsAtMs() - j, 0L);
                String timelineLabel2 = RecoveryEventLabels.INSTANCE.timelineLabel(recoveryEventEntity2, str2);
                String kind22 = recoveryEventEntity2.getKind();
                long startedAtMs2 = recoveryEventEntity2.getStartedAtMs();
                long endsAtMs2 = recoveryEventEntity2.getEndsAtMs();
                kind = recoveryEventEntity2.getKind();
                str3 = str;
                if (Intrinsics.areEqual(kind, str3)) {
                    tertiary = colorScheme.getSecondary();
                } else {
                    tertiary = Intrinsics.areEqual(kind, "SOCCER") ? colorScheme.getTertiary() : colorScheme.getPrimary();
                }
                arrayList.add(new RecoveryTimelineSegment(timelineLabel2, kind22, startedAtMs2, endsAtMs2, tertiary, RecoveryEventLabels.INSTANCE.timelineSubtitle(coerceAtLeast2, recoveryEventEntity2.getEndsAtMs()), null));
                anonymousClass1 = this;
                arrayList = collection2;
                str4 = str3;
                coroutine_suspended = coroutine_suspended;
                i2 = 2;
                i3 = 1;
                if (!it.hasNext()) {
                    recoveryEventEntity2 = (RecoveryEventEntity) it.next();
                    if (Intrinsics.areEqual(recoveryEventEntity2.getKind(), str4)) {
                        long sourceId = recoveryEventEntity2.getSourceId();
                        anonymousClass1.L$0 = repository;
                        anonymousClass1.L$1 = colorScheme;
                        anonymousClass1.L$2 = arrayList;
                        anonymousClass1.L$3 = it;
                        anonymousClass1.L$4 = recoveryEventEntity2;
                        anonymousClass1.L$5 = arrayList;
                        anonymousClass1.J$0 = j;
                        anonymousClass1.label = i3;
                        obj2 = repository.gymSessionById(sourceId, anonymousClass1);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        repository2 = repository;
                        j2 = j;
                        recoveryEventEntity = recoveryEventEntity2;
                        colorScheme2 = colorScheme;
                        it2 = it;
                        collection = arrayList;
                        gymSessionEntity = (GymSessionEntity) obj2;
                        if (gymSessionEntity != null || (templateDayId = gymSessionEntity.getTemplateDayId()) == null) {
                            str = str4;
                            collection2 = arrayList;
                            str2 = null;
                            arrayList = collection;
                            it = it2;
                            colorScheme = colorScheme2;
                            recoveryEventEntity2 = recoveryEventEntity;
                            j = j2;
                            repository = repository2;
                            long coerceAtLeast22 = RangesKt.coerceAtLeast(recoveryEventEntity2.getEndsAtMs() - j, 0L);
                            String timelineLabel22 = RecoveryEventLabels.INSTANCE.timelineLabel(recoveryEventEntity2, str2);
                            String kind222 = recoveryEventEntity2.getKind();
                            long startedAtMs22 = recoveryEventEntity2.getStartedAtMs();
                            long endsAtMs22 = recoveryEventEntity2.getEndsAtMs();
                            kind = recoveryEventEntity2.getKind();
                            str3 = str;
                            if (Intrinsics.areEqual(kind, str3)) {
                            }
                            arrayList.add(new RecoveryTimelineSegment(timelineLabel22, kind222, startedAtMs22, endsAtMs22, tertiary, RecoveryEventLabels.INSTANCE.timelineSubtitle(coerceAtLeast22, recoveryEventEntity2.getEndsAtMs()), null));
                            anonymousClass1 = this;
                            arrayList = collection2;
                            str4 = str3;
                            coroutine_suspended = coroutine_suspended;
                            i2 = 2;
                            i3 = 1;
                            if (!it.hasNext()) {
                                return (List) arrayList;
                            }
                        } else {
                            str = str4;
                            long longValue = templateDayId.longValue();
                            anonymousClass1.L$0 = repository2;
                            anonymousClass1.L$1 = colorScheme2;
                            anonymousClass1.L$2 = arrayList;
                            anonymousClass1.L$3 = it2;
                            anonymousClass1.L$4 = recoveryEventEntity;
                            anonymousClass1.L$5 = collection;
                            anonymousClass1.J$0 = j2;
                            anonymousClass1.label = i2;
                            dayNameForTemplate = repository2.dayNameForTemplate(longValue, anonymousClass1);
                            if (dayNameForTemplate == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            repository4 = repository2;
                            str2 = (String) dayNameForTemplate;
                            collection2 = arrayList;
                            arrayList = collection;
                            it = it2;
                            colorScheme = colorScheme2;
                            recoveryEventEntity2 = recoveryEventEntity;
                            j = j2;
                            repository = repository4;
                            long coerceAtLeast222 = RangesKt.coerceAtLeast(recoveryEventEntity2.getEndsAtMs() - j, 0L);
                            String timelineLabel222 = RecoveryEventLabels.INSTANCE.timelineLabel(recoveryEventEntity2, str2);
                            String kind2222 = recoveryEventEntity2.getKind();
                            long startedAtMs222 = recoveryEventEntity2.getStartedAtMs();
                            long endsAtMs222 = recoveryEventEntity2.getEndsAtMs();
                            kind = recoveryEventEntity2.getKind();
                            str3 = str;
                            if (Intrinsics.areEqual(kind, str3)) {
                            }
                            arrayList.add(new RecoveryTimelineSegment(timelineLabel222, kind2222, startedAtMs222, endsAtMs222, tertiary, RecoveryEventLabels.INSTANCE.timelineSubtitle(coerceAtLeast222, recoveryEventEntity2.getEndsAtMs()), null));
                            anonymousClass1 = this;
                            arrayList = collection2;
                            str4 = str3;
                            coroutine_suspended = coroutine_suspended;
                            i2 = 2;
                            i3 = 1;
                            if (!it.hasNext()) {
                            }
                        }
                    } else {
                        str = str4;
                        collection2 = arrayList;
                        str2 = null;
                        long coerceAtLeast2222 = RangesKt.coerceAtLeast(recoveryEventEntity2.getEndsAtMs() - j, 0L);
                        String timelineLabel2222 = RecoveryEventLabels.INSTANCE.timelineLabel(recoveryEventEntity2, str2);
                        String kind22222 = recoveryEventEntity2.getKind();
                        long startedAtMs2222 = recoveryEventEntity2.getStartedAtMs();
                        long endsAtMs2222 = recoveryEventEntity2.getEndsAtMs();
                        kind = recoveryEventEntity2.getKind();
                        str3 = str;
                        if (Intrinsics.areEqual(kind, str3)) {
                        }
                        arrayList.add(new RecoveryTimelineSegment(timelineLabel2222, kind22222, startedAtMs2222, endsAtMs2222, tertiary, RecoveryEventLabels.INSTANCE.timelineSubtitle(coerceAtLeast2222, recoveryEventEntity2.getEndsAtMs()), null));
                        anonymousClass1 = this;
                        arrayList = collection2;
                        str4 = str3;
                        coroutine_suspended = coroutine_suspended;
                        i2 = 2;
                        i3 = 1;
                        if (!it.hasNext()) {
                        }
                    }
                }
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableState<List<RecoveryTimelineSegment>> mutableState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MutableState<List<RecoveryTimelineSegment>> mutableState2 = this.$timelineSegments$delegate;
            this.L$0 = mutableState2;
            this.label = 1;
            Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.$active, this.$repo, this.$timelineNow, this.$scheme, null), this);
            if (withContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = withContext;
            mutableState = mutableState2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableState = (MutableState) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        mutableState.setValue((List) obj);
        return Unit.INSTANCE;
    }
}
