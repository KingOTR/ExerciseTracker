package com.example.rungps.nfc;

import android.content.Context;
import android.location.Location;
import androidx.core.content.ContextCompat;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* compiled from: GymLocationHelper.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\tJ$\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\t¨\u0006\r"}, d2 = {"Lcom/example/rungps/nfc/GymLocationHelper;", "", "<init>", "()V", "hasLocationPermission", "", "context", "Landroid/content/Context;", "refreshStoredLocation", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchCurrentLocation", "Lkotlin/Pair;", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymLocationHelper {
    public static final int $stable = 0;
    public static final GymLocationHelper INSTANCE = new GymLocationHelper();

    private GymLocationHelper() {
    }

    public final boolean hasLocationPermission(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object refreshStoredLocation(Context context, Continuation<? super Boolean> continuation) {
        GymLocationHelper$refreshStoredLocation$1 gymLocationHelper$refreshStoredLocation$1;
        int i;
        Pair pair;
        if (continuation instanceof GymLocationHelper$refreshStoredLocation$1) {
            gymLocationHelper$refreshStoredLocation$1 = (GymLocationHelper$refreshStoredLocation$1) continuation;
            if ((gymLocationHelper$refreshStoredLocation$1.label & Integer.MIN_VALUE) != 0) {
                gymLocationHelper$refreshStoredLocation$1.label -= Integer.MIN_VALUE;
                Object obj = gymLocationHelper$refreshStoredLocation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = gymLocationHelper$refreshStoredLocation$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!hasLocationPermission(context)) {
                        return Boxing.boxBoolean(false);
                    }
                    gymLocationHelper$refreshStoredLocation$1.L$0 = context;
                    gymLocationHelper$refreshStoredLocation$1.label = 1;
                    obj = fetchCurrentLocation(context, gymLocationHelper$refreshStoredLocation$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    context = (Context) gymLocationHelper$refreshStoredLocation$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                Context context2 = context;
                pair = (Pair) obj;
                if (pair != null) {
                    return Boxing.boxBoolean(false);
                }
                GymNfcConfig.INSTANCE.updateLastLocation(context2, ((Number) pair.getFirst()).doubleValue(), ((Number) pair.getSecond()).doubleValue());
                return Boxing.boxBoolean(true);
            }
        }
        gymLocationHelper$refreshStoredLocation$1 = new GymLocationHelper$refreshStoredLocation$1(this, continuation);
        Object obj2 = gymLocationHelper$refreshStoredLocation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = gymLocationHelper$refreshStoredLocation$1.label;
        if (i != 0) {
        }
        Context context22 = context;
        pair = (Pair) obj2;
        if (pair != null) {
        }
    }

    public final Object fetchCurrentLocation(Context context, Continuation<? super Pair<Double, Double>> continuation) {
        if (!hasLocationPermission(context)) {
            return null;
        }
        final FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context);
        Intrinsics.checkNotNullExpressionValue(fusedLocationProviderClient, "getFusedLocationProviderClient(...)");
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        fusedLocationProviderClient.getLastLocation().addOnSuccessListener(new GymLocationHelper$sam$com_google_android_gms_tasks_OnSuccessListener$0(new Function1<Location, Unit>() { // from class: com.example.rungps.nfc.GymLocationHelper$fetchCurrentLocation$2$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Location location) {
                invoke2(location);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Location location) {
                if (location != null && cancellableContinuationImpl2.isActive()) {
                    CancellableContinuation<Pair<Double, Double>> cancellableContinuation = cancellableContinuationImpl2;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m7905constructorimpl(TuplesKt.to(Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()))));
                    return;
                }
                CancellationToken token = new CancellationTokenSource().getToken();
                Intrinsics.checkNotNullExpressionValue(token, "getToken(...)");
                Task<Location> currentLocation = fusedLocationProviderClient.getCurrentLocation(102, token);
                final CancellableContinuation<Pair<Double, Double>> cancellableContinuation2 = cancellableContinuationImpl2;
                Task<Location> addOnSuccessListener = currentLocation.addOnSuccessListener(new GymLocationHelper$sam$com_google_android_gms_tasks_OnSuccessListener$0(new Function1<Location, Unit>() { // from class: com.example.rungps.nfc.GymLocationHelper$fetchCurrentLocation$2$1.1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Location location2) {
                        invoke2(location2);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Location location2) {
                        if (cancellableContinuation2.isActive()) {
                            CancellableContinuation<Pair<Double, Double>> cancellableContinuation3 = cancellableContinuation2;
                            Pair pair = location2 != null ? TuplesKt.to(Double.valueOf(location2.getLatitude()), Double.valueOf(location2.getLongitude())) : null;
                            Result.Companion companion2 = Result.INSTANCE;
                            cancellableContinuation3.resumeWith(Result.m7905constructorimpl(pair));
                        }
                    }
                }));
                final CancellableContinuation<Pair<Double, Double>> cancellableContinuation3 = cancellableContinuationImpl2;
                addOnSuccessListener.addOnFailureListener(new OnFailureListener() { // from class: com.example.rungps.nfc.GymLocationHelper$fetchCurrentLocation$2$1.2
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (cancellableContinuation3.isActive()) {
                            CancellableContinuation<Pair<Double, Double>> cancellableContinuation4 = cancellableContinuation3;
                            Result.Companion companion2 = Result.INSTANCE;
                            cancellableContinuation4.resumeWith(Result.m7905constructorimpl(null));
                        }
                    }
                });
            }
        })).addOnFailureListener(new OnFailureListener() { // from class: com.example.rungps.nfc.GymLocationHelper$fetchCurrentLocation$2$2
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (cancellableContinuationImpl2.isActive()) {
                    CancellableContinuation<Pair<Double, Double>> cancellableContinuation = cancellableContinuationImpl2;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m7905constructorimpl(null));
                }
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
