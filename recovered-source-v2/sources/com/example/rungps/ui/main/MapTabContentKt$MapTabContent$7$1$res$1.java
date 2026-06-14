package com.example.rungps.ui.main;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.osmdroid.mapsforge.MapsForgeTileProvider;
import org.osmdroid.mapsforge.MapsForgeTileSource;
import org.osmdroid.tileprovider.util.SimpleRegisterReceiver;

/* compiled from: MapTabContent.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u00020\u0001*\u00020\u0006H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lkotlin/Pair;", "Lorg/osmdroid/mapsforge/MapsForgeTileProvider;", "Lorg/osmdroid/mapsforge/MapsForgeTileSource;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.MapTabContentKt$MapTabContent$7$1$res$1", f = "MapTabContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class MapTabContentKt$MapTabContent$7$1$res$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Pair<? extends MapsForgeTileProvider, ? extends MapsForgeTileSource>>>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<String> $mapUriString$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapTabContentKt$MapTabContent$7$1$res$1(Context context, MutableState<String> mutableState, Continuation<? super MapTabContentKt$MapTabContent$7$1$res$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$mapUriString$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MapTabContentKt$MapTabContent$7$1$res$1 mapTabContentKt$MapTabContent$7$1$res$1 = new MapTabContentKt$MapTabContent$7$1$res$1(this.$ctx, this.$mapUriString$delegate, continuation);
        mapTabContentKt$MapTabContent$7$1$res$1.L$0 = obj;
        return mapTabContentKt$MapTabContent$7$1$res$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Pair<? extends MapsForgeTileProvider, ? extends MapsForgeTileSource>>> continuation) {
        return ((MapTabContentKt$MapTabContent$7$1$res$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m7905constructorimpl;
        String MapTabContent$lambda$13;
        File file;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Context context = this.$ctx;
        MutableState<String> mutableState = this.$mapUriString$delegate;
        try {
            Result.Companion companion = Result.INSTANCE;
            MapTabContent$lambda$13 = MapTabContentKt.MapTabContent$lambda$13(mutableState);
            Intrinsics.checkNotNull(MapTabContent$lambda$13);
            Uri parse = Uri.parse(MapTabContent$lambda$13);
            if (Intrinsics.areEqual(parse.getScheme(), "file")) {
                String path = parse.getPath();
                if (path == null) {
                    throw new IllegalStateException("Bad file path");
                }
                file = new File(path);
            } else {
                File file2 = new File(context.getCacheDir(), "offline-maps");
                file2.mkdirs();
                File file3 = new File(file2, "import-" + System.currentTimeMillis() + ".map");
                InputStream openInputStream = context.getContentResolver().openInputStream(parse);
                if (openInputStream != null) {
                    FileOutputStream fileOutputStream = openInputStream;
                    try {
                        InputStream inputStream = fileOutputStream;
                        fileOutputStream = new FileOutputStream(file3);
                        try {
                            ByteStreamsKt.copyTo$default(inputStream, fileOutputStream, 0, 2, null);
                            CloseableKt.closeFinally(fileOutputStream, null);
                            CloseableKt.closeFinally(fileOutputStream, null);
                            file = file3;
                        } finally {
                        }
                    } finally {
                    }
                } else {
                    throw new IllegalStateException("Couldn't read picked file");
                }
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        if (file.length() == 0) {
            throw new IllegalStateException("Map file is empty");
        }
        MapsForgeTileSource createFromFiles = MapsForgeTileSource.createFromFiles(new File[]{file});
        m7905constructorimpl = Result.m7905constructorimpl(new Pair(new MapsForgeTileProvider(new SimpleRegisterReceiver(context), createFromFiles, null), createFromFiles));
        return Result.m7904boximpl(m7905constructorimpl);
    }
}
