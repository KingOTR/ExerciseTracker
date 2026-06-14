package com.example.rungps.ui.sleep;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import com.example.rungps.core.domain.ExerciseTrackerUseCases;
import com.example.rungps.core.domain.usecase.AddSleepEntryUseCase;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.importing.SleepCycleCsvImporter;
import java.util.Iterator;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: SleepTabScreenBody.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$sleepCycleImportLauncher$1$1$1", f = "SleepTabScreenBody.kt", i = {1}, l = {165, 168, 171}, m = "invokeSuspend", n = {NotificationCompat.CATEGORY_MESSAGE}, s = {"L$0"})
/* loaded from: classes3.dex */
final class SleepTabScreenBodyKt$SleepTabScreenBody$sleepCycleImportLauncher$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ Uri $uri;
    final /* synthetic */ ExerciseTrackerUseCases $useCases;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepTabScreenBodyKt$SleepTabScreenBody$sleepCycleImportLauncher$1$1$1(Context context, Uri uri, ExerciseTrackerUseCases exerciseTrackerUseCases, Continuation<? super SleepTabScreenBodyKt$SleepTabScreenBody$sleepCycleImportLauncher$1$1$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$uri = uri;
        this.$useCases = exerciseTrackerUseCases;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SleepTabScreenBodyKt$SleepTabScreenBody$sleepCycleImportLauncher$1$1$1(this.$ctx, this.$uri, this.$useCases, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SleepTabScreenBodyKt$SleepTabScreenBody$sleepCycleImportLauncher$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: SleepTabScreenBody.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001*\u00020\u0005H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lcom/example/rungps/data/SleepEntryEntity;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$sleepCycleImportLauncher$1$1$1$1", f = "SleepTabScreenBody.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$sleepCycleImportLauncher$1$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends List<? extends SleepEntryEntity>, ? extends String>>, Object> {
        final /* synthetic */ Context $ctx;
        final /* synthetic */ Uri $uri;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context, Uri uri, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$ctx = context;
            this.$uri = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$ctx, this.$uri, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<? extends List<? extends SleepEntryEntity>, ? extends String>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Pair<? extends List<SleepEntryEntity>, String>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Pair<? extends List<SleepEntryEntity>, String>> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SleepCycleCsvImporter sleepCycleCsvImporter = SleepCycleCsvImporter.INSTANCE;
            ContentResolver contentResolver = this.$ctx.getContentResolver();
            Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
            return SleepCycleCsvImporter.importEntries$default(sleepCycleCsvImporter, contentResolver, this.$uri, null, 4, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.$ctx, this.$uri, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                str = (String) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.L$0 = null;
                this.label = 3;
                if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass3(this.$ctx, str, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        Pair pair = (Pair) obj;
        List list = (List) pair.component1();
        String str2 = (String) pair.component2();
        this.L$0 = str2;
        this.label = 2;
        if (BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(list, this.$useCases, null), this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        str = str2;
        this.L$0 = null;
        this.label = 3;
        if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass3(this.$ctx, str, null), this) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* compiled from: SleepTabScreenBody.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$sleepCycleImportLauncher$1$1$1$2", f = "SleepTabScreenBody.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$sleepCycleImportLauncher$1$1$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<SleepEntryEntity> $parsed;
        final /* synthetic */ ExerciseTrackerUseCases $useCases;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(List<SleepEntryEntity> list, ExerciseTrackerUseCases exerciseTrackerUseCases, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$parsed = list;
            this.$useCases = exerciseTrackerUseCases;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$parsed, this.$useCases, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ExerciseTrackerUseCases exerciseTrackerUseCases;
            Iterator it;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List<SleepEntryEntity> list = this.$parsed;
                exerciseTrackerUseCases = this.$useCases;
                it = list.iterator();
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$1;
                exerciseTrackerUseCases = (ExerciseTrackerUseCases) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            while (it.hasNext()) {
                SleepEntryEntity sleepEntryEntity = (SleepEntryEntity) it.next();
                AddSleepEntryUseCase addSleepEntry = exerciseTrackerUseCases.getAddSleepEntry();
                this.L$0 = exerciseTrackerUseCases;
                this.L$1 = it;
                this.label = 1;
                if (addSleepEntry.invoke(sleepEntryEntity, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: SleepTabScreenBody.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$sleepCycleImportLauncher$1$1$1$3", f = "SleepTabScreenBody.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$sleepCycleImportLauncher$1$1$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $ctx;
        final /* synthetic */ String $msg;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(Context context, String str, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$ctx = context;
            this.$msg = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$ctx, this.$msg, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Toast.makeText(this.$ctx, this.$msg, 1).show();
            return Unit.INSTANCE;
        }
    }
}
