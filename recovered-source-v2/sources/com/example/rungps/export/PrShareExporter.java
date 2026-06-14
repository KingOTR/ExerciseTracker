package com.example.rungps.export;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.example.rungps.AppBranding;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/* compiled from: PrShareExporter.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/example/rungps/export/PrShareExporter;", "", "<init>", "()V", "sharePrCard", "", "context", "Landroid/content/Context;", "exerciseName", "", "weightKg", "", "reps", "", "e1rm", "muscleGroup", "(Landroid/content/Context;Ljava/lang/String;DLjava/lang/Integer;DLjava/lang/String;)V", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PrShareExporter {
    public static final int $stable = 0;
    public static final PrShareExporter INSTANCE = new PrShareExporter();

    private PrShareExporter() {
    }

    public final void sharePrCard(Context context, String exerciseName, double weightKg, Integer reps, double e1rm, String muscleGroup) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(exerciseName, "exerciseName");
        Bitmap createBitmap = Bitmap.createBitmap(1080, 640, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(-15066082);
        Paint paint = new Paint(1);
        paint.setColor(-1);
        paint.setTextSize(56.0f);
        paint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        Paint paint2 = new Paint(1);
        paint2.setColor(-5194043);
        paint2.setTextSize(40.0f);
        canvas.drawText("Personal best", 64.0f, 120.0f, paint);
        paint.setTextSize(72.0f);
        Unit unit = Unit.INSTANCE;
        canvas.drawText(exerciseName, 64.0f, 220.0f, paint);
        StringBuilder sb = new StringBuilder();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%.1f kg", Arrays.copyOf(new Object[]{Double.valueOf(weightKg)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        sb.append(format);
        sb.append(" × ");
        sb.append(reps != null ? reps.intValue() : 1);
        sb.append("  ·  e1RM ");
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String format2 = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(e1rm)}, 1));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        sb.append(format2);
        String str = muscleGroup;
        if (str != null && !StringsKt.isBlank(str)) {
            sb.append("  ·  " + muscleGroup);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        canvas.drawText(sb2, 64.0f, 320.0f, paint2);
        paint2.setTextSize(32.0f);
        Unit unit2 = Unit.INSTANCE;
        canvas.drawText(AppBranding.DISPLAY_NAME, 64.0f, 560.0f, paint2);
        File file = new File(context.getCacheDir(), "shares");
        file.mkdirs();
        File file2 = new File(file, "pr-" + System.currentTimeMillis() + ".png");
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            createBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            CloseableKt.closeFinally(fileOutputStream, null);
            Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", file2);
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("image/png");
            intent.putExtra("android.intent.extra.STREAM", uriForFile);
            intent.addFlags(1);
            context.startActivity(Intent.createChooser(intent, "Share PR"));
        } finally {
        }
    }
}
