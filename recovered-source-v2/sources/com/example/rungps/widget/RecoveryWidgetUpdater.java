package com.example.rungps.widget;

import android.content.Context;
import androidx.compose.material3.MenuKt;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.RecoveryEventEntity;
import com.example.rungps.data.Repository;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.recovery.RecoveryModel;
import com.example.rungps.recovery.TrainReadiness;
import com.example.rungps.training.DailyTrainingCoach;
import com.example.rungps.ui.week.CoachBriefLoader;
import com.example.rungps.widget.RecoveryWidgetProvider;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: RecoveryWidgetUpdater.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\bJ\u001e\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002¨\u0006\u0010"}, d2 = {"Lcom/example/rungps/widget/RecoveryWidgetUpdater;", "", "<init>", "()V", "refresh", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "formatLastGym", "", "gymSessions", "", "Lcom/example/rungps/data/GymSessionEntity;", "zone", "Ljava/time/ZoneId;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecoveryWidgetUpdater {
    public static final int $stable = 0;
    public static final RecoveryWidgetUpdater INSTANCE = new RecoveryWidgetUpdater();

    /* compiled from: RecoveryWidgetUpdater.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TrainReadiness.values().length];
            try {
                iArr[TrainReadiness.Ready.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrainReadiness.Caution.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TrainReadiness.Rest.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private RecoveryWidgetUpdater() {
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0177 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0158 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object refresh(Context context, Continuation<? super Unit> continuation) {
        RecoveryWidgetUpdater$refresh$1 recoveryWidgetUpdater$refresh$1;
        Object coroutine_suspended;
        int i;
        Context applicationContext;
        Repository repository;
        long currentTimeMillis;
        ZoneId systemDefault;
        Object allRuns;
        Object first;
        Context context2;
        long j;
        RecoveryWidgetUpdater recoveryWidgetUpdater;
        List list;
        ZoneId zoneId;
        Object obj;
        Repository repository2;
        long j2;
        List<GymSessionEntity> list2;
        Object recoverySince;
        Object first2;
        ZoneId zoneId2;
        Context context3;
        List<GymSessionEntity> list3;
        List list4;
        long j3;
        List list5;
        RecoveryWidgetUpdater recoveryWidgetUpdater2;
        Long l;
        long j4;
        int i2;
        Object load;
        ZoneId zoneId3;
        List<GymSessionEntity> list6;
        RecoveryWidgetUpdater recoveryWidgetUpdater3;
        Context context4;
        Iterator it;
        int i3;
        String str;
        String take;
        RecoveryWidgetUpdater recoveryWidgetUpdater4 = this;
        if (continuation instanceof RecoveryWidgetUpdater$refresh$1) {
            recoveryWidgetUpdater$refresh$1 = (RecoveryWidgetUpdater$refresh$1) continuation;
            if ((recoveryWidgetUpdater$refresh$1.label & Integer.MIN_VALUE) != 0) {
                recoveryWidgetUpdater$refresh$1.label -= Integer.MIN_VALUE;
                RecoveryWidgetUpdater$refresh$1 recoveryWidgetUpdater$refresh$12 = recoveryWidgetUpdater$refresh$1;
                Object obj2 = recoveryWidgetUpdater$refresh$12.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = recoveryWidgetUpdater$refresh$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    applicationContext = context.getApplicationContext();
                    Repository.Companion companion = Repository.INSTANCE;
                    Intrinsics.checkNotNull(applicationContext);
                    repository = companion.get(applicationContext);
                    currentTimeMillis = System.currentTimeMillis();
                    systemDefault = ZoneId.systemDefault();
                    recoveryWidgetUpdater$refresh$12.L$0 = recoveryWidgetUpdater4;
                    recoveryWidgetUpdater$refresh$12.L$1 = applicationContext;
                    recoveryWidgetUpdater$refresh$12.L$2 = repository;
                    recoveryWidgetUpdater$refresh$12.L$3 = systemDefault;
                    recoveryWidgetUpdater$refresh$12.J$0 = currentTimeMillis;
                    recoveryWidgetUpdater$refresh$12.label = 1;
                    allRuns = repository.allRuns(recoveryWidgetUpdater$refresh$12);
                    if (allRuns == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i == 1) {
                    currentTimeMillis = recoveryWidgetUpdater$refresh$12.J$0;
                    ZoneId zoneId4 = (ZoneId) recoveryWidgetUpdater$refresh$12.L$3;
                    repository = (Repository) recoveryWidgetUpdater$refresh$12.L$2;
                    applicationContext = (Context) recoveryWidgetUpdater$refresh$12.L$1;
                    RecoveryWidgetUpdater recoveryWidgetUpdater5 = (RecoveryWidgetUpdater) recoveryWidgetUpdater$refresh$12.L$0;
                    ResultKt.throwOnFailure(obj2);
                    systemDefault = zoneId4;
                    recoveryWidgetUpdater4 = recoveryWidgetUpdater5;
                    allRuns = obj2;
                } else if (i == 2) {
                    long j5 = recoveryWidgetUpdater$refresh$12.J$0;
                    List list7 = (List) recoveryWidgetUpdater$refresh$12.L$4;
                    ZoneId zoneId5 = (ZoneId) recoveryWidgetUpdater$refresh$12.L$3;
                    Repository repository3 = (Repository) recoveryWidgetUpdater$refresh$12.L$2;
                    Context context5 = (Context) recoveryWidgetUpdater$refresh$12.L$1;
                    RecoveryWidgetUpdater recoveryWidgetUpdater6 = (RecoveryWidgetUpdater) recoveryWidgetUpdater$refresh$12.L$0;
                    ResultKt.throwOnFailure(obj2);
                    context2 = context5;
                    zoneId = zoneId5;
                    j = j5;
                    list = list7;
                    recoveryWidgetUpdater = recoveryWidgetUpdater6;
                    repository2 = repository3;
                    obj = obj2;
                    j2 = j;
                    list2 = (List) obj;
                    recoveryWidgetUpdater$refresh$12.L$0 = recoveryWidgetUpdater;
                    recoveryWidgetUpdater$refresh$12.L$1 = context2;
                    recoveryWidgetUpdater$refresh$12.L$2 = repository2;
                    recoveryWidgetUpdater$refresh$12.L$3 = zoneId;
                    recoveryWidgetUpdater$refresh$12.L$4 = list;
                    recoveryWidgetUpdater$refresh$12.L$5 = list2;
                    recoveryWidgetUpdater$refresh$12.J$0 = j2;
                    recoveryWidgetUpdater$refresh$12.label = 3;
                    recoverySince = repository2.recoverySince(j2 - 5184000000L, recoveryWidgetUpdater$refresh$12);
                    if (recoverySince == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    List list8 = (List) recoverySince;
                    Flow<List<SleepEntryEntity>> sleepRecentFlow = repository2.sleepRecentFlow(42);
                    recoveryWidgetUpdater$refresh$12.L$0 = recoveryWidgetUpdater;
                    recoveryWidgetUpdater$refresh$12.L$1 = context2;
                    recoveryWidgetUpdater$refresh$12.L$2 = zoneId;
                    recoveryWidgetUpdater$refresh$12.L$3 = list;
                    recoveryWidgetUpdater$refresh$12.L$4 = list2;
                    recoveryWidgetUpdater$refresh$12.L$5 = list8;
                    recoveryWidgetUpdater$refresh$12.J$0 = j2;
                    recoveryWidgetUpdater$refresh$12.label = 4;
                    first2 = FlowKt.first(sleepRecentFlow, recoveryWidgetUpdater$refresh$12);
                    if (first2 == coroutine_suspended) {
                    }
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            long j6 = recoveryWidgetUpdater$refresh$12.J$0;
                            list4 = (List) recoveryWidgetUpdater$refresh$12.L$4;
                            list6 = (List) recoveryWidgetUpdater$refresh$12.L$3;
                            zoneId3 = (ZoneId) recoveryWidgetUpdater$refresh$12.L$2;
                            Context context6 = (Context) recoveryWidgetUpdater$refresh$12.L$1;
                            recoveryWidgetUpdater3 = (RecoveryWidgetUpdater) recoveryWidgetUpdater$refresh$12.L$0;
                            ResultKt.throwOnFailure(obj2);
                            j4 = j6;
                            context4 = context6;
                            i2 = 1;
                            load = obj2;
                            l = null;
                            DailyTrainingCoach.DailyCoachBrief brief = ((CoachBriefLoader.Loaded) load).getBrief();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj3 : list4) {
                                if (((RecoveryEventEntity) obj3).getEndsAtMs() > j4) {
                                    arrayList.add(obj3);
                                }
                            }
                            ArrayList arrayList2 = arrayList;
                            it = arrayList2.iterator();
                            if (it.hasNext()) {
                                l = Boxing.boxLong(((RecoveryEventEntity) it.next()).getEndsAtMs());
                                while (it.hasNext()) {
                                    Long boxLong = Boxing.boxLong(((RecoveryEventEntity) it.next()).getEndsAtMs());
                                    if (l.compareTo(boxLong) < 0) {
                                        l = boxLong;
                                    }
                                }
                            }
                            Long l2 = l;
                            String str2 = !arrayList2.isEmpty() ? "No active recovery window" : "Recovery " + RecoveryModel.INSTANCE.formatRemaining((l2 == null ? l2.longValue() : j4) - j4) + " left";
                            i3 = WhenMappings.$EnumSwitchMapping$0[brief.getReadiness().ordinal()];
                            if (i3 != i2) {
                                str = "Ready";
                            } else if (i3 == 2) {
                                str = "Caution";
                            } else {
                                if (i3 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                str = "Rest day";
                            }
                            String str3 = str;
                            take = StringsKt.take(brief.getSummary(), MenuKt.InTransitionDuration);
                            if (StringsKt.isBlank(take)) {
                                take = StringsKt.take(brief.getHeadline(), MenuKt.InTransitionDuration);
                            }
                            Intrinsics.checkNotNull(zoneId3);
                            String formatLastGym = recoveryWidgetUpdater3.formatLastGym(list6, zoneId3);
                            RecoveryWidgetProvider.Companion companion2 = RecoveryWidgetProvider.INSTANCE;
                            Intrinsics.checkNotNull(context4);
                            companion2.updateFromApp(context4, take, str2, str3, brief.getReadiness(), formatLastGym, !arrayList2.isEmpty());
                            return Unit.INSTANCE;
                        }
                        long j7 = recoveryWidgetUpdater$refresh$12.J$0;
                        list4 = (List) recoveryWidgetUpdater$refresh$12.L$5;
                        List<GymSessionEntity> list9 = (List) recoveryWidgetUpdater$refresh$12.L$4;
                        list5 = (List) recoveryWidgetUpdater$refresh$12.L$3;
                        ZoneId zoneId6 = (ZoneId) recoveryWidgetUpdater$refresh$12.L$2;
                        Context context7 = (Context) recoveryWidgetUpdater$refresh$12.L$1;
                        RecoveryWidgetUpdater recoveryWidgetUpdater7 = (RecoveryWidgetUpdater) recoveryWidgetUpdater$refresh$12.L$0;
                        ResultKt.throwOnFailure(obj2);
                        j3 = j7;
                        recoveryWidgetUpdater2 = recoveryWidgetUpdater7;
                        first2 = obj2;
                        list3 = list9;
                        zoneId2 = zoneId6;
                        context3 = context7;
                        CoachBriefLoader coachBriefLoader = CoachBriefLoader.INSTANCE;
                        Intrinsics.checkNotNull(context3);
                        recoveryWidgetUpdater$refresh$12.L$0 = recoveryWidgetUpdater2;
                        recoveryWidgetUpdater$refresh$12.L$1 = context3;
                        recoveryWidgetUpdater$refresh$12.L$2 = zoneId2;
                        recoveryWidgetUpdater$refresh$12.L$3 = list3;
                        recoveryWidgetUpdater$refresh$12.L$4 = list4;
                        l = null;
                        recoveryWidgetUpdater$refresh$12.L$5 = null;
                        recoveryWidgetUpdater$refresh$12.J$0 = j3;
                        recoveryWidgetUpdater$refresh$12.label = 5;
                        RecoveryWidgetUpdater recoveryWidgetUpdater8 = recoveryWidgetUpdater2;
                        Context context8 = context3;
                        ZoneId zoneId7 = zoneId2;
                        List<GymSessionEntity> list10 = list3;
                        j4 = j3;
                        i2 = 1;
                        load = coachBriefLoader.load(context3, list5, list3, list4, (List) first2, (r17 & 32) != 0 ? ZoneId.systemDefault() : null, recoveryWidgetUpdater$refresh$12);
                        if (load != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        zoneId3 = zoneId7;
                        list6 = list10;
                        recoveryWidgetUpdater3 = recoveryWidgetUpdater8;
                        context4 = context8;
                        DailyTrainingCoach.DailyCoachBrief brief2 = ((CoachBriefLoader.Loaded) load).getBrief();
                        ArrayList arrayList3 = new ArrayList();
                        while (r0.hasNext()) {
                        }
                        ArrayList arrayList22 = arrayList3;
                        it = arrayList22.iterator();
                        if (it.hasNext()) {
                        }
                        Long l22 = l;
                        String str22 = !arrayList22.isEmpty() ? "No active recovery window" : "Recovery " + RecoveryModel.INSTANCE.formatRemaining((l22 == null ? l22.longValue() : j4) - j4) + " left";
                        i3 = WhenMappings.$EnumSwitchMapping$0[brief2.getReadiness().ordinal()];
                        if (i3 != i2) {
                        }
                        String str32 = str;
                        take = StringsKt.take(brief2.getSummary(), MenuKt.InTransitionDuration);
                        if (StringsKt.isBlank(take)) {
                        }
                        Intrinsics.checkNotNull(zoneId3);
                        String formatLastGym2 = recoveryWidgetUpdater3.formatLastGym(list6, zoneId3);
                        RecoveryWidgetProvider.Companion companion22 = RecoveryWidgetProvider.INSTANCE;
                        Intrinsics.checkNotNull(context4);
                        companion22.updateFromApp(context4, take, str22, str32, brief2.getReadiness(), formatLastGym2, !arrayList22.isEmpty());
                        return Unit.INSTANCE;
                    }
                    j2 = recoveryWidgetUpdater$refresh$12.J$0;
                    list2 = (List) recoveryWidgetUpdater$refresh$12.L$5;
                    list = (List) recoveryWidgetUpdater$refresh$12.L$4;
                    zoneId = (ZoneId) recoveryWidgetUpdater$refresh$12.L$3;
                    repository2 = (Repository) recoveryWidgetUpdater$refresh$12.L$2;
                    context2 = (Context) recoveryWidgetUpdater$refresh$12.L$1;
                    recoveryWidgetUpdater = (RecoveryWidgetUpdater) recoveryWidgetUpdater$refresh$12.L$0;
                    ResultKt.throwOnFailure(obj2);
                    recoverySince = obj2;
                    List list82 = (List) recoverySince;
                    Flow<List<SleepEntryEntity>> sleepRecentFlow2 = repository2.sleepRecentFlow(42);
                    recoveryWidgetUpdater$refresh$12.L$0 = recoveryWidgetUpdater;
                    recoveryWidgetUpdater$refresh$12.L$1 = context2;
                    recoveryWidgetUpdater$refresh$12.L$2 = zoneId;
                    recoveryWidgetUpdater$refresh$12.L$3 = list;
                    recoveryWidgetUpdater$refresh$12.L$4 = list2;
                    recoveryWidgetUpdater$refresh$12.L$5 = list82;
                    recoveryWidgetUpdater$refresh$12.J$0 = j2;
                    recoveryWidgetUpdater$refresh$12.label = 4;
                    first2 = FlowKt.first(sleepRecentFlow2, recoveryWidgetUpdater$refresh$12);
                    if (first2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    zoneId2 = zoneId;
                    context3 = context2;
                    list3 = list2;
                    list4 = list82;
                    j3 = j2;
                    list5 = list;
                    recoveryWidgetUpdater2 = recoveryWidgetUpdater;
                    CoachBriefLoader coachBriefLoader2 = CoachBriefLoader.INSTANCE;
                    Intrinsics.checkNotNull(context3);
                    recoveryWidgetUpdater$refresh$12.L$0 = recoveryWidgetUpdater2;
                    recoveryWidgetUpdater$refresh$12.L$1 = context3;
                    recoveryWidgetUpdater$refresh$12.L$2 = zoneId2;
                    recoveryWidgetUpdater$refresh$12.L$3 = list3;
                    recoveryWidgetUpdater$refresh$12.L$4 = list4;
                    l = null;
                    recoveryWidgetUpdater$refresh$12.L$5 = null;
                    recoveryWidgetUpdater$refresh$12.J$0 = j3;
                    recoveryWidgetUpdater$refresh$12.label = 5;
                    RecoveryWidgetUpdater recoveryWidgetUpdater82 = recoveryWidgetUpdater2;
                    Context context82 = context3;
                    ZoneId zoneId72 = zoneId2;
                    List<GymSessionEntity> list102 = list3;
                    j4 = j3;
                    i2 = 1;
                    load = coachBriefLoader2.load(context3, list5, list3, list4, (List) first2, (r17 & 32) != 0 ? ZoneId.systemDefault() : null, recoveryWidgetUpdater$refresh$12);
                    if (load != coroutine_suspended) {
                    }
                }
                List list11 = (List) allRuns;
                Flow<List<GymSessionEntity>> gymSessionsFlow = repository.gymSessionsFlow();
                recoveryWidgetUpdater$refresh$12.L$0 = recoveryWidgetUpdater4;
                recoveryWidgetUpdater$refresh$12.L$1 = applicationContext;
                recoveryWidgetUpdater$refresh$12.L$2 = repository;
                recoveryWidgetUpdater$refresh$12.L$3 = systemDefault;
                recoveryWidgetUpdater$refresh$12.L$4 = list11;
                recoveryWidgetUpdater$refresh$12.J$0 = currentTimeMillis;
                recoveryWidgetUpdater$refresh$12.label = 2;
                first = FlowKt.first(gymSessionsFlow, recoveryWidgetUpdater$refresh$12);
                if (first != coroutine_suspended) {
                    return coroutine_suspended;
                }
                context2 = applicationContext;
                j = currentTimeMillis;
                recoveryWidgetUpdater = recoveryWidgetUpdater4;
                list = list11;
                zoneId = systemDefault;
                obj = first;
                repository2 = repository;
                j2 = j;
                list2 = (List) obj;
                recoveryWidgetUpdater$refresh$12.L$0 = recoveryWidgetUpdater;
                recoveryWidgetUpdater$refresh$12.L$1 = context2;
                recoveryWidgetUpdater$refresh$12.L$2 = repository2;
                recoveryWidgetUpdater$refresh$12.L$3 = zoneId;
                recoveryWidgetUpdater$refresh$12.L$4 = list;
                recoveryWidgetUpdater$refresh$12.L$5 = list2;
                recoveryWidgetUpdater$refresh$12.J$0 = j2;
                recoveryWidgetUpdater$refresh$12.label = 3;
                recoverySince = repository2.recoverySince(j2 - 5184000000L, recoveryWidgetUpdater$refresh$12);
                if (recoverySince == coroutine_suspended) {
                }
                List list822 = (List) recoverySince;
                Flow<List<SleepEntryEntity>> sleepRecentFlow22 = repository2.sleepRecentFlow(42);
                recoveryWidgetUpdater$refresh$12.L$0 = recoveryWidgetUpdater;
                recoveryWidgetUpdater$refresh$12.L$1 = context2;
                recoveryWidgetUpdater$refresh$12.L$2 = zoneId;
                recoveryWidgetUpdater$refresh$12.L$3 = list;
                recoveryWidgetUpdater$refresh$12.L$4 = list2;
                recoveryWidgetUpdater$refresh$12.L$5 = list822;
                recoveryWidgetUpdater$refresh$12.J$0 = j2;
                recoveryWidgetUpdater$refresh$12.label = 4;
                first2 = FlowKt.first(sleepRecentFlow22, recoveryWidgetUpdater$refresh$12);
                if (first2 == coroutine_suspended) {
                }
            }
        }
        recoveryWidgetUpdater$refresh$1 = new RecoveryWidgetUpdater$refresh$1(recoveryWidgetUpdater4, continuation);
        RecoveryWidgetUpdater$refresh$1 recoveryWidgetUpdater$refresh$122 = recoveryWidgetUpdater$refresh$1;
        Object obj22 = recoveryWidgetUpdater$refresh$122.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = recoveryWidgetUpdater$refresh$122.label;
        if (i != 0) {
        }
        List list112 = (List) allRuns;
        Flow<List<GymSessionEntity>> gymSessionsFlow2 = repository.gymSessionsFlow();
        recoveryWidgetUpdater$refresh$122.L$0 = recoveryWidgetUpdater4;
        recoveryWidgetUpdater$refresh$122.L$1 = applicationContext;
        recoveryWidgetUpdater$refresh$122.L$2 = repository;
        recoveryWidgetUpdater$refresh$122.L$3 = systemDefault;
        recoveryWidgetUpdater$refresh$122.L$4 = list112;
        recoveryWidgetUpdater$refresh$122.J$0 = currentTimeMillis;
        recoveryWidgetUpdater$refresh$122.label = 2;
        first = FlowKt.first(gymSessionsFlow2, recoveryWidgetUpdater$refresh$122);
        if (first != coroutine_suspended) {
        }
    }

    private final String formatLastGym(List<GymSessionEntity> gymSessions, ZoneId zone) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : gymSessions) {
            if (((GymSessionEntity) obj2).getEndedAtMs() != null) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                Long endedAtMs = ((GymSessionEntity) next).getEndedAtMs();
                long longValue = endedAtMs != null ? endedAtMs.longValue() : 0L;
                do {
                    Object next2 = it.next();
                    Long endedAtMs2 = ((GymSessionEntity) next2).getEndedAtMs();
                    long longValue2 = endedAtMs2 != null ? endedAtMs2.longValue() : 0L;
                    if (longValue < longValue2) {
                        next = next2;
                        longValue = longValue2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        GymSessionEntity gymSessionEntity = (GymSessionEntity) obj;
        if (gymSessionEntity == null) {
            return "";
        }
        Long endedAtMs3 = gymSessionEntity.getEndedAtMs();
        Intrinsics.checkNotNull(endedAtMs3);
        long between = ChronoUnit.DAYS.between(Instant.ofEpochMilli(endedAtMs3.longValue()).atZone(zone).toLocalDate(), LocalDate.now(zone));
        if (between == 0) {
            return "Last gym: today";
        }
        if (between == 1) {
            return "Last gym: yesterday";
        }
        return "Last gym: " + between + "d ago";
    }
}
