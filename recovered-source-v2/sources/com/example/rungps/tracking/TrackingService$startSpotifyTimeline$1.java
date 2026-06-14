package com.example.rungps.tracking;

import android.graphics.Bitmap;
import com.example.rungps.data.Repository;
import com.example.rungps.media.MediaArtStore;
import com.example.rungps.media.SessionMediaReader;
import com.example.rungps.media.SessionMediaSnapshot;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: TrackingService.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.tracking.TrackingService$startSpotifyTimeline$1", f = "TrackingService.kt", i = {0, 1, 1, 2}, l = {776, 779, 791}, m = "invokeSuspend", n = {"$this$launch", "$this$launch", "now", "$this$launch"}, s = {"L$0", "L$0", "J$0", "L$0"})
/* loaded from: classes3.dex */
final class TrackingService$startSpotifyTimeline$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $runId;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TrackingService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TrackingService$startSpotifyTimeline$1(TrackingService trackingService, long j, Continuation<? super TrackingService$startSpotifyTimeline$1> continuation) {
        super(2, continuation);
        this.this$0 = trackingService;
        this.$runId = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TrackingService$startSpotifyTimeline$1 trackingService$startSpotifyTimeline$1 = new TrackingService$startSpotifyTimeline$1(this.this$0, this.$runId, continuation);
        trackingService$startSpotifyTimeline$1.L$0 = obj;
        return trackingService$startSpotifyTimeline$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackingService$startSpotifyTimeline$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:37|(1:55)(2:39|(1:41)(1:54))|42|43|44|45|46|(1:48)|10|11|12|13|14|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x016c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x016d, code lost:
    
        r16 = r10;
        r17 = r11;
        r18 = r12;
        r19 = r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0156 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0154 -> B:10:0x0157). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x00d1 -> B:14:0x005a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        int i;
        int i2;
        int i3;
        CoroutineScope coroutineScope2;
        CoroutineScope coroutineScope3;
        long j;
        Object obj2;
        SessionMediaSnapshot sessionMediaSnapshot;
        String timelineKey;
        String str;
        boolean areEqual;
        long j2;
        String artUrl;
        String str2;
        Repository repo;
        Object addSpotifyTimelineForRun;
        boolean z;
        Repository repo2;
        boolean z2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        int i5 = 3;
        int i6 = 2;
        int i7 = 1;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            z2 = this.this$0.isRunning;
            if (z2) {
            }
            return Unit.INSTANCE;
        }
        if (i4 == 1) {
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            z = this.this$0.isRunning;
            if (z) {
            }
            return Unit.INSTANCE;
        }
        if (i4 == 2) {
            long j3 = this.J$0;
            CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            obj2 = obj;
            j = j3;
            coroutineScope3 = coroutineScope4;
            sessionMediaSnapshot = (SessionMediaSnapshot) obj2;
            if (sessionMediaSnapshot != null) {
                timelineKey = sessionMediaSnapshot.timelineKey();
                str = this.this$0.lastSpotifyKey;
                areEqual = Intrinsics.areEqual(timelineKey, str);
                j2 = this.this$0.lastSpotifySavedAtMs;
                if (j - j2 <= 60000) {
                }
                if (areEqual) {
                }
                this.this$0.lastSpotifyKey = timelineKey;
                this.this$0.lastSpotifySavedAtMs = j;
                artUrl = sessionMediaSnapshot.getArtUrl();
                if (artUrl != null) {
                }
                TrackingService trackingService = this.this$0;
                long j4 = this.$runId;
                Result.Companion companion = Result.INSTANCE;
                repo = trackingService.getRepo();
                boolean isPlaying = sessionMediaSnapshot.isPlaying();
                String itemType = sessionMediaSnapshot.getItemType();
                String itemId = sessionMediaSnapshot.getItemId();
                String title = sessionMediaSnapshot.getTitle();
                String subtitle = sessionMediaSnapshot.getSubtitle();
                Long progressMs = sessionMediaSnapshot.getProgressMs();
                this.L$0 = coroutineScope3;
                this.label = i5;
                coroutineScope2 = coroutineScope3;
                i3 = i7;
                i2 = i6;
                i = i5;
                addSpotifyTimelineForRun = repo.addSpotifyTimelineForRun(j4, j, isPlaying, itemType, itemId, title, subtitle, progressMs, str2, this);
                if (addSpotifyTimelineForRun == coroutine_suspended) {
                }
                Result.m7905constructorimpl(Boxing.boxLong(((Number) addSpotifyTimelineForRun).longValue()));
                coroutineScope = coroutineScope2;
                i7 = i3;
                i6 = i2;
                i5 = i;
                z2 = this.this$0.isRunning;
                if (z2) {
                }
                return Unit.INSTANCE;
            }
            coroutineScope = coroutineScope3;
            z2 = this.this$0.isRunning;
            if (z2) {
            }
            return Unit.INSTANCE;
        }
        if (i4 != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        CoroutineScope coroutineScope5 = (CoroutineScope) this.L$0;
        try {
            ResultKt.throwOnFailure(obj);
            addSpotifyTimelineForRun = obj;
            coroutineScope2 = coroutineScope5;
            i3 = 1;
            i2 = 2;
            i = 3;
        } catch (Throwable th) {
            i3 = 1;
            i2 = 2;
            i = 3;
            coroutineScope = coroutineScope5;
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        try {
        } catch (Throwable th2) {
            Throwable th3 = th2;
            Throwable th4 = th3;
            coroutineScope = coroutineScope2;
            Result.Companion companion3 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th4));
            i7 = i3;
            i6 = i2;
            i5 = i;
            z2 = this.this$0.isRunning;
            if (z2) {
            }
            return Unit.INSTANCE;
        }
        Result.m7905constructorimpl(Boxing.boxLong(((Number) addSpotifyTimelineForRun).longValue()));
        coroutineScope = coroutineScope2;
        i7 = i3;
        i6 = i2;
        i5 = i;
        z2 = this.this$0.isRunning;
        if (z2) {
            this.L$0 = coroutineScope;
            this.label = i7;
            if (DelayKt.delay(15000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            z = this.this$0.isRunning;
            if (z) {
                long currentTimeMillis = System.currentTimeMillis();
                SessionMediaReader sessionMediaReader = SessionMediaReader.INSTANCE;
                TrackingService trackingService2 = this.this$0;
                TrackingService trackingService3 = trackingService2;
                repo2 = trackingService2.getRepo();
                this.L$0 = coroutineScope;
                this.J$0 = currentTimeMillis;
                this.label = i6;
                obj2 = sessionMediaReader.read(trackingService3, repo2, this);
                if (obj2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope3 = coroutineScope;
                j = currentTimeMillis;
                sessionMediaSnapshot = (SessionMediaSnapshot) obj2;
                if (sessionMediaSnapshot != null && (sessionMediaSnapshot.isPlaying() || sessionMediaSnapshot.isPodcast())) {
                    timelineKey = sessionMediaSnapshot.timelineKey();
                    str = this.this$0.lastSpotifyKey;
                    areEqual = Intrinsics.areEqual(timelineKey, str);
                    j2 = this.this$0.lastSpotifySavedAtMs;
                    int i8 = j - j2 <= 60000 ? i7 : 0;
                    if (areEqual || i8 != 0) {
                        this.this$0.lastSpotifyKey = timelineKey;
                        this.this$0.lastSpotifySavedAtMs = j;
                        artUrl = sessionMediaSnapshot.getArtUrl();
                        if (artUrl != null) {
                            str2 = artUrl;
                        } else {
                            Bitmap deviceArt = sessionMediaSnapshot.getDeviceArt();
                            if (deviceArt != null) {
                                str2 = MediaArtStore.INSTANCE.saveDeviceArt(this.this$0, this.$runId + "_" + timelineKey.hashCode(), deviceArt);
                            } else {
                                str2 = null;
                            }
                        }
                        TrackingService trackingService4 = this.this$0;
                        long j42 = this.$runId;
                        Result.Companion companion4 = Result.INSTANCE;
                        repo = trackingService4.getRepo();
                        boolean isPlaying2 = sessionMediaSnapshot.isPlaying();
                        String itemType2 = sessionMediaSnapshot.getItemType();
                        String itemId2 = sessionMediaSnapshot.getItemId();
                        String title2 = sessionMediaSnapshot.getTitle();
                        String subtitle2 = sessionMediaSnapshot.getSubtitle();
                        Long progressMs2 = sessionMediaSnapshot.getProgressMs();
                        this.L$0 = coroutineScope3;
                        this.label = i5;
                        coroutineScope2 = coroutineScope3;
                        i3 = i7;
                        i2 = i6;
                        i = i5;
                        addSpotifyTimelineForRun = repo.addSpotifyTimelineForRun(j42, j, isPlaying2, itemType2, itemId2, title2, subtitle2, progressMs2, str2, this);
                        if (addSpotifyTimelineForRun == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Result.m7905constructorimpl(Boxing.boxLong(((Number) addSpotifyTimelineForRun).longValue()));
                        coroutineScope = coroutineScope2;
                        i7 = i3;
                        i6 = i2;
                        i5 = i;
                        z2 = this.this$0.isRunning;
                        if (z2) {
                        }
                    }
                }
                coroutineScope = coroutineScope3;
                z2 = this.this$0.isRunning;
                if (z2) {
                }
            }
        }
        return Unit.INSTANCE;
    }
}
