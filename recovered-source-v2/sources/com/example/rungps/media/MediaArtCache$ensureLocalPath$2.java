package com.example.rungps.media;

import android.content.Context;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.webkit.ProxyConfig;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MediaArtCache.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.media.MediaArtCache$ensureLocalPath$2", f = "MediaArtCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class MediaArtCache$ensureLocalPath$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ String $artUrl;
    final /* synthetic */ String $cacheKey;
    final /* synthetic */ Context $context;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MediaArtCache$ensureLocalPath$2(String str, String str2, Context context, Continuation<? super MediaArtCache$ensureLocalPath$2> continuation) {
        super(2, continuation);
        this.$artUrl = str;
        this.$cacheKey = str2;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MediaArtCache$ensureLocalPath$2(this.$artUrl, this.$cacheKey, this.$context, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((MediaArtCache$ensureLocalPath$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d7, code lost:
    
        r7 = com.example.rungps.media.MediaArtCache.INSTANCE.downloadToFile(r8, r2);
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        File artDir;
        File downloadToFile;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String str = this.$artUrl;
        if (str == null || StringsKt.isBlank(str)) {
            return null;
        }
        String obj2 = StringsKt.trim((CharSequence) this.$artUrl).toString();
        if (StringsKt.startsWith$default(obj2, "content://", false, 2, (Object) null)) {
            return obj2;
        }
        if (StringsKt.startsWith$default(obj2, DomExceptionUtils.SEPARATOR, false, 2, (Object) null) && new File(obj2).isFile()) {
            return obj2;
        }
        if (StringsKt.startsWith$default(obj2, "file://", false, 2, (Object) null)) {
            String removePrefix = StringsKt.removePrefix(obj2, (CharSequence) "file://");
            if (new File(removePrefix).isFile()) {
                return removePrefix;
            }
            return null;
        }
        String str2 = this.$cacheKey;
        StringBuilder sb = new StringBuilder();
        int length = str2.length();
        for (int i = 0; i < length; i++) {
            char charAt = str2.charAt(i);
            if (Character.isLetterOrDigit(charAt) || charAt == '_') {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        String take = StringsKt.take(sb2, 64);
        artDir = MediaArtCache.INSTANCE.artDir(this.$context);
        File file = new File(artDir, take + ".jpg");
        if (file.isFile() && file.length() > 0) {
            return file.getAbsolutePath();
        }
        if (StringsKt.startsWith(obj2, ProxyConfig.MATCH_HTTP, true) && downloadToFile != null) {
            return downloadToFile.getAbsolutePath();
        }
        return null;
    }
}
