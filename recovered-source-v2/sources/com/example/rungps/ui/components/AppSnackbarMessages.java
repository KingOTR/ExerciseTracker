package com.example.rungps.ui.components;

import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AppSnackbarMessages.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fJ\u001e\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fJ(\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u0010¨\u0006\u0011"}, d2 = {"Lcom/example/rungps/ui/components/AppSnackbarMessages;", "", "<init>", "()V", "host", "Landroidx/compose/material3/SnackbarHostState;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SnackbarHostState;", "showSuccess", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "message", "", "showError", "show", "isError", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AppSnackbarMessages {
    public static final int $stable = 0;
    public static final AppSnackbarMessages INSTANCE = new AppSnackbarMessages();

    private AppSnackbarMessages() {
    }

    public final SnackbarHostState host(Composer composer, int i) {
        composer.startReplaceGroup(1035718702);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1035718702, i, -1, "com.example.rungps.ui.components.AppSnackbarMessages.host (AppSnackbarMessages.kt:10)");
        }
        ProvidableCompositionLocal<SnackbarHostState> localAppSnackbar = AppSnackbarKt.getLocalAppSnackbar();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localAppSnackbar);
        ComposerKt.sourceInformationMarkerEnd(composer);
        SnackbarHostState snackbarHostState = (SnackbarHostState) consume;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return snackbarHostState;
    }

    public final void showSuccess(CoroutineScope scope, SnackbarHostState host, String message) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(message, "message");
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new AppSnackbarMessages$showSuccess$1(host, message, null), 3, null);
    }

    public final void showError(CoroutineScope scope, SnackbarHostState host, String message) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(message, "message");
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new AppSnackbarMessages$showError$1(host, message, null), 3, null);
    }

    public static /* synthetic */ void show$default(AppSnackbarMessages appSnackbarMessages, CoroutineScope coroutineScope, SnackbarHostState snackbarHostState, String str, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        appSnackbarMessages.show(coroutineScope, snackbarHostState, str, z);
    }

    public final void show(CoroutineScope scope, SnackbarHostState host, String message, boolean isError) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(message, "message");
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new AppSnackbarMessages$show$1(host, message, isError, null), 3, null);
    }
}
