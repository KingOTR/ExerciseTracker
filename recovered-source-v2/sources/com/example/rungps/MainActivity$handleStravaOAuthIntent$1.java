package com.example.rungps;

import android.widget.Toast;
import com.example.rungps.data.AppPreferences;
import com.example.rungps.data.Repository;
import com.example.rungps.strava.StravaAuthErrors;
import com.example.rungps.strava.StravaOAuth;
import com.example.rungps.strava.StravaTokenResponse;
import com.example.rungps.sync.StravaFirestoreSync;
import com.example.rungps.sync.StravaPbFirestoreSync;
import com.example.rungps.util.SecureSettingsStore;
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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.MainActivity$handleStravaOAuthIntent$1", f = "MainActivity.kt", i = {1, 2, 2, 3, 3}, l = {788, 817, 819, 821, 822, 834}, m = "invokeSuspend", n = {"$this$launch", "$this$launch", "syncResult", "syncResult", "pushed"}, s = {"L$0", "L$0", "L$1", "L$0", "I$0"})
/* loaded from: classes3.dex */
final class MainActivity$handleStravaOAuthIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $code;
    final /* synthetic */ String $redirectUsed;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MainActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainActivity$handleStravaOAuthIntent$1(MainActivity mainActivity, String str, String str2, Continuation<? super MainActivity$handleStravaOAuthIntent$1> continuation) {
        super(2, continuation);
        this.this$0 = mainActivity;
        this.$code = str;
        this.$redirectUsed = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MainActivity$handleStravaOAuthIntent$1 mainActivity$handleStravaOAuthIntent$1 = new MainActivity$handleStravaOAuthIntent$1(this.this$0, this.$code, this.$redirectUsed, continuation);
        mainActivity$handleStravaOAuthIntent$1.L$0 = obj;
        return mainActivity$handleStravaOAuthIntent$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MainActivity$handleStravaOAuthIntent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e7, code lost:
    
        if (r6 == null) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0186 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0144 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object m7905constructorimpl;
        Object obj2;
        int intValue;
        int i;
        Throwable th;
        Object obj3;
        Object pushMeta;
        CoroutineScope coroutineScope;
        Object m6842syncStravaPersonalBestsIoAF18A;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        try {
            try {
            } catch (Throwable th2) {
                Result.Companion companion = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th2));
                obj2 = i2;
            }
        } catch (Exception e) {
            StravaOAuth.INSTANCE.clearAuthCodePending(this.this$0, this.$code);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 6;
            if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass4(this.this$0, e, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        switch (i2) {
            case 0:
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                this.this$0.getSharedPreferences("settings", 0);
                String stravaClientIdBlocking = AppPreferences.INSTANCE.stravaClientIdBlocking(this.this$0);
                if (stravaClientIdBlocking.length() == 0) {
                    this.label = 1;
                    if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(this.this$0, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                if (!StravaOAuth.INSTANCE.markAuthCodePending(this.this$0, this.$code)) {
                    return Unit.INSTANCE;
                }
                String stravaClientSecret = SecureSettingsStore.INSTANCE.stravaClientSecret(this.this$0);
                if (stravaClientSecret.length() == 0) {
                    throw new IllegalStateException(StravaAuthErrors.MISSING_SECRET_MESSAGE);
                }
                StravaTokenResponse exchangeCodeForTokens = StravaOAuth.INSTANCE.exchangeCodeForTokens(stravaClientIdBlocking, stravaClientSecret, this.$code, this.$redirectUsed);
                StravaOAuth.INSTANCE.clearAuthCodePending(this.this$0, this.$code);
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                Long expiresAt = exchangeCodeForTokens.getExpiresAt();
                if (expiresAt != null) {
                    if (expiresAt.longValue() <= 0) {
                        expiresAt = null;
                        break;
                    } else {
                        break;
                    }
                }
                expiresAt = exchangeCodeForTokens.getExpiresIn() != null ? Boxing.boxLong(currentTimeMillis + r6.intValue()) : null;
                Repository.INSTANCE.get(this.this$0).persistStravaTokensForOAuth(exchangeCodeForTokens.getAccessToken(), exchangeCodeForTokens.getRefreshToken(), expiresAt, exchangeCodeForTokens.getScope());
                this.L$0 = coroutineScope;
                this.label = 2;
                m6842syncStravaPersonalBestsIoAF18A = Repository.INSTANCE.get(this.this$0).m6842syncStravaPersonalBestsIoAF18A(this);
                if (m6842syncStravaPersonalBestsIoAF18A == coroutine_suspended) {
                    return coroutine_suspended;
                }
                CoroutineScope coroutineScope2 = coroutineScope;
                Object obj4 = m6842syncStravaPersonalBestsIoAF18A;
                MainActivity mainActivity = this.this$0;
                Result.Companion companion2 = Result.INSTANCE;
                this.L$0 = coroutineScope2;
                this.L$1 = obj4;
                this.label = 3;
                obj = StravaPbFirestoreSync.INSTANCE.pushAll(mainActivity, this);
                i2 = obj4;
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                m7905constructorimpl = Result.m7905constructorimpl(Boxing.boxInt(((Number) obj).intValue()));
                obj2 = i2;
                Integer boxInt = Boxing.boxInt(0);
                if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                    m7905constructorimpl = boxInt;
                }
                intValue = ((Number) m7905constructorimpl).intValue();
                MainActivity mainActivity2 = this.this$0;
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    this.L$0 = obj2;
                    this.L$1 = null;
                    this.I$0 = intValue;
                    this.label = 4;
                    pushMeta = StravaFirestoreSync.INSTANCE.pushMeta(mainActivity2, this);
                } catch (Throwable th3) {
                    Object obj5 = obj2;
                    i = intValue;
                    th = th3;
                    obj3 = obj5;
                    Result.Companion companion4 = Result.INSTANCE;
                    Result.m7905constructorimpl(ResultKt.createFailure(th));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 5;
                    if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass3(obj3, this.this$0, i, null), this) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                }
                if (pushMeta == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Object obj6 = obj2;
                i = intValue;
                obj = pushMeta;
                obj3 = obj6;
                Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) obj).booleanValue()));
                this.L$0 = null;
                this.L$1 = null;
                this.label = 5;
                if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass3(obj3, this.this$0, i, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 1:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 2:
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                m6842syncStravaPersonalBestsIoAF18A = ((Result) obj).getValue();
                CoroutineScope coroutineScope22 = coroutineScope;
                Object obj42 = m6842syncStravaPersonalBestsIoAF18A;
                MainActivity mainActivity3 = this.this$0;
                Result.Companion companion22 = Result.INSTANCE;
                this.L$0 = coroutineScope22;
                this.L$1 = obj42;
                this.label = 3;
                obj = StravaPbFirestoreSync.INSTANCE.pushAll(mainActivity3, this);
                i2 = obj42;
                if (obj == coroutine_suspended) {
                }
                m7905constructorimpl = Result.m7905constructorimpl(Boxing.boxInt(((Number) obj).intValue()));
                obj2 = i2;
                Integer boxInt2 = Boxing.boxInt(0);
                if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                }
                intValue = ((Number) m7905constructorimpl).intValue();
                MainActivity mainActivity22 = this.this$0;
                Result.Companion companion32 = Result.INSTANCE;
                this.L$0 = obj2;
                this.L$1 = null;
                this.I$0 = intValue;
                this.label = 4;
                pushMeta = StravaFirestoreSync.INSTANCE.pushMeta(mainActivity22, this);
                if (pushMeta == coroutine_suspended) {
                }
                break;
            case 3:
                Object obj7 = this.L$1;
                ResultKt.throwOnFailure(obj);
                i2 = obj7;
                m7905constructorimpl = Result.m7905constructorimpl(Boxing.boxInt(((Number) obj).intValue()));
                obj2 = i2;
                Integer boxInt22 = Boxing.boxInt(0);
                if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                }
                intValue = ((Number) m7905constructorimpl).intValue();
                MainActivity mainActivity222 = this.this$0;
                Result.Companion companion322 = Result.INSTANCE;
                this.L$0 = obj2;
                this.L$1 = null;
                this.I$0 = intValue;
                this.label = 4;
                pushMeta = StravaFirestoreSync.INSTANCE.pushMeta(mainActivity222, this);
                if (pushMeta == coroutine_suspended) {
                }
                break;
            case 4:
                i = this.I$0;
                obj3 = this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) obj).booleanValue()));
                } catch (Throwable th4) {
                    th = th4;
                    Result.Companion companion42 = Result.INSTANCE;
                    Result.m7905constructorimpl(ResultKt.createFailure(th));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 5;
                    if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass3(obj3, this.this$0, i, null), this) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                }
                this.L$0 = null;
                this.L$1 = null;
                this.label = 5;
                if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass3(obj3, this.this$0, i, null), this) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            case 5:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 6:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: MainActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.MainActivity$handleStravaOAuthIntent$1$1", f = "MainActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.MainActivity$handleStravaOAuthIntent$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ MainActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MainActivity mainActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = mainActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Toast.makeText(this.this$0, "Save Strava Client ID first", 1).show();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: MainActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.MainActivity$handleStravaOAuthIntent$1$3", f = "MainActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.MainActivity$handleStravaOAuthIntent$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $pushed;
        final /* synthetic */ Object $syncResult;
        int label;
        final /* synthetic */ MainActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(Object obj, MainActivity mainActivity, int i, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$syncResult = obj;
            this.this$0 = mainActivity;
            this.$pushed = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$syncResult, this.this$0, this.$pushed, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Object obj2 = this.$syncResult;
            int i = this.$pushed;
            Throwable m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(obj2);
            if (m7908exceptionOrNullimpl == null) {
                String str2 = (String) obj2;
                if (i > 0) {
                    str = str2 + " · " + i + " PBs uploaded for website.";
                } else {
                    str = str2 + " · Tap Sync now in Gym if website is empty.";
                }
            } else {
                str = "Strava connected but PB import failed: " + m7908exceptionOrNullimpl.getMessage();
            }
            Toast.makeText(this.this$0, str, 1).show();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: MainActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.MainActivity$handleStravaOAuthIntent$1$4", f = "MainActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.MainActivity$handleStravaOAuthIntent$1$4, reason: invalid class name */
    static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Exception $e;
        int label;
        final /* synthetic */ MainActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(MainActivity mainActivity, Exception exc, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = mainActivity;
            this.$e = exc;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, this.$e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MainActivity mainActivity = this.this$0;
            String message = this.$e.getMessage();
            if (message == null) {
                message = "error";
            }
            Toast.makeText(mainActivity, "Strava: " + message, 1).show();
            return Unit.INSTANCE;
        }
    }
}
