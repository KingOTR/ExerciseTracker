package com.google.android.recaptcha;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzco;
import com.google.android.recaptcha.internal.zzcx;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.JvmStatic;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0086@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"Lcom/google/android/recaptcha/Recaptcha;", "", "()V", "getClient", "Lkotlin/Result;", "Lcom/google/android/recaptcha/RecaptchaClient;", "application", "Landroid/app/Application;", "siteKey", "", "timeout", "", "getClient-BWLJW6A", "(Landroid/app/Application;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTasksClient", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/recaptcha/RecaptchaTasksClient;", "java.com.google.android.libraries.abuse.recaptcha.enterprise_enterprise"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Recaptcha {
    public static final Recaptcha INSTANCE = new Recaptcha();

    private Recaptcha() {
    }

    /* renamed from: getClient-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ Object m7682getClientBWLJW6A$default(Recaptcha recaptcha, Application application, String str, long j, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            j = 10000;
        }
        return recaptcha.m7683getClientBWLJW6A(application, str, j, continuation);
    }

    @JvmStatic
    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String siteKey) {
        zzco zzcoVar = zzco.zza;
        return zzco.zzh(application, siteKey, 10000L);
    }

    @JvmStatic
    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String siteKey, long timeout) {
        zzco zzcoVar = zzco.zza;
        return zzco.zzh(application, siteKey, timeout);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* renamed from: getClient-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7683getClientBWLJW6A(Application application, String str, long j, Continuation<? super Result<? extends RecaptchaClient>> continuation) {
        Recaptcha$getClient$1 recaptcha$getClient$1;
        int i;
        try {
            if (continuation instanceof Recaptcha$getClient$1) {
                recaptcha$getClient$1 = (Recaptcha$getClient$1) continuation;
                int i2 = recaptcha$getClient$1.zzc;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    recaptcha$getClient$1.zzc = i2 - Integer.MIN_VALUE;
                    Recaptcha$getClient$1 recaptcha$getClient$12 = recaptcha$getClient$1;
                    Object obj = recaptcha$getClient$12.zza;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = recaptcha$getClient$12.zzc;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Result.Companion companion = Result.INSTANCE;
                        zzco zzcoVar = zzco.zza;
                        recaptcha$getClient$12.zzc = 1;
                        obj = zzco.zzg(application, str, j, null, recaptcha$getClient$12);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Result.m7905constructorimpl((zzcx) obj);
                }
            }
            if (i != 0) {
            }
            return Result.m7905constructorimpl((zzcx) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        recaptcha$getClient$1 = new Recaptcha$getClient$1(this, continuation);
        Recaptcha$getClient$1 recaptcha$getClient$122 = recaptcha$getClient$1;
        Object obj2 = recaptcha$getClient$122.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = recaptcha$getClient$122.zzc;
    }
}
