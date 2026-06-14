package com.example.rungps.data.repo;

import androidx.core.app.NotificationCompat;
import com.example.rungps.analytics.SoccerHrZones;
import com.example.rungps.ble.WatchSoccerRecord;
import com.example.rungps.ble.moyoung.MoyoungHrParser;
import com.example.rungps.ble.moyoung.MoyoungSportLabels;
import com.example.rungps.ble.moyoung.MoyoungWorkout;
import com.example.rungps.data.RecoveryDao;
import com.example.rungps.data.RecoveryEventEntity;
import com.example.rungps.data.SoccerDao;
import com.example.rungps.data.SoccerSessionEntity;
import com.example.rungps.recovery.RecoveryModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;

/* compiled from: SoccerRepository.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001>B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eJ\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0086@¢\u0006\u0002\u0010\u0012J@\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0086@¢\u0006\u0002\u0010\u001cJ\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001e\u001a\u00020\u0014H\u0086@¢\u0006\u0002\u0010\u001fJ\u0018\u0010 \u001a\u0004\u0018\u00010\u00102\u0006\u0010!\u001a\u00020\u0014H\u0086@¢\u0006\u0002\u0010\u001fJ\u0016\u0010\"\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u0014H\u0086@¢\u0006\u0002\u0010\u001fJ\"\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00140\u000fH\u0086@¢\u0006\u0002\u0010&JT\u0010'\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\n2\b\u0010(\u001a\u0004\u0018\u00010\u00182\b\u0010)\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010*J\u0016\u0010+\u001a\u00020,2\u0006\u0010\u001e\u001a\u00020\u0014H\u0086@¢\u0006\u0002\u0010\u001fJ\u0018\u0010-\u001a\u0004\u0018\u00010\u00142\u0006\u0010.\u001a\u00020/H\u0086@¢\u0006\u0002\u00100J<\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042$\b\u0002\u00105\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020#07\u0012\u0006\u0012\u0004\u0018\u00010\u000106H\u0086@¢\u0006\u0002\u00108J\u000e\u00109\u001a\u00020,H\u0086@¢\u0006\u0002\u0010\u0012J\"\u0010:\u001a\u00020,2\u0006\u0010;\u001a\u00020\u00102\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\nH\u0082@¢\u0006\u0002\u0010=R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lcom/example/rungps/data/repo/SoccerRepository;", "", "soccerDao", "Lcom/example/rungps/data/SoccerDao;", "recoveryDao", "Lcom/example/rungps/data/RecoveryDao;", "demographics", "Lkotlin/Function0;", "Lcom/example/rungps/recovery/RecoveryModel$RecoveryDemographics;", "sportLabel", "", "<init>", "(Lcom/example/rungps/data/SoccerDao;Lcom/example/rungps/data/RecoveryDao;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "sessionsFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/rungps/data/SoccerSessionEntity;", "allSessions", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addSession", "", "kind", "startTimeMs", "warmupMin", "", "playMin", "intensity", "notes", "(Ljava/lang/String;JIIILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sessionById", "id", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sessionByWatchId", "watchSessionId", "sessionExists", "", "existingIds", "ids", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertFromWatchReclassify", "hrAvgBpm", "hrMaxBpm", "(JJIILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSession", "", "importWatchSoccerSession", "record", "Lcom/example/rungps/ble/WatchSoccerRecord;", "(Lcom/example/rungps/ble/WatchSoccerRecord;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "importMoyoungWorkout", "Lcom/example/rungps/data/repo/SoccerRepository$MoyoungImportResult;", NotificationCompat.CATEGORY_WORKOUT, "Lcom/example/rungps/ble/moyoung/MoyoungWorkout;", "runAlreadyImported", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "(Lcom/example/rungps/ble/moyoung/MoyoungWorkout;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reconcileRecoveryEvents", "upsertRecoveryForSession", "session", "extraNote", "(Lcom/example/rungps/data/SoccerSessionEntity;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "MoyoungImportResult", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SoccerRepository {
    public static final int $stable = 0;
    private final Function0<RecoveryModel.RecoveryDemographics> demographics;
    private final RecoveryDao recoveryDao;
    private final SoccerDao soccerDao;
    private final Function0<String> sportLabel;

    public SoccerRepository(SoccerDao soccerDao, RecoveryDao recoveryDao, Function0<RecoveryModel.RecoveryDemographics> demographics, Function0<String> sportLabel) {
        Intrinsics.checkNotNullParameter(soccerDao, "soccerDao");
        Intrinsics.checkNotNullParameter(recoveryDao, "recoveryDao");
        Intrinsics.checkNotNullParameter(demographics, "demographics");
        Intrinsics.checkNotNullParameter(sportLabel, "sportLabel");
        this.soccerDao = soccerDao;
        this.recoveryDao = recoveryDao;
        this.demographics = demographics;
        this.sportLabel = sportLabel;
    }

    public final Flow<List<SoccerSessionEntity>> sessionsFlow() {
        return this.soccerDao.sessionsFlow();
    }

    public final Object allSessions(Continuation<? super List<SoccerSessionEntity>> continuation) {
        return this.soccerDao.allSessions(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object addSession(String str, long j, int i, int i2, int i3, String str2, Continuation<? super Long> continuation) {
        SoccerRepository$addSession$1 soccerRepository$addSession$1;
        Object obj;
        Object coroutine_suspended;
        int i4;
        long longValue;
        SoccerSessionEntity soccerSessionEntity;
        long j2;
        SoccerRepository soccerRepository = this;
        if (continuation instanceof SoccerRepository$addSession$1) {
            soccerRepository$addSession$1 = (SoccerRepository$addSession$1) continuation;
            if ((soccerRepository$addSession$1.label & Integer.MIN_VALUE) != 0) {
                soccerRepository$addSession$1.label -= Integer.MIN_VALUE;
                obj = soccerRepository$addSession$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i4 = soccerRepository$addSession$1.label;
                if (i4 != 0) {
                    ResultKt.throwOnFailure(obj);
                    SoccerDao soccerDao = soccerRepository.soccerDao;
                    SoccerSessionEntity soccerSessionEntity2 = new SoccerSessionEntity(0L, str, j, RangesKt.coerceAtLeast(i, 0), RangesKt.coerceAtLeast(i2, 0), RangesKt.coerceIn(i3, 1, 10), str2, null, null, null, null, null, null, null, 16257, null);
                    soccerRepository$addSession$1.L$0 = soccerRepository;
                    soccerRepository$addSession$1.label = 1;
                    obj = soccerDao.insert(soccerSessionEntity2, soccerRepository$addSession$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            j2 = soccerRepository$addSession$1.J$0;
                            ResultKt.throwOnFailure(obj);
                            return Boxing.boxLong(j2);
                        }
                        long j3 = soccerRepository$addSession$1.J$0;
                        soccerRepository = (SoccerRepository) soccerRepository$addSession$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        longValue = j3;
                        soccerSessionEntity = (SoccerSessionEntity) obj;
                        if (soccerSessionEntity == null) {
                            return Boxing.boxLong(longValue);
                        }
                        soccerRepository$addSession$1.L$0 = null;
                        soccerRepository$addSession$1.J$0 = longValue;
                        soccerRepository$addSession$1.label = 3;
                        if (upsertRecoveryForSession$default(soccerRepository, soccerSessionEntity, null, soccerRepository$addSession$1, 2, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        j2 = longValue;
                        return Boxing.boxLong(j2);
                    }
                    soccerRepository = (SoccerRepository) soccerRepository$addSession$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                longValue = ((Number) obj).longValue();
                SoccerDao soccerDao2 = soccerRepository.soccerDao;
                soccerRepository$addSession$1.L$0 = soccerRepository;
                soccerRepository$addSession$1.J$0 = longValue;
                soccerRepository$addSession$1.label = 2;
                obj = soccerDao2.sessionById(longValue, soccerRepository$addSession$1);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                soccerSessionEntity = (SoccerSessionEntity) obj;
                if (soccerSessionEntity == null) {
                }
            }
        }
        soccerRepository$addSession$1 = new SoccerRepository$addSession$1(soccerRepository, continuation);
        obj = soccerRepository$addSession$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i4 = soccerRepository$addSession$1.label;
        if (i4 != 0) {
        }
        longValue = ((Number) obj).longValue();
        SoccerDao soccerDao22 = soccerRepository.soccerDao;
        soccerRepository$addSession$1.L$0 = soccerRepository;
        soccerRepository$addSession$1.J$0 = longValue;
        soccerRepository$addSession$1.label = 2;
        obj = soccerDao22.sessionById(longValue, soccerRepository$addSession$1);
        if (obj == coroutine_suspended) {
        }
        soccerSessionEntity = (SoccerSessionEntity) obj;
        if (soccerSessionEntity == null) {
        }
    }

    public final Object sessionById(long j, Continuation<? super SoccerSessionEntity> continuation) {
        return this.soccerDao.sessionById(j, continuation);
    }

    public final Object sessionByWatchId(long j, Continuation<? super SoccerSessionEntity> continuation) {
        return this.soccerDao.sessionByWatchId(j, continuation);
    }

    public final Object sessionExists(long j, Continuation<? super Boolean> continuation) {
        return this.soccerDao.sessionExists(j, continuation);
    }

    public final Object existingIds(List<Long> list, Continuation<? super List<Long>> continuation) {
        return list.isEmpty() ? CollectionsKt.emptyList() : this.soccerDao.existingIds(list, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object insertFromWatchReclassify(long j, long j2, int i, int i2, String str, Integer num, Integer num2, String str2, Continuation<? super Long> continuation) {
        SoccerRepository$insertFromWatchReclassify$1 soccerRepository$insertFromWatchReclassify$1;
        Object obj;
        Object coroutine_suspended;
        int i3;
        int intValue;
        int intValue2;
        long j3;
        SoccerSessionEntity soccerSessionEntity;
        long j4;
        SoccerRepository soccerRepository = this;
        if (continuation instanceof SoccerRepository$insertFromWatchReclassify$1) {
            soccerRepository$insertFromWatchReclassify$1 = (SoccerRepository$insertFromWatchReclassify$1) continuation;
            if ((soccerRepository$insertFromWatchReclassify$1.label & Integer.MIN_VALUE) != 0) {
                soccerRepository$insertFromWatchReclassify$1.label -= Integer.MIN_VALUE;
                obj = soccerRepository$insertFromWatchReclassify$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i3 = soccerRepository$insertFromWatchReclassify$1.label;
                if (i3 != 0) {
                    ResultKt.throwOnFailure(obj);
                    SoccerDao soccerDao = soccerRepository.soccerDao;
                    SoccerSessionEntity soccerSessionEntity2 = new SoccerSessionEntity(0L, str2, j2, 0, i, RangesKt.coerceIn(i2, 1, 10), str, Boxing.boxLong(j), (num == null || 40 > (intValue2 = num.intValue()) || intValue2 >= 221) ? null : num, (num2 == null || 40 > (intValue = num2.intValue()) || intValue >= 221) ? null : num2, null, null, null, null, 15361, null);
                    soccerRepository$insertFromWatchReclassify$1.L$0 = soccerRepository;
                    soccerRepository$insertFromWatchReclassify$1.label = 1;
                    obj = soccerDao.insert(soccerSessionEntity2, soccerRepository$insertFromWatchReclassify$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            j4 = soccerRepository$insertFromWatchReclassify$1.J$0;
                            ResultKt.throwOnFailure(obj);
                            j3 = j4;
                            return Boxing.boxLong(j3);
                        }
                        j3 = soccerRepository$insertFromWatchReclassify$1.J$0;
                        soccerRepository = (SoccerRepository) soccerRepository$insertFromWatchReclassify$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        soccerSessionEntity = (SoccerSessionEntity) obj;
                        if (soccerSessionEntity != null) {
                            soccerRepository$insertFromWatchReclassify$1.L$0 = null;
                            soccerRepository$insertFromWatchReclassify$1.J$0 = j3;
                            soccerRepository$insertFromWatchReclassify$1.label = 3;
                            if (soccerRepository.upsertRecoveryForSession(soccerSessionEntity, "reclassified from run", soccerRepository$insertFromWatchReclassify$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            j4 = j3;
                            j3 = j4;
                        }
                        return Boxing.boxLong(j3);
                    }
                    soccerRepository = (SoccerRepository) soccerRepository$insertFromWatchReclassify$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                long longValue = ((Number) obj).longValue();
                SoccerDao soccerDao2 = soccerRepository.soccerDao;
                soccerRepository$insertFromWatchReclassify$1.L$0 = soccerRepository;
                soccerRepository$insertFromWatchReclassify$1.J$0 = longValue;
                soccerRepository$insertFromWatchReclassify$1.label = 2;
                obj = soccerDao2.sessionById(longValue, soccerRepository$insertFromWatchReclassify$1);
                if (obj != coroutine_suspended) {
                    return coroutine_suspended;
                }
                j3 = longValue;
                soccerSessionEntity = (SoccerSessionEntity) obj;
                if (soccerSessionEntity != null) {
                }
                return Boxing.boxLong(j3);
            }
        }
        soccerRepository$insertFromWatchReclassify$1 = new SoccerRepository$insertFromWatchReclassify$1(soccerRepository, continuation);
        obj = soccerRepository$insertFromWatchReclassify$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i3 = soccerRepository$insertFromWatchReclassify$1.label;
        if (i3 != 0) {
        }
        long longValue2 = ((Number) obj).longValue();
        SoccerDao soccerDao22 = soccerRepository.soccerDao;
        soccerRepository$insertFromWatchReclassify$1.L$0 = soccerRepository;
        soccerRepository$insertFromWatchReclassify$1.J$0 = longValue2;
        soccerRepository$insertFromWatchReclassify$1.label = 2;
        obj = soccerDao22.sessionById(longValue2, soccerRepository$insertFromWatchReclassify$1);
        if (obj != coroutine_suspended) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object deleteSession(long j, Continuation<? super Unit> continuation) {
        SoccerRepository$deleteSession$1 soccerRepository$deleteSession$1;
        Object coroutine_suspended;
        int i;
        SoccerDao soccerDao;
        if (continuation instanceof SoccerRepository$deleteSession$1) {
            soccerRepository$deleteSession$1 = (SoccerRepository$deleteSession$1) continuation;
            if ((soccerRepository$deleteSession$1.label & Integer.MIN_VALUE) != 0) {
                soccerRepository$deleteSession$1.label -= Integer.MIN_VALUE;
                Object obj = soccerRepository$deleteSession$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = soccerRepository$deleteSession$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    RecoveryDao recoveryDao = this.recoveryDao;
                    soccerRepository$deleteSession$1.L$0 = this;
                    soccerRepository$deleteSession$1.J$0 = j;
                    soccerRepository$deleteSession$1.label = 1;
                    if (recoveryDao.deleteForSource("SOCCER", j, soccerRepository$deleteSession$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    j = soccerRepository$deleteSession$1.J$0;
                    this = (SoccerRepository) soccerRepository$deleteSession$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                soccerDao = this.soccerDao;
                soccerRepository$deleteSession$1.L$0 = null;
                soccerRepository$deleteSession$1.label = 2;
                if (soccerDao.delete(j, soccerRepository$deleteSession$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        soccerRepository$deleteSession$1 = new SoccerRepository$deleteSession$1(this, continuation);
        Object obj2 = soccerRepository$deleteSession$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = soccerRepository$deleteSession$1.label;
        if (i != 0) {
        }
        soccerDao = this.soccerDao;
        soccerRepository$deleteSession$1.L$0 = null;
        soccerRepository$deleteSession$1.label = 2;
        if (soccerDao.delete(j, soccerRepository$deleteSession$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0197 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object importWatchSoccerSession(WatchSoccerRecord watchSoccerRecord, Continuation<? super Long> continuation) {
        SoccerRepository$importWatchSoccerSession$1 soccerRepository$importWatchSoccerSession$1;
        Object obj;
        int i;
        WatchSoccerRecord watchSoccerRecord2;
        int i2;
        int i3;
        StringBuilder sb;
        long longValue;
        long j;
        SoccerSessionEntity soccerSessionEntity;
        long j2;
        SoccerRepository soccerRepository = this;
        if (continuation instanceof SoccerRepository$importWatchSoccerSession$1) {
            soccerRepository$importWatchSoccerSession$1 = (SoccerRepository$importWatchSoccerSession$1) continuation;
            if ((soccerRepository$importWatchSoccerSession$1.label & Integer.MIN_VALUE) != 0) {
                soccerRepository$importWatchSoccerSession$1.label -= Integer.MIN_VALUE;
                SoccerRepository$importWatchSoccerSession$1 soccerRepository$importWatchSoccerSession$12 = soccerRepository$importWatchSoccerSession$1;
                obj = soccerRepository$importWatchSoccerSession$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = soccerRepository$importWatchSoccerSession$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (watchSoccerRecord.getWatchSessionId() == 0) {
                        return null;
                    }
                    SoccerDao soccerDao = soccerRepository.soccerDao;
                    long watchSessionId = watchSoccerRecord.getWatchSessionId();
                    soccerRepository$importWatchSoccerSession$12.L$0 = soccerRepository;
                    watchSoccerRecord2 = watchSoccerRecord;
                    soccerRepository$importWatchSoccerSession$12.L$1 = watchSoccerRecord2;
                    soccerRepository$importWatchSoccerSession$12.label = 1;
                    obj = soccerDao.sessionByWatchId(watchSessionId, soccerRepository$importWatchSoccerSession$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            soccerRepository = (SoccerRepository) soccerRepository$importWatchSoccerSession$12.L$0;
                            ResultKt.throwOnFailure(obj);
                            longValue = ((Number) obj).longValue();
                            SoccerDao soccerDao2 = soccerRepository.soccerDao;
                            soccerRepository$importWatchSoccerSession$12.L$0 = soccerRepository;
                            soccerRepository$importWatchSoccerSession$12.J$0 = longValue;
                            soccerRepository$importWatchSoccerSession$12.label = 3;
                            obj = soccerDao2.sessionById(longValue, soccerRepository$importWatchSoccerSession$12);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            SoccerRepository soccerRepository2 = soccerRepository;
                            j = longValue;
                            soccerSessionEntity = (SoccerSessionEntity) obj;
                            if (soccerSessionEntity != null) {
                            }
                            return Boxing.boxLong(j);
                        }
                        if (i != 3) {
                            if (i != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            j2 = soccerRepository$importWatchSoccerSession$12.J$0;
                            ResultKt.throwOnFailure(obj);
                            j = j2;
                            return Boxing.boxLong(j);
                        }
                        longValue = soccerRepository$importWatchSoccerSession$12.J$0;
                        soccerRepository = (SoccerRepository) soccerRepository$importWatchSoccerSession$12.L$0;
                        ResultKt.throwOnFailure(obj);
                        SoccerRepository soccerRepository22 = soccerRepository;
                        j = longValue;
                        soccerSessionEntity = (SoccerSessionEntity) obj;
                        if (soccerSessionEntity != null) {
                            soccerRepository$importWatchSoccerSession$12.L$0 = null;
                            soccerRepository$importWatchSoccerSession$12.J$0 = j;
                            soccerRepository$importWatchSoccerSession$12.label = 4;
                            if (upsertRecoveryForSession$default(soccerRepository22, soccerSessionEntity, null, soccerRepository$importWatchSoccerSession$12, 2, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            j2 = j;
                            j = j2;
                        }
                        return Boxing.boxLong(j);
                    }
                    WatchSoccerRecord watchSoccerRecord3 = (WatchSoccerRecord) soccerRepository$importWatchSoccerSession$12.L$1;
                    SoccerRepository soccerRepository3 = (SoccerRepository) soccerRepository$importWatchSoccerSession$12.L$0;
                    ResultKt.throwOnFailure(obj);
                    watchSoccerRecord2 = watchSoccerRecord3;
                    soccerRepository = soccerRepository3;
                }
                if (obj == null) {
                    return null;
                }
                int intensity = watchSoccerRecord2.getIntensity();
                if (1 <= intensity && intensity < 11) {
                    i3 = watchSoccerRecord2.getIntensity();
                } else if (watchSoccerRecord2.getHrAvgBpm() != null && watchSoccerRecord2.getHrAvgBpm().intValue() >= 165) {
                    i3 = 9;
                } else {
                    if (watchSoccerRecord2.getHrAvgBpm() == null || watchSoccerRecord2.getHrAvgBpm().intValue() < 150) {
                        if (watchSoccerRecord2.getHrAvgBpm() != null) {
                            watchSoccerRecord2.getHrAvgBpm().intValue();
                        }
                        i2 = 7;
                        int durationMin = watchSoccerRecord2.getDurationMin();
                        sb = new StringBuilder();
                        if (watchSoccerRecord2.getHrAvgBpm() == null || watchSoccerRecord2.getHrMaxBpm() != null) {
                            sb.append("HR");
                            if (watchSoccerRecord2.getHrAvgBpm() != null) {
                                sb.append(" avg " + watchSoccerRecord2.getHrAvgBpm());
                            }
                            if (watchSoccerRecord2.getHrMaxBpm() != null) {
                                sb.append(" max " + watchSoccerRecord2.getHrMaxBpm());
                            }
                            sb.append(" · ");
                        }
                        String sb2 = sb.toString();
                        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
                        String obj2 = StringsKt.trim((CharSequence) (sb2 + "Recorded on watch (offline)")).toString();
                        SoccerDao soccerDao3 = soccerRepository.soccerDao;
                        SoccerSessionEntity soccerSessionEntity2 = new SoccerSessionEntity(0L, "TRAINING", watchSoccerRecord2.getStartTimeMs(), 0, durationMin, i2, obj2, Boxing.boxLong(watchSoccerRecord2.getWatchSessionId()), watchSoccerRecord2.getHrAvgBpm(), watchSoccerRecord2.getHrMaxBpm(), null, null, null, null, 15361, null);
                        soccerRepository$importWatchSoccerSession$12.L$0 = soccerRepository;
                        soccerRepository$importWatchSoccerSession$12.L$1 = null;
                        soccerRepository$importWatchSoccerSession$12.label = 2;
                        obj = soccerDao3.insert(soccerSessionEntity2, soccerRepository$importWatchSoccerSession$12);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        longValue = ((Number) obj).longValue();
                        SoccerDao soccerDao22 = soccerRepository.soccerDao;
                        soccerRepository$importWatchSoccerSession$12.L$0 = soccerRepository;
                        soccerRepository$importWatchSoccerSession$12.J$0 = longValue;
                        soccerRepository$importWatchSoccerSession$12.label = 3;
                        obj = soccerDao22.sessionById(longValue, soccerRepository$importWatchSoccerSession$12);
                        if (obj == coroutine_suspended) {
                        }
                        SoccerRepository soccerRepository222 = soccerRepository;
                        j = longValue;
                        soccerSessionEntity = (SoccerSessionEntity) obj;
                        if (soccerSessionEntity != null) {
                        }
                        return Boxing.boxLong(j);
                    }
                    i3 = 8;
                }
                i2 = i3;
                int durationMin2 = watchSoccerRecord2.getDurationMin();
                sb = new StringBuilder();
                if (watchSoccerRecord2.getHrAvgBpm() == null) {
                }
                sb.append("HR");
                if (watchSoccerRecord2.getHrAvgBpm() != null) {
                }
                if (watchSoccerRecord2.getHrMaxBpm() != null) {
                }
                sb.append(" · ");
                String sb22 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb22, "toString(...)");
                String obj22 = StringsKt.trim((CharSequence) (sb22 + "Recorded on watch (offline)")).toString();
                SoccerDao soccerDao32 = soccerRepository.soccerDao;
                SoccerSessionEntity soccerSessionEntity22 = new SoccerSessionEntity(0L, "TRAINING", watchSoccerRecord2.getStartTimeMs(), 0, durationMin2, i2, obj22, Boxing.boxLong(watchSoccerRecord2.getWatchSessionId()), watchSoccerRecord2.getHrAvgBpm(), watchSoccerRecord2.getHrMaxBpm(), null, null, null, null, 15361, null);
                soccerRepository$importWatchSoccerSession$12.L$0 = soccerRepository;
                soccerRepository$importWatchSoccerSession$12.L$1 = null;
                soccerRepository$importWatchSoccerSession$12.label = 2;
                obj = soccerDao32.insert(soccerSessionEntity22, soccerRepository$importWatchSoccerSession$12);
                if (obj == coroutine_suspended) {
                }
                longValue = ((Number) obj).longValue();
                SoccerDao soccerDao222 = soccerRepository.soccerDao;
                soccerRepository$importWatchSoccerSession$12.L$0 = soccerRepository;
                soccerRepository$importWatchSoccerSession$12.J$0 = longValue;
                soccerRepository$importWatchSoccerSession$12.label = 3;
                obj = soccerDao222.sessionById(longValue, soccerRepository$importWatchSoccerSession$12);
                if (obj == coroutine_suspended) {
                }
                SoccerRepository soccerRepository2222 = soccerRepository;
                j = longValue;
                soccerSessionEntity = (SoccerSessionEntity) obj;
                if (soccerSessionEntity != null) {
                }
                return Boxing.boxLong(j);
            }
        }
        soccerRepository$importWatchSoccerSession$1 = new SoccerRepository$importWatchSoccerSession$1(soccerRepository, continuation);
        SoccerRepository$importWatchSoccerSession$1 soccerRepository$importWatchSoccerSession$122 = soccerRepository$importWatchSoccerSession$1;
        obj = soccerRepository$importWatchSoccerSession$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = soccerRepository$importWatchSoccerSession$122.label;
        if (i != 0) {
        }
        if (obj == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0353 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x036d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0318  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object importMoyoungWorkout(MoyoungWorkout moyoungWorkout, Function2<? super Long, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super MoyoungImportResult> continuation) {
        SoccerRepository$importMoyoungWorkout$1 soccerRepository$importMoyoungWorkout$1;
        Object obj;
        int i;
        long dedupeId;
        MoyoungWorkout moyoungWorkout2;
        SoccerRepository soccerRepository;
        MoyoungWorkout moyoungWorkout3;
        String str;
        int i2;
        int i3;
        Iterator<T> it;
        Integer boxInt;
        Integer num;
        Integer avgHeartRate;
        String label;
        String label2;
        Object insert;
        String str2;
        int intValue;
        int intValue2;
        SoccerSessionEntity soccerSessionEntity;
        SoccerRepository soccerRepository2 = this;
        if (continuation instanceof SoccerRepository$importMoyoungWorkout$1) {
            soccerRepository$importMoyoungWorkout$1 = (SoccerRepository$importMoyoungWorkout$1) continuation;
            if ((soccerRepository$importMoyoungWorkout$1.label & Integer.MIN_VALUE) != 0) {
                soccerRepository$importMoyoungWorkout$1.label -= Integer.MIN_VALUE;
                obj = soccerRepository$importMoyoungWorkout$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = soccerRepository$importMoyoungWorkout$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    dedupeId = moyoungWorkout.getDedupeId();
                    Long boxLong = Boxing.boxLong(dedupeId);
                    soccerRepository$importMoyoungWorkout$1.L$0 = soccerRepository2;
                    moyoungWorkout2 = moyoungWorkout;
                    soccerRepository$importMoyoungWorkout$1.L$1 = moyoungWorkout2;
                    soccerRepository$importMoyoungWorkout$1.J$0 = dedupeId;
                    soccerRepository$importMoyoungWorkout$1.label = 1;
                    obj = function2.invoke(boxLong, soccerRepository$importMoyoungWorkout$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                str2 = (String) soccerRepository$importMoyoungWorkout$1.L$1;
                                soccerRepository = (SoccerRepository) soccerRepository$importMoyoungWorkout$1.L$0;
                                ResultKt.throwOnFailure(obj);
                                long longValue = ((Number) obj).longValue();
                                SoccerDao soccerDao = soccerRepository.soccerDao;
                                soccerRepository$importMoyoungWorkout$1.L$0 = soccerRepository;
                                soccerRepository$importMoyoungWorkout$1.L$1 = str2;
                                soccerRepository$importMoyoungWorkout$1.label = 4;
                                obj = soccerDao.sessionById(longValue, soccerRepository$importMoyoungWorkout$1);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                soccerSessionEntity = (SoccerSessionEntity) obj;
                                if (soccerSessionEntity != null) {
                                }
                                return MoyoungImportResult.IMPORTED;
                            }
                            if (i != 4) {
                                if (i != 5) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                                Unit unit = Unit.INSTANCE;
                                return MoyoungImportResult.IMPORTED;
                            }
                            str2 = (String) soccerRepository$importMoyoungWorkout$1.L$1;
                            soccerRepository = (SoccerRepository) soccerRepository$importMoyoungWorkout$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            soccerSessionEntity = (SoccerSessionEntity) obj;
                            if (soccerSessionEntity != null) {
                                String str3 = str2 + " · watch";
                                soccerRepository$importMoyoungWorkout$1.L$0 = null;
                                soccerRepository$importMoyoungWorkout$1.L$1 = null;
                                soccerRepository$importMoyoungWorkout$1.label = 5;
                                if (soccerRepository.upsertRecoveryForSession(soccerSessionEntity, str3, soccerRepository$importMoyoungWorkout$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                Unit unit2 = Unit.INSTANCE;
                            }
                            return MoyoungImportResult.IMPORTED;
                        }
                        dedupeId = soccerRepository$importMoyoungWorkout$1.J$0;
                        moyoungWorkout3 = (MoyoungWorkout) soccerRepository$importMoyoungWorkout$1.L$1;
                        soccerRepository = (SoccerRepository) soccerRepository$importMoyoungWorkout$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        if (obj == null) {
                            if (MoyoungSportLabels.INSTANCE.isFootball(moyoungWorkout3.getSportType())) {
                                str = "MATCH";
                            } else {
                                moyoungWorkout3.getSportType();
                                str = "TRAINING";
                            }
                            String str4 = str;
                            int durationMin = moyoungWorkout3.getDurationMin();
                            if (moyoungWorkout3.getAvgHeartRate() != null && moyoungWorkout3.getAvgHeartRate().intValue() >= 165) {
                                i3 = 9;
                            } else {
                                if (moyoungWorkout3.getAvgHeartRate() == null || moyoungWorkout3.getAvgHeartRate().intValue() < 150) {
                                    if (moyoungWorkout3.getAvgHeartRate() != null) {
                                        moyoungWorkout3.getAvgHeartRate().intValue();
                                    }
                                    i2 = 7;
                                    String label3 = MoyoungSportLabels.INSTANCE.label(moyoungWorkout3.getSportType());
                                    it = moyoungWorkout3.getHrSeries().iterator();
                                    if (it.hasNext()) {
                                        boxInt = null;
                                    } else {
                                        boxInt = Boxing.boxInt(((MoyoungHrParser.HrPoint) it.next()).getBpm());
                                        while (it.hasNext()) {
                                            Integer boxInt2 = Boxing.boxInt(((MoyoungHrParser.HrPoint) it.next()).getBpm());
                                            if (boxInt.compareTo(boxInt2) < 0) {
                                                boxInt = boxInt2;
                                            }
                                        }
                                    }
                                    num = boxInt;
                                    if (num == null) {
                                        num = moyoungWorkout3.getAvgHeartRate();
                                    }
                                    avgHeartRate = moyoungWorkout3.getAvgHeartRate();
                                    if (avgHeartRate == null) {
                                        List<MoyoungHrParser.HrPoint> hrSeries = moyoungWorkout3.getHrSeries();
                                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(hrSeries, 10));
                                        Iterator<T> it2 = hrSeries.iterator();
                                        while (it2.hasNext()) {
                                            arrayList.add(Boxing.boxInt(((MoyoungHrParser.HrPoint) it2.next()).getBpm()));
                                        }
                                        Double boxDouble = Boxing.boxDouble(CollectionsKt.averageOfInt(arrayList));
                                        if (Double.isNaN(boxDouble.doubleValue())) {
                                            boxDouble = null;
                                        }
                                        avgHeartRate = boxDouble != null ? Boxing.boxInt((int) boxDouble.doubleValue()) : null;
                                    }
                                    SoccerHrZones.ZoneMinutes fromHrSeries$default = SoccerHrZones.fromHrSeries$default(SoccerHrZones.INSTANCE, moyoungWorkout3.getHrSeries(), 0, 2, null);
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Da Fit · " + label3);
                                    if (avgHeartRate != null) {
                                        sb.append(" · HR avg " + avgHeartRate.intValue());
                                    }
                                    if (num != null) {
                                        sb.append(" · max " + num.intValue());
                                    }
                                    if (moyoungWorkout3.getSteps() > 0) {
                                        sb.append(" · " + moyoungWorkout3.getSteps() + " steps");
                                    }
                                    if (moyoungWorkout3.getDistanceM() > 0) {
                                        sb.append(" · " + moyoungWorkout3.getDistanceM() + " m");
                                    }
                                    if (moyoungWorkout3.getCalories() > 0) {
                                        sb.append(" · " + moyoungWorkout3.getCalories() + " kcal");
                                    }
                                    label = fromHrSeries$default.label();
                                    if (!StringsKt.isBlank(label)) {
                                        sb.append(" · " + label);
                                    }
                                    String sb2 = sb.toString();
                                    Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
                                    SoccerDao soccerDao2 = soccerRepository.soccerDao;
                                    long startTimeMs = moyoungWorkout3.getStartTimeMs();
                                    Long boxLong2 = Boxing.boxLong(dedupeId);
                                    Integer num2 = (avgHeartRate != null || 40 > (intValue2 = avgHeartRate.intValue()) || intValue2 >= 221) ? null : avgHeartRate;
                                    Integer num3 = (num != null || 40 > (intValue = num.intValue()) || intValue >= 221) ? null : num;
                                    Integer boxInt3 = Boxing.boxInt(moyoungWorkout3.getSteps());
                                    Integer num4 = boxInt3.intValue() <= 0 ? boxInt3 : null;
                                    Integer boxInt4 = Boxing.boxInt(moyoungWorkout3.getDistanceM());
                                    Integer num5 = boxInt4.intValue() <= 0 ? boxInt4 : null;
                                    Integer boxInt5 = Boxing.boxInt(moyoungWorkout3.getCalories());
                                    Integer num6 = boxInt5.intValue() <= 0 ? boxInt5 : null;
                                    label2 = fromHrSeries$default.label();
                                    if (StringsKt.isBlank(label2)) {
                                        label2 = null;
                                    }
                                    SoccerSessionEntity soccerSessionEntity2 = new SoccerSessionEntity(0L, str4, startTimeMs, 0, durationMin, i2, sb2, boxLong2, num2, num3, num4, num5, num6, label2 == null ? fromHrSeries$default.toJson() : null, 1, null);
                                    soccerRepository$importMoyoungWorkout$1.L$0 = soccerRepository;
                                    soccerRepository$importMoyoungWorkout$1.L$1 = label3;
                                    soccerRepository$importMoyoungWorkout$1.label = 3;
                                    insert = soccerDao2.insert(soccerSessionEntity2, soccerRepository$importMoyoungWorkout$1);
                                    if (insert != coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    obj = insert;
                                    str2 = label3;
                                    long longValue2 = ((Number) obj).longValue();
                                    SoccerDao soccerDao3 = soccerRepository.soccerDao;
                                    soccerRepository$importMoyoungWorkout$1.L$0 = soccerRepository;
                                    soccerRepository$importMoyoungWorkout$1.L$1 = str2;
                                    soccerRepository$importMoyoungWorkout$1.label = 4;
                                    obj = soccerDao3.sessionById(longValue2, soccerRepository$importMoyoungWorkout$1);
                                    if (obj == coroutine_suspended) {
                                    }
                                    soccerSessionEntity = (SoccerSessionEntity) obj;
                                    if (soccerSessionEntity != null) {
                                    }
                                    return MoyoungImportResult.IMPORTED;
                                }
                                i3 = 8;
                            }
                            i2 = i3;
                            String label32 = MoyoungSportLabels.INSTANCE.label(moyoungWorkout3.getSportType());
                            it = moyoungWorkout3.getHrSeries().iterator();
                            if (it.hasNext()) {
                            }
                            num = boxInt;
                            if (num == null) {
                            }
                            avgHeartRate = moyoungWorkout3.getAvgHeartRate();
                            if (avgHeartRate == null) {
                            }
                            SoccerHrZones.ZoneMinutes fromHrSeries$default2 = SoccerHrZones.fromHrSeries$default(SoccerHrZones.INSTANCE, moyoungWorkout3.getHrSeries(), 0, 2, null);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Da Fit · " + label32);
                            if (avgHeartRate != null) {
                            }
                            if (num != null) {
                            }
                            if (moyoungWorkout3.getSteps() > 0) {
                            }
                            if (moyoungWorkout3.getDistanceM() > 0) {
                            }
                            if (moyoungWorkout3.getCalories() > 0) {
                            }
                            label = fromHrSeries$default2.label();
                            if (!StringsKt.isBlank(label)) {
                            }
                            String sb22 = sb3.toString();
                            Intrinsics.checkNotNullExpressionValue(sb22, "toString(...)");
                            SoccerDao soccerDao22 = soccerRepository.soccerDao;
                            long startTimeMs2 = moyoungWorkout3.getStartTimeMs();
                            Long boxLong22 = Boxing.boxLong(dedupeId);
                            if (avgHeartRate != null) {
                            }
                            if (num != null) {
                            }
                            Integer boxInt32 = Boxing.boxInt(moyoungWorkout3.getSteps());
                            if (boxInt32.intValue() <= 0) {
                            }
                            Integer boxInt42 = Boxing.boxInt(moyoungWorkout3.getDistanceM());
                            if (boxInt42.intValue() <= 0) {
                            }
                            Integer boxInt52 = Boxing.boxInt(moyoungWorkout3.getCalories());
                            if (boxInt52.intValue() <= 0) {
                            }
                            label2 = fromHrSeries$default2.label();
                            if (StringsKt.isBlank(label2)) {
                            }
                            SoccerSessionEntity soccerSessionEntity22 = new SoccerSessionEntity(0L, str4, startTimeMs2, 0, durationMin, i2, sb22, boxLong22, num2, num3, num4, num5, num6, label2 == null ? fromHrSeries$default2.toJson() : null, 1, null);
                            soccerRepository$importMoyoungWorkout$1.L$0 = soccerRepository;
                            soccerRepository$importMoyoungWorkout$1.L$1 = label32;
                            soccerRepository$importMoyoungWorkout$1.label = 3;
                            insert = soccerDao22.insert(soccerSessionEntity22, soccerRepository$importMoyoungWorkout$1);
                            if (insert != coroutine_suspended) {
                            }
                        }
                        return MoyoungImportResult.ALREADY_SYNCED;
                    }
                    dedupeId = soccerRepository$importMoyoungWorkout$1.J$0;
                    MoyoungWorkout moyoungWorkout4 = (MoyoungWorkout) soccerRepository$importMoyoungWorkout$1.L$1;
                    SoccerRepository soccerRepository3 = (SoccerRepository) soccerRepository$importMoyoungWorkout$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    moyoungWorkout2 = moyoungWorkout4;
                    soccerRepository2 = soccerRepository3;
                }
                if (!((Boolean) obj).booleanValue()) {
                    SoccerDao soccerDao4 = soccerRepository2.soccerDao;
                    soccerRepository$importMoyoungWorkout$1.L$0 = soccerRepository2;
                    soccerRepository$importMoyoungWorkout$1.L$1 = moyoungWorkout2;
                    soccerRepository$importMoyoungWorkout$1.J$0 = dedupeId;
                    soccerRepository$importMoyoungWorkout$1.label = 2;
                    obj = soccerDao4.sessionByWatchId(dedupeId, soccerRepository$importMoyoungWorkout$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    MoyoungWorkout moyoungWorkout5 = moyoungWorkout2;
                    soccerRepository = soccerRepository2;
                    moyoungWorkout3 = moyoungWorkout5;
                    if (obj == null) {
                    }
                }
                return MoyoungImportResult.ALREADY_SYNCED;
            }
        }
        soccerRepository$importMoyoungWorkout$1 = new SoccerRepository$importMoyoungWorkout$1(soccerRepository2, continuation);
        obj = soccerRepository$importMoyoungWorkout$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = soccerRepository$importMoyoungWorkout$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return MoyoungImportResult.ALREADY_SYNCED;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object importMoyoungWorkout$default(SoccerRepository soccerRepository, MoyoungWorkout moyoungWorkout, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = new SoccerRepository$importMoyoungWorkout$2(null);
        }
        return soccerRepository.importMoyoungWorkout(moyoungWorkout, function2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object reconcileRecoveryEvents(Continuation<? super Unit> continuation) {
        SoccerRepository$reconcileRecoveryEvents$1 soccerRepository$reconcileRecoveryEvents$1;
        int i;
        SoccerRepository soccerRepository;
        Iterator it;
        if (continuation instanceof SoccerRepository$reconcileRecoveryEvents$1) {
            soccerRepository$reconcileRecoveryEvents$1 = (SoccerRepository$reconcileRecoveryEvents$1) continuation;
            if ((soccerRepository$reconcileRecoveryEvents$1.label & Integer.MIN_VALUE) != 0) {
                soccerRepository$reconcileRecoveryEvents$1.label -= Integer.MIN_VALUE;
                Object obj = soccerRepository$reconcileRecoveryEvents$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = soccerRepository$reconcileRecoveryEvents$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    SoccerDao soccerDao = this.soccerDao;
                    soccerRepository$reconcileRecoveryEvents$1.L$0 = this;
                    soccerRepository$reconcileRecoveryEvents$1.label = 1;
                    obj = soccerDao.allSessions(soccerRepository$reconcileRecoveryEvents$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = (Iterator) soccerRepository$reconcileRecoveryEvents$1.L$1;
                        soccerRepository = (SoccerRepository) soccerRepository$reconcileRecoveryEvents$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        while (it.hasNext()) {
                            SoccerSessionEntity soccerSessionEntity = (SoccerSessionEntity) it.next();
                            soccerRepository$reconcileRecoveryEvents$1.L$0 = soccerRepository;
                            soccerRepository$reconcileRecoveryEvents$1.L$1 = it;
                            soccerRepository$reconcileRecoveryEvents$1.label = 2;
                            if (upsertRecoveryForSession$default(soccerRepository, soccerSessionEntity, null, soccerRepository$reconcileRecoveryEvents$1, 2, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    this = (SoccerRepository) soccerRepository$reconcileRecoveryEvents$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                soccerRepository = this;
                it = ((List) obj).iterator();
                while (it.hasNext()) {
                }
                return Unit.INSTANCE;
            }
        }
        soccerRepository$reconcileRecoveryEvents$1 = new SoccerRepository$reconcileRecoveryEvents$1(this, continuation);
        Object obj2 = soccerRepository$reconcileRecoveryEvents$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = soccerRepository$reconcileRecoveryEvents$1.label;
        if (i != 0) {
        }
        soccerRepository = this;
        it = ((List) obj2).iterator();
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object upsertRecoveryForSession(SoccerSessionEntity soccerSessionEntity, String str, Continuation<? super Unit> continuation) {
        SoccerRepository$upsertRecoveryForSession$1 soccerRepository$upsertRecoveryForSession$1;
        Object coroutine_suspended;
        int i;
        int coerceAtLeast;
        SoccerSessionEntity soccerSessionEntity2;
        String str2;
        String lowerCase;
        StringBuilder sb;
        Integer hrAvgBpm;
        Integer hrMaxBpm;
        Integer steps;
        Integer distanceM;
        Integer calories;
        SoccerHrZones.ZoneMinutes parseJson;
        RecoveryDao recoveryDao;
        RecoveryEventEntity recoveryEventEntity;
        String label;
        SoccerRepository soccerRepository = this;
        if (continuation instanceof SoccerRepository$upsertRecoveryForSession$1) {
            soccerRepository$upsertRecoveryForSession$1 = (SoccerRepository$upsertRecoveryForSession$1) continuation;
            if ((soccerRepository$upsertRecoveryForSession$1.label & Integer.MIN_VALUE) != 0) {
                soccerRepository$upsertRecoveryForSession$1.label -= Integer.MIN_VALUE;
                Object obj = soccerRepository$upsertRecoveryForSession$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = soccerRepository$upsertRecoveryForSession$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    coerceAtLeast = RangesKt.coerceAtLeast(soccerSessionEntity.getWarmupMin() + soccerSessionEntity.getPlayMin(), 0);
                    if (coerceAtLeast <= 0) {
                        return Unit.INSTANCE;
                    }
                    RecoveryDao recoveryDao2 = soccerRepository.recoveryDao;
                    long id = soccerSessionEntity.getId();
                    soccerRepository$upsertRecoveryForSession$1.L$0 = soccerRepository;
                    soccerRepository$upsertRecoveryForSession$1.L$1 = soccerSessionEntity;
                    soccerRepository$upsertRecoveryForSession$1.L$2 = str;
                    soccerRepository$upsertRecoveryForSession$1.I$0 = coerceAtLeast;
                    soccerRepository$upsertRecoveryForSession$1.label = 1;
                    if (recoveryDao2.deleteForSource("SOCCER", id, soccerRepository$upsertRecoveryForSession$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    soccerSessionEntity2 = soccerSessionEntity;
                    str2 = str;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    int i2 = soccerRepository$upsertRecoveryForSession$1.I$0;
                    str2 = (String) soccerRepository$upsertRecoveryForSession$1.L$2;
                    soccerSessionEntity2 = (SoccerSessionEntity) soccerRepository$upsertRecoveryForSession$1.L$1;
                    SoccerRepository soccerRepository2 = (SoccerRepository) soccerRepository$upsertRecoveryForSession$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    coerceAtLeast = i2;
                    soccerRepository = soccerRepository2;
                }
                RecoveryModel.RecoveryEstimate estimateSoccer = RecoveryModel.INSTANCE.estimateSoccer(soccerSessionEntity2.getWarmupMin(), soccerSessionEntity2.getPlayMin(), soccerSessionEntity2.getIntensity(), soccerSessionEntity2.getKind(), soccerSessionEntity2.getHrAvgBpm(), soccerSessionEntity2.getHrMaxBpm(), soccerRepository.sportLabel.invoke(), soccerRepository.demographics.invoke());
                lowerCase = soccerSessionEntity2.getKind().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (lowerCase.length() > 0) {
                    StringBuilder append = new StringBuilder().append((Object) CharsKt.titlecase(lowerCase.charAt(0)));
                    String substring = lowerCase.substring(1);
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    lowerCase = append.append(substring).toString();
                }
                sb = new StringBuilder();
                sb.append(lowerCase);
                if (soccerSessionEntity2.getWarmupMin() > 0 && soccerSessionEntity2.getPlayMin() > 0) {
                    sb.append(" · warmup " + soccerSessionEntity2.getWarmupMin() + "m · play " + soccerSessionEntity2.getPlayMin() + "m");
                }
                sb.append(" · " + coerceAtLeast + "m total · Int " + soccerSessionEntity2.getIntensity() + "/10");
                hrAvgBpm = soccerSessionEntity2.getHrAvgBpm();
                if (hrAvgBpm != null) {
                    sb.append(" · HR avg " + hrAvgBpm.intValue());
                }
                hrMaxBpm = soccerSessionEntity2.getHrMaxBpm();
                if (hrMaxBpm != null) {
                    sb.append(" · HR max " + hrMaxBpm.intValue());
                }
                steps = soccerSessionEntity2.getSteps();
                if (steps != null) {
                    if (steps.intValue() <= 0) {
                        steps = null;
                    }
                    if (steps != null) {
                        sb.append(" · " + steps.intValue() + " steps");
                    }
                }
                distanceM = soccerSessionEntity2.getDistanceM();
                if (distanceM != null) {
                    if (distanceM.intValue() <= 0) {
                        distanceM = null;
                    }
                    if (distanceM != null) {
                        sb.append(" · " + distanceM.intValue() + "m");
                    }
                }
                calories = soccerSessionEntity2.getCalories();
                if (calories != null) {
                    if (calories.intValue() <= 0) {
                        calories = null;
                    }
                    if (calories != null) {
                        sb.append(" · " + calories.intValue() + " kcal");
                    }
                }
                parseJson = SoccerHrZones.INSTANCE.parseJson(soccerSessionEntity2.getHrZonesJson());
                if (parseJson != null && (label = parseJson.label()) != null) {
                    if (StringsKt.isBlank(label)) {
                        label = null;
                    }
                    if (label != null) {
                        sb.append(" · " + label);
                    }
                }
                if (str2 != null) {
                    sb.append(" · " + str2);
                }
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
                recoveryDao = soccerRepository.recoveryDao;
                recoveryEventEntity = new RecoveryEventEntity(0L, "SOCCER", soccerSessionEntity2.getId(), soccerSessionEntity2.getStartTimeMs(), soccerSessionEntity2.getStartTimeMs() + ((long) (estimateSoccer.getHours() * 3600000.0d)), estimateSoccer.getLoadScore(), sb2, 1, null);
                soccerRepository$upsertRecoveryForSession$1.L$0 = null;
                soccerRepository$upsertRecoveryForSession$1.L$1 = null;
                soccerRepository$upsertRecoveryForSession$1.L$2 = null;
                soccerRepository$upsertRecoveryForSession$1.label = 2;
                if (recoveryDao.insert(recoveryEventEntity, soccerRepository$upsertRecoveryForSession$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        soccerRepository$upsertRecoveryForSession$1 = new SoccerRepository$upsertRecoveryForSession$1(soccerRepository, continuation);
        Object obj2 = soccerRepository$upsertRecoveryForSession$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = soccerRepository$upsertRecoveryForSession$1.label;
        if (i != 0) {
        }
        RecoveryModel.RecoveryEstimate estimateSoccer2 = RecoveryModel.INSTANCE.estimateSoccer(soccerSessionEntity2.getWarmupMin(), soccerSessionEntity2.getPlayMin(), soccerSessionEntity2.getIntensity(), soccerSessionEntity2.getKind(), soccerSessionEntity2.getHrAvgBpm(), soccerSessionEntity2.getHrMaxBpm(), soccerRepository.sportLabel.invoke(), soccerRepository.demographics.invoke());
        lowerCase = soccerSessionEntity2.getKind().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (lowerCase.length() > 0) {
        }
        sb = new StringBuilder();
        sb.append(lowerCase);
        if (soccerSessionEntity2.getWarmupMin() > 0) {
            sb.append(" · warmup " + soccerSessionEntity2.getWarmupMin() + "m · play " + soccerSessionEntity2.getPlayMin() + "m");
        }
        sb.append(" · " + coerceAtLeast + "m total · Int " + soccerSessionEntity2.getIntensity() + "/10");
        hrAvgBpm = soccerSessionEntity2.getHrAvgBpm();
        if (hrAvgBpm != null) {
        }
        hrMaxBpm = soccerSessionEntity2.getHrMaxBpm();
        if (hrMaxBpm != null) {
        }
        steps = soccerSessionEntity2.getSteps();
        if (steps != null) {
        }
        distanceM = soccerSessionEntity2.getDistanceM();
        if (distanceM != null) {
        }
        calories = soccerSessionEntity2.getCalories();
        if (calories != null) {
        }
        parseJson = SoccerHrZones.INSTANCE.parseJson(soccerSessionEntity2.getHrZonesJson());
        if (parseJson != null) {
            if (StringsKt.isBlank(label)) {
            }
            if (label != null) {
            }
        }
        if (str2 != null) {
        }
        String sb22 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb22, "toString(...)");
        recoveryDao = soccerRepository.recoveryDao;
        recoveryEventEntity = new RecoveryEventEntity(0L, "SOCCER", soccerSessionEntity2.getId(), soccerSessionEntity2.getStartTimeMs(), soccerSessionEntity2.getStartTimeMs() + ((long) (estimateSoccer2.getHours() * 3600000.0d)), estimateSoccer2.getLoadScore(), sb22, 1, null);
        soccerRepository$upsertRecoveryForSession$1.L$0 = null;
        soccerRepository$upsertRecoveryForSession$1.L$1 = null;
        soccerRepository$upsertRecoveryForSession$1.L$2 = null;
        soccerRepository$upsertRecoveryForSession$1.label = 2;
        if (recoveryDao.insert(recoveryEventEntity, soccerRepository$upsertRecoveryForSession$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    static /* synthetic */ Object upsertRecoveryForSession$default(SoccerRepository soccerRepository, SoccerSessionEntity soccerSessionEntity, String str, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return soccerRepository.upsertRecoveryForSession(soccerSessionEntity, str, continuation);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SoccerRepository.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/example/rungps/data/repo/SoccerRepository$MoyoungImportResult;", "", "<init>", "(Ljava/lang/String;I)V", "IMPORTED", "ALREADY_SYNCED", "ON_PHONE_ALREADY", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MoyoungImportResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ MoyoungImportResult[] $VALUES;
        public static final MoyoungImportResult IMPORTED = new MoyoungImportResult("IMPORTED", 0);
        public static final MoyoungImportResult ALREADY_SYNCED = new MoyoungImportResult("ALREADY_SYNCED", 1);
        public static final MoyoungImportResult ON_PHONE_ALREADY = new MoyoungImportResult("ON_PHONE_ALREADY", 2);

        private static final /* synthetic */ MoyoungImportResult[] $values() {
            return new MoyoungImportResult[]{IMPORTED, ALREADY_SYNCED, ON_PHONE_ALREADY};
        }

        public static EnumEntries<MoyoungImportResult> getEntries() {
            return $ENTRIES;
        }

        private MoyoungImportResult(String str, int i) {
        }

        static {
            MoyoungImportResult[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static MoyoungImportResult valueOf(String str) {
            return (MoyoungImportResult) Enum.valueOf(MoyoungImportResult.class, str);
        }

        public static MoyoungImportResult[] values() {
            return (MoyoungImportResult[]) $VALUES.clone();
        }
    }
}
