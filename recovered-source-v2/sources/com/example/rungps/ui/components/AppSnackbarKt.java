package com.example.rungps.ui.components;

import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;

/* compiled from: AppSnackbar.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a$\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u000b\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\f"}, d2 = {"LocalAppSnackbar", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material3/SnackbarHostState;", "getLocalAppSnackbar", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "showAppMessage", "", "message", "", "isError", "", "(Landroidx/compose/material3/SnackbarHostState;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AppSnackbarKt {
    private static final ProvidableCompositionLocal<SnackbarHostState> LocalAppSnackbar = CompositionLocalKt.compositionLocalOf$default(null, new Function0() { // from class: com.example.rungps.ui.components.AppSnackbarKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            SnackbarHostState LocalAppSnackbar$lambda$0;
            LocalAppSnackbar$lambda$0 = AppSnackbarKt.LocalAppSnackbar$lambda$0();
            return LocalAppSnackbar$lambda$0;
        }
    }, 1, null);

    public static final ProvidableCompositionLocal<SnackbarHostState> getLocalAppSnackbar() {
        return LocalAppSnackbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnackbarHostState LocalAppSnackbar$lambda$0() {
        throw new IllegalStateException("AppSnackbarHost not installed".toString());
    }

    public static /* synthetic */ Object showAppMessage$default(SnackbarHostState snackbarHostState, String str, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return showAppMessage(snackbarHostState, str, z, continuation);
    }

    public static final Object showAppMessage(SnackbarHostState snackbarHostState, String str, boolean z, Continuation<? super Unit> continuation) {
        Object showSnackbar$default = SnackbarHostState.showSnackbar$default(snackbarHostState, str, null, z, null, continuation, 10, null);
        return showSnackbar$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? showSnackbar$default : Unit.INSTANCE;
    }
}
