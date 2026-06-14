package com.example.rungps.sync;

import android.content.Context;
import androidx.autofill.HintConstants;
import androidx.compose.material3.MenuKt;
import com.example.rungps.sleep.SleepScience;
import com.example.rungps.sync.PublicSharePublisher;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.SetOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.tasks.TasksKt;

/* compiled from: PublicSharePublisher.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/example/rungps/sync/PublicSharePublisher$PublishResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sync.PublicSharePublisher$publishSummary$2", f = "PublicSharePublisher.kt", i = {0}, l = {SleepScience.CYCLE_TYPICAL_MIN}, m = "invokeSuspend", n = {"token"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class PublicSharePublisher$publishSummary$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PublicSharePublisher.PublishResult>, Object> {
    final /* synthetic */ String $coachHeadline;
    final /* synthetic */ int $combinedLoad;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $displayName;
    final /* synthetic */ String $gymAttendanceLabel;
    final /* synthetic */ Integer $gymAttendancePct;
    final /* synthetic */ String $gymLastSession;
    final /* synthetic */ List<Map<String, Object>> $gymMuscleTop;
    final /* synthetic */ Integer $gymSessions7d;
    final /* synthetic */ Integer $gymSets7d;
    final /* synthetic */ List<Map<String, Object>> $gymWeeklyBars;
    final /* synthetic */ String $readiness;
    final /* synthetic */ Integer $restingHrBpm;
    final /* synthetic */ double $runKm7d;
    final /* synthetic */ Double $sleepAvgHours;
    final /* synthetic */ List<Triple<String, Double, Double>> $topPrs;
    final /* synthetic */ double $weeklyGymKg;
    Object L$0;
    int label;

    /* compiled from: PublicSharePublisher.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FirebaseFirestoreException.Code.values().length];
            try {
                iArr[FirebaseFirestoreException.Code.PERMISSION_DENIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FirebaseFirestoreException.Code.UNAVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PublicSharePublisher$publishSummary$2(Context context, List<Triple<String, Double, Double>> list, String str, int i, double d, double d2, String str2, String str3, Double d3, Integer num, Integer num2, Integer num3, String str4, Integer num4, List<? extends Map<String, ? extends Object>> list2, List<? extends Map<String, ? extends Object>> list3, String str5, Continuation<? super PublicSharePublisher$publishSummary$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$topPrs = list;
        this.$displayName = str;
        this.$combinedLoad = i;
        this.$weeklyGymKg = d;
        this.$runKm7d = d2;
        this.$coachHeadline = str2;
        this.$readiness = str3;
        this.$sleepAvgHours = d3;
        this.$restingHrBpm = num;
        this.$gymSessions7d = num2;
        this.$gymSets7d = num3;
        this.$gymAttendanceLabel = str4;
        this.$gymAttendancePct = num4;
        this.$gymMuscleTop = list2;
        this.$gymWeeklyBars = list3;
        this.$gymLastSession = str5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PublicSharePublisher$publishSummary$2(this.$context, this.$topPrs, this.$displayName, this.$combinedLoad, this.$weeklyGymKg, this.$runKm7d, this.$coachHeadline, this.$readiness, this.$sleepAvgHours, this.$restingHrBpm, this.$gymSessions7d, this.$gymSets7d, this.$gymAttendanceLabel, this.$gymAttendancePct, this.$gymMuscleTop, this.$gymWeeklyBars, this.$gymLastSession, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PublicSharePublisher.PublishResult> continuation) {
        return ((PublicSharePublisher$publishSummary$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x011d A[Catch: Exception -> 0x0019, FirebaseFirestoreException -> 0x001c, TryCatch #2 {FirebaseFirestoreException -> 0x001c, Exception -> 0x0019, blocks: (B:6:0x0014, B:7:0x038a, B:17:0x003c, B:19:0x0046, B:20:0x0065, B:21:0x007c, B:23:0x008d, B:25:0x00b3, B:27:0x00b9, B:29:0x00bf, B:34:0x00ca, B:37:0x00e6, B:39:0x011d, B:45:0x0125, B:48:0x0154, B:50:0x01c6, B:52:0x01d2, B:54:0x01d8, B:58:0x01e5, B:60:0x01ea, B:62:0x01ee, B:64:0x01fa, B:66:0x0202, B:70:0x020f, B:72:0x0214, B:74:0x0218, B:76:0x0225, B:82:0x0233, B:84:0x024a, B:86:0x024e, B:92:0x0261, B:94:0x0270, B:96:0x0274, B:100:0x0281, B:102:0x0290, B:104:0x0294, B:108:0x02a1, B:110:0x02b0, B:112:0x02b4, B:114:0x02c0, B:116:0x02c8, B:120:0x02d5, B:122:0x02da, B:124:0x02de, B:130:0x02ef, B:132:0x02fe, B:134:0x0302, B:138:0x030f, B:140:0x031a, B:142:0x031e, B:146:0x032b, B:148:0x0336, B:150:0x033a, B:152:0x0346, B:154:0x034c, B:158:0x0359, B:160:0x035e), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0120 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PublicSharePublisher.PublishResult publishResult;
        String str;
        String str2;
        String str3;
        String obj2;
        String take;
        String obj3;
        String take2;
        String obj4;
        String take3;
        String obj5;
        String take4;
        Map map;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
                if (currentUser == null) {
                    return new PublicSharePublisher.PublishResult(null, "Sign in under Gym → More first");
                }
                String existingToken = PublicSharePublisher.INSTANCE.existingToken(this.$context);
                if (existingToken == null) {
                    String uuid = UUID.randomUUID().toString();
                    Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                    existingToken = StringsKt.take(StringsKt.replace$default(uuid, "-", "", false, 4, (Object) null), 16);
                }
                List take5 = CollectionsKt.take(this.$topPrs, 8);
                ArrayList arrayList = new ArrayList();
                Iterator it = take5.iterator();
                while (true) {
                    str2 = existingToken;
                    if (!it.hasNext()) {
                        break;
                    }
                    Triple triple = (Triple) it.next();
                    String str4 = (String) triple.component1();
                    double doubleValue = ((Number) triple.component2()).doubleValue();
                    double doubleValue2 = ((Number) triple.component3()).doubleValue();
                    if (!Double.isInfinite(doubleValue) && !Double.isNaN(doubleValue) && !Double.isInfinite(doubleValue2) && !Double.isNaN(doubleValue2) && doubleValue >= 0.0d) {
                        Pair[] pairArr = new Pair[3];
                        String take6 = StringsKt.take(StringsKt.trim((CharSequence) str4).toString(), 80);
                        if (take6.length() == 0) {
                            take6 = "Lift";
                        }
                        pairArr[0] = TuplesKt.to(HintConstants.AUTOFILL_HINT_NAME, take6);
                        double d = 10;
                        pairArr[1] = TuplesKt.to("kg", Boxing.boxDouble(MathKt.roundToInt(doubleValue * d) / 10.0d));
                        pairArr[2] = TuplesKt.to("e1rm", Boxing.boxDouble(MathKt.roundToInt(doubleValue2 * d) / 10.0d));
                        map = MapsKt.mapOf(pairArr);
                        if (map == null) {
                            arrayList.add(map);
                        }
                        existingToken = str2;
                    }
                    map = null;
                    if (map == null) {
                    }
                    existingToken = str2;
                }
                ArrayList arrayList2 = arrayList;
                Pair[] pairArr2 = new Pair[7];
                pairArr2[0] = TuplesKt.to("ownerUid", currentUser.getUid());
                String take7 = StringsKt.take(StringsKt.trim((CharSequence) this.$displayName).toString(), 60);
                if (take7.length() == 0) {
                    take7 = "Athlete";
                }
                pairArr2[1] = TuplesKt.to("displayName", take7);
                pairArr2[2] = TuplesKt.to("updatedAtMs", Boxing.boxLong(System.currentTimeMillis()));
                pairArr2[3] = TuplesKt.to("combinedLoad", Boxing.boxInt(RangesKt.coerceIn(this.$combinedLoad, 0, 100)));
                pairArr2[4] = TuplesKt.to("weeklyGymKg", Boxing.boxInt(MathKt.roundToInt(RangesKt.coerceAtLeast(this.$weeklyGymKg, 0.0d))));
                double d2 = 10;
                pairArr2[5] = TuplesKt.to("runKm7d", Boxing.boxDouble(MathKt.roundToInt(RangesKt.coerceAtLeast(this.$runKm7d, 0.0d) * d2) / 10.0d));
                pairArr2[6] = TuplesKt.to("topPrs", arrayList2);
                Map mutableMapOf = MapsKt.mutableMapOf(pairArr2);
                String str5 = this.$coachHeadline;
                if (str5 != null && (obj5 = StringsKt.trim((CharSequence) str5).toString()) != null && (take4 = StringsKt.take(obj5, MenuKt.InTransitionDuration)) != null) {
                    if (take4.length() <= 0) {
                        take4 = null;
                    }
                    if (take4 != null) {
                        mutableMapOf.put("coachHeadline", take4);
                    }
                }
                String str6 = this.$readiness;
                if (str6 != null && (obj4 = StringsKt.trim((CharSequence) str6).toString()) != null && (take3 = StringsKt.take(obj4, 24)) != null) {
                    if (take3.length() <= 0) {
                        take3 = null;
                    }
                    if (take3 != null) {
                        mutableMapOf.put("readiness", take3);
                    }
                }
                Double d3 = this.$sleepAvgHours;
                if (d3 != null) {
                    double doubleValue3 = d3.doubleValue();
                    if (Double.isInfinite(doubleValue3) || Double.isNaN(doubleValue3) || doubleValue3 <= 0.0d) {
                        d3 = null;
                    }
                    if (d3 != null) {
                        mutableMapOf.put("sleepAvgHours", Boxing.boxDouble(MathKt.roundToInt(d3.doubleValue() * d2) / 10.0d));
                    }
                }
                Integer num = this.$restingHrBpm;
                if (num != null) {
                    int intValue = num.intValue();
                    if (35 > intValue || intValue >= 121) {
                        num = null;
                    }
                    if (num != null) {
                        mutableMapOf.put("restingHrBpm", Boxing.boxInt(num.intValue()));
                    }
                }
                Integer num2 = this.$gymSessions7d;
                if (num2 != null) {
                    if (num2.intValue() < 0) {
                        num2 = null;
                    }
                    if (num2 != null) {
                        mutableMapOf.put("gymSessions7d", Boxing.boxInt(num2.intValue()));
                    }
                }
                Integer num3 = this.$gymSets7d;
                if (num3 != null) {
                    if (num3.intValue() < 0) {
                        num3 = null;
                    }
                    if (num3 != null) {
                        mutableMapOf.put("gymSets7d", Boxing.boxInt(num3.intValue()));
                    }
                }
                String str7 = this.$gymAttendanceLabel;
                if (str7 != null && (obj3 = StringsKt.trim((CharSequence) str7).toString()) != null && (take2 = StringsKt.take(obj3, 80)) != null) {
                    if (take2.length() <= 0) {
                        take2 = null;
                    }
                    if (take2 != null) {
                        mutableMapOf.put("gymAttendanceLabel", take2);
                    }
                }
                Integer num4 = this.$gymAttendancePct;
                if (num4 != null) {
                    int intValue2 = num4.intValue();
                    if (intValue2 < 0 || intValue2 >= 101) {
                        num4 = null;
                    }
                    if (num4 != null) {
                        mutableMapOf.put("gymAttendancePct", Boxing.boxInt(num4.intValue()));
                    }
                }
                List<Map<String, Object>> list = this.$gymMuscleTop;
                if (list != null) {
                    if (list.isEmpty()) {
                        list = null;
                    }
                    if (list != null) {
                        mutableMapOf.put("gymMuscleTop", CollectionsKt.take(list, 6));
                    }
                }
                List<Map<String, Object>> list2 = this.$gymWeeklyBars;
                if (list2 != null) {
                    if (list2.isEmpty()) {
                        list2 = null;
                    }
                    if (list2 != null) {
                        mutableMapOf.put("gymWeeklyBars", CollectionsKt.take(list2, 4));
                    }
                }
                String str8 = this.$gymLastSession;
                if (str8 != null && (obj2 = StringsKt.trim((CharSequence) str8).toString()) != null && (take = StringsKt.take(obj2, MenuKt.InTransitionDuration)) != null) {
                    if (take.length() <= 0) {
                        take = null;
                    }
                    if (take != null) {
                        mutableMapOf.put("gymLastSession", take);
                    }
                }
                Task<Void> task = FirebaseFirestore.getInstance().collection("publicShares").document(str2).set(mutableMapOf, SetOptions.merge());
                Intrinsics.checkNotNullExpressionValue(task, "set(...)");
                this.L$0 = str2;
                this.label = 1;
                if (TasksKt.await(task, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str3 = str2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str3 = (String) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            this.$context.getSharedPreferences("public_share", 0).edit().putString("share_token", str3).apply();
            return new PublicSharePublisher.PublishResult(str3, null);
        } catch (FirebaseFirestoreException e) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[e.getCode().ordinal()];
            if (i2 == 1) {
                str = "Firestore blocked publish — rules may need deploying";
            } else if (i2 != 2) {
                str = e.getMessage();
                if (str == null) {
                    str = "Firestore error";
                }
            } else {
                str = "Offline — connect and try again";
            }
            publishResult = new PublicSharePublisher.PublishResult(null, str);
            return publishResult;
        } catch (Exception e2) {
            String message = e2.getMessage();
            if (message == null) {
                message = "Publish failed";
            }
            publishResult = new PublicSharePublisher.PublishResult(null, message);
            return publishResult;
        }
    }
}
