package com.example.rungps.widget;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.example.rungps.R;
import com.example.rungps.data.AppPreferences;
import com.example.rungps.data.GymDayTemplateEntity;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.GymSetEntity;
import com.example.rungps.data.Repository;
import com.example.rungps.gym.GymRestTimerStore;
import com.example.rungps.health.GymAttendance;
import com.example.rungps.health.GymAttendanceStats;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: GymWidgetUpdater.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/example/rungps/widget/GymWidgetUpdater;", "", "<init>", "()V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "refreshAsync", "", "context", "Landroid/content/Context;", "refresh", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scheduleRestRefresh", "restEndsAtMs", "", "cancelRestRefresh", "restRefreshPendingIntent", "Landroid/app/PendingIntent;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymWidgetUpdater {
    public static final GymWidgetUpdater INSTANCE = new GymWidgetUpdater();
    private static final CoroutineScope scope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()));
    public static final int $stable = 8;

    private GymWidgetUpdater() {
    }

    public final void refreshAsync(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new GymWidgetUpdater$refreshAsync$1(context, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0258 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0459 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object refresh(Context context, Continuation<? super Unit> continuation) {
        GymWidgetUpdater$refresh$1 gymWidgetUpdater$refresh$1;
        int i;
        int i2;
        Repository repository;
        Iterator it;
        Object obj;
        long restEndsAtMs;
        long currentTimeMillis;
        int i3;
        Long gymActiveSplitIdBlocking;
        String str;
        Repository repository2;
        long j;
        long j2;
        Context context2;
        GymDayTemplateEntity gymDayTemplateEntity;
        List list;
        GymSessionEntity gymSessionEntity;
        GymAttendanceStats gymAttendanceStats;
        GymSessionEntity gymSessionEntity2;
        List list2;
        int i4;
        Context context3;
        GymAttendanceStats gymAttendanceStats2;
        GymWidgetUpdater gymWidgetUpdater;
        GymDayTemplateEntity gymDayTemplateEntity2;
        Context context4;
        GymWidgetUpdater gymWidgetUpdater2;
        GymAttendanceStats gymAttendanceStats3;
        List list3;
        GymSessionEntity gymSessionEntity3;
        Repository repository3;
        long j3;
        GymWidgetSessionSnapshot gymWidgetSessionSnapshot;
        long j4;
        GymWidgetUpdater gymWidgetUpdater3;
        int i5;
        GymSessionEntity gymSessionEntity4;
        Repository repository4;
        Object obj2;
        String string;
        String str2;
        String str3;
        String str4;
        String str5;
        int i6;
        int i7;
        String str6;
        String str7;
        String str8;
        int i8;
        String str9;
        int i9;
        GymWidgetUpdater gymWidgetUpdater4;
        GymDayTemplateEntity gymDayTemplateEntity3;
        GymAttendanceStats gymAttendanceStats4;
        int i10;
        String str10;
        String str11;
        int i11;
        GymWidgetSessionSnapshot gymWidgetSessionSnapshot2;
        String str12;
        String string2;
        List<GymSetEntity> list4;
        int i12;
        GymWidgetUpdater gymWidgetUpdater5 = this;
        Context context5 = context;
        if (continuation instanceof GymWidgetUpdater$refresh$1) {
            gymWidgetUpdater$refresh$1 = (GymWidgetUpdater$refresh$1) continuation;
            if ((gymWidgetUpdater$refresh$1.label & Integer.MIN_VALUE) != 0) {
                gymWidgetUpdater$refresh$1.label -= Integer.MIN_VALUE;
                Object obj3 = gymWidgetUpdater$refresh$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = gymWidgetUpdater$refresh$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj3);
                    GymRestTimerStore.INSTANCE.pruneStaleIfExpired(context5);
                    Repository repository5 = Repository.INSTANCE.get(context5);
                    Flow<List<GymSessionEntity>> gymSessionsFlow = repository5.gymSessionsFlow();
                    gymWidgetUpdater$refresh$1.L$0 = gymWidgetUpdater5;
                    gymWidgetUpdater$refresh$1.L$1 = context5;
                    gymWidgetUpdater$refresh$1.L$2 = repository5;
                    i2 = 1;
                    gymWidgetUpdater$refresh$1.label = 1;
                    Object first = FlowKt.first(gymSessionsFlow, gymWidgetUpdater$refresh$1);
                    if (first == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    repository = repository5;
                    obj3 = first;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            i4 = gymWidgetUpdater$refresh$1.I$0;
                            currentTimeMillis = gymWidgetUpdater$refresh$1.J$1;
                            restEndsAtMs = gymWidgetUpdater$refresh$1.J$0;
                            gymAttendanceStats2 = (GymAttendanceStats) gymWidgetUpdater$refresh$1.L$5;
                            list2 = (List) gymWidgetUpdater$refresh$1.L$4;
                            gymSessionEntity2 = (GymSessionEntity) gymWidgetUpdater$refresh$1.L$3;
                            repository = (Repository) gymWidgetUpdater$refresh$1.L$2;
                            context3 = (Context) gymWidgetUpdater$refresh$1.L$1;
                            gymWidgetUpdater = (GymWidgetUpdater) gymWidgetUpdater$refresh$1.L$0;
                            ResultKt.throwOnFailure(obj3);
                            str = "getString(...)";
                            Context context6 = context3;
                            i3 = i4;
                            gymWidgetUpdater5 = gymWidgetUpdater;
                            list = list2;
                            gymAttendanceStats = gymAttendanceStats2;
                            gymDayTemplateEntity = (GymDayTemplateEntity) obj3;
                            gymSessionEntity = gymSessionEntity2;
                            repository2 = repository;
                            j = restEndsAtMs;
                            j2 = currentTimeMillis;
                            context2 = context6;
                            if (gymSessionEntity != null) {
                                GymWidgetSessionSnapshotBuilder gymWidgetSessionSnapshotBuilder = GymWidgetSessionSnapshotBuilder.INSTANCE;
                                gymWidgetUpdater$refresh$1.L$0 = gymWidgetUpdater5;
                                gymWidgetUpdater$refresh$1.L$1 = context2;
                                gymWidgetUpdater$refresh$1.L$2 = repository2;
                                gymWidgetUpdater$refresh$1.L$3 = gymSessionEntity;
                                gymWidgetUpdater$refresh$1.L$4 = list;
                                gymWidgetUpdater$refresh$1.L$5 = gymAttendanceStats;
                                gymWidgetUpdater$refresh$1.L$6 = gymDayTemplateEntity;
                                gymWidgetUpdater$refresh$1.J$0 = j;
                                gymWidgetUpdater$refresh$1.J$1 = j2;
                                gymWidgetUpdater$refresh$1.I$0 = i3;
                                gymWidgetUpdater3 = gymWidgetUpdater5;
                                gymWidgetUpdater$refresh$1.label = 3;
                                Object build = gymWidgetSessionSnapshotBuilder.build(repository2, gymSessionEntity, gymWidgetUpdater$refresh$1);
                                if (build == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                GymSessionEntity gymSessionEntity5 = gymSessionEntity;
                                obj3 = build;
                                i5 = i3;
                                gymSessionEntity4 = gymSessionEntity5;
                                gymDayTemplateEntity2 = gymDayTemplateEntity;
                                gymWidgetUpdater2 = gymWidgetUpdater3;
                                GymSessionEntity gymSessionEntity6 = gymSessionEntity4;
                                i3 = i5;
                                context4 = context2;
                                gymAttendanceStats3 = gymAttendanceStats;
                                list3 = list;
                                gymWidgetSessionSnapshot = (GymWidgetSessionSnapshot) obj3;
                                repository3 = repository2;
                                j4 = j2;
                                j3 = j;
                                gymSessionEntity3 = gymSessionEntity6;
                                if (gymSessionEntity3 == null) {
                                }
                                repository4 = repository3;
                                string = str3;
                                obj2 = coroutine_suspended;
                                str2 = str;
                                if (gymSessionEntity3 == null) {
                                }
                                str4 = str2;
                                str5 = "Next: ";
                                i6 = 0;
                                String str13 = string;
                                int i13 = i6;
                                int computeStreak$default = GymAttendance.computeStreak$default(GymAttendance.INSTANCE, list3, null, 2, null);
                                String computeTrend$default = GymAttendance.computeTrend$default(GymAttendance.INSTANCE, list3, null, 2, null);
                                String daysToGoal = GymAttendance.INSTANCE.daysToGoal(gymAttendanceStats3);
                                if (i3 != 0) {
                                }
                                if (gymSessionEntity3 != null) {
                                }
                                if (gymSessionEntity3 == null) {
                                }
                                GymWidgetProvider.INSTANCE.updateFromApp(context4, str6, string2, gymWidgetSessionSnapshot != null ? gymWidgetSessionSnapshot.getSessionName() : null, gymWidgetSessionSnapshot != null ? gymWidgetSessionSnapshot.getExerciseName() : null, gymWidgetSessionSnapshot != null ? gymWidgetSessionSnapshot.getSetsLeft() : 0, gymWidgetSessionSnapshot != null ? gymWidgetSessionSnapshot.getSuggestionLine() : null, str9, gymAttendanceStats3.getPct(), gymAttendanceStats3.getDaysHit(), gymAttendanceStats3.getWindowDays(), i7, str7, str8, i8 != 0, gymSessionEntity3 != null, gymSessionEntity3 == null && i3 == 0, gymSessionEntity3 != null ? Boxing.boxLong(gymSessionEntity3.getId()) : null);
                                if (i3 != 0) {
                                }
                                return Unit.INSTANCE;
                            }
                            GymWidgetUpdater gymWidgetUpdater6 = gymWidgetUpdater5;
                            gymDayTemplateEntity2 = gymDayTemplateEntity;
                            context4 = context2;
                            gymWidgetUpdater2 = gymWidgetUpdater6;
                            gymAttendanceStats3 = gymAttendanceStats;
                            list3 = list;
                            long j5 = j2;
                            gymSessionEntity3 = gymSessionEntity;
                            repository3 = repository2;
                            j3 = j;
                            gymWidgetSessionSnapshot = null;
                            j4 = j5;
                            if (gymSessionEntity3 == null) {
                            }
                            repository4 = repository3;
                            string = str3;
                            obj2 = coroutine_suspended;
                            str2 = str;
                            if (gymSessionEntity3 == null) {
                            }
                            str4 = str2;
                            str5 = "Next: ";
                            i6 = 0;
                            String str132 = string;
                            int i132 = i6;
                            int computeStreak$default2 = GymAttendance.computeStreak$default(GymAttendance.INSTANCE, list3, null, 2, null);
                            String computeTrend$default2 = GymAttendance.computeTrend$default(GymAttendance.INSTANCE, list3, null, 2, null);
                            String daysToGoal2 = GymAttendance.INSTANCE.daysToGoal(gymAttendanceStats3);
                            if (i3 != 0) {
                            }
                            if (gymSessionEntity3 != null) {
                            }
                            if (gymSessionEntity3 == null) {
                            }
                            GymWidgetProvider.INSTANCE.updateFromApp(context4, str6, string2, gymWidgetSessionSnapshot != null ? gymWidgetSessionSnapshot.getSessionName() : null, gymWidgetSessionSnapshot != null ? gymWidgetSessionSnapshot.getExerciseName() : null, gymWidgetSessionSnapshot != null ? gymWidgetSessionSnapshot.getSetsLeft() : 0, gymWidgetSessionSnapshot != null ? gymWidgetSessionSnapshot.getSuggestionLine() : null, str9, gymAttendanceStats3.getPct(), gymAttendanceStats3.getDaysHit(), gymAttendanceStats3.getWindowDays(), i7, str7, str8, i8 != 0, gymSessionEntity3 != null, gymSessionEntity3 == null && i3 == 0, gymSessionEntity3 != null ? Boxing.boxLong(gymSessionEntity3.getId()) : null);
                            if (i3 != 0) {
                            }
                            return Unit.INSTANCE;
                        }
                        if (i != 3) {
                            if (i != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i14 = gymWidgetUpdater$refresh$1.I$2;
                            int i15 = gymWidgetUpdater$refresh$1.I$1;
                            i11 = gymWidgetUpdater$refresh$1.I$0;
                            j3 = gymWidgetUpdater$refresh$1.J$0;
                            str11 = (String) gymWidgetUpdater$refresh$1.L$8;
                            str10 = (String) gymWidgetUpdater$refresh$1.L$7;
                            str12 = (String) gymWidgetUpdater$refresh$1.L$6;
                            gymWidgetSessionSnapshot2 = (GymWidgetSessionSnapshot) gymWidgetUpdater$refresh$1.L$5;
                            gymDayTemplateEntity3 = (GymDayTemplateEntity) gymWidgetUpdater$refresh$1.L$4;
                            gymAttendanceStats4 = (GymAttendanceStats) gymWidgetUpdater$refresh$1.L$3;
                            gymSessionEntity3 = (GymSessionEntity) gymWidgetUpdater$refresh$1.L$2;
                            context4 = (Context) gymWidgetUpdater$refresh$1.L$1;
                            gymWidgetUpdater4 = (GymWidgetUpdater) gymWidgetUpdater$refresh$1.L$0;
                            ResultKt.throwOnFailure(obj3);
                            str4 = "getString(...)";
                            str5 = "Next: ";
                            i9 = i15;
                            i10 = i14;
                            list4 = (List) obj3;
                            if ((list4 instanceof Collection) || !list4.isEmpty()) {
                                i12 = 0;
                                for (GymSetEntity gymSetEntity : list4) {
                                    Integer reps = gymSetEntity.getReps();
                                    if (((reps != null ? reps.intValue() : 0) > 0 && gymSetEntity.getWeightKg() > 0.0d) && (i12 = i12 + 1) < 0) {
                                        CollectionsKt.throwCountOverflow();
                                    }
                                }
                            } else {
                                i12 = 0;
                            }
                            i7 = i10;
                            str9 = i12 + " sets logged";
                            gymWidgetUpdater2 = gymWidgetUpdater4;
                            str7 = str11;
                            str8 = str10;
                            gymDayTemplateEntity2 = gymDayTemplateEntity3;
                            gymAttendanceStats3 = gymAttendanceStats4;
                            str6 = str12;
                            gymWidgetSessionSnapshot = gymWidgetSessionSnapshot2;
                            i3 = i11;
                            i8 = i9;
                            if (gymSessionEntity3 != null) {
                                if ((gymWidgetSessionSnapshot != null ? Boxing.boxInt(gymWidgetSessionSnapshot.getSetsLeft()) : null) != null && gymWidgetSessionSnapshot.getSetsLeft() > 0) {
                                    string2 = gymWidgetSessionSnapshot.getSetsLeft() + " sets left in session";
                                    GymWidgetProvider.INSTANCE.updateFromApp(context4, str6, string2, gymWidgetSessionSnapshot != null ? gymWidgetSessionSnapshot.getSessionName() : null, gymWidgetSessionSnapshot != null ? gymWidgetSessionSnapshot.getExerciseName() : null, gymWidgetSessionSnapshot != null ? gymWidgetSessionSnapshot.getSetsLeft() : 0, gymWidgetSessionSnapshot != null ? gymWidgetSessionSnapshot.getSuggestionLine() : null, str9, gymAttendanceStats3.getPct(), gymAttendanceStats3.getDaysHit(), gymAttendanceStats3.getWindowDays(), i7, str7, str8, i8 != 0, gymSessionEntity3 != null, gymSessionEntity3 == null && i3 == 0, gymSessionEntity3 != null ? Boxing.boxLong(gymSessionEntity3.getId()) : null);
                                    if (i3 != 0) {
                                        gymWidgetUpdater2.scheduleRestRefresh(context4, j3);
                                    } else {
                                        gymWidgetUpdater2.cancelRestRefresh(context4);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                            if (gymSessionEntity3 == null) {
                                string2 = "Tap to log sets";
                            } else if (i3 != 0) {
                                string2 = "Opens gym when rest ends";
                            } else if (i8 == 0 || gymDayTemplateEntity2 == null) {
                                String str14 = str5;
                                if (i8 != 0) {
                                    string2 = "30-day attendance";
                                } else if (gymDayTemplateEntity2 != null) {
                                    string2 = str14 + gymDayTemplateEntity2.getDayName();
                                } else {
                                    string2 = context4.getString(R.string.gym_widget_tap_hint);
                                    Intrinsics.checkNotNullExpressionValue(string2, str4);
                                }
                            } else {
                                string2 = str5 + gymDayTemplateEntity2.getDayName();
                            }
                            GymWidgetProvider.INSTANCE.updateFromApp(context4, str6, string2, gymWidgetSessionSnapshot != null ? gymWidgetSessionSnapshot.getSessionName() : null, gymWidgetSessionSnapshot != null ? gymWidgetSessionSnapshot.getExerciseName() : null, gymWidgetSessionSnapshot != null ? gymWidgetSessionSnapshot.getSetsLeft() : 0, gymWidgetSessionSnapshot != null ? gymWidgetSessionSnapshot.getSuggestionLine() : null, str9, gymAttendanceStats3.getPct(), gymAttendanceStats3.getDaysHit(), gymAttendanceStats3.getWindowDays(), i7, str7, str8, i8 != 0, gymSessionEntity3 != null, gymSessionEntity3 == null && i3 == 0, gymSessionEntity3 != null ? Boxing.boxLong(gymSessionEntity3.getId()) : null);
                            if (i3 != 0) {
                            }
                            return Unit.INSTANCE;
                        }
                        int i16 = gymWidgetUpdater$refresh$1.I$0;
                        j2 = gymWidgetUpdater$refresh$1.J$1;
                        j = gymWidgetUpdater$refresh$1.J$0;
                        gymDayTemplateEntity = (GymDayTemplateEntity) gymWidgetUpdater$refresh$1.L$6;
                        gymAttendanceStats = (GymAttendanceStats) gymWidgetUpdater$refresh$1.L$5;
                        list = (List) gymWidgetUpdater$refresh$1.L$4;
                        gymSessionEntity4 = (GymSessionEntity) gymWidgetUpdater$refresh$1.L$3;
                        repository2 = (Repository) gymWidgetUpdater$refresh$1.L$2;
                        context2 = (Context) gymWidgetUpdater$refresh$1.L$1;
                        GymWidgetUpdater gymWidgetUpdater7 = (GymWidgetUpdater) gymWidgetUpdater$refresh$1.L$0;
                        ResultKt.throwOnFailure(obj3);
                        gymWidgetUpdater3 = gymWidgetUpdater7;
                        str = "getString(...)";
                        i5 = i16;
                        gymDayTemplateEntity2 = gymDayTemplateEntity;
                        gymWidgetUpdater2 = gymWidgetUpdater3;
                        GymSessionEntity gymSessionEntity62 = gymSessionEntity4;
                        i3 = i5;
                        context4 = context2;
                        gymAttendanceStats3 = gymAttendanceStats;
                        list3 = list;
                        gymWidgetSessionSnapshot = (GymWidgetSessionSnapshot) obj3;
                        repository3 = repository2;
                        j4 = j2;
                        j3 = j;
                        gymSessionEntity3 = gymSessionEntity62;
                        if (gymSessionEntity3 == null) {
                            if (i3 == 0) {
                                if (gymDayTemplateEntity2 == null) {
                                    repository4 = repository3;
                                    obj2 = coroutine_suspended;
                                    string = context4.getString(R.string.gym_widget_label);
                                    str2 = str;
                                    Intrinsics.checkNotNullExpressionValue(string, str2);
                                    if (gymSessionEntity3 == null) {
                                    }
                                    str4 = str2;
                                    str5 = "Next: ";
                                    i6 = 0;
                                    String str1322 = string;
                                    int i1322 = i6;
                                    int computeStreak$default22 = GymAttendance.computeStreak$default(GymAttendance.INSTANCE, list3, null, 2, null);
                                    String computeTrend$default22 = GymAttendance.computeTrend$default(GymAttendance.INSTANCE, list3, null, 2, null);
                                    String daysToGoal22 = GymAttendance.INSTANCE.daysToGoal(gymAttendanceStats3);
                                    if (i3 != 0) {
                                    }
                                    if (gymSessionEntity3 != null) {
                                    }
                                    if (gymSessionEntity3 == null) {
                                    }
                                    GymWidgetProvider.INSTANCE.updateFromApp(context4, str6, string2, gymWidgetSessionSnapshot != null ? gymWidgetSessionSnapshot.getSessionName() : null, gymWidgetSessionSnapshot != null ? gymWidgetSessionSnapshot.getExerciseName() : null, gymWidgetSessionSnapshot != null ? gymWidgetSessionSnapshot.getSetsLeft() : 0, gymWidgetSessionSnapshot != null ? gymWidgetSessionSnapshot.getSuggestionLine() : null, str9, gymAttendanceStats3.getPct(), gymAttendanceStats3.getDaysHit(), gymAttendanceStats3.getWindowDays(), i7, str7, str8, i8 != 0, gymSessionEntity3 != null, gymSessionEntity3 == null && i3 == 0, gymSessionEntity3 != null ? Boxing.boxLong(gymSessionEntity3.getId()) : null);
                                    if (i3 != 0) {
                                    }
                                    return Unit.INSTANCE;
                                }
                                obj2 = coroutine_suspended;
                                repository4 = repository3;
                                string = "Next: " + gymDayTemplateEntity2.getDayName();
                                str2 = str;
                                if (gymSessionEntity3 == null || i3 != 0 || list3.isEmpty()) {
                                    str4 = str2;
                                    str5 = "Next: ";
                                    i6 = 0;
                                } else {
                                    str4 = str2;
                                    str5 = "Next: ";
                                    i6 = 1;
                                }
                                String str13222 = string;
                                int i13222 = i6;
                                int computeStreak$default222 = GymAttendance.computeStreak$default(GymAttendance.INSTANCE, list3, null, 2, null);
                                String computeTrend$default222 = GymAttendance.computeTrend$default(GymAttendance.INSTANCE, list3, null, 2, null);
                                String daysToGoal222 = GymAttendance.INSTANCE.daysToGoal(gymAttendanceStats3);
                                if (i3 != 0) {
                                    int coerceAtLeast = RangesKt.coerceAtLeast((int) ((j3 - j4) / 1000), 0);
                                    String format = String.format("%d:%02d rest left", Arrays.copyOf(new Object[]{Boxing.boxInt(coerceAtLeast / 60), Boxing.boxInt(coerceAtLeast % 60)}, 2));
                                    Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                                    i7 = computeStreak$default222;
                                    str9 = format;
                                    str7 = daysToGoal222;
                                    str8 = computeTrend$default222;
                                    str6 = str13222;
                                    i8 = i13222;
                                } else {
                                    if (gymSessionEntity3 != null) {
                                        if ((gymWidgetSessionSnapshot != null ? gymWidgetSessionSnapshot.getExerciseName() : null) == null) {
                                            long id = gymSessionEntity3.getId();
                                            gymWidgetUpdater$refresh$1.L$0 = gymWidgetUpdater2;
                                            gymWidgetUpdater$refresh$1.L$1 = context4;
                                            gymWidgetUpdater$refresh$1.L$2 = gymSessionEntity3;
                                            gymWidgetUpdater$refresh$1.L$3 = gymAttendanceStats3;
                                            gymWidgetUpdater$refresh$1.L$4 = gymDayTemplateEntity2;
                                            gymWidgetUpdater$refresh$1.L$5 = gymWidgetSessionSnapshot;
                                            gymWidgetUpdater$refresh$1.L$6 = str13222;
                                            gymWidgetUpdater$refresh$1.L$7 = computeTrend$default222;
                                            gymWidgetUpdater$refresh$1.L$8 = daysToGoal222;
                                            gymWidgetUpdater$refresh$1.J$0 = j3;
                                            gymWidgetUpdater$refresh$1.I$0 = i3;
                                            i9 = i13222;
                                            gymWidgetUpdater$refresh$1.I$1 = i9;
                                            Context context7 = context4;
                                            gymWidgetUpdater$refresh$1.I$2 = computeStreak$default222;
                                            gymWidgetUpdater$refresh$1.label = 4;
                                            Object obj4 = repository4.setsForSession(id, gymWidgetUpdater$refresh$1);
                                            Object obj5 = obj2;
                                            if (obj4 == obj5) {
                                                return obj5;
                                            }
                                            gymWidgetUpdater4 = gymWidgetUpdater2;
                                            gymDayTemplateEntity3 = gymDayTemplateEntity2;
                                            gymAttendanceStats4 = gymAttendanceStats3;
                                            i10 = computeStreak$default222;
                                            str10 = computeTrend$default222;
                                            str11 = daysToGoal222;
                                            i11 = i3;
                                            gymWidgetSessionSnapshot2 = gymWidgetSessionSnapshot;
                                            str12 = str13222;
                                            obj3 = obj4;
                                            context4 = context7;
                                            list4 = (List) obj3;
                                            if (list4 instanceof Collection) {
                                            }
                                            i12 = 0;
                                            while (r2.hasNext()) {
                                            }
                                            i7 = i10;
                                            str9 = i12 + " sets logged";
                                            gymWidgetUpdater2 = gymWidgetUpdater4;
                                            str7 = str11;
                                            str8 = str10;
                                            gymDayTemplateEntity2 = gymDayTemplateEntity3;
                                            gymAttendanceStats3 = gymAttendanceStats4;
                                            str6 = str12;
                                            gymWidgetSessionSnapshot = gymWidgetSessionSnapshot2;
                                            i3 = i11;
                                            i8 = i9;
                                        }
                                    }
                                    i7 = computeStreak$default222;
                                    str6 = str13222;
                                    str7 = daysToGoal222;
                                    str8 = computeTrend$default222;
                                    i8 = i13222;
                                    context4 = context4;
                                    str9 = null;
                                }
                                if (gymSessionEntity3 != null) {
                                }
                                if (gymSessionEntity3 == null) {
                                }
                                GymWidgetProvider.INSTANCE.updateFromApp(context4, str6, string2, gymWidgetSessionSnapshot != null ? gymWidgetSessionSnapshot.getSessionName() : null, gymWidgetSessionSnapshot != null ? gymWidgetSessionSnapshot.getExerciseName() : null, gymWidgetSessionSnapshot != null ? gymWidgetSessionSnapshot.getSetsLeft() : 0, gymWidgetSessionSnapshot != null ? gymWidgetSessionSnapshot.getSuggestionLine() : null, str9, gymAttendanceStats3.getPct(), gymAttendanceStats3.getDaysHit(), gymAttendanceStats3.getWindowDays(), i7, str7, str8, i8 != 0, gymSessionEntity3 != null, gymSessionEntity3 == null && i3 == 0, gymSessionEntity3 != null ? Boxing.boxLong(gymSessionEntity3.getId()) : null);
                                if (i3 != 0) {
                                }
                                return Unit.INSTANCE;
                            }
                            str3 = "Rest timer";
                        } else if (gymWidgetSessionSnapshot == null || (str3 = gymWidgetSessionSnapshot.getSessionName()) == null) {
                            str3 = "Gym in progress";
                        }
                        repository4 = repository3;
                        string = str3;
                        obj2 = coroutine_suspended;
                        str2 = str;
                        if (gymSessionEntity3 == null) {
                        }
                        str4 = str2;
                        str5 = "Next: ";
                        i6 = 0;
                        String str132222 = string;
                        int i132222 = i6;
                        int computeStreak$default2222 = GymAttendance.computeStreak$default(GymAttendance.INSTANCE, list3, null, 2, null);
                        String computeTrend$default2222 = GymAttendance.computeTrend$default(GymAttendance.INSTANCE, list3, null, 2, null);
                        String daysToGoal2222 = GymAttendance.INSTANCE.daysToGoal(gymAttendanceStats3);
                        if (i3 != 0) {
                        }
                        if (gymSessionEntity3 != null) {
                        }
                        if (gymSessionEntity3 == null) {
                        }
                        GymWidgetProvider.INSTANCE.updateFromApp(context4, str6, string2, gymWidgetSessionSnapshot != null ? gymWidgetSessionSnapshot.getSessionName() : null, gymWidgetSessionSnapshot != null ? gymWidgetSessionSnapshot.getExerciseName() : null, gymWidgetSessionSnapshot != null ? gymWidgetSessionSnapshot.getSetsLeft() : 0, gymWidgetSessionSnapshot != null ? gymWidgetSessionSnapshot.getSuggestionLine() : null, str9, gymAttendanceStats3.getPct(), gymAttendanceStats3.getDaysHit(), gymAttendanceStats3.getWindowDays(), i7, str7, str8, i8 != 0, gymSessionEntity3 != null, gymSessionEntity3 == null && i3 == 0, gymSessionEntity3 != null ? Boxing.boxLong(gymSessionEntity3.getId()) : null);
                        if (i3 != 0) {
                        }
                        return Unit.INSTANCE;
                    }
                    Repository repository6 = (Repository) gymWidgetUpdater$refresh$1.L$2;
                    context5 = (Context) gymWidgetUpdater$refresh$1.L$1;
                    GymWidgetUpdater gymWidgetUpdater8 = (GymWidgetUpdater) gymWidgetUpdater$refresh$1.L$0;
                    ResultKt.throwOnFailure(obj3);
                    repository = repository6;
                    gymWidgetUpdater5 = gymWidgetUpdater8;
                    i2 = 1;
                }
                List list5 = (List) obj3;
                it = list5.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((GymSessionEntity) obj).getEndedAtMs() == null) {
                        break;
                    }
                }
                GymSessionEntity gymSessionEntity7 = (GymSessionEntity) obj;
                ArrayList arrayList = new ArrayList();
                for (Object obj6 : list5) {
                    if ((((GymSessionEntity) obj6).getEndedAtMs() != null ? i2 : 0) != 0) {
                        arrayList.add(obj6);
                    }
                }
                ArrayList arrayList2 = arrayList;
                GymAttendanceStats compute$default = GymAttendance.compute$default(GymAttendance.INSTANCE, arrayList2, null, 0, 6, null);
                restEndsAtMs = GymRestTimerStore.INSTANCE.restEndsAtMs(context5);
                currentTimeMillis = System.currentTimeMillis();
                i3 = restEndsAtMs <= currentTimeMillis ? i2 : 0;
                gymActiveSplitIdBlocking = AppPreferences.INSTANCE.gymActiveSplitIdBlocking(context5);
                if (gymActiveSplitIdBlocking == null) {
                    str = "getString(...)";
                    long longValue = gymActiveSplitIdBlocking.longValue();
                    gymWidgetUpdater$refresh$1.L$0 = gymWidgetUpdater5;
                    gymWidgetUpdater$refresh$1.L$1 = context5;
                    gymWidgetUpdater$refresh$1.L$2 = repository;
                    gymWidgetUpdater$refresh$1.L$3 = gymSessionEntity7;
                    gymWidgetUpdater$refresh$1.L$4 = arrayList2;
                    gymWidgetUpdater$refresh$1.L$5 = compute$default;
                    gymWidgetUpdater$refresh$1.J$0 = restEndsAtMs;
                    gymWidgetUpdater$refresh$1.J$1 = currentTimeMillis;
                    gymWidgetUpdater$refresh$1.I$0 = i3;
                    GymWidgetUpdater gymWidgetUpdater9 = gymWidgetUpdater5;
                    gymWidgetUpdater$refresh$1.label = 2;
                    Object nextScheduledGymDay = repository.nextScheduledGymDay(longValue, gymWidgetUpdater$refresh$1);
                    if (nextScheduledGymDay == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    gymSessionEntity2 = gymSessionEntity7;
                    list2 = arrayList2;
                    obj3 = nextScheduledGymDay;
                    i4 = i3;
                    context3 = context5;
                    gymAttendanceStats2 = compute$default;
                    gymWidgetUpdater = gymWidgetUpdater9;
                    Context context62 = context3;
                    i3 = i4;
                    gymWidgetUpdater5 = gymWidgetUpdater;
                    list = list2;
                    gymAttendanceStats = gymAttendanceStats2;
                    gymDayTemplateEntity = (GymDayTemplateEntity) obj3;
                    gymSessionEntity = gymSessionEntity2;
                    repository2 = repository;
                    j = restEndsAtMs;
                    j2 = currentTimeMillis;
                    context2 = context62;
                    if (gymSessionEntity != null) {
                    }
                } else {
                    str = "getString(...)";
                    repository2 = repository;
                    j = restEndsAtMs;
                    j2 = currentTimeMillis;
                    context2 = context5;
                    gymDayTemplateEntity = null;
                    list = arrayList2;
                    gymSessionEntity = gymSessionEntity7;
                    gymAttendanceStats = compute$default;
                    if (gymSessionEntity != null) {
                    }
                }
            }
        }
        gymWidgetUpdater$refresh$1 = new GymWidgetUpdater$refresh$1(gymWidgetUpdater5, continuation);
        Object obj32 = gymWidgetUpdater$refresh$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = gymWidgetUpdater$refresh$1.label;
        if (i != 0) {
        }
        List list52 = (List) obj32;
        it = list52.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        GymSessionEntity gymSessionEntity72 = (GymSessionEntity) obj;
        ArrayList arrayList3 = new ArrayList();
        while (r2.hasNext()) {
        }
        ArrayList arrayList22 = arrayList3;
        GymAttendanceStats compute$default2 = GymAttendance.compute$default(GymAttendance.INSTANCE, arrayList22, null, 0, 6, null);
        restEndsAtMs = GymRestTimerStore.INSTANCE.restEndsAtMs(context5);
        currentTimeMillis = System.currentTimeMillis();
        if (restEndsAtMs <= currentTimeMillis) {
        }
        gymActiveSplitIdBlocking = AppPreferences.INSTANCE.gymActiveSplitIdBlocking(context5);
        if (gymActiveSplitIdBlocking == null) {
        }
    }

    public final void scheduleRestRefresh(Context context, long restEndsAtMs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Object systemService = applicationContext.getSystemService(NotificationCompat.CATEGORY_ALARM);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        AlarmManager alarmManager = (AlarmManager) systemService;
        long coerceAtMost = RangesKt.coerceAtMost(System.currentTimeMillis() + 15000, restEndsAtMs + 1000);
        Intrinsics.checkNotNull(applicationContext);
        PendingIntent restRefreshPendingIntent = restRefreshPendingIntent(applicationContext);
        if (Build.VERSION.SDK_INT >= 31 && alarmManager.canScheduleExactAlarms()) {
            alarmManager.setExactAndAllowWhileIdle(0, coerceAtMost, restRefreshPendingIntent);
        } else {
            alarmManager.setAndAllowWhileIdle(0, coerceAtMost, restRefreshPendingIntent);
        }
    }

    public final void cancelRestRefresh(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Object systemService = applicationContext.getSystemService(NotificationCompat.CATEGORY_ALARM);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        Intrinsics.checkNotNull(applicationContext);
        ((AlarmManager) systemService).cancel(restRefreshPendingIntent(applicationContext));
    }

    private final PendingIntent restRefreshPendingIntent(Context context) {
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 8801, new Intent(context, (Class<?>) GymWidgetRefreshReceiver.class), 201326592);
        Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(...)");
        return broadcast;
    }
}
