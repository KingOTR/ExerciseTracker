package com.example.rungps.sleep;

import android.content.Context;
import com.example.rungps.sleep.SleepCalendarHelper;
import com.google.android.gms.auth.GoogleAuthUtil;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.time.ZoneId;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GoogleCalendarLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/example/rungps/sleep/SleepCalendarHelper$MorningCommitment;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sleep.GoogleCalendarLink$tomorrowCommitment$2", f = "GoogleCalendarLink.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class GoogleCalendarLink$tomorrowCommitment$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SleepCalendarHelper.MorningCommitment>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ int $travelBufferMin;
    final /* synthetic */ ZoneId $zone;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoogleCalendarLink$tomorrowCommitment$2(Context context, int i, ZoneId zoneId, Continuation<? super GoogleCalendarLink$tomorrowCommitment$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$travelBufferMin = i;
        this.$zone = zoneId;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GoogleCalendarLink$tomorrowCommitment$2 googleCalendarLink$tomorrowCommitment$2 = new GoogleCalendarLink$tomorrowCommitment$2(this.$context, this.$travelBufferMin, this.$zone, continuation);
        googleCalendarLink$tomorrowCommitment$2.L$0 = obj;
        return googleCalendarLink$tomorrowCommitment$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SleepCalendarHelper.MorningCommitment> continuation) {
        return ((GoogleCalendarLink$tomorrowCommitment$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String email;
        String obj2;
        Object m7905constructorimpl;
        SleepCalendarHelper.MorningCommitment fetchTomorrowEvents;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        GoogleSignInAccount lastAccount = GoogleCalendarLink.INSTANCE.lastAccount(this.$context);
        if (lastAccount != null && (email = lastAccount.getEmail()) != null && (obj2 = StringsKt.trim((CharSequence) email).toString()) != null) {
            if (StringsKt.isBlank(obj2)) {
                obj2 = null;
            }
            if (obj2 != null) {
                Context context = this.$context;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    m7905constructorimpl = Result.m7905constructorimpl(GoogleAuthUtil.getToken(context, obj2, "oauth2:https://www.googleapis.com/auth/calendar.readonly"));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                    m7905constructorimpl = null;
                }
                String str = (String) m7905constructorimpl;
                if (str == null) {
                    return null;
                }
                fetchTomorrowEvents = GoogleCalendarLink.INSTANCE.fetchTomorrowEvents(str, this.$travelBufferMin, this.$zone);
                return fetchTomorrowEvents;
            }
        }
        return null;
    }
}
