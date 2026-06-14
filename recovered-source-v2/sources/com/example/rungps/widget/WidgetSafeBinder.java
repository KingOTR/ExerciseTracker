package com.example.rungps.widget;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.util.Log;
import android.widget.RemoteViews;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WidgetSafeBinder.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/example/rungps/widget/WidgetSafeBinder;", "", "<init>", "()V", "TAG", "", "update", "", "context", "Landroid/content/Context;", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "appWidgetId", "", "fallbackLayout", "build", "Lkotlin/Function0;", "Landroid/widget/RemoteViews;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WidgetSafeBinder {
    public static final int $stable = 0;
    public static final WidgetSafeBinder INSTANCE = new WidgetSafeBinder();
    private static final String TAG = "WidgetSafeBinder";

    private WidgetSafeBinder() {
    }

    public final void update(Context context, AppWidgetManager appWidgetManager, int appWidgetId, int fallbackLayout, Function0<? extends RemoteViews> build) {
        Object m7905constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
        Intrinsics.checkNotNullParameter(build, "build");
        try {
            Result.Companion companion = Result.INSTANCE;
            WidgetSafeBinder widgetSafeBinder = this;
            appWidgetManager.updateAppWidget(appWidgetId, build.invoke());
            m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(m7905constructorimpl);
        if (m7908exceptionOrNullimpl != null) {
            Log.e(TAG, "updateAppWidget failed for " + appWidgetId, m7908exceptionOrNullimpl);
            try {
                Result.Companion companion3 = Result.INSTANCE;
                appWidgetManager.updateAppWidget(appWidgetId, new RemoteViews(context.getPackageName(), fallbackLayout));
                Result.m7905constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                Result.m7905constructorimpl(ResultKt.createFailure(th2));
            }
        }
    }
}
