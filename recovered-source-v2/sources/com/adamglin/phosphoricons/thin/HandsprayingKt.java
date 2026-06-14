package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Handspraying.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HandsPraying", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getHandsPraying", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_handsPraying", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HandsprayingKt {
    private static ImageVector _handsPraying;

    public static final ImageVector getHandsPraying(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _handsPraying;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HandsPraying", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(232.49f, 182.83f);
        pathBuilder.lineToRelative(-37.0f, -37.0f);
        pathBuilder.lineTo(158.79f, 24.62f);
        pathBuilder.arcTo(17.77f, 17.77f, 0.0f, false, false, 128.0f, 18.56f);
        pathBuilder.arcToRelative(17.77f, 17.77f, 0.0f, false, false, -30.79f, 6.06f);
        pathBuilder.lineTo(60.46f, 145.88f);
        pathBuilder.lineToRelative(-36.95f, 37.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f);
        pathBuilder.lineTo(56.2f, 232.49f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.0f);
        pathBuilder.lineToRelative(48.28f, -48.29f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, 6.55f, -8.94f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, 6.55f, 8.94f);
        pathBuilder.lineToRelative(48.28f, 48.29f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.0f);
        pathBuilder.lineToRelative(32.69f, -32.69f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 232.49f, 182.83f);
        pathBuilder.close();
        pathBuilder.moveTo(67.49f, 226.83f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f);
        pathBuilder.lineTo(29.17f, 194.15f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.66f);
        pathBuilder.lineTo(44.68f, 173.0f);
        pathBuilder.lineTo(83.0f, 211.32f);
        pathBuilder.close();
        pathBuilder.moveTo(115.78f, 178.55f);
        pathBuilder.lineTo(88.68f, 205.66f);
        pathBuilder.lineTo(50.34f, 167.32f);
        pathBuilder.lineToRelative(16.48f, -16.49f);
        pathBuilder.arcToRelative(3.92f, 3.92f, 0.0f, false, false, 1.0f, -1.67f);
        pathBuilder.lineToRelative(37.0f, -122.22f);
        pathBuilder.arcTo(9.78f, 9.78f, 0.0f, false, true, 124.0f, 29.78f);
        pathBuilder.verticalLineToRelative(129.0f);
        pathBuilder.arcTo(27.81f, 27.81f, 0.0f, false, true, 115.8f, 178.55f);
        pathBuilder.close();
        pathBuilder.moveTo(131.98f, 158.75f);
        pathBuilder.verticalLineToRelative(-129.0f);
        pathBuilder.arcToRelative(9.78f, 9.78f, 0.0f, false, true, 19.14f, -2.84f);
        pathBuilder.lineToRelative(37.0f, 122.22f);
        pathBuilder.arcToRelative(3.92f, 3.92f, 0.0f, false, false, 1.0f, 1.67f);
        pathBuilder.lineToRelative(17.38f, 17.38f);
        pathBuilder.lineToRelative(-39.18f, 37.51f);
        pathBuilder.lineTo(140.2f, 178.55f);
        pathBuilder.arcTo(27.81f, 27.81f, 0.0f, false, true, 132.0f, 158.75f);
        pathBuilder.close();
        pathBuilder.moveTo(226.81f, 194.15f);
        pathBuilder.lineTo(194.13f, 226.83f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f);
        pathBuilder.lineTo(173.0f, 211.38f);
        pathBuilder.lineToRelative(39.18f, -37.51f);
        pathBuilder.lineToRelative(14.61f, 14.62f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 226.83f, 194.15f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _handsPraying = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
