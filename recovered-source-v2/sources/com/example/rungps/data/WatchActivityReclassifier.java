package com.example.rungps.data;

import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.data.repo.RunRepository;
import com.example.rungps.data.repo.SoccerRepository;
import com.example.rungps.tracking.ActivityTypes;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: WatchActivityReclassifier.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/example/rungps/data/WatchActivityReclassifier;", "", "runRepo", "Lcom/example/rungps/data/repo/RunRepository;", "soccerRepo", "Lcom/example/rungps/data/repo/SoccerRepository;", "sportLabel", "Lkotlin/Function0;", "", "<init>", "(Lcom/example/rungps/data/repo/RunRepository;Lcom/example/rungps/data/repo/SoccerRepository;Lkotlin/jvm/functions/Function0;)V", "moveRunToSoccer", "Lcom/example/rungps/data/WatchActivityReclassifier$Result;", "runId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "moveSoccerToRun", "sessionId", "intensityFromHr", "", "hrAvg", "(Ljava/lang/Integer;)I", "Result", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WatchActivityReclassifier {
    public static final int $stable = 0;
    private final RunRepository runRepo;
    private final SoccerRepository soccerRepo;
    private final Function0<String> sportLabel;

    public WatchActivityReclassifier(RunRepository runRepo, SoccerRepository soccerRepo, Function0<String> sportLabel) {
        Intrinsics.checkNotNullParameter(runRepo, "runRepo");
        Intrinsics.checkNotNullParameter(soccerRepo, "soccerRepo");
        Intrinsics.checkNotNullParameter(sportLabel, "sportLabel");
        this.runRepo = runRepo;
        this.soccerRepo = soccerRepo;
        this.sportLabel = sportLabel;
    }

    /* compiled from: WatchActivityReclassifier.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/example/rungps/data/WatchActivityReclassifier$Result;", "", "<init>", "()V", "Ok", "Err", "Lcom/example/rungps/data/WatchActivityReclassifier$Result$Err;", "Lcom/example/rungps/data/WatchActivityReclassifier$Result$Ok;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Result {
        public static final int $stable = 0;

        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: WatchActivityReclassifier.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/example/rungps/data/WatchActivityReclassifier$Result$Ok;", "Lcom/example/rungps/data/WatchActivityReclassifier$Result;", "newId", "", "message", "", "<init>", "(JLjava/lang/String;)V", "getNewId", "()J", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "", "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Ok extends Result {
            public static final int $stable = 0;
            private final String message;
            private final long newId;

            public static /* synthetic */ Ok copy$default(Ok ok, long j, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = ok.newId;
                }
                if ((i & 2) != 0) {
                    str = ok.message;
                }
                return ok.copy(j, str);
            }

            /* renamed from: component1, reason: from getter */
            public final long getNewId() {
                return this.newId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            public final Ok copy(long newId, String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                return new Ok(newId, message);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Ok)) {
                    return false;
                }
                Ok ok = (Ok) other;
                return this.newId == ok.newId && Intrinsics.areEqual(this.message, ok.message);
            }

            public int hashCode() {
                return (Long.hashCode(this.newId) * 31) + this.message.hashCode();
            }

            public String toString() {
                return "Ok(newId=" + this.newId + ", message=" + this.message + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Ok(long j, String message) {
                super(null);
                Intrinsics.checkNotNullParameter(message, "message");
                this.newId = j;
                this.message = message;
            }

            public final String getMessage() {
                return this.message;
            }

            public final long getNewId() {
                return this.newId;
            }
        }

        private Result() {
        }

        /* compiled from: WatchActivityReclassifier.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/example/rungps/data/WatchActivityReclassifier$Result$Err;", "Lcom/example/rungps/data/WatchActivityReclassifier$Result;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "", "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Err extends Result {
            public static final int $stable = 0;
            private final String message;

            public static /* synthetic */ Err copy$default(Err err, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = err.message;
                }
                return err.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            public final Err copy(String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                return new Err(message);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Err) && Intrinsics.areEqual(this.message, ((Err) other).message);
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return "Err(message=" + this.message + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Err(String message) {
                super(null);
                Intrinsics.checkNotNullParameter(message, "message");
                this.message = message;
            }

            public final String getMessage() {
                return this.message;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0220 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0204 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object moveRunToSoccer(long j, Continuation<? super Result> continuation) {
        WatchActivityReclassifier$moveRunToSoccer$1 watchActivityReclassifier$moveRunToSoccer$1;
        int i;
        RunEntity runEntity;
        WatchActivityReclassifier watchActivityReclassifier;
        long j2;
        long j3;
        RunEntity runEntity2;
        WatchActivityReclassifier watchActivityReclassifier2;
        long j4;
        int i2;
        long j5;
        Integer num;
        String timeSession;
        String str;
        int i3;
        Object obj;
        Object insertFromWatchReclassify;
        Object obj2;
        WatchActivityReclassifier watchActivityReclassifier3;
        int i4;
        String substringAfter$default;
        String substringBefore$default;
        RunRepository runRepository;
        int i5;
        WatchActivityReclassifier watchActivityReclassifier4;
        long j6;
        WatchActivityReclassifier watchActivityReclassifier5 = this;
        long j7 = j;
        if (continuation instanceof WatchActivityReclassifier$moveRunToSoccer$1) {
            watchActivityReclassifier$moveRunToSoccer$1 = (WatchActivityReclassifier$moveRunToSoccer$1) continuation;
            if ((watchActivityReclassifier$moveRunToSoccer$1.label & Integer.MIN_VALUE) != 0) {
                watchActivityReclassifier$moveRunToSoccer$1.label -= Integer.MIN_VALUE;
                Object obj3 = watchActivityReclassifier$moveRunToSoccer$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = watchActivityReclassifier$moveRunToSoccer$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj3);
                    RunRepository runRepository2 = watchActivityReclassifier5.runRepo;
                    watchActivityReclassifier$moveRunToSoccer$1.L$0 = watchActivityReclassifier5;
                    watchActivityReclassifier$moveRunToSoccer$1.J$0 = j7;
                    watchActivityReclassifier$moveRunToSoccer$1.label = 1;
                    obj3 = runRepository2.runById(j7, watchActivityReclassifier$moveRunToSoccer$1);
                    if (obj3 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i == 1) {
                    long j8 = watchActivityReclassifier$moveRunToSoccer$1.J$0;
                    WatchActivityReclassifier watchActivityReclassifier6 = (WatchActivityReclassifier) watchActivityReclassifier$moveRunToSoccer$1.L$0;
                    ResultKt.throwOnFailure(obj3);
                    watchActivityReclassifier5 = watchActivityReclassifier6;
                    j7 = j8;
                } else if (i == 2) {
                    j2 = watchActivityReclassifier$moveRunToSoccer$1.J$1;
                    j3 = watchActivityReclassifier$moveRunToSoccer$1.J$0;
                    RunEntity runEntity3 = (RunEntity) watchActivityReclassifier$moveRunToSoccer$1.L$1;
                    WatchActivityReclassifier watchActivityReclassifier7 = (WatchActivityReclassifier) watchActivityReclassifier$moveRunToSoccer$1.L$0;
                    ResultKt.throwOnFailure(obj3);
                    runEntity2 = runEntity3;
                    watchActivityReclassifier = watchActivityReclassifier7;
                    if (obj3 == null) {
                        return new Result.Err("Already logged as " + watchActivityReclassifier.sportLabel + " on phone");
                    }
                    int coerceAtLeast = RangesKt.coerceAtLeast((int) (runEntity2.getTotalDurationMs() / 60000), 1);
                    RunRepository runRepository3 = watchActivityReclassifier.runRepo;
                    watchActivityReclassifier$moveRunToSoccer$1.L$0 = watchActivityReclassifier;
                    watchActivityReclassifier$moveRunToSoccer$1.L$1 = runEntity2;
                    watchActivityReclassifier$moveRunToSoccer$1.J$0 = j3;
                    watchActivityReclassifier$moveRunToSoccer$1.J$1 = j2;
                    watchActivityReclassifier$moveRunToSoccer$1.I$0 = coerceAtLeast;
                    watchActivityReclassifier$moveRunToSoccer$1.label = 3;
                    Object hrSummaryForRun = runRepository3.hrSummaryForRun(j3, watchActivityReclassifier$moveRunToSoccer$1);
                    if (hrSummaryForRun == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    watchActivityReclassifier2 = watchActivityReclassifier;
                    j4 = j2;
                    i2 = coerceAtLeast;
                    obj3 = hrSummaryForRun;
                    j5 = j3;
                    long j9 = j4;
                    Pair pair = (Pair) obj3;
                    num = (Integer) pair.component1();
                    Integer num2 = (Integer) pair.component2();
                    timeSession = runEntity2.getTimeSession();
                    if (timeSession != null) {
                    }
                    str = "Run";
                    StringBuilder sb = new StringBuilder();
                    sb.append("Da Fit · " + str);
                    sb.append(" · reclassified from run");
                    if (num != null) {
                    }
                    String sb2 = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
                    SoccerRepository soccerRepository = watchActivityReclassifier2.soccerRepo;
                    long startedAtMs = runEntity2.getStartedAtMs();
                    int intensityFromHr = watchActivityReclassifier2.intensityFromHr(num);
                    if (!StringsKt.equals(str, "Football", true)) {
                    }
                    watchActivityReclassifier$moveRunToSoccer$1.L$0 = watchActivityReclassifier2;
                    watchActivityReclassifier$moveRunToSoccer$1.L$1 = null;
                    watchActivityReclassifier$moveRunToSoccer$1.J$0 = j5;
                    watchActivityReclassifier$moveRunToSoccer$1.I$0 = i2;
                    watchActivityReclassifier$moveRunToSoccer$1.label = 4;
                    int i6 = i2;
                    WatchActivityReclassifier watchActivityReclassifier8 = watchActivityReclassifier2;
                    int i7 = i2;
                    i3 = 5;
                    obj = coroutine_suspended;
                    insertFromWatchReclassify = soccerRepository.insertFromWatchReclassify(j9, startedAtMs, i6, intensityFromHr, sb2, num, num2, r5, watchActivityReclassifier$moveRunToSoccer$1);
                    if (insertFromWatchReclassify != obj) {
                    }
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            j6 = watchActivityReclassifier$moveRunToSoccer$1.J$0;
                            i5 = watchActivityReclassifier$moveRunToSoccer$1.I$0;
                            watchActivityReclassifier4 = (WatchActivityReclassifier) watchActivityReclassifier$moveRunToSoccer$1.L$0;
                            ResultKt.throwOnFailure(obj3);
                            return new Result.Ok(j6, "Moved to " + watchActivityReclassifier4.sportLabel + " (" + i5 + " min)");
                        }
                        int i8 = watchActivityReclassifier$moveRunToSoccer$1.I$0;
                        j5 = watchActivityReclassifier$moveRunToSoccer$1.J$0;
                        WatchActivityReclassifier watchActivityReclassifier9 = (WatchActivityReclassifier) watchActivityReclassifier$moveRunToSoccer$1.L$0;
                        ResultKt.throwOnFailure(obj3);
                        obj2 = obj3;
                        watchActivityReclassifier3 = watchActivityReclassifier9;
                        obj = coroutine_suspended;
                        i4 = i8;
                        i3 = 5;
                        long longValue = ((Number) obj2).longValue();
                        runRepository = watchActivityReclassifier3.runRepo;
                        watchActivityReclassifier$moveRunToSoccer$1.L$0 = watchActivityReclassifier3;
                        watchActivityReclassifier$moveRunToSoccer$1.I$0 = i4;
                        watchActivityReclassifier$moveRunToSoccer$1.J$0 = longValue;
                        watchActivityReclassifier$moveRunToSoccer$1.label = i3;
                        if (runRepository.deleteRun(j5, watchActivityReclassifier$moveRunToSoccer$1) != obj) {
                            return obj;
                        }
                        i5 = i4;
                        watchActivityReclassifier4 = watchActivityReclassifier3;
                        j6 = longValue;
                        return new Result.Ok(j6, "Moved to " + watchActivityReclassifier4.sportLabel + " (" + i5 + " min)");
                    }
                    i2 = watchActivityReclassifier$moveRunToSoccer$1.I$0;
                    long j10 = watchActivityReclassifier$moveRunToSoccer$1.J$1;
                    j3 = watchActivityReclassifier$moveRunToSoccer$1.J$0;
                    runEntity2 = (RunEntity) watchActivityReclassifier$moveRunToSoccer$1.L$1;
                    WatchActivityReclassifier watchActivityReclassifier10 = (WatchActivityReclassifier) watchActivityReclassifier$moveRunToSoccer$1.L$0;
                    ResultKt.throwOnFailure(obj3);
                    watchActivityReclassifier2 = watchActivityReclassifier10;
                    j4 = j10;
                    j5 = j3;
                    long j92 = j4;
                    Pair pair2 = (Pair) obj3;
                    num = (Integer) pair2.component1();
                    Integer num22 = (Integer) pair2.component2();
                    timeSession = runEntity2.getTimeSession();
                    if (timeSession != null || (substringAfter$default = StringsKt.substringAfter$default(timeSession, "Da Fit · ", (String) null, 2, (Object) null)) == null || (substringBefore$default = StringsKt.substringBefore$default(substringAfter$default, " ·", (String) null, 2, (Object) null)) == null || (str = StringsKt.trim((CharSequence) substringBefore$default).toString()) == null) {
                        str = "Run";
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Da Fit · " + str);
                    sb3.append(" · reclassified from run");
                    if (num != null) {
                        sb3.append(" · HR avg " + num.intValue());
                    }
                    String sb22 = sb3.toString();
                    Intrinsics.checkNotNullExpressionValue(sb22, "toString(...)");
                    SoccerRepository soccerRepository2 = watchActivityReclassifier2.soccerRepo;
                    long startedAtMs2 = runEntity2.getStartedAtMs();
                    int intensityFromHr2 = watchActivityReclassifier2.intensityFromHr(num);
                    String str2 = !StringsKt.equals(str, "Football", true) ? "MATCH" : "TRAINING";
                    watchActivityReclassifier$moveRunToSoccer$1.L$0 = watchActivityReclassifier2;
                    watchActivityReclassifier$moveRunToSoccer$1.L$1 = null;
                    watchActivityReclassifier$moveRunToSoccer$1.J$0 = j5;
                    watchActivityReclassifier$moveRunToSoccer$1.I$0 = i2;
                    watchActivityReclassifier$moveRunToSoccer$1.label = 4;
                    int i62 = i2;
                    WatchActivityReclassifier watchActivityReclassifier82 = watchActivityReclassifier2;
                    int i72 = i2;
                    i3 = 5;
                    obj = coroutine_suspended;
                    insertFromWatchReclassify = soccerRepository2.insertFromWatchReclassify(j92, startedAtMs2, i62, intensityFromHr2, sb22, num, num22, str2, watchActivityReclassifier$moveRunToSoccer$1);
                    if (insertFromWatchReclassify != obj) {
                        return obj;
                    }
                    obj2 = insertFromWatchReclassify;
                    watchActivityReclassifier3 = watchActivityReclassifier82;
                    i4 = i72;
                    long longValue2 = ((Number) obj2).longValue();
                    runRepository = watchActivityReclassifier3.runRepo;
                    watchActivityReclassifier$moveRunToSoccer$1.L$0 = watchActivityReclassifier3;
                    watchActivityReclassifier$moveRunToSoccer$1.I$0 = i4;
                    watchActivityReclassifier$moveRunToSoccer$1.J$0 = longValue2;
                    watchActivityReclassifier$moveRunToSoccer$1.label = i3;
                    if (runRepository.deleteRun(j5, watchActivityReclassifier$moveRunToSoccer$1) != obj) {
                    }
                }
                runEntity = (RunEntity) obj3;
                if (runEntity != null) {
                    return new Result.Err("Activity not found");
                }
                if (runEntity.getWatchImportId() == null) {
                    return new Result.Err("Only watch-synced activities can be reclassified");
                }
                if (ActivityTypes.INSTANCE.isBike(runEntity.getActivityType())) {
                    return new Result.Err("Bike rides stay as rides — use History to delete if wrong");
                }
                Long watchImportId = runEntity.getWatchImportId();
                if (watchImportId == null) {
                    return new Result.Err("Only watch-synced activities can be reclassified");
                }
                long longValue3 = watchImportId.longValue();
                SoccerRepository soccerRepository3 = watchActivityReclassifier5.soccerRepo;
                watchActivityReclassifier$moveRunToSoccer$1.L$0 = watchActivityReclassifier5;
                watchActivityReclassifier$moveRunToSoccer$1.L$1 = runEntity;
                watchActivityReclassifier$moveRunToSoccer$1.J$0 = j7;
                watchActivityReclassifier$moveRunToSoccer$1.J$1 = longValue3;
                watchActivityReclassifier$moveRunToSoccer$1.label = 2;
                Object sessionByWatchId = soccerRepository3.sessionByWatchId(longValue3, watchActivityReclassifier$moveRunToSoccer$1);
                if (sessionByWatchId == coroutine_suspended) {
                    return coroutine_suspended;
                }
                watchActivityReclassifier = watchActivityReclassifier5;
                j2 = longValue3;
                j3 = j7;
                runEntity2 = runEntity;
                obj3 = sessionByWatchId;
                if (obj3 == null) {
                }
            }
        }
        watchActivityReclassifier$moveRunToSoccer$1 = new WatchActivityReclassifier$moveRunToSoccer$1(watchActivityReclassifier5, continuation);
        Object obj32 = watchActivityReclassifier$moveRunToSoccer$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = watchActivityReclassifier$moveRunToSoccer$1.label;
        if (i != 0) {
        }
        runEntity = (RunEntity) obj32;
        if (runEntity != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x016b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object moveSoccerToRun(long j, Continuation<? super Result> continuation) {
        WatchActivityReclassifier$moveSoccerToRun$1 watchActivityReclassifier$moveSoccerToRun$1;
        int i;
        SoccerSessionEntity soccerSessionEntity;
        long longValue;
        Object runByWatchImportId;
        String invoke;
        Object obj;
        int i2;
        Object obj2;
        int i3;
        WatchActivityReclassifier watchActivityReclassifier;
        long j2;
        String substringAfter$default;
        String substringBefore$default;
        SoccerRepository soccerRepository;
        int i4;
        long j3;
        WatchActivityReclassifier watchActivityReclassifier2 = this;
        long j4 = j;
        if (continuation instanceof WatchActivityReclassifier$moveSoccerToRun$1) {
            watchActivityReclassifier$moveSoccerToRun$1 = (WatchActivityReclassifier$moveSoccerToRun$1) continuation;
            if ((watchActivityReclassifier$moveSoccerToRun$1.label & Integer.MIN_VALUE) != 0) {
                watchActivityReclassifier$moveSoccerToRun$1.label -= Integer.MIN_VALUE;
                Object obj3 = watchActivityReclassifier$moveSoccerToRun$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = watchActivityReclassifier$moveSoccerToRun$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj3);
                    SoccerRepository soccerRepository2 = watchActivityReclassifier2.soccerRepo;
                    watchActivityReclassifier$moveSoccerToRun$1.L$0 = watchActivityReclassifier2;
                    watchActivityReclassifier$moveSoccerToRun$1.J$0 = j4;
                    watchActivityReclassifier$moveSoccerToRun$1.label = 1;
                    obj3 = soccerRepository2.sessionById(j4, watchActivityReclassifier$moveSoccerToRun$1);
                    if (obj3 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i == 1) {
                    long j5 = watchActivityReclassifier$moveSoccerToRun$1.J$0;
                    WatchActivityReclassifier watchActivityReclassifier3 = (WatchActivityReclassifier) watchActivityReclassifier$moveSoccerToRun$1.L$0;
                    ResultKt.throwOnFailure(obj3);
                    watchActivityReclassifier2 = watchActivityReclassifier3;
                    j4 = j5;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            j3 = watchActivityReclassifier$moveSoccerToRun$1.J$0;
                            i4 = watchActivityReclassifier$moveSoccerToRun$1.I$0;
                            ResultKt.throwOnFailure(obj3);
                            return new Result.Ok(j3, "Moved to run (" + i4 + " min, no GPS track)");
                        }
                        int i5 = watchActivityReclassifier$moveSoccerToRun$1.I$0;
                        long j6 = watchActivityReclassifier$moveSoccerToRun$1.J$0;
                        WatchActivityReclassifier watchActivityReclassifier4 = (WatchActivityReclassifier) watchActivityReclassifier$moveSoccerToRun$1.L$0;
                        ResultKt.throwOnFailure(obj3);
                        obj2 = obj3;
                        watchActivityReclassifier = watchActivityReclassifier4;
                        i3 = i5;
                        j2 = j6;
                        obj = coroutine_suspended;
                        i2 = 4;
                        long longValue2 = ((Number) obj2).longValue();
                        soccerRepository = watchActivityReclassifier.soccerRepo;
                        watchActivityReclassifier$moveSoccerToRun$1.L$0 = null;
                        watchActivityReclassifier$moveSoccerToRun$1.I$0 = i3;
                        watchActivityReclassifier$moveSoccerToRun$1.J$0 = longValue2;
                        watchActivityReclassifier$moveSoccerToRun$1.label = i2;
                        if (soccerRepository.deleteSession(j2, watchActivityReclassifier$moveSoccerToRun$1) != obj) {
                            return obj;
                        }
                        i4 = i3;
                        j3 = longValue2;
                        return new Result.Ok(j3, "Moved to run (" + i4 + " min, no GPS track)");
                    }
                    long j7 = watchActivityReclassifier$moveSoccerToRun$1.J$1;
                    long j8 = watchActivityReclassifier$moveSoccerToRun$1.J$0;
                    SoccerSessionEntity soccerSessionEntity2 = (SoccerSessionEntity) watchActivityReclassifier$moveSoccerToRun$1.L$1;
                    WatchActivityReclassifier watchActivityReclassifier5 = (WatchActivityReclassifier) watchActivityReclassifier$moveSoccerToRun$1.L$0;
                    ResultKt.throwOnFailure(obj3);
                    soccerSessionEntity = soccerSessionEntity2;
                    runByWatchImportId = obj3;
                    watchActivityReclassifier2 = watchActivityReclassifier5;
                    j4 = j8;
                    longValue = j7;
                    if (runByWatchImportId == null) {
                        return new Result.Err("Already logged as a run on phone");
                    }
                    int coerceAtLeast = RangesKt.coerceAtLeast(soccerSessionEntity.getWarmupMin() + soccerSessionEntity.getPlayMin(), 1);
                    long j9 = 60000 * coerceAtLeast;
                    long startTimeMs = soccerSessionEntity.getStartTimeMs() + j9;
                    String notes = soccerSessionEntity.getNotes();
                    if (notes == null || (substringAfter$default = StringsKt.substringAfter$default(notes, "Da Fit · ", (String) null, 2, (Object) null)) == null || (substringBefore$default = StringsKt.substringBefore$default(substringAfter$default, " ·", (String) null, 2, (Object) null)) == null || (invoke = StringsKt.trim((CharSequence) substringBefore$default).toString()) == null) {
                        invoke = watchActivityReclassifier2.sportLabel.invoke();
                    }
                    String str = invoke;
                    RunRepository runRepository = watchActivityReclassifier2.runRepo;
                    long startTimeMs2 = soccerSessionEntity.getStartTimeMs();
                    Integer hrAvgBpm = soccerSessionEntity.getHrAvgBpm();
                    Integer hrMaxBpm = soccerSessionEntity.getHrMaxBpm();
                    watchActivityReclassifier$moveSoccerToRun$1.L$0 = watchActivityReclassifier2;
                    watchActivityReclassifier$moveSoccerToRun$1.L$1 = null;
                    watchActivityReclassifier$moveSoccerToRun$1.J$0 = j4;
                    watchActivityReclassifier$moveSoccerToRun$1.I$0 = coerceAtLeast;
                    watchActivityReclassifier$moveSoccerToRun$1.label = 3;
                    WatchActivityReclassifier watchActivityReclassifier6 = watchActivityReclassifier2;
                    long j10 = j4;
                    obj = coroutine_suspended;
                    i2 = 4;
                    Object insertWatchRunFromSoccer = runRepository.insertWatchRunFromSoccer(longValue, startTimeMs2, startTimeMs, j9, 0.0d, hrAvgBpm, hrMaxBpm, str, watchActivityReclassifier$moveSoccerToRun$1);
                    if (insertWatchRunFromSoccer == obj) {
                        return obj;
                    }
                    obj2 = insertWatchRunFromSoccer;
                    i3 = coerceAtLeast;
                    watchActivityReclassifier = watchActivityReclassifier6;
                    j2 = j10;
                    long longValue22 = ((Number) obj2).longValue();
                    soccerRepository = watchActivityReclassifier.soccerRepo;
                    watchActivityReclassifier$moveSoccerToRun$1.L$0 = null;
                    watchActivityReclassifier$moveSoccerToRun$1.I$0 = i3;
                    watchActivityReclassifier$moveSoccerToRun$1.J$0 = longValue22;
                    watchActivityReclassifier$moveSoccerToRun$1.label = i2;
                    if (soccerRepository.deleteSession(j2, watchActivityReclassifier$moveSoccerToRun$1) != obj) {
                    }
                }
                soccerSessionEntity = (SoccerSessionEntity) obj3;
                if (soccerSessionEntity != null) {
                    return new Result.Err("Session not found");
                }
                Long watchSessionId = soccerSessionEntity.getWatchSessionId();
                if (watchSessionId == null) {
                    return new Result.Err("Only watch-synced sessions can be reclassified");
                }
                longValue = watchSessionId.longValue();
                RunRepository runRepository2 = watchActivityReclassifier2.runRepo;
                watchActivityReclassifier$moveSoccerToRun$1.L$0 = watchActivityReclassifier2;
                watchActivityReclassifier$moveSoccerToRun$1.L$1 = soccerSessionEntity;
                watchActivityReclassifier$moveSoccerToRun$1.J$0 = j4;
                watchActivityReclassifier$moveSoccerToRun$1.J$1 = longValue;
                watchActivityReclassifier$moveSoccerToRun$1.label = 2;
                runByWatchImportId = runRepository2.runByWatchImportId(longValue, watchActivityReclassifier$moveSoccerToRun$1);
                if (runByWatchImportId == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (runByWatchImportId == null) {
                }
            }
        }
        watchActivityReclassifier$moveSoccerToRun$1 = new WatchActivityReclassifier$moveSoccerToRun$1(watchActivityReclassifier2, continuation);
        Object obj32 = watchActivityReclassifier$moveSoccerToRun$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = watchActivityReclassifier$moveSoccerToRun$1.label;
        if (i != 0) {
        }
        soccerSessionEntity = (SoccerSessionEntity) obj32;
        if (soccerSessionEntity != null) {
        }
    }

    private final int intensityFromHr(Integer hrAvg) {
        if (hrAvg != null && hrAvg.intValue() >= 165) {
            return 9;
        }
        if (hrAvg != null && hrAvg.intValue() >= 150) {
            return 8;
        }
        if (hrAvg == null) {
            return 7;
        }
        hrAvg.intValue();
        return 7;
    }
}
