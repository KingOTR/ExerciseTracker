package com.example.rungps.ui.tabs;

import androidx.compose.runtime.MutableState;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.RecoveryEventEntity;
import com.example.rungps.data.Repository;
import com.example.rungps.data.RunEntity;
import com.example.rungps.data.SoccerSessionEntity;
import com.example.rungps.tracking.ActivityTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: RecoveryTab.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.tabs.RecoveryTabKt$RecoveryTab$4$1", f = "RecoveryTab.kt", i = {0}, l = {157, 158}, m = "invokeSuspend", n = {"activeNow"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class RecoveryTabKt$RecoveryTab$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<List<RecoveryTabKt$RecoveryTab$RecoveryEventDetail>> $eventDetails$delegate;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ String $sportLabel;
    final /* synthetic */ MutableState<List<RecoveryEventEntity>> $visibleEvents$delegate;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecoveryTabKt$RecoveryTab$4$1(MutableState<List<RecoveryEventEntity>> mutableState, Repository repository, String str, MutableState<List<RecoveryTabKt$RecoveryTab$RecoveryEventDetail>> mutableState2, Continuation<? super RecoveryTabKt$RecoveryTab$4$1> continuation) {
        super(2, continuation);
        this.$visibleEvents$delegate = mutableState;
        this.$repo = repository;
        this.$sportLabel = str;
        this.$eventDetails$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecoveryTabKt$RecoveryTab$4$1(this.$visibleEvents$delegate, this.$repo, this.$sportLabel, this.$eventDetails$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecoveryTabKt$RecoveryTab$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List RecoveryTab$lambda$4;
        ArrayList arrayList;
        MutableState<List<RecoveryTabKt$RecoveryTab$RecoveryEventDetail>> mutableState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            RecoveryTab$lambda$4 = RecoveryTabKt.RecoveryTab$lambda$4(this.$visibleEvents$delegate);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : RecoveryTab$lambda$4) {
                if (((RecoveryEventEntity) obj2).getEndsAtMs() > System.currentTimeMillis()) {
                    arrayList2.add(obj2);
                }
            }
            arrayList = arrayList2;
            this.L$0 = arrayList;
            this.label = 1;
            obj = BuildersKt.withContext(Dispatchers.getIO(), new RecoveryTabKt$RecoveryTab$4$1$muscleLookup$1(this.$repo, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableState = (MutableState) this.L$0;
                ResultKt.throwOnFailure(obj);
                mutableState.setValue((List) obj);
                return Unit.INSTANCE;
            }
            arrayList = (List) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        MutableState<List<RecoveryTabKt$RecoveryTab$RecoveryEventDetail>> mutableState2 = this.$eventDetails$delegate;
        this.L$0 = mutableState2;
        this.label = 2;
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(arrayList, this.$repo, this.$sportLabel, null), this);
        if (withContext == coroutine_suspended) {
            return coroutine_suspended;
        }
        obj = withContext;
        mutableState = mutableState2;
        mutableState.setValue((List) obj);
        return Unit.INSTANCE;
    }

    /* compiled from: RecoveryTab.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002*\u0001\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "com/example/rungps/ui/tabs/RecoveryTabKt$RecoveryTab$RecoveryEventDetail", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.tabs.RecoveryTabKt$RecoveryTab$4$1$1", f = "RecoveryTab.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3}, l = {187, 215, 216, 232}, m = "invokeSuspend", n = {"destination$iv$iv", "e", "remaining", "destination$iv$iv", "e", "remaining", "destination$iv$iv", "e", "sess", "remaining", "destination$iv$iv", "e", "remaining"}, s = {"L$2", "L$4", "J$0", "L$2", "L$4", "J$0", "L$2", "L$4", "L$5", "J$0", "L$2", "L$4", "J$0"})
    /* renamed from: com.example.rungps.ui.tabs.RecoveryTabKt$RecoveryTab$4$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends RecoveryTabKt$RecoveryTab$RecoveryEventDetail>>, Object> {
        final /* synthetic */ List<RecoveryEventEntity> $activeNow;
        final /* synthetic */ Repository $repo;
        final /* synthetic */ String $sportLabel;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(List<RecoveryEventEntity> list, Repository repository, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$activeNow = list;
            this.$repo = repository;
            this.$sportLabel = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$activeNow, this.$repo, this.$sportLabel, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends RecoveryTabKt$RecoveryTab$RecoveryEventDetail>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<RecoveryTabKt$RecoveryTab$RecoveryEventDetail>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<RecoveryTabKt$RecoveryTab$RecoveryEventDetail>> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:103:0x0136, code lost:
        
            if (r14.equals("RUN") == false) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:128:0x04ff, code lost:
        
            r9.append(". Expand for muscle breakdown.");
            r8 = r9.toString();
            r9 = r25;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9);
            r17 = r1;
            r14 = r7;
            r7 = r3;
            r3 = new com.example.rungps.ui.tabs.RecoveryTabKt$RecoveryTab$RecoveryEventDetail(r19, r20, "Logged in Gym tab", r8, r23);
            r27 = r5;
            r5 = r2;
            r2 = r27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:141:0x03fe, code lost:
        
            if (r14.equals("STRAVA_BIKE") == false) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x04fd, code lost:
        
            r0 = new com.example.rungps.ui.tabs.RecoveryTabKt$RecoveryTab$RecoveryEventDetail(r5, r20, "Activity log", r8, r12);
            r5 = r2;
            r14 = r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x04ff, code lost:
        
            r0.append(r8);
            r0 = r0.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r9);
            r8 = new com.example.rungps.ui.tabs.RecoveryTabKt$RecoveryTab$RecoveryEventDetail(r5, r20, "Strava", r0, r12);
            r5 = r2;
            r14 = r7;
            r7 = r3;
            r3 = r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x012d, code lost:
        
            if (r14.equals(r9) == false) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x0139, code lost:
        
            r14 = r5.getSourceId();
            r0.L$0 = r7;
            r0.L$1 = r6;
            r0.L$2 = r2;
            r0.L$3 = r3;
            r0.L$4 = r5;
            r0.L$5 = r2;
            r0.L$6 = null;
            r0.J$0 = r12;
            r0.label = 1;
            r11 = r7.runById(r14, r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x0155, code lost:
        
            if (r11 != r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x0157, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x0158, code lost:
        
            r19 = r5;
            r14 = r7;
            r23 = r12;
            r5 = r2;
            r12 = r5;
            r7 = r3;
            r13 = r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x04ff, code lost:
        
            r2.append(r3);
            r2 = r2.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r8);
            r3 = new com.example.rungps.ui.tabs.RecoveryTabKt$RecoveryTab$RecoveryEventDetail(r19, r20, "Recorded in Exercise Tracker", r2, r23);
            r17 = r1;
            r2 = r5;
            r26 = r9;
            r5 = r12;
            r6 = r13;
            r9 = r8;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0340  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x02a5  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x02cf  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x02b3  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x02c3  */
        /* JADX WARN: Removed duplicated region for block: B:142:0x050e  */
        /* JADX WARN: Removed duplicated region for block: B:144:0x03af  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x03e5  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00f0  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x04ec  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:134:0x0337 -> B:8:0x033c). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Repository repository;
            Iterator it;
            Collection collection;
            String str;
            String str2;
            String str3;
            long j;
            RecoveryEventEntity recoveryEventEntity;
            GymSessionEntity gymSessionEntity;
            String str4;
            Repository repository2;
            Collection collection2;
            Iterator it2;
            Collection collection3;
            String str5;
            Object obj2;
            Repository repository3;
            Iterator it3;
            RecoveryTabKt$RecoveryTab$RecoveryEventDetail recoveryTabKt$RecoveryTab$RecoveryEventDetail;
            Collection collection4;
            String str6;
            Collection collection5;
            Iterator it4;
            Repository repository4;
            Object obj3;
            RecoveryEventEntity recoveryEventEntity2;
            GymSessionEntity gymSessionEntity2;
            long j2;
            String str7;
            Object obj4;
            Collection collection6;
            Long templateDayId;
            String str8;
            String str9;
            String notes;
            String str10;
            AnonymousClass1 anonymousClass1 = this;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = anonymousClass1.label;
            String str11 = "toString(...)";
            String str12 = ActivityTypes.BIKE;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List<RecoveryEventEntity> list = anonymousClass1.$activeNow;
                Repository repository5 = anonymousClass1.$repo;
                String str13 = anonymousClass1.$sportLabel;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                repository = repository5;
                it = list.iterator();
                collection = arrayList;
                str = str13;
                if (it.hasNext()) {
                }
            } else if (i == 1) {
                long j3 = anonymousClass1.J$0;
                Collection collection7 = (Collection) anonymousClass1.L$5;
                RecoveryEventEntity recoveryEventEntity3 = (RecoveryEventEntity) anonymousClass1.L$4;
                it3 = (Iterator) anonymousClass1.L$3;
                Collection collection8 = (Collection) anonymousClass1.L$2;
                String str14 = (String) anonymousClass1.L$1;
                repository3 = (Repository) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                Object obj5 = obj;
                long j4 = j3;
                RecoveryEventEntity recoveryEventEntity4 = recoveryEventEntity3;
                RunEntity runEntity = (RunEntity) obj5;
                double totalDistanceM = runEntity != null ? runEntity.getTotalDistanceM() / 1000.0d : 0.0d;
                if (Intrinsics.areEqual(recoveryEventEntity4.getKind(), str12)) {
                    str8 = "Ride";
                } else if (runEntity == null || (str8 = ActivityTypes.INSTANCE.label(runEntity.getActivityType())) == null) {
                    str8 = "Run";
                }
                if (runEntity != null) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    str9 = String.format(Locale.US, str8 + " · %.2f km", Arrays.copyOf(new Object[]{Boxing.boxDouble(totalDistanceM)}, 1));
                    Intrinsics.checkNotNullExpressionValue(str9, "format(...)");
                } else {
                    str9 = str8 + " #" + recoveryEventEntity4.getSourceId();
                }
                String str15 = str9;
                StringBuilder sb = new StringBuilder();
                sb.append(Intrinsics.areEqual(recoveryEventEntity4.getKind(), str12) ? "Cycling loads legs and cardiovascular system (distance, duration, speed). " : "Running loads muscles and joints (distance, duration, pace). ");
                String notes2 = recoveryEventEntity4.getNotes();
                if (notes2 == null) {
                }
                sb.append("Estimated from session load.");
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, str11);
                recoveryTabKt$RecoveryTab$RecoveryEventDetail = new RecoveryTabKt$RecoveryTab$RecoveryEventDetail(recoveryEventEntity4, str15, "Recorded in Exercise Tracker", sb2, j4);
                obj2 = coroutine_suspended;
                collection = collection7;
                str2 = str12;
                collection4 = collection8;
                str = str14;
                str5 = str11;
                collection.add(recoveryTabKt$RecoveryTab$RecoveryEventDetail);
                anonymousClass1 = this;
                collection = collection4;
                it = it3;
                str11 = str5;
                repository = repository3;
                coroutine_suspended = obj2;
                str12 = str2;
                if (it.hasNext()) {
                }
            } else if (i == 2) {
                j2 = anonymousClass1.J$0;
                collection2 = (Collection) anonymousClass1.L$5;
                RecoveryEventEntity recoveryEventEntity5 = (RecoveryEventEntity) anonymousClass1.L$4;
                Iterator it5 = (Iterator) anonymousClass1.L$3;
                Collection collection9 = (Collection) anonymousClass1.L$2;
                String str16 = (String) anonymousClass1.L$1;
                Repository repository6 = (Repository) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                str7 = str16;
                it4 = it5;
                recoveryEventEntity2 = recoveryEventEntity5;
                collection6 = collection9;
                repository4 = repository6;
                obj4 = obj;
                gymSessionEntity = (GymSessionEntity) obj4;
                if (gymSessionEntity != null) {
                }
                str3 = str11;
                str2 = str12;
                j = j2;
                collection3 = collection6;
                recoveryEventEntity = recoveryEventEntity2;
                repository2 = repository4;
                it2 = it4;
                str = str7;
                str4 = null;
                String str17 = (gymSessionEntity == null && gymSessionEntity.getFreeDay()) ? "Gym · Free day" : str4 == null ? "Gym · " + str4 : "Gym session";
                StringBuilder sb3 = new StringBuilder("Gym training load");
                if (str4 != null) {
                }
                sb3.append(". Expand for muscle breakdown.");
                String sb4 = sb3.toString();
                str5 = str3;
                Intrinsics.checkNotNullExpressionValue(sb4, str5);
                obj2 = coroutine_suspended;
                repository3 = repository2;
                it3 = it2;
                recoveryTabKt$RecoveryTab$RecoveryEventDetail = new RecoveryTabKt$RecoveryTab$RecoveryEventDetail(recoveryEventEntity, str17, "Logged in Gym tab", sb4, j);
                Collection collection10 = collection2;
                collection4 = collection3;
                collection = collection10;
                collection.add(recoveryTabKt$RecoveryTab$RecoveryEventDetail);
                anonymousClass1 = this;
                collection = collection4;
                it = it3;
                str11 = str5;
                repository = repository3;
                coroutine_suspended = obj2;
                str12 = str2;
                if (it.hasNext()) {
                }
            } else if (i == 3) {
                j2 = anonymousClass1.J$0;
                collection2 = (Collection) anonymousClass1.L$6;
                gymSessionEntity2 = (GymSessionEntity) anonymousClass1.L$5;
                recoveryEventEntity2 = (RecoveryEventEntity) anonymousClass1.L$4;
                it4 = (Iterator) anonymousClass1.L$3;
                collection5 = (Collection) anonymousClass1.L$2;
                String str18 = (String) anonymousClass1.L$1;
                repository4 = (Repository) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                str3 = "toString(...)";
                str2 = ActivityTypes.BIKE;
                str6 = str18;
                obj3 = obj;
                str4 = (String) obj3;
                j = j2;
                recoveryEventEntity = recoveryEventEntity2;
                repository2 = repository4;
                it2 = it4;
                collection3 = collection5;
                gymSessionEntity = gymSessionEntity2;
                str = str6;
                String str172 = (gymSessionEntity == null && gymSessionEntity.getFreeDay()) ? "Gym · Free day" : str4 == null ? "Gym · " + str4 : "Gym session";
                StringBuilder sb32 = new StringBuilder("Gym training load");
                if (str4 != null) {
                }
                sb32.append(". Expand for muscle breakdown.");
                String sb42 = sb32.toString();
                str5 = str3;
                Intrinsics.checkNotNullExpressionValue(sb42, str5);
                obj2 = coroutine_suspended;
                repository3 = repository2;
                it3 = it2;
                recoveryTabKt$RecoveryTab$RecoveryEventDetail = new RecoveryTabKt$RecoveryTab$RecoveryEventDetail(recoveryEventEntity, str172, "Logged in Gym tab", sb42, j);
                Collection collection102 = collection2;
                collection4 = collection3;
                collection = collection102;
                collection.add(recoveryTabKt$RecoveryTab$RecoveryEventDetail);
                anonymousClass1 = this;
                collection = collection4;
                it = it3;
                str11 = str5;
                repository = repository3;
                coroutine_suspended = obj2;
                str12 = str2;
                if (it.hasNext()) {
                }
            } else {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j5 = anonymousClass1.J$0;
                collection = (Collection) anonymousClass1.L$5;
                RecoveryEventEntity recoveryEventEntity6 = (RecoveryEventEntity) anonymousClass1.L$4;
                it = (Iterator) anonymousClass1.L$3;
                collection4 = (Collection) anonymousClass1.L$2;
                str = (String) anonymousClass1.L$1;
                repository = (Repository) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                Object soccerSessionById = obj;
                str2 = ActivityTypes.BIKE;
                long j6 = j5;
                RecoveryEventEntity recoveryEventEntity7 = recoveryEventEntity6;
                str5 = "toString(...)";
                SoccerSessionEntity soccerSessionEntity = (SoccerSessionEntity) soccerSessionById;
                if (soccerSessionEntity == null) {
                    int warmupMin = soccerSessionEntity.getWarmupMin() + soccerSessionEntity.getPlayMin();
                    String kind = soccerSessionEntity.getKind();
                    if (kind.length() > 0) {
                        StringBuilder sb5 = new StringBuilder();
                        char charAt = kind.charAt(0);
                        Locale US = Locale.US;
                        Intrinsics.checkNotNullExpressionValue(US, "US");
                        StringBuilder append = sb5.append((Object) CharsKt.titlecase(charAt, US));
                        String substring = kind.substring(1);
                        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                        kind = append.append(substring).toString();
                    }
                    str10 = kind + " · " + warmupMin + " min · intensity " + soccerSessionEntity.getIntensity() + "/10";
                } else {
                    str10 = str + " #" + recoveryEventEntity7.getSourceId();
                }
                String str19 = str10;
                String str20 = "Logged in " + str + " tab";
                String notes3 = recoveryEventEntity7.getNotes();
                if (notes3 == null) {
                    notes3 = "Match/training load from duration and intensity.";
                }
                RecoveryTabKt$RecoveryTab$RecoveryEventDetail recoveryTabKt$RecoveryTab$RecoveryEventDetail2 = new RecoveryTabKt$RecoveryTab$RecoveryEventDetail(recoveryEventEntity7, str19, str20, notes3, j6);
                obj2 = coroutine_suspended;
                repository3 = repository;
                it3 = it;
                recoveryTabKt$RecoveryTab$RecoveryEventDetail = recoveryTabKt$RecoveryTab$RecoveryEventDetail2;
                collection.add(recoveryTabKt$RecoveryTab$RecoveryEventDetail);
                anonymousClass1 = this;
                collection = collection4;
                it = it3;
                str11 = str5;
                repository = repository3;
                coroutine_suspended = obj2;
                str12 = str2;
                if (it.hasNext()) {
                    RecoveryEventEntity recoveryEventEntity8 = (RecoveryEventEntity) it.next();
                    long coerceAtLeast = RangesKt.coerceAtLeast(recoveryEventEntity8.getEndsAtMs() - System.currentTimeMillis(), 0L);
                    String kind2 = recoveryEventEntity8.getKind();
                    switch (kind2.hashCode()) {
                        case -2047622491:
                            str2 = str12;
                            str5 = str11;
                            break;
                        case -1843726999:
                            str2 = str12;
                            str5 = str11;
                            if (kind2.equals("SOCCER")) {
                                long sourceId = recoveryEventEntity8.getSourceId();
                                anonymousClass1.L$0 = repository;
                                anonymousClass1.L$1 = str;
                                anonymousClass1.L$2 = collection;
                                anonymousClass1.L$3 = it;
                                anonymousClass1.L$4 = recoveryEventEntity8;
                                anonymousClass1.L$5 = collection;
                                anonymousClass1.L$6 = null;
                                anonymousClass1.J$0 = coerceAtLeast;
                                anonymousClass1.label = 4;
                                soccerSessionById = repository.soccerSessionById(sourceId, anonymousClass1);
                                if (soccerSessionById == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                recoveryEventEntity7 = recoveryEventEntity8;
                                j6 = coerceAtLeast;
                                collection4 = collection;
                                SoccerSessionEntity soccerSessionEntity2 = (SoccerSessionEntity) soccerSessionById;
                                if (soccerSessionEntity2 == null) {
                                }
                                String str192 = str10;
                                String str202 = "Logged in " + str + " tab";
                                String notes32 = recoveryEventEntity7.getNotes();
                                if (notes32 == null) {
                                }
                                RecoveryTabKt$RecoveryTab$RecoveryEventDetail recoveryTabKt$RecoveryTab$RecoveryEventDetail22 = new RecoveryTabKt$RecoveryTab$RecoveryEventDetail(recoveryEventEntity7, str192, str202, notes32, j6);
                                obj2 = coroutine_suspended;
                                repository3 = repository;
                                it3 = it;
                                recoveryTabKt$RecoveryTab$RecoveryEventDetail = recoveryTabKt$RecoveryTab$RecoveryEventDetail22;
                                collection.add(recoveryTabKt$RecoveryTab$RecoveryEventDetail);
                                anonymousClass1 = this;
                                collection = collection4;
                                it = it3;
                                str11 = str5;
                                repository = repository3;
                                coroutine_suspended = obj2;
                                str12 = str2;
                                if (it.hasNext()) {
                                    return CollectionsKt.sortedWith((List) collection, new Comparator() { // from class: com.example.rungps.ui.tabs.RecoveryTabKt$RecoveryTab$4$1$1$invokeSuspend$$inlined$sortedByDescending$1
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // java.util.Comparator
                                        public final int compare(T t, T t2) {
                                            return ComparisonsKt.compareValues(Long.valueOf(((RecoveryTabKt$RecoveryTab$RecoveryEventDetail) t2).getRemainingMs()), Long.valueOf(((RecoveryTabKt$RecoveryTab$RecoveryEventDetail) t).getRemainingMs()));
                                        }
                                    });
                                }
                            }
                            obj2 = coroutine_suspended;
                            String kind3 = recoveryEventEntity8.getKind();
                            notes = recoveryEventEntity8.getNotes();
                            if (notes == null) {
                            }
                            recoveryTabKt$RecoveryTab$RecoveryEventDetail22 = new RecoveryTabKt$RecoveryTab$RecoveryEventDetail(recoveryEventEntity8, kind3, "Activity log", "Recovery time from estimated training load.", coerceAtLeast);
                            collection4 = collection;
                            repository3 = repository;
                            it3 = it;
                            recoveryTabKt$RecoveryTab$RecoveryEventDetail = recoveryTabKt$RecoveryTab$RecoveryEventDetail22;
                            collection.add(recoveryTabKt$RecoveryTab$RecoveryEventDetail);
                            anonymousClass1 = this;
                            collection = collection4;
                            it = it3;
                            str11 = str5;
                            repository = repository3;
                            coroutine_suspended = obj2;
                            str12 = str2;
                            if (it.hasNext()) {
                            }
                            break;
                        case 71067:
                            if (kind2.equals("GYM")) {
                                long sourceId2 = recoveryEventEntity8.getSourceId();
                                anonymousClass1.L$0 = repository;
                                anonymousClass1.L$1 = str;
                                anonymousClass1.L$2 = collection;
                                anonymousClass1.L$3 = it;
                                anonymousClass1.L$4 = recoveryEventEntity8;
                                anonymousClass1.L$5 = collection;
                                anonymousClass1.L$6 = null;
                                anonymousClass1.J$0 = coerceAtLeast;
                                anonymousClass1.label = 2;
                                obj4 = repository.gymSessionById(sourceId2, anonymousClass1);
                                if (obj4 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                str7 = str;
                                collection6 = collection;
                                collection2 = collection6;
                                it4 = it;
                                repository4 = repository;
                                j2 = coerceAtLeast;
                                recoveryEventEntity2 = recoveryEventEntity8;
                                gymSessionEntity = (GymSessionEntity) obj4;
                                if (gymSessionEntity != null || (templateDayId = gymSessionEntity.getTemplateDayId()) == null) {
                                    str3 = str11;
                                    str2 = str12;
                                    j = j2;
                                    collection3 = collection6;
                                    recoveryEventEntity = recoveryEventEntity2;
                                    repository2 = repository4;
                                    it2 = it4;
                                    str = str7;
                                    str4 = null;
                                    String str1722 = (gymSessionEntity == null && gymSessionEntity.getFreeDay()) ? "Gym · Free day" : str4 == null ? "Gym · " + str4 : "Gym session";
                                    StringBuilder sb322 = new StringBuilder("Gym training load");
                                    if (str4 != null) {
                                        sb322.append(" · " + str4);
                                    }
                                    sb322.append(". Expand for muscle breakdown.");
                                    String sb422 = sb322.toString();
                                    str5 = str3;
                                    Intrinsics.checkNotNullExpressionValue(sb422, str5);
                                    obj2 = coroutine_suspended;
                                    repository3 = repository2;
                                    it3 = it2;
                                    recoveryTabKt$RecoveryTab$RecoveryEventDetail = new RecoveryTabKt$RecoveryTab$RecoveryEventDetail(recoveryEventEntity, str1722, "Logged in Gym tab", sb422, j);
                                    Collection collection1022 = collection2;
                                    collection4 = collection3;
                                    collection = collection1022;
                                    collection.add(recoveryTabKt$RecoveryTab$RecoveryEventDetail);
                                    anonymousClass1 = this;
                                    collection = collection4;
                                    it = it3;
                                    str11 = str5;
                                    repository = repository3;
                                    coroutine_suspended = obj2;
                                    str12 = str2;
                                    if (it.hasNext()) {
                                    }
                                } else {
                                    str3 = str11;
                                    str2 = str12;
                                    long longValue = templateDayId.longValue();
                                    anonymousClass1.L$0 = repository4;
                                    anonymousClass1.L$1 = str7;
                                    anonymousClass1.L$2 = collection6;
                                    anonymousClass1.L$3 = it4;
                                    anonymousClass1.L$4 = recoveryEventEntity2;
                                    anonymousClass1.L$5 = gymSessionEntity;
                                    anonymousClass1.L$6 = collection2;
                                    anonymousClass1.J$0 = j2;
                                    str6 = str7;
                                    anonymousClass1.label = 3;
                                    obj3 = repository4.dayNameForTemplate(longValue, anonymousClass1);
                                    if (obj3 == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    collection5 = collection6;
                                    gymSessionEntity2 = gymSessionEntity;
                                    str4 = (String) obj3;
                                    j = j2;
                                    recoveryEventEntity = recoveryEventEntity2;
                                    repository2 = repository4;
                                    it2 = it4;
                                    collection3 = collection5;
                                    gymSessionEntity = gymSessionEntity2;
                                    str = str6;
                                    String str17222 = (gymSessionEntity == null && gymSessionEntity.getFreeDay()) ? "Gym · Free day" : str4 == null ? "Gym · " + str4 : "Gym session";
                                    StringBuilder sb3222 = new StringBuilder("Gym training load");
                                    if (str4 != null) {
                                    }
                                    sb3222.append(". Expand for muscle breakdown.");
                                    String sb4222 = sb3222.toString();
                                    str5 = str3;
                                    Intrinsics.checkNotNullExpressionValue(sb4222, str5);
                                    obj2 = coroutine_suspended;
                                    repository3 = repository2;
                                    it3 = it2;
                                    recoveryTabKt$RecoveryTab$RecoveryEventDetail = new RecoveryTabKt$RecoveryTab$RecoveryEventDetail(recoveryEventEntity, str17222, "Logged in Gym tab", sb4222, j);
                                    Collection collection10222 = collection2;
                                    collection4 = collection3;
                                    collection = collection10222;
                                    collection.add(recoveryTabKt$RecoveryTab$RecoveryEventDetail);
                                    anonymousClass1 = this;
                                    collection = collection4;
                                    it = it3;
                                    str11 = str5;
                                    repository = repository3;
                                    coroutine_suspended = obj2;
                                    str12 = str2;
                                    if (it.hasNext()) {
                                    }
                                }
                            }
                            obj2 = coroutine_suspended;
                            str2 = str12;
                            str5 = str11;
                            String kind32 = recoveryEventEntity8.getKind();
                            notes = recoveryEventEntity8.getNotes();
                            if (notes == null) {
                            }
                            recoveryTabKt$RecoveryTab$RecoveryEventDetail22 = new RecoveryTabKt$RecoveryTab$RecoveryEventDetail(recoveryEventEntity8, kind32, "Activity log", "Recovery time from estimated training load.", coerceAtLeast);
                            collection4 = collection;
                            repository3 = repository;
                            it3 = it;
                            recoveryTabKt$RecoveryTab$RecoveryEventDetail = recoveryTabKt$RecoveryTab$RecoveryEventDetail22;
                            collection.add(recoveryTabKt$RecoveryTab$RecoveryEventDetail);
                            anonymousClass1 = this;
                            collection = collection4;
                            it = it3;
                            str11 = str5;
                            repository = repository3;
                            coroutine_suspended = obj2;
                            str12 = str2;
                            if (it.hasNext()) {
                            }
                            break;
                        case 81515:
                            break;
                        case 2038753:
                            break;
                        case 626700071:
                            if (kind2.equals("STRAVA_RUN")) {
                                str2 = str12;
                                str5 = str11;
                                String notes4 = recoveryEventEntity8.getNotes();
                                List split$default = notes4 != null ? StringsKt.split$default((CharSequence) notes4, new String[]{" · "}, false, 0, 6, (Object) null) : null;
                                if (split$default == null) {
                                    split$default = CollectionsKt.emptyList();
                                }
                                String str21 = (String) CollectionsKt.getOrNull(split$default, 1);
                                String obj6 = str21 != null ? StringsKt.trim((CharSequence) str21).toString() : null;
                                if (obj6 == null) {
                                    obj6 = "";
                                }
                                String str22 = obj6;
                                if (str22.length() == 0) {
                                    str22 = Intrinsics.areEqual(recoveryEventEntity8.getKind(), "STRAVA_BIKE") ? "Strava ride" : "Strava run";
                                }
                                String str23 = str22;
                                String str24 = (String) CollectionsKt.lastOrNull(split$default);
                                String obj7 = str24 != null ? StringsKt.trim((CharSequence) str24).toString() : null;
                                String str25 = obj7 == null ? "" : obj7;
                                obj2 = coroutine_suspended;
                                String str26 = StringsKt.endsWith(str25, "km", true) ? str23 + " · " + str25 : str23;
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append(Intrinsics.areEqual(recoveryEventEntity8.getKind(), "STRAVA_BIKE") ? "Ride from Strava (distance, duration, speed). " : "Run from Strava (distance, duration, pace). ");
                                String str27 = (String) CollectionsKt.firstOrNull(split$default);
                                if (str27 == null) {
                                }
                                sb6.append("Estimated training load.");
                                String sb7 = sb6.toString();
                                Intrinsics.checkNotNullExpressionValue(sb7, str5);
                                RecoveryTabKt$RecoveryTab$RecoveryEventDetail recoveryTabKt$RecoveryTab$RecoveryEventDetail3 = new RecoveryTabKt$RecoveryTab$RecoveryEventDetail(recoveryEventEntity8, str26, "Strava", sb7, coerceAtLeast);
                                collection4 = collection;
                                repository3 = repository;
                                it3 = it;
                                recoveryTabKt$RecoveryTab$RecoveryEventDetail = recoveryTabKt$RecoveryTab$RecoveryEventDetail3;
                                collection.add(recoveryTabKt$RecoveryTab$RecoveryEventDetail);
                                anonymousClass1 = this;
                                collection = collection4;
                                it = it3;
                                str11 = str5;
                                repository = repository3;
                                coroutine_suspended = obj2;
                                str12 = str2;
                                if (it.hasNext()) {
                                }
                            }
                            obj2 = coroutine_suspended;
                            str2 = str12;
                            str5 = str11;
                            String kind322 = recoveryEventEntity8.getKind();
                            notes = recoveryEventEntity8.getNotes();
                            if (notes == null) {
                            }
                            recoveryTabKt$RecoveryTab$RecoveryEventDetail22 = new RecoveryTabKt$RecoveryTab$RecoveryEventDetail(recoveryEventEntity8, kind322, "Activity log", "Recovery time from estimated training load.", coerceAtLeast);
                            collection4 = collection;
                            repository3 = repository;
                            it3 = it;
                            recoveryTabKt$RecoveryTab$RecoveryEventDetail = recoveryTabKt$RecoveryTab$RecoveryEventDetail22;
                            collection.add(recoveryTabKt$RecoveryTab$RecoveryEventDetail);
                            anonymousClass1 = this;
                            collection = collection4;
                            it = it3;
                            str11 = str5;
                            repository = repository3;
                            coroutine_suspended = obj2;
                            str12 = str2;
                            if (it.hasNext()) {
                            }
                            break;
                        default:
                            obj2 = coroutine_suspended;
                            str2 = str12;
                            str5 = str11;
                            String kind3222 = recoveryEventEntity8.getKind();
                            notes = recoveryEventEntity8.getNotes();
                            if (notes == null) {
                            }
                            recoveryTabKt$RecoveryTab$RecoveryEventDetail22 = new RecoveryTabKt$RecoveryTab$RecoveryEventDetail(recoveryEventEntity8, kind3222, "Activity log", "Recovery time from estimated training load.", coerceAtLeast);
                            collection4 = collection;
                            repository3 = repository;
                            it3 = it;
                            recoveryTabKt$RecoveryTab$RecoveryEventDetail = recoveryTabKt$RecoveryTab$RecoveryEventDetail22;
                            collection.add(recoveryTabKt$RecoveryTab$RecoveryEventDetail);
                            anonymousClass1 = this;
                            collection = collection4;
                            it = it3;
                            str11 = str5;
                            repository = repository3;
                            coroutine_suspended = obj2;
                            str12 = str2;
                            if (it.hasNext()) {
                            }
                            break;
                    }
                }
            }
        }
    }
}
