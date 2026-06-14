package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Personarmsspread.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PersonArmsSpread", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getPersonArmsSpread", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_personArmsSpread", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersonarmsspreadKt {
    private static ImageVector _personArmsSpread;

    public static final ImageVector getPersonArmsSpread(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _personArmsSpread;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PersonArmsSpread", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(160.0f, 40.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, false, -32.0f, 32.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, false, 160.0f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 56.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(231.5f, 87.71f);
        pathBuilder.arcTo(19.62f, 19.62f, 0.0f, false, false, 212.0f, 72.0f);
        pathBuilder.lineTo(44.0f, 72.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -8.38f, 38.16f);
        pathBuilder.lineToRelative(0.13f, 0.0f);
        pathBuilder.lineToRelative(50.75f, 22.35f);
        pathBuilder.lineToRelative(-21.0f, 79.72f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 102.0f, 228.8f);
        pathBuilder.lineToRelative(26.0f, -44.87f);
        pathBuilder.lineToRelative(26.0f, 44.87f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 36.4f, -16.52f);
        pathBuilder.lineToRelative(-21.0f, -79.72f);
        pathBuilder.lineToRelative(50.75f, -22.35f);
        pathBuilder.lineToRelative(0.13f, 0.0f);
        pathBuilder.arcTo(19.64f, 19.64f, 0.0f, false, false, 231.5f, 87.71f);
        pathBuilder.close();
        pathBuilder.moveTo(213.7f, 95.61f);
        pathBuilder.lineTo(156.77f, 120.67f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.51f, 9.36f);
        pathBuilder.lineTo(175.13f, 217.0f);
        pathBuilder.arcToRelative(7.0f, 7.0f, 0.0f, false, false, 0.49f, 1.35f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.0f, 5.45f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.25f, -2.07f);
        pathBuilder.arcToRelative(6.31f, 6.31f, 0.0f, false, false, -0.34f, -0.63f);
        pathBuilder.lineTo(134.92f, 164.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.84f, 0.0f);
        pathBuilder.lineTo(88.0f, 221.05f);
        pathBuilder.arcToRelative(6.31f, 6.31f, 0.0f, false, false, -0.34f, 0.63f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.25f, 2.07f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.0f, -5.45f);
        pathBuilder.arcToRelative(7.0f, 7.0f, 0.0f, false, false, 0.49f, -1.35f);
        pathBuilder.lineTo(103.74f, 130.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.51f, -9.36f);
        pathBuilder.lineTo(42.3f, 95.61f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 44.0f, 88.0f);
        pathBuilder.lineTo(212.0f, 88.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.73f, 7.61f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _personArmsSpread = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
