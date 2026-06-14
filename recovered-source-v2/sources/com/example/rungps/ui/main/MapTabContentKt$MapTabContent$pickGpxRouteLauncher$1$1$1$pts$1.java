package com.example.rungps.ui.main;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.example.rungps.importing.GpxRouteImporter;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.osmdroid.util.GeoPoint;

/* compiled from: MapTabContent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lorg/osmdroid/util/GeoPoint;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.MapTabContentKt$MapTabContent$pickGpxRouteLauncher$1$1$1$pts$1", f = "MapTabContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class MapTabContentKt$MapTabContent$pickGpxRouteLauncher$1$1$1$pts$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends GeoPoint>>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ Uri $uri;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapTabContentKt$MapTabContent$pickGpxRouteLauncher$1$1$1$pts$1(Context context, Uri uri, Continuation<? super MapTabContentKt$MapTabContent$pickGpxRouteLauncher$1$1$1$pts$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$uri = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MapTabContentKt$MapTabContent$pickGpxRouteLauncher$1$1$1$pts$1 mapTabContentKt$MapTabContent$pickGpxRouteLauncher$1$1$1$pts$1 = new MapTabContentKt$MapTabContent$pickGpxRouteLauncher$1$1$1$pts$1(this.$ctx, this.$uri, continuation);
        mapTabContentKt$MapTabContent$pickGpxRouteLauncher$1$1$1$pts$1.L$0 = obj;
        return mapTabContentKt$MapTabContent$pickGpxRouteLauncher$1$1$1$pts$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends GeoPoint>> continuation) {
        return ((MapTabContentKt$MapTabContent$pickGpxRouteLauncher$1$1$1$pts$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m7905constructorimpl;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Context context = this.$ctx;
        Uri uri = this.$uri;
        try {
            Result.Companion companion = Result.INSTANCE;
            GpxRouteImporter gpxRouteImporter = GpxRouteImporter.INSTANCE;
            ContentResolver contentResolver = context.getContentResolver();
            Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
            m7905constructorimpl = Result.m7905constructorimpl(gpxRouteImporter.readPoints(contentResolver, uri));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        return Result.m7911isFailureimpl(m7905constructorimpl) ? CollectionsKt.emptyList() : m7905constructorimpl;
    }
}
