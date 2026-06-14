package com.example.rungps.ui.main;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import com.example.rungps.nfc.GymCheckIn;
import com.example.rungps.nfc.GymLocation;
import com.example.rungps.nfc.GymLocationStore;
import com.example.rungps.nfc.GymNfcConfig;
import com.example.rungps.nfc.RegisteredGymCard;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: GymNfcSetupPanel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.GymNfcSetupPanelKt$GymNfcSetupPanel$requestLocationAndSave$1", f = "GymNfcSetupPanel.kt", i = {}, l = {124, 129}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class GymNfcSetupPanelKt$GymNfcSetupPanel$requestLocationAndSave$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<List<RegisteredGymCard>> $cards$delegate;
    final /* synthetic */ MutableState<List<GymCheckIn>> $checkIns$delegate;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableFloatState $defaultRadiusM$delegate;
    final /* synthetic */ MutableState<List<GymLocation>> $locations$delegate;
    final /* synthetic */ MutableState<String> $newLocationName$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GymNfcSetupPanelKt$GymNfcSetupPanel$requestLocationAndSave$1(Context context, MutableState<String> mutableState, MutableState<List<GymLocation>> mutableState2, MutableState<List<RegisteredGymCard>> mutableState3, MutableState<List<GymCheckIn>> mutableState4, MutableFloatState mutableFloatState, Continuation<? super GymNfcSetupPanelKt$GymNfcSetupPanel$requestLocationAndSave$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$newLocationName$delegate = mutableState;
        this.$locations$delegate = mutableState2;
        this.$cards$delegate = mutableState3;
        this.$checkIns$delegate = mutableState4;
        this.$defaultRadiusM$delegate = mutableFloatState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GymNfcSetupPanelKt$GymNfcSetupPanel$requestLocationAndSave$1(this.$ctx, this.$newLocationName$delegate, this.$locations$delegate, this.$cards$delegate, this.$checkIns$delegate, this.$defaultRadiusM$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymNfcSetupPanelKt$GymNfcSetupPanel$requestLocationAndSave$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = BuildersKt.withContext(Dispatchers.getIO(), new GymNfcSetupPanelKt$GymNfcSetupPanel$requestLocationAndSave$1$pair$1(this.$ctx, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                GymNfcSetupPanelKt.GymNfcSetupPanel$refresh(this.$ctx, this.$locations$delegate, this.$cards$delegate, this.$checkIns$delegate, this.$defaultRadiusM$delegate);
                Toast.makeText(this.$ctx, "Gym location saved", 0).show();
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        Pair pair = (Pair) obj;
        if (pair == null) {
            Toast.makeText(this.$ctx, "Could not get GPS fix — try again outdoors", 1).show();
            return Unit.INSTANCE;
        }
        this.label = 2;
        if (BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.$ctx, pair, this.$newLocationName$delegate, null), this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        GymNfcSetupPanelKt.GymNfcSetupPanel$refresh(this.$ctx, this.$locations$delegate, this.$cards$delegate, this.$checkIns$delegate, this.$defaultRadiusM$delegate);
        Toast.makeText(this.$ctx, "Gym location saved", 0).show();
        return Unit.INSTANCE;
    }

    /* compiled from: GymNfcSetupPanel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.main.GymNfcSetupPanelKt$GymNfcSetupPanel$requestLocationAndSave$1$1", f = "GymNfcSetupPanel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.main.GymNfcSetupPanelKt$GymNfcSetupPanel$requestLocationAndSave$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $ctx;
        final /* synthetic */ MutableState<String> $newLocationName$delegate;
        final /* synthetic */ Pair<Double, Double> $pair;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context, Pair<Double, Double> pair, MutableState<String> mutableState, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$ctx = context;
            this.$pair = pair;
            this.$newLocationName$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$ctx, this.$pair, this.$newLocationName$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String GymNfcSetupPanel$lambda$14;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            GymLocationStore gymLocationStore = GymLocationStore.INSTANCE;
            Context context = this.$ctx;
            GymNfcSetupPanel$lambda$14 = GymNfcSetupPanelKt.GymNfcSetupPanel$lambda$14(this.$newLocationName$delegate);
            String obj2 = StringsKt.trim((CharSequence) GymNfcSetupPanel$lambda$14).toString();
            if (obj2.length() == 0) {
                obj2 = "Gym";
            }
            gymLocationStore.add(context, obj2, this.$pair.getFirst().doubleValue(), this.$pair.getSecond().doubleValue());
            GymNfcConfig.INSTANCE.updateLastLocation(this.$ctx, this.$pair.getFirst().doubleValue(), this.$pair.getSecond().doubleValue());
            return Unit.INSTANCE;
        }
    }
}
