package com.example.rungps.ui.shell;

import android.content.Context;
import androidx.navigation.NavHostController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class AppScreenKt$AppScreen$29$1$4$1$1$1$1$1$7$1 extends FunctionReferenceImpl implements Function1<String, Unit> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ NavHostController $navController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppScreenKt$AppScreen$29$1$4$1$1$1$1$1$7$1(Context context, NavHostController navHostController) {
        super(1, Intrinsics.Kotlin.class, "goTab", "AppScreen$goTab(Landroid/content/Context;Landroidx/navigation/NavHostController;Ljava/lang/String;)V", 0);
        this.$ctx = context;
        this.$navController = navHostController;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        AppScreenKt.AppScreen$goTab(this.$ctx, this.$navController, p0);
    }
}
