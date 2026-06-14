package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Personsimplethrow.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PersonSimpleThrow", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPersonSimpleThrow", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_personSimpleThrow", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersonsimplethrowKt {
    private static ImageVector _personSimpleThrow;

    public static final ImageVector getPersonSimpleThrow(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _personSimpleThrow;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PersonSimpleThrow", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 92.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, true, false, 92.0f, 56.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, false, 128.0f, 92.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 44.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 44.0f);
        pathBuilder.close();
        pathBuilder.moveTo(44.0f, 96.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, 20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 44.0f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(228.0f, 113.6f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 208.49f, 123.0f);
        pathBuilder.reflectiveCurveToRelative(-21.0f, -15.48f, -53.34f, 0.28f);
        pathBuilder.curveToRelative(-0.34f, 4.75f, -1.0f, 10.94f, -2.13f, 18.0f);
        pathBuilder.lineToRelative(30.66f, 25.55f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 3.7f, 13.0f);
        pathBuilder.lineToRelative(-16.0f, 48.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -22.76f, -7.59f);
        pathBuilder.lineTo(162.0f, 180.0f);
        pathBuilder.lineToRelative(-15.44f, -12.86f);
        pathBuilder.arcToRelative(136.39f, 136.39f, 0.0f, false, true, -5.72f, 14.23f);
        pathBuilder.curveToRelative(-14.64f, 31.0f, -39.34f, 51.93f, -73.42f, 62.15f);
        pathBuilder.arcTo(11.82f, 11.82f, 0.0f, false, true, 64.0f, 244.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -3.45f, -23.5f);
        pathBuilder.curveToRelative(37.84f, -11.35f, 60.77f, -38.71f, 68.41f, -81.44f);
        pathBuilder.curveToRelative(-24.0f, 13.54f, -43.11f, 17.0f, -56.46f, 17.0f);
        pathBuilder.arcTo(65.87f, 65.87f, 0.0f, false, true, 51.0f, 152.31f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 9.72f, -21.93f);
        pathBuilder.curveToRelative(0.43f, 0.17f, 25.42f, 9.53f, 68.5f, -19.76f);
        pathBuilder.curveToRelative(54.71f, -37.18f, 94.26f, -6.38f, 94.26f, -6.38f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 113.6f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _personSimpleThrow = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
