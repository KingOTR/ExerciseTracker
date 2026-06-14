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

/* compiled from: Personsimplethrow.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PersonSimpleThrow", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getPersonSimpleThrow", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_personSimpleThrow", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersonsimplethrowKt {
    private static ImageVector _personSimpleThrow;

    public static final ImageVector getPersonSimpleThrow(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(96.0f, 56.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, 32.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, true, 96.0f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(221.0f, 99.36f);
        pathBuilder.curveToRelative(-1.5f, -1.2f, -37.22f, -29.0f, -89.51f, 6.57f);
        pathBuilder.curveTo(86.0f, 136.84f, 59.57f, 126.23f, 59.32f, 126.12f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -6.63f, 14.56f);
        pathBuilder.curveToRelative(0.61f, 0.28f, 7.49f, 3.27f, 19.67f, 3.27f);
        pathBuilder.curveToRelative(14.21f, 0.0f, 35.64f, -4.11f, 62.77f, -21.29f);
        pathBuilder.curveToRelative(-2.28f, 29.41f, -12.73f, 83.47f, -73.43f, 101.68f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 4.6f, 15.32f);
        pathBuilder.curveToRelative(34.83f, -10.45f, 59.45f, -32.34f, 73.2f, -65.08f);
        pathBuilder.arcToRelative(141.86f, 141.86f, 0.0f, false, false, 5.1f, -14.33f);
        pathBuilder.lineToRelative(22.08f, 18.4f);
        pathBuilder.lineToRelative(-14.27f, 42.82f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 15.18f, 5.06f);
        pathBuilder.lineToRelative(16.0f, -48.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.47f, -8.68f);
        pathBuilder.lineToRelative(-32.42f, -27.0f);
        pathBuilder.arcToRelative(215.91f, 215.91f, 0.0f, false, false, 3.0f, -30.34f);
        pathBuilder.curveToRelative(36.18f, -18.57f, 59.0f, -0.85f, 59.28f, -0.65f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 10.0f, -12.48f);
        pathBuilder.close();
        pathBuilder.moveTo(64.0f, 112.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, true, false, 48.0f, 96.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 64.0f, 112.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _personSimpleThrow = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
