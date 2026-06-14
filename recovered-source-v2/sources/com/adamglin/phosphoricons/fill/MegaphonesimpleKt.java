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

/* compiled from: Megaphonesimple.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MegaphoneSimple", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getMegaphoneSimple", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_megaphoneSimple", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MegaphonesimpleKt {
    private static ImageVector _megaphoneSimple;

    public static final ImageVector getMegaphoneSimple(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _megaphoneSimple;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("MegaphoneSimple", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(228.54f, 86.66f);
        pathBuilder.lineToRelative(-176.06f, -54.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f);
        pathBuilder.lineTo(32.0f, 192.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 4.52f, -0.65f);
        pathBuilder.lineTo(136.0f, 181.73f);
        pathBuilder.lineTo(136.0f, 192.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.verticalLineToRelative(-29.9f);
        pathBuilder.lineToRelative(28.54f, -8.75f);
        pathBuilder.arcTo(16.09f, 16.09f, 0.0f, false, false, 240.0f, 138.0f);
        pathBuilder.lineTo(240.0f, 102.0f);
        pathBuilder.arcTo(16.09f, 16.09f, 0.0f, false, false, 228.54f, 86.66f);
        pathBuilder.close();
        pathBuilder.moveTo(184.0f, 192.0f);
        pathBuilder.lineTo(152.0f, 192.0f);
        pathBuilder.lineTo(152.0f, 176.82f);
        pathBuilder.lineTo(184.0f, 167.0f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 138.0f);
        pathBuilder.lineTo(223.89f, 138.0f);
        pathBuilder.lineTo(152.0f, 160.08f);
        pathBuilder.lineTo(152.0f, 79.91f);
        pathBuilder.lineTo(223.89f, 102.0f);
        pathBuilder.lineToRelative(0.11f, 0.0f);
        pathBuilder.verticalLineToRelative(36.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _megaphoneSimple = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
