package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Cursor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Cursor", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getCursor", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cursor", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CursorKt {
    private static ImageVector _cursor;

    public static final ImageVector getCursor(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _cursor;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Cursor", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(220.49f, 207.8f);
        pathBuilder.lineTo(207.8f, 220.49f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.0f);
        pathBuilder.lineToRelative(-56.57f, -56.57f);
        pathBuilder.lineTo(115.0f, 214.08f);
        pathBuilder.lineToRelative(-0.13f, 0.33f);
        pathBuilder.arcTo(15.84f, 15.84f, 0.0f, false, true, 100.26f, 224.0f);
        pathBuilder.lineToRelative(-0.78f, 0.0f);
        pathBuilder.arcToRelative(15.82f, 15.82f, 0.0f, false, true, -14.41f, -11.0f);
        pathBuilder.lineTo(32.8f, 52.92f);
        pathBuilder.arcTo(15.95f, 15.95f, 0.0f, false, true, 52.92f, 32.8f);
        pathBuilder.lineTo(213.0f, 85.07f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 1.41f, 29.8f);
        pathBuilder.lineToRelative(-0.33f, 0.13f);
        pathBuilder.lineToRelative(-50.16f, 19.27f);
        pathBuilder.lineToRelative(56.57f, 56.56f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 220.49f, 207.8f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cursor = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
