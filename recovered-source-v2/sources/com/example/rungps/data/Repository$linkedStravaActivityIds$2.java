package com.example.rungps.data;

import android.content.SharedPreferences;
import androidx.core.view.PointerIconCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Repository.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.Repository$linkedStravaActivityIds$2", f = "Repository.kt", i = {0, 1}, l = {PointerIconCompat.TYPE_GRAB, 1023}, m = "invokeSuspend", n = {"prefs", "fromUpload"}, s = {"L$0", "L$0"})
/* loaded from: classes3.dex */
final class Repository$linkedStravaActivityIds$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Set<? extends Long>>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ Repository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Repository$linkedStravaActivityIds$2(Repository repository, Continuation<? super Repository$linkedStravaActivityIds$2> continuation) {
        super(2, continuation);
        this.this$0 = repository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Repository$linkedStravaActivityIds$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Set<? extends Long>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Set<Long>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Set<Long>> continuation) {
        return ((Repository$linkedStravaActivityIds$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x00c3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SharedPreferences sharedPreferences;
        RunDao runDao;
        RunDao runDao2;
        List list;
        Iterator it;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            sharedPreferences = this.this$0.getAppContext().getSharedPreferences("settings", 0);
            runDao = this.this$0.dao;
            this.L$0 = sharedPreferences;
            this.label = 1;
            obj = runDao.allRuns(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
                ArrayList arrayList = new ArrayList();
                it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    Long stravaImportId = ((RunEntity) it.next()).getStravaImportId();
                    if (stravaImportId != null) {
                        arrayList.add(stravaImportId);
                    }
                }
                return CollectionsKt.toSet(CollectionsKt.plus((Collection) list, (Iterable) arrayList));
            }
            sharedPreferences = (SharedPreferences) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ((Iterable) obj).iterator();
        while (it2.hasNext()) {
            Long boxLong = Boxing.boxLong(sharedPreferences.getLong("strava_activity_id_" + ((RunEntity) it2.next()).getId(), 0L));
            if (boxLong.longValue() <= 0) {
                boxLong = null;
            }
            if (boxLong != null) {
                arrayList2.add(boxLong);
            }
        }
        ArrayList arrayList3 = arrayList2;
        runDao2 = this.this$0.dao;
        this.L$0 = arrayList3;
        this.label = 2;
        Object allRuns = runDao2.allRuns(this);
        if (allRuns == coroutine_suspended) {
            return coroutine_suspended;
        }
        obj = allRuns;
        list = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        it = ((Iterable) obj).iterator();
        while (it.hasNext()) {
        }
        return CollectionsKt.toSet(CollectionsKt.plus((Collection) list, (Iterable) arrayList4));
    }
}
